import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle extends Figure {

	private double radius;

	// initialization
	public Circle(double x, double y, double radius, Color c) {
		super(x,y,c);
		super.x = x;
		super.y = y;
		super.color = c;
		this.radius = radius;
	}

	// returns the area of this figure
	public double getArea() {
		return Math.PI * radius * radius;
	}

	// draw this figure through GraphicsContext object given as argument
	public void draw(GraphicsContext gc) {
		// ################ COMPLETE ################

	}

	// returns true if (x, y) are coordinates inside the figure, false otherwise
	public boolean isInside(double x, double y) {
		double figurex1 = this.x;
		double figurex2 = this.x + (2*(this.radius));
		double figurey1 = this.y;
		double figurey2 = this.y + (2*(this.radius));
		if(x >= figurex1 && x <= figurex2 && y >= figurey1 && y <= figurey2){
			return true;
		}
		return false;
	}

	// returns string representation of this figure that contains figure name, radius, 
	// and id, x and y information obtained through superclass by a method call
	@Override
	public String toString() {
		
		String information = "Name: Circle" + " Radius: " + this.radius + " ";
		information += super.toString();
		return information;
	}
}
