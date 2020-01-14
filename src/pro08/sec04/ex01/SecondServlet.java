package pro08.sec04.ex01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/second44", name = "SecondServlet44")
public class SecondServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
        String address = request.getParameter("address");
        out.print("<html><body>");
        out.print("주소 : " + address );
        out.print("<br>");
//        out.print("dispatch를 이용한 포워딩 실습 ");
        out.print("redirect 이용한 바인딩 실습 ");
        out.print("</body></html>");
    }
}
