package week3.March_14;

// initilize instance varibales of bike with no arguemnt default constructor.

class Vehicle1 {
	String vehicle;
	int wheels;
	String model;
	int seats;
	int price;
	float rating;

	Vehicle1() {
		this.vehicle = "Bike";
		this.wheels = 2;
		this.model = "Activa 5G";
		this.seats = 2;
		this.price = 78000;
		this.rating = 4.0f;
	}

	public String toString() {
		return this.vehicle + " is a " + this.wheels + " wheeler vehicle. " + this.seats
				+ " seats are available to sit. The model of " + this.vehicle + " is " + this.model
				+ " and the price starts from " + this.price + " onwards. \nRating: " + this.rating + "/5\n";
	}
}

public class noArgumentConstructor {
	public static void main(String[] args) {
		Vehicle1 bike = new Vehicle1();
		// details are passed via constructor
		System.out.println(bike);

		Vehicle1 car = new Vehicle1();
		car.model = "KIA Celtos";
		car.vehicle = "Car";
		car.price = 995000;
		car.wheels = 4;
		car.rating = 4.75f;
		car.seats = 5;
		// manual details overrides constructor declarations
		System.out.println(car);

		Vehicle1 truck = new Vehicle1();
		truck.model = "Tata Signa";
		truck.vehicle = "Truck";
		truck.price = 4535000;
		truck.wheels = 16;
		truck.rating = 4.5f;
		truck.seats = 3;
		// manual details overrides constructor declarations
		System.out.println(truck);
	}
}

//OUTPUT
/*
	Bike is a 2 wheeler vehicle. 2 seats are available to sit. The model of Bike is Activa 5G and the price starts from 78000 onwards. 
	Rating: 4.0/5
	
	Car is a 4 wheeler vehicle. 5 seats are available to sit. The model of Car is KIA Celtos and the price starts from 995000 onwards. 
	Rating: 4.75/5
	
	Truck is a 16 wheeler vehicle. 3 seats are available to sit. The model of Truck is Tata Signa and the price starts from 4535000 onwards. 
	Rating: 4.5/5
*/
