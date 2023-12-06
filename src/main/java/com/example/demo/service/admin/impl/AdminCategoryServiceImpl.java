package com.example.demo.service.admin.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CategoriesDAO;
import com.example.demo.dao.CategoriesDetailDAO;
import com.example.demo.entity.BrandEntity;
import com.example.demo.entity.CategoriesEntity;
import com.example.demo.service.admin.AdminBrandService;
import com.example.demo.service.admin.AdminCategoryService;
@Service
public class AdminCategoryServiceImpl implements AdminCategoryService {
    @Autowired
    CategoriesDAO categoriesDAO;

    @Override
    public List<CategoriesEntity> findAll() {
        return categoriesDAO.findAll();
    }

    @Override
    public Optional<CategoriesEntity> findById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public CategoriesEntity create(CategoriesEntity categories) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public CategoriesEntity update(CategoriesEntity categories) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(CategoriesEntity categories) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
    
    
}
