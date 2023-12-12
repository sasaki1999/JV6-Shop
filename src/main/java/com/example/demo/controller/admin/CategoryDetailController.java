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

import com.example.demo.entity.CategoriesDetailEntity;
import com.example.demo.entity.CategoriesEntity;
import com.example.demo.entity.ProductEntity;
import com.example.demo.service.admin.AdminCategoryDetailService;
import com.example.demo.service.admin.AdminCategoryService;

@Controller
@RequestMapping("/admin")
public class CategoryDetailController {
    @Autowired
    AdminCategoryDetailService categoryDetailService;
    @Autowired
    AdminCategoryService categoryService;

    @RequestMapping("/categoriesDetail")
    public String categories(@ModelAttribute("categoriesDetail") CategoriesDetailEntity categoriesDetail,
            Optional<Integer> p, Model model) {
        Pageable pageable = PageRequest.of(p.orElse(0), 5);
        Page<CategoriesDetailEntity> pages = categoryDetailService.findAll(pageable);
        model.addAttribute("pages", pages);
        model.addAttribute("currentPage", p.orElse(0));
        return "admin/categoryDetail/category";
    }

    @PostMapping("/categoriesDetail/add")
    public String add(@Validated @ModelAttribute("categoriesDetail") CategoriesDetailEntity categoriesDetail,
            Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("message_danger", "Thêm không thành công !");
            return "admin/categoryDetail/add_categoryDetail";
        }
        categoryDetailService.create(categoriesDetail);
        model.addAttribute("message", "Thêm thành công !");
        CategoriesDetailEntity reset = new CategoriesDetailEntity(null, null, null, null);
        model.addAttribute("categoriesDetail", reset);
        return "admin/categoryDetail/add_categoryDetail";
    }

    @GetMapping("/categoryDetail/showadd")
    public String showAdd(@ModelAttribute("categoriesDetail") CategoriesDetailEntity categoriesDetail, Model model) {
        return "admin/categoryDetail/add_categoryDetail";
    }

    @PostMapping("/categoriesDetail/update/{id}")
    public String update(@PathVariable("id") Integer id,
            @Validated @ModelAttribute("categoriesDetail") CategoriesDetailEntity categoriesDetail, Errors errors,
            Model model) {
        categoriesDetail.setCategoriesDetailId(id);
        if (errors.hasErrors()) {
            model.addAttribute("message_danger", "Cập nhật không thành công !");
            return "admin/categoryDetail/update_categoriesDetail";
        }
        categoryDetailService.create(categoriesDetail);
        model.addAttribute("message", "Cập nhật thành công !");
        return "admin/categoryDetail/update_categoryDetail";
    }

    @RequestMapping("/categoriesDetail/edit/{id}")
    public String edit(@PathVariable("id") Integer id, Model model) {
        CategoriesDetailEntity categoriesDetail = categoryDetailService.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid student Id:" + id));
        model.addAttribute("categoriesDetail", categoriesDetail);
        return "admin/categoryDetail/update_categoryDetail";
    }

    @GetMapping("/categoriesDetail/delete/{id}")
    public String deleteProduct(@PathVariable("id") Integer id, Model model) {
        CategoriesDetailEntity categoriesDetailEntity = categoryDetailService.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid student Id:" + id));
        if (!categoriesDetailEntity.getProduct().isEmpty()) {
            model.addAttribute("message_danger", "Loại sản phẩm không thể xóa");
            return "forward:/admin/categoriesDetail";
        }
        categoryDetailService.delete(categoriesDetailEntity);
        model.addAttribute("message", "Xóa thành công !");
        return "forward:/admin/categoriesDetail";
    }

    @ModelAttribute("categoriesAll")
    public Iterable<CategoriesEntity> getCateogries() {
        return categoryService.findAll();
    }
}
