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

@WebServlet(value = "/Pro10Sec04Ex02LogoutTest", name = "Pro10Sec04Ex02LogoutTest")

public class Pro10Sec04Ex02LogoutTest extends HttpServlet {
    ServletContext context;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doHandle(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doHandle(request, response);
    }

    private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        context = getServletContext();
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        String user_id = request.getParameter("user_id");

        session.invalidate();

        List user_list = (ArrayList) context.getAttribute("user_list");
        user_list.remove(user_id);
        context.removeAttribute("user_list");
        context.setAttribute("user_list", user_list);
        out.println("<br>로그아웃 했습니다.");
    }

}
