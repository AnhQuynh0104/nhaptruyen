package dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Dautruyen025;
import model.HoadonDautruyen025;
import model.Hoadonnhap025;
import model.Nhacungcap025;

public class HoadonnhapDAO extends DAO{
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public HoadonnhapDAO() {
		super();
	}
	
//	public ArrayList<Dautruyen025> getDautruyen025(String ten){
//		ArrayList<Dautruyen025> kq = null;
//		String QUERY_NCC = "select * from dautruyen where ten like ?";	
//		try {
//			ps = (PreparedStatement) con.prepareStatement(QUERY_NCC);
//			ps.setString(1, '%' +  ten + '%');
//			rs = ps.executeQuery();
//			
//			while(rs.next()) {
//				if(kq == null) kq = new ArrayList<Dautruyen025>();
//				Dautruyen025 truyen = new Dautruyen025();
//				truyen.setIddautruyen(rs.getInt("iddautruyen"));
//				truyen.setTen(rs.getString("ten"));
//				truyen.setTacgia(rs.getString("tacgia"));
//				truyen.setNhaxuatban(rs.getString("nhaxuatban"));
//				truyen.setNamxuatban(rs.getString("namxuatban"));
//				kq.add(truyen);
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//			kq = null;
//		}
//		return kq;
//	}
	
	public void themHoadonnhap(Hoadonnhap025 hd) {
		String QUERY_HOADON = "insert into hoadonnhap(mancc, tongtien) values(?,?,?) ";
		String QUERY_HOADONDAUTRUYEN = "insert into hoadondautruyen(iddautruyen, idhoadon, soluong, dongia) values(?,?,?,?) ";
		try {
			ps = (PreparedStatement) con.prepareStatement(QUERY_HOADON);
			ps.setInt(1, hd.getNhacungcap025().getMancc());
			ps.setDouble(2, hd.getTongtien());
			rs = ps.executeQuery();
			if (rs.next()) {
				hd.setIdhoadon(rs.getInt(1));
				for(HoadonDautruyen025 x: hd.getList()) {
					ps = (PreparedStatement) con.prepareStatement(QUERY_HOADONDAUTRUYEN);
					ps.setInt(1, x.getDautruyen025().getIddautruyen());
					ps.setInt(2, hd.getIdhoadon());
					ps.setInt(3, x.getSoluong());
					ps.setDouble(4, x.getDongia());
					ps.executeUpdate();
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}