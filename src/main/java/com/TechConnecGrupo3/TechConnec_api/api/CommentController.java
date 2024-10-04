package com.TechConnecGrupo3.TechConnec_api.api;

import com.TechConnecGrupo3.TechConnec_api.service.AdminCommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/comment")
@RequiredArgsConstructor
public class CommentController {

    private final AdminCommentService adminCommentService;


    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        adminCommentService.delete(id);
    }

}
