package com.cv_david_davtyan.controller;


import com.cv_david_davtyan.model.User;
import com.cv_david_davtyan.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String main() {
        return "index";
    }

    @PostMapping("/addUser")
    public String addUser(User user) {
        userRepository.save(user);
        return "redirect:/tempMessage";
    }

    @GetMapping("/tempMessage")
    public String tempMessage(){
        return "messagePage";
    }

}
