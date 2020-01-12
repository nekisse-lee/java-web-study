package pro08.sec01.ex03;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/first2", name = "FirstServlet2")
public class FirstServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        PrintWriter out = response.getWriter();
        System.out.println("this.. first servlet. 3 secondsLater move second page Refresh ");
//        out.print("sendRedirect 를 이용한 redirect 실습..");

        out.print("<script type = 'text/javascript' >");
        out.print("location.href = 'second2'; ");
        out.print("</script>");



//        response.sendRedirect("second");

    }
}
