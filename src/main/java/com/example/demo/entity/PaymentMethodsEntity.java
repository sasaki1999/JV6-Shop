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
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "paymentMethod_id", nullable = false)
    private Long paymentMethodId;

    @Column(name = "paymentMethod_type")
    private String paymentMethodType;

    @JsonIgnore
    @OneToMany(mappedBy = "paymentmethods")
    List<PaymentEntity> payment;
}