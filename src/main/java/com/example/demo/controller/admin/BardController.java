package com.example.demo.controller.admin;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.BrandEntity;
import com.example.demo.entity.CategoriesDetailEntity;
import com.example.demo.service.admin.AdminBrandService;

@Controller
@RequestMapping("/admin")
public class BardController {
    @Autowired
    AdminBrandService brandService;

    @RequestMapping("/brand")
    public String list(@ModelAttribute("brand") BrandEntity brand,
            Optional<Integer> p, Model model) {
        Pageable pageable = PageRequest.of(p.orElse(0), 5);
        Page<BrandEntity> pages = brandService.findAll(pageable);
        model.addAttribute("pages", pages);
        model.addAttribute("currentPage", p.orElse(0));
        return "admin/brand/brand";
    }

    @PostMapping("/brand/add")
    public String add(@Validated @ModelAttribute("brand")  BrandEntity brand,
            Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("message_danger", "Thêm thất bại !");
            return "admin/categoryDetail/add_categoryDetail";
        }
        brandService.create(brand);
        model.addAttribute("message", "Thêm thành công !");
        BrandEntity resetbrand = new BrandEntity(null, null, null);
        model.addAttribute("brand", resetbrand);
        return "admin/brand/add_brand";
    }

    @GetMapping("/brand/showadd")
    public String showAdd(@ModelAttribute("brand") BrandEntity brand, Model model) {
        return "admin/brand/add_brand";
    }

    @PostMapping("/brand/update/{id}")
    public String update(@PathVariable("id") Integer id,
            @Validated @ModelAttribute("brand") BrandEntity brand, Errors errors,
            Model model) {
        brand.setBrandId(id);
        if (errors.hasErrors()) {
            model.addAttribute("message_danger", "Cập nhật không thành công !");
            return "admin/brand/update_brand";
        }
        brandService.create(brand);
        model.addAttribute("message", "Cập nhật thành công !");
        return "admin/brand/update_brand";
    }

    @RequestMapping("/brand/edit/{id}")
    public String edit(@PathVariable("id") Integer id, Model model) {
        BrandEntity brand = brandService.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid student Id:" + id));
        model.addAttribute("brand", brand);
        return "admin/brand/update_brand";
    }

    @GetMapping("/brand/delete/{id}")
    public String deleteProduct(@PathVariable("id") Integer id, Model model) {
        BrandEntity brand = brandService.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid student Id:" + id));
        if (!brand.getProduct().isEmpty()) {
            model.addAttribute("message_danger","Thương hiệu đang có sản phẩm");
            return "forward:/admin/brand";
        }
        brandService.delete(brand);
        model.addAttribute("message","Xóa thành công !");
        return "forward:/admin/brand"; 
    }
}
