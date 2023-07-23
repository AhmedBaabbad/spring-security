package com.example.springsecurityauthenticationrole.controller;

import com.example.springsecurityauthenticationrole.model.Message;
import com.example.springsecurityauthenticationrole.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


/**
 * @author Ahmed Baabbad
 *
 */
@Controller
public class HomeController {
    @Autowired
    private MessageRepository messageRepository;

    @GetMapping("/home")
    public String home(Model model){
       // List<Message> messages = messageRepository.findAll();
        model.addAttribute("msgs", messageRepository.findAll());
        return "userhome";
    }
    @PostMapping("/messages")
    public String saveMessage(Message message) {
        messageRepository.save(message);
        return "redirect:/home";
    }
}
