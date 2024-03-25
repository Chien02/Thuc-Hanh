package Thuchanhbuoi4;

import java.util.Scanner;

public class SDSVCNTT {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hãy nhập số lượng sinh viên cho danh sách");
		int n = Integer.parseInt(scanner.nextLine());
		SinhVienCNTT[] SVList = new SinhVienCNTT[n];
		for (int i=0; i<n; i++) {
			SVList[i] = new SinhVienCNTT();
			SVList[i].Nhap();
		}
		
		System.out.println("Hãy nhập địa chỉ email bạn muốn tìm:");
		String finding_email = new String(scanner.nextLine());
		for (int i = 0; i < SVList.length; i++) {
			String _email = new String(SVList[i].getEmail());
			_email += "\n";
			if (finding_email.equals(SVList[i].getEmail())) {
				System.out.println("Đã tìm thấy sinh viên với email: "+finding_email);
				System.out.println("Thông tin sv");
				System.out.println(SVList[i].toString());
				SVList[i].hienThiDiem();
			}
		}
	}

}
