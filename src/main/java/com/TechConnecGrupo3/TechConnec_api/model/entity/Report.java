package com.TechConnecGrupo3.TechConnec_api.model.entity;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "reports")
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "id", foreignKey =@ForeignKey(name = "FK_users_reports"))
    private User usuario;

    @Column(name = "tipo_reporte", nullable = false)
    private String tipoReporte;

    @Column(name = "contenido", nullable = false)
    private String contenido;

    @Column(name = "fecha_reporte", nullable = false)
    private LocalDateTime fechaReporte;
}