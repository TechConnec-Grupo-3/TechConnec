package com.TechConnecGrupo3.TechConnec_api.model.entity;

import com.TechConnecGrupo3.TechConnec_api.model.enums.NotificationType;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "notifications")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer notification_id;

    @ManyToOne
    @JoinColumn(name = "event_id", referencedColumnName = "event_id", foreignKey = @ForeignKey(name = "FK_notification_event"))
    private Event event;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", foreignKey = @ForeignKey(name = "FK_notification_user"))
    private User user;

    @ManyToOne
    @JoinColumn(name = "chat_id", referencedColumnName = "chat_id", foreignKey = @ForeignKey(name = "FK_notification_chat"))
    private Chat chat;

    @ManyToOne
    @JoinColumn(name = "entrance_id", referencedColumnName = "entrance_id", foreignKey = @ForeignKey(name = "FK_notification_entrance"))
    private Entrance entrance;

    @Column(name = "message", nullable = false)
    private String message;

    @Column(name = "notification_type")
    @Enumerated(EnumType.STRING)
    private NotificationType notificationType;

    @Column(name = "sent_at")
    private LocalDateTime sentAt;
}
