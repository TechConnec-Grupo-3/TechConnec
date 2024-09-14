package main.java.com.TechConnecGrupo3.TechConnec_api.api;

import com.TechConnecGrupo3.TechConnec_api.model.entity.User;
import com.TechConnecGrupo3.TechConnec_api.service.AdminUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/users")
@RequiredArgsConstructor
public class AdminUserController {

    private final AdminUserService adminUserService;

    @GetMapping
    public List<User> listAll() {
        return adminUserService.findAll();
    }

    @GetMapping("/page")
    public Page<User> paginate(@PageableDefault(size = 5, sort = "firstName") Pageable pageable) {
        return adminUserService.paginate(pageable);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public User create(@RequestBody User user) {
        return adminUserService.create(user);
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable Integer id) {
        return adminUserService.findById(id);
    }

    @PutMapping("/{id}")
    public User update(@PathVariable Integer id, @RequestBody User user) {
        return adminUserService.update(id, user);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        adminUserService.delete(id);
    }
}