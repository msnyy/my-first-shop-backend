package com.example.myfirstshopbackend.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Product {
    @Id
    int id;
    @Column(name = "productName")
    String productName;
    int price;
    String detail;
    byte[] image;
}
