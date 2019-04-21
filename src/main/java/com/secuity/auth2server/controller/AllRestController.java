package com.secuity.auth2server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AllRestController {

    @RequestMapping("/public")
    public String publico() {
        return "Public Page";
    }
    @RequestMapping("/private")
    public String privada() {
        return "Private Page";
    }
    @RequestMapping("/admin")
    public String admin() {
        return "Admin Page";
    }

}
