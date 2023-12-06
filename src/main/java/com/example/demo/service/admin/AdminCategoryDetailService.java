package com.example.demo.service.admin;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.demo.entity.CategoriesDetailEntity;
import com.example.demo.entity.ProductEntity;


public interface AdminCategoryDetailService {
   public List<CategoriesDetailEntity> findAll() ;

   public Page<CategoriesDetailEntity> findAll(Pageable pageable) ;
	
	public Optional<CategoriesDetailEntity> findById(Integer id) ;

	public CategoriesDetailEntity create(CategoriesDetailEntity categories) ;

	public CategoriesDetailEntity update(CategoriesDetailEntity categories) ;

	public void delete(CategoriesDetailEntity categories) ;
}
