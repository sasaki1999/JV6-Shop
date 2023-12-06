package com.example.demo.service.admin.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AccountDAO;
import com.example.demo.dao.OrderDAO;
import com.example.demo.dao.OrderDetailDAO;
import com.example.demo.entity.AccountEntity;
import com.example.demo.entity.OrderDetailEntity;
import com.example.demo.entity.OrderEntity;
import com.example.demo.service.admin.AdminCustumerService;


@Service
public class AdminCustumerServiceImpl implements AdminCustumerService {

    @Autowired
    AccountDAO accountDAO;
    @Autowired 
    OrderDAO orderDAO;
    @Autowired
    OrderDetailDAO orderDetailDAO;

    @Override
    public List<AccountEntity> findAll() {
        return accountDAO.findAll();
    }

    @Override
    public List<OrderEntity> findAllByAccountId(Integer id) {
        return orderDAO.findByAccountAccountId(id);
    }

    @Override
    public List<OrderDetailEntity> findAllByOrderId(Integer id) {
       return orderDetailDAO.findByOrderOrderId(id);
    }
    

    
    
}
