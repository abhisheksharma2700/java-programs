<html>
<head>
<title>  </title>
</head>
<body>
<h1>welcome: <%= (String)session.getAttribute("name_key") %></h1>
    <%

        String myname = (String)session.getAttribute("name_key");
    %>
    <h4>welcome: <%= myname %></h4>

</body>
</html>
