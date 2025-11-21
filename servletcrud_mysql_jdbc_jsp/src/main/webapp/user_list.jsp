<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="com.crud.user.User" %>
<html>
<head>
    <title>User List</title>
</head>
<body>
<h2>User List</h2>
<a href="new">Add New User</a>
<br><br>
<table border="1" cellpadding="5">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Actions</th>
    </tr>
    <%

        List<User> listUser = (List<User>) request.getAttribute("listUser");
        if (listUser != null) {
            for (User user : listUser) {
    %>
    <tr>
        <td><%= user.getId() %></td>
        <td><%= user.getName() %></td>
        <td><%= user.getEmail() %></td>
        <td>
            <a href="edit?id=<%= user.getId() %>">Edit</a> |
            <a href="delete?id=<%= user.getId() %>" onclick="return confirm('Are you sure?')">Delete</a>
        </td>
    </tr>
    <%      }
        }
    %>
</table>
</body>
</html>
