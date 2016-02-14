
import java.util.ArrayList;

import sun.awt.RepaintArea;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


// manages and draws figures
public class FigureCanvas extends Canvas {
	private ArrayList<Figure> list; // contains figures
	private int capacity; // determines the max number of figures in the list
	private GraphicsContext gc; // used for drawing figures
	private GUI myGUI; // points to the GUI object
	private Figure fig_selected; // lastly selected figure

	// initialization
	public FigureCanvas(int capacity, int width, int height, GUI myGUI) {
		// ################ COMPLETE ################

		// getGraphicsContext2D is a method of Canvas returning GraphicsContext object,
		// which is used for drawing figures
		gc = this.getGraphicsContext2D();
		
		// draws a rectangle on the border of the canvas
		gc.strokeRect(0, 0, width, height);
		
		
	}

	// create and add a figure into the list if the size is less than the capacity.
	// If the capacity is full, only display the message "Capacity FULL !" on GUI by calling setText method of GUI.
	// the center point and size of the figure is randomly determined based on width and height of the canvas.
	// draw the added figure by calling draw method of the figure.
	// display the added figure's information on GUI by calling setText method of GUI
	public void addFigure(int figure, Color c) {
		// ################ COMPLETE ################

	}

	// select the figure containing the given (x, y) coordinates
	public void selectFigureContaining(double x, double y) {
		String str = "";
		Figure fig_current = null; // points the figure containing the given (x, y) coordinates
		
		// ################ COMPLETE ################


		// fig_selected is the previously selected figure.
		// here, we compare both previously selected and current figures.
		if (fig_selected != null && fig_current != null) {
			str += fig_selected + "\n";
			int res = fig_selected.compareTo(fig_current);
			if (res > 0)
				str += ">";
			else if (res < 0)
				str += "<";
			else
				str += "==";
			str += "\n" + fig_current;
		}
		fig_selected = fig_current;

		// display comparison information on GUI through setText method call
		// ################ COMPLETE ################


	}

	// clear all figures in the list and do the necessary updates.
	// clearRect method of GraphicsContext object may be useful.
	// display the message "Cleaned !" on GUI by calling setText method of GUI.
	public void removeAll() {
		// ################ COMPLETE ################


	}
}
