package com.example.demo.service.admin.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.OrderDAO;
import com.example.demo.entity.OrderEntity;
import com.example.demo.service.admin.AdminOrderService;

@Service
public class AdminOrderServiceImpl implements AdminOrderService{
    @Autowired
    OrderDAO orderDAO;

    @Override
    public List<OrderEntity> findAll() {
        return orderDAO.findAll();
    }
    
}
