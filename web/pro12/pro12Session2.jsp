<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%
    request.setCharacterEncoding("utf-8");
    String name = (String) session.getAttribute("name");
    String address = (String) session.getAttribute("address");
%>
<html>
<head>
    <title>Session 내장객체 테스트2</title>
</head>
<body>
이름은 <%= name%> 입니다. <br>
주소는 <%=address%> 입니다.
</body>
</html>
