package week3.March_16;

class Animal1 {
	String name;
	int legs;
	boolean isDangerous;
	boolean haveTail;
	private String specialCharacters;

	Animal1(String name, int legs, boolean isDangerous) {
		this.name = name;
		this.legs = legs;
		this.isDangerous = isDangerous;
	}

	void setSpecialCharacters(String specialCharacters) {
		this.specialCharacters = specialCharacters;
	}

	String details() {
		return "This animal name is " + this.name + ". this animal is human's best friend. "
				+ this.name.toUpperCase().charAt(0) + this.name.substring(1, this.name.length()) + " has " + this.legs
				+ " legs and Do they have tail??? " + this.haveTail + ". Are they dangerous??? " + this.isDangerous
				+ ". special characters are " + this.specialCharacters + ". \n";
	}
}

public class VariousAnimals {
	public static void main(String[] args) {
		Animal1 dog = new Animal1("dog", 4, true);
		dog.haveTail = true;
		String specialChars = "they have a strong smell instict" + " they are loyal to their owners or friends";
		dog.setSpecialCharacters(specialChars);
		System.out.println(dog.details());

		Animal1 cat = new Animal1("cat", 4, false);
		cat.haveTail = true;
		String specialChars1 = "they have a strong smell instict" + ", they are not loyal to their owners or friends"
				+ ", they have flexible body";
		cat.setSpecialCharacters(specialChars1);
		System.out.println(cat.details());

		Animal1 cow = new Animal1("cow", 4, false);
		cow.haveTail = true;
		String specialChars2 = "cows are used in agriculture, transportation." + " cow gives us milk";
		cow.setSpecialCharacters(specialChars2);
		System.out.println(cow.details());
	}
}

//OUTPUT
/*
	This animal name is dog. this animal is human's best friend. Dog has 4 legs and Do they have tail??? true. Are they dangerous??? true. special 	characters are they have a strong smell instict they are loyal to their owners or friends. 
	
	This animal name is cat. this animal is human's best friend. Cat has 4 legs and Do they have tail??? true. Are they dangerous??? false. special 	characters are they have a strong smell instict, they are not loyal to their owners or friends, they have flexible body. 
	
	This animal name is cow. this animal is human's best friend. Cow has 4 legs and Do they have tail??? true. Are they dangerous??? false. special 	characters are cows are used in agriculture, transportation. cow gives us milk. 
*/
