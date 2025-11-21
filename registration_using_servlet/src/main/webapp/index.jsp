<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<form action="regform" method="post">

Name: <input type="text" name="name1"/> <br/> <br/>
Email: <input type="text" name="email1"/> <br/> <br/>
Password: <input type="password" name="pass1"/> <br/> <br/>
Gender: <input type="radio" name="gender1" value="Male" />Male <input type="radio" name="gender1" value="Female"/> Female <br/> <br/>
City: <select name="city1">
      <option> Select City </option>
      <option> Delhi </option>
      <option> mumbai </option>
      <option>jaipur </option>
      <option> banglore </option>

      </select> <br/> <br/>
      <input type="submit" value="Register" />
</form>


</body>
</html>
