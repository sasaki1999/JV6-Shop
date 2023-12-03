package com.example.demo.service.admin;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.CategoriesEntity;

/**
 * AdminCategoryService
 */
public interface AdminCategoryService {
    public List<CategoriesEntity> findAll() ;
	
	public Optional<CategoriesEntity> findById(Integer id) ;

	public CategoriesEntity create(CategoriesEntity major) ;

	public CategoriesEntity update(CategoriesEntity major) ;

	public void delete(Integer id) ;
    
}