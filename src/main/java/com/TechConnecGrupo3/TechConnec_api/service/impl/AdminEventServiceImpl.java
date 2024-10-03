package com.TechConnecGrupo3.TechConnec_api.service.impl;

import com.TechConnecGrupo3.TechConnec_api.dto.EventDTO;
import com.TechConnecGrupo3.TechConnec_api.exception.ResourceNotFoundException;
import com.TechConnecGrupo3.TechConnec_api.mapper.EventEditMapper;
import com.TechConnecGrupo3.TechConnec_api.model.entity.Event;
import com.TechConnecGrupo3.TechConnec_api.repository.EventRepository;
import com.TechConnecGrupo3.TechConnec_api.service.AdminEventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AdminEventServiceImpl implements AdminEventService {

    private final EventRepository eventRepository;
    private final EventEditMapper eventEditMapper;

    @Override
    @Transactional
    public Event create(Event event) {
        return eventRepository.save(event);
    }

    @Override
    @Transactional(readOnly = true)
    public Event findById(Integer id) {
        return eventRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("El evento con ID " + id + " no fue encontrado"));
    }

    @Override
    @Transactional
    public EventDTO update(Integer id, EventDTO updatedEventDTO) {
        Event eventFromDb = findById(id);

        eventFromDb.setTitle(updatedEventDTO.getTitle());
        eventFromDb.setDescription(updatedEventDTO.getDescription());
        eventFromDb.setEventDate(updatedEventDTO.getEventDate());
        eventFromDb.setEventTime(updatedEventDTO.getEventTime());
        eventFromDb.setLocation(updatedEventDTO.getLocation());
        eventFromDb.setExponent(findById(updatedEventDTO.getExponentId()).getExponent());

        eventFromDb = eventRepository.save(eventFromDb);

        return eventEditMapper.toEventEditDTO(eventFromDb);
    }

    @Override
    public List<Event> findAll() {
        return eventRepository.findAll();
    }
}
