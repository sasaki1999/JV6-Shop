package com.example.demo.entity;

import java.io.Serializable;
import java.math.BigDecimal;

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
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@SuppressWarnings("serial")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "Product")
public class ProductEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id", nullable = false)
    private Long ProductId;

    @Column(name = "product_name")
    @NotEmpty(message = "Product name not empty")
    private String ProductName;

    @Column(name = "product_description")
    private String ProductDescription;

    @Column(name = "product_image")
    @NotEmpty(message = "Product image not empty")
    private String ProductImage;

    @Column(name = "product_price")
    @Min (value =  0 , message = "Price > 0")
	@NotNull
    private BigDecimal ProductPrice;



    @JsonIgnore
    @OneToMany(mappedBy = "product")
    List<ProductDetailEntity> productDetail;

     @JsonIgnore
    @OneToMany(mappedBy = "product")
    List<FlashSaleEntity> flashSale;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    BrandEntity brand;

    @ManyToOne
    @JoinColumn(name = "categoriesDetail_id")
    CategoriesDetailEntity categoriesDetail;

}
