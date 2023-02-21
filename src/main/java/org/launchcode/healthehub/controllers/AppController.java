package org.launchcode.healthehub.controllers;

import org.launchcode.healthehub.models.User;
import org.launchcode.healthehub.models.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class AppController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String viewHomePage(){
        return "index";
    }
}
