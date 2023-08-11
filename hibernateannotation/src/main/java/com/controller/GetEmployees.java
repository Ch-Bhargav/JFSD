package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Employee;
import com.model.EmployeeManager;

@WebServlet("/GetEmployees")
public class GetEmployees extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GetEmployees() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		try
		{
			EmployeeManager EM = new EmployeeManager();
			List<Employee> list = EM.getData();
			request.setAttribute("elist", list);
		}
		catch(Exception e)
		{
			pw.println(e.getMessage());
		}
		RequestDispatcher RD = request.getRequestDispatcher("viewdata.jsp");
		RD.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
