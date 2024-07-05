package application;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class searchTeamsTab extends GridPane{
	private ComboBox<String> teamListCB;
	private Button seTeamsB;
	
	public searchTeamsTab() {
		this.add(new Label("Select Team to Look Up"), 0, 0);
		teamListCB = new ComboBox<String>();
		teamListCB.getItems().addAll("1234", "5678");
		this.add(teamListCB, 0, 1);
		seTeamsB = new Button("Submit");
		this.add(seTeamsB, 1, 1);
	}
}
