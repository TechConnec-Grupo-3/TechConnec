package com.TechConnecGrupo3.TechConnec_api.model.entity;

import com.TechConnecGrupo3.TechConnec_api.model.enums.EventType;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer event_id;

    @ManyToOne
    @JoinColumn(name = "organizer_id", referencedColumnName = "user_id", foreignKey = @ForeignKey(name = "FK_organizer_event"))
    private User organizer;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "category_id", foreignKey = @ForeignKey(name = "FK_category_event"))
    private Category category;

    @ManyToOne
    @JoinColumn(name = "exponent_id", referencedColumnName = "exponent_id", foreignKey = @ForeignKey(name = "FK_exponent_event"))
    private Exponent exponent;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "location")
    private String location;

    @Column(name = "share")
    private String share;

    @Column(name = "registration", nullable = false)
    private String registration;

    @Column(name = "type_event")
    @Enumerated(EnumType.STRING)
    private EventType typeEvent;

    @Column(name = "event_date", nullable = false)
    private LocalDate eventDate;

    @Column(name = "event_time", nullable = false)
    private LocalTime eventTime;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
