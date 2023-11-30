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
// public class ColorEntity implements Serializable {
//     @Id
//     @GeneratedValue(strategy = GenerationType.AUTO)
//     @Column(name = "Color_id", nullable = false)
//     private Long id;

//     @Column(name = "Color_name")
//     @NotEmpty(message = "Color name not empty")
//     private String name;

//     @ManyToMany(mappedBy = "BrandEntity", fetch = FetchType.EAGER)
//     private List<ProductEntity> product = new ArrayList<>();

// }
