package ST0112;

public class NTO {
	public static void main (String []arg) {
		inSNT();
		countChanLe();
	}

	private static void countChanLe() {
		// TODO Auto-generated method stub
		
	}

	public static boolean checkNTo(int x) {
		if (x<2) {return false;}
		else {
			for(int i = 2; i <=Math.sqrt(x); i++) {
				if(x%i ==0)
					return false;
			}
		}
		return true;
		 
	}
	
	public static void inSNT() {
		for (int x = 1; x<=100; x++) {
			if(checkNTo(x))
				System.out.print( x + "  ");
		}
		//System.out.println();
	}
	
	
}
