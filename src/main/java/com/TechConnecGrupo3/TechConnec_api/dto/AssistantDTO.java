package com.TechConnecGrupo3.TechConnec_api.dto;

import com.TechConnecGrupo3.TechConnec_api.model.enums.PaymentStatus;
import lombok.Data;

@Data
public class AssistantDTO {

    private String name;
    private String email;
    private PaymentStatus status;
}
