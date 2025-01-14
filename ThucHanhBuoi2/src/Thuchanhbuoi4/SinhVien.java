package Thuchanhbuoi4;

import java.util.Iterator;
import java.util.Scanner;

public class SinhVien {
	protected String id;
	protected String name;
	protected Date birthday;
	protected int so_hoc_phan;
	protected String[] ten_hoc_phan;
	protected String[] diem_hoc_phan;
	
	public SinhVien() {
		id = new String();
		name = new String();
		birthday = new Date();
		so_hoc_phan = 0;
		ten_hoc_phan = new String[so_hoc_phan];
		diem_hoc_phan = new String[so_hoc_phan];
	}
	
	public SinhVien(String _id,
			String _name,
			Date _birthday,
			int _so_hoc_phan,
			String[] _ten_hoc_phan,
			String[] _diem_hoc_phan) {
		id = new String(_id);
		name = new String(_name);
		birthday = new Date(_birthday);
		so_hoc_phan = _so_hoc_phan;
		for (int i = 0; i < _ten_hoc_phan.length; i++) {
			ten_hoc_phan[i] = new String(_ten_hoc_phan[i]);
			diem_hoc_phan[i] = new String(_diem_hoc_phan[i]);
		}
	}
	
	public SinhVien(SinhVien A) {
        if (A != null) {
            this.id = new String(A.id);
            this.name = new String(A.name);
            this.birthday = new Date(A.birthday); // Tạo mới Date từ timestamp của Date cũ
            this.so_hoc_phan = A.so_hoc_phan;
            this.ten_hoc_phan = new String[A.ten_hoc_phan.length];
            this.diem_hoc_phan = new String[A.diem_hoc_phan.length];
            for (int i = 0; i < A.so_hoc_phan; i++) {
                this.ten_hoc_phan[i] = new String(A.ten_hoc_phan[i]);
                this.diem_hoc_phan[i] = new String(A.diem_hoc_phan[i]);
            }
        }
    }
	
	public void nhapThongTin() {
		Scanner scanner = new Scanner(System.in);
		String _id = new String();
		String _name = new String();
		Date _birth = new Date();
		int _so_hp = 0;
		
		
		System.out.println("Nhập mã số sinh viên: ");
		_id = scanner.nextLine();
		System.out.println("Nhập họ tên sinh viên: ");
		_name = scanner.nextLine();
		System.out.println("Nhập ngày sinh sinh viên: ");
		_birth.nhapNgay();
		System.out.println("Nhập số học phần đã đăng ký: ");
		_so_hp = Integer.parseInt(scanner.nextLine());
		this.so_hoc_phan = _so_hp;
		
		String[] _ten_hp = new String[so_hoc_phan];
		String[] _diem_hp = new String[so_hoc_phan];
		
		for (int i = 0; i < so_hoc_phan; i++) {
			int temp = i + 1;
			System.out.println("Nhập tên học phần[" + temp + "]: ");
			_ten_hp[i] = scanner.nextLine();
			_diem_hp[i] = "--";
		}
		
		this.id = _id;
		this.name = _name;
		this.birthday = _birth;
		this.ten_hoc_phan = _ten_hp;
		this.diem_hoc_phan = _diem_hp;
	}
	
	public void nhapDiem() {
		Scanner scanner = new Scanner(System.in);
		String[] _diem_hp = new String[so_hoc_phan];
		
		for (int i = 0; i < so_hoc_phan; i++) {
			if (diem_hoc_phan[i] != "--") {
				_diem_hp[i] = new String(diem_hoc_phan[i]);
			}
			else {
				System.out.println("Nhập điểm học phần [" + ten_hoc_phan[i] + "]: (Thang điểm A,B+,..)");
				_diem_hp[i] = scanner.nextLine();
			}
		}
		
		for (int i = 0; i < _diem_hp.length; i++) {
			switch (_diem_hp[i]) {
			case "a": {_diem_hp[i] = "A"; break; }
			case "b+": {_diem_hp[i] = "B+"; break; }
			case "b": {_diem_hp[i] = "B"; break; }
			case "c+": {_diem_hp[i] = "C+"; break; }
			case "c": {_diem_hp[i] = "C"; break; }
			case "d+": {_diem_hp[i] = "D+"; break; }
			case "d": {_diem_hp[i] = "D"; break; }
			case "f": {_diem_hp[i] = "F"; break; }
			default : break;
			}
		}
		
		this.diem_hoc_phan = _diem_hp;
	}
	
	public String toString() {
		String chuoi_hoc_phan = new String();
		for (int i = 0; i < so_hoc_phan; i++) {
			chuoi_hoc_phan += ten_hoc_phan[i];
			chuoi_hoc_phan += ": ";
			chuoi_hoc_phan += diem_hoc_phan[i];
			chuoi_hoc_phan += "\n";
		}
		return "MSSV: " + id + "\n" +
				"Tên: " + name + "\n" +
				"Ngày sinh: " + birthday.toString() + "\n" +
				"Số học phần: " + so_hoc_phan + "\n" +
				"Học phần:\n" + chuoi_hoc_phan + "\n"
				;
	}
	
	public void dangKyHP() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hãy nhập tên học phần muốn đăng ký:");
		String _name = new String(); // Tên học phần đăng ký
		_name = scanner.nextLine();
		so_hoc_phan += 1;
		String[] new_ten_list = new String[so_hoc_phan];
		String[] new_diem_list = new String[so_hoc_phan];
		
		for (int i = 0; i < new_ten_list.length; i++) {
			if (i==new_ten_list.length-1) {
				new_ten_list[i] = new String(_name);
				new_diem_list[i] = "--";
			}
			else {
				new_ten_list[i] = new String(ten_hoc_phan[i]);
				new_diem_list[i] = new String(diem_hoc_phan[i]);
			}
		}
		
		ten_hoc_phan = new_ten_list;
		diem_hoc_phan = new_diem_list;
	}
	
	public void xoaHP() {
		Scanner scanner = new Scanner(System.in);
		int num;
		
		System.out.println("Hãy nhập số thứ tự của học phần muốn xóa:");
		for (int i = 0; i < so_hoc_phan; i++) {
			int temp = i+1;
			System.out.println("["+temp+"]: " + ten_hoc_phan[i]);
		}
		
		num = Integer.parseInt(scanner.nextLine());
		
		for (int i=num-1; i<so_hoc_phan-1; i++) {
			ten_hoc_phan[i] = ten_hoc_phan[i+1];
			diem_hoc_phan[i] = diem_hoc_phan[i+1];
		}
		so_hoc_phan -= 1;
		System.out.println("Đã xóa!!");
	}
	
	private float doiDiem(String point) {
		float diem = 0;
		switch (point) {
		case "A": { diem = 4.0f; break; }
		case "B+": { diem = 3.5f; break; }
		case "B": { diem = 3.0f; break; }
		case "C+": { diem = 2.5f; break; }
		case "C": { diem = 2f; break; }
		case "D+": { diem = 1.5f; break; }
		case "D": { diem = 1f; break; }
		case "F": { diem = 0; break; }
		default:
			throw new IllegalArgumentException("Unexpected value: " + point);
		}
		return diem;
	}
	public float diemTB() {
		float tong_diem = 0;
		float diemtb = 0;
		for (int i = 0; i < diem_hoc_phan.length; i++) {
			tong_diem += doiDiem(diem_hoc_phan[i]);
		}
		diemtb = tong_diem / diem_hoc_phan.length;
		return diemtb;
	}
	
	public String get_name() {
		return name;
	}
	
	public void hienThiDiem() {
		System.out.println("Thông tin điểm của SV:");
		for (int i = 0; i < diem_hoc_phan.length; i++) {
			System.out.println("HP: " + ten_hoc_phan[i] + " Điểm: " + diem_hoc_phan[i]);
		}
		System.out.println("Điểm trung bình: " +    diemTB());
	}
	
}
