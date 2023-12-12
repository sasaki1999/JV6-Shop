package com.example.demo.service.admin;

import java.util.List;


public interface AdminStatisticsService {
    public List<Object[]> findAll(String year) ;

    public List<Object[]> findByYear();
}
