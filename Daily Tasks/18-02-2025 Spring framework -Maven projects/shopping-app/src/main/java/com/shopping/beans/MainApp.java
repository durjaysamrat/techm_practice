package com.shopping.beans;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.shopping.beans.Shopping;

@SuppressWarnings("unused")
public class MainApp {
    public static void main(String[] args) {
        // Load Spring configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the bean from the Spring container
        Shopping inventory = (Shopping) context.getBean("inventory");

        // Display Inventory details
        System.out.println(inventory);
    }
}