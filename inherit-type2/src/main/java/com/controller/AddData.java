package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.ContractEmployee;
import com.model.Employee;
import com.model.EmployeeManager;
import com.model.RegularEmployee;

import javax.servlet.RequestDispatcher;

@WebServlet("/AddData")
public class AddData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String ack = "";
		try
		{
			int id = Integer.parseInt(request.getParameter("id"));
			String name = request.getParameter("name");
			
			int rid = Integer.parseInt(request.getParameter("rid"));
			String rname = request.getParameter("rname");
			double salary = Double.parseDouble(request.getParameter("salary"));
			int bonus = Integer.parseInt(request.getParameter("bonus"));
			
			int cid = Integer.parseInt(request.getParameter("cid"));
			String cname = request.getParameter("cname");
			double payperhour = Double.parseDouble(request.getParameter("payperhour"));
			String duration = request.getParameter("duration");
			
			Employee E = new Employee();
			E.setId(id);
			E.setName(name);
			
			RegularEmployee R = new RegularEmployee();
			R.setId(rid);
			R.setName(rname);
			R.setSalary(salary);
			R.setBonus(bonus);
			
			ContractEmployee C = new ContractEmployee();
			C.setId(cid);
			C.setName(cname);
			C.setPayperhour(payperhour);
			C.setDuration(duration);
			
			EmployeeManager EM = new EmployeeManager();
			ack = EM.saveDate(E, R, C);
		}
		catch(Exception e)
		{
			ack = e.getMessage();
		}
		pw.println(ack);
		RequestDispatcher RD = request.getRequestDispatcher("index.jsp");
		RD.include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
