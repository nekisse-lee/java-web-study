package pro06.sec01.ex01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/firsttt")
public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet 메서드 호출");
    }

    @Override
    public void destroy() {
        System.out.println("destroy 메서드 호출");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("init 메서드 호출");
    }
}
