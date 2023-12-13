package com.example.demo.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class ProductDto implements Serializable {
    Integer ProductId;

    String ProductName;

    String ProductDescription;

    String ProductImage;

    BigDecimal ProductPrice;
}
