package com.example.demo.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.ProductEntity;
import com.example.demo.service.user.ProductService;

@Controller
public class UserProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/user/shop")
    public String shop(Model model) {
        System.out.println("tgdfgggfgf");
        List<ProductEntity> products = productService.findAll();
        model.addAttribute("items", products);
        System.err.println(products + "hjgghghghghhg");
        return "user/shop";
        // return products;
    }

    @RequestMapping("user/productdeitail/{id}")
    public String productdeitail(Model model) {
        return null;

    }
}
