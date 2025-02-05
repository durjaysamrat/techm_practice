/*
 * Task 4 : Create a menu driven program where the options would be
			1. Insert a new Row 
			2. Update a Row
			3. Delete a Row
			4. Select the row
			5. Exit
 */
package org.anurag.db;
import java.util.Scanner;
import java.sql.*;
public class db_task_4 {

	public static void main(String[] args) throws SQLException, Exception{
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in); 
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/db?autoReconnect=true&useSSL=false","root","tiger");	
    int i=0;
	do {
    	System.out.println("			1.Insert New Row\r\n"
                +"			2. Update a Row\r\n"
    			+ "			3. Delete a Row\r\n"
    			+ "			4. Select the row\r\n"
    			+ "			5. Exit");
    	System.out.println("Enter your option");
    	i=sc.nextInt();
    	switch(i)
    	{
    	//insert row
    	case 1: System.out.println("Enter the Employee Id");
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
    	System.out.println("Rowinserted");
    	break;
    	
    	//update row
    	case 2:System.out.println("enter empid to edit");
    	int a=sc.nextInt();
    	System.out.println("enter empname to edit");
    	String name=sc.next();
    	PreparedStatement pt=con.prepareStatement("update employee set empName=? where empId=?");
    	pt.setString(1,name);
    	pt.setInt(2, a);
    	int p= pt.executeUpdate();
    	System.out.println("done updating");
    	break;
    	
    	//Delete a row
    	case 3: System.out.println("enter the id to delete");
    	 int  b=sc.nextInt();
    	 PreparedStatement ps=con.prepareStatement("delete from employee where empId=?");
    	 ps.setInt(1, b);
    	 ps.executeUpdate();
    	 System.out.println("Delete Successfull");
    	 break;
    	 
    	 //select a row
    	case 4:	Statement stmt= con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from employee");
    	
    	while(rs.next()) {
    		System.out.println(rs.getInt(1));
    		System.out.println(rs.getString(2));
    		System.out.println(rs.getInt(3));
    	}
    	break;
    
    	}
    }while(i!=5);
}}
