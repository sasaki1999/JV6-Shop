package com.example.demo.entity;

import java.util.List;


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
import jakarta.validation.constraints.NotEmpty;
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
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "categoriesDetail_id", nullable = false)
  private String CategoriesDetailId;

  @Column(name = "categoriesDetail_name")
  @NotEmpty(message = "Categories detail name not empty")
  private String CategoriesDetailName;

  @ManyToOne
  @JoinColumn(name = "categories_id")
   CategoriesEntity categories;

   @JsonIgnore
   @OneToMany(mappedBy = "categoriesDetail")
   List<ProductEntity> product;

}
