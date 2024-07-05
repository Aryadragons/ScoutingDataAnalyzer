package application;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class findBestAutoTab extends GridPane{
	
	private ComboBox<String> choosenAutosCB;
	private Button choosenSubmitB;
	
	public findBestAutoTab() {
		this.add(new Label("How Many Autos Are Already Choosen"), 0, 0);
		choosenAutosCB = new ComboBox<String>();
		choosenAutosCB.getItems().addAll("0", "1", "2");
		this.add(choosenAutosCB, 1, 0);
		choosenSubmitB = new Button("Submit");
		this.add(choosenSubmitB, 2, 0);
	}
}
