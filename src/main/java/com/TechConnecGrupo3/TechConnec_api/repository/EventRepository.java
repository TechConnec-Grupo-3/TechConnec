package com.TechConnecGrupo3.TechConnec_api.repository;

import com.TechConnecGrupo3.TechConnec_api.model.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface EventRepository extends JpaRepository<Event, Integer> {
    @Query("SELECT e FROM Event e WHERE " +
            "e.registration LIKE CONCAT('%,', :userId, ',%') OR " +
            "e.registration LIKE CONCAT(:userId, ',%') OR " +
            "e.registration LIKE CONCAT('%,', :userId) OR " +
            "e.registration = :userId")
    List<Event> findByRegistrationContaining(@Param("userId") String userId);
}


