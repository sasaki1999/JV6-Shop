package com.example.demo.entity;

import java.util.List;

<<<<<<< HEAD
=======

>>>>>>> a0055219833e44ed740e1595573fb0fe64cfbfc8
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
<<<<<<< HEAD
=======
import jakarta.validation.constraints.NotEmpty;
>>>>>>> a0055219833e44ed740e1595573fb0fe64cfbfc8
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "CategoriesDetail")
public class CategoriesDetailEntity {
  @Id
<<<<<<< HEAD
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "categoriesDetail_id", nullable = false)
  private Integer CategoriesDetailId;

  @Column(name = "categoriesDetail_name")
  // @NotEmpty(message = "Categories detail name not empty")
=======
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "categoriesDetail_id", nullable = false)
  private String CategoriesDetailId;

  @Column(name = "categoriesDetail_name")
  @NotEmpty(message = "Categories detail name not empty")
>>>>>>> a0055219833e44ed740e1595573fb0fe64cfbfc8
  private String CategoriesDetailName;

  @ManyToOne
  @JoinColumn(name = "categories_id")
<<<<<<< HEAD
  CategoriesEntity categories;

  @JsonIgnore
  @OneToMany(mappedBy = "categoriesDetail")
  List<ProductEntity> product;
=======
   CategoriesEntity categories;

   @JsonIgnore
   @OneToMany(mappedBy = "categoriesDetail")
   List<ProductEntity> product;
>>>>>>> a0055219833e44ed740e1595573fb0fe64cfbfc8

}
