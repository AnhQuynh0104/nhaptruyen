package dao;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Taikhoan025;





public class TaikhoanDAO extends DAO{
	
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public Taikhoan025 kiemtraDangnhap(String tendangnhap, String matkhau) {
		String QUERY_ACCOUNT = "select * from taikhoan where tendangnhap = ? and matkhau = ? ";		
			try {
				
				ps = (PreparedStatement) con.prepareStatement(QUERY_ACCOUNT);
				ps.setString(1, tendangnhap);
				ps.setString(2, matkhau);
				rs = ps.executeQuery();
				if (rs.next()) {
					return new Taikhoan025(rs.getInt("id"),tendangnhap, matkhau);
				}
			
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return null;
		
	}
}