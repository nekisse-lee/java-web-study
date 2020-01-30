<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<c:set var="contextName" value="${pageContext.request.contextPath}"/>


<html>
<head>
    <meta charset="UTF-8">
    <title>로그인창</title>
</head>
<body>
<form action="pro14Result.jsp">
    아이디: <input type="text" size="20"><br>
    비밀번호 : <input type="password" size="20"> <br>
    <input type="submit" value="로그인"> <input type="reset"value="다시입력">
    
</form>
<br><br>

<a href="${contextName}/pro14/test03/pro14MemberForm.jsp">회원 등록하기</a>
</body>
</html>