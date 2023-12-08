package com.example.demo.service.admin;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.demo.entity.BrandEntity;
import com.example.demo.entity.CategoriesDetailEntity;

/**
 * AdminBrandService
 */
public interface AdminBrandService {
    public List<BrandEntity> findAll() ;
	
	public Optional<BrandEntity> findById(Integer id) ;

	public Page<BrandEntity> findAll(Pageable pageable) ;

	public BrandEntity create(BrandEntity brand) ;

	public BrandEntity update(BrandEntity brand) ;

	public void delete(BrandEntity brand) ;
    
}
