<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<%!
    String name = "듀크";
    public String getName() {
        return name;
    }
%>
<% String age = request.getParameter("age"); %>

<head>
    <title>스크립틀릿 실</title>
</head>
<body>
<h1>안녕하세요 <%= name%> 님!</h1>
<h1>나이는 <%= age%>살입니다.</h1>
</body>
</html>
