class Trash {
	private final String name;

	public Trash(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void recycle() {
		System.out.println("Recycling " + name);
	}
	
	public void dispose() {
		System.out.println("Disposing " + name);
	}
}

class NonRecyclableTrash extends Trash {

	public NonRecyclableTrash(String name) {
		super(name);
	}
	
	@Override
	public void recycle() {
		throw new UnsupportedOperationException();
	}
}

class TrashDisposal {
	public static void dispose(Trash[] trash) {
		for (Trash t : trash)
			try {
				t.recycle();
			} catch (UnsupportedOperationException e) {
				System.out.println(t.getName() + " cannot be recycled");
			} finally {
				t.dispose();
			}
	}
}
