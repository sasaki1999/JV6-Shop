package com.example.demo.dao;
import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.entity.BrandEntity;
public interface BrandDAO extends JpaRepository<BrandEntity, Integer>{

}
