package Thuchanhbuoi4;

public class De extends ConVat{
	String name = new String("Dê");
	public void Keu() {
		System.out.println("Kêu: Be ee eeeeee");
	}
	
	public void NhapThongTin() {
		System.out.println("Hãy nhập thông tin cho Dê");
		super.NhapThongTin();
	}
	
	public void HienThongTin() {
		System.out.println("Thông tin cho Dê");
		super.HienThi();
	}
}
