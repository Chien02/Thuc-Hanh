import java.util.Scanner;

public class Diem {
	
	private int x,y;
	
	public Diem() {
		this.x = 0;
		this.y = 0;
	};
	
	public Diem(int x, int y) {
		this.x = x;
		this.y = y;
	};
	
	void nhapDiem() {
		boolean flag = false;
		Scanner scanner = new Scanner(System.in);
		while (!flag) {
			try {
				x = Integer.parseInt(scanner.nextLine());
				y = Integer.parseInt(scanner.nextLine());
				flag = true;
			}
			catch (Exception e) {
				scanner.nextLine();
				System.out.println("Lỗi nhập, hãy nhập lại");
			}
		}
		scanner.close();
	};
	
	void hienThi() {
		System.out.println("(" + this.x + "," + this.y + ")");
	};
	
	void doiDiem(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	};
	
	int giaTriX() {
		return this.x;
	};
	
	int giaTriY() {
		return this.y;
	};
	
	float khoangCach() {
		return (float)Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	};
	
	float khoangCach(Diem d) {
		return (float)Math.sqrt(Math.pow((this.x - d.giaTriX()), 2) + Math.pow((this.y - d.giaTriY()), 2));
	};
	
	
	

}