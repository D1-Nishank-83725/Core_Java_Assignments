
public class Point2D {
	
	private int x = 0;
	private int y = 0;
	
	public Point2D() {
		this.x = 0;
		this.y = 0;
	}
	
	
	
	public Point2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}



	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	public void display() {
		System.out.println("( " + x + ", "+ y +" )" );
	}
	
	
	

}
