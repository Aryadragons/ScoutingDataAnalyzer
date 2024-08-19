package application;

import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class compareTeamsTab extends GridPane implements EventHandler<ActionEvent>{
	
	private ComboBox<String> team1CB;
	private ComboBox<String> team2CB;
	private ComboBox<String> team3CB;
	private Button submitB;
	private List<Integer> listOfTeamNums;
	private TeamList theTL;
	private PieChart team1CyPieC;
	private PieChart team2CyPieC;
	private PieChart team3CyPieC;
	private PieChart team1HumPlayPieC;
	private PieChart team2HumPlayPieC;
	private PieChart team3HumPlayPieC;
	private VBox team1PCVB;
	private VBox team2PCVB;
	private VBox team3PCVB;
	private VBox t1VB;
	private VBox t2VB;
	private VBox t3VB;
	
	public compareTeamsTab(List<Integer> importedListOfTeamNums, TeamList imTL) {
		listOfTeamNums = importedListOfTeamNums;
		theTL = imTL;
		Label selTeam1 = new Label("Select a Team");
		Label selTeam2 = new Label("Select a Team");
		Label selTeam3 = new Label("Select a Team");
		selTeam1.setId("smallTitle");
		selTeam2.setId("smallTitle");
		selTeam3.setId("smallTitle");
		team1CB = new ComboBox<String>();
		team2CB = new ComboBox<String>();
		team3CB = new ComboBox<String>();
		addComboBoxItems(team1CB);
		addComboBoxItems(team2CB);
		addComboBoxItems(team3CB);
		BorderPane team1BP = new BorderPane();
		team1BP.setTop(selTeam1);
		team1BP.setCenter(team1CB);
		team1BP.setId("comTSelTeam");
		BorderPane team2BP = new BorderPane();
		team2BP.setTop(selTeam2);
		team2BP.setCenter(team2CB);
		team2BP.setId("comTSelTeam");
		BorderPane team3BP = new BorderPane();
		team3BP.setTop(selTeam3);
		team3BP.setCenter(team3CB);
		team3BP.setId("comTSelTeam");
		submitB = new Button("Submit");
		submitB.setOnAction(this);
		this.add(new Label("    "), 0, 0);
		this.add(new Label("    "), 2, 0);
		this.add(new Label("    "), 4, 0);
		this.add(new Label("    "), 0, 2);
		this.add(team1BP, 1, 1);
		this.add(team2BP, 3, 1);
		this.add(team3BP, 5, 1);
		this.add(submitB, 1, 3);
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
		System.out.println("BoopComTeams4.0");
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
		double t2AvgScoSk = T2.getHumScoSkill();
		double t2AvgAmpSk = T2.getHumAmpSkill();
		double t2AvgAmpN = T2.getHumAmpNotes();
		double t2TimesSco = T2.getTimesHumSco();
		double t2TimesAmp = T2.getTimesHumAmp();
		double t3AvgCy = T3.getAvgCycles();
		double t3AvgSpe = T3.getAvgSpe();
		double t3AvgAmp = T3.getAvgAmp();
		double t3AvgTrap = T3.getAvgTrap();
		double t3AvgCli = T3.getAvgClimb();
		double t3AvgScoSk = T3.getHumScoSkill();
		double t3AvgAmpSk = T3.getHumAmpSkill();
		double t3AvgAmpN = T3.getHumAmpNotes();
		double t3TimesSco = T3.getTimesHumSco();
		double t3TimesAmp = T3.getTimesHumAmp();
		System.out.println("BoopComTeams4.1" + t1AvgCy + t2AvgCy + t3AvgCy);
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
		System.out.println("BoopComTeams4.2");
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
		System.out.println("BoopComTeams4.3");
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
		t1AvgScoSkTitleL.setId("smallTitle");
		t1AvgAmpSkTitleL.setId("smallTitle");
		t1AvgAmpNTitleL.setId("smallTitle");
		t1TimesScoTitleL.setId("smallTitle");
		t1TimesAmpTitleL.setId("smallTitle");
		t2AvgCyTitleL.setId("smallTitle");
		t2AvgSpeTitleL.setId("smallTitle");
		t2AvgAmpTitleL.setId("smallTitle");
		t2AvgTrapTitleL.setId("smallTitle");
		t2AvgCliTitleL.setId("smallTitle");
		t2AvgScoSkTitleL.setId("smallTitle");
		t2AvgAmpSkTitleL.setId("smallTitle");
		t2AvgAmpNTitleL.setId("smallTitle");
		t2TimesScoTitleL.setId("smallTitle");
		t2TimesAmpTitleL.setId("smallTitle");
		t3AvgCyTitleL.setId("smallTitle");
		t3AvgSpeTitleL.setId("smallTitle");
		t3AvgAmpTitleL.setId("smallTitle");
		t3AvgTrapTitleL.setId("smallTitle");
		t3AvgCliTitleL.setId("smallTitle");
		t3AvgScoSkTitleL.setId("smallTitle");
		t3AvgAmpSkTitleL.setId("smallTitle");
		t3AvgAmpNTitleL.setId("smallTitle");
		t3TimesScoTitleL.setId("smallTitle");
		t3TimesAmpTitleL.setId("smallTitle");
		System.out.println("BoopComTeams4.4");
		BorderPane t1CyBP = new BorderPane();
		BorderPane t1SpeBP = new BorderPane();
		BorderPane t1AmpBP = new BorderPane();
		BorderPane t1TrapBP = new BorderPane();
		BorderPane t1CliBP = new BorderPane();
		BorderPane t1AvgScoSkBP = new BorderPane();
		BorderPane t1AvgAmpSkBP = new BorderPane();
		BorderPane t1AvgAmpNBP = new BorderPane();
		BorderPane t1TimesScoBP = new BorderPane();
		BorderPane t1TimesAmpBP = new BorderPane();
		BorderPane t2CyBP = new BorderPane();
		BorderPane t2SpeBP = new BorderPane();
		BorderPane t2AmpBP = new BorderPane();
		BorderPane t2TrapBP = new BorderPane();
		BorderPane t2CliBP = new BorderPane();
		BorderPane t2AvgScoSkBP = new BorderPane();
		BorderPane t2AvgAmpSkBP = new BorderPane();
		BorderPane t2AvgAmpNBP = new BorderPane();
		BorderPane t2TimesScoBP = new BorderPane();
		BorderPane t2TimesAmpBP = new BorderPane();
		BorderPane t3CyBP = new BorderPane();
		BorderPane t3SpeBP = new BorderPane();
		BorderPane t3AmpBP = new BorderPane();
		BorderPane t3TrapBP = new BorderPane();
		BorderPane t3CliBP = new BorderPane();
		BorderPane t3AvgScoSkBP = new BorderPane();
		BorderPane t3AvgAmpSkBP = new BorderPane();
		BorderPane t3AvgAmpNBP = new BorderPane();
		BorderPane t3TimesScoBP = new BorderPane();
		BorderPane t3TimesAmpBP = new BorderPane();
		System.out.println("BoopComTeams4.5");
		t1CyBP.setTop(t1AvgCyTitleL);
		t1SpeBP.setTop(t1AvgSpeTitleL);
		t1AmpBP.setTop(t1AvgAmpTitleL);
		t1TrapBP.setTop(t1AvgTrapTitleL);
		t1CliBP.setTop(t1AvgCliTitleL);
		System.out.println("BoopComTeams4.5.1");
		t1AvgScoSkBP.setTop(t1AvgScoSkTitleL);
		t1AvgAmpSkBP.setTop(t1AvgAmpSkTitleL);
		t1AvgAmpNBP.setTop(t1AvgAmpNTitleL);
		t1TimesScoBP.setTop(t1TimesScoTitleL);
		t1TimesAmpBP.setTop(t1TimesAmpTitleL);
		System.out.println("BoopComTeams4.5.2");
		t2CyBP.setTop(t2AvgCyTitleL);
		t2SpeBP.setTop(t2AvgSpeTitleL);
		t2AmpBP.setTop(t2AvgAmpTitleL);
		t2TrapBP.setTop(t2AvgTrapTitleL);
		t2CliBP.setTop(t2AvgCliTitleL);
		System.out.println("BoopComTeams4.5.3");
		t2AvgScoSkBP.setTop(t2AvgScoSkTitleL);
		t2AvgAmpSkBP.setTop(t2AvgAmpSkTitleL);
		t2AvgAmpNBP.setTop(t2AvgAmpNTitleL);
		t2TimesScoBP.setTop(t2TimesScoTitleL);
		t2TimesAmpBP.setTop(t2TimesAmpTitleL);
		System.out.println("BoopComTeams4.5.4");
		t3CyBP.setTop(t3AvgCyTitleL);
		t3SpeBP.setTop(t3AvgSpeTitleL);
		t3AmpBP.setTop(t3AvgAmpTitleL);
		t3TrapBP.setTop(t3AvgTrapTitleL);
		t3CliBP.setTop(t3AvgCliTitleL);
		System.out.println("BoopComTeams4.5.5");
		t3AvgScoSkBP.setTop(t3AvgScoSkTitleL);
		t3AvgAmpSkBP.setTop(t3AvgAmpSkTitleL);
		t3AvgAmpNBP.setTop(t3AvgAmpNTitleL);
		t3TimesScoBP.setTop(t3TimesScoTitleL);
		t3TimesAmpBP.setTop(t3TimesAmpTitleL);
		System.out.println("BoopComTeams4.5.6");
		t1CyBP.setCenter(t1AvgCyL);
		t1SpeBP.setCenter(t1AvgSpeL);
		t1AmpBP.setCenter(t1AvgAmpL);
		t1TrapBP.setCenter(t1AvgTrapL);
		t1CliBP.setCenter(t1AvgCliL);
		System.out.println("BoopComTeams4.5.7");
		t1AvgScoSkBP.setCenter(t1AvgScoSkL);
		t1AvgAmpSkBP.setCenter(t1AvgAmpSkL);
		t1AvgAmpNBP.setCenter(t1AvgAmpNL);
		t1TimesScoBP.setCenter(t1TimesScoL);
		t1TimesAmpBP.setCenter(t1TimesAmpL);
		System.out.println("BoopComTeams4.5.8");
		t2CyBP.setCenter(t2AvgCyL);
		t2SpeBP.setCenter(t2AvgSpeL);
		t2AmpBP.setCenter(t2AvgAmpL);
		t2TrapBP.setCenter(t2AvgTrapL);
		t2CliBP.setCenter(t2AvgCliL);
		System.out.println("BoopComTeams4.5.9");
		t2AvgScoSkBP.setCenter(t2AvgScoSkL);
		t2AvgAmpSkBP.setCenter(t2AvgAmpSkL);
		t2AvgAmpNBP.setCenter(t2AvgAmpNL);
		t2TimesScoBP.setCenter(t2TimesScoL);
		t2TimesAmpBP.setCenter(t2TimesAmpL);
		System.out.println("BoopComTeams4.5.10");
		t3CyBP.setCenter(t3AvgCyL);
		t3SpeBP.setCenter(t3AvgSpeL);
		t3AmpBP.setCenter(t3AvgAmpL);
		t3TrapBP.setCenter(t3AvgTrapL);
		t3CliBP.setCenter(t3AvgCliL);
		System.out.println("BoopComTeams4.5.11");
		t3AvgScoSkBP.setCenter(t3AvgScoSkL);
		t3AvgAmpSkBP.setCenter(t3AvgAmpSkL);
		t3AvgAmpNBP.setCenter(t3AvgAmpNL);
		t3TimesScoBP.setCenter(t3TimesScoL);
		t3TimesAmpBP.setCenter(t3TimesAmpL);
		System.out.println("BoopComTeams4.6");
		t1CyBP.setId("comTeamsStatBP1");
		t1SpeBP.setId("comTeamsStatBP2");
		t1AmpBP.setId("comTeamsStatBP3");
		t1TrapBP.setId("comTeamsStatBP4");
		t1CliBP.setId("comTeamsStatBP5");
		t1AvgScoSkBP.setId("comTeamsStatBP6");
		t1AvgAmpSkBP.setId("comTeamsStatBP7");
		t1AvgAmpNBP.setId("comTeamsStatBP8");
		t1TimesScoBP.setId("comTeamsStatBP9");
		t1TimesAmpBP.setId("comTeamsStatBP8");
		t2CyBP.setId("comTeamsStatBP1");
		t2SpeBP.setId("comTeamsStatBP2");
		t2AmpBP.setId("comTeamsStatBP3");
		t2TrapBP.setId("comTeamsStatBP4");
		t2CliBP.setId("comTeamsStatBP5");
		t2AvgScoSkBP.setId("comTeamsStatBP6");
		t2AvgAmpSkBP.setId("comTeamsStatBP7");
		t2AvgAmpNBP.setId("comTeamsStatBP8");
		t2TimesScoBP.setId("comTeamsStatBP9");
		t2TimesAmpBP.setId("comTeamsStatBP8");
		t3CyBP.setId("comTeamsStatBP1");
		t3SpeBP.setId("comTeamsStatBP2");
		t3AmpBP.setId("comTeamsStatBP3");
		t3TrapBP.setId("comTeamsStatBP4");
		t3CliBP.setId("comTeamsStatBP5");
		t3AvgScoSkBP.setId("comTeamsStatBP6");
		t3AvgAmpSkBP.setId("comTeamsStatBP7");
		t3AvgAmpNBP.setId("comTeamsStatBP8");
		t3TimesScoBP.setId("comTeamsStatBP9");
		t3TimesAmpBP.setId("comTeamsStatBP8");
		System.out.println("BoopComTeams4.7");
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
		t1TeamNumBP.setId("comTeamsTitleBP1");
		t2TeamNumBP.setId("comTeamsTitleBP1");
		t3TeamNumBP.setId("comTeamsTitleBP1");
		System.out.println("BoopComTeams4.8");
		t1VB = new VBox(5);
		t2VB = new VBox(5);
		t3VB = new VBox(5);
		t1VB.getChildren().addAll(t1TeamNumBP, t1CyBP, t1SpeBP, t1AmpBP, t1TrapBP, t1CliBP, t1AvgScoSkBP, t1AvgAmpSkBP, t1AvgAmpNBP, t1TimesScoBP, t1TimesAmpBP);
		t2VB.getChildren().addAll(t2TeamNumBP, t2CyBP, t2SpeBP, t2AmpBP, t2TrapBP, t2CliBP, t2AvgScoSkBP, t2AvgAmpSkBP, t2AvgAmpNBP, t2TimesScoBP, t2TimesAmpBP);
		t3VB.getChildren().addAll(t3TeamNumBP, t3CyBP, t3SpeBP, t3AmpBP, t3TrapBP, t3CliBP, t3AvgScoSkBP, t3AvgAmpSkBP, t3AvgAmpNBP, t3TimesScoBP, t3TimesAmpBP);
		System.out.println("BoopComTeams4.9");
		this.add(new Label("    "), 0, 0);
		this.add(new Label("    "), 0, 2);
		this.add(t1VB, 1, 1);
		this.add(t2VB, 3, 1);
		this.add(t3VB, 5, 1);
		System.out.println("BoopComTeams4.10");
		threeTeamsPieChart(T1, T2, T3);
		System.out.println("BoopComTeams4.11");
	}
	
	public void twoTeamCompare(Team T1, Team T2) {
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
		t1AvgCyTitleL.setId("smallTitle");
		t1AvgSpeTitleL.setId("smallTitle");
		t1AvgAmpTitleL .setId("smallTitle");
		t1AvgTrapTitleL.setId("smallTitle");
		t1AvgCliTitleL.setId("smallTitle");
		t1AvgScoSkTitleL.setId("smallTitle");
		t1AvgAmpSkTitleL.setId("smallTitle");
		t1AvgAmpNTitleL.setId("smallTitle");
		t1TimesScoTitleL.setId("smallTitle");
		t1TimesAmpTitleL.setId("smallTitle");
		t2AvgCyTitleL.setId("smallTitle");
		t2AvgSpeTitleL.setId("smallTitle");
		t2AvgAmpTitleL.setId("smallTitle");
		t2AvgTrapTitleL.setId("smallTitle");
		t2AvgCliTitleL.setId("smallTitle");
		t2AvgScoSkTitleL.setId("smallTitle");
		t2AvgAmpSkTitleL.setId("smallTitle");
		t2AvgAmpNTitleL.setId("smallTitle");
		t2TimesScoTitleL.setId("smallTitle");
		t2TimesAmpTitleL.setId("smallTitle");
		BorderPane t1CyBP = new BorderPane();
		BorderPane t1SpeBP = new BorderPane();
		BorderPane t1AmpBP = new BorderPane();
		BorderPane t1TrapBP = new BorderPane();
		BorderPane t1CliBP = new BorderPane();
		BorderPane t1AvgScoSkBP = new BorderPane();
		BorderPane t1AvgAmpSkBP = new BorderPane();
		BorderPane t1AvgAmpNBP = new BorderPane();
		BorderPane t1TimesScoBP = new BorderPane();
		BorderPane t1TimesAmpBP = new BorderPane();
		BorderPane t2CyBP = new BorderPane();
		BorderPane t2SpeBP = new BorderPane();
		BorderPane t2AmpBP = new BorderPane();
		BorderPane t2TrapBP = new BorderPane();
		BorderPane t2CliBP = new BorderPane();
		BorderPane t2AvgScoSkBP = new BorderPane();
		BorderPane t2AvgAmpSkBP = new BorderPane();
		BorderPane t2AvgAmpNBP = new BorderPane();
		BorderPane t2TimesScoBP = new BorderPane();
		BorderPane t2TimesAmpBP = new BorderPane();
		t1CyBP.setTop(t1AvgCyTitleL);
		t1SpeBP.setTop(t1AvgSpeTitleL);
		t1AmpBP.setTop(t1AvgAmpTitleL);
		t1TrapBP.setTop(t1AvgTrapTitleL);
		t1CliBP.setTop(t1AvgCliTitleL);
		t1AvgScoSkBP.setTop(t1AvgScoSkTitleL);
		t1AvgAmpSkBP.setTop(t1AvgAmpSkTitleL);
		t1AvgAmpNBP.setTop(t1AvgAmpNTitleL);
		t1TimesScoBP.setTop(t1TimesScoTitleL);
		t1TimesAmpBP.setTop(t1TimesAmpTitleL);
		t2CyBP.setTop(t2AvgCyTitleL);
		t2SpeBP.setTop(t2AvgSpeTitleL);
		t2AmpBP.setTop(t2AvgAmpTitleL);
		t2TrapBP.setTop(t2AvgTrapTitleL);
		t2CliBP.setTop(t2AvgCliTitleL);
		t2AvgScoSkBP.setTop(t2AvgScoSkTitleL);
		t2AvgAmpSkBP.setTop(t2AvgAmpSkTitleL);
		t2AvgAmpNBP.setTop(t2AvgAmpNTitleL);
		t2TimesScoBP.setTop(t2TimesScoTitleL);
		t2TimesAmpBP.setTop(t2TimesAmpTitleL);
		t1CyBP.setCenter(t1AvgCyL);
		t1SpeBP.setCenter(t1AvgSpeL);
		t1AmpBP.setCenter(t1AvgAmpL);
		t1TrapBP.setCenter(t1AvgTrapL);
		t1CliBP.setCenter(t1AvgCliL);
		t1AvgScoSkBP.setCenter(t1AvgScoSkL);
		t1AvgAmpSkBP.setCenter(t1AvgAmpSkL);
		t1AvgAmpNBP.setCenter(t1AvgAmpNL);
		t1TimesScoBP.setCenter(t1TimesScoL);
		t1TimesAmpBP.setCenter(t1TimesAmpL);
		t2CyBP.setCenter(t2AvgCyTitleL);
		t2SpeBP.setCenter(t2AvgSpeTitleL);
		t2AmpBP.setCenter(t2AvgAmpTitleL);
		t2TrapBP.setCenter(t2AvgTrapTitleL);
		t2CliBP.setCenter(t2AvgCliTitleL);
		t2AvgScoSkBP.setCenter(t2AvgScoSkL);
		t2AvgAmpSkBP.setCenter(t2AvgAmpSkL);
		t2AvgAmpNBP.setCenter(t2AvgAmpNL);
		t2TimesScoBP.setCenter(t2TimesScoL);
		t2TimesAmpBP.setCenter(t2TimesAmpL);
		t1CyBP.setId("comTeamsStatBP1");
		t1SpeBP.setId("comTeamsStatBP2");
		t1AmpBP.setId("comTeamsStatBP3");
		t1TrapBP.setId("comTeamsStatBP4");
		t1CliBP.setId("comTeamsStatBP5");
		t1AvgScoSkBP.setId("comTeamsStatBP6");
		t1AvgAmpSkBP.setId("comTeamsStatBP7");
		t1AvgAmpNBP.setId("comTeamsStatBP8");
		t1TimesScoBP.setId("comTeamsStatBP9");
		t1TimesAmpBP.setId("comTeamsStatBP8");
		t2CyBP.setId("comTeamsStatBP1");
		t2SpeBP.setId("comTeamsStatBP2");
		t2AmpBP.setId("comTeamsStatBP3");
		t2TrapBP.setId("comTeamsStatBP4");
		t2CliBP.setId("comTeamsStatBP5");
		t2AvgScoSkBP.setId("comTeamsStatBP6");
		t2AvgAmpSkBP.setId("comTeamsStatBP7");
		t2AvgAmpNBP.setId("comTeamsStatBP8");
		t2TimesScoBP.setId("comTeamsStatBP9");
		t2TimesAmpBP.setId("comTeamsStatBP8");
		Label t1TeamNumL = new Label(Integer.toString(T1.getTeamNum()) + "'s Stats");
		Label t2TeamNumL = new Label(Integer.toString(T2.getTeamNum()) + "'s Stats");
		t1TeamNumL.setId("TitleLabelPlay");
		t2TeamNumL.setId("TitleLabelPlay");
		BorderPane t1TeamNumBP = new BorderPane();
		BorderPane t2TeamNumBP = new BorderPane();
		t1TeamNumBP.setCenter(t1TeamNumL);
		t2TeamNumBP.setCenter(t2TeamNumL);
		VBox t1VB = new VBox(5);
		VBox t2VB = new VBox(5);
		t1VB.getChildren().addAll(t1TeamNumBP, t1CyBP, t1SpeBP, t1AmpBP, t1TrapBP, t1CliBP, t1AvgScoSkBP, t1AvgAmpSkBP, t1AvgAmpNBP, t1TimesScoBP, t1TimesAmpBP);
		t2VB.getChildren().addAll(t2TeamNumBP, t2CyBP, t2SpeBP, t2AmpBP, t2TrapBP, t2CliBP, t2AvgScoSkBP, t2AvgAmpSkBP, t2AvgAmpNBP, t2TimesScoBP, t2TimesAmpBP);
		this.add(new Label("    "), 0, 0);
		this.add(new Label("    "), 2, 0);
		this.add(new Label("    "), 4, 0);
		this.add(new Label("    "), 6, 0);
		this.add(new Label("    "), 8, 0);
		this.add(new Label("    "), 10, 0);
		this.add(new Label("    "), 0, 2);
		this.add(t1VB, 1, 1);
		this.add(t2VB, 3, 1);
		twoTeamsPieChart(T1, T2);
	}
	
	public void threeTeamsPieChart(Team T1, Team T2, Team T3) {
		double t1Cy = T1.getAvgSpe() + T1.getAvgAmp() + T1.getAvgTrap();
		double t1Spe = T1.getAvgSpe();
		double t1Amp = T1.getAvgAmp();
		double t1Trap = T1.getAvgTrap();
		double t1Cli = T1.getAvgClimb();
		double t1HighN = T1.getHumAmpNotes();
		int t1TSco = T1.getTimesHumSco();
		int t1TAmp = T1.getTimesHumAmp();
		double t2Cy = T2.getAvgSpe() + T2.getAvgAmp() + T2.getAvgTrap();
		double t2Spe = T2.getAvgSpe();
		double t2Amp = T2.getAvgAmp();
		double t2Trap = T2.getAvgTrap();
		double t2Cli = T2.getAvgClimb();
		double t2HighN = T2.getHumAmpNotes();
		double t2TSco = T2.getTimesHumSco();
		double t2TAmp = T2.getTimesHumAmp();
		double t3Cy = T3.getAvgSpe() + T3.getAvgAmp() + T3.getAvgTrap();
		double t3Spe = T3.getAvgSpe();
		double t3Amp = T3.getAvgAmp();
		double t3Trap = T3.getAvgTrap();
		double t3Cli = T3.getAvgClimb();
		double t3HighN = T1.getHumAmpNotes();
		double t3TSco = T3.getTimesHumSco();
		double t3TAmp = T3.getTimesHumAmp();
		//Cycles between all teams
		double totalCy = t1Cy + t2Cy + t3Cy;
		int t1CyPer = (int) ((t1Cy/totalCy) * 100);
		int t2CyPer = (int) ((t2Cy/totalCy) * 100);
		int t3CyPer = (int) ((t3Cy/totalCy) * 100);
		int whoToAdd = 1;
		while(t1CyPer + t2CyPer + t3CyPer != 100) {
			if(whoToAdd == 1) {
				t1CyPer++;
				whoToAdd++;
			}else if(whoToAdd == 2) {
				t2CyPer++;
				whoToAdd++;
			}else if(whoToAdd == 3){
				t3CyPer++;
				whoToAdd = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(new PieChart.Data("Team 1", t1CyPer), new PieChart.Data("Team 2", t2CyPer), new PieChart.Data("Team 3", t3CyPer));
		PieChart teamCyclePieC = new PieChart(pieChartData);
		teamCyclePieC.autosize();
		teamCyclePieC.setMaxSize(300, 300);
		teamCyclePieC.setMinSize(300, 300);
		teamCyclePieC.setLabelsVisible(true);
		//Amp between all teams
		double totalAmp = t1Amp + t2Amp + t3Amp;
		int t1AmpPer = (int) ((t1Amp/totalAmp) * 100);
		int t2AmpPer = (int) ((t2Amp/totalAmp) * 100);
		int t3AmpPer = (int) ((t3Amp/totalAmp) * 100);
		int whoToAdd2 = 1;
		while(t1AmpPer + t2AmpPer + t3AmpPer != 100) {
			if(whoToAdd2 == 1) {
				t1AmpPer++;
				whoToAdd2++;
			}else if(whoToAdd2 == 2) {
				t2AmpPer++;
				whoToAdd2++;
			}else if(whoToAdd2 == 3){
				t3AmpPer++;
				whoToAdd2 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData2 = FXCollections.observableArrayList(new PieChart.Data("Team 1", t1AmpPer), new PieChart.Data("Team 2", t2AmpPer), new PieChart.Data("Team 3", t3AmpPer));
		PieChart teamAmpPieC = new PieChart(pieChartData2);
		teamAmpPieC.autosize();
		teamAmpPieC.setMaxSize(300, 300);
		teamAmpPieC.setMinSize(300, 300);
		teamAmpPieC.setLabelsVisible(true);
		//Speaker between all teams
		double totalSpe = t1Spe + t2Spe + t3Spe;
		int t1SpePer = (int) ((t1Spe/totalSpe) * 100);
		int t2SpePer = (int) ((t2Spe/totalSpe) * 100);
		int t3SpePer = (int) ((t3Spe/totalSpe) * 100);
		int whoToAdd3 = 1;
		while(t1SpePer + t2SpePer + t3SpePer != 100) {
			if(whoToAdd3 == 1) {
				t1SpePer++;
				whoToAdd3++;
			}else if(whoToAdd3 == 2) {
				t2SpePer++;
				whoToAdd3++;
			}else if(whoToAdd3 == 3){
				t3SpePer++;
				whoToAdd3 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData3 = FXCollections.observableArrayList(new PieChart.Data("Team 1", t1SpePer), new PieChart.Data("Team 2", t2SpePer), new PieChart.Data("Team 3", t3SpePer));
		PieChart teamSpePieC = new PieChart(pieChartData3);
		teamSpePieC.autosize();
		teamSpePieC.setMaxSize(300, 300);
		teamSpePieC.setMinSize(300, 300);
		teamSpePieC.setLabelsVisible(true);
		//Trap between all teams
		double totalTrap = t1Trap + t2Trap + t3Trap;
		int t1TrapPer = (int) ((t1Trap/totalTrap) * 100);
		int t2TrapPer = (int) ((t2Trap/totalTrap) * 100);
		int t3TrapPer = (int) ((t3Trap/totalTrap) * 100);
		int whoToAdd4 = 1;
		while(t1TrapPer + t2TrapPer + t3TrapPer != 100) {
			if(whoToAdd4 == 1) {
				t1TrapPer++;
				whoToAdd4++;
			}else if(whoToAdd4 == 2) {
				t2TrapPer++;
				whoToAdd4++;
			}else if(whoToAdd4 == 3){
				t3TrapPer++;
				whoToAdd4 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData4 = FXCollections.observableArrayList(new PieChart.Data("Team 1", t1TrapPer), new PieChart.Data("Team 2", t2TrapPer), new PieChart.Data("Team 3", t3TrapPer));
		PieChart teamTrapPieC = new PieChart(pieChartData4);
		teamTrapPieC.autosize();
		teamTrapPieC.setMaxSize(300, 300);
		teamTrapPieC.setMinSize(300, 300);
		teamTrapPieC.setLabelsVisible(true);
		//Climb between all teams
		double totalCli = t1Cli + t2Cli + t3Cli;
		int t1CliPer = (int) ((t1Cli/totalCli) * 100);
		int t2CliPer = (int) ((t2Cli/totalCli) * 100);
		int t3CliPer = (int) ((t3Cli/totalCli) * 100);
		int whoToAdd5 = 1;
		while(t1CliPer + t2CliPer + t3CliPer != 100) {
			if(whoToAdd5 == 1) {
				t1CliPer++;
				whoToAdd5++;
			}else if(whoToAdd5 == 2) {
				t2CliPer++;
				whoToAdd5++;
			}else if(whoToAdd5 == 3){
				t3CliPer++;
				whoToAdd5 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData5 = FXCollections.observableArrayList(new PieChart.Data("Team 1", t1CliPer), new PieChart.Data("Team 2", t2CliPer), new PieChart.Data("Team 3", t3CliPer));
		PieChart teamCliPieC = new PieChart(pieChartData5);
		teamCliPieC.autosize();
		teamCliPieC.setMaxSize(300, 300);
		teamCliPieC.setMinSize(300, 300);
		teamCliPieC.setLabelsVisible(true);
		//High Notes between all teams
		double totalHighN = t1HighN + t2HighN + t3HighN;
		int t1HighNPer = (int) ((t1HighN/totalHighN) * 100);
		int t2HighNPer = (int) ((t2HighN/totalHighN) * 100);
		int t3HighNPer = (int) ((t3HighN/totalHighN) * 100);
		int whoToAdd6 = 1;
		while(t1HighNPer + t2HighNPer + t3HighNPer != 100) {
			if(whoToAdd6 == 1) {
				t1HighNPer++;
				whoToAdd6++;
			}else if(whoToAdd6 == 2) {
				t2HighNPer++;
				whoToAdd6++;
			}else if(whoToAdd6 == 3){
				t3HighNPer++;
				whoToAdd6 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData6 = FXCollections.observableArrayList(new PieChart.Data("Team 1", t1HighNPer), new PieChart.Data("Team 2", t2HighNPer), new PieChart.Data("Team 3", t3HighNPer));
		PieChart teamHighNPieC = new PieChart(pieChartData6);
		teamHighNPieC.autosize();
		teamHighNPieC.setMaxSize(300, 300);
		teamHighNPieC.setMinSize(300, 300);
		teamHighNPieC.setLabelsVisible(true);
		//Team 1 Cycle Composition
		double totalCyT1 = t1Spe + t1Amp + t1Trap;
		int t1SpeComPer = (int) ((t1Spe/totalCyT1) * 100);
		int t1AmpComPer = (int) ((t1Amp/totalCyT1) * 100);
		int t1TrapComPer = (int) ((t1Trap/totalCyT1) * 100);
		int whoToAdd7 = 1;
		while(t1SpeComPer + t1AmpComPer + t1TrapComPer != 100) {
			if(whoToAdd7 == 1) {
				t1SpeComPer++;
				whoToAdd7++;
			}else if(whoToAdd7 == 2) {
				t1AmpComPer++;
				whoToAdd7++;
			}else if(whoToAdd7 == 3){
				t1TrapComPer++;
				whoToAdd7 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData7 = FXCollections.observableArrayList(new PieChart.Data("Speaker", t1SpeComPer), new PieChart.Data("Amp", t1TrapComPer), new PieChart.Data("Trap", t1TrapComPer));
		team1CyPieC = new PieChart(pieChartData7);
		team1CyPieC.autosize();
		team1CyPieC.setMaxSize(300, 300);
		team1CyPieC.setMinSize(300, 300);
		team1CyPieC.setLabelsVisible(true);
		//Team 1 Human Player Position
		double totalMatchesT1 = T1.getTotalMatchesPlayed();
		int t1TimesScoPer = (int) ((t1TSco/totalMatchesT1) * 100);
		int t1TimesAmpPer = (int) ((t1TAmp/totalMatchesT1) * 100);
		int t1TimesNonePer = (int) (((totalMatchesT1 - t1TSco - t1TAmp)/totalMatchesT1) * 100);
		int whoToAdd8 = 1;
		while(t1SpeComPer + t1AmpComPer + t1TrapComPer != 100) {
			if(whoToAdd8 == 1) {
				t1TimesScoPer++;
				whoToAdd8++;
			}else if(whoToAdd8 == 2) {
				t1TimesAmpPer++;
				whoToAdd8++;
			}else if(whoToAdd8 == 3){
				t1TimesNonePer++;
				whoToAdd8 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData8 = FXCollections.observableArrayList(new PieChart.Data("Scoure", t1TimesScoPer), new PieChart.Data("Amp", t1TimesAmpPer), new PieChart.Data("None", t1TimesNonePer));
		team1HumPlayPieC = new PieChart(pieChartData8);
		team1HumPlayPieC.autosize();
		team1HumPlayPieC.setMaxSize(300, 300);
		team1HumPlayPieC.setMinSize(300, 300);
		team1HumPlayPieC.setLabelsVisible(true);
		//Team 2 Cycle Composition
		double totalCyT2 = t2Spe + t2Amp + t2Trap;
		int t2SpeComPer = (int) ((t2Spe/totalCyT2) * 100);
		int t2AmpComPer = (int) ((t2Amp/totalCyT2) * 100);
		int t2TrapComPer = (int) ((t2Trap/totalCyT2) * 100);
		int whoToAdd9 = 1;
		while(t2SpeComPer + t2AmpComPer + t2TrapComPer != 100) {
			if(whoToAdd9 == 1) {
				t2SpeComPer++;
				whoToAdd9++;
			}else if(whoToAdd9 == 2) {
				t2AmpComPer++;
				whoToAdd9++;
			}else if(whoToAdd9 == 3){
				t2TrapComPer++;
				whoToAdd9 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData9 = FXCollections.observableArrayList(new PieChart.Data("Speaker", t2SpeComPer), new PieChart.Data("Amp", t2TrapComPer), new PieChart.Data("Trap", t2TrapComPer));
		team2CyPieC = new PieChart(pieChartData9);
		team2CyPieC.autosize();
		team2CyPieC.setMaxSize(300, 300);
		team2CyPieC.setMinSize(300, 300);
		team2CyPieC.setLabelsVisible(true);
		//Team 2 Human Player Position
		double totalMatchesT2 = T2.getTotalMatchesPlayed();
		int t2TimesScoPer = (int) ((t2TSco/totalMatchesT2) * 100);
		int t2TimesAmpPer = (int) ((t2TAmp/totalMatchesT2) * 100);
		int t2TimesNonePer = (int) (((totalMatchesT2 - t2TSco - t2TAmp)/totalMatchesT2) * 100);
		int whoToAdd10 = 1;
		while(t2SpeComPer + t2AmpComPer + t2TrapComPer != 100) {
			if(whoToAdd10 == 1) {
				t2TimesScoPer++;
				whoToAdd10++;
			}else if(whoToAdd10 == 2) {
				t2TimesAmpPer++;
				whoToAdd10++;
			}else if(whoToAdd10 == 3){
				t2TimesNonePer++;
				whoToAdd10 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData10 = FXCollections.observableArrayList(new PieChart.Data("Scoure", t2TimesScoPer), new PieChart.Data("Amp", t2TimesAmpPer), new PieChart.Data("None", t2TimesNonePer));
		team2HumPlayPieC = new PieChart(pieChartData10);
		team2HumPlayPieC.autosize();
		team2HumPlayPieC.setMaxSize(300, 300);
		team2HumPlayPieC.setMinSize(300, 300);
		team2HumPlayPieC.setLabelsVisible(true);
		//Team 3 Cycle Composition
		double totalCyT3 = t3Spe + t3Amp + t3Trap;
		int t3SpeComPer = (int) ((t3Spe/totalCyT3) * 100);
		int t3AmpComPer = (int) ((t3Amp/totalCyT3) * 100);
		int t3TrapComPer = (int) ((t3Trap/totalCyT3) * 100);
		int whoToAdd11 = 1;
		while(t3SpeComPer + t3AmpComPer + t3TrapComPer != 100) {
			if(whoToAdd11 == 1) {
				t3SpeComPer++;
				whoToAdd11++;
			}else if(whoToAdd11 == 2) {
				t3AmpComPer++;
				whoToAdd11++;
			}else if(whoToAdd11 == 3){
				t3TrapComPer++;
				whoToAdd11 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData11 = FXCollections.observableArrayList(new PieChart.Data("Speaker", t3SpeComPer), new PieChart.Data("Amp", t3TrapComPer), new PieChart.Data("Trap", t3TrapComPer));
		team3CyPieC = new PieChart(pieChartData11);
		team3CyPieC.autosize();
		team3CyPieC.setMaxSize(300, 300);
		team3CyPieC.setMinSize(300, 300);
		team3CyPieC.setLabelsVisible(true);
		//Team 3 Human Player Position
		double totalMatchesT3 = T3.getTotalMatchesPlayed();
		int t3TimesScoPer = (int) ((t3TSco/totalMatchesT3) * 100);
		int t3TimesAmpPer = (int) ((t3TAmp/totalMatchesT3) * 100);
		int t3TimesNonePer = (int) (((totalMatchesT3 - t3TSco - t3TAmp)/totalMatchesT3) * 100);
		int whoToAdd12 = 1;
		while(t3SpeComPer + t3AmpComPer + t3TrapComPer != 100) {
			if(whoToAdd12 == 1) {
				t3TimesScoPer++;
				whoToAdd12++;
			}else if(whoToAdd12 == 2) {
				t3TimesAmpPer++;
				whoToAdd12++;
			}else if(whoToAdd12 == 3){
				t3TimesNonePer++;
				whoToAdd12 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData12 = FXCollections.observableArrayList(new PieChart.Data("Scoure", t3TimesScoPer), new PieChart.Data("Amp", t3TimesAmpPer), new PieChart.Data("None", t3TimesNonePer));
		team3HumPlayPieC = new PieChart(pieChartData12);
		team3HumPlayPieC.autosize();
		team3HumPlayPieC.setMaxSize(350, 350);
		team3HumPlayPieC.setMinSize(350, 350);
		team3HumPlayPieC.setLabelsVisible(true);
		HBox pieChartHB = new HBox(0);
		Label comCyPCL = new Label("Cycles");
		Label comSpePCL = new Label("Speaker");
		Label comAmpPCL = new Label("Amp");
		Label comTrapPCL = new Label("Trap");
		Label comCliPCL = new Label("Climb");
		comCyPCL.setId("bigLightLabel");
		comSpePCL.setId("bigLightLabel");
		comAmpPCL.setId("bigLightLabel");
		comTrapPCL.setId("bigLightLabel");
		comCliPCL.setId("bigLightLabel");
		VBox cyPCVB = new VBox(5);
		VBox spePCVB = new VBox(5);
		VBox ampPCVB = new VBox(5);
		VBox trapPCVB = new VBox(5);
		VBox cliPCVB = new VBox(5);
		cyPCVB.getChildren().addAll(comCyPCL, teamCyclePieC);
		spePCVB.getChildren().addAll(comSpePCL, teamSpePieC);
		ampPCVB.getChildren().addAll(comAmpPCL, teamAmpPieC);
		trapPCVB.getChildren().addAll(comTrapPCL, teamTrapPieC);
		cliPCVB.getChildren().addAll(comCliPCL, teamHighNPieC);
		pieChartHB.getChildren().addAll(cyPCVB, spePCVB, ampPCVB, trapPCVB, cliPCVB);
		this.add(pieChartHB, 1, 3);
		team1PCVB = new VBox(5);
		team2PCVB = new VBox(5);
		team3PCVB = new VBox(5);
		team1PCVB.getChildren().addAll(team1CyPieC, team1HumPlayPieC);
		team2PCVB.getChildren().addAll(team2CyPieC, team2HumPlayPieC);
		team3PCVB.getChildren().addAll(team3CyPieC, team3HumPlayPieC);
		
	}
	
	public void twoTeamsPieChart(Team T1, Team T2) {
		double t1Cy = T1.getAvgSpe() + T1.getAvgAmp() + T1.getAvgTrap();
		double t1Spe = T1.getAvgSpe();
		double t1Amp = T1.getAvgAmp();
		double t1Trap = T1.getAvgTrap();
		double t1Cli = T1.getAvgClimb();
		double t1HighN = T1.getHumAmpNotes();
		int t1TSco = T1.getTimesHumSco();
		int t1TAmp = T1.getTimesHumAmp();
		double t2Cy = T2.getAvgAmp() + T2.getAvgTrap();
		double t2Spe = T2.getAvgSpe();
		double t2Amp = T2.getAvgAmp();
		double t2Trap = T2.getAvgTrap();
		double t2Cli = T2.getAvgClimb();
		double t2HighN = T2.getHumAmpNotes();
		double t2TSco = T2.getTimesHumSco();
		double t2TAmp = T2.getTimesHumAmp();
		
		//Cycles between all teams
		double totalCy = t1Cy + t2Cy;
		int t1CyPer = (int) ((t1Cy/totalCy) * 100);
		int t2CyPer = (int) ((t2Cy/totalCy) * 100);
		int whoToAdd = 1;
		while(t1CyPer + t2CyPer != 100) {
			if(whoToAdd == 1) {
				t1CyPer++;
				whoToAdd++;
			}else if(whoToAdd == 2) {
				t2CyPer++;
				whoToAdd = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(new PieChart.Data("Team 1", t1CyPer), new PieChart.Data("Team 2", t2CyPer));
		PieChart teamCyclePieC = new PieChart(pieChartData);
		teamCyclePieC.autosize();
		teamCyclePieC.setMaxSize(350, 350);
		teamCyclePieC.setLabelsVisible(true);
		//Amp between all teams
		double totalAmp = t1Amp + t2Amp;
		int t1AmpPer = (int) ((t1Amp/totalAmp) * 100);
		int t2AmpPer = (int) ((t2Amp/totalAmp) * 100);
		int whoToAdd2 = 1;
		while(t1AmpPer + t2AmpPer != 100) {
			if(whoToAdd2 == 1) {
				t1AmpPer++;
				whoToAdd2++;
			}else if(whoToAdd2 == 2) {
				t2AmpPer++;
				whoToAdd2 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData2 = FXCollections.observableArrayList(new PieChart.Data("Team 1", t1AmpPer), new PieChart.Data("Team 2", t2AmpPer));
		PieChart teamAmpPieC = new PieChart(pieChartData2);
		teamAmpPieC.autosize();
		teamAmpPieC.setMaxSize(350, 350);
		teamAmpPieC.setLabelsVisible(true);
		//Speaker between all teams
		double totalSpe = t1Spe + t2Spe;
		int t1SpePer = (int) ((t1Spe/totalSpe) * 100);
		int t2SpePer = (int) ((t2Spe/totalSpe) * 100);
		int whoToAdd3 = 1;
		while(t1SpePer + t2SpePer != 100) {
			if(whoToAdd3 == 1) {
				t1SpePer++;
				whoToAdd3++;
			}else if(whoToAdd3 == 2) {
				t2SpePer++;
				whoToAdd3++;
			}
		}
		ObservableList<PieChart.Data> pieChartData3 = FXCollections.observableArrayList(new PieChart.Data("Team 1", t1SpePer), new PieChart.Data("Team 2", t2SpePer));
		PieChart teamSpePieC = new PieChart(pieChartData3);
		teamSpePieC.autosize();
		teamSpePieC.setMaxSize(350, 350);
		teamSpePieC.setLabelsVisible(true);
		//Trap between all teams
		double totalTrap = t1Trap + t2Trap;
		int t1TrapPer = (int) ((t1Trap/totalTrap) * 100);
		int t2TrapPer = (int) ((t2Trap/totalTrap) * 100);
		int whoToAdd4 = 1;
		while(t1TrapPer + t2TrapPer != 100) {
			if(whoToAdd4 == 1) {
				t1TrapPer++;
				whoToAdd4++;
			}else if(whoToAdd4 == 2) {
				t2TrapPer++;
				whoToAdd4++;
			}
		}
		ObservableList<PieChart.Data> pieChartData4 = FXCollections.observableArrayList(new PieChart.Data("Team 1", t1TrapPer), new PieChart.Data("Team 2", t2TrapPer));
		PieChart teamTrapPieC = new PieChart(pieChartData4);
		teamTrapPieC.autosize();
		teamTrapPieC.setMaxSize(350, 350);
		teamTrapPieC.setLabelsVisible(true);
		//Climb between all teams
		double totalCli = t1Cli + t2Cli;
		int t1CliPer = (int) ((t1Cli/totalCli) * 100);
		int t2CliPer = (int) ((t2Cli/totalCli) * 100);
		int whoToAdd5 = 1;
		while(t1CliPer + t2CliPer != 100) {
			if(whoToAdd5 == 1) {
				t1CliPer++;
				whoToAdd5++;
			}else if(whoToAdd5 == 2) {
				t2CliPer++;
				whoToAdd5++;
			}
		}
		ObservableList<PieChart.Data> pieChartData5 = FXCollections.observableArrayList(new PieChart.Data("Team 1", t1CliPer), new PieChart.Data("Team 2", t2CliPer));
		PieChart teamCliPieC = new PieChart(pieChartData5);
		teamCliPieC.autosize();
		teamCliPieC.setMaxSize(350, 350);
		teamCliPieC.setLabelsVisible(true);
		//High Notes between all teams
		double totalHighN = t1HighN + t2HighN;
		int t1HighNPer = (int) ((t1HighN/totalHighN) * 100);
		int t2HighNPer = (int) ((t2HighN/totalHighN) * 100);
		int whoToAdd6 = 1;
		while(t1HighNPer + t2HighNPer != 100) {
			if(whoToAdd6 == 1) {
				t1HighNPer++;
				whoToAdd6++;
			}else if(whoToAdd6 == 2) {
				t2HighNPer++;
				whoToAdd6++;
			}
		}
		ObservableList<PieChart.Data> pieChartData6 = FXCollections.observableArrayList(new PieChart.Data("Team 1", t1HighNPer), new PieChart.Data("Team 2", t2HighNPer));
		PieChart teamHighNPieC = new PieChart(pieChartData6);
		teamHighNPieC.autosize();
		teamHighNPieC.setMaxSize(350, 350);
		teamHighNPieC.setLabelsVisible(true);
		//Team 1 Cycle Composition
		double totalCyT1 = t1Spe + t1Amp + t1Trap;
		int t1SpeComPer = (int) ((t1Spe/totalCyT1) * 100);
		int t1AmpComPer = (int) ((t1Amp/totalCyT1) * 100);
		int t1TrapComPer = (int) ((t1Trap/totalCyT1) * 100);
		int whoToAdd7 = 1;
		while(t1SpeComPer + t1AmpComPer + t1TrapComPer != 100) {
			if(whoToAdd7 == 1) {
				t1SpeComPer++;
				whoToAdd7++;
			}else if(whoToAdd7 == 2) {
				t1AmpComPer++;
				whoToAdd7++;
			}else if(whoToAdd7 == 3){
				t1TrapComPer++;
				whoToAdd7 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData7 = FXCollections.observableArrayList(new PieChart.Data("Speaker", t1SpeComPer), new PieChart.Data("Amp", t1TrapComPer), new PieChart.Data("Trap", t1TrapComPer));
		PieChart team1CyPieC = new PieChart(pieChartData7);
		team1CyPieC.autosize();
		team1CyPieC.setMaxSize(350, 350);
		team1CyPieC.setLabelsVisible(true);
		//Team 1 Human Player Position
		double totalMatchesT1 = T1.getTotalMatchesPlayed();
		int t1TimesScoPer = (int) ((t1TSco/totalMatchesT1) * 100);
		int t1TimesAmpPer = (int) ((t1TAmp/totalMatchesT1) * 100);
		int t1TimesNonePer = (int) (((totalMatchesT1 - t1TSco - t1TAmp)/totalMatchesT1) * 100);
		int whoToAdd8 = 1;
		while(t1SpeComPer + t1AmpComPer + t1TrapComPer != 100) {
			if(whoToAdd8 == 1) {
				t1TimesScoPer++;
				whoToAdd8++;
			}else if(whoToAdd8 == 2) {
				t1TimesAmpPer++;
				whoToAdd8++;
			}else if(whoToAdd8 == 3){
				t1TimesNonePer++;
				whoToAdd8 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData8 = FXCollections.observableArrayList(new PieChart.Data("Scoure", t1TimesScoPer), new PieChart.Data("Amp", t1TimesAmpPer), new PieChart.Data("None", t1TimesNonePer));
		PieChart team1HumPlayPieC = new PieChart(pieChartData8);
		team1HumPlayPieC.autosize();
		team1HumPlayPieC.setMaxSize(350, 350);
		team1HumPlayPieC.setLabelsVisible(true);
		//Team 2 Cycle Composition
		double totalCyT2 = t2Spe + t2Amp + t2Trap;
		int t2SpeComPer = (int) ((t2Spe/totalCyT2) * 100);
		int t2AmpComPer = (int) ((t2Amp/totalCyT2) * 100);
		int t2TrapComPer = (int) ((t2Trap/totalCyT2) * 100);
		int whoToAdd9 = 1;
		while(t2SpeComPer + t2AmpComPer + t2TrapComPer != 100) {
			if(whoToAdd9 == 1) {
				t2SpeComPer++;
				whoToAdd9++;
			}else if(whoToAdd9 == 2) {
				t2AmpComPer++;
				whoToAdd9++;
			}else if(whoToAdd9 == 3){
				t2TrapComPer++;
				whoToAdd9 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData9 = FXCollections.observableArrayList(new PieChart.Data("Speaker", t2SpeComPer), new PieChart.Data("Amp", t2TrapComPer), new PieChart.Data("Trap", t2TrapComPer));
		PieChart team2CyPieC = new PieChart(pieChartData9);
		team2CyPieC.autosize();
		team2CyPieC.setMaxSize(350, 350);
		team2CyPieC.setLabelsVisible(true);
		//Team 2 Human Player Position
		double totalMatchesT2 = T2.getTotalMatchesPlayed();
		int t2TimesScoPer = (int) ((t2TSco/totalMatchesT2) * 100);
		int t2TimesAmpPer = (int) ((t2TAmp/totalMatchesT2) * 100);
		int t2TimesNonePer = (int) (((totalMatchesT2 - t2TSco - t2TAmp)/totalMatchesT2) * 100);
		int whoToAdd10 = 1;
		while(t2SpeComPer + t2AmpComPer + t2TrapComPer != 100) {
			if(whoToAdd10 == 1) {
				t2TimesScoPer++;
				whoToAdd10++;
			}else if(whoToAdd10 == 2) {
				t2TimesAmpPer++;
				whoToAdd10++;
			}else if(whoToAdd10 == 3){
				t2TimesNonePer++;
				whoToAdd10 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData10 = FXCollections.observableArrayList(new PieChart.Data("Scoure", t2TimesScoPer), new PieChart.Data("Amp", t2TimesAmpPer), new PieChart.Data("None", t2TimesNonePer));
		PieChart team2HumPlayPieC = new PieChart(pieChartData10);
		team2HumPlayPieC.autosize();
		team2HumPlayPieC.setMaxSize(350, 350);
		team2HumPlayPieC.setLabelsVisible(true);
		
		
		this.add(teamCyclePieC, 1, 3);
		this.add(teamSpePieC, 3, 3);
		this.add(teamAmpPieC, 5, 3);
		this.add(teamTrapPieC, 7, 3);
		this.add(teamCliPieC, 7, 3);
		this.add(teamHighNPieC, 11, 3);
		VBox team1PCVB = new VBox(5);
		VBox team2PCVB = new VBox(5);
		team1PCVB.getChildren().addAll(team1CyPieC, team1HumPlayPieC);
		team2PCVB.getChildren().addAll(team2CyPieC, team2HumPlayPieC);
		this.add(team1PCVB, 3, 1);
		this.add(team2PCVB, 7, 1);
	}
	
	@Override
	public void handle(ActionEvent event) {
		System.out.println("BoopComTeams0");
		try {
			if (event.getSource() == submitB) {
				this.getChildren().clear();
				System.out.println("BoopComTeams1");
				String selTeamNum1S = team1CB.getSelectionModel().getSelectedItem();
				String selTeamNum2S = team2CB.getSelectionModel().getSelectedItem();
				String selTeamNum3S = team3CB.getSelectionModel().getSelectedItem();
				int selTeamNum1;
				int selTeamNum2;
				int selTeamNum3;
				Team T1 = null;
				Team T2 = null;
				Team T3 = null;
				int numOfSelected = 0;
				if(selTeamNum1S != null) {
					selTeamNum1 = Integer.parseInt(selTeamNum1S);
					T1 = theTL.getATeam(selTeamNum1);
					numOfSelected++;
				}
				if(selTeamNum2S != null) {
					selTeamNum2 = Integer.parseInt(selTeamNum2S);
					T2 = theTL.getATeam(selTeamNum2);
					numOfSelected++;
				}
				if(selTeamNum3S != null) {
					selTeamNum3 = Integer.parseInt(selTeamNum3S);
					T3 = theTL.getATeam(selTeamNum3);
					numOfSelected++;
				}
				double t1AvgCy = T1.getAvgCycles();
				double t2AvgCy = T1.getAvgCycles();
				double t3AvgCy = T1.getAvgCycles();
				System.out.println("BoopComTeams1.1" + t1AvgCy + t2AvgCy + t3AvgCy);
				HBox topHB = new HBox(0);
				System.out.println("BoopComTeams2");
				if(numOfSelected == 2) {
					System.out.println("BoopComTeams3");
					twoTeamCompare(T1, T2); 
				}else if(numOfSelected == 3) {
					System.out.println("BoopComTeams4");
					threeTeamCompare(T1, T2, T3);
					topHB.getChildren().addAll(t1VB, team1PCVB, t2VB, team2PCVB, t3VB, team3PCVB);
					this.add(topHB, 1, 1);
				}
				System.out.println("BoopComTeams5");
				
			}
		} catch (Exception e) {
			Alert addcomA = new Alert(Alert.AlertType.INFORMATION);
			addcomA.setTitle("Error");
			addcomA.setContentText("Error with inputed values: " + e);
			addcomA.showAndWait();
		}
		
	}
}



