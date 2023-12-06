package com.example.demo.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.admin.AdminCustumerService;

@Controller
@RequestMapping("/admin")
public class AccountController {
    @Autowired
    AdminCustumerService adminCustumerService;

   @GetMapping("/login")
    public String login() {
        return "/admin/login";
    }
    @GetMapping("/register")
    public String register() {
        return "/admin/register";
    }
    @GetMapping("/custumer")
    public String show(Model model) {
        model.addAttribute("custumers", adminCustumerService.findAll());
        return "admin/custumer/list_custumer";
    }
}
