package Thuchanhbuoi3;

public class SDDoanThang {

	public static void main(String[] args) {
		Diem A = new Diem(2, 5);
		Diem B = new Diem(20, 35);
		
		DoanThang AB = new DoanThang(A, B);
		System.out.println("Đoạn thẳng AB:");
		AB.hienThiDoanThang();
		AB.tinhTien(5, 3);
		System.out.println("AB sau khi tịnh tiến đi đoạn (5,3): ");
		AB.hienThiDoanThang();
		
		DoanThang CD = new DoanThang();
		System.out.println("Hãy nhập đoạn thẳng CD:");
		CD.nhapDoanThang();
		System.out.println("Đoạn thẳng CD:");
		CD.hienThiDoanThang();
		System.out.println("Độ dài CD: " + CD.doDai());
		System.out.println("Góc của CD: " + CD.goc());
	}

}
