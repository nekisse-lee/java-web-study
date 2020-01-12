package pro08.sec01.ex02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/first1", name = "FirstServlet1")
public class FirstServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        PrintWriter out = response.getWriter();
        System.out.println("this.. first servlet. 3 secondsLater move second page Refresh ");
        out.print("<html><body>");
//        out.print("sendRedirect 를 이용한 redirect 실습..");
        out.print("/first 페이지 입니다. 3초 후 /second 페이지로 이동합니다..");
        out.print("</body></html>");
        response.addHeader("Refresh", "3; url=/second1");

//        response.sendRedirect("second");

    }
}
