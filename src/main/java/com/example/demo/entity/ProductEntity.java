// package com.example.demo.entity;

// import java.io.Serializable;
// import java.math.BigDecimal;
// import java.util.ArrayList;
// import java.util.List;

// import jakarta.persistence.CascadeType;
// import jakarta.persistence.Column;
// import jakarta.persistence.Entity;
// import jakarta.persistence.FetchType;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.ManyToMany;
// import jakarta.persistence.Table;
// import jakarta.validation.constraints.Min;
// import jakarta.validation.constraints.NotEmpty;
// import jakarta.validation.constraints.NotNull;
// import lombok.AllArgsConstructor;
// import lombok.Getter;
// import lombok.NoArgsConstructor;
// import lombok.Setter;

// @Entity
// @Getter
// @Setter
// @SuppressWarnings("serial")
// @NoArgsConstructor
// @AllArgsConstructor
// @Table(name = "Product")
// public class ProductEntity implements Serializable {
//     @Id
//     @GeneratedValue(strategy = GenerationType.AUTO)
//     @Column(name = "Product_id", nullable = false)
//     private Long product_id;

//     @Column(name = "Product_name")
//     @NotEmpty(message = "Product name not empty")
//     private String product_name;

//     @Column(name = "Product_description")
//     private String product_description;

//     @Column(name = "Product_image")
//     @NotEmpty(message = "Product image not empty")
//     private String product_image;

//     @Column(name = "Product_price")
//     @Min (value =  0 , message = "Price > 0")
// 	@NotNull
//     private BigDecimal product_price;

//     @ManyToMany(mappedBy = "products", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//     private List<BrandEntity> brand = new ArrayList<>();


// }
