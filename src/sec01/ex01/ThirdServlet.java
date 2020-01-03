package sec01.ex01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/third")
public class ThirdServlet extends HttpServlet {

    public void init() throws ServletException {
        System.out.println("ThirdServlet init 메서드 호출");
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("ThirdServlet doGet 메서드 호출");
    }


    public void destroy() {
        System.out.println("ThirdServlet destroy 메서드 호출");
    }
}
