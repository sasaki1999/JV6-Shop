package com.example.demo.service.user;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.ProductDetailEntity;

public interface ProductDetailService {

    List<ProductDetailEntity> findAll();

    List<ProductDetailEntity> findAllByProductDetailId(String productdetailId);

    List<Object[]> findTopProductDetailByCategoryId(int categoryId);

    List<Integer> findPriceProductDetailByUserId(int account);

    ProductDetailEntity findProductDetailByProductDetailId(String productdetailId);

    Optional<ProductDetailEntity> findByProductDetailId(String productdetailId);

    void save(ProductDetailEntity productdetail);

    boolean doesProductDetailExist(Integer ProductDetailId);

    // List<ProductDetailEntity> findByProductTypeId(int productTypeId);

    List<ProductDetailEntity> findByCategoryByProductTypeByProducts(int categoryId);

    List<Object[]> findByCategoryIdAndProductTypeId(int categoryId, int productTypeId);

    static ProductDetailEntity findProductByProductDetailId(Integer productId) {
        return null;
    }
}