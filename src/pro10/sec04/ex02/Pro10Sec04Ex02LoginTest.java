package pro10.sec04.ex02;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(value = "/Pro10Sec04Ex02LoginTest", name = "Pro10Sec04Ex02LoginTest")
public class Pro10Sec04Ex02LoginTest extends HttpServlet {
    ServletContext context = null;
    List user_list = new ArrayList();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        context = getServletContext();
        HttpSession session = request.getSession();
        String user_id = request.getParameter("user_id");
        String user_pw = request.getParameter("user_pw");

        Pro10Sec04Ex02LoginImpl loginUser = new Pro10Sec04Ex02LoginImpl(user_id, user_pw);
        if (session.isNew()) {
            session.setAttribute("loginUser", loginUser);
            user_list.add(user_id);
            context.setAttribute("user_list", user_list);
        }

        out.println("<html><body>");
        out.println("아이디는 : " + loginUser.total_user + "<br><br>");
        out.println("총 접속자수는 " + Pro10Sec04Ex02LoginImpl.total_user + "<br><br>");
        out.println("접속 아이디:<br>");
        List list = (ArrayList) context.getAttribute("user_list");
        for (int i = 0; i < list.size(); i++) {
            out.println(list.get(i) + "<br>");
        }
        out.println("<a href='Pro10Sec04Ex02LogoutTest?user_id=" + user_id + "'>로그아웃 </a>");
        out.println("</body></html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
