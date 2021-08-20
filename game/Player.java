package game;

import fixtures.Room;

/*
 * This class represents the player moving through these rooms.  The Player class has the property:
 * 
 * Room currentRoom: the room the player is currently in.
 */

public class Player {
	 Room currentRoom;
	 public boolean conditionEnd = true;
	 
	 public Room getCurrentRoom() {
		 return this.currentRoom;
	 }
	 
	 public void setCurrentRoom(Room location) {
		 currentRoom = location;
	 }
	 

}
