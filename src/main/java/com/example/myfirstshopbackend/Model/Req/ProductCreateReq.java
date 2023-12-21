package com.example.myfirstshopbackend.Model.Req;

import lombok.Data;

@Data
public class ProductCreateReq {
    String productName;
    int price;
    String detail;
    String image;
}
