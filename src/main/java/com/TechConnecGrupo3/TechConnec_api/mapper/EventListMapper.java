package com.TechConnecGrupo3.TechConnec_api.mapper;

import com.TechConnecGrupo3.TechConnec_api.dto.EventListIdDTO;
import com.TechConnecGrupo3.TechConnec_api.model.entity.Event;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class EventListMapper {
    private ModelMapper modelMapper;
    public EventListIdDTO toEventListIdDto(Event event) {
        EventListIdDTO eventListIdDTO = modelMapper.map(event, EventListIdDTO.class);

        // Asegúrate de mapear manualmente los campos que no se mapean automáticamente
        eventListIdDTO.setTitle(event.getTitle());
        eventListIdDTO.setDescription(event.getDescription());
        eventListIdDTO.setLocation(event.getLocation());
        eventListIdDTO.setShare(event.getShare());
        eventListIdDTO.setRegistration(event.getRegistration());
        eventListIdDTO.setTypeEvent(event.getTypeEvent());
        eventListIdDTO.setEventDate(event.getEventDate());
        eventListIdDTO.setEventTime(event.getEventTime());
        eventListIdDTO.setCreatedAt(event.getCreatedAt());
        eventListIdDTO.setUpdatedAt(event.getUpdatedAt());

        return eventListIdDTO;
    }

}
