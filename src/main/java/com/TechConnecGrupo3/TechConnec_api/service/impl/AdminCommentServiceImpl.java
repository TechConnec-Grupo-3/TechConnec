package com.TechConnecGrupo3.TechConnec_api.service.impl;


import com.TechConnecGrupo3.TechConnec_api.model.entity.Comment;
import com.TechConnecGrupo3.TechConnec_api.repository.CommentRepository;
import com.TechConnecGrupo3.TechConnec_api.service.AdminCommentService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class AdminCommentServiceImpl implements AdminCommentService {

    private final CommentRepository commentRepository;


    @Override
    @Transactional
    public void delete(Integer commentId) {
        Comment existingComment = commentRepository.findById(commentId)
                .orElseThrow(() -> new RuntimeException("Comment not found"));
        commentRepository.delete(existingComment);
    }
}
