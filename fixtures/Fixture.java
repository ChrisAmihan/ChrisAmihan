package fixtures;

/*
 * This abstract class will be used as a base for anything that can be looked at or interacted with.  This
 * class should define (at least) the following properties:
 * 
 * String name: a short name/title for the fixture
 * String shortDescription: a one-sentence-long description of fixture
 * String longDescription: a paragraph-long description of the thing
 * 
 */

public abstract class Fixture {
	
	//Variable Declaration
	
	String name;
	String shortDescription;
	String longDescription;
	
	
	public Fixture(String name, String shortDescription, String longDescription) {
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

}
