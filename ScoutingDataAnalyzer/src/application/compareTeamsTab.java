package application;

import java.util.List;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class compareTeamsTab extends GridPane implements EventHandler<ActionEvent>{
	
	private ComboBox<String> team1CB;
	private ComboBox<String> team2CB;
	private ComboBox<String> team3CB;
	private Button submitB;
	private List<Integer> listOfTeamNums;
	private TeamList theTL;
	
	public compareTeamsTab(List<Integer> importedListOfTeamNums, TeamList imTL) {
		listOfTeamNums = importedListOfTeamNums;
		imTL = theTL;
		Label selTeam1 = new Label("Select a Team");
		Label selTeam2 = new Label("Select a Team");
		Label selTeam3 = new Label("Select a Team");
		team1CB = new ComboBox<String>();
		team2CB = new ComboBox<String>();
		team3CB = new ComboBox<String>();
	}
	
	private void addComboBoxItems(ComboBox<String> temp) {
		String teamNumS;
		for (int i = 0; i < listOfTeamNums.size(); i++) {
			if (listOfTeamNums.get(i) != null) {
				teamNumS = Integer.toString(listOfTeamNums.get(i));
				temp.getItems().add(teamNumS);
			}
		}
	}
	
	@Override
	public void handle(ActionEvent event) {
		try {
			if (event.getSource() == submitB) {
				String selTeamNum1S = team1CB.getSelectionModel().getSelectedItem();
				String selTeamNum2S = team1CB.getSelectionModel().getSelectedItem();
				String selTeamNum3S = team1CB.getSelectionModel().getSelectedItem();
				int selTeamNum1 = Integer.parseInt(selTeamNum1S);
				int selTeamNum2 = Integer.parseInt(selTeamNum1S);
				int selTeamNum3 = Integer.parseInt(selTeamNum1S);
				Team T1 = theTL.getATeam(selTeamNum1);
				Team T2 = theTL.getATeam(selTeamNum2);
				Team T3 = theTL.getATeam(selTeamNum3);
				double t1AvgCy = T1.getAvgCycles();
				double t1AvgSpe = T1.getAvgSpe();
				double t1AvgAmp = T1.getAvgAmp();
				double t1AvgTrap = T1.getAvgTrap();
				double t1AvgCli = T1.getAvgClimb();
				double t2AvgCy = T2.getAvgCycles();
				double t2AvgSpe = T2.getAvgSpe();
				double t2AvgAmp = T2.getAvgAmp();
				double t2AvgTrap = T2.getAvgTrap();
				double t2AvgCli = T2.getAvgClimb();
				double t3AvgCy = T3.getAvgCycles();
				double t3AvgSpe = T3.getAvgSpe();
				double t3AvgAmp = T3.getAvgAmp();
				double t3AvgTrap = T2.getAvgTrap();
				double t3AvgCli = T3.getAvgClimb();
				Label t1AvgCyL = new Label(Double.toString(t1AvgCy));
				Label t1AvgSpeL = new Label(Double.toString(t1AvgSpe));
				Label t1AvgAmpL = new Label(Double.toString(t1AvgAmp));
				Label t1AvgTrapL = new Label(Double.toString(t1AvgTrap));
				Label t1AvgCliL = new Label(Double.toString(t1AvgCli));
				Label t2AvgCyL = new Label(Double.toString(t2AvgCy));
				Label t2AvgSpeL = new Label(Double.toString(t1AvgSpe));
				Label t2AvgAmpL = new Label(Double.toString(t1AvgAmp));
				Label t2AvgTrapL = new Label(Double.toString(t1AvgTrap));
				Label t2AvgCliL = new Label(Double.toString(t1AvgCli));
				Label t3AvgCyL = new Label(Double.toString(t3AvgCy));
				Label t3AvgSpeL = new Label(Double.toString(t1AvgSpe));
				Label t3AvgAmpL = new Label(Double.toString(t1AvgAmp));
				Label t3AvgTrapL = new Label(Double.toString(t1AvgTrap));
				Label t3AvgCliL = new Label(Double.toString(t1AvgCli));
				Label t1AvgCyTitleL = new Label("Avg Cycle");
				Label t1AvgSpeTitleL = new Label("Avg Speaker");
				Label t1AvgAmpTitleL = new Label("Avg Amp");
				Label t1AvgTrapTitleL = new Label("Avg Trap");
				Label t1AvgCliTitleL = new Label("Avg Climb");
				Label t2AvgCyTitleL = new Label(Double.toString(t2AvgCy));
				Label t2AvgSpeTitleL = new Label(Double.toString(t1AvgSpe));
				Label t2AvgAmpTitleL = new Label(Double.toString(t1AvgAmp));
				Label t2AvgTrapTitleL = new Label(Double.toString(t1AvgTrap));
				Label t2AvgCliTitleL = new Label(Double.toString(t1AvgCli));
				Label t3AvgCyTitleL = new Label(Double.toString(t3AvgCy));
				Label t3AvgSpeTitleL = new Label(Double.toString(t1AvgSpe));
				Label t3AvgAmpTitleL = new Label(Double.toString(t1AvgAmp));
				Label t3AvgTrapTitleL = new Label(Double.toString(t1AvgTrap));
				Label t3AvgCliTitleL = new Label(Double.toString(t1AvgCli));
			}
		} catch (Exception e) {
			Alert addcomA = new Alert(Alert.AlertType.INFORMATION);
			addcomA.setTitle("Error");
			addcomA.setContentText("Error with inputed values: " + e);
			addcomA.showAndWait();
		}
		
	}
}
