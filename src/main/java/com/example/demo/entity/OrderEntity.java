package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;
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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * OrderEntity
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Orders")
public class OrderEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id")
    private Long orderId;
    @Column(name = "order_date")
    private Date orderDate = new Date();
    @Column(name = "order_status")
    private Boolean orderStatus;
    @Column(name = "order_amount")
    private Double orderAmount;

    @JsonIgnore
    @OneToMany(mappedBy = "order")
    private List<OrderDetailEntity> orderDetail;

    @ManyToOne
    @JoinColumn(name = "payment_id")
    PaymentEntity payment;

    @ManyToOne
    @JoinColumn(name = "user_id")
    AccountEntity account;

}