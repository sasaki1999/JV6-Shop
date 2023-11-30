// package com.example.demo.entity;

// import java.io.Serializable;
// import java.util.ArrayList;
// import java.util.List;

// import jakarta.persistence.Column;
// import jakarta.persistence.Entity;
// import jakarta.persistence.FetchType;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.ManyToMany;
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
// @Table(name = "Brand")
// public class BrandEntity implements Serializable {
//     @Id
//     @GeneratedValue(strategy = GenerationType.AUTO)
//     @Column(name = "Brand_id", nullable = false)
//     private Long brand_id;

//     @Column(name = "Brand_name")
//     @NotEmpty(message = "Name Brand not empty")
//     private String brand_name;

//     @ManyToMany(mappedBy = "BrandEntity", fetch = FetchType.EAGER)
//     private List<ProductEntity> product = new ArrayList<>();

// }