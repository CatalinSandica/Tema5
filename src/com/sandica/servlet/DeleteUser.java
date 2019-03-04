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
public class DeleteUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DBConnection con = new DBConnection();
   
    public DeleteUser() {
        super();
        
    }

	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("get method: WebappJSP/add");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userid = request.getParameter("id");
		
		try {
			con.deleteValuesFromDB("users", Integer.parseInt(userid));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		response.sendRedirect("/WebappJSP/users.jsp");
	}


	

}
