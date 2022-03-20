package week3.March_16;

class Animal2 {
	private String name;
	private int legs;
	private boolean isDangerous;
	private boolean haveTail;
	private String specialCharacters;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public boolean isDangerous() {
		return isDangerous;
	}

	public void setDangerous(boolean isDangerous) {
		this.isDangerous = isDangerous;
	}

	public boolean isHaveTail() {
		return haveTail;
	}

	public void setHaveTail(boolean haveTail) {
		this.haveTail = haveTail;
	}

	public String getSpecialCharacters() {
		return specialCharacters;
	}

	public void setSpecialCharacters(String specialCharacters) {
		this.specialCharacters = specialCharacters;
	}

	String details() {
		return "This animal name is " + this.name + ". this animal is human's best friend. "
				+ this.name.toUpperCase().charAt(0) + this.name.substring(1, this.name.length()) + " has " + this.legs
				+ " legs and Do they have tail??? " + this.haveTail + ". Are they dangerous??? " + this.isDangerous
				+ ". special characters are " + this.specialCharacters + ". \n";
	}
}

public class autoGenerateGettersSetters {
	public static void main(String[] args) {
		Animal2 dog = new Animal2();
		dog.setName("Dog");
		dog.setLegs(4);
		dog.setHaveTail(true);
		dog.setDangerous(true);
		dog.setSpecialCharacters("they have a strong smell instict" + " they are loyal to their owners or friends");
		System.out.println(dog.getName());
		System.out.println(dog.getLegs());
		System.out.println(dog.isDangerous());
		System.out.println(dog.isHaveTail());
		System.out.println(dog.getSpecialCharacters() + "\n");

		System.out.println(dog.details());
	}
}

//OUTPUT
/*
	Dog
	4
	true
	true
	they have a strong smell instict they are loyal to their owners or friends
	
	This animal name is Dog. this animal is human's best friend. Dog has 4 legs and 	Do they have tail??? true. Are they dangerous??? true. special characters are 	they have a strong smell instict they are loyal to their owners or friends. 
*/
