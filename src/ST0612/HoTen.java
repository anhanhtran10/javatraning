package ST0612;

//Cho 1 chuỗi 
public class HoTen {

	/*
	 * cho 1 chuỗi bất kì là họ tên của một người nào đó, hãy: - Kiem tra xem nguoi
	 * do có phai ten Trang không? - Tachs họ ten thanh 2 phan khac nhau. - Cat ho
	 * va ten cua nguoi nay thanh 2 phan bat ki bang 1 so ngau nhien
	 */

//indexOf()

public static void main (String[]arg ) {
	
	String fullname = "Nguyen Thi Trang";
	
			int firstSpace= fullname.indexOf(" ",0);
			String firstName = fullname.substring(0,firstSpace);
			System.out.println(firstName);

		

			int lastSpace= fullname.indexOf("",fullname.length());
			String lastName = fullname.substring(lastSpace+1, fullname.length());
			System.out.print(lastName);
			
}
}
/*String[] arrP = fullName.split(" ");
String ho = fullName.split(" ",0) ;
String ten = fullName.split(" ")[arrP.length -1];
System.out.println (ho);
System.out.println (ho);

/* Cat chuoi bat ki
Random rad = new Random();
int randomNumber = rad.nextInt(FullName.length());
String part1 = fullName.substring(0,) randomNumber);
system.out.println(part1);

*/