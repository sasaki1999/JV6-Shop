package com.example.demo.service.admin;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.ProductEntity;

public interface AdminProductService {
    public List<ProductEntity> findAll() ;
	
	public Optional<ProductEntity> findById(Integer id) ;

	public ProductEntity create(ProductEntity major) ;

	public ProductEntity update(ProductEntity major) ;

	public void delete(Integer id) ;
}
