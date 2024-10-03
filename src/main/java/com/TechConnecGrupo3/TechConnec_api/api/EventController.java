package com.TechConnecGrupo3.TechConnec_api.api;

import com.TechConnecGrupo3.TechConnec_api.dto.EventDTO;
import com.TechConnecGrupo3.TechConnec_api.dto.EventIdDTO;
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

    @GetMapping("/{id}/list")
    public List<EventIdDTO> listAllByOrganizer(@PathVariable Integer id) {
        return adminEventService.findByOrganizerId(id);
    }
}
