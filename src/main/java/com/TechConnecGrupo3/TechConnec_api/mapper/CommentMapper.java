package com.TechConnecGrupo3.TechConnec_api.mapper;

import com.TechConnecGrupo3.TechConnec_api.dto.CommentDTO;
import com.TechConnecGrupo3.TechConnec_api.model.entity.Comment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CommentMapper {
    CommentDTO toDTO(Comment comment);
    Comment toEntity(CommentDTO commentDTO);
}
