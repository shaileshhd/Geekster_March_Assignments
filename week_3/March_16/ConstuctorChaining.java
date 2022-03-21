package week3.March_16;

class Animal3 {
	String name;
	int legs;
	boolean isDangerous;
	boolean haveTail;
	String specialCharacters;

	Animal3() {
		this.name = "Dog";
		this.legs = 4;
		this.isDangerous = true;
		this.haveTail = true;
		this.specialCharacters = "they have a strong smell instict" + " they are loyal to their owners or friends";
	}

	Animal3(String name, boolean isDangerous) {
		this.name = name;
		this.isDangerous = isDangerous;
		this.legs = 4;
		this.haveTail = true;
		this.specialCharacters = "they have a strong smell instict" + ", they are not loyal to their owners or friends"
				+ ", they have flexible body";
	}

	String details() {
		return "This animal name is " + this.name + ". this animal is human's best friend. "
				+ this.name.toUpperCase().charAt(0) + this.name.substring(1, this.name.length()) + " has " + this.legs
				+ " legs and Do they have tail??? " + this.haveTail + ". Are they dangerous??? " + this.isDangerous
				+ ". special characters are " + this.specialCharacters + ". \n";
	}
}

public class ConstuctorChaining {
	public static void main(String[] args) {
		Animal3 dog = new Animal3();
		System.out.println(dog.details());

		Animal3 cat = new Animal3("Cat", false);
		System.out.println(cat.details());
	}

}
