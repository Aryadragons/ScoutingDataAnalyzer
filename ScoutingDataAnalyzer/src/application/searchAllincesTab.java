package application;

import java.util.List;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

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
		t1AvgCyL.setId("avgStat");
		t1AvgSpeL.setId("avgStat");
		t1AvgAmpL.setId("avgStat");
		t1AvgTrapL.setId("avgStat");
		t1AvgCliL.setId("avgStat");
		t2AvgCyL.setId("avgStat");
		t2AvgSpeL.setId("avgStat");
		t2AvgAmpL.setId("avgStat");
		t2AvgTrapL.setId("avgStat");
		t2AvgCliL.setId("avgStat");
		t3AvgCyL.setId("avgStat");
		t3AvgSpeL.setId("avgStat");
		t3AvgAmpL.setId("avgStat");
		t3AvgTrapL.setId("avgStat");
		t3AvgCliL.setId("avgStat");
		Label t1AvgCyQL = new Label("Avg Cycles");
		Label t1AvgSpeQL = new Label("Avg Speaker");
		Label t1AvgAmpQL = new Label("Avg Amp");
		Label t1AvgTrapQL = new Label("Avg Trap");
		Label t1AvgCliQL = new Label("Avg Climb");
		Label t2AvgCyQL = new Label("Avg Cycles");
		Label t2AvgSpeQL = new Label("Avg Speaker");
		Label t2AvgAmpQL = new Label("Avg Amp");
		Label t2AvgTrapQL = new Label("Avg Trap");
		Label t2AvgCliQL = new Label("Avg Climb");
		Label t3AvgCyQL = new Label("Avg Cycles");
		Label t3AvgSpeQL = new Label("Avg Speaker");
		Label t3AvgAmpQL = new Label("Avg Amp");
		Label t3AvgTrapQL = new Label("Avg Trap");
		Label t3AvgCliQL = new Label("Avg Climb");
		t1AvgCyQL.setId("smallTitle");
		t1AvgSpeQL.setId("smallTitle");
		t1AvgAmpQL.setId("smallTitle");
		t1AvgTrapQL.setId("smallTitle");
		t1AvgCliQL.setId("smallTitle");
		t2AvgCyQL.setId("smallTitle");
		t2AvgSpeQL.setId("smallTitle");
		t2AvgAmpQL.setId("smallTitle");
		t2AvgTrapQL.setId("smallTitle");
		t2AvgCliQL.setId("smallTitle");
		t3AvgCyQL.setId("smallTitle");
		t3AvgSpeQL.setId("smallTitle");
		t3AvgAmpQL.setId("smallTitle");
		t3AvgTrapQL.setId("smallTitle");
		t3AvgCliQL.setId("smallTitle");
		BorderPane t1CyBP = new BorderPane();
		BorderPane t1SpeBP = new BorderPane();
		BorderPane t1AmpBP = new BorderPane();
		BorderPane t1TrapBP = new BorderPane();
		BorderPane t1CliBP = new BorderPane();
		BorderPane t2CyBP = new BorderPane();
		BorderPane t2SpeBP = new BorderPane();
		BorderPane t2AmpBP = new BorderPane();
		BorderPane t2TrapBP = new BorderPane();
		BorderPane t2CliBP = new BorderPane();
		BorderPane t3CyBP = new BorderPane();
		BorderPane t3SpeBP = new BorderPane();
		BorderPane t3AmpBP = new BorderPane();
		BorderPane t3TrapBP = new BorderPane();
		BorderPane t3CliBP = new BorderPane();
		t1CyBP.setTop(t1AvgCyQL);
		t1SpeBP.setTop(t1AvgSpeQL);
		t1AmpBP.setTop(t1AvgAmpQL);
		t1TrapBP.setTop(t1AvgTrapQL);
		t1CliBP.setTop(t1AvgCliQL);
		t1CyBP.setCenter(t1AvgCyL);
		t1SpeBP.setCenter(t1AvgSpeL);
		t1AmpBP.setCenter(t1AvgAmpL);
		t1TrapBP.setCenter(t1AvgTrapL);
		t1CliBP.setCenter(t1AvgCliL);
		t2CyBP.setTop(t2AvgCyQL);
		t2SpeBP.setTop(t2AvgSpeQL);
		t2AmpBP.setTop(t2AvgAmpQL);
		t2TrapBP.setTop(t2AvgTrapQL);
		t2CliBP.setTop(t2AvgCliQL);
		t2CyBP.setCenter(t2AvgCyL);
		t2SpeBP.setCenter(t2AvgSpeL);
		t2AmpBP.setCenter(t2AvgAmpL);
		t2TrapBP.setCenter(t2AvgTrapL);
		t2CliBP.setCenter(t2AvgCliL);
		t3CyBP.setTop(t3AvgCyQL);
		t3SpeBP.setTop(t3AvgSpeQL);
		t3AmpBP.setTop(t3AvgAmpQL);
		t3TrapBP.setTop(t3AvgTrapQL);
		t3CliBP.setTop(t3AvgCliQL);
		t3CyBP.setCenter(t3AvgCyL);
		t3SpeBP.setCenter(t3AvgSpeL);
		t3AmpBP.setCenter(t3AvgAmpL);
		t3TrapBP.setCenter(t3AvgTrapL);
		t3CliBP.setCenter(t3AvgCliL);
		t1CyBP.setId("seAllNonBP1");
		t1SpeBP.setId("seAllNonBP2");
		t1AmpBP.setId("seAllNonBP3");
		t1TrapBP.setId("seAllNonBP4");
		t1CliBP.setId("seAllNonBP5");
		t2CyBP.setId("seAllNonBP9");
		t2SpeBP.setId("seAllNonBP8");
		t2AmpBP.setId("seAllNonBP7");
		t2TrapBP.setId("seAllNonBP6");
		t2CliBP.setId("seAllNonBP5");
		t3CyBP.setId("seAllNonBP1");
		t3SpeBP.setId("seAllNonBP2");
		t3AmpBP.setId("seAllNonBP3");
		t3TrapBP.setId("seAllNonBP4");
		t3CliBP.setId("seAllNonBP5");
		Label t1TitleL = new Label(t1.getTeamNum() + "'s Stats");
		Label t2TitleL = new Label(t2.getTeamNum() + "'s Stats");
		Label t3TitleL = new Label(t3.getTeamNum() + "'s Stats");
		t1TitleL.setId("TitleLabelPlay");
		t2TitleL.setId("TitleLabelPlay");
		t3TitleL.setId("TitleLabelPlay");
		BorderPane t1TitleBP = new BorderPane();
		BorderPane t2TitleBP = new BorderPane();
		BorderPane t3TitleBP = new BorderPane();
		t1TitleBP.setCenter(t1TitleL);
		t2TitleBP.setCenter(t2TitleL);
		t3TitleBP.setCenter(t3TitleL);
		t1TitleBP.setId("seAllt1TitleBP");
		t2TitleBP.setId("seAllt2TitleBP");
		t3TitleBP.setId("seAllt3TitleBP");
		VBox t1VB = new VBox(5);
		VBox t2VB = new VBox(5);
		VBox t3VB = new VBox(5);
		t1VB.getChildren().addAll(t1TitleBP, t1CyBP, t1SpeBP, t1AmpBP, t1TrapBP, t1CliBP);
		t2VB.getChildren().addAll(t2TitleBP, t2CyBP, t2SpeBP, t2AmpBP, t2TrapBP, t2CliBP);
		t3VB.getChildren().addAll(t3TitleBP, t3CyBP, t3SpeBP, t3AmpBP, t3TrapBP, t3CliBP);
		this.add(new Label("    "), 0, 0);
		this.add(new Label("    "), 2, 0);
		this.add(new Label("    "), 4, 0);
		this.add(t1VB, 1, 1);
		this.add(t2VB, 3, 1);
		this.add(t3VB, 5, 1);
	}
	
	@Override
	public void handle(ActionEvent event) {
		try {
			if(event.getSource() == seNonAllincesB) {
				this.getChildren().clear();
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
