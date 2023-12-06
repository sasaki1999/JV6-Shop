package com.example.demo.service.admin.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BrandDAO;
import com.example.demo.entity.BrandEntity;
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
    public Optional<BrandEntity> findById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public BrandEntity create(BrandEntity major) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public BrandEntity update(BrandEntity major) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
