<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- jstl print example -->

	<%-- <c:out value="${name}"></c:out> --%>

	<!-- jstl import url example -->

	<%-- <c:import url="https://www.javatpoint.com"></c:import> --%>


	<!-- jstl forEach loop example -->

	<%-- <c:forEach items="${customers}" var="customer">
	${customer.contactName}
	</c:forEach> --%>


	<!-- jstl sql tags example -->

	<%-- 	<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/demo" user="root" password="root" />
	<sql:query var="rs" dataSource="${db}"> select * from Customer;</sql:query>

	<c:forEach items="${rs.rows}" var="customer">

		<c:out value="${customer.contactName}"></c:out>
		<br>

	</c:forEach> --%>

	<!-- jstl functions example -->

	<c:set var="str" value="Sonia Singh is Software Developer"></c:set>
	<%-- Length : ${fn:length(str)} --%>
	<%-- <c:forEach items=" ${fn:split(str,'S')}" var="s">
		<br>
       ${s}
</c:forEach> --%>

	<%-- 	index: ${fn:indexOf(str,"is")} --%>

	<%-- 	${fn:contains(str, "jsp")} --%>
	<%-- <c:if test="${fn:contains(str, 'is')}">
jsp is there

</c:if> --%>

	<c:if test="${fn: endsWith(str,'Developer')}">
     you are right
    </c:if>


</body>
</html>