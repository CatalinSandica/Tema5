package com.sandica.servlet;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sandica.db.DBConnection;
import com.sandica.model.Users;


@WebServlet("/SearchUser")
public class SearchUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DBConnection con = new DBConnection();
	
    public SearchUser() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid = request.getParameter("id");
		String username = null;
		String password = null;
		List <Users> list = new ArrayList<Users>();
		try {
			list = con.getListFromDBByID("users", Integer.parseInt(userid));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Users value: list) {
			username = value.getName();
			password = value.getPassword();
		}			
		System.out.println("Username "+ username + "password " + password);
						request.getSession().setAttribute("username", username);
						request.getSession().setAttribute("password", password);
						request.getSession().setAttribute("userid", userid);
						response.sendRedirect("/WebappJSP/delete.jsp");
						
				
				
		}
		
		
	

}

