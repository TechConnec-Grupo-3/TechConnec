package com.TechConnecGrupo3.TechConnec_api.service;



import com.TechConnecGrupo3.TechConnec_api.dto.EventIdDTO;

import com.TechConnecGrupo3.TechConnec_api.dto.AssistantDTO;

import com.TechConnecGrupo3.TechConnec_api.model.entity.Event;
import com.TechConnecGrupo3.TechConnec_api.model.entity.Payment;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

public interface AdminEventService {

    Event create(Event event);

    Event findById(Integer id);

    @Transactional
    Event update(Integer id, Event updatedEvent);

    List<Event> findAll();

    List<EventIdDTO> findByOrganizerId(Integer organizerId);

    List<AssistantDTO> findAllAssistants(Integer id);

}

