package id.ac.its.fikrisandi195;

public class Circle {
	private double radius;
	 private double phi=3.14;
	 
	 public Circle(double radius) {
	  this.radius = radius;
	  
	 }
	 
	 public double area() {
	  return phi*radius*radius;
	 }
	 
	 public double circumference() {
	  return 2*phi*radius;
	 }
}
