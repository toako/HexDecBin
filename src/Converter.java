import java.util.Scanner;

public class Converter {

	//Imports scanner for getting input from user thru the console
	Scanner cons = new Scanner(System.in); //imports scanner class
	
	//FIELDS
	String num;
	String end;
	String format1 = "";
	String format2 = "";
	int f1 = 0;
	int f2 = 0;
	
	//Constructor for the program
	public Converter () {
		getInput();
		convert();
	}
	
	//CHECKS FOR INPUT VALIDITY AND PASSES CORRECT OUTPUTS
	private void getInput () {
		print("Welcome to my base converter program.");
		
		print("Please enter the number you'd like converted:");
		num = cons.nextLine(); //getting input for the number to convert
		print("What format is the number in? (3 options: HEX, DEC, BIN)");
		format1 = cons.nextLine(); //getting input for initial base
		print("What format would you like the number converted to? (3 options: HEX, DEC, BIN)");
		format2 = cons.nextLine(); //getting input for the desired base
			
		switch (format1) { //switch statement that evaluates the variable format1, turning text into a base to be calculated
			case "HEX":
				f1 = 16; //hex = base 16
				break;
			case "DEC":
				f1 = 10; //decimal = base 10
				break;
			case "BIN":
				f1 = 2; //binary = base 2
				break;
		}
		
		switch (format2) {
			case "HEX":
				f2 = 16;
				break;
			case "DEC":
				f2 = 10;
				break;
			case "BIN":
				f2 = 2;
				break;
		}
	}
	
	//CONVERTS NUMBER AND OUTPUTS IT TO THE CONSOLE
	private void convert () {
		int temp = Integer.parseInt(num, f1); //CONVERTING THE STRING THE USER INPUTTED AND TURNING IT INTO A DECIMAL FROM THE BASE THEY SPECIFIED
		end = Integer.toString(temp, f2); //CONVERTING THE INTEGER TO A STRING IN THE BASE SPECIFICED
		print("RESULT: " + end);
	}
	
	//METHOD THAT MAKES IT QUICKER TO TYPE OUT SYSTEM.OUT.PRINTLN BY PASSING A STRING MESSAGE AND OUTPUTTING IT THRU SAID COMMAND
	private void print (String message) {
		System.out.println(message);
	}
	
}
