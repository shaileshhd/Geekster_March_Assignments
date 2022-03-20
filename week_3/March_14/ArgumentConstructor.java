package week3.March_14;

class Vehicle2 {
	String vehicle;
	int wheels;
	String model;
	int seats;
	int price;
	float rating;

	Vehicle2() {
		this.vehicle = "Bike";
		this.wheels = 2;
		this.model = "Activa 5G";
		this.seats = 2;
		this.price = 78000;
		this.rating = 4.0f;
	}

	Vehicle2(String vehicle, int wheels, String model, int seats, int price, float rating) {
		this.vehicle = vehicle;
		this.wheels = wheels;
		this.model = model;
		this.seats = seats;
		this.price = price;
		this.rating = rating;
	}

	public String toString() {
		return this.vehicle + " is a " + this.wheels + " wheeler vehicle. " + this.seats
				+ " seats are available to sit. The model of " + this.vehicle + " is " + this.model
				+ " and the price starts from " + this.price + " onwards. \nRating: " + this.rating + "/5\n";
	}
}

public class ArgumentConstructor {
	public static void main(String[] args) {
		Vehicle2 bike = new Vehicle2();
		// details are passed via constructor
		System.out.println(bike);

		Vehicle2 car = new Vehicle2("Car", 4, "KIA Celtos", 5, 995000, 4.75f);
		// details are passed via argument constructor
		System.out.println(car);

		Vehicle2 truck = new Vehicle2("Truck", 16, "Tata Signa", 3, 4535000, 4.5f);
		// details are passed via argument constructor
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
