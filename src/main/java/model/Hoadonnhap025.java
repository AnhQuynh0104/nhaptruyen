package model;

import java.util.ArrayList;
import java.util.List;

public class Hoadonnhap025{
	private int idhoadon;
	private double tongtien;
	private Nhacungcap025 nhacungcap025;
	private List<HoadonDautruyen025> list;
	
	
	
	public Hoadonnhap025(Nhacungcap025 nhacungcap025, List<HoadonDautruyen025> list,double tongtien) {
		nhacungcap025 = new Nhacungcap025();
		list =  new ArrayList();
		this.tongtien = 0;
	}
	public Hoadonnhap025(int idhoadon, double tongtien, Nhacungcap025 nhacungcap025, List<HoadonDautruyen025> list) {
		super();
		this.idhoadon = idhoadon;
		this.tongtien = tongtien;
		this.nhacungcap025 = nhacungcap025;
		this.list = list;
	}
	public int getIdhoadon() {
		return idhoadon;
	}
	public void setIdhoadon(int idhoadon) {
		this.idhoadon = idhoadon;
	}
	public double getTongtien() {
		return tongtien;
	}
	public void setTongtien(double tongtien) {
		this.tongtien = tongtien;
	}
	public Nhacungcap025 getNhacungcap025() {
		return nhacungcap025;
	}
	public void setNhacungcap025(Nhacungcap025 nhacungcap025) {
		this.nhacungcap025 = nhacungcap025;
	}
	public List<HoadonDautruyen025> getList() {
		return list;
	}
	public void setList(List<HoadonDautruyen025> list) {
		this.list = list;
	}
	
	
	
}