<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%
    request.setCharacterEncoding("utf-8");
    String name = (String) session.getAttribute("name");
    session.setAttribute("address","서울시 강남구");
%>
<html>
<head>
    <title>Session 내장 객체 테스트1</title>
</head>
<body>
이름은 <%= name%> 입니다.<br>
<a href="pro12Session2.jsp">두번째 페이지로 이동</a>
</body>
</html>
