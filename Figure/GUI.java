import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import com.sun.javafx.scene.control.skin.LabeledSkinBase;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;


public class GUI extends Application {
	public final static int SQUARE = 0;
	public final static int CIRCLE = 1;
	public final static int RECTANGLE = 2;
	private Color color; // used to keep the last selected color
	private Label label; // used to display information on GUI

	// update the text of the label object
	public void setText(String str) {
		// ################ COMPLETE ################

	}
	
	// contain Red, Green, Blue radio buttons,
	// Circle, Square, Rectangle and CleanAll buttons,
	// a label object and a FigureCanvas object.
	// the color of the figure is determined through radio buttons.
	// we create figures by clicking on buttons.
	// cleanAll button removes all figures.
	// the figures are displayed on the FigureCanvas object.
	// we can select a figure by clicking the mouse on the figure.
	// the information about the figures are displayed through the label object.
	// setting the wrap text property of the label object as true may be useful.
	@Override
	public void start(Stage primaryStage) {
		
		//occur mainPane
		HBox mainPane = new HBox();
		
		//occur leftPane and rightPane
		VBox leftPane = new VBox(10);
		FigureCanvas rightPane = new FigureCanvas(10, 400, 500, this);
		
		//occur Circle button
		Button btnCircle = new Button("Circle");
		btnCircle.setMinSize(80, 20);
		
		//occur Square button
		Button btnSquare = new Button("Square");
		btnSquare.setMinSize(80, 20);
		
		//occur Rectangle button
		Button btnRectangle = new Button("Rectangle");
		btnRectangle.setMinSize(80, 20);
		
		//occur Clear All button
		Button btnClearAll = new Button("Clear All");
		btnClearAll.setMinSize(80, 20);
		
		//occur Color ToggleGroup
		ToggleGroup colorGroup = new ToggleGroup();
		
		//occur Red radio button and set ToggleGroup
	    RadioButton radioRed = new RadioButton("Red");
	    radioRed.setToggleGroup(colorGroup);
	    
	    //occur Green radio button and set ToggleGroup
	    RadioButton radioGreen = new RadioButton("Green");
	    radioGreen.setToggleGroup(colorGroup);
	    
	    //occur Blue radio button and set ToggleGroup
	    RadioButton radioBlue = new RadioButton("Blue");
	    radioBlue.setToggleGroup(colorGroup);
	    
	    //occur label1 and label2 on the leftPane
	    Label lblInfo1 = new Label();
	    Label lblInfo2 = new Label();
	    
	    //Buttons,labels and RadioButtons add on the leftPane
	    leftPane.getChildren().addAll(radioRed, radioGreen, radioBlue);
	    leftPane.getChildren().addAll(btnCircle, btnSquare, btnRectangle, btnClearAll);
	    leftPane.getChildren().addAll(lblInfo1, lblInfo2);
	    
	    //occur leftPane width
		leftPane.setMinWidth(100);
		
		//occur leftPane border right, left, down, up
		leftPane.setPadding(new Insets(10, 0, 10, 10));
		
		//occur rightPane width
		rightPane.setWidth(400);
		
		//occur rightPane border and color
		rightPane.setStyle("-fx-border-color: #2e8b57; -fx-border-width: 1px; ");
		
		//leftPane and rightPane add on the mainPane
	    mainPane.getChildren().add(leftPane);
	    mainPane.getChildren().add(rightPane);
	    
	    Scene scene = new Scene(mainPane, 500, 500);
	    primaryStage.setTitle("Draw Figure");
	    primaryStage.setScene(scene); 
	    primaryStage.show();
	        
	}
	public static void main(String[] args) {
		launch(args);
	}
}
