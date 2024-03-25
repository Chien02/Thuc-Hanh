
public class SDDiem {

	public static void main(String[] args) {
		Diem A = new Diem(3,4);
		Diem B = new Diem();
		Diem C = new Diem();
		
		System.out.printf("Tọa độ điểm A: "); 
		A.hienThi();
		
		B.nhapDiem();
		System.out.printf("Tọa độ điểm B: "); 
		B.hienThi();
		
		C.doiDiem(B.giaTriX()*-1, B.giaTriY()*-1);
		System.out.printf("Tọa độ điểm C: "); 
		C.hienThi();
		
		System.out.printf("Khoảng cách từ B đến tâm O: %.3f\n", B.khoangCach());
		System.out.printf("Khoảng cách từ A đến tâm B: %.3f\n", A.khoangCach(B));
	}

}
