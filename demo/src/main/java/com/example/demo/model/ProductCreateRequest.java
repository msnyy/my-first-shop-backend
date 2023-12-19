package com.example.demo.model;

import lombok.Data;

@Data
public class ProductCreateRequest {
    String productName;
    int price;
    String detail;

    String image;
}
