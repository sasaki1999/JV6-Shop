package com.example.demo.service.admin;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.BrandEntity;

/**
 * AdminBrandService
 */
public interface AdminBrandService {
    public List<BrandEntity> findAll() ;
	
	public Optional<BrandEntity> findById(Integer id) ;

	public BrandEntity create(BrandEntity major) ;

	public BrandEntity update(BrandEntity major) ;

	public void delete(Integer id) ;
    
}
