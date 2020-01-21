<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%
    request.setCharacterEncoding("utf-8");
    String name = (String) request.getAttribute("name");
    String address = (String) request.getAttribute("address");
%>

<html>
<head>
    <title>Title</title>
</head>
<body>
이름 :  <%= name%> <br>
주소  :   <%= address%> <br>

</body>
</html>
