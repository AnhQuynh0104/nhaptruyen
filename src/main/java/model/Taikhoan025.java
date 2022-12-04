package model;



import java.io.Serializable;

public class Taikhoan025 implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	private String tendangnhap, matkhau;
	public Taikhoan025(int id,  String tendangnhap, String matkhau) {
		this.setId(id);
		this.tendangnhap = tendangnhap;
		this.matkhau = matkhau;
		// TODO Auto-generated constructor stub
	}
	
	public String getTendangnhap() {
		return tendangnhap;
	}
	public void setTendangnhap(String tendangnhap) {
		this.tendangnhap = tendangnhap;
	}
	public String getMatkhau() {
		return matkhau;
	}
	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}