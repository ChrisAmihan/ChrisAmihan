//Chris Amihan
//Project A

package main;
/*
 * The purpose of this code is to convert units based on user input where the user
 * utilizes a menu option.  There are four menu options for the user to choose from.
 * 
 * 1. Conversion from cups to teaspoons
 * 2. Conversion from miles to kilometers
 * 3. Conversion from US Gallons to Imperial Gallons
 * 4. Quit and End program
 * 
 * If they choose options 1 through 3 they will input a double value using the scanner.  The program
 * will convert their unit and display both the first value and the second converted value.  The user
 * will be able to convert as many times as they want until they exit the program.
 */

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		
		//variable declaration
		
		String yesOrNo;
		
		Converter ctr = new Converter();
		
		Scanner scan = new Scanner(System.in);
		
		//Print out menu options for user to choose from
		ctr.printMenu();
		
		//This is where user enters in a menu option.
		int menuSelection = scan.nextInt();
		
		System.out.println("You have chosen option " + menuSelection );
		
		/*
		 * The user will now have to enter in a value to be converted based on his menuSelection.
		 * Unless the user chooses option 4 the user will be able to convert as many units as
		 * they want continuously.  If user chooses option 4 the program will terminate.
		 */
		
		while(menuSelection != 4) {
			switch(menuSelection) {
			case 1:{
				System.out.println("Enter in number of cups: ");
				double cups = scan.nextDouble();
				double tsps = ctr.convertCupsToTeaspoons(cups);//invoke conversion method to tsps
				System.out.println(cups + " cups equals " + tsps + " teaspons");
				System.out.println("Would you like to make another conversion?  Hit y for yes or n for no");
				yesOrNo = scan.next();
				if (yesOrNo.equals("y")){
					System.out.println("Choose another option");
					ctr.printMenu();//display menu
					menuSelection = scan.nextInt();//input value 1 through 4
				} else { 
					menuSelection = 4;//quit program
				}
				break;
			}
			case 2:{
				System.out.println("Enter in number of miles: ");
				double miles = scan.nextDouble();
				double km = ctr.convertMilesToKilometers(miles);//invoke conversion method to kilometers
				System.out.println(miles + " miles equals " + km + " kilometers");
				System.out.println("Would you like to make another conversion?  Hit y for yes or n for no");
				yesOrNo = scan.next();
				if (yesOrNo.equals("y")){
					System.out.println("Choose another option");
					ctr.printMenu();//display menu
					menuSelection = scan.nextInt();//input value 1 through 4
				} else { 
					menuSelection = 4;//quit program
				}
				break;
			}
			case 3:{
				System.out.println("Enter in number of US Gallons: ");
				double usGal = scan.nextDouble();
				double impGal = ctr.convertUSGallonsToImperialGallons(usGal);//invoke conversion method to imperial gallons
				System.out.println(usGal + " US Gallons equals " + impGal + " Imperial Gallons");
				System.out.println("Would you like to make another conversion?  Hit y for yes or n for no");
				yesOrNo = scan.next();
				if (yesOrNo.equals("y")){
					System.out.println("Choose another option");
					ctr.printMenu();//display menu
					menuSelection = scan.nextInt();//input value 1 through 4
				} else { 
					menuSelection = 4;//quit program
				}
				break;
			}
			default:{
				System.out.println("Please choose a number 1 through 4."); //If user inputs anything besides 1-4 they must re-enter in a correct value
				menuSelection = scan.nextInt();
			}
		}
			
		}
		
		System.out.println("Have a nice day!  Goodbye!");
		
		//close scanner
		scan.close();

	}
	
	//method for menu options
	public void printMenu() {
		System.out.println("Please select an option: \n1. Cups to Teaspoons\n2. Miles to Kilometers"
				+ "\n3. US Gallons to Imperial Gallons\n4. Quit");
	}
	
	
	//create method to convert Cups to Teaspoons
	public double convertCupsToTeaspoons(double qty1) {
		//input conversion here
		qty1 = qty1*48;
		//System.out.println(cups + " cups is equal to " + qty1 + " teaspons ");
		return qty1;
	}
	
	//create method to convert miles to kilometers
	public double convertMilesToKilometers(double qty2) {
		//input conversion here
		qty2 = qty2*1.60934;
		return qty2;
	}
	
	//create method to convert US gallons to imperial gallons
	public double convertUSGallonsToImperialGallons(double qty3) {
		//input conversion here
		qty3 = qty3*0.832674;
		return qty3;
	}

}

/*improvements to this code could be to add more unit conversions, ignoring the case on the yes or no input,
 * or utilizing more methods
 */
