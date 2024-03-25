import java.util.Scanner;

public class Date {
	private int ngay, thang, nam;
	
	public Date() {
		ngay = 0;
		thang = 0;
		nam = 0;
	};
	
	public Date(int ngay, int thang, int nam) {
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	};
	
	public void hienThi() {
			if (ngay < 10) {
				if (thang < 10) {
					System.out.println("Ngay 0" + ngay + "/0" + thang + "/" + nam);
				}
				else {
					System.out.println("Ngay 0" + ngay + "/" + thang + "/" + nam);
				}
			}
			else {
				if (thang < 10) {
					System.out.println("Ngay " + ngay + "/0" + thang + "/" + nam);
				}
				else {
					System.out.println("Ngay " + ngay + "/" + thang + "/"  + nam);
				}
			}
		
	};
	
	public boolean hopLe() {
		boolean check = true;
		switch(thang) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
		case 10:
		case 12:
			if (ngay < 1 || ngay > 31) {
				return false;
			}
			break;
		case 4:
		case 6:
		case 8:
		case 11:
			if (ngay < 1 || ngay > 30) {
				return false;
			}
			break;
		case 2:
			if (isNamNhuan()) { // Leap year
				if (ngay < 1 || ngay > 29) {
					return false;
				}
			}
			else {
				if (ngay < 1 || ngay > 28) {
					return false;
				}
			}
			break;
		default: break;
		}
		return check;
	};
	
	public Date ngayHomSau() {
		this.ngay++;
		switch (ngay) {
		case 32:
			ngay = 1;
			thang++;
			if (thang > 12) {
				thang = 1;
				nam++;
			}
			break;
		case 31:
			if (this.hopLe() == false) {
				resetNgay();
			}
			break;
		case 30:
			if (this.hopLe() == false) {
				resetNgay();
			}
			break;
		case 28:
			if (this.hopLe() == false) {
				resetNgay();
			}
		}
		return this;
	};
	
	public Date congNgay(int n) {
		ngay += n;
		while (ngay > 31) {
			ngay -= 30;
			thang++;
		}
		if (thang > 12) {
			thang = 1;
			nam++;
		}
		if (thang == 2 && ngay >= 29) {
			if (isNamNhuan() == true) {
				ngay -= 29;
				if (ngay == 0) {
					ngay += 29;
					thang--;
				};
			}
			else if (thang == 2 && ngay >= 28) {
				ngay -= 28;
				if (ngay == 0) {
					ngay += 28;
					thang--;
				};
			}
			thang++;
		}
		return this;
	};
	
	private void resetNgay() {
		ngay = 1;
		thang++;
	};
	
	
	private boolean isNamNhuan() {
		if (nam % 4 == 0 && nam % 100 == 0 || nam % 400 == 0) { // Leap year
			return true;
		}
		return false;
	};
	
	public void nhapNgay() {
		Scanner scanner = new Scanner(System.in);
		boolean flag = false;
		System.out.println("Hãy nhập ngày tháng năm:");
		while (flag == false) {
			try {
				ngay = scanner.nextInt();
				thang = scanner.nextInt();
				nam = scanner.nextInt();
				flag = true;
			}catch (Exception e) {
				System.out.println("Lỗi cú pháp, hãy nhập lại");
				scanner.nextLine();
			}
		}
		scanner.nextLine();
		scanner.close();
	}
	
}
