package model;

public class Dautruyen025{
	private int iddautruyen;
	private String ten, tacgia, nhaxuatban;
	private String namxuatban;
	
	public Dautruyen025() {
		super();
	}
	public Dautruyen025(int iddautruyen, String ten, String tacgia, String nhaxuatban, String namxuatban) {
		super();
		this.setIddautruyen(iddautruyen);
		this.ten = ten;
		this.tacgia = tacgia;
		this.nhaxuatban = nhaxuatban;
		this.namxuatban = namxuatban;
	}
	public int getIddautruyen() {
		return iddautruyen;
	}
	public void setIddautruyen(int iddautruyen) {
		this.iddautruyen = iddautruyen;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getTacgia() {
		return tacgia;
	}
	public void setTacgia(String tacgia) {
		this.tacgia = tacgia;
	}
	public String getNhaxuatban() {
		return nhaxuatban;
	}
	public void setNhaxuatban(String nhaxuatban) {
		this.nhaxuatban = nhaxuatban;
	}
	public String getNamxuatban() {
		return namxuatban;
	}
	public void setNamxuatban(String namxuatban) {
		this.namxuatban = namxuatban;
	}
	
}