package com.example.demo.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shopping-cart")
public class UserShoppingCartController {
    @GetMapping("/shopping-cart")
    public String shoppingcart() {
        return "user/shopping-cart";
   }

}
