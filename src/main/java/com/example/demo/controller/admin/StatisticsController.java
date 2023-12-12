package com.example.demo.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.OrderEntity;
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
    public String showall(Model model) {

        return "/admin/statistics/statistics";
    }

    @GetMapping("/statistics/{year}")
    public String show(@PathVariable("year") String year, Model model) {
        List<Object[]> list = adminStatisticsService.findAll(year);

        model.addAttribute("items", list);
        model.addAttribute("nam", year);
        System.out.println(year);
        return "forward:/admin/statistics";
    }

    @ModelAttribute("year")
    public List<Object[]> getYear() {
        return adminStatisticsService.findByYear();
    }
}
