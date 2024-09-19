package com.TechConnecGrupo3.TechConnec_api.model.entity;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "fecha", nullable = false)
    private LocalDateTime fecha;

    @Column(name = "ubicacion", nullable = false)
    private String ubicacion;

    @Column(name = "organizador_id", nullable = false)
    private Integer organizadorId;

    @Column(name = "capacidad", nullable = false)
    private Integer capacidad;
}
