package com.projects.One.product;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    public List<ProductEntity> findByProductName(String productName);
}
