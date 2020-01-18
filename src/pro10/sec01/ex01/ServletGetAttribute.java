package pro10.sec01.ex01;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/pro10Get", name = "pro10GetAttribute")
public class ServletGetAttribute extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
        ServletContext ctx = getServletContext();
        HttpSession sess = request.getSession();

        String ctxMsg = (String) ctx.getAttribute("context");
        String sesMsg = (String) sess.getAttribute("session");
        Object reqMsg =  request.getAttribute("request");


        out.print("context값 : " + ctxMsg + "<br>");
        out.print("session값 : " + sesMsg + "<br>");

        out.print("request값 : " + reqMsg + "<br>");
        System.out.println("reqMsg = " + reqMsg);
    }
}
