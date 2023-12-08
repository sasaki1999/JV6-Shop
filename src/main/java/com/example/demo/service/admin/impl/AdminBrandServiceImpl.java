package com.example.demo.service.admin.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BrandDAO;
import com.example.demo.entity.BrandEntity;
import com.example.demo.entity.CategoriesDetailEntity;
import com.example.demo.service.admin.AdminBrandService;

@Service
public class AdminBrandServiceImpl implements AdminBrandService {
    @Autowired
    BrandDAO brandDAO;
    @Override
    public List<BrandEntity> findAll() {
        return brandDAO.findAll();
    }

    @Override
    public Page<BrandEntity> findAll(Pageable pageable) {
        return brandDAO.findAll(pageable);
    }

    @Override
    public Optional<BrandEntity> findById(Integer id) {
        return brandDAO.findById(id);
    }

    @Override
    public BrandEntity create(BrandEntity brand) {
        return brandDAO.save(brand);
    }

    @Override
    public BrandEntity update(BrandEntity brand) {
        return brandDAO.save(brand);
    }

    @Override
    public void delete(BrandEntity brand) {
        brandDAO.delete(brand);
    }

}
