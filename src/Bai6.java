import java.text.DecimalFormat;

public class Bai6 {

	public static void main(String[] args) {
		try {
			Long tien;
			DecimalFormat formatter = new DecimalFormat("###,###,###");
			System.out.print("Nhập vào số KW ");
			float kw = Import.scanner.nextFloat();
			if (kw < 50) {
				tien = (long) (kw * 1000);
				System.out.println(formatter.format(tien) + " VNĐ");
			} else {
				tien = (long) (50 * 1000 + (kw - 50) * 1200);
				System.out.println(formatter.format(tien) + " VNĐ");
			}
		} catch (Exception e) {
			System.out.println("SAI DATA");
		}
	}

}
