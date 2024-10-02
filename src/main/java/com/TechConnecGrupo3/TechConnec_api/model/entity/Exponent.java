package com.TechConnecGrupo3.TechConnec_api.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "exponents")
public class Exponent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer exponent_id;

    @ManyToOne
    @JoinColumn(name = "event_id", referencedColumnName = "event_id", foreignKey = @ForeignKey(name = "FK_exponent_event"))
    private Event event;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;
}
