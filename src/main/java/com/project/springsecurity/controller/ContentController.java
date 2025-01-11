package com.project.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContentController {

    @GetMapping("/error")
    public String home() {
        return "error";
    }

    @GetMapping("/login")
    public String login() {
        return "custom_login";
    }

    @GetMapping("/home")
    public String handleWelcome() {
        return "home";
    }

    @GetMapping("/admin/home")
    public String handleAdminHome() {
        return "home_admin";
    }

    @GetMapping("/user/home")
    public String handleUserHome() {
        return "home_user";
    }
}
