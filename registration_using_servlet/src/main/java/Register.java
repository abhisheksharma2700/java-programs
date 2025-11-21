import  javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;


@WebServlet("/regform")
public class Register  extends HttpServlet {
    private String url="jdbc:mysql://localhost:3306/registration";
    private String username="root";
    private String password="Abhishek2700@";
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
       String myname= req.getParameter("name1");
       String myemail= req.getParameter("email1");
       String mypass=req.getParameter("pass1");
       String mygender=req.getParameter("gender1");
       String mycity=req.getParameter("city1");



       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection connection= DriverManager.getConnection(url,username,password);

           PreparedStatement preparedStatement= connection.prepareStatement("insert register values(?,?,?,?,?)");
           preparedStatement.setString(1,myname);
           preparedStatement.setString(2,myemail);
           preparedStatement.setString(3,mypass);
           preparedStatement.setString(4,mygender);
           preparedStatement.setString(5,mycity);

           int count =preparedStatement.executeUpdate();
           if(count>0){
               resp.setContentType("text/html");
               out.print("<h3 style='color:green'> User registered successfully</h3>");

               RequestDispatcher requestDispather= req.getRequestDispatcher("/index.jsp");
               requestDispather.include(req,resp);
           }else {
               resp.setContentType("text/html");
               out.print("<h3 style='color:red'> User not registerd</h3>");
           }
       } catch (ClassNotFoundException e) {
           resp.setContentType("text/html");
           out.print("<h3 style='color:red'> Exception occured : "+e.getMessage()+"</h3>");

       } catch (SQLException e) {
           resp.setContentType("text/html");
           out.print("<h3 style='color:blue'> Exception occured : "+e.getMessage()+"</h3>");

       }

    }

}
