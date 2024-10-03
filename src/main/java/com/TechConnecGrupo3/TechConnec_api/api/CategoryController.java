package com.TechConnecGrupo3.TechConnec_api.api;
import java.util.List;

import com.TechConnecGrupo3.TechConnec_api.dto.CategoryDTO;
import com.TechConnecGrupo3.TechConnec_api.service.impl.AdminCreateCategory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/category")
public class CategoryController {
    private final AdminCreateCategory adminCreateCategory;

    @PostMapping("/create")
    public ResponseEntity<CategoryDTO> addCategory(@RequestBody CategoryDTO categoryDTO){
        try{
            CategoryDTO newCategory = adminCreateCategory.addCategory(categoryDTO);
            return new ResponseEntity<>(newCategory, HttpStatus.CREATED);
        } catch (IllegalStateException sms) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/list")
    public List<CategoryDTO> getAllCategory() {
        return adminCreateCategory.getAllCategory();
    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        adminCreateCategory.delete(id);
    }

}
