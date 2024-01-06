package com.projects.One.product;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {


    public ProductService(JdbcTemplate jdbcTemplate) {
    }

    public List<ProductEntity> getAllProducts() {
        return List.of( new ProductEntity());
    }

    public ProductEntity getProductByProductName(String productName) {
        return new ProductEntity();
    }

    public ProductEntity addProduct(ProductEntity productEntity) {
        return new ProductEntity();
    }

}
