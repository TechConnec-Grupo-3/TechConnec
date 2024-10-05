package com.TechConnecGrupo3.TechConnec_api.service;
import com.TechConnecGrupo3.TechConnec_api.dto.CategoryDTO;
import com.TechConnecGrupo3.TechConnec_api.dto.EventDTO;
import com.TechConnecGrupo3.TechConnec_api.model.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdminCreateCategory {
    Category create(Category category);
    Category update(Integer id, Category updatedCategory);
    void delete(Integer id);
    List<Category> findAll();
    Category findById(Integer id);
    CategoryDTO addCategory(CategoryDTO categoryDTO);
    List<CategoryDTO> getAllCategory();
    CategoryDTO mapToDTO(Category category);
    List<EventDTO> getEventsByCategory(Integer categoryId);
}
