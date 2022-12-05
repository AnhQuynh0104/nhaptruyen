<%@page import="model.Dautruyen025"%>
<%@page import="model.Nhacungcap025"%>
<%@ page import="java.util.*" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tìm đầu truyện</title>
</head>
<body style="margin: 50px 100px">

	<h2 align="center">Phần mềm quản lý cho thuê truyện</h2> 
	<h3 align="center">Tìm đầu truyện</h3>	
	
	
	<form name="timkiem" method="get" action="timdautruyen">
      <table  border="0"  align="center" style="margin-bottom: 20pt">
        <tr><td colspan=2 style="font-size:12pt;" align="center">
        
        <tr>
        	<td ><b>Nhập đầu truyện</b></td>
          	<td>: <input  type="text" name="ten" id="ten" style="padding: 7px 0"></td>
        	<td colspan=2 align="center">
        		<input  type="submit" value="Tìm kiếm" style="background-color: #04AA6D;color: #fff;border: none; border-radius: 5px;padding: 10px 15px;">
        	</td>
        	
        </tr>      
      </table>
    </form>
   

    
    <table width="1200px" align="center" style="border:3px solid #f2f2f2;">
		<tr>
			<td colspan=6 align="center" style="background-color: #04AA6D; color: #fff; padding: 10px 0; font-size: 16px">
				<b>Danh sách đầu truyện tìm được</b>
			</td>
        </tr>
        <tr style="background-color:lightgrey;">
			<td align="center"><b>Mã</b></td>
            <td align="center"><b>Tên</b></td>
            <td align="center"><b>Tác giả</b></td>
            <td align="center"><b>Nhà xuất bản</b></td>
            <td align="center"><b>Năm xuất bản</b></td>
        </tr>
        <%
            int count = 0;
            String color = "#f2f2f2";
            if (request.getAttribute("listTruyen") != null) {
				ArrayList al = (ArrayList) request.getAttribute("listTruyen");
                Iterator itr = al.iterator();
                while (itr.hasNext()) {
					if ((count % 2) == 0) {
						color = "#fff";
                    }else{
                    	color = "#f2f2f2";
                    }
                count++;
            	Dautruyen025 pList = (Dautruyen025) itr.next(); 
            	
        		request.setAttribute("truyenSelected", pList);
        		session.setAttribute("truyen_id", pList.getIddautruyen());
				%>
		        <tr style="background-color:<%=color%>;" 
		        onclick="window.document.location='dongiasoluong?truyen_id=<%=pList.getIddautruyen()%>'">
		        	
		            <td><%=pList.getIddautruyen()%></td>
		            <td><%=pList.getTen()%></td>
		            <td><%=pList.getTacgia()%></td>
		            <td><%=pList.getNhaxuatban()%></td>
		            <td><%=pList.getNamxuatban()%></td>
		        </tr>
		        <%
             }
        }
	        if (count == 0) {
	        %>
	            <tr>
	                <td colspan=6 align="center"
	                    style="background-color:#fff"><b>Không tìm thấy kết quả</b></td>
	            </tr>
	        <%            
	        }
        %>
	</table>
	
	<div style="position:absolute; bottom: 5%; right: 45%">
		<button onclick="window.location='gdHoadonnhap.jsp'" height="50px"  style="border: none; border-radius: 5px;padding: 10px 15px;">Quay lại</button>
		<button onclick="window.location='gdThemnhacungcap.jsp'" style="background-color: #04AA6D;color: #fff;border: none; border-radius: 5px;padding: 10px 15px;">Thêm mới</button>
	</div>
</body>
</html>