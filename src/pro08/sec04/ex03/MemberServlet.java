package pro08.sec04.ex03;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

@WebServlet(value = "/member4", name = "MemberServlet4")
public class MemberServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doHandle(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doHandle(request, response);
    }

    private void doHandle(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        MemberDAO dao = new MemberDAO();
        List membersList = dao.listMembers();
        request.setAttribute("membersList", membersList);
        RequestDispatcher dispatch = request.getRequestDispatcher("viewMembers");
        dispatch.forward(request, response);
        /*out.print("<html><body>");
        out.print("<table border=1><tr align='center' bgcolor='lightgreen'>");
        out.print("<td>아이디</td><td>비밀번호</td><td>이름</td><td>이메일</td><td>가입일</td><td>삭제</td></tr>");
        for (int i = 0; i < list.size(); i++) {
            MemberVO memberVO=(MemberVO) list.get(i);
            String id=memberVO.getId();
            String pwd = memberVO.getPwd();
            String name = memberVO.getName();
            String email =memberVO.getEmail();
            Date joinDate = memberVO.getJoinDate();
            out.print("<tr><td>" + id + "</td><td>"
                    + pwd + "</td><td>"
                    + name + "</td><td>"
                    + email + "</td><td>"
                    + joinDate + "</td><td>"
                    + "<a href='/webShop/member3?command=delMember&id="+id+"'> 삭제</a></td></tr>"
            );
        }
        out.print("</table></body></html>");
        out.print("<a href='/webShop/memberForm.html'>새 회원 등록하기</a>");*/
    }


}
