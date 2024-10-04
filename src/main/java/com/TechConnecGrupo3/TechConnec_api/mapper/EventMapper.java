package com.TechConnecGrupo3.TechConnec_api.mapper;

import com.TechConnecGrupo3.TechConnec_api.dto.EventDTO;
import com.TechConnecGrupo3.TechConnec_api.model.entity.Event;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EventMapper {
    EventDTO toDTO(Event event);
    Event toEntity(EventDTO eventDTO);
}
