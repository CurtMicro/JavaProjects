package com.projects.One.product;


import org.mapstruct.Mapper;

@Mapper
public interface ProductMapper {


    ProductEntity requestToEntity(ProductRequest request);

    ProductResponse entityToResponse(ProductEntity entity);
}
