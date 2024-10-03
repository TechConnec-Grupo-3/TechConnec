package com.TechConnecGrupo3.TechConnec_api.mapper;

import com.TechConnecGrupo3.TechConnec_api.dto.EventDTO;
import com.TechConnecGrupo3.TechConnec_api.model.entity.Event;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

@Component
@Data
public class EventEditMapper {
    private ModelMapper modelMapper;

    public EventEditMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
        // ModelMapper para usar estrategia estricta
        this.modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
    }

    public EventDTO toEventEditDTO(Event event) {
        EventDTO eventDTO = modelMapper.map(event, EventDTO.class);
        eventDTO.setTitle(event.getTitle());
        eventDTO.setDescription(event.getDescription());
        eventDTO.setEventDate(event.getEventDate());
        eventDTO.setEventTime(event.getEventTime());
        eventDTO.setLocation(event.getLocation());
        eventDTO.setExponentId(event.getExponent().getExponent_id());
        return eventDTO;
    }
}
