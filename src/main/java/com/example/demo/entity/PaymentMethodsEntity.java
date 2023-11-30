// package com.example.demo.entity;

// import java.util.Collection;
// import java.util.Set;

// import com.fasterxml.jackson.annotation.JsonManagedReference;

// import jakarta.persistence.CascadeType;
// import jakarta.persistence.Column;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.OneToMany;
// import jakarta.persistence.Table;
// import lombok.Getter;
// import lombok.Setter;

// @Getter
// @Setter
// @Entity
// @Table(name = "payment_methods")
// public class PaymentMethodsEntity {
//     @Id
//     @GeneratedValue(strategy = GenerationType.AUTO)
//     @Column(name = "PaymentMethod_id", nullable = false)
//     private Long PaymentMethodId;

//     @Column(name = "PaymentMethod_type")
//     private String PaymentMethod_type;

//     @OneToMany(mappedBy = "payment_methods", cascade = CascadeType.ALL)
//     @JsonManagedReference
//     private Collection<PaymentEntity> payment;
// }