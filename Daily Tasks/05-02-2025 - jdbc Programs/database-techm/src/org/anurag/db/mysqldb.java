package org.anurag.db;
import java.sql.*;
public class mysqldb {

	public static void main(String[] args) throws SQLException,Exception {
		// TODO Auto-generated method stub
   Class.forName("com.mysql.cj.jdbc.Driver");
   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/db?autoReconnect=true&useSSL=false","root","tiger");
	Statement stmt= con.createStatement();
     ResultSet rs = stmt.executeQuery("select * from employees");
	
	while(rs.next()) {
		System.out.println(rs.getString(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getInt(3));
	}
	
	rs.close();
	stmt.close();
	con.close();
	}

}
