package application;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class createAllianceTab extends GridPane{
	
	private ComboBox<String> team1CB;
	private ComboBox<String> team2CB;
	private ComboBox<String> team3CB;
	private Button submitB;
	
	public createAllianceTab() {
		this.add(new Label("Select First Team   "), 0, 0);
		this.add(new Label("Select Second Team   "), 1, 0);
		this.add(new Label("Select Third Team   "), 2, 0);
		team1CB = new ComboBox<String>();
		team2CB = new ComboBox<String>();
		team3CB = new ComboBox<String>();
		team1CB.getItems().addAll("1234", "5678");
		team2CB.getItems().addAll("1234", "5678");
		team3CB.getItems().addAll("1234", "5678");
		this.add(team1CB, 0, 1);
		this.add(team2CB, 1, 1);
		this.add(team3CB, 2, 1);
		//adding button
		submitB = new Button("Submit");
		this.add(submitB, 3, 1);
	}
}
