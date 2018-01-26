import java.util.Scanner;

public class MathWorks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		final double PI = 3.14;
		
		//Math class, its a static class since Math does not change
		
		int x = 10;
		int y = 20;
		
		System.out.println(Math.min(x, y));
		System.out.println(Math.max(x, y));
		
		System.out.print("Type in a number >");
		int aNumber = scan.nextInt();
		System.out.print("Type in another number >");
		int bNumber = scan.nextInt();
		
		System.out.println(Math.min(aNumber, bNumber));
		System.out.println(Math.pow(aNumber, bNumber));
		
		
		// Java automatically converts one type into another, called implicit casting
		
		int numberofKids = 8;
		int numberofCarers = 3;
		
		System.out.println("Kids per Carer : " + (numberofKids/numberofCarers));
		//in above case, deviding 2 ints gives you an int but change one of the to a double and you get a doubel result.
		//above is explicit casting, one data type into another
		System.out.println("Kids per Carer : " + ((double)numberofKids/numberofCarers));
		
		
		//variables are of 2 types primitives and objects
		//int double float char are all primitive data types, String is an object type
		//String data is an object
		
		//scan.next() vs scan.nextLine()
		
		
		
	}
	

}
