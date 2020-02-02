<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         isELIgnored="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    request.setCharacterEncoding("UTF-8");
%>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSTL 다국어 기능</title>
</head>
<body>


<%--<fmt:setLocale value="en_US"/>--%>
<%--<fmt:setLocale value="ko_KR" />--%>

<fmt:bundle basename="member">
<h1>
    <fmt:message key="mem.title"/> <br><br>
    <fmt:message key="mem.memName"/>:<fmt:message key="mem.name"/><br>
    <fmt:message key="mem.memAddress" />:<fmt:message key="mem.address"/><br>
    <fmt:message key="mem.memJob"/> :<fmt:message key="mem.job"/>
    </fmt:bundle>
</h1>
</body>
</html>
