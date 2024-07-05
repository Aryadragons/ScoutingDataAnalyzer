package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class editPlayOffAlliancesTab extends GridPane implements EventHandler<ActionEvent>{
	
	private ComboBox<String> selectAllianceCB;
	private Button submitSelectB;
	private TextField team1TF;
	private TextField team2TF;
	private TextField team3TF;
	private ComboBox<String> team1EditCB;
	private ComboBox<String> team2EditCB;
	private ComboBox<String> team3EditCB;
	private Button submitEditB;
	private int allianceSelected;
	
	public editPlayOffAlliancesTab() {
		this.add(new Label("Select Allince to Edit:   "), 0, 0);
		selectAllianceCB = new ComboBox<String>();
		selectAllianceCB.getItems().addAll("1", "2", "3", "4", "5", "6", "7", "8");
		this.add(selectAllianceCB, 1, 0);
		submitSelectB = new Button("Submit");
		submitSelectB.setOnAction(this);
		this.add(submitSelectB, 2, 0);
		team1TF = new TextField();
		team2TF = new TextField();
		team3TF = new TextField();
		this.add(team1TF, 1, 1);
		this.add(team2TF, 2, 1);
		this.add(team3TF, 3, 1);
		//changes row
		this.add(new Label("Changes:   "), 0, 2);
		team1EditCB = new ComboBox<String>();
		team2EditCB = new ComboBox<String>();
		team3EditCB = new ComboBox<String>();
		team1EditCB.getItems().addAll("1234", "5678");
		team2EditCB.getItems().addAll("1234", "5678");
		team3EditCB.getItems().addAll("1234", "5678");
		this.add(team1EditCB, 1, 2);
		this.add(team2EditCB, 2, 2);
		this.add(team3EditCB, 3, 2);
	}

	@Override
	public void handle(ActionEvent event) {
		try {
			if (event.getSource() == submitSelectB) {
				String strSelect = selectAllianceCB.getSelectionModel().getSelectedItem();
				if (strSelect.compareTo("1") == 0) {
					allianceSelected = 1;
				}
				if (strSelect.compareTo("2") == 0) {
					allianceSelected = 2;
				}
				if (strSelect.compareTo("3") == 0) {
					allianceSelected = 3;
				}
				if (strSelect.compareTo("4") == 0) {
					allianceSelected = 4;
				}
				if (strSelect.compareTo("5") == 0) {
					allianceSelected = 5;
				}
				if (strSelect.compareTo("6") == 0) {
					allianceSelected = 6;
				}
				if (strSelect.compareTo("7") == 0) {
					allianceSelected = 7;
				}
				if (strSelect.compareTo("8") == 0) {
					allianceSelected = 8;
				}
				this.add(new Label("Alliance: " + allianceSelected + " "), 0, 1);
			}
		} catch(Exception e) {
			System.out.println("Error: " + e);
		}
		
	}
}
