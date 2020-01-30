<%@ page import="pro14.sec01.ex01.MemberBean" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%
    request.setCharacterEncoding("utf-8");
    MemberBean member = new MemberBean("lee", "1234", "이순신", "lee@test.com");
    request.setAttribute("member",member);
%>
<html>
<head>
    <meta charset="UTF-8">
    <title>forward2</title>
</head>
<body>
<jsp:forward page="pro14Member2.jsp"/>
</body>
</html>
