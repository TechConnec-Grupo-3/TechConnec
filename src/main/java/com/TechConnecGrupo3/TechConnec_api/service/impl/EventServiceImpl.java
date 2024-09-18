package com.TechConnecGrupo3.TechConnec_api.service.impl;

import com.TechConnecGrupo3.TechConnec_api.model.entity.Events;
import com.TechConnecGrupo3.TechConnec_api.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EventServiceImpl {

    @Autowired
    private EventRepository eventRepository;

    public Events crearEvento(Events event) {
        return eventRepository.save(event);
    }
}
