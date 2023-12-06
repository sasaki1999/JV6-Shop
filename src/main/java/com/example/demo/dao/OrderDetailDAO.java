package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.OrderDetailEntity;

public interface OrderDetailDAO extends JpaRepository<OrderDetailEntity, Integer> {
    List<OrderDetailEntity> findByOrderOrderId(Integer id);
}
