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

	public CategoriesEntity create(CategoriesEntity categories) ;

	public CategoriesEntity update(CategoriesEntity categories) ;

	public void delete(CategoriesEntity categories) ;
    
}