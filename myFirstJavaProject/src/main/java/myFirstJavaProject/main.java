package myFirstJavaProject;

import java.util.Scanner; 

public class main {

	/*	Starting point	
	 * 
	 *  Runner 
	 * 	Slide 11
	 * 	Slide 18-19
	 * */
	public static void main(String[] args) {
		
	String name = "Nassif was here";
		
//	 Execute statement 
	
//	System.out.print("Hello! "+name);
//	System.out.print("Hello!");
	
	
//	whole numbers 
	int number = 120;
// 	wrapper class 
	Integer num = 203;
	
	double radius; 
	double area; 
	
//	Assign a value	
	radius = 20;
	
	//Relational Operators
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
//	Compute area
	area = radius * radius * 3.14159;
	
//	get the result
	
	
	
	
	
	
	
	
	System.out.println("The area is " + radius + " is " + area);

	System.out.println(7==7);
	System.out.println(7!=7);
	System.out.println(7>=7);
	System.out.println(7<=7);
	
// conditional Operators
// and && : both have to be true 
	System.out.println(6>7 && 7 > 6);
	System.out.println(6>7 || 7 > 6);
// OR || : only one has to be true or false
	System.out.println(6 > 7 || 7 > 6);
	
//	Scanner is a class to help us get user input
// 
	Scanner userInput = new Scanner(System.in);
	// 
	System.out.println("Enter your name: ");
	String firstName = userInput.nextLine();
	// print out what the user entered
	System.out.println("My name is "+firstName);
	
	
	
	// close the scanner 
	userInput.close();
	
	
	
	
	
	
	
	
	
	}

}








