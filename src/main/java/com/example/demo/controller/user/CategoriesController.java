package com.example.demo.controller.user;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
    @RequestMapping("/categor")
public class CategoriesController {
    @GetMapping("/login")
    public String index() {
        return "user/login";
   }

   
}
