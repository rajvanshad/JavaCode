package mkulle.principles.srp;

public class Rectangle implements RectangleAreaInterface{

	private double length;
	private double bredth;
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBredth() {
		return bredth;
	}
	public void setBredth(double bredth) {
		this.bredth = bredth;
	}
	
	public double area() {
		return length * bredth;
	}
	
}
