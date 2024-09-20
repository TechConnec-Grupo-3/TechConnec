package com.TechConnecGrupo3.TechConnec_api.service.impl;

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

    @Override

    @Transactional
    public Event create(Event event) {
        return eventRepository.save(event);

    @Transactional(readOnly = true)
    public Event findById(Integer id) {
        return eventRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Event not found with id: " + id));
    }

    @Transactional
    @Override
    public Event update(Integer id, Event updatedEvent) {
        Event eventFromDb = findById(id);
        eventFromDb.setTitulo(updatedEvent.getTitulo());
        eventFromDb.setCapacidad(updatedEvent.getCapacidad());
        eventFromDb.setDescripcion(updatedEvent.getDescripcion());
        eventFromDb.setFecha(updatedEvent.getFecha());
        eventFromDb.setOrganizadorId(updatedEvent.getOrganizadorId());
        eventFromDb.setUbicacion(updatedEvent.getUbicacion());
        return eventRepository.save(eventFromDb);
    }

    public List<Event> findAll() {
        return eventRepository.findAll();
    }
}
