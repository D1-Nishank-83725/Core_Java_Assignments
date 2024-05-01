
public class Circle {
	
	double diameter;
	Point2D p1;
	
	public Circle() {
		diameter = 100;
		p1 = new Point2D(100, 100);
		
	}


	public double getDiameter() {
		return diameter;
	}


	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}


	@Override
	public String toString() {
		return "Circle [diameter=" + diameter + ", p1=" + p1.toString() + "]";
	}



	
	

}
