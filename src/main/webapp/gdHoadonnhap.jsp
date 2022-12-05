<%@page import="model.Hoadonnhap025"%>
<%@page import="model.HoadonDautruyen025"%>
<%@page import="model.Nhacungcap025"%>
<%@ page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hóa đơn nhập</title>
</head>
<body style="margin: 50px 100px">
	<h2 align="center">Phần mềm quản lý cho thuê truyện</h2> 
	<h3 align="center">Hóa đơn nhập</h3>	
	
	<% 
		Nhacungcap025 ncc = (Nhacungcap025) request.getAttribute("nccSelected");
		session.setAttribute("nhacungcap", ncc);
		Hoadonnhap025 x = (Hoadonnhap025) request.getAttribute("hoadonnhap");
		System.out.print("x"+ x);
		Nhacungcap025 n = (Nhacungcap025)session.getAttribute("nhacungcap");
		
	%>
	<b>Thông tin nhà cung cấp</b>
	<p><b>Mã: </b> <%=n.getMancc()%> </p>
	<p><b>Tên: </b> <%=n.getTen()%> </p>
	<p><b>Địa chỉ: </b> <%=n.getDiachi()%> </p>
	<p><b>Email: </b><%=n.getEmail()%></p>
	<p><b>SĐT: </b><%=n.getSdt()%> </p>
	
	<button onclick="window.location='gdTimDautruyen.jsp'" height="50px" style="background-color: #04AA6D;color: #fff;border: none; border-radius: 5px;padding: 10px 15px;">Thêm đầu truyện</button>
	
	<table width="1200px" align="center" style="border:3px solid #f2f2f2; margin-top: 30px">
		<tr>
			<td colspan=6 align="center" style="background-color: #04AA6D; color: #fff; padding: 10px 0; font-size: 16px" >
				<b>Danh sách đầu truyện</b>
			</td>
        </tr>
        <tr style="background-color:lightgrey;">
			<td align="center"><b>Mã</b></td>
            <td align="center"><b>Tên</b></td>
            <td align="center"><b>Tác giả</b></td>
            <td align="center"><b>Đơn giá</b></td>
            <td align="center"><b>Số lượng</b></td>
            <td align="center"><b>Thành tiền</b></td>
        </tr>
        <%
            int count = 0;
            String color = "#f2f2f2";
            if (request.getAttribute("hoadonnhap") != null) {
            	
				//Hoadonnhap025 hd = (Hoadonnhap025) request.getAttribute("hoadonnhap");
				List<HoadonDautruyen025> al = x.getList();
				
				System.out.print("x"+x.getList());
                Iterator itr = al.iterator();
                while (itr.hasNext()) {
					if ((count % 2) == 0) {
						color = "#fff";
                    }else{
                    	color = "#f2f2f2";
                    }
                count++;
            	HoadonDautruyen025 pList = (HoadonDautruyen025) itr.next(); 
            	
        		//request.setAttribute("nccSelected", pList);
				%>
		        <tr style="background-color:<%=color%>;">
		        	
		            <td><%=pList.getDautruyen025().getIddautruyen()%></td>
		            <td><%=pList.getDautruyen025().getTen()%></td>
		            <td><%=pList.getDautruyen025().getTacgia()%></td>
		            <td><%=pList.getDongia()%></td>
		            <td><%=pList.getSoluong()%></td>
		            <td><%=pList.getDongia() * pList.getSoluong()%></td>
		        </tr>
		        <%
             }
        }
	        if (count == 0) {
	        %>
	            <tr>
	                <td colspan=6 align="center"
	                    style="background-color:#fff"><b>Chưa có đầu truyện nào được thêm</b></td>
	            </tr>
	        <%            
	        }
        %>
	</table>
	
	<div style="position:absolute; bottom: 5%; right: 45%">
		<button onclick="window.location='gdTimNhacungcap.jsp'" height="50px" style="border: none; border-radius: 5px;padding: 10px 15px;">Quay lại</button>
		<button onclick="window.location='gdChinhNhanvien.jsp'" style="background-color: #04AA6D;color: #fff;border: none; border-radius: 5px;padding: 10px 15px;">In hóa đơn</button>
	</div>
</body>
</html>