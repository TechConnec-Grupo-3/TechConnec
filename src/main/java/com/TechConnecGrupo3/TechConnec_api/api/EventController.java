package com.TechConnecGrupo3.TechConnec_api.api;

import com.TechConnecGrupo3.TechConnec_api.model.entity.Event;
import com.TechConnecGrupo3.TechConnec_api.service.AdminEventService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/event")
@RequiredArgsConstructor
public class EventController {

    private final AdminEventService adminEventService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Event create(@RequestBody Event event) {
        return adminEventService.create(event);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Event> update(@PathVariable Integer id, @RequestBody Event event) {
        try {
            Event updatedEvent = adminEventService.update(id, event);
            return ResponseEntity.ok(updatedEvent);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @GetMapping("/list")
    public List<Event> listAll() {
        return adminEventService.findAll();
    }
    @GetMapping("/{id}/share")
    public ResponseEntity<String> shareEvent(@PathVariable Integer id) {
        Event event = adminEventService.findById(id);
        if (event != null) {
            String shareLink = "https://example.com/events/" + id;
            return ResponseEntity.ok(shareLink);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @GetMapping("/{id}/share/social")
    public ResponseEntity<String> shareEventSocial(@PathVariable Integer id) {
        Event event = adminEventService.findById(id);
        if (event != null) {
            String shareLink = "https://example.com/events/" + id;
            String socialMediaLink = "https://www.facebook.com/sharer/sharer.php?u=" + shareLink;
            return ResponseEntity.ok(socialMediaLink);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<Event> findById(@PathVariable Integer id) {
        Event event = adminEventService.findById(id);
        if (event != null) {
            return ResponseEntity.ok(event);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
}
