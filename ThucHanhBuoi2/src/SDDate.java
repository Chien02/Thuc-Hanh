
public class SDDate {

	public static void main(String[] args) {
		
		Date ngay = new Date();
		int ngaycongthem = 30;
		
		ngay.nhapNgay();
		ngay.hienThi();
		ngay.ngayHomSau().hienThi();
		ngay.congNgay(ngaycongthem).hienThi();
	}

}

