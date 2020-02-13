package pro17Model2.sec02.ex02;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "MemberController3", value = "/pro17Member/*")
public class MemberController3 extends HttpServlet {
    MemberDAO memberDAO;

    @Override
    public void init(ServletConfig config) throws ServletException {
        memberDAO = new MemberDAO();

    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doHandle(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doHandle(request, response);
    }

    private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nextPage = null;
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String action = request.getPathInfo();
        System.out.println("action:" + action);
        if (action == null || action.equals("/listMembers.do")) {
            List<MemberVO> membersList = memberDAO.listMembers();
            request.setAttribute("membersList", membersList);
            nextPage = "/pro17/test03/listMembers.jsp";
        } else if (action.equals("/addMember.do")) {
            String id = request.getParameter("id");
            String pwd = request.getParameter("pwd");
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            MemberVO memberVO = new MemberVO(id, pwd, name, email);
            memberDAO.addMember(memberVO);
            request.setAttribute("msg", "addMember");
            nextPage = "/pro17Member/listMembers.do";
        } else if (action.equals("/memberForm.do")) {
            nextPage = "/pro17/test03/memberForm.jsp";
        } else if (action.equals("/modMemberForm.do")) {
            String id = request.getParameter("id");
            MemberVO memInfo = memberDAO.findMember(id);
            request.setAttribute("memInfo", memInfo);
            nextPage = "/pro17/test03/modMemberForm.jsp";

        } else if (action.equals("/modMember.do")) {
            String id = request.getParameter("id");
            String pwd = request.getParameter("pwd");
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            MemberVO memberVO = new MemberVO(id, pwd, name, email);
            memberDAO.modMember(memberVO);
            request.setAttribute("msg", "modified");
            nextPage = "/pro17Member/listMembers.do";
        } else if (action.equals("/delMember.do")) {
            String id = request.getParameter("id");
            memberDAO.delMember(id);
            request.setAttribute("msg", "deleted");
            nextPage = "/pro17Member/listMembers.do";
        } else {
            List<MemberVO> membersList = memberDAO.listMembers();
            request.setAttribute("membersList", membersList);
            nextPage = "/pro17/test03/listMembers.jsp";
        }
        RequestDispatcher dispatch = request.getRequestDispatcher(nextPage);
        dispatch.forward(request, response);
    }

}
