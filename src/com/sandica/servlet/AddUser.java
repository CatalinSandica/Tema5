package com.sandica.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sandica.db.DBConnection;

@WebServlet("/AddUser")
public class AddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DBConnection con = new DBConnection();
	
    public AddUser() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("get method: WebappJSP/add");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("uname");
		String pass = request.getParameter("upass");
		
		try {
			con.insertValuesInDB(user, pass, "users");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//setting the values for session	
		request.getSession().setAttribute("username", user);
		request.getSession().setAttribute("password", pass);
		response.sendRedirect("/WebappJSP/welcome.jsp");
	}

}
