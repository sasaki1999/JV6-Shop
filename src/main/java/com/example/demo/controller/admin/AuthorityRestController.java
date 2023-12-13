package com.example.demo.controller.admin;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.AccountDAO;
import com.example.demo.dao.AuthDao;
import com.example.demo.dao.RoleDAO;
import com.example.demo.entity.AuthEntity;

/**
 * AuthorityRestController
 */
// @CrossOrigin("/admin")
@RestController
public class AuthorityRestController {
    @Autowired
    AuthDao authDao;
    @Autowired
    RoleDAO roleDAO;
    @Autowired
    AccountDAO accountDAO;

    @GetMapping("/admin/authorities")
    public Map<String, Object> getAuthorities(){
        Map<String, Object> data = new HashMap<>();
        data.put("authorities", authDao.findAll());
        data.put("roles", roleDAO.findAll());
        data.put("accounts", accountDAO.findAll());
        return data;
    }

    @PostMapping("/admin/authorities")
    public AuthEntity creat(@RequestBody AuthEntity authority){
        return authDao.save(authority);
    }

    @DeleteMapping("/admin/authorities/{id}")
    public void delete(@PathVariable("id") Integer id){
        authDao.deleteById(id);
    }
    
}