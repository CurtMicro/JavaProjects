package com.projects.One.product;

import lombok.Data;

@Data
public class ProductRequest {

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


