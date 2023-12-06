package com.example.demo.controller.admin;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entity.BrandEntity;
import com.example.demo.entity.CategoriesDetailEntity;
import com.example.demo.entity.ProductEntity;
import com.example.demo.service.admin.AdminBrandService;
import com.example.demo.service.admin.AdminCategoryDetailService;
import com.example.demo.service.admin.AdminProductService;

@Controller
@RequestMapping("/admin")
public class ProductController {
    @Autowired
    AdminProductService adminProductService;
    @Autowired
    AdminBrandService adminBrandService;
    @Autowired
    AdminCategoryDetailService adminCategoryDetailService;

    private static String UPLOAD_DIRECTORY = System.getProperty("user.dir")
            + "/src/main/resources/static/admin/uploads/";

    @GetMapping("/product")
    public String show(Model model) {
        model.addAttribute("products", adminProductService.findAll());
        return "admin/product/product";
    }

    @RequestMapping("/product/showadd")
    public String showAdd(@ModelAttribute("product") ProductEntity product, Model model) {
        return "admin/product/add_product";
    }

    @PostMapping("/product/add")
    public String add(@Validated @ModelAttribute("product") ProductEntity product,
            BindingResult result, Errors errors, @RequestParam("image") MultipartFile image, Model model) {
        if (image != null && !image.isEmpty()) {
            try {
                String fileName = image.getOriginalFilename();
                Path fileNameAndPath = Paths.get(UPLOAD_DIRECTORY, fileName);
                Files.write(fileNameAndPath, image.getBytes());
                product.setProductImage(fileName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            model.addAttribute("photo_message", "Photo is mandatory");
            return "admin/product/add_product";
        }
        if (result.hasErrors()) {
            return "admin/product/add_product";
        }
        adminProductService.create(product);
        model.addAttribute("message", "Thêm thành công");
        return "redirect:/admin/product/showadd";

    }

    @RequestMapping("/product/edit/{id}")
    public String showUpdateForm(@PathVariable("id") Integer id, Model model) {
        ProductEntity product = adminProductService.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid student Id:" + id));
        model.addAttribute("product", product);
        return "admin/product/update_product";
    }

    @PostMapping("/product/update/{id}")
    public String update(@PathVariable("id") int id, @Validated @ModelAttribute("product") ProductEntity product,
            BindingResult result, Errors errors, @RequestParam("image") MultipartFile image, Model model) {
        product.setProductId(id);
        if (image != null && !image.isEmpty()) {
            try {
                String fileName = image.getOriginalFilename();
                Path fileNameAndPath = Paths.get(UPLOAD_DIRECTORY, fileName);
                Files.write(fileNameAndPath, image.getBytes());
                product.setProductImage(fileName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            model.addAttribute("photo_message", "Photo is mandatory");
            return "admin/product/update_product";
        }
        if (result.hasErrors()) {
            return "admin/product/update_product";
        }
        adminProductService.update(product);
        model.addAttribute("message", "Cập nhật thành công");
        return "forward:/admin/product/edit/" + product.getProductId();

    }

    @GetMapping("/product/delete/{id}")
    public String deleteProduct(@PathVariable("id") Integer id, Model model) {
        ProductEntity product = adminProductService.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid student Id:" + id));
        adminProductService.delete(product);
        return "redirect:/admin/product";
    }


    @ModelAttribute("brandalls")
    public Iterable<BrandEntity> getBrands() {
        return adminBrandService.findAll();
    }

    @ModelAttribute("categoriesDetail")
    public Iterable<CategoriesDetailEntity> getCategories() {
        return adminCategoryDetailService.findAll();
    }
}
