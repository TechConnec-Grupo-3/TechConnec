package com.TechConnecGrupo3.TechConnec_api.api;

import com.TechConnecGrupo3.TechConnec_api.model.entity.Event;
import com.TechConnecGrupo3.TechConnec_api.service.AdminEventService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/event")
@RequiredArgsConstructor
public class EventController {

    private final AdminEventService adminEventService;

    @PutMapping("/{id}")
    public Event update(@PathVariable Integer id, @RequestBody Event user) {
        return adminEventService.update(id, user);
    }
}