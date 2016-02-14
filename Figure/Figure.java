import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

abstract class Figure implements Drawable, Comparable<Figure> {
	// ("x", "y") are coordinates of the "center" of the figure.
	// "counter" helps counting the number of figures.
	// Each figure has a unique "id" which can be determined through counter.
	protected int id;
	protected double x;
	protected double y;
	protected Color color;
	private static int counter;

	// initialization
	public Figure(double x, double y, Color c) {
		this.x = x;
		this.y = y;
		this.color = c;
		counter++;
		this.id = counter;
	}
	
	// set counter to zero
	public static void setCounterToZero() {
		counter = 0;
	}

	// Compares this figure with the specified figure, based on their area
	public int compareTo(Figure fig) {
		if(this.getArea() < fig.getArea()){
			return -1;
		}else if(this.getArea() > fig.getArea()){
			return 1;
		}else{
			return 0;
		}
	}

	// returns string representation of this figure that 
	// contains id, x and y information
	public String toString() {
		
		String information = new String();
		information = "ID: " + this.id + " X: " + this.x + " Y: " + this.y;
		
		return information;
	}

	// draw this figure through GraphicsContext object given as argument.
	// setStroke, strokeOval and strokeRect methods of GraphicsContext may be useful.
	public abstract void draw(GraphicsContext gc);

	// returns true if (x, y) are coordinates inside the figure, false otherwise
	public abstract boolean isInside(double x, double y);

	// returns the area of this figure
	public abstract double getArea();

}
