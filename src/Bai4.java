import java.util.Scanner;

public class Bai4 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			System.out.print(" Nhập vào hệ số a ");
			float a = scanner.nextFloat();
			System.out.print(" Nhập vào hệ số b ");
			float b = scanner.nextFloat();
			System.out.print(" Nhập vào hệ số c ");
			float c = scanner.nextFloat();
			if (a == 0) {
				if (b == 0) {
					System.out.print(" Phương trình vô nghiệm ");
				} else {
					System.out.print(" Phương trình có 1 nghiệm " + " x = " + (-c / b));
				}
				return;
			}
			float delta = b * b - 4 * a * c;
			float x1, x2;
			if (delta > 0) {
				x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
				x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
				System.out.println("Phương trình có hai nghiệm " + " x1 = " + x1 + "  và  x2 = " + x2);
			} else if (delta == 0) {
				x1 = (-b / (2 * a));
				System.out.println(" Phương trình có nghiệm kép x1 = x2  :" + x1);
			} else {
				System.out.println(" Phương trình vô nghiệm");
			}
		} catch (Exception e) {
			System.out.println(" SAI DATA");
		}
	}

}
