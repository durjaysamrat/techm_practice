//Task 3 : Delete the row from the table by using a delete query using Scanner class.
package org.anurag.db;
import java.sql.*;
import java.util.Scanner;
public class db_task_3 {

	public static void main(String[] args) throws SQLException,Exception {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
 Class.forName("com.mysql.cj.jdbc.Driver");
 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/db?autoReconnect=true&useSSL=false","root","tiger");
 System.out.println("enter the id to delete");
 int a=sc.nextInt();
 PreparedStatement ps=con.prepareStatement("delete from employee where empId=?");
 ps.setInt(1, a);
 ps.executeUpdate();
 System.out.println("Delete Successfull");
	}

}
