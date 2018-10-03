<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<%= "Emp ID  |  Emp Name   |  Mgr ID  |  Date  |  In time  |  Out Time  " %>
<c:forEach var="e" items="${e}">
					<tr>
					<td><c:out value="      ${e.emp_id}   |" /></td>
					<td><c:out value="       ${e.emp_name}  |" /></td>
					<td><c:out value="    ${e.mngr_id}   |" /></td>
					<td><c:out value="    ${e.date}   |" /></td>
					<td><c:out value="    ${e.in_time}   |" /></td>
					<td><c:out value="    ${e.out_time}" /></td>
					</tr>
				</c:forEach>
</table>
</body>
</html>