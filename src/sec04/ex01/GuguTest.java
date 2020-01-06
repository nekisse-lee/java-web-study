package sec04.ex01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/guguTest", name = "GuguTest")
public class GuguTest extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
        int dan = Integer.parseInt(request.getParameter("dan"));
        out.print("<table border='1' with='800' align='center' >");
        out.print("<tr align='center' bgcolor='FFFF66' > ");
        out.print("<td colspan='4'>" + dan + "단 출력 </td>");
        out.print("</tr> ");

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                out.print("<tr align ='center' bgcolor='#ACFA58'> ");

            } else {
                out.print("<tr align ='center' bgcolor='#81BEF7'> ");
            }
            out.print("<td width='200'>");
            out.print("<input type='radio' />" + i);
            out.print("</td>");
            out.print("<td width='200'>");
            out.print("<input type='checkbox' />" + i);
            out.print("</td>");
            out.print("<td width='400'>");
            out.print(dan + " * " + i);
            out.print("</td>");
            out.print("<td width='400'>");
            out.print(i * dan);
            out.print("</td></tr>");
        }

        out.print("</table>");

    }
}
