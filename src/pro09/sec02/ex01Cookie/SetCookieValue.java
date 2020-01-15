package pro09.sec02.ex01Cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.Date;

@WebServlet(value = "/set",name = "SetCookieValue")
public class SetCookieValue extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
        Date date = new Date();
        Cookie c = new Cookie("cookieTest", URLEncoder.encode("JSP 프로그래밍입니다.", "utf-8"));
//        c.setMaxAge(24 * 60 * 60);//24시간을 유효시간으로 지정
        c.setMaxAge(-1);

        response.addCookie(c);

        out.print("현재시간 : " + date);
        out.print("<br 문자열을 Cookie에 저장합니다.");
    }
}
