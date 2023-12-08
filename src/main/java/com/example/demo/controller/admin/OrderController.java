package com.example.demo.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.admin.AdminOrderService;

@Controller
@RequestMapping("/admin")
public class OrderController {
    @Autowired
    AdminOrderService orderService;
    
    @GetMapping("/order")
    public String show(Model model) {
        model.addAttribute("orders",orderService.findAll());
        return "admin/order/order";
    }
}
