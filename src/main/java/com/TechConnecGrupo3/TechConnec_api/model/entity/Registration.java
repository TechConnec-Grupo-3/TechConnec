package com.TechConnecGrupo3.TechConnec_api.model.entity;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "registrations")
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "id", foreignKey =@ForeignKey(name = "FK_users_registrations"))
    private User usuario;

    @ManyToOne
    @JoinColumn(name = "evento_id", referencedColumnName = "id", foreignKey =@ForeignKey(name = "FK_events_registrations"))
    private Events evento;

    @Column(name = "fecha_inscripcion", nullable = false)
    private LocalDateTime fechaInscripcion;

    @Column(name = "estado", nullable = false)
    private String estado;
}