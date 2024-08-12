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
	private ComboBox<String> allPlayCB;
	private Button seNonAllincesB;
	private Button seAllincesB;
	private List<Integer> listOfTeamNums;
	private TeamList theTeamList;
	private PlayoffAlliances thePlayoffAlls;
	
	public searchAllincesTab(boolean isPlayoffTime, List<Integer> importedListOfTeamNums, TeamList imTeamList, PlayoffAlliances imPlayoffAlls) {
		theTeamList = imTeamList;
		if(isPlayoffTime == false) {
			listOfTeamNums = importedListOfTeamNums;
			Label team1SelectL = new Label("Select First Team");
			Label team2SelectL = new Label("Select Second Team");
			Label team3SelectL = new Label("Select Third Team");
			team1SelectL.setId("smallTitle");
			team2SelectL.setId("smallTitle");
			team3SelectL.setId("smallTitle");
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
			thePlayoffAlls = imPlayoffAlls;
			int numOfAlls = 1;
			if(thePlayoffAlls.getAlliance1() != null) {
				System.out.println("BoopSeAll0");
				numOfAlls++;
			}
			if(thePlayoffAlls.getAlliance2() != null) {
				System.out.println("BoopSeAll1");
				numOfAlls++;
			}
			if(thePlayoffAlls.getAlliance3() != null) {
				System.out.println("BoopSeAll2");
				numOfAlls++;
			}
			if(thePlayoffAlls.getAlliance4() != null) {
				numOfAlls++;
			}
			if(thePlayoffAlls.getAlliance5() != null) {
				numOfAlls++;
			}
			if(thePlayoffAlls.getAlliance6() != null) {
				numOfAlls++;
			}
			if(thePlayoffAlls.getAlliance7() != null) {
				numOfAlls++;
			}
			if(thePlayoffAlls.getAlliance8() != null) {
				numOfAlls++;
			}
			System.out.println("BoopSeAll numOfAlls:" + numOfAlls);
			allPlayCB = new ComboBox<String>();
			for(int i = 0; i < numOfAlls; i++) {
				allPlayCB.getItems().add(Integer.toString(i + 1));
			}
			Label allSelectL = new Label("Select the Allince");
			allSelectL.setId("smallTitle");
			BorderPane allBP = new BorderPane();
			allBP.setTop(allSelectL);
			allBP.setCenter(allPlayCB);
			allBP.setId("seAllSelectall");
			seAllincesB = new Button("Submit");
			seAllincesB.setOnAction(this);
			this.add(new Label("    "), 0, 0);
			this.add(allBP, 1, 1);
			this.add(seAllincesB, 7, 1);
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
		t2CyBP.setId("seAllNonBP1");
		t2SpeBP.setId("seAllNonBP2");
		t2AmpBP.setId("seAllNonBP3");
		t2TrapBP.setId("seAllNonBP4");
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
		this.add(new Label("    "), 6, 0);
		this.add(new Label("    "), 8, 0);
		this.add(t1VB, 3, 1);
		this.add(t2VB, 5, 1);
		this.add(t3VB, 7, 1);
		double a1AvgCy = t1AvgCy + t2AvgCy + t3AvgCy;
		double a1AvgSpe = t1AvgSpe + t2AvgSpe + t3AvgSpe;
		double a1AvgAmp = t1AvgCy + t2AvgCy + t3AvgAmp;
		double a1AvgTrap = t1AvgCy + t2AvgTrap + t3AvgTrap;
		double a1AvgCli = t1AvgCy + t2AvgCy + t3AvgCy;
		Label a1AvgCyL = new Label(Double.toString(a1AvgCy));
		Label a1AvgSpeL = new Label(Double.toString(a1AvgSpe));
		Label a1AvgAmpL = new Label(Double.toString(a1AvgAmp));
		Label a1AvgTrapL = new Label(Double.toString(a1AvgTrap));
		Label a1AvgCliL = new Label(Double.toString(a1AvgCli));
		Label a1AvgCyQL = new Label("Avg Cycles");
		Label a1AvgSpeQL = new Label("Avg Speaker");
		Label a1AvgAmpQL = new Label("Avg Amp");
		Label a1AvgTrapQL = new Label("Avg Trap");
		Label a1AvgCliQL = new Label("Avg Climb");
		a1AvgCyL.setId("avgStat");
		a1AvgSpeL.setId("avgStat");
		a1AvgAmpL.setId("avgStat");
		a1AvgTrapL.setId("avgStat");
		a1AvgCliL.setId("avgStat");
		a1AvgCyQL.setId("smallTitle");
		a1AvgSpeQL.setId("smallTitle");
		a1AvgAmpQL.setId("smallTitle");
		a1AvgTrapQL.setId("smallTitle");
		a1AvgCliQL.setId("smallTitle");
		BorderPane a1CyBP = new BorderPane();
		BorderPane a1SpeBP = new BorderPane();
		BorderPane a1AmpBP = new BorderPane();
		BorderPane a1TrapBP = new BorderPane();
		BorderPane a1CliBP = new BorderPane();
		Label a1TitleL = new Label("The Alliance's Stats");
		a1TitleL.setId("smallTitle");
		BorderPane a1TitleBP = new BorderPane();
		a1TitleBP.setId("seAlla1TitleBP");
		a1TitleBP.setCenter(a1TitleL);
		a1CyBP.setTop(a1AvgCyQL);
		a1SpeBP.setTop(a1AvgSpeQL);
		a1AmpBP.setTop(a1AvgAmpQL);
		a1TrapBP.setTop(a1AvgTrapQL);
		a1CliBP.setTop(a1AvgCliQL);
		a1CyBP.setCenter(a1AvgCyL);
		a1SpeBP.setCenter(a1AvgSpeL);
		a1AmpBP.setCenter(a1AvgAmpL);
		a1TrapBP.setCenter(a1AvgTrapL);
		a1CliBP.setCenter(a1AvgCliL);
		a1CyBP.setId("seAllNonBP9");
		a1SpeBP.setId("seAllNonBP8");
		a1AmpBP.setId("seAllNonBP7");
		a1TrapBP.setId("seAllNonBP6");
		a1CliBP.setId("seAllNonBP5");
		VBox a1NonVB = new VBox(5);
		a1NonVB.getChildren().addAll(a1TitleBP, a1CyBP, a1SpeBP, a1AmpBP, a1TrapBP, a1CliBP);
		this.add(a1NonVB, 1, 1);
		double t1HumAmpNotes = t1.getHumAmpNotes();
		double t2HumAmpNotes = t2.getHumAmpNotes();
		double t3HumAmpNotes = t3.getHumAmpNotes();
		int t1TimesAmp = t1.getTimesHumAmp();
		int t2TimesAmp = t2.getTimesHumAmp();
		int t3TimesAmp = t3.getTimesHumAmp();
		Boolean doTheyHaveAmpHum = false;
		Boolean workst1 = false;
		Boolean workst2 = false;
		Boolean workst3 = false;
		VBox ampHumsVB = new VBox(5);
		BorderPane worksT1BP = null;
		BorderPane worksT2BP = null;
		BorderPane worksT3BP = null;
		if(t1HumAmpNotes >= 1) {
			doTheyHaveAmpHum = true;
			workst1 = true;
			Label worksT1L = new Label(Double.toString(t1HumAmpNotes));
			worksT1L.setId("avgStat");
			Label workT1QL = new Label("High Notes");
			workT1QL.setId("smallTitle");
			Label worksT1TeamL = new Label(Integer.toString(t1.getTeamNum()));
			worksT1TeamL.setId("smallerTitle");
			VBox worksT1VB = new VBox(5);
			worksT1VB.getChildren().addAll(worksT1TeamL, workT1QL);
			worksT1BP = new BorderPane();
			worksT1BP.setTop(worksT1VB);
			worksT1BP.setCenter(worksT1L);
			worksT1BP.setId("seAllworks1");
		}
		if(t2HumAmpNotes >= 1) {
			doTheyHaveAmpHum = true;
			workst2 = true;
			Label worksT2L = new Label(Double.toString(t1HumAmpNotes));
			worksT2L.setId("avgStat");
			Label workT2QL = new Label("High Notes");
			workT2QL.setId("smallTitle");
			Label worksT2TeamL = new Label(Integer.toString(t2.getTeamNum()));
			worksT2TeamL.setId("smallerTitle");
			VBox worksT2VB = new VBox(5);
			worksT2VB.getChildren().addAll(worksT2TeamL, workT2QL);
			worksT2BP = new BorderPane();
			worksT2BP.setTop(worksT2VB);
			worksT2BP.setCenter(worksT2L);
			worksT2BP.setId("seAllworks2");
		}
		if(t3HumAmpNotes >= 1) {
			doTheyHaveAmpHum = true;
			workst3 = true;
			Label worksT3L = new Label(Double.toString(t1HumAmpNotes));
			worksT3L.setId("avgStat");
			Label workT3QL = new Label("High Notes");
			workT3QL.setId("smallTitle");
			Label worksT3TeamL = new Label(Integer.toString(t3.getTeamNum()));
			worksT3TeamL.setId("smallerTitle");
			VBox worksT3VB = new VBox(5);
			worksT3VB.getChildren().addAll(worksT3TeamL, workT3QL);
			worksT3BP = new BorderPane();
			worksT3BP.setTop(worksT3VB);
			worksT3BP.setCenter(worksT3L);
			worksT3BP.setId("seAllworks3");
		}
		VBox works = new VBox(5);
		works.getChildren().addAll(worksT1BP, worksT2BP,worksT3BP);
		this.add(works, 9, 1);
		
	}
	
	public void displayAllStats(Team t1, Team t2, Team t3, Team t4) {
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
		t1CyBP.setId("seAllBP1");
		t1SpeBP.setId("seAllBP2");
		t1AmpBP.setId("seAllBP3");
		t1TrapBP.setId("seAllBP4");
		t1CliBP.setId("seAllBP5");
		t2CyBP.setId("seAllBP1");
		t2SpeBP.setId("seAllBP2");
		t2AmpBP.setId("seAllBP3");
		t2TrapBP.setId("seAllBP4");
		t2CliBP.setId("seAllBP5");
		t3CyBP.setId("seAllBP1");
		t3SpeBP.setId("seAllBP2");
		t3AmpBP.setId("seAllBP3");
		t3TrapBP.setId("seAllBP4");
		t3CliBP.setId("seAllBP5");
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
		this.add(new Label("    "), 6, 0);
		this.add(t1VB, 3, 1);
		this.add(t2VB, 5, 1);
		this.add(t3VB, 7, 1);
		double a1AvgCy = t1AvgCy + t2AvgCy + t3AvgCy;
		double a1AvgSpe = t1AvgSpe + t2AvgSpe + t3AvgSpe;
		double a1AvgAmp = t1AvgCy + t2AvgCy + t3AvgAmp;
		double a1AvgTrap = t1AvgCy + t2AvgTrap + t3AvgTrap;
		double a1AvgCli = t1AvgCy + t2AvgCy + t3AvgCy;
		Label a1AvgCyL = new Label(Double.toString(a1AvgCy));
		Label a1AvgSpeL = new Label(Double.toString(a1AvgSpe));
		Label a1AvgAmpL = new Label(Double.toString(a1AvgAmp));
		Label a1AvgTrapL = new Label(Double.toString(a1AvgTrap));
		Label a1AvgCliL = new Label(Double.toString(a1AvgCli));
		Label a1AvgCyQL = new Label("Avg Cycles");
		Label a1AvgSpeQL = new Label("Avg Speaker");
		Label a1AvgAmpQL = new Label("Avg Amp");
		Label a1AvgTrapQL = new Label("Avg Trap");
		Label a1AvgCliQL = new Label("Avg Climb");
		a1AvgCyL.setId("avgStat");
		a1AvgSpeL.setId("avgStat");
		a1AvgAmpL.setId("avgStat");
		a1AvgTrapL.setId("avgStat");
		a1AvgCliL.setId("avgStat");
		a1AvgCyQL.setId("smallTitle");
		a1AvgSpeQL.setId("smallTitle");
		a1AvgAmpQL.setId("smallTitle");
		a1AvgTrapQL.setId("smallTitle");
		a1AvgCliQL.setId("smallTitle");
		BorderPane a1CyBP = new BorderPane();
		BorderPane a1SpeBP = new BorderPane();
		BorderPane a1AmpBP = new BorderPane();
		BorderPane a1TrapBP = new BorderPane();
		BorderPane a1CliBP = new BorderPane();
		Label a1TitleL = new Label("The Alliance's Stats");
		a1TitleL.setId("smallTitle");
		BorderPane a1TitleBP = new BorderPane();
		a1TitleBP.setId("seAlla1TitleBP");
		t1TitleBP.setCenter(t1TitleL);
		a1CyBP.setTop(a1AvgCyQL);
		a1SpeBP.setTop(a1AvgSpeQL);
		a1AmpBP.setTop(a1AvgAmpQL);
		a1TrapBP.setTop(a1AvgTrapQL);
		a1CliBP.setTop(a1AvgCliQL);
		a1CyBP.setCenter(a1AvgCyL);
		a1SpeBP.setCenter(a1AvgSpeL);
		a1AmpBP.setCenter(a1AvgAmpL);
		a1TrapBP.setCenter(a1AvgTrapL);
		a1CliBP.setCenter(a1AvgCliL);
		a1CyBP.setId("seAllBP9");
		a1SpeBP.setId("seAllBP8");
		a1AmpBP.setId("seAllBP7");
		a1TrapBP.setId("seAllBP6");
		a1CliBP.setId("seAllBP5");
		VBox a1NonVB = new VBox();
		a1NonVB.getChildren().addAll(a1TitleBP, a1CyBP, a1SpeBP, a1AmpBP, a1TrapBP, a1CliBP);
		this.add(a1NonVB, 1, 1);
		if(t4 != null) {
			double t4AvgCy = t4.getAvgCycles();
			double t4AvgSpe = t4.getAvgSpe();
			double t4AvgAmp = t4.getAvgAmp();
			double t4AvgTrap = t4.getAvgTrap();
			double t4AvgCli = t4.getAvgClimb();
			Label t4AvgCyL = new Label(Double.toString(t4AvgCy));
			Label t4AvgSpeL = new Label(Double.toString(t4AvgSpe));
			Label t4AvgAmpL = new Label(Double.toString(t4AvgAmp));
			Label t4AvgTrapL = new Label(Double.toString(t4AvgTrap));
			Label t4AvgCliL = new Label(Double.toString(t4AvgCli));
			t4AvgCyL.setId("avgStat");
			t4AvgSpeL.setId("avgStat");
			t4AvgAmpL.setId("avgStat");
			t4AvgTrapL.setId("avgStat");
			t4AvgCliL.setId("avgStat");
			Label t4AvgCyQL = new Label("Avg Cycles");
			Label t4AvgSpeQL = new Label("Avg Speaker");
			Label t4AvgAmpQL = new Label("Avg Amp");
			Label t4AvgTrapQL = new Label("Avg Trap");
			Label t4AvgCliQL = new Label("Avg Climb");
			t4AvgCyQL.setId("smallTitle");
			t4AvgSpeQL.setId("smallTitle");
			t4AvgAmpQL.setId("smallTitle");
			t4AvgTrapQL.setId("smallTitle");
			t4AvgCliQL.setId("smallTitle");
			BorderPane t4CyBP = new BorderPane();
			BorderPane t4SpeBP = new BorderPane();
			BorderPane t4AmpBP = new BorderPane();
			BorderPane t4TrapBP = new BorderPane();
			BorderPane t4CliBP = new BorderPane();
			t4CyBP.setTop(t4AvgCyQL);
			t4SpeBP.setTop(t4AvgSpeQL);
			t4AmpBP.setTop(t4AvgAmpQL);
			t4TrapBP.setTop(t4AvgTrapQL);
			t4CliBP.setTop(t4AvgCliQL);
			t4CyBP.setCenter(t4AvgCyL);
			t4SpeBP.setCenter(t4AvgSpeL);
			t4AmpBP.setCenter(t4AvgAmpL);
			t4TrapBP.setCenter(t4AvgTrapL);
			t4CliBP.setCenter(t4AvgCliL);
			t4CyBP.setId("seAllBP1");
			t4SpeBP.setId("seAllBP2");
			t4AmpBP.setId("seAllBP3");
			t4TrapBP.setId("seAllBP4");
			t4CliBP.setId("seAllBP5");
			Label t4TitleL = new Label(t4.getTeamNum() + "'s Stats");
			t4TitleL.setId("TitleLabelPlay");
			BorderPane t4TitleBP = new BorderPane();
			t4TitleBP.setCenter(t4TitleL);
			t4TitleBP.setId("seAllt4TitleBP");
			VBox t4VB = new VBox(5);
			t4VB.getChildren().addAll(t4TitleBP, t4CyBP, t4SpeBP, t4AmpBP, t4TrapBP, t4CliBP);
			this.add(new Label("    "), 8, 0);
			this.add(t4VB, 9, 1);
		}
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
				displayNonStats(t1, t2,  t3);
			}
			if(event.getSource() == seAllincesB) {
				this.getChildren().clear();
				Team t1 = null;
				Team t2 = null;
				Team t3 = null;
				Team t4 = null;
				PlayoffAlliance all;
				String allNumS = allPlayCB.getSelectionModel().getSelectedItem();
				
				int allNum = Integer.parseInt(allNumS);
				
				if(allNum == 1) {
					all = thePlayoffAlls.getAlliance1();
					t1 = all.getTeam1();
					t2 = all.getTeam2();
					t3 = all.getTeam3();
					t4 = all.getTeam4();
				}
				if(allNum == 2) {
					all = thePlayoffAlls.getAlliance2();
					t1 = all.getTeam1();
					t2 = all.getTeam2();
					t3 = all.getTeam3();
					t4 = all.getTeam4();
				}
				if(allNum == 3) {
					all = thePlayoffAlls.getAlliance3();
					t1 = all.getTeam1();
					t2 = all.getTeam2();
					t3 = all.getTeam3();
					t4 = all.getTeam4();
				}
				if(allNum == 4) {
					all = thePlayoffAlls.getAlliance4();
					t1 = all.getTeam1();
					t2 = all.getTeam2();
					t3 = all.getTeam3();
					t4 = all.getTeam4();
				}
				if(allNum == 5) {
					all = thePlayoffAlls.getAlliance5();
					t1 = all.getTeam1();
					t2 = all.getTeam2();
					t3 = all.getTeam3();
					t4 = all.getTeam4();
				}
				if(allNum == 6) {
					all = thePlayoffAlls.getAlliance6();
					t1 = all.getTeam1();
					t2 = all.getTeam2();
					t3 = all.getTeam3();
					t4 = all.getTeam4();
				}
				if(allNum == 7) {
					all = thePlayoffAlls.getAlliance7();
					t1 = all.getTeam1();
					t2 = all.getTeam2();
					t3 = all.getTeam3();
					t4 = all.getTeam4();
				}
				if(allNum == 8) {
					all = thePlayoffAlls.getAlliance8();
					t1 = all.getTeam1();
					t2 = all.getTeam2();
					t3 = all.getTeam3();
					t4 = all.getTeam4();
				}
				displayAllStats(t1, t2, t3, t4);
			}
		} catch(Exception e) {
			System.out.println("Error: " + e);
		}
		
	}
}
