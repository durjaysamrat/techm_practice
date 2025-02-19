package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.app.model.Product;
import com.app.repo.ProductRepository;
import com.app.repo.ProductRepository.myView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@Component
public class MyRunner implements CommandLineRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyRunner.class);

    @Autowired
    private ProductRepository repo;

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Insert Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Display Products by Vendor Code");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    insertProduct(scanner);
                    break;
                case 2:
                    updateProduct(scanner);
                    break;
                case 3:
                    deleteProduct(scanner);
                    break;
                case 4:
                    displayProducts(scanner);
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
        scanner.close();
    }

    private void insertProduct(Scanner scanner) {
        System.out.println("\nEnter Product ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.println("Enter Brand Name: ");
        String brand = scanner.nextLine();

        System.out.println("Enter Model Name: ");
        String model = scanner.nextLine();

        System.out.println("Enter Price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        repo.save(new Product(id, brand, model, price));
        LOGGER.info("Product inserted: {} - {} - {}", brand, model, price);
        System.out.println("Product inserted successfully!");
    }

    private void updateProduct(Scanner scanner) {
        System.out.println("\nEnter Product ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Optional<Product> optionalProduct = repo.findById(id);
        if (optionalProduct.isPresent()) {
            Product product = optionalProduct.get();

            System.out.println("Enter New Vendor Code (Current: " + product.getVendorCode() + "): ");
            String vendorCode = scanner.nextLine();
            System.out.println("Enter New Product Name (Current: " + product.getProdName() + "): ");
            String prodName = scanner.nextLine();
            System.out.println("Enter New Product Cost (Current: " + product.getProdCost() + "): ");
            Double prodCost = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            // Updating product details
            product.setVendorCode(vendorCode);
            product.setProdName(prodName);
            product.setProdCost(prodCost);
            repo.save(product); // Save updated product

            System.out.println("✅ Product updated successfully!");
        } else {
            System.out.println("❌ Product not found!");
        }
    }


    private void deleteProduct(Scanner scanner) {
        System.out.println("\nEnter Product ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline

        if (repo.existsById(id)) {
            repo.deleteById(id);
            LOGGER.info("Product with ID {} deleted.", id);
            System.out.println("Product deleted successfully!");
        } else {
            System.out.println("Product not found!");
        }
    }

    private void displayProducts(Scanner scanner) {
        System.out.println("\nEnter Vendor Code to search: ");
        String vendorCode = scanner.nextLine();

        List<myView> products = repo.findByVendorCode(vendorCode);
        if (products.isEmpty()) {
            System.out.println("No products found for Vendor Code: " + vendorCode);
        } else {
            System.out.println("\n========== Product List ==========");
            for (myView p : products) {
                System.out.println(p.getVendorCode() + ", " + p.getProdName() + ", " + p.getProdCost());
            }
        }
    }
}
