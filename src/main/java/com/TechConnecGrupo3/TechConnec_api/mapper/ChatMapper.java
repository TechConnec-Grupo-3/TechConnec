package com.TechConnecGrupo3.TechConnec_api.mapper;

import com.TechConnecGrupo3.TechConnec_api.dto.ChatDTO;
import com.TechConnecGrupo3.TechConnec_api.model.entity.Chat;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ChatMapper {
    ChatDTO toDTO(Chat chat);
    Chat toEntity(ChatDTO chatDTO);
}
