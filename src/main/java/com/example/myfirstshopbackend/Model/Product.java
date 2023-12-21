package com.example.myfirstshopbackend.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
import org.springframework.data.annotation.Id;

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
