package com.example.demo.entity;

import java.io.Serializable;
import java.util.List;

import org.hibernate.annotations.Nationalized;

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
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@SuppressWarnings("serial")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "CategoriesDetail")
public class CategoriesDetailEntity implements Serializable{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "categoriesDetail_id", nullable = false)
   Integer CategoriesDetailId;
  
  @Nationalized
  @Column(name = "categoriesDetail_name")
  @NotBlank(message = "Categories detail name not empty")
   String CategoriesDetailName;

  @ManyToOne
  @JoinColumn(name = "categories_id")
  CategoriesEntity categories;

  @JsonIgnore
  @OneToMany(mappedBy = "categoriesDetail")
   List<ProductEntity> product;

}
