<%@ page language="java" contentType="text/html; charset=UTF-8"
         import="java.util.Date"
         pageEncoding="UTF-8"
         isELIgnored="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
    request.setCharacterEncoding("UTF-8");
%>
<html>
<head>
    <meta charset="UTF-8">
    <title>개행 문자 변환</title>
</head>
<body>
<c:set var="title1" value="안녕하세요, \r\n 쇼핑몰 중심 JSP입니다."/>
${title1} <br><br>
${fn:replace(title1, "\\r\\n","<br>" )}
</body>
</html>
