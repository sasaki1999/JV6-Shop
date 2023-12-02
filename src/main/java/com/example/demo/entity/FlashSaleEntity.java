package com.example.demo.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * FlashSaleEntity
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "FlashSale")
public class FlashSaleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "flashSale_id", nullable = false)
    private Long FlashSaleId;

    @Column(name = "flashSale_price")
    @NotEmpty(message = "Flash Sale Price not empty")
    private Integer FlashSalePrice;

    @Column(name = "flashSale_startDate")
    @NotEmpty(message = "Flash Sale Start Date not empty")
    private Timestamp FlashSaleStartDate;

    @Column(name = "flashSale_endDate")
    @NotEmpty(message = "Flash Sale End Date not empty")
    private Timestamp FlashSaleEndDate;

    @ManyToOne
    @JoinColumn(name = "product_id")
    ProductEntity product;
    
}
