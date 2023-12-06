package com.example.demo.service.admin;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.demo.entity.ProductEntity;

public interface AdminProductService {
    public List<ProductEntity> findAll() ;

	public Page<ProductEntity> findAll(Pageable pageable) ;
	
	public Optional<ProductEntity> findById(Integer id) ;

	public ProductEntity create(ProductEntity product) ;

	public ProductEntity update(ProductEntity product) ;

	public void delete(ProductEntity product) ;
}
