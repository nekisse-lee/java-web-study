<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" isErrorPage="true" %>

<html>
<head>
    <title>에러페이지</title>
</head>
<body>
====== toString() 내용 ======= <br>
<h1><%= exception.toString()  %> </h1>
=============== getMessage()내용 ==========<br>
<h1><%=exception.getMessage()%> </h1>
============= printStackTrace() 내용 =======<br>
<h1><% exception.printStackTrace(); %> </h1>
<h3>
    숫자만 입력 가능합니다.다시 시도 하세요.
    <a href='pro12Add.html'>다시하기</a>
</h3>
</body>
</html>
