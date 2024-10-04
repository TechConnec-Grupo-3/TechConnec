package com.TechConnecGrupo3.TechConnec_api.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CommentUserDTO {

    private Integer comment_id;

    private Integer event;
    private Integer user;
    private Integer rating;
    private String comments;
    private LocalDateTime submittedAt;
}
