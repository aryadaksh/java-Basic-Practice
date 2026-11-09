package com.ordermgmt.samplejdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OrderMgmt {
	
	public void  createDetails() throws ClassNotFoundException, SQLException {
		//dynamic class loading 
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost_q1", null, null);
	}

}
