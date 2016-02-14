import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Square extends Figure {

	// since both sides of a square are equal, 
	// a "width" data field is enough to store the necessary data concerning a square
	protected double width;  

	// initialization
	public Square(double x, double y, double width, Color c) {
		super(x,y,c);
		this.width = width;
		super.x = x;
		super.y = y;
		super.color = c;
		this.width = width;
	}

	// returns the area of this figure
	public double getArea() {
		return width * width;
	}

	// draw this figure through GraphicsContext object given as argument
	public void draw(GraphicsContext gc) {
		// ################ COMPLETE ################

	}

	// returns true if (x, y) are coordinates inside the figure, false otherwise
	public boolean isInside(double x, double y) {
		double figurex1 = this.x;
		double figurex2 = this.x + this.width;
		double figurey1 = this.y;
		double figurey2 = this.y + this.width;
		if(x >= figurex1 && x <= figurex2 && y >= figurey1 && y <= figurey2){
			return true;
		}
		return false;
	}

	// returns string representation of this figure that contains figure name, width,
	// and id, x and y information obtained through superclass by a method call
	public String toString() {
		String information = "Name: Square " + "Width: " + this.width + " " + super.toString();
		return information;
	}
}
