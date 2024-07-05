package application;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class searchMatchTab extends GridPane{
	
	private Button submitB;
	private ComboBox<String> teamCB;
	private TextField matchNumTF;
	private ComboBox<String> isPracCB;
	private ComboBox<String> isReplayCB;
	
	public searchMatchTab() {
		this.add(new Label("Select Team:  "), 0, 0);
		this.add(new Label("Select Match Number:  "), 1, 0);
		this.add(new Label("Is It a Practice Match?"), 2, 0);
		this.add(new Label("Is It a Match Replay"), 3, 0);
		submitB = new Button("Submit");
		this.add(submitB, 4, 1);
		teamCB = new ComboBox<String>();
		teamCB.getItems().addAll("1234", "5678");
		matchNumTF = new TextField();
		isPracCB = new ComboBox<String>();
		isPracCB.getItems().addAll("Yes", "No");
		isReplayCB = new ComboBox<String>();
		isReplayCB.getItems().addAll("Yes", "No");
		this.add(teamCB, 0, 1);
		this.add(matchNumTF, 1, 1);
		this.add(isPracCB, 2, 1);
		this.add(isReplayCB, 3, 1);
	}
}
