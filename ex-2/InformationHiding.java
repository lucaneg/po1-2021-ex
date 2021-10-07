class Rectangle {

	public final int width;
	public final int height;
	private final int area;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		this.area = width * height;
	}
	
	public int getArea() {
		return area;
	}
}
