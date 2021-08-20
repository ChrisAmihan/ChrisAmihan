package game;

import fixtures.Room;

/*
 * This class is responsible for "loading" our rooms into memory.  When game.Main is executed, it will
 * invoke the init() method in this class that will instantiate all our Room objects, link them together as
 * exits, and designate a startingRoom.
 */

public class RoomManager {

	Room startingRoom;
	Room[] rooms = new Room[4];
	
	public void showIntro() {
		String someString;
		someString = "---------------------------------------------------------\n"
				+ "         Welcome to the Submarine Mystery Game!\n\n"
				+ "This game utilizes three action items: move, shout, and use.\n"
				+ "The movement directions are up, down, forward, and aft.\n"
				+ "The action to quit is: quit now\n"
				+ "----------------------------------------------------------\n\n";
		System.out.println(someString);
	}
	
	public void init() {
//		System.out.println("Start of initialization");
		Room topside = new Room("Topside", "You are standing on top of a submarine", "You find yourself standing on a hard surface.\n"
				+ "You realize you are on a submarine surrounded by water.\n"
				+ "In front of you there is an open hatch which must lead inside.","hatch");
		rooms[0] = topside;
		
		Room nullRoom = new Room("Null Room", null, null, null);
		
		Room missileCompartment = new Room("Missile Compartment", "You are in the missile compartment", "You find yourself"
				+ "in a large room with giant tubes running down the center and with beds along the\n"
				+ "left wall.  There is a hatch leading forward at the front of the compartment and a\n"
				+ "hatch leading backwards aft of the compartment","beds");
		
		rooms[1] = missileCompartment;
		
		Room controlRoom = new Room("Control Room", "You are in the control room", "You have found a room with controls\n"
				+ "a periscope, and two steering wheels.","periscope");
		
		rooms[2] = controlRoom;
		
		Room engineRoom = new Room("Engine Room", "You are in the engine room", "You walk down a long pathway with a door\n"
				+ "on your right.  At the end of the room you see what must be the submarine's propulsion system.","door");
		
		rooms[3] = engineRoom;
		
		startingRoom = topside;
		
		//instantiate rooms with exits.  used a placeholder called nullRoom to prevent null pointer errors
		
		topside.exits = topside.setExits(nullRoom, missileCompartment, nullRoom, nullRoom);
		
		missileCompartment.exits = missileCompartment.setExits(topside, nullRoom, controlRoom, engineRoom);
		
		controlRoom.exits = controlRoom.setExits(nullRoom, nullRoom, nullRoom, missileCompartment);
		
		engineRoom.exits = engineRoom.setExits(nullRoom, nullRoom, missileCompartment, nullRoom);
		
	}
	
	public Room getFirstRoom() {
		return startingRoom;
	}
	

}
