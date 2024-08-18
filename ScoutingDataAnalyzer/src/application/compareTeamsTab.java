package application;

import java.util.List;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

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
	
	public void threeTeamCompare(Team T1, Team T2, Team T3) {
		double t1AvgCy = T1.getAvgCycles();
		double t1AvgSpe = T1.getAvgSpe();
		double t1AvgAmp = T1.getAvgAmp();
		double t1AvgTrap = T1.getAvgTrap();
		double t1AvgCli = T1.getAvgClimb();
		double t1AvgScoSk = T1.getHumScoSkill();
		double t1AvgAmpSk = T1.getHumAmpSkill();
		double t1AvgAmpN = T1.getHumAmpNotes();
		double t1TimesSco = T1.getTimesHumSco();
		double t1TimesAmp = T1.getTimesHumAmp();
		double t2AvgCy = T2.getAvgCycles();
		double t2AvgSpe = T2.getAvgSpe();
		double t2AvgAmp = T2.getAvgAmp();
		double t2AvgTrap = T2.getAvgTrap();
		double t2AvgCli = T2.getAvgClimb();
		double t2AvgScoSk = T1.getHumScoSkill();
		double t2AvgAmpSk = T1.getHumAmpSkill();
		double t2AvgAmpN = T1.getHumAmpNotes();
		double t2TimesSco = T1.getTimesHumSco();
		double t2TimesAmp = T1.getTimesHumAmp();
		double t3AvgCy = T3.getAvgCycles();
		double t3AvgSpe = T3.getAvgSpe();
		double t3AvgAmp = T3.getAvgAmp();
		double t3AvgTrap = T2.getAvgTrap();
		double t3AvgCli = T3.getAvgClimb();
		double t3AvgScoSk = T1.getHumScoSkill();
		double t3AvgAmpSk = T1.getHumAmpSkill();
		double t3AvgAmpN = T1.getHumAmpNotes();
		double t3TimesSco = T1.getTimesHumSco();
		double t3TimesAmp = T1.getTimesHumAmp();
		Label t1AvgCyL = new Label(Double.toString(t1AvgCy));
		Label t1AvgSpeL = new Label(Double.toString(t1AvgSpe));
		Label t1AvgAmpL = new Label(Double.toString(t1AvgAmp));
		Label t1AvgTrapL = new Label(Double.toString(t1AvgTrap));
		Label t1AvgCliL = new Label(Double.toString(t1AvgCli));
		Label t1AvgScoSkL = new Label(Double.toString(t1AvgScoSk));
		Label t1AvgAmpSkL = new Label(Double.toString(t1AvgAmpSk));
		Label t1AvgAmpNL = new Label(Double.toString(t1AvgAmpN));
		Label t1TimesScoL = new Label(Double.toString(t1TimesSco));
		Label t1TimesAmpL = new Label(Double.toString(t1TimesAmp));
		Label t2AvgCyL = new Label(Double.toString(t2AvgCy));
		Label t2AvgSpeL = new Label(Double.toString(t2AvgSpe));
		Label t2AvgAmpL = new Label(Double.toString(t2AvgAmp));
		Label t2AvgTrapL = new Label(Double.toString(t2AvgTrap));
		Label t2AvgCliL = new Label(Double.toString(t2AvgCli));
		Label t2AvgScoSkL = new Label(Double.toString(t2AvgScoSk));
		Label t2AvgAmpSkL = new Label(Double.toString(t2AvgAmpSk));
		Label t2AvgAmpNL = new Label(Double.toString(t2AvgAmpN));
		Label t2TimesScoL = new Label(Double.toString(t2TimesSco));
		Label t2TimesAmpL = new Label(Double.toString(t2TimesAmp));
		Label t3AvgCyL = new Label(Double.toString(t3AvgCy));
		Label t3AvgSpeL = new Label(Double.toString(t3AvgSpe));
		Label t3AvgAmpL = new Label(Double.toString(t3AvgAmp));
		Label t3AvgTrapL = new Label(Double.toString(t3AvgTrap));
		Label t3AvgCliL = new Label(Double.toString(t3AvgCli));
		Label t3AvgScoSkL = new Label(Double.toString(t3AvgScoSk));
		Label t3AvgAmpSkL = new Label(Double.toString(t3AvgAmpSk));
		Label t3AvgAmpNL = new Label(Double.toString(t3AvgAmpN));
		Label t3TimesScoL = new Label(Double.toString(t3TimesSco));
		Label t3TimesAmpL = new Label(Double.toString(t3TimesAmp));
		Label t1AvgCyTitleL = new Label("Avg Cycle");
		Label t1AvgSpeTitleL = new Label("Avg Speaker");
		Label t1AvgAmpTitleL = new Label("Avg Amp");
		Label t1AvgTrapTitleL = new Label("Avg Trap");
		Label t1AvgCliTitleL = new Label("Avg Climb");
		Label t1AvgScoSkTitleL = new Label("Score Skill");
		Label t1AvgAmpSkTitleL = new Label("Amp Skill");
		Label t1AvgAmpNTitleL = new Label("High Notes");
		Label t1TimesScoTitleL = new Label("Times Score");
		Label t1TimesAmpTitleL = new Label("Times Amp");
		Label t2AvgCyTitleL = new Label("Avg Cycle");
		Label t2AvgSpeTitleL = new Label("Avg Speaker");
		Label t2AvgAmpTitleL = new Label("Avg Amp");
		Label t2AvgTrapTitleL = new Label("Avg Trap");
		Label t2AvgCliTitleL = new Label("Avg Climb");
		Label t2AvgScoSkTitleL = new Label("Score Skill");
		Label t2AvgAmpSkTitleL = new Label("Amp Skill");
		Label t2AvgAmpNTitleL = new Label("High Notes");
		Label t2TimesScoTitleL = new Label("Times Score");
		Label t2TimesAmpTitleL = new Label("Times Amp");
		Label t3AvgCyTitleL = new Label("Avg Cycle");
		Label t3AvgSpeTitleL = new Label("Avg Speaker");
		Label t3AvgAmpTitleL = new Label("Avg Amp");
		Label t3AvgTrapTitleL = new Label("Avg Trap");
		Label t3AvgCliTitleL = new Label("Avg Climb");
		Label t3AvgScoSkTitleL = new Label("Score Skill");
		Label t3AvgAmpSkTitleL = new Label("Amp Skill");
		Label t3AvgAmpNTitleL = new Label("High Notes");
		Label t3TimesScoTitleL = new Label("Times Score");
		Label t3TimesAmpTitleL = new Label("Times Amp");
		t1AvgCyL.setId("avgStat");
		t1AvgSpeL.setId("avgStat");
		t1AvgAmpL.setId("avgStat");
		t1AvgTrapL.setId("avgStat");
		t1AvgCliL.setId("avgStat");
		t1AvgScoSkL.setId("avgStat");
		t1AvgAmpSkL.setId("avgStat");
		t1AvgAmpNL.setId("avgStat");
		t1TimesScoL.setId("avgStat");
		t1TimesAmpL.setId("avgStat");
		t2AvgCyL.setId("avgStat");
		t2AvgSpeL.setId("avgStat");
		t2AvgAmpL.setId("avgStat");
		t2AvgTrapL.setId("avgStat");
		t2AvgCliL.setId("avgStat");
		t2AvgScoSkL.setId("avgStat");
		t2AvgAmpSkL.setId("avgStat");
		t2AvgAmpNL.setId("avgStat");
		t2TimesScoL.setId("avgStat");
		t2TimesAmpL.setId("avgStat");
		t3AvgCyL.setId("avgStat");
		t3AvgSpeL.setId("avgStat");
		t3AvgAmpL.setId("avgStat");
		t3AvgTrapL.setId("avgStat");
		t3AvgCliL.setId("avgStat");
		t3AvgScoSkL.setId("avgStat");
		t3AvgAmpSkL.setId("avgStat");
		t3AvgAmpNL.setId("avgStat");
		t3TimesScoL.setId("avgStat");
		t3TimesAmpL.setId("avgStat");
		t1AvgCyTitleL.setId("smallTitle");
		t1AvgSpeTitleL.setId("smallTitle");
		t1AvgAmpTitleL .setId("smallTitle");
		t1AvgTrapTitleL.setId("smallTitle");
		t1AvgCliTitleL.setId("smallTitle");
		t2AvgCyTitleL.setId("smallTitle");
		t2AvgSpeTitleL.setId("smallTitle");
		t2AvgAmpTitleL.setId("smallTitle");
		t2AvgTrapTitleL.setId("smallTitle");
		t2AvgCliTitleL.setId("smallTitle");
		t3AvgCyTitleL.setId("smallTitle");
		t3AvgSpeTitleL.setId("smallTitle");
		t3AvgAmpTitleL.setId("smallTitle");
		t3AvgTrapTitleL.setId("smallTitle");
		t3AvgCliTitleL.setId("smallTitle");
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
		t1CyBP.setTop(t1AvgCyTitleL);
		t1SpeBP.setTop(t1AvgSpeTitleL);
		t1AmpBP.setTop(t1AvgAmpTitleL);
		t1TrapBP.setTop(t1AvgTrapTitleL);
		t1CliBP.setTop(t1AvgCliTitleL);
		t2CyBP.setTop(t2AvgCyTitleL);
		t2SpeBP.setTop(t2AvgSpeTitleL);
		t2AmpBP.setTop(t2AvgAmpTitleL);
		t2TrapBP.setTop(t2AvgTrapTitleL);
		t2CliBP.setTop(t2AvgCliTitleL);
		t3CyBP.setTop(t3AvgCyTitleL);
		t3SpeBP.setTop(t3AvgSpeTitleL);
		t3AmpBP.setTop(t3AvgAmpTitleL);
		t3TrapBP.setTop(t3AvgTrapTitleL);
		t3CliBP.setTop(t3AvgCliTitleL);
		t1CyBP.setCenter(t1AvgCyL);
		t1SpeBP.setCenter(t1AvgSpeL);
		t1AmpBP.setCenter(t1AvgAmpL);
		t1TrapBP.setCenter(t1AvgTrapTitleL);
		t1CliBP.setCenter(t1AvgCliTitleL);
		t2CyBP.setCenter(t2AvgCyTitleL);
		t2SpeBP.setCenter(t2AvgSpeTitleL);
		t2AmpBP.setCenter(t2AvgAmpTitleL);
		t2TrapBP.setCenter(t2AvgTrapTitleL);
		t2CliBP.setCenter(t2AvgCliTitleL);
		t3CyBP.setCenter(t3AvgCyTitleL);
		t3SpeBP.setCenter(t3AvgSpeTitleL);
		t3AmpBP.setCenter(t3AvgAmpTitleL);
		t3TrapBP.setCenter(t3AvgTrapTitleL);
		t3CliBP.setCenter(t3AvgCliTitleL);
		t1CyBP.setId("comTeamsStatBP1");
		t1SpeBP.setId("comTeamsStatBP2");
		t1AmpBP.setId("comTeamsStatBP3");
		t1TrapBP.setId("comTeamsStatBP4");
		t1CliBP.setId("comTeamsStatBP5");
		t2CyBP.setId("comTeamsStatBP1");
		t2SpeBP.setId("comTeamsStatBP2");
		t2AmpBP.setId("comTeamsStatBP3");
		t2TrapBP.setId("comTeamsStatBP4");
		t2CliBP.setId("comTeamsStatBP5");
		t3CyBP.setId("comTeamsStatBP1");
		t3SpeBP.setId("comTeamsStatBP2");
		t3AmpBP.setId("comTeamsStatBP3");
		t3TrapBP.setId("comTeamsStatBP4");
		t3CliBP.setId("comTeamsStatBP5");
		Label t1TeamNumL = new Label(Integer.toString(T1.getTeamNum()) + "'s Stats");
		Label t2TeamNumL = new Label(Integer.toString(T2.getTeamNum()) + "'s Stats");
		Label t3TeamNumL = new Label(Integer.toString(T3.getTeamNum()) + "'s Stats");
		t1TeamNumL.setId("TitleLabelPlay");
		t2TeamNumL.setId("TitleLabelPlay");
		t3TeamNumL.setId("TitleLabelPlay");
		BorderPane t1TeamNumBP = new BorderPane();
		BorderPane t2TeamNumBP = new BorderPane();
		BorderPane t3TeamNumBP = new BorderPane();
		t1TeamNumBP.setCenter(t1TeamNumL);
		t2TeamNumBP.setCenter(t2TeamNumL);
		t3TeamNumBP.setCenter(t3TeamNumL);
		VBox t1VB = new VBox(5);
		VBox t2VB = new VBox(5);
		VBox t3VB = new VBox(5);
		t1VB.getChildren().addAll(t1TeamNumBP, t1CyBP, t1SpeBP, t1AmpBP, t1TrapBP, t1CliBP);
		t2VB.getChildren().addAll(t2TeamNumBP, t2CyBP, t2SpeBP, t2AmpBP, t2TrapBP, t2CliBP);
		t3VB.getChildren().addAll(t3TeamNumBP, t3CyBP, t3SpeBP, t3AmpBP, t3TrapBP, t3CliBP);
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
				
			}
		} catch (Exception e) {
			Alert addcomA = new Alert(Alert.AlertType.INFORMATION);
			addcomA.setTitle("Error");
			addcomA.setContentText("Error with inputed values: " + e);
			addcomA.showAndWait();
		}
		
	}
}
