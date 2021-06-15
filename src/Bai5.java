
public class Bai5 {

	public static void main(String[] args) {
		try {
			System.out.print(" Nhập vào hệ số a ");
			float a = Import.scanner.nextFloat();
			System.out.print(" nhập vào hệ số b ");
			float b = Import.scanner.nextFloat();
			if (a == 0) {
				if (b == 0) {
					System.out.println(" Phương trình vô số nghiệm");
				} else {
					System.out.println(" Phương trình vô nghiệm ");
				}
			} else {
				float x = -b / a;
				System.out.print(" Nghiệm của PT x " + x);
			}
		} catch (Exception e) {
			System.out.println("Sai data");
		}
	}

}
