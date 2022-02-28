package Intro;
// Import package
import java.util.Scanner;

public class SimplePrint {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		// type integer number and print out
		System.out.print("Type integer number (Ex: 1, 3, -5, ..):");
		int intNumber = sc.nextInt();
		System.out.println("Your input:" + intNumber + "\n");
		
		// type real number and print out
		System.out.print("Type real number (Ex: 1.1, 3.5, -5.2, ..):");
		double reNumber = sc.nextDouble();
		System.out.println("Your input:" + reNumber + "\n");
		
		// type string and print out
		System.out.println("Type string (Ex: I love you so much, ...:)");
		String message = sc.nextLine();
		System.out.println("Your input:" + message + "\n");
		
		// type boolean (true or false) and print out
		System.out.println("Type boolean (true or false):");
		boolean your = sc.nextBoolean();
		System.out.println("Your input:" + your + "\n");
	}
}