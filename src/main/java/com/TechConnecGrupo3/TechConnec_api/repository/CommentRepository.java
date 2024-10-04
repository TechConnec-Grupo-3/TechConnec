package com.TechConnecGrupo3.TechConnec_api.repository;

import com.TechConnecGrupo3.TechConnec_api.model.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
