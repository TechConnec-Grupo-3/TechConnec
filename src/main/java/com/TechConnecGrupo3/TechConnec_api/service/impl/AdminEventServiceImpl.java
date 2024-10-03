package com.TechConnecGrupo3.TechConnec_api.service.impl;

import com.TechConnecGrupo3.TechConnec_api.model.entity.Event;
import com.TechConnecGrupo3.TechConnec_api.repository.EventRepository;
import com.TechConnecGrupo3.TechConnec_api.service.AdminEventService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AdminEventServiceImpl implements AdminEventService {
    @Autowired
    private final EventRepository eventRepository;

    @Override
    @Transactional
    public Event create(Event event) {
        return eventRepository.save(event);
    }

    @Override
    @Transactional(readOnly = true)
    public Event findById(Integer id) {
        return eventRepository.findById(id).orElse(null);
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
    @Transactional
    public String shareEvent(Integer id) {
        Event event = findById(id);
        if (event != null) {
            String shareLink = "https://example.com/events/" + id;
            return shareLink;
        } else {
            return null;
        }
    }
    @Override
    public List<Event> findAll() {
        return eventRepository.findAll();
    }
}
