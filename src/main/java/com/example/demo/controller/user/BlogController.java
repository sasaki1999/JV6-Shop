package com.example.demo.controller.user;
import org.springframework.stereotype.Controller;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RequestMapping;

    @Controller
    @RequestMapping("/blog")
public class BlogController {
    @GetMapping("/blog")
        public String blog() {
            return "user/blog";
       }
}
