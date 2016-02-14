import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle extends Square {
	// in addition to the "width" data field of a square, 
	// "height" data field is added for a rectangle.
	private double height;

	// initialization
	public Rectangle(double x, double y, double width, double height, Color c) {
		super(x,y,width,c);
		super.x = x;
		super.y = y;
		super.width = width;
		super.color = c;
		this.height = height;
	}

	// returns the area of this figure
	public double getArea() {
		return width * height;
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
		double figurey2 = this.y + this.height;
		if(x >= figurex1 && x <= figurex2 && y >= figurey1 && y <= figurey2){
			return true;
		}
		return false;
	}

	// returns string representation of this figure that contains figure name, width,
	// height and id, x and y information
	public String toString() {
		String information = "Name: Rectangle " + "Height :" + this.height + " ";
		information += "Width: " + this.width + " ID: " + this.id + " X: " + this.x + " Y: " + this.y;
		return information;
	}
}
