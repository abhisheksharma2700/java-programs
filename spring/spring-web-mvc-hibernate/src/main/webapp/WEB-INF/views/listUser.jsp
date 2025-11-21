    <%@ page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8"%>
        <%@ page isELIgnored="false" %>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <!DOCTYPE html>
    <html>
    <head>
    <meta charset="UTF-8">
    <title>profile</title>
    </head>
    <body>
    <h3> Profile page </h3>

    <c:forEach var="user" items="${users}">
       <h4>Name: ${user.name}</h4>
       <h4>Email: ${user.email}</h4>
       <h4>Phone: ${user.phoneno}</h4>
       <h4> ${System.out.println("")}</h4>
    </c:forEach>





    </body>
    </html>