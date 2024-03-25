package Thuchanhbuoi3;

import java.util.Scanner;

public class SDGach {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 0; // Số loại gạch sẽ nhập vào
		int D = 5; // Chiều dài đề cho
		int N = 20; // Chiều rộng đề cho
		boolean flag = false;
		
		System.out.println("Hãy nhập số loại gạch sẽ nhập:");
		while (!flag) {
			try {
				n = Integer.parseInt(scanner.nextLine());
				flag = true;
			} catch (Exception e) {
				System.out.println("Lỗi, hãy nhập lại n");
			}
		}
		
		
		//Khai báo
		Gach[] list_gach = new Gach[n];
		
		// Nhập
		for (int i = 0; i < list_gach.length; i++) {
			list_gach[i] = new Gach();
			list_gach[i].nhapThongTin();
		}
		
		// Hiển thị list
		for (int i = 0; i < list_gach.length; i++) {
			list_gach[i].hienThi();
		}
		
		// Hiển thị hộp chi phí min
		long min_cost = list_gach[0].chiPhiLot();
		int save_num = 0;
		for (int i = 1; i < list_gach.length; i++) {
			if (min_cost > list_gach[i].chiPhiLot()) {
				min_cost = list_gach[i].chiPhiLot();
				save_num = i;
			}
		}
		System.out.println("Loại gạch có chi phí lót thấp nhất: mã " + list_gach[save_num].get_maso());
		
		// Hiển thị list chi phi mua gạch
		for (int i = 0; i < list_gach.length; i++) {
			list_gach[i].chiPhiMuaGach(D, N);
		}
		scanner.close();
	}

}
