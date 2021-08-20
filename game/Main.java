package game;

//Version 1.0
/*
 * Major Improvements Needed: implement use, shout, and quit commands properly.
 * Handling getExits so hashcode doesnt get printed everytime its called
 * Calling and printing correct exit directions with exits.
 * Handling exceptions
 * 
 * Minor Improvements Needed: do not display room descriptions everytime an action is performed
 * and instead just perform relative action unless using an action like a look command which
 * would need to be implemented.
 * Many other things.
 */

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		//Variable Declaration
		//Menus MainMenu = new Menus();
		RoomManager rm = new RoomManager();
		rm.showIntro();
		Player player = new Player();
		rm.init();
		player.currentRoom = rm.startingRoom;
		System.out.println();
		Scanner scan = new Scanner(System.in);
		String input;
		input = null;
		
		
		//Main Loop
		//To end loop/game use "quit now"
		while(player.conditionEnd) {
			printRoom(player);
			System.out.println("Perform action.");
			input = scan.nextLine();
			String[] something = collectInput(input);
			parse(something, player);
		}
		
		scan.close();
	}
	
	private static void printRoom(Player player) {
		System.out.println(player.getCurrentRoom().getName() + "\n\n" + player.getCurrentRoom().getLongDescription() + "\n");
		System.out.println(player.getCurrentRoom().getExits());
		System.out.println("Usable Objects: " + player.getCurrentRoom().getUsableObject());
	}
	
	private static String[] collectInput(String input) {
		String[] stringArray = input.split(" ", 2);
		return stringArray;
	}
	
	
	//implement commands from player
	private static void parse(String[] command, Player player) {
		String action  = command[0];
		String direction = command[1];
		String msg = "";
		switch(action) {
		case "move":
			player.currentRoom = player.currentRoom.getExit(direction);
			break;
		case "shout":
			System.out.println("You cry out but no one answers...");
			break;
		case "use":
			System.out.println("What do you want to use?");
			break;
//		case "look":
//			look();
//			break;
		case "quit":
			System.out.println("Thanks for playing!");
			player.conditionEnd = false;
			break;
		default:
			msg = action + " action has not been defined.";
			System.out.println(msg);
			break;
		}
	}
	
	public void showStr(String s) {
		System.out.println(s);
	}
}
