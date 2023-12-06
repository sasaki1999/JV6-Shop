package com.example.demo.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.OrderDetailEntity;
import com.example.demo.entity.OrderEntity;
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

    @GetMapping("/custumer/order/{id}")
    public String showorder(@PathVariable("id") Integer id,Model model){
        model.addAttribute("orders", adminCustumerService.findAllByAccountId(id));
        return "admin/custumer/order_custumer";
    }

    @GetMapping("/custumer/orderDetail/{id}")
    public String showorderDetail(@PathVariable("id") Integer id,Model model){
        List<OrderDetailEntity>  orderDetails = adminCustumerService.findAllByOrderId(id);
        double totalPrice = orderDetails.stream()
        .mapToDouble(orderDetail ->orderDetail.getProductDetail().getQuality() * Double.parseDouble( orderDetail.getProductDetail().getPrice().toString()))
        .sum();
        model.addAttribute("totalPrice", totalPrice);
        model.addAttribute("orderDetails", orderDetails);
        return "admin/custumer/orderdetail_custumer";
    }
}
