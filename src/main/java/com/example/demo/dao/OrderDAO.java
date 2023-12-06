package com.example.demo.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.OrderEntity;


public interface OrderDAO extends JpaRepository<OrderEntity, Integer>{
    List<OrderEntity> findByAccountAccountId(Integer accountId);
}
