package com.TechConnecGrupo3.TechConnec_api.api;

import com.TechConnecGrupo3.TechConnec_api.model.entity.Events;
import com.TechConnecGrupo3.TechConnec_api.service.impl.EventServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventServiceImpl eventService;

    @PostMapping("/create")
    public ResponseEntity<Events> crearEvento(@RequestBody Events event) {
        Events nuevoEvento = eventService.crearEvento(event);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoEvento);
    }
}
