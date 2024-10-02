package com.TechConnecGrupo3.TechConnec_api.mapper;

import com.TechConnecGrupo3.TechConnec_api.dto.ExponentDTO;
import com.TechConnecGrupo3.TechConnec_api.model.entity.Exponent;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ExponentMapper {
    ExponentDTO toDTO(Exponent exponent);
    Exponent toEntity(ExponentDTO exponentDTO);
}
