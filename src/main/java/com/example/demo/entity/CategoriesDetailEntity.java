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
// @Table(name = "Categories_Detail")
// public class CategoriesDetailEntity {
//     @Id
//     @GeneratedValue(strategy = GenerationType.AUTO)
//     @Column(name = "Categories_detail_id", nullable = false)
//     private Long product_detail_id;

//     @Column(name = "Categories_detail_name")
//     @NotEmpty(message = "Categories detail name not empty")
//     private Double quality;
    
//       @ManyToOne
//     @JoinColumn(name="Categories_id", nullable = false, referencedColumnName = "Categories_id")
//     @JsonBackReference
//     private CategoriesEntity categories;
   
// }

