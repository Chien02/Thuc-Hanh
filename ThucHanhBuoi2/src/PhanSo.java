import java.util.Scanner;

public class PhanSo {

	private int tuso, mauso;
	
	public PhanSo() {
		tuso = 0;
		mauso = 0;
	}
	
	public PhanSo(int _tuso, int _mauso) {
		tuso = _tuso;
		mauso = _mauso;
	}
	
	public void nhapPhanSo() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		boolean flag = false;
		System.out.println("Hãy nhập tử số và mẫu số:");
		while(!flag) {
			try {
				tuso = Integer.parseInt(scanner.next());
	            mauso = Integer.parseInt(scanner.next());
				flag = kiemTra();
			} catch (Exception e) {
				scanner.nextLine();
				System.out.println("Lỗi error, hãy nhập lại tử và mẫu");
			}
		}
//		scanner.close();
	}
	
	public void hienThi() {
		if (tuso == mauso) {
			tuso = 1;
			mauso = 1;
		}
		if (mauso < 0 && tuso < 0 || mauso < 0 && tuso > 0) {
			tuso *= -1;
			mauso *= -1;
		}
		if (tuso == 0 || mauso == 1 || mauso == -1) {
			
			System.out.println("Phân số: " + tuso);
		}
		else {
			System.out.println("Phân số: " + tuso + "/" + mauso);
		}
		
	}
	
	public void nghichDao() {
		int temp = tuso;
		tuso = mauso;
		mauso = temp;
	}
	
	public PhanSo giaTriNgichDao() {
		PhanSo _phanso = new PhanSo(tuso, mauso);
		_phanso.nghichDao();
		return _phanso;
	}
	
	public void ketQua() {
		System.out.println("Kết quả: " + (float)tuso/mauso); 
	}
	
	public boolean lonHon(PhanSo a) {
		return giaTri() > a.giaTri();
	}
	
	// Tính toán phân số với phân số
	public PhanSo cong(PhanSo a) {
		int _tu = a.getTu();
		int _mau = a.getMau();
		if (mauso != _mau) {
			int uocchung = timUCLN(mauso, a.getMau());
			tuso *= uocchung;
			mauso *= uocchung;
			_mau *= uocchung;
			_tu *= uocchung;
		}
		tuso += _tu;
		return this;
	};
	
	public PhanSo tru(PhanSo a) {
		int _tu = a.getTu();
		int _mau = a.getMau();
		if (mauso != _mau) {
			int uocchung = timUCLN(mauso, a.getMau());
			tuso *= uocchung;
			mauso *= uocchung;
			_mau *= uocchung;
			_tu *= uocchung;
		}
		tuso -= _tu;
		return this;
	};
	
	public PhanSo nhan(PhanSo a) {
		int _tu = a.getTu();
		int _mau = a.getMau();
		tuso *= _tu;
		mauso *= _mau;
		return this;
	};
	
	public PhanSo chia(PhanSo a) {
		int _tu = a.getTu();
		int _mau = a.getMau();
		tuso *= _mau;
		mauso *= _tu;
		return this;
	};
	
	//Tính toán phân số với phân số
	public PhanSo cong(int a) {
		PhanSo temp = new PhanSo(a*mauso, mauso);
		this.cong(temp);
		return this;
	};
	
	public PhanSo tru(int a) {
		PhanSo temp = new PhanSo(a*mauso, mauso);
		this.tru(temp);
		return this;
	};
	
	public PhanSo nhan(int a) {
		tuso *= a;
		return this;
	};
	
	public PhanSo chia(int a) {
		mauso *= a;
		return this;
	};
	
	public float giaTri() {
		return (float)tuso/mauso;
	}
	
	/// Phương thức tự thêm vào
	public int getTu() {
		int _tu = tuso;
		return _tu;
	}
	
	public int getMau() {
		int _mau = mauso;
		return _mau;
	}
	
	public int timUCLN(int a, int b) {
        // Đảm bảo a luôn lớn hơn b
        if (b == 0) {
            return a;
        } else {
            return timUCLN(b, a % b);
        }
    }
	
	private boolean kiemTra() {
		return mauso != 0;
	}
	
}
