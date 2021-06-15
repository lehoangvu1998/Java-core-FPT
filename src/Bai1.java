import java.util.Scanner;

public class Bai1 {
	
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		try {
			System.out.print(" Nhập tên sinh viên :");
			String name = sc.nextLine();
			System.out.print(" Nhập vào điểm sinh viên : ");
			double mark = sc.nextDouble();
			System.out.println("Tên sinh viên " + name );
			System.out.println("Điểm của sinh viên " + name + " là " + mark);
		} catch (Exception e) {
			System.out.println(" Sai data vào ");
		}
	}

}
