package com.TechConnecGrupo3.TechConnec_api.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "entrances")
public class Entrance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer entrance_id;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", foreignKey = @ForeignKey(name = "FK_entrance_user"))
    private User user;

    @ManyToOne
    @JoinColumn(name = "event_id", referencedColumnName = "event_id", foreignKey = @ForeignKey(name = "FK_entrance_event"))
    private Event event;

    @ManyToOne
    @JoinColumn(name = "payment_id", referencedColumnName = "payment_id", foreignKey = @ForeignKey(name = "FK_entrance_payment"))
    private Payment payment;

    @Column(name = "code", nullable = false)
    private String code;
}
