package com.example.demo.dao;
import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.entity.PaymentEntity;
public interface PaymentDAO extends JpaRepository<PaymentEntity, Long>{

}
