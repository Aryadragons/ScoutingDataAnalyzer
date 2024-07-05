package application;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class createMatchTab extends GridPane{
	
	private ComboBox<String> team1CB;
	private ComboBox<String> team2CB;
	private ComboBox<String> team3CB;
	private ComboBox<String> team4CB;
	private ComboBox<String> team5CB;
	private ComboBox<String> team6CB;
	private Button submitB;
	
	public createMatchTab() {
		this.add(new Label("Select First Team For Allince 1  "), 0, 0);
		this.add(new Label("Select Second Team For Allince 1  "), 1, 0);
		this.add(new Label("Select Third Team For Allince 1  "), 2, 0);
		this.add(new Label("Select First Team For Allince 2  "), 0, 2);
		this.add(new Label("Select Second Team For Allince 2  "), 1, 2);
		this.add(new Label("Select Third Team For Allince 2  "), 2, 2);
		team1CB = new ComboBox<String>();
		team2CB = new ComboBox<String>();
		team3CB = new ComboBox<String>();
		team4CB = new ComboBox<String>();
		team5CB = new ComboBox<String>();
		team6CB = new ComboBox<String>();
		team1CB.getItems().addAll("1234", "5678");
		team2CB.getItems().addAll("1234", "5678");
		team3CB.getItems().addAll("1234", "5678");
		team4CB.getItems().addAll("1234", "5678");
		team5CB.getItems().addAll("1234", "5678");
		team6CB.getItems().addAll("1234", "5678");
		this.add(team1CB, 0, 1);
		this.add(team2CB, 1, 1);
		this.add(team3CB, 2, 1);
		this.add(team4CB, 0, 3);
		this.add(team5CB, 1, 3);
		this.add(team6CB, 2, 3);
		// adding Button
		submitB = new Button("Submit");
		this.add(submitB, 3, 3);
	}
}
