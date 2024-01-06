package com.projects.One.product;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<ProductEntity> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{productName}")
    public ProductEntity getProductByProductName(@PathVariable String productName) {
        return productService.getProductByProductName(productName);
    }

    @PostMapping
    public ProductEntity addProduct(@RequestBody ProductEntity productEntity) {
        return productService.addProduct(productEntity);
    }

}
