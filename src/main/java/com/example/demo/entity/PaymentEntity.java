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
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "payment_id", nullable = false)
  private Long id;

  @Column(name = "card_number")
  private double cardNumber;

  @Column(name = "card_name")
  private String cardName;

  @Column(name = "payment_address")
  private String paymentAddress;

  @Column(name = "total_amount")
  private double total_Amount;

@ManyToOne
    @JoinColumn(name = "paymentmethods_id")
    PaymentMethodsEntity paymentmethods;

 @JsonIgnore
    @OneToMany(mappedBy = "payment")
    List<OrderEntity> order;    
}
