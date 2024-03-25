package Thuchanhbuoi3;

import java.util.Scanner;

public class Gach {
	private String maso;
	private String mau;
	private int so_luong;
	private int chieu_dai;
	private int chieu_ngang;
	private long gia;
	
	public Gach() {
		maso = new String();
		mau = new String();
		so_luong = 0;
		chieu_dai = 0;
		chieu_ngang = 0;
		gia = 0;
	}
	
	public Gach(String _maso, String _mau, int _so_luong, int _chieu_dai, int _chieu_ngang, long _gia) {
		maso = new String(_maso);
		mau = new String(_mau);
		so_luong = _so_luong;
		chieu_dai = _chieu_dai;
		chieu_ngang = _chieu_ngang;
		gia = _gia;
	};
	
	public Gach(Gach _gach) {
		maso = new String(_gach.maso);
		mau = new String(_gach.mau);
		so_luong = _gach.so_luong;
		chieu_dai = _gach.chieu_dai;
		chieu_ngang = _gach.chieu_ngang;
		gia = _gach.gia;
	}
	
	public void nhapThongTin() {
		System.out.println("Hãy nhập thông tin cho 1 hộp gạch:");
		Scanner scanner = new Scanner(System.in);
		boolean flag = false;
		while(!flag) {
			try {
				System.out.println("Mã số: ");
				maso = scanner.nextLine();
				System.out.println("Màu: ");
				mau = scanner.nextLine();
				System.out.println("Số lượng viên gạch: ");
				so_luong = Integer.parseInt(scanner.nextLine());
				System.out.println("Chiều dài viên: ");
				chieu_dai= Integer.parseInt(scanner.nextLine());
				System.out.println("Chiều ngang viên: ");
				chieu_ngang = Integer.parseInt(scanner.nextLine());
				System.out.println("Giá 1 hộp: ");
				gia = Long.parseLong(scanner.nextLine());
				flag = true;
				} catch (Exception e) {
					System.out.println("Hãy nhập lại!");
				}
			}
	}
		
	
	public long giaBanLe() {
		long cost = 0;
		float tmp = gia * 120 / 100;
		cost = (long)(tmp/so_luong);
		//System.out.println("Gia bán lẻ 1 viên gạch: " + cost);
		return cost;
	}
	
	public int dienTichToiDa() {
		int chieu_dai_tong = chieu_dai * so_luong;
		int chieu_ngang_tong = chieu_ngang * so_luong;
		int dientich = chieu_dai_tong * chieu_ngang_tong;
		//System.out.println("Diện tích tối đa có thể lót được: " + dientich);
		return dientich;
	}
	
	public int soLuongHop(int D, int N) {
		int so_luong_vien = (D*N)*10000/(chieu_dai * chieu_ngang);
		int so_hop = so_luong_vien > so_luong ? so_luong_vien / so_luong : 1;
		//System.out.println("Số lượng hộp gạch cần là: " + so_hop);
		return so_hop;
	}
	
	public long chiPhiLot() {
		int m_vuong = 100*100;
		int so_luong_vien = (m_vuong)/(chieu_dai * chieu_ngang);
		int so_gach_le = 0;
		int so_luong_hop = this.soLuongHop(1, 1);
		long cost = 0;
		
		if (so_luong_vien > so_luong_hop * so_luong) {
			so_gach_le += so_luong_vien - so_luong_hop * so_luong; 
		}
		else if (so_luong_vien < so_luong_hop * so_luong) {
			so_gach_le += so_luong_vien;
			so_luong_hop = 0;
		}
		
		cost = (so_luong_hop * gia) + (so_gach_le * this.giaBanLe());
		
		return cost;
		
	}
	
	public void chiPhiMuaGach(int D, int N) {
		long chi_phi = 0;
		int dien_tich_can_lot = D*N;
		chi_phi = this.chiPhiLot() * dien_tich_can_lot;
		System.out.println("Chi phi mua gach " + maso + " : " + chi_phi);
	}
	
	public void hienThi() {
		System.out.println("----------------------");
		System.out.println("Thông tin của hộp gạch:");
		System.out.println("Mã: " + maso);
		System.out.println("Màu: " + mau);
		System.out.println("Số lượng viên gạch: " + so_luong);
		System.out.println("Chiều dài gạch (cm): " + chieu_dai);
		System.out.println("Chiều ngang gạch (cm): " + chieu_ngang);
		System.out.println("Giá 1 hộp gạch: " + gia);
		System.out.println("Giá bán lẻ: " + this.giaBanLe());
		System.out.println("Chi phí lót cho 1 mét vuông: "+ this.chiPhiLot());
		System.out.println("----------------------");
	}
	
	public String get_maso() {
		return maso;
	}
}
