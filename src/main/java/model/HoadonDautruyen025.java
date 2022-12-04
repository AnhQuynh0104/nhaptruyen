package model;

public class HoadonDautruyen025{
	private int idhoadondautruyen;
	private Dautruyen025  dautruyen025;
	private double dongia;
	private int soluong;
	
	public HoadonDautruyen025(Dautruyen025 dautruyen025,
			double dongia, int soluong) {
		super();
		//this.setIdhoadondautruyen(idhoadondautruyen);
		this.dautruyen025 = dautruyen025;
		this.dongia = dongia;
		this.soluong = soluong;
	}
	
	public int getIdhoadondautruyen() {
		return idhoadondautruyen;
	}
	public void setIdhoadondautruyen(int idhoadondautruyen) {
		this.idhoadondautruyen = idhoadondautruyen;
	}
	public Dautruyen025 getDautruyen025() {
		return dautruyen025;
	}
	public void setDautruyen025(Dautruyen025 dautruyen025) {
		this.dautruyen025 = dautruyen025;
	}
	public double getDongia() {
		return dongia;
	}
	public void setDongia(double dongia) {
		this.dongia = dongia;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	
	
	
}