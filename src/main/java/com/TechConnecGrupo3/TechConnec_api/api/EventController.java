package com.TechConnecGrupo3.TechConnec_api.api;

import com.TechConnecGrupo3.TechConnec_api.model.entity.Event;
import com.TechConnecGrupo3.TechConnec_api.service.AdminEventService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
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
}

    @PutMapping("/{id}")
    public Event update(@PathVariable Integer id, @RequestBody Event user) {
        return adminEventService.update(id, user);
    }

    @GetMapping("/list")
    public List<Event> listAll() {
        return adminEventService.findAll();
    }}
