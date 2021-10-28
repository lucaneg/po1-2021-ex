interface Tossable {
	String toss();
}

interface Bouncing {
	String bounce();
}

class SmallRock implements Tossable {
	
	@Override
	public String toss() {
		return "The small rock is flying!";
	}
}

abstract class Ball implements Tossable, Bouncing {
	private final String brand;
	
	protected Ball(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
}

class Baseball extends Ball {

	public Baseball(String brand) {
		super(brand);
	}

	@Override
	public String toss() {
		return "The baseball has been thrown!";
	}

	@Override
	public String bounce() {
		return "The baseball is bouncing on the ground!";
	}
}

class Football extends Ball {

	public Football(String brand) {
		super(brand);
	}

	@Override
	public String toss() {
		return "The " + getBrand() + " football has been kicked!";
	}

	@Override
	public String bounce() {
		return "The " + getBrand() + " football is bouncing!";
	}
}
