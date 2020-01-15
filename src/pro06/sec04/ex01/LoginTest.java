package pro06.sec04.ex01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/loginTest",name = "LoginTest")
public class LoginTest extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset = utf-8");
        PrintWriter out = response.getWriter();
        String id = request.getParameter("user_id");
        String pw = request.getParameter("user_pw");

        System.out.println("아이디 : " + id);
        System.out.println("비밀번호 : " + pw);

        if (id != null && (id.length() != 0)) {//아이디를 정상적으로 입력 시
            if (id.equals("admin")) {
                out.print("<html>");
                out.print("<body>");
                out.print("<font size='12'> 관리자로 로그인 했습니다</font>");
                out.print("<br>");
                out.print("<input type = 'button' value='회원 정보 수정하기' />");
                out.print("<input type = 'button' value='회원 삭제 수정하기' />");
                out.print("</body>");
                out.print("</html>");
            } else {
            out.print("<html>");
            out.print("<body>");
            out.print(id + "님 로그인 하셨습니다.");
            out.print("</body>");
            out.print("</html>");
            }
        } else {
            out.print("<html>");
            out.print("<body>");
            out.print("아이디를 입력하세요");
            out.print("<br>");
            out.print("<a href= 'http://localhost:8080/webShop/test01/login.html'>로그인창으로 이동</a>");
            out.print("</body>");
            out.print("</html>");
        }
    }
}
