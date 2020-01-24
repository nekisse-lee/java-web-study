<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>로그인창</title>
</head>
<body>
<%--<h1>아이디를 입력하지 않았습니다. 아이디를 입력해주세요</h1>--%>
<%
    String msg = request.getParameter("msg");
    if (msg != null){
%>
<h1><%= msg%></h1>
<%
    }
%>

<form action="pro12Result2.jsp" method="post">
    아이디 : <input type="text" name="userID"><br>
    비밀번호 : <input type="password" name="userPW"/><br>
    <input type="submit" value="로그인">
    <input type="reset" value="다시입력">
</form>

</body>
</html>