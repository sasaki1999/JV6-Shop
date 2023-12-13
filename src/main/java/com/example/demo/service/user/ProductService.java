package com.example.demo.service.user;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.ProductDAO;
import com.example.demo.entity.ProductEntity;

public interface ProductService {

    List<ProductEntity> findAll();

    ProductEntity findProductByProductId(Integer productId);

    List<Integer> findPriceProductByUserId(int id);


    
}
