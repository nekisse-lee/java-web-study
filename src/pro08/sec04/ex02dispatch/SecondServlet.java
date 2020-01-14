package pro08.sec04.ex02dispatch;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/second55", name = "SecondServlet55")
public class SecondServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
//        String address2 = request.getParameter("address");
        Object address = request.getAttribute("address");
        out.print("<html><body>");
        out.print("주소 : " + address );
        out.print("<br>");
        out.print("dispatcher를 이용한 바인딩 실습 ");
        out.print("</body></html>");
    }
}
