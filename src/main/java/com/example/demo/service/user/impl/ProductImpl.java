package com.example.demo.service.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductDAO;
import com.example.demo.entity.ProductEntity;
import com.example.demo.service.user.ProductService;

@Service
public class ProductImpl implements ProductService{
    @Autowired
    ProductDAO pdao;

    @Override
    public List<ProductEntity> findAll() {
        return pdao.findAll();
    }

    

}
