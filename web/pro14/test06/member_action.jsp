<%@ page language="java" contentType="text/html; charset=UTF-8"
         import=" java.util.*, pro14.sec02.ex01.*"
         pageEncoding="UTF-8"
         isELIgnored="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    request.setCharacterEncoding("UTF-8");
%>
<html>
<head>
    <meta charset="UTF-8">
    <%
        String command = request.getParameter("command");
        MemberDAO memDAO = new MemberDAO();
        List membersList = null;
        if (command.equals("addMember")) {

    %>
    <jsp:useBean id="m" class="pro14.sec02.ex01.MemberBean"/>

    <jsp:setProperty name="m" property="*"/>
    <%
            memDAO.addMember(m);
            membersList = memDAO.listMembers();
        } else if (command.equals("search")) {
            String name = request.getParameter("name");
            MemberBean memberBean = new MemberBean();
            memberBean.setName(name);
            membersList = memDAO.listMembers(memberBean);

        }
        request.setAttribute("membersList", membersList);

    %>
</head>
<body>
<jsp:forward page="membersList.jsp"/>
</body>
</html>
