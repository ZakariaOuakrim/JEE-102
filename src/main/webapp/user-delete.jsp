<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Confirm Delete</title>
</head>
<body>
    <h1>Confirm Deletion</h1>
    <p>Are you sure you want to delete user: <strong>${user.username}</strong>?</p>
    
    <form action="users" method="post" style="display:inline;">
        <input type="hidden" name="action" value="delete" />
        <input type="hidden" name="id" value="${user.id}" />
        <button type="submit" style="color: red;">Yes, Delete!</button>
    </form>
    
    <a href="users?action=list"><button>Cancel</button></a>
</body>
</html>
