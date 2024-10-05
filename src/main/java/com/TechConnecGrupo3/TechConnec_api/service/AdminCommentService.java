package com.TechConnecGrupo3.TechConnec_api.service;

import com.TechConnecGrupo3.TechConnec_api.dto.CommentDTO;

public interface AdminCommentService {


    CommentDTO update(Integer commentId, CommentDTO commentDTO);

    CommentDTO create(CommentDTO commentDTO);
    void delete(Integer commentId);


}
