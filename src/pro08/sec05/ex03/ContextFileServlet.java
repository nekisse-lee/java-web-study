package pro08.sec05.ex03;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.StringTokenizer;

@WebServlet(value = "/cfile",name = "ContextFileServlet")
public class ContextFileServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");


        PrintWriter out = response.getWriter();
        ServletContext context = getServletContext();

        InputStream is = context.getResourceAsStream("/WEB-INF/bin/init.txt");

        BufferedReader buffer = new BufferedReader(new InputStreamReader(is));

        String menu = null;
        String menu_member = null;
        String menu_order = null;
        String menu_goods = null;

        while ((menu = buffer.readLine()) != null) {
            StringTokenizer tokens = new StringTokenizer(menu, ",");
            menu_member = tokens.nextToken();
            menu_order = tokens.nextToken();
            menu_goods = tokens.nextToken();
        }

        out.print("<html>" +

                "<body>");
        out.print(menu_member + "<br>");
        out.print(menu_order + "<br>");
        out.print(menu_goods + "<br>");
        out.print("<body></html>");
        out.close();


    }
}
