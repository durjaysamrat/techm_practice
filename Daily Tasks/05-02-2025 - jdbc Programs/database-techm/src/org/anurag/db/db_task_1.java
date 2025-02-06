//Task 1 : Recursively insert multiple row/s into the table.
//	 Hint :: Use PreparedStatement
package org.anurag.db;
import java.sql.*;
import java.util.Scanner;

public class db_task_1 {

	public static void main(String[] args) throws Exception,SQLException {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  Class.forName("com.mysql.cj.jdbc.Driver");
  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/db?autoReconnect=true&useSSL=false","root","tiger");
  System.out.println("Enter the number of rows you want");
  int n=sc.nextInt();
  for(int i=0;i<n;i++) {
	System.out.println("Enter the Employee Id");
	int empId;
	empId=sc.nextInt();
	
	System.out.println("Enter the Employee Name");
	String empName;
	empName=sc.next();
	
	System.out.println("Enter the Employee Salary");
	int empSal;
	empSal = sc.nextInt();
	
	PreparedStatement pst=con.prepareStatement("insert into employee values(?,?,?)");
	pst.setInt(1, empId);
	pst.setString(2, empName);
	pst.setInt(3, empSal);
	
	int v=pst.executeUpdate();
	System.out.println("Row"+i+"inserted");
  }
  System.out.println(n+"Inserts Completed ");
	con.close();
	
	
  
	}

}
