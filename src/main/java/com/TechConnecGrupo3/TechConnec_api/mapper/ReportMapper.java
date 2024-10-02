package com.TechConnecGrupo3.TechConnec_api.mapper;

import com.TechConnecGrupo3.TechConnec_api.dto.ReportDTO;
import com.TechConnecGrupo3.TechConnec_api.model.entity.Report;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ReportMapper {
    ReportDTO toDTO(Report report);
    Report toEntity(ReportDTO reportDTO);
}
