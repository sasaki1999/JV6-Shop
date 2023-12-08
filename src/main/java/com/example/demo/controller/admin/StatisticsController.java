package com.example.demo.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.admin.AdminStatisticsService;

@Controller
@RequestMapping("/admin")
public class StatisticsController {
    @Autowired
    AdminStatisticsService adminStatisticsService;

    /**
     * @param model
     * @return
     */
    @GetMapping("/statistics")
    public String show(Model model) {
        List<Object[]> list = adminStatisticsService.findAll();
        for (Object[] item : list) {
            System.out.println(item[2]);
        }
        model.addAttribute("items", adminStatisticsService.findAll());
        return "/admin/statistics/statistics";
    }
}
