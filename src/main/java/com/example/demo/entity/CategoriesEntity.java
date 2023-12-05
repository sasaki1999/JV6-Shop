package com.example.demo.entity;

import java.io.Serializable;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "Categories")
public class CategoriesEntity implements Serializable {
    @Id
<<<<<<< HEAD
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categories_id", nullable = false)
    private Integer CategoriesId;
=======
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "categories_id", nullable = false)
    private String CategoriesId;
>>>>>>> a0055219833e44ed740e1595573fb0fe64cfbfc8

    @Column(name = "categories_name")
    @NotEmpty(message = "Categories name not empty")
    private String CategoriesName;

    @JsonIgnore
    @OneToMany(mappedBy = "categories")
    List<CategoriesDetailEntity> categoriesDetail;
}
