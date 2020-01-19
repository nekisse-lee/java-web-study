package pro10.sec03.ex01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/pro10Sec03Login",name = "Pro10Sec03LoginServlet")
public class Pro10Sec03LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();

        String user_name = request.getParameter("user_name");
        String user_pw = request.getParameter("user_pw");

        out.println("<html><body>");
        out.println("이름은 " + user_name + "<br>");
        out.println("비밀번호는 " + user_pw + "<br>");
        out.println("</body></html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
