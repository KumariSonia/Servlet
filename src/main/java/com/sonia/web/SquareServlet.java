package com.sonia.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int k = Integer.parseInt(req.getParameter("k"));
		k = k * k;
		PrintWriter out = resp.getWriter();
		out.print("Square of given number = " + k);
	}
}
