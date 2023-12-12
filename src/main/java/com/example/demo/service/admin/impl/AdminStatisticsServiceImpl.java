package com.example.demo.service.admin.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.OrderDAO;
import com.example.demo.service.admin.AdminStatisticsService;
@Service
public class AdminStatisticsServiceImpl implements AdminStatisticsService  {
    @Autowired
    OrderDAO orderDAO;

    @Override
    public List<Object[]> findAll(String year) {
       return orderDAO.thongke(year);
    }

    @Override
    public List<Object[]> findByYear() {
       return orderDAO.Year();
    }

    
}
