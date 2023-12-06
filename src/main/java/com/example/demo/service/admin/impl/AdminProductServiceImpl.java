package com.example.demo.service.admin.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductDAO;
import com.example.demo.entity.ProductEntity;
import com.example.demo.service.admin.AdminProductService;

@Service
public class AdminProductServiceImpl implements AdminProductService {
    @Autowired
    ProductDAO productDAO;

    @Override
    public List<ProductEntity> findAll() {
        return productDAO.findAll();
    }

    @Override
    public Page<ProductEntity> findAll(Pageable pageable) {
        return productDAO.findAll(pageable);
    }

    @Override
    public Optional<ProductEntity> findById(Integer id) {
        return productDAO.findById(id);
    }

    @Override
    public ProductEntity create(ProductEntity product) {
      return productDAO.save(product);
    }

    @Override
    public ProductEntity update(ProductEntity product) {
        return productDAO.save(product);
    }

    

    @Override
    public void delete(ProductEntity product) {
         productDAO.delete(product);
    }

   


    
    
}
