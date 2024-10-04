package com.TechConnecGrupo3.TechConnec_api.mapper;

import com.TechConnecGrupo3.TechConnec_api.dto.EntranceDTO;
import com.TechConnecGrupo3.TechConnec_api.model.entity.Entrance;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EntranceMapper {
    EntranceDTO toDTO(Entrance entrance);
    Entrance toEntity(EntranceDTO entranceDTO);
}
