<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String url = "jdbc:mysql://localhost:3306/demo";
	String userName = "root";
	String password = "root";
	String query = "select * from Customer";

	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection = DriverManager.getConnection(url, userName, password);
	Statement statement = connection.createStatement();
	ResultSet resultSet = statement.executeQuery(query);

	while (resultSet.next())
		out.println(resultSet.getInt(1) + "  " + resultSet.getString(2) + "  " + resultSet.getString(3) + "  "
		+ resultSet.getString(4) + "  " + resultSet.getString(5) + "  " + resultSet.getString(6) + "  "
		+ resultSet.getString(7));
	statement.close();
	connection.close();
	%>
</body>
</html>