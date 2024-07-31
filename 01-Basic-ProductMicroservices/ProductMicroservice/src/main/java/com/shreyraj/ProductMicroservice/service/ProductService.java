package com.shreyraj.ProductMicroservice.service;

import com.shreyraj.ProductMicroservice.rest.CreateProductRestModel;

public interface ProductService {
    String createProduct(CreateProductRestModel CreateProductRestModel) throws Exception;
}
