package Thuchanhbuoi4;

public class SDConVat {

	public static void main(String[] args) {
		Bo bo = new Bo();
		Ga ga = new Ga();
		De de = new De();
		Heo heo = new Heo();
		
		bo.NhapThongTin();
		heo.NhapThongTin();
		de.NhapThongTin();
		ga.NhapThongTin();
		
		bo.HienThongTin();
		bo.Keu();

		de.HienThongTin();
		de.Keu();

		heo.HienThongTin();
		heo.Keu();

		ga.HienThongTin();
		ga.Keu();
	}

}
