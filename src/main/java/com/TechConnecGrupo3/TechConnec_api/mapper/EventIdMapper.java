package com.TechConnecGrupo3.TechConnec_api.mapper;

import com.TechConnecGrupo3.TechConnec_api.dto.EventIdDTO;
import com.TechConnecGrupo3.TechConnec_api.model.entity.Event;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

@Component
@Data
public class EventIdMapper {
    private ModelMapper modelMapper;

    public EventIdMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
        // ModelMapper para usar estrategia estricta
        this.modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
    }

    public EventIdDTO toEventIdDTO(Event event) {
        EventIdDTO eventDTO = modelMapper.map(event, EventIdDTO.class);
        eventDTO.setTitle(event.getTitle());
        eventDTO.setEventDate(event.getEventDate());
        eventDTO.setEventTime(event.getEventTime());
        eventDTO.setLocation(event.getLocation());
        return eventDTO;
    }
}
