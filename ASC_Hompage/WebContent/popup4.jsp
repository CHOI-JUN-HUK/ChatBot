<%@page import="ASC.OrderInfoDTO2"%>
<%@page import="ASC.OrderInfoDAO2"%>
<%@page import="ASC.OrderInfoDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ASC.OrderInfoDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
	table{
		width: 100%;
		height: 250px;
		border: 1px solid;
		border-collapse: collapse;
	}
	
	th, td{
		border: 1px solid;
	}
	
	#first {
		background-color: yellow;
	}
	
	
</style>
</head>
<body>
	<%
	request.setCharacterEncoding("EUC-KR");
	int cus_num = (int)session.getAttribute("cus_num");
	String from_date = request.getParameter("date").substring(0, 7);
	String to_date = request.getParameter("date").substring(9,16);
	OrderInfoDAO2 dao = new OrderInfoDAO2();
	ArrayList<OrderInfoDTO2> info = dao.select2(cus_num, from_date, to_date);
	%>
	
	 <div align="center">
		
		<div style="border: 1px solid";>
        	<p align="left">
        		<%
        		String company = "";
        		if(cus_num == 1){
        			company = "�ع�Ǫ��";
        		}
        		else if(cus_num == 2){
        			company = "�������";
        		}
        		else if(cus_num == 3){
        			company = "�Ｚ����";
        		}
        		else if(cus_num == 4){
        			company = "��������";
        		}
        		%>
        		
        		<%="ASC : "+company+" �ֹ������Դϴ�." %>
        		
		<%-- 		 <%
				 out.print("<table>");
				 out.print("<tr>");
				 out.print("<th>cust_name</th>");
				 out.print("<th>tel</th>");
				 out.print("<th>fax</th>");
				 out.print("<th>addr</th>");
				 out.print("<th>part_id</th>");
				 out.print("<th>order_qty</th>");
				 out.print("<th>order_date</th>");
				 out.print("</tr>");
				 out.print("</table>");
				 %>
				  --%>
			</p>
			
				
			<table>
				<tr id="first">
					<th>���̸�</th>
					<th>��ȭ��ȣ</th>
					<th>�ѽ���ȣ</th>
					<th>�ּ�</th>
					<th>�ֹ���ǰ</th>
					<th>�ֹ���</th>
					<th>�ֹ�����</th>
				</tr>
				
				<%
				for(int i=0; i<info.size(); i++){%>
				<tr>
					<td><%=info.get(i).getCust_name()%></td>
					<td><%=info.get(i).getTel() %></td>
					<td><%=info.get(i).getFax() %></td>
					<td><%=info.get(i).getAddr() %></td>
					<td><%=info.get(i).getPart_id() %></td>
					<td><%=info.get(i).getOrder_qty() %></td>
					<td><%=info.get(i).getOrder_date()%></td>
				</tr>
				<%}
				%>
				
			
			</table>
			
		</div>

    </div> 
    <br>
    <br>
    <div align="center">
        <form action="popup3.jsp", method="post">
            <input type="text" name="cus_num" style="width:80%">
            <input type="submit" value = "send">
        </form>
    </div>


	
	
	

</body>
</html>