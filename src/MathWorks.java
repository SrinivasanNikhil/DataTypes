import java.util.Random;
import java.util.Scanner;

public class MathWorks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//final is a keyword used in front of attributes whose value does not change
		final double PI = (double) 22/7;
		
		final double SPEED_OF_LIGHT = 300000000; //
		
		System.out.println(PI);
		System.out.println(SPEED_OF_LIGHT);
		
		//Math class, its a static class since Math does not change
		//No need to make an object of the class
		//reading the documentation of a class, called its API
		
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
		
		final double SPEED_OF_LIGHT_1 =  3 * Math.pow(10, 8);
		
		
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
		
		String name = "Nikhil Srinivasan";
		String anotherName = "Akhil";
		
		//since String is an object , it has an associated class
				//String methods
					 // .equals, .contains, .toLowerCase, 
				
		
		System.out.println(name.equals("Nikhil"));
		
		System.out.println(name.equals(anotherName));
		
		
		//boolean a type of data, holds true and false values.
		
		
		//scan.next() vs scan.nextLine()
		//the Scanner class also has several methods, some of which we have seen
		
		System.out.print("Please type in a word >");
		String aWord = scan.next();
		
		//System.out.print("Please type in a sentence >");
		//String aSent = scan.next();
		
		System.out.print("Please type in a sentence >");
		String aSent = scan.nextLine();
		
		System.out.println(aWord);
		System.out.println(aSent);
		
		
		
		Random randomGen = new Random();
		
		int number = randomGen.nextInt();
		
		
		
		number = randomGen.nextInt(6);
		
		
		
		
		
		
	}
	

}
