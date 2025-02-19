package com.example.simplemongoexample.service;

import com.example.simplemongoexample.model.Product;
import com.example.simplemongoexample.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // Insert static products
    public void insertStaticProducts() {
        productRepository.deleteAll(); // Clear existing records

        productRepository.save(new Product("Laptop", 1200.50));
        productRepository.save(new Product("Smartphone", 699.99));
        productRepository.save(new Product("Headphones", 149.99));

        System.out.println("Static product records inserted successfully!");
    }

    // Get all products
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Get product by ID
    public Product getProductById(String id) {
        return productRepository.findById(id).orElse(null);
    }

    // Save product
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    // Delete product by ID
    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }

    // Display products on console
    public void displayProducts() {
        List<Product> products = getAllProducts();
        System.out.println("Product List:");
        products.forEach(System.out::println);
    }
}
