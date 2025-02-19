package com.inventory.beans;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.inventory.beans.Inventory;

@SuppressWarnings("unused")
public class MainApp {
    public static void main(String[] args) {
        // Load Spring configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the bean from the Spring container
        Inventory inventory = (Inventory) context.getBean("inventory");

        // Display Inventory details
        System.out.println(inventory);
    }
}