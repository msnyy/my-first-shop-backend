package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.model.ProductCreateRequest;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/products")
    @CrossOrigin(origins = "http://localhost:3000")
    ResponseEntity getAllProduct() {
        List<Product> products  = new ArrayList<Product>();
        products = productService.getAllProduct();
        System.out.println("Complete!!");
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @PostMapping("/product")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity createProduct(@RequestBody ProductCreateRequest productDTO) {

        productService.createProduct(productDTO);

        return ResponseEntity.ok(HttpStatus.OK);
    }

}
