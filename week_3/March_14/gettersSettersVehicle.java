package week3.March_14;

// declare getters and setters for this class.

class Vehicle3 {
	private String vehicle;
	private int wheels;
	private String model;
	private int seats;
	private int price;
	private float rating;

	void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	void setWheels(int wheels) {
		this.wheels = wheels;
	}

	void setModel(String model) {
		this.model = model;
	}

	void setSeats(int seats) {
		this.seats = seats;
	}

	void setPrice(int price) {
		this.price = price;
	}

	void setRating(float rating) {
		this.rating = rating;
	}

	String getVehicle() {
		return this.vehicle;
	}

	int getWheels() {
		return this.wheels;
	}

	String getModel() {
		return this.model;
	}

	int getSeats() {
		return this.seats;
	}

	int getPrice() {
		return this.price;
	}

	float getRating() {
		return this.rating;
	}
}

public class gettersSettersVehicle {
	public static void main(String[] args) {
		Vehicle3 bike = new Vehicle3();
		bike.setVehicle("bike");
		bike.setModel("Activa 5G");
		bike.setWheels(2);
		bike.setSeats(2);
		bike.setPrice(78000);
		bike.setRating(4.0f);
		System.out.println(bike.getVehicle());
		System.out.println(bike.getModel());
		System.out.println(bike.getSeats());
		System.out.println(bike.getWheels());
		System.out.println(bike.getPrice());
		System.out.println(bike.getRating());
	}
}

//OUTPUT
/*
	bike
	Activa 5G
	2
	2
	78000
	4.0
*/
