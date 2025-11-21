
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
//@WebServlet("/logout")
/*

public class MyListner implements HttpSessionListener {
    ServletContext sc= null;
    static int total_users=0;
    static int current_users=0;

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        total_users++;
        current_users++;
        sc= se.getSession().getServletContext();
        sc.setAttribute("totalusers",total_users);
        sc.setAttribute("currentuser",current_users);


    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        current_users--;
        sc.setAttribute("currentuser",current_users);
    }
}

 */
