package application;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class searchAllincesTab extends GridPane{
	
	private ComboBox<String> teamCB1;
	private ComboBox<String> teamCB2;
	private ComboBox<String> teamCB3;
	private Button seAllincesB;
	
	public searchAllincesTab() {
		this.add(new Label("Select First Team  "), 0, 0);
		this.add(new Label("Select Second Team   "), 1, 0);
		this.add(new Label("Select Third Team   "), 2, 0);
		teamCB1 = new ComboBox<String>();
		teamCB2 = new ComboBox<String>();
		teamCB3 = new ComboBox<String>();
		teamCB1.getItems().addAll("1234", "5678", "9012");
		teamCB2.getItems().addAll("1234", "5678", "9012");
		teamCB3.getItems().addAll("1234", "5678", "9012");
		this.add(teamCB1, 0, 1);
		this.add(teamCB2, 1, 1);
		this.add(teamCB3, 2, 1);
		seAllincesB = new Button("Submit");
		this.add(seAllincesB, 3, 1);
	}
}
