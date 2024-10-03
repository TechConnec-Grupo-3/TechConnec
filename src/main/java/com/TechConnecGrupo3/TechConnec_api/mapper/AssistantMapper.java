package com.TechConnecGrupo3.TechConnec_api.mapper;

import com.TechConnecGrupo3.TechConnec_api.dto.AssistantDTO;
import com.TechConnecGrupo3.TechConnec_api.model.entity.User;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

@Component
@Data
public class AssistantMapper {
    private ModelMapper modelMapper;

    public AssistantMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
        // ModelMapper para usar estrategia estricta
        this.modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
    }

    public AssistantDTO toAsistantDTO(User user) {
        AssistantDTO assistantDTO = modelMapper.map(user, AssistantDTO.class);
        assistantDTO.setName(user.getName());
        assistantDTO.setEmail(user.getEmail());
        assistantDTO.setEventTime(user.getEventTime());
        return assistantDTO;
    }
}
