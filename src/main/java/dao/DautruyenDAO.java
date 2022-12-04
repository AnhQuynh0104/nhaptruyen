package dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Dautruyen025;
import model.Nhacungcap025;

public class DautruyenDAO extends DAO{
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public DautruyenDAO() {
		super();
	}
	
	public ArrayList<Dautruyen025> getDautruyen025(String ten){
		ArrayList<Dautruyen025> kq = null;
		String QUERY_NCC = "select * from dautruyen where ten like ?";	
		try {
			ps = (PreparedStatement) con.prepareStatement(QUERY_NCC);
			ps.setString(1, '%' +  ten + '%');
			rs = ps.executeQuery();
			
			while(rs.next()) {
				if(kq == null) kq = new ArrayList<Dautruyen025>();
				Dautruyen025 truyen = new Dautruyen025();
				truyen.setIddautruyen(rs.getInt("iddautruyen"));
				truyen.setTen(rs.getString("ten"));
				truyen.setTacgia(rs.getString("tacgia"));
				truyen.setNhaxuatban(rs.getString("nhaxuatban"));
				truyen.setNamxuatban(rs.getString("namxuatban"));
				kq.add(truyen);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			kq = null;
		}
		return kq;
	}
	
	public Dautruyen025 getDautruyen025byId(int ma){
		
		String QUERY_NCC = "select * from dautruyen where iddautruyen = ?";	
		try {
			ps = (PreparedStatement) con.prepareStatement(QUERY_NCC);
			ps.setInt(1, ma);
			rs = ps.executeQuery();
			if (rs.next()) {
				return new Dautruyen025(ma, rs.getString("ten"), rs.getString("tacgia"), rs.getString("nhaxuatban"), rs.getString("namxuatban"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		return null;
	}
}