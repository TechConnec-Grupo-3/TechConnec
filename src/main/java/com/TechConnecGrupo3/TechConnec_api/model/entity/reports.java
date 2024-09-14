package main.java.com.TechConnecGrupo3.TechConnec_api.model.entity;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "reports")
public class Reports {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @Column(name = "tipo_reporte", nullable = false)
    private String tipoReporte;

    @Column(name = "contenido", nullable = false)
    private String contenido;

    @Column(name = "fecha_reporte", nullable = false)
    private LocalDateTime fechaReporte;
}
