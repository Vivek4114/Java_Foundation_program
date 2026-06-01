package com.nit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.ServletRequest;
//import jakarta.servlet.ServletConfig;
//import jakarta.servlet.ServletInfo;
import jakarta.servlet.ServletException;

public class MyServlet extends GenericServlet{
 
	public void service(ServletResponse resp, ServletRequest req) throws ServletException, IOException{
		
		System.out.println("Service Method is Executed");
		PrintWriter out = resp.getWriter();
		out.println("Service Method is Executed");	
	}
 
}