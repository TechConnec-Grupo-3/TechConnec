package com.TechConnecGrupo3.TechConnec_api.service.impl;


import com.TechConnecGrupo3.TechConnec_api.dto.EventIdDTO;
import com.TechConnecGrupo3.TechConnec_api.mapper.EventIdMapper;
import com.TechConnecGrupo3.TechConnec_api.model.entity.Event;
import com.TechConnecGrupo3.TechConnec_api.model.entity.User;
import com.TechConnecGrupo3.TechConnec_api.repository.EventRepository;
import com.TechConnecGrupo3.TechConnec_api.repository.UserRepository;
import com.TechConnecGrupo3.TechConnec_api.service.AdminEventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class AdminEventServiceImpl implements AdminEventService {

    private final EventRepository eventRepository;
    private final UserRepository userRepository;
    private final EventIdMapper eventIdMapper;

    @Override
    @Transactional
    public Event create(Event event) {
        return eventRepository.save(event);
    }

    @Override
    @Transactional(readOnly = true)
    public Event findById(Integer id) {
        return eventRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Event not found with id: " + id));
    }

    @Override
    @Transactional
    public Event update(Integer id, Event updatedEvent) {
        Event eventFromDb = findById(id);

        eventFromDb.setTitle(updatedEvent.getTitle());
        eventFromDb.setDescription(updatedEvent.getDescription());
        eventFromDb.setLocation(updatedEvent.getLocation());
        eventFromDb.setEventDate(updatedEvent.getEventDate());
        eventFromDb.setEventTime(updatedEvent.getEventTime());
        eventFromDb.setOrganizer(updatedEvent.getOrganizer());

        return eventRepository.save(eventFromDb);
    }

    @Override
    public List<Event> findAll() {
        return eventRepository.findAll();
    }

    @Override
    public List<EventIdDTO> findByOrganizerId(Integer organizerId) {
        User organizer = userRepository.findById(organizerId)
                .orElseThrow(() -> new RuntimeException("Organizer not found with id: " + organizerId));
        return eventRepository.findByOrganizer(organizer)
                .stream()
                .map(eventIdMapper::toEventIdDTO)
                .collect(Collectors.toList());
    }
}
