package project1;

public class square {
	
	private double side;

	public square(double side) {

		this.side = side;
	}
	
	public double area() {
		return this.side * this.side;
	}
	
	public double circumference() {
		return this.side * 4;
	}
	
	
}