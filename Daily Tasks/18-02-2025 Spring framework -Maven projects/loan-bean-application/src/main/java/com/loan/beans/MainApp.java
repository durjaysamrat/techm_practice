package com.loan.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.loan.beans.Loan;
import com.loan.beans.HousingLoan;
import com.loan.beans.VehicleLoan;

@SuppressWarnings("unused")
public class MainApp {
    public static void main(String[] args) {
        // Load Spring configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the beans from the Spring container
        Loan loan = (Loan) context.getBean("loan");
        HousingLoan housingLoan = (HousingLoan) context.getBean("housingLoan");
        VehicleLoan vehicleLoan = (VehicleLoan) context.getBean("vehicleLoan");

        // Display loan details
        System.out.println("Basic Loan Info: " + loan);
        System.out.println("Housing Loan Info: " + housingLoan);
        System.out.println("Vehicle Loan Info: " + vehicleLoan);
    }
}
