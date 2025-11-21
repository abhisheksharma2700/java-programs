    <%@ page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8"%>
        <%@ page isELIgnored="false" %>
    <!DOCTYPE html>
    <html>
    <head>
    <meta charset="UTF-8">
    <title>profile</title>
    </head>
    <body>
    <h3> Profile page </h3>

    <h3> welcome ${model_user.getName()} </h3>
    <h4>Name: ${model_user.getName()}</h4>
    <h4>Email Id: ${model_user.getEmail()}</h4>
    <h4>Phone No: ${model_user.getPhoneno()}</h4>




    </body>
    </html>