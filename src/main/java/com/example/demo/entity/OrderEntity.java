// package com.example.demo.entity;

// import java.io.Serializable;
// import java.util.Date;

// import jakarta.persistence.Column;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.Table;
// import lombok.AllArgsConstructor;
// import lombok.Data;
// import lombok.NoArgsConstructor;

// /**
//  * OrderEntity
//  */
// @Data
// @Entity
// @NoArgsConstructor
// @AllArgsConstructor
// @Table(name = "Order")
// public class OrderEntity implements Serializable {
//     @Id
//     @GeneratedValue(strategy = GenerationType.AUTO)
//     @Column(name = "Order_id")
//     private Long Order_id;
//     @Column(name = "Order_date")
//     private Date Order_date = new Date();
//     @Column(name = "Order_status")
//     private Boolean Order_status ;
//     @Column(name = "Order_amount")
//     private Double Order_amount;

// }