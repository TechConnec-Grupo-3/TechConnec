package com.TechConnecGrupo3.TechConnec_api.mapper;

import com.TechConnecGrupo3.TechConnec_api.dto.EventListIdDTO;
import com.TechConnecGrupo3.TechConnec_api.model.entity.Event;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

@Data
@Component
public class EventListMapper {
    private ModelMapper modelMapper;

    public EventListMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
        // ModelMapper para usar estrategia estricta
        this.modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
    }

    public EventListIdDTO toEventListIdDto(Event event) {
        EventListIdDTO eventListIdDTO = modelMapper.map(event, EventListIdDTO.class);

        // Asegúrate de mapear manualmente los campos que no se mapean automáticamente
        eventListIdDTO.setTitle(event.getTitle());
        eventListIdDTO.setDescription(event.getDescription());
        eventListIdDTO.setLocation(event.getLocation());
        eventListIdDTO.setTypeEvent(event.getTypeEvent());
        eventListIdDTO.setEventDate(event.getEventDate());
        eventListIdDTO.setEventTime(event.getEventTime());

        return eventListIdDTO;
    }

}
