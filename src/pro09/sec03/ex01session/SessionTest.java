package pro09.sec03.ex01session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(value = "/pro09Sess",name = "SessionTest")
public class SessionTest extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession(); //세션이 있으면 리턴, 없으면 새로 생성.
        out.println("세션 아이디 : " + session.getId() + "<br>");
        out.println("최초 세션 생성 시각 : " + new Date(session.getCreationTime()) + "<br>");
        out.println("최근 세션 접근 시각 : " + new Date(session.getLastAccessedTime()) + "<br>");
        out.println("세션 유효 시간 : " + session.getMaxInactiveInterval() + "<br>");//세션 유효시간 디폴트 30분

        if (session.isNew()) {
            out.print("새 세션이 만들어졌습니다.");
        }
    }

}
