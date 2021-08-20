package fixtures;

/*
 * This class represents a room in the house.  It will extend fixtures.Fixture, and so will inherit the
 * descriptive properties.  The Room will also have the following properties:
 * 
 * Room[] exits: the rooms adjacent to this one.
 * 
 * This class should have a constructor that accepts a name, shortDescription, and longDescription.
 */

public class Room extends Fixture{

	//Variable Declaration
	public Room[] exits;
	public int room;
	
	//Test block
	String usableObject;
	
	public static int up = 0;
	public static int down = 1;
	public static int forward = 2;
	public static int aft = 3;
	
	public Room(String name, String shortDescription, String longDescription, String usableObject) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[4]; //Exits are up, forward, down, and aft.
	}
	
	public Room[] getExits(){
		System.out.println("Exits:\n");
		for(int i=0; i<this.exits.length;i++) {
			if(exits[i].name==("Null Room")) {
				System.out.println(" ");
			} else {
				System.out.println(exits[i].name);
			}
		}
		return exits;
	}
	
	public Room getExit(String direction) {
		switch(direction) {
		case "up":
			room = 0;
			break;
		case "down":
			room = 1;
			break;
		case "forward":
			room = 2;
			break;
		case "aft":
			room = 3;
			break;
		}
		return exits[room];
	}
	
	public Room[] setExits(Room a, Room b, Room c, Room d)
	{
		Room[] exitArray = {a,b,c,d};
		return exitArray;
	}

	public String getUsableObject() {
		return usableObject;
	}

	public void setUsableObject(String usableObject) {
		this.usableObject = usableObject;
	}

}
