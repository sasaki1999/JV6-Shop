// package com.example.demo.entity;

// import java.io.Serializable;
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
// @Table(name = "Categories")
// public class CategoriesEntity implements Serializable {
//     @Id
//     @GeneratedValue(strategy = GenerationType.AUTO)
//     @Column(name = "Categories_id", nullable = false)
//     private Long categoriesId;

//     @Column(name = "CategoriesCategories_name")
//     @NotEmpty(message = "Categories name not empty")
//     private String name;

//     @OneToMany(mappedBy = "Categories", cascade = CascadeType.ALL)
//     @JsonManagedReference
//     private Collection<CategoriesDetailEntity> categoriesdetail;

// }
