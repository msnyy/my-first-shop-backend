package com.example.myfirstshopbackend.Model.Req;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ProductCreateReq {
    @JsonProperty
    String productName;
    int price;
    String detail;
    String image;
}
