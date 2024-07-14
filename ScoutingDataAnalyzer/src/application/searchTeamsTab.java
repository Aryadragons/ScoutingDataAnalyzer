package application;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;

public class searchTeamsTab extends GridPane implements EventHandler<ActionEvent>{
	private ComboBox<String> teamListCB;
	private Button seTeamsB;
	private TeamList theTeamList;
	private TextField avgCyclesTF;
	private TextField avgAmpTF;
	private TextField avgSpeTF;
	private TextField avgTrapTF;
	private TextField avgClimbTF;
	private TextField avgCommentListTF;
	private TextArea commentsTA;
	private List<Integer> listOfTeamNums;
	
	public searchTeamsTab(TeamList mainTeamList, List<Integer> importedListOfTeamNums) {
		this.add(new Label("Select Team to Look Up"), 0, 0);
		teamListCB = new ComboBox<String>();
		listOfTeamNums = importedListOfTeamNums;
		addComboBoxItems();
		this.add(teamListCB, 0, 1);
		seTeamsB = new Button("Submit");
		seTeamsB.setOnAction(this);
		this.add(seTeamsB, 1, 1);
		this.add(new Label(""), 0, 2);
		this.add(new Label(""), 0, 3);
		this.add(new Label(""), 0, 4);
		this.add(new Label(""), 0, 5);
		this.add(new Label(""), 0, 6);
		this.add(new Label(""), 0, 7);
		this.add(new Label(""), 0, 8);
		this.add(new Label(""), 0, 9);
		this.add(new Label(""), 0, 10);
		this.add(new Label(""), 0, 11);
		this.add(new Label(""), 0, 12);
		this.add(new Label(""), 0, 13);
		this.add(new Label(""), 0, 14);
		this.add(new Label(""), 0, 15);
		this.add(new Label(""), 0, 16);
		this.add(new Label(""), 0, 17);
		this.add(new Label(""), 0, 18);
		this.add(new Label(""), 0, 19);
		this.add(new Label(""), 0, 20);
		this.add(new Label(""), 0, 21);
		this.add(new Label(""), 0, 22);
		theTeamList = mainTeamList;
	}
	
	private void addComboBoxItems() {
		String teamNumS;
		for (int i = 0; i < listOfTeamNums.size(); i++) {
			if (listOfTeamNums.get(i) != null) {
				teamNumS = Integer.toString(listOfTeamNums.get(i));
				teamListCB.getItems().add(teamNumS);
			}
		}
	}
	
	@Override
	public void handle(ActionEvent event) {
		try {
			if(event.getSource() == seTeamsB) {
				Team theTeam;
				String selectedTeamS = teamListCB.getSelectionModel().getSelectedItem();; 
				int selectedTeam = Integer.parseInt(selectedTeamS);
				theTeam = theTeamList.getATeam(selectedTeam);
				this.add(new Label(selectedTeamS), 0, 2);
				this.add(new Label("Avg Cycles:  "), 0, 3);
				this.add(new Label("Avg Amp:  "), 2, 3);
				this.add(new Label("Avg Speaker:  "), 4, 3);
				this.add(new Label("Avg Trap:  "), 0, 4);
				this.add(new Label("Avg Climb:  "), 2, 4);
				this.add(new Label("Comments:  "), 10, 3);
				avgCyclesTF = new TextField();
				avgAmpTF = new TextField();
				avgSpeTF = new TextField();
				avgTrapTF = new TextField();
				avgClimbTF = new TextField();
				this.add(avgCyclesTF, 1, 3);
				this.add(avgAmpTF, 3, 3);
				this.add(avgSpeTF, 5, 3);
				this.add(avgTrapTF, 1, 4);
				this.add(avgClimbTF, 3, 4);
				String avgCyclesS = Integer.toString(theTeam.getAvgCycles());
				avgCyclesTF.setText(avgCyclesS);
				String avgAmpS = Integer.toString(theTeam.getAvgAmp());
				avgAmpTF.setText(avgAmpS);
				String avgSpeS = Integer.toString(theTeam.getAvgSpe());
				avgSpeTF.setText(avgSpeS);
				String avgTrapS = Integer.toString(theTeam.getAvgTrap());
				avgTrapTF.setText(avgTrapS);
				String avgClimbS = Integer.toString(theTeam.getAvgClimb());
				avgClimbTF.setText(avgClimbS);
				List<String> commentList = theTeam.getCommentsList();
				commentsTA = new TextArea();
				String commentsS = "";
				for(int i = 0; i < commentList.size(); i++) {
					commentsS = commentsS + "\n" +commentList.get(i);
				}
				this.add(commentsTA, 11, 3);
				commentsTA.setText(commentsS);
				if (theTeam.getTotalMatchesPlayed() == 1) {
					this.add(new Label("Did 1 Match"), 0, 5);
				} else {
					this.add(new Label("Did " + theTeam.getTotalMatchesPlayed() + " Matches"), 0, 5);
				}
			}
		} catch(Exception e) {
			System.out.println("Error: " + e);
		}
	}
}
