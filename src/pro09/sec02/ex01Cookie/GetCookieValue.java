package pro09.sec02.ex01Cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

@WebServlet(value = "/get",name = "GetCookieValue")
public class GetCookieValue extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();

        Cookie[] allValues  = request.getCookies();
        for (int i = 0; i < allValues.length; i++) {
            if (allValues[i].getName().equals("cookieTest")) {
                out.println("<h2> Cookie 값 가져오기 : " + URLDecoder.decode(allValues[i].getValue(), "utf-8"));

            }
        }
    }
}
