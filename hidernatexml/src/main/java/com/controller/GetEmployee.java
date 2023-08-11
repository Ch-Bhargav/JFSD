package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.model.*;
import java.util.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.EmployeeManager;

/**
 * Servlet implementation class GetEmployee
 */
@SuppressWarnings("unused")
@WebServlet("/GetEmployee")
public class GetEmployee extends HttpServlet {
  private static final long serialVersionUID = 1L;
       

    public GetEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }


  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter pw = response.getWriter();
    List<Employee> list = null;
    try{
      EmployeeManager EM = new EmployeeManager();
      list = EM.getData();
      request.setAttribute("elist", list);
      
    }catch(Exception e){
      pw.print(e.getMessage());
    }
    RequestDispatcher RD = request.getRequestDispatcher("index.jsp");
    RD.forward(request, response);
  }

  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // TODO Auto-generated method stub
    doGet(request, response);
  }

}