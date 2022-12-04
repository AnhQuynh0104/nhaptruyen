//package dao;
//
//
//
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//import model.Dautruyen025;
//import model.HoadonDautruyen025;
//
//public class DongiaSoluongDAO extends DAO{
//	
//	PreparedStatement ps = null;
//	ResultSet rs = null;
//	
//	public HoadonDautruyen025 getHoadonDautruyen025byId(int ma){
//		
//		String QUERY_NCC = "select * from hoadondautruyen where iddautruyen = ?";	
//		try {
//			ps = (PreparedStatement) con.prepareStatement(QUERY_NCC);
//			ps.setInt(1, ma);
//			rs = ps.executeQuery();
//			if (rs.next()) {
//				return new HoadonDautruyen025(rs.getInt("idhoadondautruyen"), ma, rs.getString("nhaxuatban"), rs.getString("namxuatban"));
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//			
//		}
//		return null;
//	}
//}