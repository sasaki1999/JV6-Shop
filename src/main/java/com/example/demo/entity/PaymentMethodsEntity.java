package com.example.demo.entity;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Data
@Table(name = "Payment_methods")
public class PaymentMethodsEntity {
    @Id
<<<<<<< HEAD
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "paymentMethod_id", nullable = false)
    private Integer paymentMethodId;
=======
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "paymentMethod_id", nullable = false)
    private Long paymentMethodId;
>>>>>>> a0055219833e44ed740e1595573fb0fe64cfbfc8

    @Column(name = "paymentMethod_type")
    private String paymentMethodType;

    @JsonIgnore
    @OneToMany(mappedBy = "paymentmethods")
    List<PaymentEntity> payment;
}