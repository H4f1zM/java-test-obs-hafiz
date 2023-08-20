package com.test.java.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidateLogin
 */
@WebServlet("/ValidateLogin")
public class ValidateLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
    /**
     * Default constructor. 
     */
    public ValidateLogin() {
        // TODO Auto-generated constructor stub
    }

    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().append(" \n UserName : ").append(request.getParameter("username"));
		response.getWriter().append("\n Password : ").append(request.getParameter("password"));
	}

	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		// Validate User
		boolean result = validateUserLogin(request.getParameter("username"), request.getParameter("password") ) ;
		
		
		// if valid
		if(result) {

			//response.sendRedirect(request.getContextPath() + "/welcome" ) ;
			response.sendRedirect(request.getContextPath() + "/welcome?username=" + request.getParameter("username") ) ;
		}
		else {  // go back to login page
			String message1 = " Invalid Username or Password " ;
			
			response.sendRedirect(request.getContextPath() + "/index.jsp?message=" + message1);
		}
		
		
		doGet(request, response);
	}
	
	
	//function check username & password
	protected boolean validateUserLogin(String name, String password ) {
		
		if ( name.equals("admin") && password.equals("tiger") ) {
			return true ;
		}else {
			return false ;
		}
	}
	
	
	
	

}
