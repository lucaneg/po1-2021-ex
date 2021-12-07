class SkiPass {
	int availablePoints;
}

class NotEnoughPointsException extends Exception {
}

class Skier extends Person {

	SkiPass pass;

	protected Skier(int weight, SkiPass pass) {
		super(weight);
		this.pass = pass;
	}

	public void takeChairlift(int meters, int points) throws NotEnoughPointsException {
		if (pass.availablePoints < points)
			throw new NotEnoughPointsException();

		pass.availablePoints -= points;
		this.altitude += meters;
	}

	@Override
	protected void moveUpOrDown(int meters) {
		if (meters < 0)
			this.altitude += meters;
		else
			decreaseUpTo(30, meters);
	}
}
