package com.example.demo.service.admin.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CategoriesDetailDAO;
import com.example.demo.entity.CategoriesDetailEntity;
import com.example.demo.service.admin.AdminCategoryDetailService;

@Service
public class AdminCategoryDetailServiceImpl implements AdminCategoryDetailService {
    @Autowired
    CategoriesDetailDAO categoriesDetailDAO;

    @Override
    public List<CategoriesDetailEntity> findAll() {
        return categoriesDetailDAO.findAll();
    }

    @Override
    public Page<CategoriesDetailEntity> findAll(Pageable pageable) {
        return categoriesDetailDAO.findAll(pageable);
    }

    @Override
    public Optional<CategoriesDetailEntity> findById(Integer id) {
        return categoriesDetailDAO.findById(id);
    }

    @Override
    public CategoriesDetailEntity create(CategoriesDetailEntity categories) {
        return categoriesDetailDAO.save(categories);
    }

    @Override
    public CategoriesDetailEntity update(CategoriesDetailEntity categories) {
        return categoriesDetailDAO.save(categories);
    }

    @Override
    public void delete(CategoriesDetailEntity categories) {
        categoriesDetailDAO.delete(categories);
    }

}
