package Thuchanhbuoi3;
import java.util.Scanner;

public class Diem {
	
	protected int x,y;
	
	public Diem() {
		this.x = 0;
		this.y = 0;
	};
	
	public Diem(int x, int y) {
		this.x = x;
		this.y = y;
	};
	
	public Diem(Diem a) {
		this.x = a.x;
		this.y = a.y;
	}
	
	public void nhapDiem() {
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
	};
	
	public void hienThi() {
		System.out.println("(" + this.x + "," + this.y + ")");
	};
	
	public void doiDiem(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	};
	
	protected int giaTriX() {
		return this.x;
	};
	
	protected int giaTriY() {
		return this.y;
	};
	
	protected float khoangCach() {
		return (float)Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	};
	
	protected float khoangCach(Diem d) {
		return (float)Math.sqrt(Math.pow((this.x - d.giaTriX()), 2) + Math.pow((this.y - d.giaTriY()), 2));
	};

}
