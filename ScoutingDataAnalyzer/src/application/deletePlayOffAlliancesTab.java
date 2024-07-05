package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class deletePlayOffAlliancesTab extends GridPane{
	
	private Button yesB;
	private TextField doneTF;
	
	public deletePlayOffAlliancesTab() {
		this.add(new Label("Clear out all Playoff Alliances  "), 0, 0);
		yesB = new Button("Yes!");
		this.add(yesB, 1, 0);
		doneTF = new TextField();
		this.add(doneTF, 0, 1);
	}
	
}
