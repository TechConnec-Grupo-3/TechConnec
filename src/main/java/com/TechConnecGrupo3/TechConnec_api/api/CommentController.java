package com.TechConnecGrupo3.TechConnec_api.api;

import com.TechConnecGrupo3.TechConnec_api.dto.CommentDTO;
import com.TechConnecGrupo3.TechConnec_api.service.AdminCommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/comment")
@RequiredArgsConstructor
public class CommentController {

    private final AdminCommentService adminCommentService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ResponseEntity<CommentDTO> create(@RequestBody CommentDTO commentDTO) {
        CommentDTO createdComment = adminCommentService.create(commentDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdComment);
    }
}
