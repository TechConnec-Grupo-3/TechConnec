package main.java.com.TechConnecGrupo3.TechConnec_api.repository;

import com.upao.techconnect.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}