package application;

import java.util.List;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class compareAlliancesTab extends GridPane{
	
	private ComboBox<String> allince1T1CB;
	private ComboBox<String> allince1T2CB;
	private ComboBox<String> allince1T3CB;
	private ComboBox<String> allince2T1CB;
	private ComboBox<String> allince2T2CB;
	private ComboBox<String> allince2T3CB;
	private ComboBox<String> allince3T1CB;
	private ComboBox<String> allince3T2CB;
	private ComboBox<String> allince3T3CB;
	private ComboBox<String> allince1CB;
	private ComboBox<String> allince2CB;
	private ComboBox<String> allince3CB;
	private Button submitNonB;
	private List<Integer> listOfTeamNums;
	private TeamList theTL;
	private PlayoffAlliances thePOA;
	private DriveTeamDataList theDTD;
	private DriveTeamCommentsList theDTC;
	private Button submitPlayB;
	
	public compareAlliancesTab(boolean isPlayoffTime, List<Integer> importedListOfTeamNums, TeamList imTL, PlayoffAlliances imPlayoffAlls, DriveTeamDataList imDTD, DriveTeamCommentsList imDTC) {
		listOfTeamNums = importedListOfTeamNums;
		theTL = imTL;
		thePOA = imPlayoffAlls;
		theDTD = imDTD;
		theDTC = imDTC;
		if(isPlayoffTime == false) {
			Label a1T1L = new Label("Select the 1st team on Allince 1");
			Label a1T2L = new Label("Select the 2nd team on Allince 1");
			Label a1T3L = new Label("Select the 3rd team on Allince 1");
			Label a2T1L = new Label("Select the 1st team on Allince 2");
			Label a2T2L = new Label("Select the 2nd team on Allince 2");
			Label a2T3L = new Label("Select the 3rd team on Allince 2");
			Label a3T1L = new Label("Select the 1st team on Allince 3");
			Label a3T2L = new Label("Select the 2nd team on Allince 3");
			Label a3T3L = new Label("Select the 3rd team on Allince 3");
			a1T1L.setId("smallTitle");
			a1T2L.setId("smallTitle");
			a1T3L.setId("smallTitle");
			a2T1L.setId("smallTitle");
			a2T2L.setId("smallTitle");
			a2T3L.setId("smallTitle");
			a3T1L.setId("smallTitle");
			a3T2L.setId("smallTitle");
			a3T3L.setId("smallTitle");
			allince1T1CB = new ComboBox<String>();
			allince1T2CB = new ComboBox<String>();
			allince1T3CB = new ComboBox<String>();
			allince2T1CB = new ComboBox<String>();
			allince2T2CB = new ComboBox<String>();
			allince2T3CB = new ComboBox<String>();
			allince3T1CB = new ComboBox<String>();
			allince3T2CB = new ComboBox<String>();
			allince3T3CB = new ComboBox<String>();
			addComboBoxItems(allince1T1CB);
			addComboBoxItems(allince1T2CB);
			addComboBoxItems(allince1T3CB);
			addComboBoxItems(allince2T1CB);
			addComboBoxItems(allince2T2CB);
			addComboBoxItems(allince2T3CB);
			addComboBoxItems(allince3T1CB);
			addComboBoxItems(allince3T2CB);
			addComboBoxItems(allince3T3CB);
			BorderPane a1T1SelBP  = new BorderPane();
			BorderPane a1T2SelBP  = new BorderPane();
			BorderPane a1T3SelBP  = new BorderPane();
			BorderPane a2T1SelBP  = new BorderPane();
			BorderPane a2T2SelBP  = new BorderPane();
			BorderPane a2T3SelBP  = new BorderPane();
			BorderPane a3T1SelBP  = new BorderPane();
			BorderPane a3T2SelBP  = new BorderPane();
			BorderPane a3T3SelBP  = new BorderPane();
			a1T1SelBP.setTop(a1T1L);
			a1T2SelBP.setTop(a1T2L);
			a1T3SelBP.setTop(a1T3L);
			a2T1SelBP.setTop(a2T1L);
			a2T2SelBP.setTop(a2T2L);
			a2T3SelBP.setTop(a2T3L);
			a3T1SelBP.setTop(a3T1L);
			a3T2SelBP.setTop(a3T2L);
			a3T3SelBP.setTop(a3T3L);
			a1T1SelBP.setCenter(allince1T1CB);
			a1T2SelBP.setCenter(allince1T2CB);
			a1T3SelBP.setCenter(allince1T3CB);
			a2T1SelBP.setCenter(allince2T1CB);
			a2T2SelBP.setCenter(allince2T2CB);
			a2T3SelBP.setCenter(allince2T3CB);
			a3T1SelBP.setCenter(allince3T1CB);
			a3T2SelBP.setCenter(allince3T2CB);
			a3T3SelBP.setCenter(allince3T3CB);
			a1T1SelBP.setId("comAllselBP1");
			a1T2SelBP.setId("comAllselBP2");
			a1T3SelBP.setId("comAllselBP3");
			a2T1SelBP.setId("comAllselBP2");
			a2T2SelBP.setId("comAllselBP3");
			a2T3SelBP.setId("comAllselBP4");
			a3T1SelBP.setId("comAllselBP3");
			a3T2SelBP.setId("comAllselBP4");
			a3T3SelBP.setId("comAllselBP5");
			this.add(new Label("    "), 0, 0);
			this.add(new Label("    "), 2, 0);
			this.add(new Label("    "), 4, 0);
			this.add(new Label("    "), 0, 2);
			this.add(new Label("    "), 0, 4);
			this.add(new Label("    "), 0, 6);
			this.add(a1T1SelBP, 1, 1);
			this.add(a1T2SelBP, 3, 1);
			this.add(a1T3SelBP, 5, 1);
			this.add(a2T1SelBP, 1, 3);
			this.add(a2T2SelBP, 3, 3);
			this.add(a2T3SelBP, 5, 3);
			this.add(a3T1SelBP, 1, 5);
			this.add(a3T2SelBP, 3, 5);
			this.add(a3T3SelBP, 5, 5);
			//adding button
			submitNonB = new Button("Submit");
			this.add(submitNonB, 1, 7);
		}else {
			Label a1L = new Label("Select the 1st Allince");
			Label a2L = new Label("Select the 2nd Allince");
			Label a3L = new Label("Select the 3rd Allince");
			a1L.setId("smallTitle");
			a2L.setId("smallTitle");
			a3L.setId("smallTitle");
			allince1CB = new ComboBox<String>();
			allince2CB = new ComboBox<String>();
			allince3CB = new ComboBox<String>();
			addComboBoxItems(allince1CB);
			addComboBoxItems(allince2CB);
			addComboBoxItems(allince3CB);
			BorderPane a1  = new BorderPane();
			BorderPane a2  = new BorderPane();
			BorderPane a3  = new BorderPane();
			a1.setTop(a1L);
			a2.setTop(a2L);
			a3.setTop(a3L);
			a1.setCenter(allince1CB);
			a2.setCenter(allince2CB);
			a3.setCenter(allince3CB);
			a1.setId("comAllselBP1");
			a2.setId("comAllselBP2");
			a3.setId("comAllselBP3");
			this.add(new Label("    "), 0, 0);
			this.add(new Label("    "), 2, 0);
			this.add(new Label("    "), 4, 0);
			this.add(new Label("    "), 0, 2);
			this.add(a1, 1, 1);
			this.add(a2, 3, 1);
			this.add(a3, 5, 1);
			submitPlayB = new Button("Submit");
			this.add(submitPlayB, 1, 3);
		}
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
	
	public void addCompare3Alls(Team a1T1, Team a1T2, Team a1T3, Team a2T1, Team a2T2, Team a2T3, Team a3T1, Team a3T2, Team a3T3) {
		int a1T1Num = a1T1.getTeamNum();
		int a1T2Num = a1T2.getTeamNum();
		int a1T3Num = a1T3.getTeamNum();
		int a2T1Num = a2T1.getTeamNum();
		int a2T2Num = a2T2.getTeamNum();
		int a2T3Num = a2T3.getTeamNum();
		int a3T1Num = a3T1.getTeamNum();
		int a3T2Num = a3T2.getTeamNum();
		int a3T3Num = a3T3.getTeamNum();
		double a1T1Cy = a1T1.getAvgCycles();
		double a1T2Cy = a1T2.getAvgCycles();
		double a1T3Cy = a1T3.getAvgCycles();
		double a2T1Cy = a2T1.getAvgCycles();
		double a2T2Cy = a2T2.getAvgCycles();
		double a2T3Cy = a2T3.getAvgCycles();
		double a3T1Cy = a3T1.getAvgCycles();
		double a3T2Cy = a3T2.getAvgCycles();
		double a3T3Cy = a3T3.getAvgCycles();
		double a1T1Spe = a1T1.getAvgSpe();
		double a1T2Spe = a1T2.getAvgSpe();
		double a1T3Spe = a1T3.getAvgSpe();
		double a2T1Spe = a2T1.getAvgSpe();
		double a2T2Spe = a2T2.getAvgSpe();
		double a2T3Spe = a2T3.getAvgSpe();
		double a3T1Spe = a3T1.getAvgSpe();
		double a3T2Spe = a3T2.getAvgSpe();
		double a3T3Spe = a3T3.getAvgSpe();
		double a1T1Amp = a1T1.getAvgAmp();
		double a1T2Amp = a1T2.getAvgAmp();
		double a1T3Amp = a1T3.getAvgAmp();
		double a2T1Amp = a2T1.getAvgAmp();
		double a2T2Amp = a2T2.getAvgAmp();
		double a2T3Amp = a2T3.getAvgAmp();
		double a3T1Amp = a3T1.getAvgAmp();
		double a3T2Amp = a3T2.getAvgAmp();
		double a3T3Amp = a3T3.getAvgAmp();
		double a1T1Trap = a1T1.getAvgTrap();
		double a1T2Trap = a1T2.getAvgTrap();
		double a1T3Trap = a1T3.getAvgTrap();
		double a2T1Trap = a2T1.getAvgTrap();
		double a2T2Trap = a2T2.getAvgTrap();
		double a2T3Trap = a2T3.getAvgTrap();
		double a3T1Trap = a3T1.getAvgTrap();
		double a3T2Trap = a3T2.getAvgTrap();
		double a3T3Trap = a3T3.getAvgTrap();
		double a1T1Cli = a1T1.getAvgClimb();
		double a1T2Cli = a1T2.getAvgClimb();
		double a1T3Cli = a1T3.getAvgClimb();
		double a2T1Cli = a2T1.getAvgClimb();
		double a2T2Cli = a2T2.getAvgClimb();
		double a2T3Cli = a2T3.getAvgClimb();
		double a3T1Cli = a3T1.getAvgClimb();
		double a3T2Cli = a3T2.getAvgClimb();
		double a3T3Cli = a3T3.getAvgClimb();
		double a1T1HumN = a1T1.getHumAmpNotes();
		double a1T2HumN = a1T2.getHumAmpNotes();
		double a1T3HumN = a1T3.getHumAmpNotes();
		double a2T1HumN = a2T1.getHumAmpNotes();
		double a2T2HumN = a2T2.getHumAmpNotes();
		double a2T3HumN = a2T3.getHumAmpNotes();
		double a3T1HumN = a3T1.getHumAmpNotes();
		double a3T2HumN = a3T2.getHumAmpNotes();
		double a3T3HumN = a3T3.getHumAmpNotes();
		int a1T1TimesSco = a1T1.getTimesHumSco();
		int a1T2TimesSco = a1T2.getTimesHumSco();
		int a1T3TimesSco = a1T3.getTimesHumSco();
		int a2T1TimesSco = a2T1.getTimesHumSco();
		int a2T2TimesSco = a2T2.getTimesHumSco();
		int a2T3TimesSco = a2T3.getTimesHumSco();
		int a3T1TimesSco = a3T1.getTimesHumSco();
		int a3T2TimesSco = a3T2.getTimesHumSco();
		int a3T3TimesSco = a3T3.getTimesHumSco();
		int a1T1TimesAmp = a1T1.getTimesHumAmp();
		int a1T2TimesAmp = a1T2.getTimesHumAmp();
		int a1T3TimesAmp = a1T3.getTimesHumAmp();
		int a2T1TimesAmp = a2T1.getTimesHumAmp();
		int a2T2TimesAmp = a2T2.getTimesHumAmp();
		int a2T3TimesAmp = a2T3.getTimesHumAmp();
		int a3T1TimesAmp = a3T1.getTimesHumAmp();
		int a3T2TimesAmp = a3T2.getTimesHumAmp();
		int a3T3TimesAmp = a3T3.getTimesHumAmp();
		Label a1T1NumL = new Label(Integer.toString(a1T1Num) + "'s Stats");
		Label a1T2NumL = new Label(Integer.toString(a1T2Num) + "'s Stats");
		Label a1T3NumL = new Label(Integer.toString(a1T3Num) + "'s Stats");
		Label a2T1NumL = new Label(Integer.toString(a2T1Num) + "'s Stats");
		Label a2T2NumL = new Label(Integer.toString(a2T2Num) + "'s Stats");
		Label a2T3NumL = new Label(Integer.toString(a2T3Num) + "'s Stats");
		Label a3T1NumL = new Label(Integer.toString(a3T1Num) + "'s Stats");
		Label a3T2NumL = new Label(Integer.toString(a3T2Num) + "'s Stats");
		Label a3T3NumL = new Label(Integer.toString(a3T3Num) + "'s Stats");
		Label a1T1CyL = new Label(Double.toString(a1T1Cy));
		Label a1T2CyL = new Label(Double.toString(a1T2Cy));
		Label a1T3CyL = new Label(Double.toString(a1T3Cy));
		Label a2T1CyL = new Label(Double.toString(a2T1Cy));
		Label a2T2CyL = new Label(Double.toString(a2T2Cy));
		Label a2T3CyL = new Label(Double.toString(a2T3Cy));
		Label a3T1CyL = new Label(Double.toString(a3T1Cy));
		Label a3T2CyL = new Label(Double.toString(a3T2Cy));
		Label a3T3CyL = new Label(Double.toString(a3T3Cy));
		Label a1T1SpeL = new Label(Double.toString(a1T1Spe));
		Label a1T2SpeL = new Label(Double.toString(a1T2Spe));
		Label a1T3SpeL = new Label(Double.toString(a1T3Spe));
		Label a2T1SpeL = new Label(Double.toString(a2T1Spe));
		Label a2T2SpeL = new Label(Double.toString(a2T2Spe));
		Label a2T3SpeL = new Label(Double.toString(a2T3Spe));
		Label a3T1SpeL = new Label(Double.toString(a3T1Spe));
		Label a3T2SpeL = new Label(Double.toString(a3T2Spe));
		Label a3T3SpeL = new Label(Double.toString(a3T3Spe));
		Label a1T1AmpL = new Label(Double.toString(a1T1Amp));
		Label a1T2AmpL = new Label(Double.toString(a1T2Amp));
		Label a1T3AmpL = new Label(Double.toString(a1T3Amp));
		Label a2T1AmpL = new Label(Double.toString(a2T1Amp));
		Label a2T2AmpL = new Label(Double.toString(a2T2Amp));
		Label a2T3AmpL = new Label(Double.toString(a2T3Amp));
		Label a3T1AmpL = new Label(Double.toString(a3T1Amp));
		Label a3T2AmpL = new Label(Double.toString(a3T2Amp));
		Label a3T3AmpL = new Label(Double.toString(a3T3Amp));
		Label a1T1TrapL = new Label(Double.toString(a1T1Trap));
		Label a1T2TrapL = new Label(Double.toString(a1T2Trap));
		Label a1T3TrapL = new Label(Double.toString(a1T3Trap));
		Label a2T1TrapL = new Label(Double.toString(a2T1Trap));
		Label a2T2TrapL = new Label(Double.toString(a2T2Trap));
		Label a2T3TrapL = new Label(Double.toString(a2T3Trap));
		Label a3T1TrapL = new Label(Double.toString(a3T1Trap));
		Label a3T2TrapL = new Label(Double.toString(a3T2Trap));
		Label a3T3TrapL = new Label(Double.toString(a3T3Trap));
		Label a1T1CliL = new Label(Double.toString(a1T1Cli));
		Label a1T2CliL = new Label(Double.toString(a1T2Cli));
		Label a1T3CliL = new Label(Double.toString(a1T3Cli));
		Label a2T1CliL = new Label(Double.toString(a2T1Cli));
		Label a2T2CliL = new Label(Double.toString(a2T2Cli));
		Label a2T3CliL = new Label(Double.toString(a2T3Cli));
		Label a3T1CliL = new Label(Double.toString(a3T1Cli));
		Label a3T2CliL = new Label(Double.toString(a3T2Cli));
		Label a3T3CliL = new Label(Double.toString(a3T3Cli));
		Label a1T1HumNL = new Label(Double.toString(a1T1HumN));
		Label a1T2HumNL = new Label(Double.toString(a1T2HumN));
		Label a1T3HumNL = new Label(Double.toString(a1T3HumN));
		Label a2T1HumNL = new Label(Double.toString(a2T1HumN));
		Label a2T2HumNL = new Label(Double.toString(a2T2HumN));
		Label a2T3HumNL = new Label(Double.toString(a2T3HumN));
		Label a3T1HumNL = new Label(Double.toString(a3T1HumN));
		Label a3T2HumNL = new Label(Double.toString(a3T2HumN));
		Label a3T3HumNL = new Label(Double.toString(a3T3HumN));
		Label a1T1TimesScoL = new Label(Double.toString(a1T1TimesSco));
		Label a1T2TimesScoL = new Label(Double.toString(a1T2TimesSco));
		Label a1T3TimesScoL = new Label(Double.toString(a1T3TimesSco));
		Label a2T1TimesScoL = new Label(Double.toString(a2T1TimesSco));
		Label a2T2TimesScoL = new Label(Double.toString(a2T2TimesSco));
		Label a2T3TimesScoL = new Label(Double.toString(a2T3TimesSco));
		Label a3T1TimesScoL = new Label(Double.toString(a3T1TimesSco));
		Label a3T2TimesScoL = new Label(Double.toString(a3T2TimesSco));
		Label a3T3TimesScoL = new Label(Double.toString(a3T3TimesSco));
		Label a1T1TimesAmpL = new Label(Double.toString(a1T1TimesAmp));
		Label a1T2TimesAmpL = new Label(Double.toString(a1T2TimesAmp));
		Label a1T3TimesAmpL = new Label(Double.toString(a1T3TimesAmp));
		Label a2T1TimesAmpL = new Label(Double.toString(a2T1TimesAmp));
		Label a2T2TimesAmpL = new Label(Double.toString(a2T2TimesAmp));
		Label a2T3TimesAmpL = new Label(Double.toString(a2T3TimesAmp));
		Label a3T1TimesAmpL = new Label(Double.toString(a3T1TimesAmp));
		Label a3T2TimesAmpL = new Label(Double.toString(a3T2TimesAmp));
		Label a3T3TimesAmpL = new Label(Double.toString(a3T3TimesAmp));
		Label a1T1CyTitleL = new Label("Avg Cycles");
		Label a1T2CyTitleL = new Label("Avg Cycles");
		Label a1T3CyTitleL = new Label("Avg Cycles");
		Label a2T1CyTitleL = new Label("Avg Cycles");
		Label a2T2CyTitleL = new Label("Avg Cycles");
		Label a2T3CyTitleL = new Label("Avg Cycles");
		Label a3T1CyTitleL = new Label("Avg Cycles");
		Label a3T2CyTitleL = new Label("Avg Cycles");
		Label a3T3CyTitleL = new Label("Avg Cycles");
		Label a1T1SpeTitleL = new Label("Avg Speaker");
		Label a1T2SpeTitleL = new Label("Avg Speaker");
		Label a1T3SpeTitleL = new Label("Avg Speaker");
		Label a2T1SpeTitleL = new Label("Avg Speaker");
		Label a2T2SpeTitleL = new Label("Avg Speaker");
		Label a2T3SpeTitleL = new Label("Avg Speaker");
		Label a3T1SpeTitleL = new Label("Avg Speaker");
		Label a3T2SpeTitleL = new Label("Avg Speaker");
		Label a3T3SpeTitleL = new Label("Avg Speaker");
		Label a1T1AmpTitleL = new Label("Avg Amp");
		Label a1T2AmpTitleL = new Label("Avg Amp");
		Label a1T3AmpTitleL = new Label("Avg Amp");
		Label a2T1AmpTitleL = new Label("Avg Amp");
		Label a2T2AmpTitleL = new Label("Avg Amp");
		Label a2T3AmpTitleL = new Label("Avg Amp");
		Label a3T1AmpTitleL = new Label("Avg Amp");
		Label a3T2AmpTitleL = new Label("Avg Amp");
		Label a3T3AmpTitleL = new Label("Avg Amp");
		Label a1T1TrapTitleL = new Label("Avg Trap");
		Label a1T2TrapTitleL = new Label("Avg Trap");
		Label a1T3TrapTitleL = new Label("Avg Trap");
		Label a2T1TrapTitleL = new Label("Avg Trap");
		Label a2T2TrapTitleL = new Label("Avg Trap");
		Label a2T3TrapTitleL = new Label("Avg Trap");
		Label a3T1TrapTitleL = new Label("Avg Trap");
		Label a3T2TrapTitleL = new Label("Avg Trap");
		Label a3T3TrapTitleL = new Label("Avg Trap");
		Label a1T1CliTitleL = new Label("Avg Climb");
		Label a1T2CliTitleL = new Label("Avg Climb");
		Label a1T3CliTitleL = new Label("Avg Climb");
		Label a2T1CliTitleL = new Label("Avg Climb");
		Label a2T2CliTitleL = new Label("Avg Climb");
		Label a2T3CliTitleL = new Label("Avg Climb");
		Label a3T1CliTitleL = new Label("Avg Climb");
		Label a3T2CliTitleL = new Label("Avg Climb");
		Label a3T3CliTitleL = new Label("Avg Climb");
		Label a1T1HumNTitleL = new Label("Avg High Notes");
		Label a1T2HumNTitleL = new Label("Avg High Notes");
		Label a1T3HumNTitleL = new Label("Avg High Notes");
		Label a2T1HumNTitleL = new Label("Avg High Notes");
		Label a2T2HumNTitleL = new Label("Avg High Notes");
		Label a2T3HumNTitleL = new Label("Avg High Notes");
		Label a3T1HumNTitleL = new Label("Avg High Notes");
		Label a3T2HumNTitleL = new Label("Avg High Notes");
		Label a3T3HumNTitleL = new Label("Avg High Notes");
		a1T1NumL = new Label(Integer.toString(a1T1Num) + "'s Stats");
		a1T2NumL = new Label(Integer.toString(a1T2Num) + "'s Stats");
		a1T3NumL = new Label(Integer.toString(a1T3Num) + "'s Stats");
		a2T1NumL = new Label(Integer.toString(a2T1Num) + "'s Stats");
		a2T2NumL = new Label(Integer.toString(a2T2Num) + "'s Stats");
		a2T3NumL = new Label(Integer.toString(a2T3Num) + "'s Stats");
		a3T1NumL = new Label(Integer.toString(a3T1Num) + "'s Stats");
		a3T2NumL = new Label(Integer.toString(a3T2Num) + "'s Stats");
		a3T3NumL = new Label(Integer.toString(a3T3Num) + "'s Stats");
		a1T1CyL = new Label(Double.toString(a1T1Cy));
		a1T2CyL = new Label(Double.toString(a1T2Cy));
		a1T3CyL = new Label(Double.toString(a1T3Cy));
		a2T1CyL = new Label(Double.toString(a2T1Cy));
		a2T2CyL = new Label(Double.toString(a2T2Cy));
		a2T3CyL = new Label(Double.toString(a2T3Cy));
		a3T1CyL = new Label(Double.toString(a3T1Cy));
		a3T2CyL = new Label(Double.toString(a3T2Cy));
		a3T3CyL = new Label(Double.toString(a3T3Cy));
		a1T1SpeL = new Label(Double.toString(a1T1Spe));
		a1T2SpeL = new Label(Double.toString(a1T2Spe));
		a1T3SpeL = new Label(Double.toString(a1T3Spe));
		a2T1SpeL = new Label(Double.toString(a2T1Spe));
		a2T2SpeL = new Label(Double.toString(a2T2Spe));
		a2T3SpeL = new Label(Double.toString(a2T3Spe));
		a3T1SpeL = new Label(Double.toString(a3T1Spe));
		a3T2SpeL = new Label(Double.toString(a3T2Spe));
		a3T3SpeL = new Label(Double.toString(a3T3Spe));
		a1T1AmpL = new Label(Double.toString(a1T1Amp));
		a1T2AmpL = new Label(Double.toString(a1T2Amp));
		a1T3AmpL = new Label(Double.toString(a1T3Amp));
		a2T1AmpL = new Label(Double.toString(a2T1Amp));
		a2T2AmpL = new Label(Double.toString(a2T2Amp));
		a2T3AmpL = new Label(Double.toString(a2T3Amp));
		a3T1AmpL = new Label(Double.toString(a3T1Amp));
		a3T2AmpL = new Label(Double.toString(a3T2Amp));
		a3T3AmpL = new Label(Double.toString(a3T3Amp));
		a1T1TrapL = new Label(Double.toString(a1T1Trap));
		a1T2TrapL = new Label(Double.toString(a1T2Trap));
		a1T3TrapL = new Label(Double.toString(a1T3Trap));
		a2T1TrapL = new Label(Double.toString(a2T1Trap));
		a2T2TrapL = new Label(Double.toString(a2T2Trap));
		a2T3TrapL = new Label(Double.toString(a2T3Trap));
		a3T1TrapL = new Label(Double.toString(a3T1Trap));
		a3T2TrapL = new Label(Double.toString(a3T2Trap));
		a3T3TrapL = new Label(Double.toString(a3T3Trap));
		a1T1CliL = new Label(Double.toString(a1T1Cli));
		a1T2CliL = new Label(Double.toString(a1T2Cli));
		a1T3CliL = new Label(Double.toString(a1T3Cli));
		a2T1CliL = new Label(Double.toString(a2T1Cli));
		a2T2CliL = new Label(Double.toString(a2T2Cli));
		a2T3CliL = new Label(Double.toString(a2T3Cli));
		a3T1CliL = new Label(Double.toString(a3T1Cli));
		a3T2CliL = new Label(Double.toString(a3T2Cli));
		a3T3CliL = new Label(Double.toString(a3T3Cli));
		a1T1HumNL = new Label(Double.toString(a1T1HumN));
		a1T2HumNL = new Label(Double.toString(a1T2HumN));
		a1T3HumNL = new Label(Double.toString(a1T3HumN));
		a2T1HumNL = new Label(Double.toString(a2T1HumN));
		a2T2HumNL = new Label(Double.toString(a2T2HumN));
		a2T3HumNL = new Label(Double.toString(a2T3HumN));
		a3T1HumNL = new Label(Double.toString(a3T1HumN));
		a3T2HumNL = new Label(Double.toString(a3T2HumN));
		a3T3HumNL = new Label(Double.toString(a3T3HumN));
		a1T1TimesScoL = new Label(Double.toString(a1T1TimesSco));
		a1T2TimesScoL = new Label(Double.toString(a1T2TimesSco));
		a1T3TimesScoL = new Label(Double.toString(a1T3TimesSco));
		a2T1TimesScoL = new Label(Double.toString(a2T1TimesSco));
		a2T2TimesScoL = new Label(Double.toString(a2T2TimesSco));
		a2T3TimesScoL = new Label(Double.toString(a2T3TimesSco));
		a3T1TimesScoL = new Label(Double.toString(a3T1TimesSco));
		a3T2TimesScoL = new Label(Double.toString(a3T2TimesSco));
		a3T3TimesScoL = new Label(Double.toString(a3T3TimesSco));
		a1T1TimesAmpL = new Label(Double.toString(a1T1TimesAmp));
		a1T2TimesAmpL = new Label(Double.toString(a1T2TimesAmp));
		a1T3TimesAmpL = new Label(Double.toString(a1T3TimesAmp));
		a2T1TimesAmpL = new Label(Double.toString(a2T1TimesAmp));
		a2T2TimesAmpL = new Label(Double.toString(a2T2TimesAmp));
		a2T3TimesAmpL = new Label(Double.toString(a2T3TimesAmp));
		a3T1TimesAmpL = new Label(Double.toString(a3T1TimesAmp));
		a3T2TimesAmpL = new Label(Double.toString(a3T2TimesAmp));
		a3T3TimesAmpL = new Label(Double.toString(a3T3TimesAmp));
		a1T1CyTitleL.setId("");
		a1T2CyTitleL = new Label("Avg Cycles");
		a1T3CyTitleL = new Label("Avg Cycles");
		a2T1CyTitleL = new Label("Avg Cycles");
		a2T2CyTitleL = new Label("Avg Cycles");
		a2T3CyTitleL = new Label("Avg Cycles");
		a3T1CyTitleL = new Label("Avg Cycles");
		a3T2CyTitleL = new Label("Avg Cycles");
		a3T3CyTitleL = new Label("Avg Cycles");
		a1T1SpeTitleL = new Label("Avg Speaker");
		a1T2SpeTitleL = new Label("Avg Speaker");
		a1T3SpeTitleL = new Label("Avg Speaker");
		a2T1SpeTitleL = new Label("Avg Speaker");
		a2T2SpeTitleL = new Label("Avg Speaker");
		a2T3SpeTitleL = new Label("Avg Speaker");
		a3T1SpeTitleL = new Label("Avg Speaker");
		a3T2SpeTitleL = new Label("Avg Speaker");
		a3T3SpeTitleL = new Label("Avg Speaker");
		a1T1AmpTitleL = new ("Avg Amp");
		a1T2AmpTitleL = new ("Avg Amp");
		a1T3AmpTitleL = new ("Avg Amp");
		a2T1AmpTitleL = new ("Avg Amp");
		a2T2AmpTitleL = new ("Avg Amp");
		a2T3AmpTitleL = new ("Avg Amp");
		a3T1AmpTitleL = new ("Avg Amp");
		a3T2AmpTitleL = new ("Avg Amp");
		a3T3AmpTitleL = new ("Avg Amp");
		a1T1TrapTitleL = new ("Avg Trap");
		a1T2TrapTitleL = new ("Avg Trap");
		a1T3TrapTitleL = new ("Avg Trap");
		a2T1TrapTitleL = new ("Avg Trap");
		a2T2TrapTitleL = new ("Avg Trap");
		a2T3TrapTitleL = new ("Avg Trap");
		a3T1TrapTitleL = new ("Avg Trap");
		a3T2TrapTitleL = new ("Avg Trap");
		a3T3TrapTitleL = new ("Avg Trap");
		a1T1CliTitleL = new ("Avg Climb");
		a1T2CliTitleL = new ("Avg Climb");
		a1T3CliTitleL = new ("Avg Climb");
		a2T1CliTitleL = new ("Avg Climb");
		a2T2CliTitleL = new ("Avg Climb");
		a2T3CliTitleL = new ("Avg Climb");
		a3T1CliTitleL = new ("Avg Climb");
		a3T2CliTitleL = new ("Avg Climb");
		a3T3CliTitleL = new ("Avg Climb");
		a1T1HumNTitleL = new ("Avg High Notes");
		a1T2HumNTitleL = new ("Avg High Notes");
		a1T3HumNTitleL = new ("Avg High Notes");
		a2T1HumNTitleL = new ("Avg High Notes");
		a2T2HumNTitleL = new ("Avg High Notes");
		a2T3HumNTitleL = new ("Avg High Notes");
		a3T1HumNTitleL = new ("Avg High Notes");
		a3T2HumNTitleL = new ("Avg High Notes");
		a3T3HumNTitleL = new ("Avg High Notes");
	}
}
