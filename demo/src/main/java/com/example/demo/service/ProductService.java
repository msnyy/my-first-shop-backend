package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.model.ProductCreateRequest;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }

    public void createProduct(ProductCreateRequest product){
        byte[] imageBytes = Base64.getDecoder().decode(product.getImage());

        Product newProduct = new Product();
        newProduct.setProductName(product.getProductName());
        newProduct.setPrice(product.getPrice());
        newProduct.setDetail(product.getDetail());
        newProduct.setImage(imageBytes);

        productRepository.save(newProduct);
    }

}

