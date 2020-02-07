package pro16.sec02.ex01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

@WebServlet(name = "Pro16MemberServlet",value = "/mem")
public class Pro16MemberServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doHandle(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doHandle(request, response);
    }

    private void doHandle(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter writer = response.getWriter();

        String id = request.getParameter("id");
        System.out.println("id = " + id);
        MemberDAO memberDAO = new MemberDAO();
        boolean overlappedID = memberDAO.overlappedID(id);

        if (overlappedID == true) {
            writer.println("not_usable");
        } else {
            writer.print("usable");
        }
    }
}
