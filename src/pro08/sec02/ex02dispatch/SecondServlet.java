package pro08.sec02.ex02dispatch;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/second33", name = "SecondServlet33")
public class SecondServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        out.print("<html><body>");
        out.print("이름 : " + name );
        out.print("<br>");
        out.print("dispatch를 이용한 포워딩 실습 ");
        out.print("</body></html>");

    }
}
