package pro09.sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(value = "/pro09Login5", name = "SessionTest5")
public class SessionTest5 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doHandle(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doHandle(request, response);
    }

    private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        String user_id = request.getParameter("user_id");
        String user_pw = request.getParameter("user_pw");
        if (session.isNew()) {
            if (user_id != null) {
                session.setAttribute("user_id", user_id);
                String url = response.encodeURL("pro09Login5");
                out.println("<a href=" + url + ">로그인 상태 확인</a>");
                System.out.println("url = " + url);
            } else {
                out.print("<a href='pro09Login2.html'>다시 로그인 하세요!!</a>");
                session.invalidate();
            }
        } else {
            user_id = (String) session.getAttribute("user_id");
            if (user_id != null && user_id.length() != 0) {
                out.print("안녕하세요 " + user_id + "님!!!");
            } else {
                out.print("<a href='login2.html'>다시 로그인 하세요!!</a>");
                session.invalidate();
            }
        }
    }
}

