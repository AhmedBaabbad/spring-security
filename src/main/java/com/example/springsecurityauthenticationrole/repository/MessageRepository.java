package com.example.springsecurityauthenticationrole.repository;

import com.example.springsecurityauthenticationrole.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message,Integer> {

}
