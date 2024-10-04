package com.TechConnecGrupo3.TechConnec_api.service.impl;

import com.TechConnecGrupo3.TechConnec_api.dto.CommentDTO;

public interface AdminCommentService {
    CommentDTO create(CommentDTO commentDTO);
    CommentDTO update(Integer commentId, CommentDTO commentDTO);
    void delete(Integer commentId);
}
