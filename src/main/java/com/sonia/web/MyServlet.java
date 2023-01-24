package com.sonia.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ServletConfig config = getServletConfig();
		String name = config.getInitParameter("name");
		String phone = config.getInitParameter("phone");

		PrintWriter out = resp.getWriter();

		out.println("Hi " + name);
		out.println("phone have " + phone);

	}

}
