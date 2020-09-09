<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
request.setCharacterEncoding("EUC-KR");
%>
<div align="center">
    <div align="center"; style="border: 1px solid;width:100%; height:200px;"  >
        <p align="left"> 
     		ASC : 
     		<br><br>
     		안녕하세요 에이에스씨 입니다.
     		<br>
     		아래 항목에서 선택하고 싶은 번호를 입력해주세요. 
     		<br><br>
     		1. 주문확인
     		<br>
     		2. 연락
     		
        </p>
        
    </div>
    <br>

    <div align="center">
        <form action="popup2.jsp", method="post">
            <input type="text" name="input" style="width:80%">
            <input type="submit" value = "send">
        </form>
    </div>
</div>

</body>
</html>