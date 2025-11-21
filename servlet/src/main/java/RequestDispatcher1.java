import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
/*
@WebServlet("/login2")


public class RequestDispatcher1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email=req.getParameter("email2");
        String pass=req.getParameter("password2");
        PrintWriter out= resp.getWriter();
        if(email.equals("email.com")&& pass.equals("1234")){
            //req.setAttribute("name_key","abhi");
            HttpSession session= req.getSession();
            session.setAttribute("name_key","abhi");
            RequestDispatcher rd = req.getRequestDispatcher("/index4.jsp");

            rd.include(req,resp);
        }
        else{
            resp.setContentType("text/html");
             out.println("error");
            RequestDispatcher rd = req.getRequestDispatcher("/index1.html");
            rd.include(req,resp);

        }

    }
}

 */
