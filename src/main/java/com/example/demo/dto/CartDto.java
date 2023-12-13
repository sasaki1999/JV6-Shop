package com.example.demo.dto;
import java.io.Serializable;

import lombok.Data;

@Data
public class CartDto implements Serializable {

    String id;

    Integer accountId;

    Integer productId;

    double quantity;
}