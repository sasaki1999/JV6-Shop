package com.example.demo.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.AccountEntity;


public interface AccountDAO extends JpaRepository<AccountEntity, Long>{

}
