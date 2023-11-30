// package com.example.demo.entity;


// import com.fasterxml.jackson.annotation.JsonBackReference;

// import jakarta.persistence.Column;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.ManyToOne;
// import jakarta.persistence.Table;
// import lombok.Getter;
// import lombok.Setter;

// @Getter
// @Setter
// @Entity
// @Table(name = "payment")
// public class PaymentEntity {
//     @Id
//     @GeneratedValue(strategy = GenerationType.AUTO)
//     @Column(name = "Payment_id", nullable = false)
//     private Long id;

//       @ManyToOne
//     @JoinColumn(name="PaymentMethod_id", nullable = false, referencedColumnName = "PaymentMethod_id")
//     @JsonBackReference
//     private PaymentMethodsEntity paymentMethods;


    
//     private double Card_number;

    
//     private String Card_name;

    
//     private String Payment_address;

    
//     private double Total_amount;
// }
