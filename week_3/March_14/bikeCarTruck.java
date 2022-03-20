package week3.March_14;

// create different objects like 1)bike 2)car, 3)trek.

class Vehicles {
	String vehicle;
	int wheels;
	String model;
	int seats;
	int price;
	float rating;

	public String toString() {
		return this.vehicle + " is a " + this.wheels + " wheeler vehicle. " + this.seats
				+ " seats are available to sit. The model of " + this.vehicle + " is " + this.model
				+ " and the price starts from " + this.price + " onwards. \nRating: " + this.rating + "/5\n";
	}
}

public class bikeCarTruck {
	public static void main(String[] args) {
		Vehicles bike = new Vehicles();
		bike.model = "Honda Activa 5G";
		bike.vehicle = "Bike";
		bike.price = 75000;
		bike.wheels = 2;
		bike.rating = 4f;
		bike.seats = 2;
		System.out.println(bike);

		Vehicles car = new Vehicles();
		car.model = "KIA Celtos";
		car.vehicle = "Car";
		car.price = 995000;
		car.wheels = 4;
		car.rating = 4.75f;
		car.seats = 5;
		System.out.println(car);

		Vehicles truck = new Vehicles();
		truck.model = "Tata Signa";
		truck.vehicle = "Truck";
		truck.price = 4535000;
		truck.wheels = 16;
		truck.rating = 4.5f;
		truck.seats = 3;
		System.out.println(truck);
	}
}
//OUTPUT
/*
	Bike is a 2 wheeler vehicle. 2 seats are available to sit. The model of Bike is Honda Activa 5G and the price starts from 75000 onwards. 
	Rating: 4.0/5
	
	Car is a 4 wheeler vehicle. 5 seats are available to sit. The model of Car is KIA Celtos and the price starts from 995000 onwards. 
	Rating: 4.75/5
	
	Truck is a 16 wheeler vehicle. 3 seats are available to sit. The model of Truck is Tata Signa and the price starts from 4535000 onwards. 
	Rating: 4.5/5
*/
