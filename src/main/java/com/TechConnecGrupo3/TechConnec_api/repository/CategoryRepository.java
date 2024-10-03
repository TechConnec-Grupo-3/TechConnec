package com.TechConnecGrupo3.TechConnec_api.repository;
import com.TechConnecGrupo3.TechConnec_api.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    Category findByName(String name);
}
