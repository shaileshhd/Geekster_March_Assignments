package week3.March_16;

class Animal {
	String name;
	int legs;
	boolean isDangerous;
	boolean haveTail;
	String specialCharacters;

	String details() {
		return "This animal name is " + this.name + ". this animal is human's best friend. "
				+ this.name.toUpperCase().charAt(0) + this.name.substring(1, this.name.length()) + " has " + this.legs
				+ " legs and Do they have tail??? " + this.haveTail + ". Are they dangerous??? " + this.isDangerous
				+ ". special characters are " + this.specialCharacters + ". \n";
	}
}

public class AnimalClassDemo {
	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.name = "dog";
		a1.legs = 4;
		a1.isDangerous = true;
		a1.haveTail = true;
		a1.specialCharacters = "they have a strong smell instict" + " they are loyal to their owners or friends";
		System.out.println(a1.details());
	}
}

//OUTPUT
/*
	This animal name is dog. this animal is human's best friend. Dog has 4 legs and Do they have tail??? true. Are they dangerous??? true. 	special characters are they have a strong smell instict they are loyal to their owners or friends.
*/