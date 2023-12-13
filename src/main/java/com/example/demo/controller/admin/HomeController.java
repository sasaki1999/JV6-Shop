package com.example.demo.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class HomeController {
    @GetMapping("/index")
    public String index() {
        return "admin/index";
    }
    @RequestMapping("/authorize")
    public String authoreted(){
        return "admin/authorize/authorize";
    }
}
