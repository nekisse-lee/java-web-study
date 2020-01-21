package pro12.sec01.ex01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/Pro12Sec01SessionTest",name = "Pro12Sec01SessionTest")
public class Pro12Sec01SessionTest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        session.setAttribute("name", "이순신");

        out.println("<html><body>");
        out.println("<h1>세션에 이름을 바인딩 합니다.</h1>");
        out.println("<a href ='/webShop/pro12/pro12Session1.jsp'> 첫번째 페이지로 이동하기 </a>");
        out.println("</body></html>");

    }
}
