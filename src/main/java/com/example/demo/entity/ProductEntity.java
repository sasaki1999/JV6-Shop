package com.example.demo.entity;

import java.io.Serializable;
import java.math.BigDecimal;

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
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@SuppressWarnings("serial")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Product")
public class ProductEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id", nullable = false)
     Integer ProductId;

    @Nationalized
    @NotBlank(message = "Product name not empty")
    @Column(name = "product_name")
     String ProductName;

    @Column(name = "product_description")
     String ProductDescription;


    @Column(name = "product_image")
     String ProductImage;

    @Min (value =  0 , message = "Price > 0")
	@NotNull
    @Column(name = "product_price")
     BigDecimal ProductPrice;



    @JsonIgnore
    @OneToMany(mappedBy = "product")
    List<ProductDetailEntity> productDetail;

    @JsonIgnore
    @OneToMany(mappedBy = "product")
    List<FlashSaleEntity> flashSale;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    @NotNull(message = "not null")
    BrandEntity brand;

    
    @ManyToOne
    @JoinColumn(name = "categoriesDetail_id")
    @NotNull(message = "not null")
    CategoriesDetailEntity categoriesDetail;

}
