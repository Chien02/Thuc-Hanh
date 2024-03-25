package Thuchanhbuoi4;

import java.util.Scanner;

public class DiemMau extends Diem{
	private String mau;
	
	public DiemMau() {
		super();
		mau = "null";
	}
	
	public DiemMau(int x, int y, String _mau) {
		super(x, y);
		this.mau = new String(_mau);
	}
	
	public void GanMau(String _mau) {
		this.mau = new String(_mau);
	}

	
	public void Nhap() {
		System.out.println("Hãy nhập tọa độ điểm (x,y)");
		Scanner scanner = new Scanner(System.in);
		nhapDiem();
		System.out.println("Hãy nhập màu");
		String new_mau = scanner.nextLine();
		this.mau = new_mau;
	}
	
	public void HienThi() {
		System.out.println("Điểm: ");
		hienThi();
		System.out.println("Màu: "+mau);
	}
}
