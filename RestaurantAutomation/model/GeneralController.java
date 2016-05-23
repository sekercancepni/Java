package ch.makery.address.model;
import ch.makery.address.model.Product;
import ch.makery.address.model.Util;
import javafx.fxml.FXML;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TextArea;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Alert;
import java.io.IOException;

import ch.makery.address.MainApp;
import javafx.scene.control.*;

public class GeneralController {
	private String user = "admin";
	private String code_word = "admin";
	
	private MainApp main;
	
	@FXML
	private TextField username;
	
	@FXML
	private PasswordField password;
	
	@FXML
	private TextField productName;
	
	@FXML
	private TextField productAmount;
	
	@FXML
	private TextField tableName;
	
	@FXML
	private TextField descr;
	
	@FXML
	private void loginButton() throws IOException{
		String u = username.getText();
	    String p = password.getText();
	    
	    if (u.equals(user) && p.equals(code_word)) {
	    	main.showRestaurantOverview();
	    } else {
	    	Util.alertError("Login Failed", "username or password are wrong.");
	    }
	}
	
	//product save method
	@FXML
	private void productSave() {
		Product.p_save(productName.getText(), Double.parseDouble(productAmount.getText()));
		Util.alertInfo("Product Save", "Your product has been saved!");
	}
	
	//product remove method
	@FXML
	private void productRemove() {
		Product.p_remove(productName.getText());
		Util.alertInfo("Product Remove", "Your product has been removed!");
	}
	
	//table save method
	@FXML
	private void tableSave(){
		Table.t_save(tableName.getText(),descr.getText());
		Util.alertInfo("Table Save", "Your table has been saved!");
	}
	
	//table remove method
	@FXML
	private void tableRemove(){
		Table.t_remove(tableName.getText());
		Util.alertInfo("Table Remove", "Your table has been removed!");
	}
	
	@FXML
	public void ExitClickButton(){
		System.exit(1);
	}
}
