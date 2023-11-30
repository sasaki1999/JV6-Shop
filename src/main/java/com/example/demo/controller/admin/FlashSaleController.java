package com.example.demo.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class FlashSaleController {
    @GetMapping("/flashsale")
    public String show() {
        return "/admin/flashsale";
    }
}
