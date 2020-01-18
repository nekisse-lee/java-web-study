package pro10.sec01.ex01;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/pro10Set",name = "pro10SetAttribute")
public class SetAttribute extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();

        String ctxMsg = "context에 바인딩 됩니다.";
        String sesMsg = "session에 바인딩 됩니다.";
        String reqMsg = "request에 바인딩 됩니다.";


        ServletContext ctx = getServletContext();
        HttpSession session = request.getSession();
        ctx.setAttribute("context", ctxMsg);
        session.setAttribute("session", sesMsg);
        request.setAttribute("request", reqMsg);
        RequestDispatcher dispatcher = request.getRequestDispatcher("pro10Get");
        dispatcher.forward(request,response);

        out.println("바인딩을 수행합니다.");
    }
}
