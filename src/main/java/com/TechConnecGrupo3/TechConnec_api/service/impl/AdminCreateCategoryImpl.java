package com.TechConnecGrupo3.TechConnec_api.service.impl;
import com.TechConnecGrupo3.TechConnec_api.dto.CategoryDTO;

import com.TechConnecGrupo3.TechConnec_api.dto.EventDTO;
import com.TechConnecGrupo3.TechConnec_api.model.entity.Category;
import com.TechConnecGrupo3.TechConnec_api.repository.CategoryRepository;
import com.TechConnecGrupo3.TechConnec_api.service.AdminCreateCategory;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AdminCreateCategoryImpl implements AdminCreateCategory {

    private final CategoryRepository categoryRepository;


    @Override
    @Transactional
    public Category create(Category category) {
        if (category.getName() == null || category.getName().isEmpty()) {
            throw new RuntimeException("El nombre de la categoría no puede estar vacío");
        }
        if (categoryRepository.findByName(category.getName()) != null) {
            throw new RuntimeException("El nombre de la categoría ya existe");
        }
        return categoryRepository.save(category);
    }

    @Override
    @Transactional
    public Category update(Integer id, Category updatedCategory) {
        Category categoryFromDb = findById(id);
        categoryFromDb.setName(updatedCategory.getName());
        categoryFromDb.setDescription(updatedCategory.getDescription());
        return categoryRepository.save(categoryFromDb);
    }

    @Override
    public CategoryDTO addCategory(CategoryDTO categoryDTO) {
        try {
            Category category = new Category();
            category.setName(categoryDTO.getName());
            category.setDescription(categoryDTO.getDescription());
            Category createdCategory = create(category);
            return mapToDTO(createdCategory);
        } catch (Exception e) {
            return null;
        }
    }
    @Override
    @Transactional
    public CategoryDTO mapToDTO(Category category) {
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setCategoryId(category.getCategory_id());
        categoryDTO.setName(category.getName());
        categoryDTO.setDescription(category.getDescription());
        return categoryDTO;
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        categoryRepository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public List<EventDTO> getEventsByCategory (Integer categoryId){
        return categoryRepository.getEventsByCategory(categoryId);
    }

    @Override
    @Transactional(readOnly = true)
    public Category findById(Integer id) {
        return categoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Categoría no encontrada con id: " + id));
    }


    @Override
    public CategoryDTO addCategory(CategoryDTO categoryDTO) {
        return null;
    }


    @Override
    public List<CategoryDTO> getAllCategory() {
        return List.of();
    }

}
