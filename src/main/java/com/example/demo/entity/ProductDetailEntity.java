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
@Table(name = "ProductDetail")
public class ProductDetailEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "productDetail_id", nullable = false)
    private Long ProductDetailId;

    @Column(name = "quality")
    @NotEmpty(message = "Quality not empty")
    private Double quality;

    @Column(name = "price")
    @NotEmpty(message = "Price not empty")
    private BigDecimal price;

    @JsonIgnore
    @OneToMany(mappedBy = "productDetail")
    private List<OrderDetailEntity> orderDetailEntities;

    @JsonIgnore
    @OneToMany(mappedBy = "productDetail")
    private List<CartEntity> cartEntities;

    @ManyToOne
    @JoinColumn(name = "product_id")
    ProductEntity product;

    @ManyToOne
    @JoinColumn(name = "size_id")
    SizeEntity size;

    @ManyToOne
    @JoinColumn(name = "color_id")
    ColorEntity color;
}