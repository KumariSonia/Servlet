package com.sonia.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ServletContext context = req.getServletContext();
		String name = context.getInitParameter("name");
		String phone = context.getInitParameter("phone");

		PrintWriter out = resp.getWriter();

		out.println("Hi " + name);
		out.println("phone have " + phone);

	}

}
