<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.crud.user.User" %>


<html>
<head>
    <title>User Form</title>
    <style>
        label { display: block; margin-top: 10px; }
        input[type=text], input[type=email] { width: 300px; padding: 5px; }
        input[type=submit] { margin-top: 15px; padding: 5px 10px; }
        a { text-decoration: none; color: blue; }
    </style>
</head>
<body>
<%
    User user = (User) request.getAttribute("user");
    boolean isEdit = (user != null);
%>
<h2><%= isEdit ? "Edit User" : "Add New User" %></h2>
<form action="<%= isEdit ? "update" : "insert" %>" method="post">
    <% if (isEdit) { %>
        <input type="hidden" name="id" value="<%= user.getId() %>"/>
    <% } %>

    <label>Name:</label>
    <input type="text" name="name" value="<%= isEdit ? user.getName() : "" %>" required/>

    <label>Email:</label>
    <input type="email" name="email" value="<%= isEdit ? user.getEmail() : "" %>" required/>

    <br>
    <input type="submit" value="<%= isEdit ? "Update" : "Add" %>"/>
</form>
<br>
<a href="list">Back to User List</a>
</body>
</html>
