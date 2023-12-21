package com.example.myfirstshopbackend.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "product")
public class Product {
    @Id
    int id;
    @Column(name = "productName")
    String productName;
    int price;
    String detail;
    byte[] image;
}
