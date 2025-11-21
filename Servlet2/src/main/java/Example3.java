import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/sumbitForm")

public class Example3 extends HttpServlet  {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String myname=request.getParameter("name1");
        String myemail=request.getParameter("email1");
        System.out.println("name: "+myname);
        System.out.println("email: "+myemail);

        PrintWriter out= response.getWriter();
        out.println("my name: "+myname);
        out.println("my email: "+myemail);

    }
}
