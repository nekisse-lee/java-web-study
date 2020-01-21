<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%!
    String name = "듀크";
    public String getName() {
        return name;
    }
%>
<%
    String age = request.getParameter("age");
%>
<html>
<head>
    <title>포현식 실습</title>

</head>
<body>
<h1>안녕하세요 <%= name%> 님!</h1>
<h1>나이는 <%= age%>살입니다.</h1>
<h1>키는 <%= 180%>cm입니다.</h1>
<h1>나이 + 10은 <%= Integer.parseInt(age) + 10%></h1>
</body>
</html>
