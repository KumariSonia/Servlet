package com.sonia.web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jstlDemo")
public class JstlDemo extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Customer> customers = new ArrayList<Customer>();
		String url = "jdbc:mysql://localhost:3306/demo";
		String userName = "root";
		String password = "root";
		String query = "select * from Customer";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(url, userName, password);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);

			while (resultSet.next()) {
				Customer customer = new Customer();
				customer.setCustomerID(resultSet.getInt(1));
				customer.setAddress(resultSet.getString(2));
				customer.setCity(resultSet.getString(3));

				customer.setContactName(resultSet.getString(4));
				customer.setCountry(resultSet.getString(5));
				customer.setCustomerName(resultSet.getString(6));
				customer.setPostalCode(resultSet.getString(7));
				customers.add(customer);
			}

			statement.close();
			connection.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		req.setAttribute("name", "Sonia");
		req.setAttribute("customers", customers);
		RequestDispatcher rd = req.getRequestDispatcher("jstlDemo.jsp");
		rd.forward(req, resp);
	}

}
