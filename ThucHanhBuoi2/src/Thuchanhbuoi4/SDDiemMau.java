package Thuchanhbuoi4;

public class SDDiemMau {

	public static void main(String[] args) {
		DiemMau A = new DiemMau(5, 10, "trắng");
		DiemMau B = new DiemMau();
		A.HienThi();
		B.Nhap();
		B.doiDiem(10, 8);
		B.HienThi();
		B.GanMau("Vang");
		B.HienThi();
	}

}
