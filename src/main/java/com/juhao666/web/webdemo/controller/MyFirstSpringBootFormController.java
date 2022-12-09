package com.juhao666.web.webdemo.controller;

import com.juhao666.web.webdemo.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyFirstSpringBootFormController {

    @GetMapping("/addUser")
    public String sendForm(User user) {
        return "addUser";
    }

    @PostMapping("/addUser")
    public String processForm(User user) {
        return "showUser";
    }
}