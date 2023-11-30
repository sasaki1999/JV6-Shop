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
// @Table(name = "Size")
// public class SizeEntity implements Serializable {
//     @Id
//     @GeneratedValue(strategy = GenerationType.AUTO)
//     @Column(name = "Size_id", nullable = false)
//     private Long size_id;

//     @Column(name = "Size_name")
//     @NotEmpty(message = "Size name not empty")
//     private String size_name;

//     @ManyToMany(mappedBy = "SizeEntity", fetch = FetchType.EAGER)
//     private List<ProductDeitailEntity> product = new ArrayList<>();

// }
