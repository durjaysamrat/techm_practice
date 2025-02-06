//Task 2 : Update the row of a table dynamically using Scanner class.

package org.anurag.db;
import java.sql.*;
import java.util.Scanner;
public class db_task_2 {

	public static void main(String[] args) throws Exception,SQLException{
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/db?autoReconnect=true&useSSL=false","root","tiger");
System.out.println("enter empid to edit");
int a=sc.nextInt();
System.out.println("enter empname to edit");
String name=sc.next();
PreparedStatement pt=con.prepareStatement("update employee set empName=? where empId=?");
pt.setString(1,name);
pt.setInt(2, a);
int v= pt.executeUpdate();
System.out.println("done updating");
		con.close();
		pt.close();
	}

}
