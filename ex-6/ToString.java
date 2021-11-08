class Person {
	private final String name;

	protected Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}

class Professor extends Person {

	public Professor(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Prof. " + super.toString();
	}
}

class Researcher extends Person {

	public Researcher(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return super.toString() + ", PhD";
	}
}

class Student extends Person {

	public Student(String name) {
		super(name);
	}
}
