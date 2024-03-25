package Thuchanhbuoi4;

import java.util.Scanner;

public class SinhVienCNTT extends SinhVien{
	private String taikhoan;
	private String matkhau;
	private String email;
	
	public SinhVienCNTT() {
		super();
		taikhoan = "null";
		matkhau = "null";
		email = "null";
	}
	
	public SinhVienCNTT(String _id,
			String _name,
			Date _birthday,
			int _so_hoc_phan,
			String[] _ten_hoc_phan,
			String[] _diem_hoc_phan,
			String _taikhoan,
			String _matkhau,
			String _email) {
		super(_id, _name, _birthday, _so_hoc_phan, _ten_hoc_phan,_diem_hoc_phan);
		taikhoan = _taikhoan;
		matkhau = _matkhau;
		email = _email;
	}
	
	public SinhVienCNTT(SinhVienCNTT A) {
		id = new String(A.id);
		name = new String(A.name);
		birthday = new Date(A.birthday);
		so_hoc_phan = A.so_hoc_phan;
		ten_hoc_phan = new String[so_hoc_phan];
		diem_hoc_phan = new String[so_hoc_phan];
		for (int i = 0; i < so_hoc_phan; i++) {
			ten_hoc_phan[i] = new String(A.ten_hoc_phan[i]);
			diem_hoc_phan[i] = new String(A.diem_hoc_phan[i]);
		}
		taikhoan = A.taikhoan;
		matkhau = A.matkhau;
		email = A.email;
	}
	
	public void Nhap() {
		Scanner scanner = new Scanner(System.in);
		nhapThongTin();
		nhapDiem();
		System.out.println("Hãy nhập tài khoản sinh viên");
		taikhoan = scanner.nextLine();
		System.out.println("Hãy nhập mật khẩu");
		matkhau = scanner.nextLine();
		System.out.println("Cuối cùng, hãy nhập email");
		email = scanner.nextLine();
		System.out.println("Đã nhập xong!");
	}
	
	public String toString() {
		return super.toString() + "Tài khoản: " + taikhoan +
				"\n Mật khẩu: " + matkhau +
				"\n Email: " + email;
	}
	
	public void doiMatKhau(String newpass) {
		matkhau = new String(newpass);
	}
	
	public String getEmail() {
		return email;
	}
}
