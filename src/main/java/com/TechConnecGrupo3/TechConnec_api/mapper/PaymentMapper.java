package com.TechConnecGrupo3.TechConnec_api.mapper;

import com.TechConnecGrupo3.TechConnec_api.dto.PaymentDTO;
import com.TechConnecGrupo3.TechConnec_api.model.entity.Payment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PaymentMapper {
    PaymentDTO toDTO(Payment payment);
    Payment toEntity(PaymentDTO paymentDTO);
}
