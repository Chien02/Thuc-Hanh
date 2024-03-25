package Thuchanhbuoi3;

import java.util.Scanner;

public class DoanThang {
	private Diem d1;
	private Diem d2;
	
	public DoanThang() {
		d1 = new Diem();
		d2 = new Diem();
	}
	
	public DoanThang(Diem _a, Diem _b) {
		this.d1 = new Diem(_a);
		this.d2 = new Diem(_b);
	}
	
	public DoanThang(int x, int y, int a, int b) {
		this.d1 = new Diem(x, y);
		this.d2 = new Diem(a, b);
	}
	
	public void nhapDoanThang() {
		Diem a = new Diem();
		Diem b = new Diem();
		
		System.out.println("Nhập đầu mút d1 (x, y): ");
		a.nhapDiem();
		b.nhapDiem();
		
		d1 = a;
		d2 = b;
	}
	
	public void hienThiDoanThang() {
		System.out.println("----------------");
		d1.hienThi();
		d2.hienThi();
		System.out.println("----------------");
	}
	
	public void tinhTien(int dx, int dy) {
		d1.doiDiem(dx,  dy);
		d2.doiDiem(dx,  dy);
	}
	
	public float doDai() {
		return (float)Math.sqrt(
				Math.pow(d1.giaTriX(), d2.giaTriX()) +
				Math.pow(d1.giaTriY(), d2.giaTriY())
				);
	}
	
	public float goc() {
		return (float) (d2.giaTriY() - d1.giaTriY())
					/ (d2.giaTriX() - d1.giaTriX());
	}
}
