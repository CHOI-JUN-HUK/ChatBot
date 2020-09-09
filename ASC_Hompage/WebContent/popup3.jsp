<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="kor">
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
			<!--     <div align="center"; style="border: 1px solid; width:100%; height:200px;">
	    	<div style="border: 1px solid";>
	        	<p align="left">
					 Hi, I'm ASC;
				</p>
			</div> -->
	
			<div style="border: 1px solid; width: 100%; height: 100px;">
				<p align="left">
					<%
					request.setCharacterEncoding("EUC-KR");
					int cus_num = Integer.parseInt(request.getParameter("cus_num"));
					session.setAttribute("cus_num", cus_num);
					
					if(cus_num == 1){
						out.print("ASC : 안녕하세요 해미푸드님");
					}
					else if(cus_num == 2){
						out.print("ASC : 안녕하세요 우진통발님");
					}
					else if(cus_num == 2){
						out.print("ASC : 안녕하세요 삼성로프님");
					}
					else{
						out.print("ASC : 안녕하세요 오성로프님");
					}
					%>
					
				</p>
				
				<p align="left">
					<%
					out.print("ASC : 조회하시고자 하는 날짜를 입력해주세요");
					out.print("<br>");
					out.print("ex)20200101~20200131");
					%>
				</p>
			</div>
	
	</div>
	
		<br>
	
		<!--     <div align="center">
	        <form action="popup2.jsp", method="post">
	            <input type="text" name="input" style="width:80%">
	            <input type="submit" value = "send">
	        </form>
	    </div> -->
	
		<div align="center">
			<form action="popup4.jsp" , method="post">
				<input type="text" name="date" style="width: 80%"> 
				<input type="submit" value="send">
			</form>
		</div>

</body>
</html>