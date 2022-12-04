<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dang nhap</title>
</head>
<body style="margin: 50px 100px">
	
	<h2> Đăng nhập </h2>
	<form name="dangnhap" action="login" method="post">
		<table border="0">
			<tr>
			<td>Tên đăng nhập:</td>
			<td><input type="text" name="tendangnhap" id="tendangnhap" required /></td>
			</tr>
			<tr>
			<td>Mật khẩu:</td>
			<td><input type="password" name="matkhau" id="matkhau" required /></td>		
			</tr>
			<tr>
			<td></td>
			<td><input type="submit" value="Đăng nhập" /></td>
			</tr>
		</table>
	</form>
</body>
</html>