package ST0112;

import java.util.Scanner;

public class PhuongTrinhBac2 {
	
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập a =");
		double a = sc.nextDouble();
		System.out.print("Nhập b =");
		double b = sc.nextDouble();
		System.out.print("Nhập c =");
		double c = sc.nextDouble();

		double delta;

		delta = b * b - 4 * a * c;

		if (delta < 0) {
			System.out.println("vô nghiệm");

		} else if (delta == 0) {
			double x = (-b) / (2 * a);
			System.out.println("nghiệm kép là: " + x);
		}

		else if (delta > 0) {
			double x1 = (((-b) + Math.sqrt(delta)) / (2 * a));
			double x2 = (((-b) - Math.sqrt(delta)) / (2 * a));
			System.out.println("nghiệm là: " + x1 + "và " + x2);
		}

	}
	
	
}
