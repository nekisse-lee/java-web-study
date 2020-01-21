<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%!
    String name = "듀크";
    public String getName() {
        return name;
    }
%>

<html>
<head>
    <title>선언문 실습</title>
</head>
<body>
<h1>안녕하세요 <%= name%> 님!</h1>
</body>
</html>
