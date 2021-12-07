class Person {

	int weight;
	int altitude;
	double calories;

	protected Person(int weight) {
		this.weight = weight;
		this.altitude = 0;
		this.calories = 0.0;
	}

	public void eat(double calories) {
		if (calories < 0)
			return;

		this.calories += calories;
	}

	protected void moveUpOrDown(int meters) {
		int coeffficient = meters > 0 ? 10 : 2;
		decreaseUpTo(coeffficient, meters);
	}
	
	protected void decreaseUpTo(int coeffficient, int meters) {
		int mt = Math.abs(meters);
		double cal = this.calories;
		int w = this.weight;
		while (mt > 0 && cal > 0.0) {
			mt--;
			cal -= coeffficient * w;
		}
		this.calories = cal;
		this.altitude = this.altitude + (meters + (meters > 0 ? -mt : mt));
	}
}
