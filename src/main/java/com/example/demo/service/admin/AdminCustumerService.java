package com.example.demo.service.admin;

import java.util.List;

import com.example.demo.entity.AccountEntity;
import com.example.demo.entity.OrderDetailEntity;
import com.example.demo.entity.OrderEntity;

public interface AdminCustumerService {
   public List<AccountEntity> findAll();

   public List<OrderEntity> findAllByAccountId(Integer id);
   
   public List<OrderDetailEntity> findAllByOrderId(Integer id);
}
