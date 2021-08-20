package game;

import java.util.Scanner;

public class Miscellaneous {

	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String input = scan.nextLine();
	
	String[] stringArray = input.split(" ", 2);
	
	for(String a : stringArray)
		System.out.println(a);
	
	
	}
	
	
}
