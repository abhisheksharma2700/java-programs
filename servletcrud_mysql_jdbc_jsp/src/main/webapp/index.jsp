<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>User Management App</title>
</head>
<body>
    <h1>Welcome to User Management</h1>
    <p>This is a simple CRUD application using Servlet, JSP, and JDBC.</p>

    <h3>Navigation</h3>
    <ul>
       <%--
        <li><a href="userServlet1">View All Users</a></li>
        <li><a href="userDao1">Add New User</a></li>
        <!-- Show all users -->
                        <li><a href="/user_list">View All Users</a></li>

                        <!-- Go to new user form -->
                        <li><a href="/user_form">Add New User</a></li>
        --%>
                    <li><a href="<%= request.getContextPath() %>/users/list">View All Users</a></li>
                    <li><a href="<%= request.getContextPath() %>/users/new">Add New User</a></li>


    </ul>
</body>
</html>
