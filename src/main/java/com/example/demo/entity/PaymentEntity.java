package com.example.demo.entity;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Data
@Table(name = "Payment")
public class PaymentEntity {
  @Id
<<<<<<< HEAD
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "payment_id", nullable = false)
  private Integer id;
=======
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "payment_id", nullable = false)
  private Long id;
>>>>>>> a0055219833e44ed740e1595573fb0fe64cfbfc8

  @Column(name = "total_amount")
  private double total_Amount;

@ManyToOne
    @JoinColumn(name = "paymentmethods_id")
    PaymentMethodsEntity paymentmethods;

 @JsonIgnore
    @OneToMany(mappedBy = "payment")
    List<OrderEntity> order;    
}
