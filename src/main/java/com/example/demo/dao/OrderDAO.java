package com.example.demo.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.OrderEntity;


public interface OrderDAO extends JpaRepository<OrderEntity, Integer>{
    
    List<OrderEntity> findByAccountAccountId(Integer accountId);

    @Query(value = "select COUNT(order_id) as 'sl',SUM(order_amount) as 'tt',Month(order_date) as 'nam' from orders where YEAR(order_date) ='2003' Group by Month(order_date) ",nativeQuery = true)
    List<Object[]> thongke();
}
