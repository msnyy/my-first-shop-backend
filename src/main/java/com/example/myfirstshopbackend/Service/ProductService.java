package com.example.myfirstshopbackend.Service;

import com.example.myfirstshopbackend.Model.Product;
import com.example.myfirstshopbackend.Model.Req.ProductCreateReq;
import com.example.myfirstshopbackend.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Base64;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }

    public void createProduct(ProductCreateReq product){
        byte[] imageBytes = Base64.getDecoder().decode(product.getImage());

        Product newProduct = new Product();
        newProduct.setProductName(product.getProductName());
        newProduct.setPrice(product.getPrice());
        newProduct.setDetail(product.getDetail());
        newProduct.setImage(imageBytes);

        productRepository.save(newProduct);
    }

}
