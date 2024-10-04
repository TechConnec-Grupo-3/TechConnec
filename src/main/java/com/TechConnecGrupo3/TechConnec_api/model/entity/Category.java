package com.TechConnecGrupo3.TechConnec_api.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer category_id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;
}
