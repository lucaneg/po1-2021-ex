abstract class Sport {
	private final String name;

	protected Sport(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Sport))
			return false;
		Sport other = (Sport) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}

class Golf extends Sport {
	public Golf() {
		super("Golf");
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Golf))
			return false;
		return true;
	}
}

class Tennis extends Sport {
	public Tennis() {
		super("Tennis");
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Tennis))
			return false;
		return true;
	}
}

class FightingSport extends Sport {
	private final int numberOfRounds;

	public FightingSport(String name, int numberOfRounds) {
		super(name);
		this.numberOfRounds = numberOfRounds;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + numberOfRounds;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof FightingSport))
			return false;
		FightingSport other = (FightingSport) obj;
		if (numberOfRounds != other.numberOfRounds)
			return false;
		return true;
	}
}

abstract class TeamSport extends Sport {
	private final int teamSize;

	protected TeamSport(String name, int teamSize) {
		super(name);
		this.teamSize = teamSize;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + teamSize;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof TeamSport))
			return false;
		TeamSport other = (TeamSport) obj;
		if (teamSize != other.teamSize)
			return false;
		return true;
	}
}

class Soccer extends TeamSport {
	public Soccer() {
		super("Soccer", 11);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Soccer))
			return false;
		return true;
	}
}

class Volleyball extends TeamSport {
	public Volleyball() {
		super("Volleyball", 7);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Volleyball))
			return false;
		return true;
	}
}