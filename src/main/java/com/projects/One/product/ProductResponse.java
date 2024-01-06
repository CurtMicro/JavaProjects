package com.projects.One.product;

import lombok.Data;

@Data
public class ProductResponse {

    /**
     * Product ID
     */
    private String id;

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


