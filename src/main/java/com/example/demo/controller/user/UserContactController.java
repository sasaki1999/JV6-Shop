package com.example.demo.controller.user;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Contact")
public class UserContactController {
    @GetMapping("/Contact")
    public String user() {
        return "user/contact";
   }

}
