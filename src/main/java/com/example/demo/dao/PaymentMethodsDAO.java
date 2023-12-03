package com.example.demo.dao;
import org.springframework.data.jpa.repository.JpaRepository;



import com.example.demo.entity.PaymentMethodsEntity;
public interface PaymentMethodsDAO extends JpaRepository<PaymentMethodsEntity, Long>{

}
