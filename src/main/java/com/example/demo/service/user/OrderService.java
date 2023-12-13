package com.example.demo.service.user;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.entity.OrderEntity;

public interface OrderService {
    List<OrderEntity> findByUserId(int account);

    List<OrderEntity> findAll();

    OrderEntity findByOrderId(Integer orderId);

    static OrderEntity save(OrderEntity orders) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    BigDecimal sumOrderPrice(int account);

    BigDecimal countOrdersByAccountId(int account);

}