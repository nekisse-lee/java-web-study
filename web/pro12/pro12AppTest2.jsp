<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%
    request.setCharacterEncoding("utf-8");
    String name = (String) session.getAttribute("name");
    String address = (String) application.getAttribute("address");
%>
<html>
<head>
    <title>세션 내장객체 스코프 테스트</title>
</head>
<body>
이름은 <%= name%> <br>
주소  : <%= address%>

</body>
</html>
