package application;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class findBestStatTab extends GridPane{
	
	private ComboBox<String> listStatsCB;
	private Button submitB;
	
	public findBestStatTab() {
		this.add(new Label("Select Stat:"), 0, 0);
		listStatsCB = new ComboBox<String>();
		listStatsCB.getItems().addAll("Total Cycles", "Total Speker", "Total Amp");
		this.add(listStatsCB, 1, 0);
		submitB = new Button("Submit");
		this.add(submitB, 2, 0);
	}
}
