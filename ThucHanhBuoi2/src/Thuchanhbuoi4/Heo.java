package Thuchanhbuoi4;

public class Heo extends ConVat{
	String name = new String("Heo");
	public void Keu() {
		System.out.println("Kêu: ộp ộp");
	}
	
	public void NhapThongTin() {
		System.out.println("Hãy nhập thông tin cho Heo");
		super.NhapThongTin();
	}
	
	public void HienThongTin() {
		System.out.println("Thông tin cho Heo");
		super.HienThi();
	}
}