package com.juhao666.web.webdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Map;


//@Controller vs @RestController
@Controller
public class MyFirstSpringBootWebController {
    @Value("${application.message}")
    private String message = "Hi there";

    @GetMapping("/")
    public String index(Map<String, Object> model) {

        long now = System.currentTimeMillis();
        model.put("now", new Timestamp(now));
        model.put("message", this.message);
        return "MyFirstSpringBootWebIndex";
    }
}
