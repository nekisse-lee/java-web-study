<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%
    request.setAttribute("name", "이순신");
    request.setAttribute("address", "서울시 강남구");

%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    RequestDispatcher requestDispatcher = request.getRequestDispatcher("pro12Request2.jsp");
    requestDispatcher.forward(request, response);
%>

</body>
</html>
