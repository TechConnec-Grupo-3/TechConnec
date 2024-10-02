package com.TechConnecGrupo3.TechConnec_api.service.impl;

import com.TechConnecGrupo3.TechConnec_api.model.entity.User;
import com.TechConnecGrupo3.TechConnec_api.repository.UserRepository;
import com.TechConnecGrupo3.TechConnec_api.service.AdminUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Service
public class AdminUserServiceImpl implements AdminUserService {

    private final UserRepository userRepository;

    @Override
    @Transactional(readOnly = true)
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<User> paginate(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    @Transactional
    public User create(User user) {
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());
        return userRepository.save(user);
    }

    @Override
    @Transactional(readOnly = true)
    public User findById(Integer id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No se encontró usuario con ese id: " + id));
    }

    @Override
    @Transactional
    public User update(Integer id, User updatedUser) {
        User userFromDb = findById(id);
        userFromDb.setName(updatedUser.getName());
        userFromDb.setEmail(updatedUser.getEmail());
        userFromDb.setPassword(updatedUser.getPassword());
        userFromDb.setInterests(updatedUser.getInterests());
        userFromDb.setUpdatedAt(LocalDateTime.now());
        return userRepository.save(userFromDb);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        User user = findById(id);
        userRepository.delete(user);
    }

    @Override
    @Transactional
    public User resetPassword(Integer id, User user) {
        User userFromDb = findById(id);
        userFromDb.setPassword(user.getPassword());
        return userRepository.save(userFromDb);
    }
}
