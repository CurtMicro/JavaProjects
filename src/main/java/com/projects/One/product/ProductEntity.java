package com.projects.One.product;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ProductEntity {

    /**
     * Product ID
     */
    @Id
    private Long id;

    /**
     * Product Name
     */
    private String productName;

    /**
     * Product Type
     */
    private String type;

    /**
     * Product Description
     */
    private String description;
}


