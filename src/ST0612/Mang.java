package ST0612;

public class Mang {
	public static void main(String[] arg) {
		int[] arrNumber = new int[3];
		arrNumber[0] = 10;
		arrNumber[1] = 11;
		arrNumber[2] = 12;

		ArrayModification(arrNumber);
		for (int number : arrNumber) {
			System.out.println(number);
		}
	}

	private static void ArrayModification(int[] arrNumber) {
		// TODO Auto-generated method stub
		arrNumber[0] = 100;
	}
}