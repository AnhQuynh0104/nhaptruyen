package dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Nhacungcap025;
import model.Taikhoan025;

public class NhacungcapDAO extends DAO{
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public NhacungcapDAO() {
		super();
	}
	
	public ArrayList<Nhacungcap025> getNhacungcap025(String ten){
		ArrayList<Nhacungcap025> kq = null;
		String QUERY_NCC = "select * from nhacungcap where ten like ?";	
		try {
			ps = (PreparedStatement) con.prepareStatement(QUERY_NCC);
			ps.setString(1, '%' +  ten + '%');
			rs = ps.executeQuery();
			
			while(rs.next()) {
				if(kq == null) kq = new ArrayList<Nhacungcap025>();
				Nhacungcap025 ncc = new Nhacungcap025();
				ncc.setMancc(rs.getInt("mancc"));
				ncc.setTen(rs.getString("ten"));
				ncc.setDiachi(rs.getString("diachi"));
				ncc.setEmail(rs.getString("email"));
				ncc.setSdt(rs.getString("sdt"));
				ncc.setMota(rs.getString("mota"));
				kq.add(ncc);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			kq = null;
		}
		return kq;
	}
	
	public Nhacungcap025 getNhacungcap025byId(int ma){
		
		String QUERY_NCC = "select * from nhacungcap where mancc = ?";	
		try {
			ps = (PreparedStatement) con.prepareStatement(QUERY_NCC);
			ps.setInt(1, ma);
			rs = ps.executeQuery();
			if (rs.next()) {
				return new Nhacungcap025(ma, rs.getString("ten"), rs.getString("diachi"), rs.getString("email"), rs.getString("sdt"), rs.getString("mota"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		return null;
	}
}