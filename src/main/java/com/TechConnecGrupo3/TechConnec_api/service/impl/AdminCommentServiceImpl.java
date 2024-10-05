package com.TechConnecGrupo3.TechConnec_api.service.impl;

import com.TechConnecGrupo3.TechConnec_api.dto.CommentDTO;
import com.TechConnecGrupo3.TechConnec_api.mapper.CommentMapper;
import com.TechConnecGrupo3.TechConnec_api.mapper.CommentUserMapper;
import com.TechConnecGrupo3.TechConnec_api.model.entity.Comment;
import com.TechConnecGrupo3.TechConnec_api.repository.CommentRepository;
import com.TechConnecGrupo3.TechConnec_api.service.AdminCommentService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class AdminCommentServiceImpl implements AdminCommentService {
    private final CommentUserMapper commentUserMapper;
    private final CommentRepository commentRepository;



    @Override
    @Transactional
    public CommentDTO update(Integer commentId, CommentDTO commentDTO) {
        Comment existingComment = commentRepository.findById(commentId)
                .orElseThrow(() -> new RuntimeException("Comment not found"));

        existingComment.setRating(commentDTO.getRating());
        existingComment.setComments(commentDTO.getComments());

        commentRepository.save(existingComment);
        return commentUserMapper.toCommentDTO(existingComment);
    }


}
