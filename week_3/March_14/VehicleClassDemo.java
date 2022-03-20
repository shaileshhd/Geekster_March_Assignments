package week3.March_14;

// Create class named ""Vehicle"" with its basic characters as instance variables and basic functionalities as functions.

class Vehicle {
	String model;
	int seats;
	int wheels;
	int price;
	float rating;
	
	String details() {
		return this.model.toUpperCase() + " car model is a brand new machine in the market. " + "This car has a total of " + this.seats + " which also includes driver's seat. " + "This model comes with " + this.wheels + " and the price starts from " + this.price + " onwards.\nRating : " + this.rating + "/5\n";
	}
}

public class VehicleClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle audiA4 = new Vehicle();
		audiA4.model =  "Audi A4";
		audiA4.seats = 5;
		audiA4.wheels = 4;
		audiA4.rating = 4.5f;
		audiA4.price = 4700000;
		System.out.println(audiA4.details());
		
		Vehicle kiaCeltos = new Vehicle();
		kiaCeltos.model = "KIA Celtos";
		kiaCeltos.seats = 5;
		kiaCeltos.wheels = 4;
		kiaCeltos.rating = 4.75f;
		kiaCeltos.price = 995000;
		System.out.println(kiaCeltos.details());
	}
}

//OUTPUT
/*
	AUDI A4 car model is a brand new machine in the market. This car has a total of 5 which also includes driver's seat. This model comes with 4 	and the price starts from 4700000 onwards.
	Rating : 4.5/5
	
	KIA CELTOS car model is a brand new machine in the market. This car has a total of 5 which also includes driver's seat. This model comes with 4 	and the price starts from 995000 onwards.
	Rating : 4.75/5
*/