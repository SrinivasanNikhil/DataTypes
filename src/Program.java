import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		
		//Declare person objects here
		
		Person person1 = new Person("Nikhil Dewars",40 , "MIS", 3.9);
		Person person2 = new Person("Mark Budweiser",23 , "MIS", 3.2);
		Person person3 = new Person("Craig Appletons",25 , "MIS", 3.0);
		Person person4 = new Person("Jim Beam",20 , "Finance", 3.7);
		Person person5 = new Person("Jack Daniels",19 , "Accounting", 2.9);
				
		
		
		//this part of the code is going to be changing the gpa of person1 to person5 based on user input
		//Present the user with the following message and take a response from the user
		//Type in whose gpa you would like to change > 
		//Present the user with the following message and take a response from the user
		//Type in what you would like their gpa to change to >
		//based on the integer input 1 to 5, pick the right individual i.e. use conditionals to determine who the individual
		//
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Type in a person number whose gpa you would like to change > ");
		int personSelect = scan.nextInt();
		
		System.out.println("Type in the gpa you would like the person's to be >");
		double newGPA = scan.nextDouble();
		
		//Based on the input of personSelect, write the set of conditional checks that will
		//a. print out a message if the personSelect is less than 1 and greater than 5 that says that "The number picked is invalid"
		//b. is personSelect is valid, then the right person's GPA is set to the newGPA and their information is printed out.
		
		
		if(personSelect == 1)
		{
			person1.setGpa(newGPA);
			person1.printInfo();
		}
		else if(personSelect == 2)
		{
			person2.setGpa(newGPA);
			person2.printInfo();
		}
		else if(personSelect == 3)
		{
			person3.setGpa(newGPA);
			person3.printInfo();
		}
		else if(personSelect == 4)
		{
			person4.setGpa(newGPA);
			person4.printInfo();
		}
		else if(personSelect == 5)
		{
			person5.setGpa(newGPA);
			person5.printInfo();
		}
		else
		{
			System.out.println("Please select a person number between 1 and 5.");
		}
		
		
	}

}
