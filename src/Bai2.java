import java.util.Scanner;

public class Bai2 {

	static Scanner scanner = new Scanner(System.in); 
	public static void main(String[] args) {
		try {
			 double cd, cr, cv, dt, cnn;
			 System.out.print( "Nhập vào chiều dài :");
			 cd = scanner.nextDouble();
			 System.out.print(" Nhập vào chiều rộng :");
			 cr = scanner.nextDouble();
			 cv = (cd + cr)*2;
			 dt = cd * cr;
			 cnn = Math.min(cd, cr);
			 System.out.println(" Chu vi hình chữ nhật là :" + cv);
			 System.out.println(" Diện tích hình chữ nhật là :" + dt);
			 System.out.println(" Cạnh nhỏ nhất hình chữ nhật là :" + cnn);
		} catch (Exception e) {
			System.out.println(" Sai data ");
		}
	}

}
