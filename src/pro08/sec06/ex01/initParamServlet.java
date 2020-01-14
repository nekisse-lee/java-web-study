package pro08.sec06.ex01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {
        "/sInit",
        "/sInit2"
},
        name = "initParamServlet",
        initParams = {
        @WebInitParam(name ="email", value = "admin@test.com"),
        @WebInitParam(name ="tel", value = "010-1111-2222")
        })

public class initParamServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        String email = getInitParameter("email");
        String tel = getInitParameter("tel");
        out.print("<html><body>");
        out.print("<table><tr>");
        out.print("<td>email: </td><td>" + email + "</td></tr>");
        out.print("<tr><td>휴대전화: </td><td>" + tel + "</td>");
        out.print("</tr></table></body></html>");

    }


}
