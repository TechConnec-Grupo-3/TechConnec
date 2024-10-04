package com.TechConnecGrupo3.TechConnec_api.model.entity;

import com.TechConnecGrupo3.TechConnec_api.model.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer payment_id;

    @ManyToOne
    @JoinColumn(name = "event_id", referencedColumnName = "event_id", foreignKey = @ForeignKey(name = "FK_payment_event"))
    private Event event;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", foreignKey = @ForeignKey(name = "FK_payment_user"))
    private User user;

    @Column(name = "amount", nullable = false)
    private BigDecimal amount;

    @Column(name = "payment_status", nullable = false)
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    @Column(name = "payment_date")
    private LocalDateTime paymentDate;
}
