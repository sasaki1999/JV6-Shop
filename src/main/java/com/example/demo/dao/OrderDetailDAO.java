package com.example.demo.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.OrderDetailEntity;
public interface OrderDetailDAO extends JpaRepository<OrderDetailEntity, Integer>{

}
