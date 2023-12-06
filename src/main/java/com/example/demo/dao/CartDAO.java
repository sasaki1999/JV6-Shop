package com.example.demo.dao;
import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.entity.CartEntity;
public interface CartDAO extends JpaRepository<CartEntity, Integer>{

}
