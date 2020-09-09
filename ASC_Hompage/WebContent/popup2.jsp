<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
		<div style="border: 1px solid; width: 100%; height: 100px;">
			<p align="right">
				<%
				request.setCharacterEncoding("EUC-KR");
				String input = request.getParameter("input");
				%>
				<%="사용자 : " + input%>
			</p>
		</div>

		<div style="border: 1px solid; width: 100%; height: 150px;">
			<p align="left">
				<%
					String output = "";
				if (input.equals("check") || input.equals("1")) {
					out.print("<p align=left> ASC : 해당하는 번호를 입력해주세요</p>");
					out.print("<p align=left> ASC : 1. 해미푸드 2. 우진통발, 3. 삼성로프, 4. 오성로프 </p>");
				}

				else {
					output = "번호를 제대로 입력해주세요";
					out.print("<p align=left> ASC : " + output + "</p>");
				}
				%>

			</p>
		</div>

	</div>

	<br>
	
	<div align="center">
		<form action="popup3.jsp" , method="post">
			<input type="text" name="cus_num" style="width: 80%"> 
			<input type="submit" value="send">
		</form>
	</div>


</body>
</html>