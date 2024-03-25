package Thuchanhbuoi3;

import java.util.Scanner;
import java.util.Arrays;

public class SDSinhVien {

	public static void main(String[] args) {
		SinhVien A = new SinhVien();
		A.nhapThongTin();
		A.nhapDiem();
		System.out.println(A.toString());
		
		A.dangKyHP();
		System.out.println(A.toString());
		A.xoaHP();
		System.out.println(A.toString());
		A.nhapDiem();
		System.out.println(A.toString());
		
		var diem_tb = A.diemTB();
		System.out.println("Điểm trung bình: " + diem_tb);
		
		// Danh sách sinh viên
		int k,n = 0; // Số lượng sinh viên
		float max_score = 0f;
		int save_num = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hãy nhập số lượng sinh viên trong danh sách!");
		n = Integer.parseInt(scanner.nextLine());
		
		String[] listTen = new String[n];
		SinhVien[] listSV = new SinhVien[n];
		SinhVien[] listCanhCao = new SinhVien[n];
		for (int i = 0; i < listSV.length; i++) {
			listSV[i] = new SinhVien();
			listSV[i].nhapThongTin();
			listSV[i].nhapDiem();
		}
		
		// Tìm sinh viên cảnh cáo học vụ Giả sử dưới 1 điểm là bị cảnh cáo học vụ đối với mọi sinh viên
		k = 0;
		save_num = 0;
		
		for (int i = 0; i < listSV.length; i++) {
			if (listSV[i].diemTB() <= 1.0f) {
				listCanhCao[k] = new SinhVien(listSV[i]);
				k++;
			}
			if (max_score < listSV[i].diemTB()) {
				max_score = listSV[i].diemTB();
				save_num = i;
			}
			listTen[i] = listSV[i].get_name();
		}
		System.out.println("-------------");
		if (listCanhCao.length >= 1) {
			System.out.println("Danh sách sinh viên bị cảnh cáo học vụ:");
			for (int i = 0; i < listCanhCao.length; i++) {
				if (listCanhCao[i] != null) {
					System.out.println("Sinh viên: " + listCanhCao[i].get_name());
				}
			}
		}
		else {
			System.out.println("Không có sinh viên nào bị cảnh cáo học vụ");
		}
		System.out.println("-------------");
		// Sinh viên điểm trung bình cao nhất
		System.out.println("Sinh viên có điểm trung bình cao nhất: " + listSV[save_num].get_name());
		
		System.out.println("-------------");
		System.out.println("Danh sách sinh viên theo thứ tự alphabet");
		// Hiển thị danh sách tên sinh viên theo thứ tự bảng chữ cái
		Arrays.sort(listTen);
		for (int i = 0; i < listTen.length; i++) {
			System.out.println("Sinh viên: " + listTen[i]);
		}
	}

}
