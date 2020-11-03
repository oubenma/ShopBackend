package com.shop.shopback.controller;

import com.shop.shopback.models.Product;
import com.shop.shopback.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.FetchType;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products/p")
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @PostMapping("/products/save")
    public Product handleAddProduct(@RequestBody Product product) {

        return productRepository.save(product);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable int id ) {
        Product product = new Product();
        product.setId(id);
        productRepository.delete(product);
    }

    @PutMapping("/products/update")
    public ResponseEntity<Product> updateProduct(@RequestBody Product product) {
        if (productRepository.existsById(product.getId())) {
            return new ResponseEntity<>(productRepository.save(product), HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }



}