package main.java.com.TechConnecGrupo3.TechConnec_api.model.entity;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "registrations")
public class Registrations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "evento_id", nullable = false)
    private Evento evento;

    @Column(name = "fecha_inscripcion", nullable = false)
    private LocalDateTime fechaInscripcion;

    @Column(name = "estado", nullable = false)
    private String estado;
}
