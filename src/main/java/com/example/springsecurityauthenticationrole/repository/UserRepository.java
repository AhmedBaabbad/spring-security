package com.example.springsecurityauthenticationrole.repository;

import com.example.springsecurityauthenticationrole.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author Ahmed Baabbad
 *
 */

public interface UserRepository extends JpaRepository<User,Integer> {

    Optional<User> findByEmail(String email);
}
