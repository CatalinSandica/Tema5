package com.sandica.test;

import com.sandica.db.DBConnection;

public class TestUsers {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DBConnection con = new DBConnection();
		
		try {
			con.getValuesFromDB("users");;
			
		}
		catch (Exception e) {
			throw e;
		}
	}

}
