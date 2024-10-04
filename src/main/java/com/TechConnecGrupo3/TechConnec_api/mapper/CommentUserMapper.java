package com.TechConnecGrupo3.TechConnec_api.mapper;

import com.TechConnecGrupo3.TechConnec_api.dto.CommentDTO;
import com.TechConnecGrupo3.TechConnec_api.model.entity.Comment;
import com.TechConnecGrupo3.TechConnec_api.repository.EventRepository;
import com.TechConnecGrupo3.TechConnec_api.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CommentUserMapper {
    private final ModelMapper modelMapper;
    private final EventRepository eventRepository;
    private final UserRepository userRepository;

    public Comment toEntity(CommentDTO commentDTO) {
        Comment comment = modelMapper.map(commentDTO, Comment.class);

        // Buscar el Event por eventId y asignarlo
        eventRepository.findById(commentDTO.getEventId()).ifPresent(comment::setEvent);

        // Buscar el User por userId y asignarlo
        userRepository.findById(commentDTO.getUserId()).ifPresent(comment::setUser);

        return comment; // No es necesario volver a mapear commentDTO a Comment
    }

    public CommentDTO toCommentDTO(Comment comment) {
        CommentDTO commentDTO = modelMapper.map(comment, CommentDTO.class);
        commentDTO.setCommentId(comment.getComment_id());
        if (comment.getEvent() != null) {
            commentDTO.setEventId(comment.getEvent().getEvent_id());
        }
        if (comment.getUser() != null) {
            commentDTO.setUserId(comment.getUser().getUser_id());
        }
        commentDTO.setRating(comment.getRating());
        return commentDTO;
    }
}
