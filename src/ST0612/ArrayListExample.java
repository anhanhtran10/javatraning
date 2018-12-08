package ST0612;

import java.util.ArrayList;
import java.util.Random;

// Tao 1 danh sach (array/arrayList) gom 10 phan tu
//su dung ham Random nhap du lieu cho danh sach
//Dem co bao nhieu so chan, bao nhieu so le?
public class ArrayListExample {
	/*
	 * public static void main(String[] args) { ArrayList arrNumber = new
	 * ArrayList(); // ArrayList <Integer>arrNumber = new ArrayList<Integer>();
	 * arrNumber.add(10); arrNumber.add(20); arrNumber.add(30); /* for (Object obj :
	 * arrNumber) { // for (Integer obj : arrNumber) { System.out.println(obj); }
	 * 
	 * int count = arrNumber.size(); for(int i = 0; i< count; i++) {
	 * System.out.println(arrNumber.get(i)); } }
	 */
	public static void main (String[]arg) {
	int countChan = 0, countLe = 0;
	ArrayList<Integer> arr = new ArrayList<Integer>();
	Random rd = new Random();
	for(int i = 0;i<10;i++)
	{
		int number = rd.nextInt(100);
		arr.add(number);
	}

	// print to check
	//for(int number:arr)
	for(int i = 0; i< 10; i++)
	{
		System.out.println(number);
		// count chan le
		//if (number % 2 == 0)
		if (arr.get(i)%2 ==0))
			countChan++;
		else
			countLe++;
	}
	System.out.println("so so chan la:" + countChan);
	System.out.println("So so le la: " + countLe);

}
}