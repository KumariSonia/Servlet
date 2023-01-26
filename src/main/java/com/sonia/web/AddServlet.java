package com.sonia.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i + j;

//		HttpSession session = req.getSession();
//		session.setAttribute("k", k); // sending data using session

		Cookie cookie = new Cookie("k", k + ""); // sending data using Cookie
		resp.addCookie(cookie);

		resp.sendRedirect("sq");

	}
}
