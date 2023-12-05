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
<<<<<<< HEAD
import jakarta.validation.constraints.NotBlank;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;


@Entity
=======
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
>>>>>>> a0055219833e44ed740e1595573fb0fe64cfbfc8
@SuppressWarnings("serial")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "Product")
public class ProductEntity implements Serializable {
    @Id
<<<<<<< HEAD
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id", nullable = false)
    private Integer ProductId;

    @NotBlank(message = "Product name not empty")
    @Column(name = "product_name")
=======
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id", nullable = false)
    private Long ProductId;

    @Column(name = "product_name")
    @NotEmpty(message = "Product name not empty")
>>>>>>> a0055219833e44ed740e1595573fb0fe64cfbfc8
    private String ProductName;

    @Column(name = "product_description")
    private String ProductDescription;

<<<<<<< HEAD
    //@NotNull(message = "Product image not empty")
    @Column(name = "product_image")
    private String ProductImage;

    @Min (value =  0 , message = "Price > 0")
	@NotNull
    @Column(name = "product_price")
=======
    @Column(name = "product_image")
    @NotEmpty(message = "Product image not empty")
    private String ProductImage;

    @Column(name = "product_price")
    @Min (value =  0 , message = "Price > 0")
	@NotNull
>>>>>>> a0055219833e44ed740e1595573fb0fe64cfbfc8
    private BigDecimal ProductPrice;



    @JsonIgnore
    @OneToMany(mappedBy = "product")
    List<ProductDetailEntity> productDetail;

<<<<<<< HEAD
    @JsonIgnore
=======
     @JsonIgnore
>>>>>>> a0055219833e44ed740e1595573fb0fe64cfbfc8
    @OneToMany(mappedBy = "product")
    List<FlashSaleEntity> flashSale;

    @ManyToOne
    @JoinColumn(name = "brand_id")
<<<<<<< HEAD
    @NotNull(message = "not null")
    BrandEntity brand;

    
    @ManyToOne
    @JoinColumn(name = "categoriesDetail_id")
    @NotNull(message = "not null")
    CategoriesDetailEntity categoriesDetail;


    

=======
    BrandEntity brand;

    @ManyToOne
    @JoinColumn(name = "categoriesDetail_id")
    CategoriesDetailEntity categoriesDetail;

>>>>>>> a0055219833e44ed740e1595573fb0fe64cfbfc8
}
