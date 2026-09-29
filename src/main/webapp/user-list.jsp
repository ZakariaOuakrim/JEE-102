<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>User List</title>
</head>
<body>
    <h1>Registered Users</h1>
    
    <a href="users?action=new"><button>Add New User</button></a>
    <br><br>
    
    <table border="1" cellpadding="10" cellspacing="0">
        <tr style="background-color: #f2f2f2;">
            <th>ID</th>
            <th>Username</th>
            <th>Password</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="user" items="${users}">
            <tr>
                <td>${user.id}</td>
                <td>${user.username}</td>
                <td>${user.password}</td>
                <td>
                    <a href="users?action=confirmDelete&id=${user.id}"><button>Delete</button></a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <a href="debut.jsp">Back to Start</a>
</body>
</html>
