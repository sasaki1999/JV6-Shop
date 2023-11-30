// package com.example.demo.entity;

// import java.io.Serializable;
// import java.math.BigDecimal;

// import jakarta.persistence.Column;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.Table;
// import jakarta.validation.constraints.NotEmpty;
// import lombok.AllArgsConstructor;
// import lombok.Getter;
// import lombok.NoArgsConstructor;
// import lombok.Setter;

// @Entity
// @Getter
// @Setter
// @NoArgsConstructor
// @AllArgsConstructor
// @Table(name = "Product_Detail")
// public class ProductDeitailEntity implements Serializable {
//     @Id
//     @GeneratedValue(strategy = GenerationType.AUTO)
//     @Column(name = "Product_detail_id", nullable = false)
//     private Long product_detail_id;

//     @Column(name = "Quality")
//     @NotEmpty(message = "Quality not empty")
//     private Double quality;

//     @Column(name = "Price")
//     @NotEmpty(message = "Price not empty")
//     private BigDecimal price;

// }