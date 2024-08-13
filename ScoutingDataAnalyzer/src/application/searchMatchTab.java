package application;

import java.util.ArrayList;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class searchMatchTab extends GridPane implements EventHandler<ActionEvent>{
	
	private Button submitNonB;
	private Button submitPlayB;
	private ComboBox<String> teamCB;
	private TextField matchNumTF;
	private ComboBox<String> isPracCB;
	private ComboBox<String> isReplayCB;
	private List<Integer> listOfTeamNums;
	private MatchList mainML;
	private TeamList theTL;
	
	public searchMatchTab(List<Integer> importedListOfTeamNums, boolean imIsPlayoff, MatchList imML, TeamList imTeamList) {
		listOfTeamNums = importedListOfTeamNums;
		mainML = imML;
		theTL = imTeamList;
		if(imIsPlayoff == false) {
			Label selTeamL = new Label("Select Team:  ");
			Label selMatchNumL = new Label("Select Match Number:  ");
			Label selPracMatchL = new Label("Is It a Practice Match?");
			Label selRePlayL = new Label("Is It a Match Replay");
			submitNonB = new Button("Submit");
			submitNonB.setOnAction(this);
			BorderPane selTeamBP = new BorderPane();
			BorderPane selMatchNumBP = new BorderPane();
			BorderPane selPracBP = new BorderPane();
			BorderPane selRePlayBP = new BorderPane();
			teamCB = new ComboBox<String>();
			addComboBoxItems();
			matchNumTF = new TextField();
			isPracCB = new ComboBox<String>();
			isPracCB.getItems().addAll("Yes", "No");
			isReplayCB = new ComboBox<String>();
			isReplayCB.getItems().addAll("Yes", "No");
			selTeamBP.setTop(selTeamL);
			selMatchNumBP.setTop(selMatchNumL);
			selPracBP.setTop(selPracMatchL);
			selRePlayBP.setTop(selRePlayL);
			selTeamBP.setTop(teamCB);
			selMatchNumBP.setTop(matchNumTF);
			selPracBP.setTop(isPracCB);
			selRePlayBP.setTop(isReplayCB);
			HBox selHB = new HBox(5);
			selHB.getChildren().addAll(selTeamBP, selMatchNumBP, selPracBP, selRePlayBP);
			this.add(new Label("    "), 0, 0);
			this.add(new Label("    "), 2, 0);
			this.add(selHB, 1, 1);
			this.add(submitNonB, 1, 3);
		}else {
			Label selTeamL = new Label("Select Team:  ");
			Label selMatchNumL = new Label("Select Match Number:  ");
			Label selRePlayL = new Label("Is It a Match Replay");
			submitPlayB = new Button("Submit");
			submitPlayB.setOnAction(this);
			BorderPane selTeamBP = new BorderPane();
			BorderPane selMatchNumBP = new BorderPane();
			BorderPane selRePlayBP = new BorderPane();
			teamCB = new ComboBox<String>();
			addComboBoxItems();
			matchNumTF = new TextField();
			isReplayCB = new ComboBox<String>();
			isReplayCB.getItems().addAll("Yes", "No");
			selTeamBP.setTop(selTeamL);
			selMatchNumBP.setTop(selMatchNumL);
			selRePlayBP.setTop(selRePlayL);
			selTeamBP.setTop(teamCB);
			selMatchNumBP.setTop(matchNumTF);
			selRePlayBP.setTop(isReplayCB);
			HBox selHB = new HBox(5);
			selHB.getChildren().addAll(selTeamBP, selMatchNumBP, selRePlayBP);
			this.add(new Label("    "), 0, 0);
			this.add(new Label("    "), 2, 0);
			this.add(selHB, 1, 1);
			this.add(submitPlayB, 1, 3);
		}
	}
	
	private void addComboBoxItems() {
		String teamNumS;
		for (int i = 0; i < listOfTeamNums.size(); i++) {
			if (listOfTeamNums.get(i) != null) {
				teamNumS = Integer.toString(listOfTeamNums.get(i));
				teamCB.getItems().add(teamNumS);
			}
		}
	}

	@Override
	public void handle(ActionEvent event) {
		try {
			//Blue = false, Red = true
			if(event.getSource() == submitNonB){
				this.getChildren().clear();
				String selTeamNumS = teamCB.getSelectionModel().getSelectedItem();
				String matchNumS = matchNumTF.getText();
				String isPracS = isPracCB.getSelectionModel().getSelectedItem();
				String isReplayS = isReplayCB.getSelectionModel().getSelectedItem();
				int selTeamNum = Integer.parseInt(selTeamNumS);
				int matchNum = Integer.parseInt(matchNumS);
				boolean isPrac = Boolean.parseBoolean(isPracS);
				boolean isReplay = Boolean.parseBoolean(isReplayS);
				List<Match> teamsMatch = mainML.getMatchFromFullList(matchNum);
				List<Match> blueTeams =  new ArrayList<>();
				List<Match> redTeams =  new ArrayList<>();
				TeamList redTs = new TeamList();
				TeamList blueTs = new TeamList();
				Boolean mainColor;
				for(int i = 0; i < teamsMatch.size(); i++) {
					Match m = teamsMatch.get(i);
					boolean mColor = m.getAllianceColor();
					if(mColor == false) {
						blueTeams.add(m);
						blueTs.listOfTeams.add(theTL.getATeam(m.getMatchTeamNum()));
						if(m.getMatchTeamNum() == selTeamNum) {
							mainColor = false;
						}
					}else {
						redTeams.add(m);
						redTs.listOfTeams.add(theTL.getATeam(m.getMatchTeamNum()));
						if(m.getMatchTeamNum() == selTeamNum) {
							mainColor = true;
						}
					}
				}
				if(blueTeams.size() == 3) {
					int teamNum1 = blueTeams.get(0).getMatchTeamNum();
					int teamNum2 = blueTeams.get(1).getMatchTeamNum();
					int teamNum3 = blueTeams.get(2).getMatchTeamNum();
					Label blue1TeamNumL = new Label(Integer.toString(teamNum1));
					Label blue2TeamNumL = new Label(Integer.toString(teamNum2));
					Label blue3TeamNumL = new Label(Integer.toString(teamNum3));
					blue1TeamNumL.setId("smallTitle");
					blue2TeamNumL.setId("smallTitle");
					blue3TeamNumL.setId("smallTitle");
					Label blue1Cy = new Label(Integer.toString(blueTeams.get(0).getMatchAmp() + blueTeams.get(0).getMatchSpe() + blueTeams.get(0).getMatchTrap()));
					Label blue2Cy = new Label(Integer.toString(blueTeams.get(1).getMatchAmp() + blueTeams.get(1).getMatchSpe() + blueTeams.get(1).getMatchTrap()));
					Label blue3Cy = new Label(Integer.toString(blueTeams.get(2).getMatchAmp() + blueTeams.get(2).getMatchSpe() + blueTeams.get(2).getMatchTrap()));
					blue1Cy.setId("avgStat");
					blue2Cy.setId("avgStat");
					blue3Cy.setId("avgStat");
					Label blue1Amp = new Label(Integer.toString(blueTeams.get(0).getMatchAmp()));
					Label blue2Amp = new Label(Integer.toString(blueTeams.get(1).getMatchAmp()));
					Label blue3Amp = new Label(Integer.toString(blueTeams.get(2).getMatchAmp()));
					Label blue1Spe = new Label(Integer.toString(blueTeams.get(0).getMatchSpe()));
					Label blue2Spe = new Label(Integer.toString(blueTeams.get(1).getMatchSpe()));
					Label blue3Spe = new Label(Integer.toString(blueTeams.get(2).getMatchSpe()));
					Label blue1Trap = new Label(Integer.toString(blueTeams.get(0).getMatchTrap()));
					Label blue2Trap = new Label(Integer.toString(blueTeams.get(1).getMatchTrap()));
					Label blue3Trap = new Label(Integer.toString(blueTeams.get(2).getMatchTrap()));
					blue1Amp.setId("avgStat");
					blue2Amp.setId("avgStat");
					blue3Amp.setId("avgStat");
					blue1Spe.setId("avgStat");
					blue2Spe.setId("avgStat");
					blue3Spe.setId("avgStat");
					blue1Trap.setId("avgStat");
					blue2Trap.setId("avgStat");
					blue3Trap.setId("avgStat");
					Label blue1AvgCy = new Label(Double.toString(theTL.getATeam(teamNum1).getAvgCycles()));
					Label blue2AvgCy = new Label(Double.toString(theTL.getATeam(teamNum2).getAvgCycles()));
					Label blue3AvgCy = new Label(Double.toString(theTL.getATeam(teamNum3).getAvgCycles()));
					Label blue1AvgSpe = new Label(Double.toString(theTL.getATeam(teamNum1).getAvgSpe()));
					Label blue2AvgSpe = new Label(Double.toString(theTL.getATeam(teamNum2).getAvgSpe()));
					Label blue3AvgSpe = new Label(Double.toString(theTL.getATeam(teamNum3).getAvgSpe()));
					Label blue1AvgAmp = new Label(Double.toString(theTL.getATeam(teamNum1).getAvgAmp()));
					Label blue2AvgAmp = new Label(Double.toString(theTL.getATeam(teamNum2).getAvgAmp()));
					Label blue3AvgAmp = new Label(Double.toString(theTL.getATeam(teamNum3).getAvgAmp()));
					Label blue1AvgTrap = new Label(Double.toString(theTL.getATeam(teamNum1).getAvgTrap()));
					Label blue2AvgTrap = new Label(Double.toString(theTL.getATeam(teamNum2).getAvgTrap()));
					Label blue3AvgTrap = new Label(Double.toString(theTL.getATeam(teamNum3).getAvgTrap()));
					blue1AvgCy.setId("avgStat");
					blue2AvgCy.setId("avgStat");
					blue3AvgCy.setId("avgStat");
					blue1AvgSpe.setId("avgStat");
					blue2AvgSpe.setId("avgStat");
					blue3AvgSpe.setId("avgStat");
					blue1AvgAmp.setId("avgStat");
					blue2AvgAmp.setId("avgStat");
					blue3AvgAmp.setId("avgStat");
					blue1AvgTrap.setId("avgStat");
					blue2AvgTrap.setId("avgStat");
					blue3AvgTrap.setId("avgStat");
					Label blue1Cli = new Label(Integer.toString(blueTeams.get(0).getMatchClimb()));
					Label blue2Cli = new Label(Integer.toString(blueTeams.get(1).getMatchClimb()));
					Label blue3Cli = new Label(Integer.toString(blueTeams.get(2).getMatchClimb()));
					Label blue1AvgCli = new Label(Double.toString(theTL.getATeam(teamNum1).getAvgClimb()));
					Label blue2AvgCli = new Label(Double.toString(theTL.getATeam(teamNum2).getAvgClimb()));
					Label blue3AvgCli = new Label(Double.toString(theTL.getATeam(teamNum3).getAvgClimb()));
					blue1Cli.setId("avgStat");
					blue2Cli.setId("avgStat");
					blue3Cli.setId("avgStat");
					blue1AvgCli.setId("avgStat");
					blue2AvgCli.setId("avgStat");
					blue3AvgCli.setId("avgStat");
					Label blue1AvgCyQL = new Label("Avg Cycles");
					Label blue1AvgSpeQL = new Label("Avg Speaker");
					Label blue1AvgAmpQL = new Label("Avg Amp");
					Label blue1AvgTrapQL = new Label("Avg Trap");
					Label blue1AvgCliQL = new Label("Avg Climb");
					Label blue2AvgCyQL = new Label("Avg Cycles");
					Label blue2AvgSpeQL = new Label("Avg Speaker");
					Label blue2AvgAmpQL = new Label("Avg Amp");
					Label blue2AvgTrapQL = new Label("Avg Trap");
					Label blue2AvgCliQL = new Label("Avg Climb");
					Label blue3AvgCyQL = new Label("Avg Cycles");
					Label blue3AvgSpeQL = new Label("Avg Speaker");
					Label blue3AvgAmpQL = new Label("Avg Amp");
					Label blue3AvgTrapQL = new Label("Avg Trap");
					Label blue3AvgCliQL = new Label("Avg Climb");
				}else if(blueTeams.size() == 2) {
					int teamNum1 = blueTeams.get(0).getMatchTeamNum();
					int teamNum2 = blueTeams.get(1).getMatchTeamNum();
					Label blue1TeamNumL = new Label(Integer.toString(teamNum1));
					Label blue2TeamNumL = new Label(Integer.toString(teamNum2));
					Label noDataLabel2L = new Label("No Data");
					blue1TeamNumL.setId("smallTitle");
					blue2TeamNumL.setId("smallTitle");
					noDataLabel2L.setId("smallTitle");
				}else if(blueTeams.size() == 1) {
					int teamNum1 = blueTeams.get(0).getMatchTeamNum();
					Label blue1TeamNumL = new Label(Integer.toString(teamNum1));
					Label noDataLabel1L = new Label("No Data");
					Label noDataLabel2L = new Label("No Data");
					blue1TeamNumL.setId("smallTitle");
					noDataLabel1L.setId("smallTitle");
					noDataLabel2L.setId("smallTitle");
				}else if(blueTeams.size() == 0) {
					Label noDataLabel1L = new Label("No Data");
					Label noDataLabel2L = new Label("No Data");
					Label noDataLabel3L = new Label("No Data");
					noDataLabel1L.setId("smallTitle");
					noDataLabel2L.setId("smallTitle");
					noDataLabel3L.setId("smallTitle");
				}

			}
			if(event.getSource() == submitPlayB) {
				this.getChildren().clear();
			}
		} catch(Exception e) {
			System.out.println("Error: " + e);
		}
		
	}
}
