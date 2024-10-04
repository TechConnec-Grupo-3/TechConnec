package com.TechConnecGrupo3.TechConnec_api.model.entity;

import com.TechConnecGrupo3.TechConnec_api.model.enums.ChatType;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "chats")
public class Chat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer chat_id;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", foreignKey = @ForeignKey(name = "FK_chat_user"))
    private User user;

    @ManyToOne
    @JoinColumn(name = "event_id", referencedColumnName = "event_id", foreignKey = @ForeignKey(name = "FK_chat_event"))
    private Event event;

    @Column(name = "message", nullable = false)
    private String message;

    @Column(name = "chat_type")
    @Enumerated(EnumType.STRING)
    private ChatType chatType;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
