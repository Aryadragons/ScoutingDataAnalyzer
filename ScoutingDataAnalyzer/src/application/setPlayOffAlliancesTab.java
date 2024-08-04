package application;

import java.util.List;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class setPlayOffAlliancesTab extends GridPane implements EventHandler<ActionEvent>{
	
	private ComboBox<String> team1CB;
	private ComboBox<String> team2CB;
	private ComboBox<String> team3CB;
	private ComboBox<String> team4CB;
	private ComboBox<String> team5CB;
	private ComboBox<String> team6CB;
	private ComboBox<String> team7CB;
	private ComboBox<String> team8CB;
	private ComboBox<String> team9CB;
	private ComboBox<String> team10CB;
	private ComboBox<String> team11CB;
	private ComboBox<String> team12CB;
	private ComboBox<String> team13CB;
	private ComboBox<String> team14CB;
	private ComboBox<String> team15CB;
	private ComboBox<String> team16CB;
	private ComboBox<String> team17CB;
	private ComboBox<String> team18CB;
	private ComboBox<String> team19CB;
	private ComboBox<String> team20CB;
	private ComboBox<String> team21CB;
	private ComboBox<String> team22CB;
	private ComboBox<String> team23CB;
	private ComboBox<String> team24CB;
	private Button submitB;
	private List<Integer> listOfTeamNums;

	public setPlayOffAlliancesTab(List<Integer> importedListOfTeamNums) {
		listOfTeamNums = importedListOfTeamNums;
		this.add(new Label("Allince 1 Teams:   "), 0, 0);
		this.add(new Label("Team 1:   "), 1, 0);
		this.add(new Label("Team 2;   "), 2, 0);
		this.add(new Label("Team 3:   "), 3, 0);
		this.add(new Label("Allince 2 Teams:   "), 0, 2);
		this.add(new Label("Team 1:   "), 1, 2);
		this.add(new Label("Team 2;   "), 2, 2);
		this.add(new Label("Team 3:   "), 3, 2);
		this.add(new Label("Allince 3 Teams:   "), 0, 4);
		this.add(new Label("Team 1:   "), 1, 4);
		this.add(new Label("Team 2;   "), 2, 4);
		this.add(new Label("Team 3:   "), 3, 4);
		this.add(new Label("Allince 4 Teams:   "), 0, 6);
		this.add(new Label("Team 1:   "), 1, 6);
		this.add(new Label("Team 2;   "), 2, 6);
		this.add(new Label("Team 3:   "), 3, 6);
		this.add(new Label("Allince 5 Teams:   "), 0, 8);
		this.add(new Label("Team 1:   "), 1, 8);
		this.add(new Label("Team 2;   "), 2, 8);
		this.add(new Label("Team 3:   "), 3, 8);
		this.add(new Label("Allince 6 Teams:   "), 0, 10);
		this.add(new Label("Team 1:   "), 1, 10);
		this.add(new Label("Team 2;   "), 2, 10);
		this.add(new Label("Team 3:   "), 3, 10);
		this.add(new Label("Allince 7 Teams:   "), 0, 12);
		this.add(new Label("Team 1:   "), 1, 12);
		this.add(new Label("Team 2;   "), 2, 12);
		this.add(new Label("Team 3:   "), 3, 12);
		this.add(new Label("Allince 8 Teams:   "), 0, 14);
		this.add(new Label("Team 1:   "), 1, 14);
		this.add(new Label("Team 2;   "), 2, 14);
		this.add(new Label("Team 3:   "), 3, 14);
		// adding combo boxes for each team
		team1CB = new ComboBox<String>();
		team2CB = new ComboBox<String>();
		team3CB = new ComboBox<String>();
		team4CB = new ComboBox<String>();
		team5CB = new ComboBox<String>();
		team6CB = new ComboBox<String>();
		team7CB = new ComboBox<String>();
		team8CB = new ComboBox<String>();
		team9CB = new ComboBox<String>();
		team10CB = new ComboBox<String>();
		team11CB = new ComboBox<String>();
		team12CB = new ComboBox<String>();
		team13CB = new ComboBox<String>();
		team14CB = new ComboBox<String>();
		team15CB = new ComboBox<String>();
		team16CB = new ComboBox<String>();
		team17CB = new ComboBox<String>();
		team18CB = new ComboBox<String>();
		team19CB = new ComboBox<String>();
		team20CB = new ComboBox<String>();
		team21CB = new ComboBox<String>();
		team22CB = new ComboBox<String>();
		team23CB = new ComboBox<String>();
		team24CB = new ComboBox<String>();
		//adding team list to them
		addComboBoxItems(team1CB);
		addComboBoxItems(team2CB);
		addComboBoxItems(team3CB);
		addComboBoxItems(team4CB);
		addComboBoxItems(team5CB);
		addComboBoxItems(team6CB);
		addComboBoxItems(team7CB);
		addComboBoxItems(team8CB);
		addComboBoxItems(team9CB);
		addComboBoxItems(team10CB);
		addComboBoxItems(team11CB);
		addComboBoxItems(team12CB);
		addComboBoxItems(team13CB);
		addComboBoxItems(team14CB);
		addComboBoxItems(team15CB);
		addComboBoxItems(team16CB);
		addComboBoxItems(team17CB);
		addComboBoxItems(team18CB);
		addComboBoxItems(team19CB);
		addComboBoxItems(team20CB);
		addComboBoxItems(team21CB);
		addComboBoxItems(team22CB);
		addComboBoxItems(team23CB);
		addComboBoxItems(team24CB);
		//adding them to the gui
		this.add(team1CB, 1, 1);
		this.add(team2CB, 2, 1);
		this.add(team3CB, 3, 1);
		this.add(team4CB, 1, 3);
		this.add(team5CB, 2, 3);
		this.add(team6CB, 3, 3);
		this.add(team7CB, 1, 5);
		this.add(team8CB, 2, 5);
		this.add(team9CB, 3, 5);
		this.add(team10CB, 1, 7);
		this.add(team11CB, 2, 7);
		this.add(team12CB, 3, 7);
		this.add(team13CB, 1, 9);
		this.add(team14CB, 2, 9);
		this.add(team15CB, 3, 9);
		this.add(team16CB, 1, 11);
		this.add(team17CB, 2, 11);
		this.add(team18CB, 3, 11);
		this.add(team19CB, 1, 13);
		this.add(team20CB, 2, 13);
		this.add(team21CB, 3, 13);
		this.add(team22CB, 1, 15);
		this.add(team23CB, 2, 15);
		this.add(team24CB, 3, 15);
		submitB = new Button("Submit");
		submitB.setOnAction(this);
		this.add(submitB, 4, 0);
	}

	private void addComboBoxItems(ComboBox<String> theCB) {
		String teamNumS;
		for (int i = 0; i < listOfTeamNums.size(); i++) {
			if (listOfTeamNums.get(i) != null) {
				teamNumS = Integer.toString(listOfTeamNums.get(i));
				theCB.getItems().add(teamNumS);
			}
		}
	}
	
	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
