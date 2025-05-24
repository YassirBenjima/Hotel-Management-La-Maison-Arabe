package com.maisonarabe.MaisonArabe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.maisonarabe.MaisonArabe.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByUsername(String email);

    Optional<User> findByEmail(String email);
}
