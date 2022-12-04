package model;

public class Nhacungcap025{
	private int mancc;
	private String ten, diachi, email, sdt, mota;
	
	
	public Nhacungcap025() {
		super();
	}
	public Nhacungcap025(int macc, String ten, String diachi, String email, String sdt, String mota) {
		super();
		this.setMancc(mancc);
		this.ten = ten;
		this.diachi = diachi;
		this.email = email;
		this.sdt = sdt;
		this.mota = mota;
	}
	public int getMancc() {
		return mancc;
	}
	public void setMancc(int mancc) {
		this.mancc = mancc;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getMota() {
		return mota;
	}
	public void setMota(String mota) {
		this.mota = mota;
	}
	
}