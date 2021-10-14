abstract class Sign {
	abstract int getKind();

	abstract int fight(Sign other);
}

class Rock extends Sign {

	@Override
	int getKind() {
		return 1;
	}

	@Override
	int fight(Sign other) {
		if (other.getKind() == 1)
			// rock
			return 0;
		else if (other.getKind() == 2)
			// paper
			return -1;
		else
			// scissors
			return 1;
	}
}

class Paper extends Sign {

	@Override
	int getKind() {
		return 2;
	}

	@Override
	int fight(Sign other) {
		if (other.getKind() == 1)
			// rock
			return 1;
		else if (other.getKind() == 2)
			// paper
			return 0;
		else
			// scissors
			return -1;
	}
}

class Scissors extends Sign {

	@Override
	int getKind() {
		return 3;
	}

	@Override
	int fight(Sign other) {
		if (other.getKind() == 1)
			// rock
			return -1;
		else if (other.getKind() == 2)
			// paper
			return 1;
		else
			// scissors
			return 0;
	}
}
