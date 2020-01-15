package pro06.sec03.ex03;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/login5", name = "LoginServlet5")
public class LoginServlet5 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=utf8");
        PrintWriter out = response.getWriter();
        String id = request.getParameter("user_id");
        String pwd = request.getParameter("user_pw");
        String address = request.getParameter("user_address");
        System.out.println("아이디: " + id);
        System.out.println("비밀번호: " + pwd);

        String data = "<html>";
        data += "<body>";
        data += "아이디: " + id;
        data += "비밀번호: " + pwd;
        data += "<br>";
        data += "주소: " + address;
        data += "</body>";
        data += "</html";
        out.print(data);
    }
}
