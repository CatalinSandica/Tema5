package com.sandica.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sandica.db.DBConnection;
import com.sandica.model.Users;

@WebServlet("/UsersList")
public class UsersList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DBConnection con = new DBConnection();
   
    public UsersList() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Users> list = new ArrayList<Users>();
		try {
			list = con.getListFromDB("users");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.getSession().setAttribute("users", list);
		request.getRequestDispatcher("/users.jsp").forward(request, response);
	}


	

}
