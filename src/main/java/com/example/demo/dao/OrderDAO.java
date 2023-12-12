package com.example.demo.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.OrderEntity;


public interface OrderDAO extends JpaRepository<OrderEntity, Integer>{
    
    List<OrderEntity> findByAccountAccountId(Integer accountId);

    @Query(value = "select COUNT(order_id),SUM(order_amount),Month(order_date)  from orders where YEAR(order_date) =?1 Group by Month(order_date) ",nativeQuery = true)
    List<Object[]> thongke(String year);

    @Query(value = "select YEAR(order_date) from orders group by YEAR(order_date)",nativeQuery = true)
    List<Object[]> Year();
}
