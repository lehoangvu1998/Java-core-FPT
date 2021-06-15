import java.util.Scanner;

public class Bai3 {
	
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		try {
			double v, c;
			System.out.print(" Nhập vào cạnh của khối lập phương ");
			c = scanner.nextDouble();
			v = Math.pow(c, 3);
			System.out.println(" Thể tích của khối lập phương là : " +  v);
		} catch (Exception e) {
			System.out.println("sai data");
		}
	}
}
