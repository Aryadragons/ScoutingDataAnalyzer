package application;

import java.util.List;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class searchAllincesTab extends GridPane implements EventHandler<ActionEvent>{
	
	private ComboBox<String> teamCB1;
	private ComboBox<String> teamCB2;
	private ComboBox<String> teamCB3;
	private Button seNonAllincesB;
	private List<Integer> listOfTeamNums;
	private TeamList theTeamList;
	
	public searchAllincesTab(boolean isPlayoffTime, List<Integer> importedListOfTeamNums, TeamList imTeamList) {
		theTeamList = imTeamList;
		if(isPlayoffTime == false) {
			listOfTeamNums = importedListOfTeamNums;
			Label team1SelectL = new Label("Select First Team");
			Label team2SelectL = new Label("Select Second Team");
			Label team3SelectL = new Label("Select Third Team");
			teamCB1 = new ComboBox<String>();
			teamCB2 = new ComboBox<String>();
			teamCB3 = new ComboBox<String>();
			addComboBoxItems(teamCB1);
			addComboBoxItems(teamCB2);
			addComboBoxItems(teamCB3);
			BorderPane team1BP = new BorderPane();
			BorderPane team2BP = new BorderPane();
			BorderPane team3BP = new BorderPane();
			team1BP.setTop(team1SelectL);
			team2BP.setTop(team2SelectL);
			team3BP.setTop(team3SelectL);
			team1BP.setCenter(teamCB1);
			team2BP.setCenter(teamCB2);
			team3BP.setCenter(teamCB3);
			team1BP.setId("seAllSelectTeam1");
			team2BP.setId("seAllSelectTeam2");
			team3BP.setId("seAllSelectTeam3");
			seNonAllincesB = new Button("Submit");
			seNonAllincesB.setOnAction(this);
			this.add(new Label("    "), 0, 0);
			this.add(new Label("    "), 2, 0);
			this.add(new Label("    "), 4, 0);
			this.add(new Label("    "), 6, 0);
			this.add(team1BP, 1, 1);
			this.add(team2BP, 3, 1);
			this.add(team3BP, 5, 1);
			this.add(seNonAllincesB, 7, 1);
		}else {
			
		}
		
	}
	private void addComboBoxItems(ComboBox<String> teamListCB) {
		String teamNumS;
		for (int i = 0; i < listOfTeamNums.size(); i++) {
			if (listOfTeamNums.get(i) != null) {
				teamNumS = Integer.toString(listOfTeamNums.get(i));
				teamListCB.getItems().add(teamNumS);
			}
		}
	}
	
	public void displayNonStats(Team t1, Team t2, Team t3) {
		double t1AvgCy = t1.getAvgCycles();
		double t1AvgSpe = t1.getAvgSpe();
		double t1AvgAmp = t1.getAvgAmp();
		double t1AvgTrap = t1.getAvgTrap();
		double t1AvgCli = t1.getAvgClimb();
		double t2AvgCy = t2.getAvgCycles();
		double t2AvgSpe = t2.getAvgSpe();
		double t2AvgAmp = t2.getAvgAmp();
		double t2AvgTrap = t2.getAvgTrap();
		double t2AvgCli = t2.getAvgClimb();
		double t3AvgCy = t3.getAvgCycles();
		double t3AvgSpe = t3.getAvgSpe();
		double t3AvgAmp = t3.getAvgAmp();
		double t3AvgTrap = t3.getAvgTrap();
		double t3AvgCli = t3.getAvgClimb();
		Label t1AvgCyL = new Label(Double.toString(t1AvgCy));
		Label t1AvgSpeL = new Label(Double.toString(t1AvgSpe));
		Label t1AvgAmpL = new Label(Double.toString(t1AvgAmp));
		Label t1AvgTrapL = new Label(Double.toString(t1AvgTrap));
		Label t1AvgCliL = new Label(Double.toString(t1AvgCli));
		Label t2AvgCyL = new Label(Double.toString(t2AvgCy));
		Label t2AvgSpeL = new Label(Double.toString(t2AvgSpe));
		Label t2AvgAmpL = new Label(Double.toString(t2AvgAmp));
		Label t2AvgTrapL = new Label(Double.toString(t2AvgTrap));
		Label t2AvgCliL = new Label(Double.toString(t2AvgCli));
		Label t3AvgCyL = new Label(Double.toString(t3AvgCy));
		Label t3AvgSpeL = new Label(Double.toString(t3AvgSpe));
		Label t3AvgAmpL = new Label(Double.toString(t3AvgAmp));
		Label t3AvgTrapL = new Label(Double.toString(t3AvgTrap));
		Label t3AvgCliL = new Label(Double.toString(t3AvgCli));
		t1AvgCyL = new Label(Double.toString(t1AvgCy));
		t1AvgSpeL = new Label(Double.toString(t1AvgSpe));
		t1AvgAmpL = new Label(Double.toString(t1AvgAmp));
		t1AvgTrapL = new Label(Double.toString(t1AvgTrap));
		Label t1AvgCliL = new Label(Double.toString(t1AvgCli));
		Label t2AvgCyL = new Label(Double.toString(t2AvgCy));
		Label t2AvgSpeL = new Label(Double.toString(t2AvgSpe));
		Label t2AvgAmpL = new Label(Double.toString(t2AvgAmp));
		Label t2AvgTrapL = new Label(Double.toString(t2AvgTrap));
		Label t2AvgCliL = new Label(Double.toString(t2AvgCli));
		Label t3AvgCyL = new Label(Double.toString(t3AvgCy));
		Label t3AvgSpeL = new Label(Double.toString(t3AvgSpe));
		Label t3AvgAmpL = new Label(Double.toString(t3AvgAmp));
		Label t3AvgTrapL = new Label(Double.toString(t3AvgTrap));
		Label t3AvgCliL = new Label(Double.toString(t3AvgCli));
	}
	
	@Override
	public void handle(ActionEvent event) {
		try {
			if(event.getSource() == seNonAllincesB) {
				Team t1;
				Team t2;
				Team t3;
				String selTeam1S = teamCB1.getSelectionModel().getSelectedItem();
				String selTeam2S = teamCB2.getSelectionModel().getSelectedItem();
				String selTeam3S = teamCB3.getSelectionModel().getSelectedItem();
				int selTeamNum1 = Integer.parseInt(selTeam1S);
				int selTeamNum2 = Integer.parseInt(selTeam2S);
				int selTeamNum3 = Integer.parseInt(selTeam3S);
				t1 = theTeamList.getATeam(selTeamNum1);
				t2 = theTeamList.getATeam(selTeamNum2);
				t3 = theTeamList.getATeam(selTeamNum3);
			}
		} catch(Exception e) {
			System.out.println("Error: " + e);
		}
		
	}
}
