import java.util.Scanner;

public class SDPhanso {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		PhanSo a = new PhanSo(3, 7);
		PhanSo b = new PhanSo(4, 9);
		PhanSo x = new PhanSo();
		PhanSo y = new PhanSo();
		
		
		a.hienThi();
		b.hienThi();
		
		
		x.nhapPhanSo();
		x.hienThi();
		y.nhapPhanSo();
		y.hienThi();
		System.out.print("Giá trị nghịch đảo của x: ");
		x.giaTriNgichDao().hienThi();
		System.out.print("Tổng hai ");
		x.cong(y).hienThi();
		
		
		System.out.println("Hãy nhập số lượng của mảng: ");
		try {
			n = Integer.parseInt(scanner.nextLine());
			
		} catch (Exception e) {
			System.out.println("Lỗi nhập");
		}
		
		PhanSo[] list = new PhanSo[n];
		for (int i = 0; i < n; i++) {
            list[i] = new PhanSo();
            list[i].nhapPhanSo();
        }
		
		hienThiList(list);
		
		timMax(list);
		
		sapXep(list);
		
		hienThiList(list);
		scanner.close();
	}
	
	private static void timMax(PhanSo[] _list ) {
		float max = _list[0].giaTri();
		int maxnum = 0;
		
		for (int i = 0; i < _list.length; i++) {
			if (max < _list[i].giaTri()) {
				max = _list[i].giaTri();
				maxnum = i;
			}
		}
		
		System.out.print("Số lớn nhất trong mảng là: ");
		_list[maxnum].hienThi();
	}
	
	private static void sapXep(PhanSo[] _list) {
		for (int i = 0; i < _list.length; i++) {
			for (int j = i; j < _list.length; j++) {
				if (_list[i].giaTri() > _list[j].giaTri()) {
					PhanSo temp = new PhanSo(_list[i].getTu(), _list[i].getMau());
					_list[i] = _list[j];
					_list[j] = temp;
				}
			}
		}
	}
	
	private static void hienThiList(PhanSo[] _list) {
		for (int i = 0; i < _list.length; i++) {
			System.out.print("list[" + i + "] ");
			_list[i].hienThi();
		}
	}
}