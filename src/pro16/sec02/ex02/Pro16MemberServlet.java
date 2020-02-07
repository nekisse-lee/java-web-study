package pro16.sec02.ex02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "Pro16Ex02MemberServlet", value = "/mem2")
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
        String result = null;

//        String id = request.getParameter("id");
//        System.out.println("id = " + id);
        MemberDAO memberDAO = new MemberDAO();

        List memberList = memberDAO.listMembers();

        //회원 정보를 XML 문자열로 만든다.
        result = "<main>";
        for (int i = 0; i < memberList.size(); i++) {
            MemberBean m = (MemberBean) memberList.get(i);
            String id = m.getId();
            String pwd = m.getPwd();
            String name = m.getName();
            result += "<member><id>" + id + "</id>" +
                    "<pwd>" + pwd + "</pwd>" +
                    "<name>" + name + "</name></member>";
        }

        result += "</main>";
        System.out.println(result);
        writer.println(result);


/*        result="<main><member>"+
                "<title><![CDATA[초보자를 위한 자바 프로그래밍]]></title>" +
                "<writer><![CDATA[인포북스 저 | 이병승]]></writer>" +
                "<image><![CDATA[http://localhost:8080/webShop/pro16/image/image1.jpg]]></image>"+
                "</member>"+
                "<book>"+
                "<title><![CDATA[모두의 파이썬]]></title>" +
                "<writer><![CDATA[길벗 저 | 이승찬]]></writer>" +
                "<image><![CDATA[http://localhost:8080/webShop/pro16/image/image2.jpg]]></image>"+
                "</book></main>";*/




        /*boolean overlappedID = memberDAO.overlappedID(id);

        if (overlappedID == true) {
            writer.println("not_usable");
        } else {
            writer.print("usable");
        }*/
    }
}
