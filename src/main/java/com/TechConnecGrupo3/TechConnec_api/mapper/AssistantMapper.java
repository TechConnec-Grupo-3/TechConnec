package com.TechConnecGrupo3.TechConnec_api.mapper;

import com.TechConnecGrupo3.TechConnec_api.dto.AssistantDTO;
import com.TechConnecGrupo3.TechConnec_api.model.entity.Payment;
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

    public AssistantDTO toAsistantDTO(Payment payment) {
        AssistantDTO assistantDTO = modelMapper.map(payment, AssistantDTO.class);
        assistantDTO.setName(payment.getUser().getName());
        assistantDTO.setEmail(payment.getUser().getEmail());
        assistantDTO.setStatus(payment.getPaymentStatus());
        return assistantDTO;
    }
}
