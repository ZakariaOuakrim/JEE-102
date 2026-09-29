<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Add New User</title>
</head>
<body>
    <h1>Add a New User</h1>
    
    <form action="users" method="post">
        <input type="hidden" name="action" value="insert" />
        <table cellpadding="5">
            <tr>
                <td>Username:</td>
                <td><input type="text" name="username" required /></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><input type="password" name="password" required /></td>
            </tr>
            <tr>
                <td colspan="2"><button type="submit">Save</button></td>
            </tr>
        </table>
    </form>
    <br>
    <a href="users?action=list">Cancel and Go Back</a>
</body>
</html>
