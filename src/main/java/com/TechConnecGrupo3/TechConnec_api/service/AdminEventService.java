package com.TechConnecGrupo3.TechConnec_api.service;

import com.TechConnecGrupo3.TechConnec_api.model.entity.Event;
import org.springframework.transaction.annotation.Transactional;

public interface AdminEventService {

    Event findById(Integer id);

    @Transactional
    Event update(Integer id, Event updatedEvent);
}