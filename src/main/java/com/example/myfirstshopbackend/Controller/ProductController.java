package com.example.myfirstshopbackend.Controller;

import com.example.myfirstshopbackend.Model.Product;
import com.example.myfirstshopbackend.Model.Req.ProductCreateReq;
import com.example.myfirstshopbackend.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
    public ResponseEntity createProduct(@RequestBody ProductCreateReq productDTO) {
        System.out.print("Investigate: ");
//
        System.out.print(productDTO);
        productService.createProduct(productDTO);


        return ResponseEntity.ok(HttpStatus.OK);
    }

}
