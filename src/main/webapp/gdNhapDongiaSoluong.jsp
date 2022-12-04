<%@page import="model.Dautruyen025"%>
<%@ page import="java.util.*" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nhập đơn giá số lượng</title>
</head>
<body style="margin: 50px 100px">
<%
	Dautruyen025 truyenSelected = (Dautruyen025) request.getAttribute("truyenSelected");
%>
	<h2 align="center">Phần mềm quản lý cho thuê truyện</h2> 
	<h3 align="center">Nhập đơn giá số lượng</h3>	
	
	
	<h4>Thông tin đầu truyện</h4>
	<p><b>Mã: </b> <%=truyenSelected.getIddautruyen() %> </p>
	<p><b>Tên: </b> <%=truyenSelected.getTen() %> </p>
	<p><b>Tác giả: </b> <%=truyenSelected.getTacgia() %> </p>
	
 
    <h4 align="center">Nhập đơn giá và số lượng</h4>
    <form name="nhapgia" action="hoadonnhap" method="post">
		<table border="0" align="center"  style="width: 400px;">
			<tr>
			<td>Đơn giá</td>
			<td><input type="number" name="dongia" id="dongia" required /></td>
			</tr>
			<tr>
			<td>Số lượng</td>
			<td><input type="number" name="soluong" id="soluong" required /></td>		
			</tr>
			<tr>
			<td></td>
			<td><input type="submit" value="Xác nhận" style="margin-top: 20px;background-color: #04AA6D;color: #fff;border: none; border-radius: 5px;padding: 10px 15px;" /></td>
			</tr>
		</table>
	</form>
	
	
	<div style="position:absolute; bottom: 5%; right: 50%">
		<button onclick="window.location='gdTimdautruyen.jsp'" height="50px" style="border: none; border-radius: 5px;padding: 10px 15px;">Hủy</button>
		
	</div>
</body>
</html>