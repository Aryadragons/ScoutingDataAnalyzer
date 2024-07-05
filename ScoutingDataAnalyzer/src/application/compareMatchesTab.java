package application;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class compareMatchesTab extends GridPane{
	
	private Button submit1B;
	private ComboBox<String> team1CB;
	private TextField matchNum1TF;
	private ComboBox<String> isPrac1CB;
	private ComboBox<String> isReplay1CB;
	private Button submit2B;
	private ComboBox<String> team2CB;
	private TextField matchNum2TF;
	private ComboBox<String> isPrac2CB;
	private ComboBox<String> isReplay2CB;
	
	public compareMatchesTab() {
		//first Match
		this.add(new Label("Select Team:  "), 0, 0);
		this.add(new Label("Select Match Number:  "), 1, 0);
		this.add(new Label("Is It a Practice Match?"), 2, 0);
		this.add(new Label("Is It a Match Replay"), 3, 0);
		submit1B = new Button("Submit");
		this.add(submit1B, 4, 1);
		team1CB = new ComboBox<String>();
		team1CB.getItems().addAll("1234", "5678");
		matchNum1TF = new TextField();
		isPrac1CB = new ComboBox<String>();
		isPrac1CB.getItems().addAll("Yes", "No");
		isReplay1CB = new ComboBox<String>();
		isReplay1CB.getItems().addAll("Yes", "No");
		this.add(team1CB, 0, 1);
		this.add(matchNum1TF, 1, 1);
		this.add(isPrac1CB, 2, 1);
		this.add(isReplay1CB, 3, 1);
		//Second Match
		this.add(new Label("Select Team:  "), 0, 2);
		this.add(new Label("Select Match Number:  "), 1, 2);
		this.add(new Label("Is It a Practice Match?"), 2, 2);
		this.add(new Label("Is It a Match Replay"), 3, 2);
		submit2B = new Button("Submit");
		this.add(submit2B, 4, 3);
		team2CB = new ComboBox<String>();
		team2CB.getItems().addAll("1234", "5678");
		matchNum2TF = new TextField();
		isPrac2CB = new ComboBox<String>();
		isPrac2CB.getItems().addAll("Yes", "No");
		isReplay2CB = new ComboBox<String>();
		isReplay2CB.getItems().addAll("Yes", "No");
		this.add(team2CB, 0, 3);
		this.add(matchNum2TF, 1, 3);
		this.add(isPrac2CB, 2, 3);
		this.add(isReplay2CB, 3, 3);
	}
}
