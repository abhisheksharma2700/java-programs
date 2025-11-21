<html>
<head>
<title>  </title>
</head>
<body>
<h1>welcome: <%= (String)session.getAttribute("name_key") %></h1>
    <%

        String myname = (String)request.getAttribute("name_key");
    %>

    <a href="home.jsp"> home </a> </br> </br>
    <a href="about.jsp"> about </a> </br> </br>
    <a href="logout"> Logout </a> </br> </br>

</body>
</html>
