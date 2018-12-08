package ST0112;

//Bài 01: Tạo method kiểm tra một số truy�?n vào có phải là số nguyên tố hay không?

//Bài 02: Sử dụng method được tạo ra từ bài 01 liệt kê tất cả các số nguyên tố từ 01-100.

//Bài 03: �?ếm xem có bao nhiêu số nguyên tố từ 01 đến 100 là số chẵn, số lẻ

public class SoNguyento {
	
	public static void main(String[] arg) {
		System.out.println("Cac so nguyen to tw 1 den 100: ");
		inSNT();
		count();

	}
	
	public static boolean checkNto(int x) {
		if (x<2) {return false;}
		else {
			for(int i = 2; i <=Math.sqrt(x); i++) {
				if(x%i ==0)
					return false;
			}
		}
		return true;
		 
	}
	
	public static boolean checkChan(int x) {
		if (x % 2 == 0)
			return true;
		else
			return false;
	}

	public static void count() {
		int countChan = 0, countLe = 0;
		for (int x = 1; x <= 100; x++) {
			if (checkNto(x) && checkChan(x)) {
				countChan = countChan + 1;
			} else if (checkNto(x) && checkChan(x) == false) {
				countLe = countLe + 1;
			}
		}
		System.out.println();
		System.out.println("So cac so NT chan = " + countChan);
		System.out.println("So cac so NT le = " + countLe);
	}


	
	public static void inSNT() {
		for (int x = 1; x<=100; x++) {
			if(checkNto(x))
				System.out.print( x + "  ");
		}
	}

	

}
