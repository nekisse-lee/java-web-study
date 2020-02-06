<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%
    request.setCharacterEncoding("utf-8");
    int score = Integer.parseInt(request.getParameter("score"));
%>
<html>
<head>
    <title>학점 출력창</title>
</head>
<body>
<h1>시험점수 <%=score%>점</h1>
<%
    if (score>100) {
%>
<h1>시험 점수잘못 입력 하셨습니다.</h1>
<%
    }else if (score >= 90) {
%>
<h1>A 학점 입니다.</h1>
<%
}else if (score >= 80 && score < 90) {
%>
<h1>B 학점 입니다.</h1>
<%
} else if (score >= 70 && score < 80) {
%>
<h1>C 학점 입니다.</h1>
<%
    } else if (score >= 60 && score < 70) {
%>
<h1>D 학점 입니다.</h1>
<%
        }else {
%>
<h1>F 학점 </h1>
<%
    }
%>

<br>
<a href="pro12ScoreTest.html">시험점수 입력창</a>
</body>
</html>
