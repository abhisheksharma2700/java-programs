import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class Example1 extends HttpServlet {
   /*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException{
        PrintWriter out= response.getWriter();
        out.println("i am in doGet() method");
        System.out.println("i am in doGet() method");
    }

    */


    protected void service(HttpServletRequest request , HttpServletResponse response ) throws ServletException,IOException{
        PrintWriter out= response.getWriter();
        out.println("i am in service() method");
        System.out.println("i am in service method ");
    }
}




