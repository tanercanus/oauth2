package com.secuity.auth2server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping({"/","index"})
    public String indexPage() {
        return "index";
    }

    @RequestMapping("/webprivate")
    public String privatePage() {
        return "private";
    }
    @RequestMapping("/webpublic")
    public String publicPage() {
        return "public";
    }
    @RequestMapping("/webadmin")
    public String adminPage() {
        return "admin";
    }
    @RequestMapping("/login")
    public String loginPage() {
        return "login";
    }
}