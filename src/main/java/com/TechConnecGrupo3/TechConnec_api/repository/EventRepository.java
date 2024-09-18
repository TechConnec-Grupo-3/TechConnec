package com.TechConnecGrupo3.TechConnec_api.repository;

import com.TechConnecGrupo3.TechConnec_api.model.entity.Events;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Events, Integer> {
}
