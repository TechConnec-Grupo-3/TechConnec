package com.TechConnecGrupo3.TechConnec_api.mapper;

import com.TechConnecGrupo3.TechConnec_api.dto.UserDTO;
import com.TechConnecGrupo3.TechConnec_api.model.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDTO toDTO(User user);
    User toEntity(UserDTO userDTO);
}
