abstract class Car {
	protected boolean isSedan;
	protected int seats;
	protected int mileage;

	public Car(boolean isSedan, int seats, int mileage) {
		this.isSedan = isSedan;
		this.seats = seats;
		this.mileage = mileage;
	}

	public boolean getIsSedan() {
		return this.isSedan;
	}

	public int getSeats() {
		return this.seats;
	}

	public String getMileage() {
		return mileage + " kmpl";
	}

	public void printCar(String name) {
		System.out.println(
				"A " + name + " is " + (this.getIsSedan() ? "" : "not ")
						+ "Sedan, is " + this.getSeats() + "-seater, and has a mileage of around "
						+ this.getMileage() + ".");
	}
}

class WagonR extends Car {

	public WagonR(int mileage) {
		super(false, 4, mileage);
	}
}

class HondaCity extends Car {

	public HondaCity(int mileage) {
		super(true, 4, mileage);
	}
}

class InnovaCrysta extends Car {

	public InnovaCrysta(int mileage) {
		super(false, 6, mileage);
	}
}
