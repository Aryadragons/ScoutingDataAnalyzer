package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class searchTeamsTab extends GridPane implements EventHandler<ActionEvent>{
	private ComboBox<String> teamListCB;
	private Button seTeamsB;
	private TeamList theTeamList;
	
	public searchTeamsTab(TeamList mainTeamList) {
		this.add(new Label("Select Team to Look Up"), 0, 0);
		teamListCB = new ComboBox<String>();
		teamListCB.getItems().addAll("1234", "5678");
		this.add(teamListCB, 0, 1);
		seTeamsB = new Button("Submit");
		this.add(seTeamsB, 1, 1);
		mainTeamList = theTeamList;
	}

	@Override
	public void handle(ActionEvent event) {
		try {
			if(event.getSource() == seTeamsB) {
				String selectedTeamS = teamListCB.getSelectionModel().getSelectedItem();; 
				int selectedTeam = Integer.parseInt(selectedTeamS);
				theTeamList.getATeam(selectedTeam);
			}
		} catch(Exception e) {
			
		}
	}
}
