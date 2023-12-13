package com.example.demo.service.user;

import java.util.List;

import com.example.demo.entity.CartEntity;

public interface CartService {
    List<Object[]> findListCartByUserId(int account);

    CartEntity findProductExits(int account, int ProductId);

    CartEntity findByCartId(int account);

    Integer countCartByUserId(int account);

    CartEntity save(CartEntity cart);

    void delete(int cartId);
    
} 
   

