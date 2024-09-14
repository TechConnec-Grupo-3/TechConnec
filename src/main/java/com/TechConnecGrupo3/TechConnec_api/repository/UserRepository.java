package main.java.com.TechConnecGrupo3.TechConnec_api.repository;

import com.TechConnecGrupo3.TechConnec_api.models.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}