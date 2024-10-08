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
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class compareAlliancesTab extends GridPane implements EventHandler<ActionEvent>{
	
	private ComboBox<String> allince1T1CB;
	private ComboBox<String> allince1T2CB;
	private ComboBox<String> allince1T3CB;
	private ComboBox<String> allince2T1CB;
	private ComboBox<String> allince2T2CB;
	private ComboBox<String> allince2T3CB;
	private ComboBox<String> allince3T1CB;
	private ComboBox<String> allince3T2CB;
	private ComboBox<String> allince3T3CB;
	private ComboBox<String> alliance1CB;
	private ComboBox<String> alliance2CB;
	private ComboBox<String> alliance3CB;
	private Button submitNonB;
	private List<Integer> listOfTeamNums;
	private TeamList theTL;
	private PlayoffAlliances thePOA;
	private DriveTeamDataList theDTD;
	private DriveTeamCommentsList theDTC;
	private Button submitPlayB;
	private HBox all1HB;
	private HBox all2HB;
	private HBox all3HB;
	private HBox all12HB;
	private HBox all22HB;
	private HBox all32HB;
	
	public compareAlliancesTab(boolean isPlayoffTime, List<Integer> importedListOfTeamNums, TeamList imTL, PlayoffAlliances imPlayoffAlls, DriveTeamDataList imDTD, DriveTeamCommentsList imDTC) {
		listOfTeamNums = importedListOfTeamNums;
		theTL = imTL;
		thePOA = imPlayoffAlls;
		theDTD = imDTD;
		theDTC = imDTC;
		all1HB = new HBox(5);
		all2HB = new HBox(5);
		all3HB = new HBox(5);
		all12HB = new HBox(5);
		all22HB = new HBox(5);
		all32HB = new HBox(5);
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
			submitNonB.setOnAction(this);
			this.add(submitNonB, 1, 7);
		}else {
			Label a1L = new Label("Select the 1st Allince");
			Label a2L = new Label("Select the 2nd Allince");
			Label a3L = new Label("Select the 3rd Allince");
			a1L.setId("smallTitle");
			a2L.setId("smallTitle");
			a3L.setId("smallTitle");
			alliance1CB = new ComboBox<String>();
			alliance2CB = new ComboBox<String>();
			alliance3CB = new ComboBox<String>();
			int numOfAlls = 0;
			if(thePOA.getAlliance1() != null) {
				System.out.println("BoopComAll0");
				numOfAlls++;
			}
			if(thePOA.getAlliance2() != null) {
				System.out.println("BoopComAll1");
				numOfAlls++;
			}
			if(thePOA.getAlliance3() != null) {
				System.out.println("BoopComAll2");
				numOfAlls++;
			}
			if(thePOA.getAlliance4() != null) {
				System.out.println("BoopComAll3");
				numOfAlls++;
			}
			if(thePOA.getAlliance5() != null) {
				System.out.println("BoopComAll4");
				numOfAlls++;
			}
			if(thePOA.getAlliance6() != null) {
				System.out.println("BoopComAll5");
				numOfAlls++;
			}
			if(thePOA.getAlliance7() != null) {
				System.out.println("BoopComAll6");
				numOfAlls++;
			}
			if(thePOA.getAlliance8() != null) {
				System.out.println("BoopComAll7");
				numOfAlls++;
			}
			for(int i = 0; i < numOfAlls; i++) {
				alliance1CB.getItems().add(Integer.toString(i + 1));
				alliance2CB.getItems().add(Integer.toString(i + 1));
				alliance3CB.getItems().add(Integer.toString(i + 1));
			}
			BorderPane a1  = new BorderPane();
			BorderPane a2  = new BorderPane();
			BorderPane a3  = new BorderPane();
			a1.setTop(a1L);
			a2.setTop(a2L);
			a3.setTop(a3L);
			a1.setCenter(alliance1CB);
			a2.setCenter(alliance2CB);
			a3.setCenter(alliance3CB);
			a1.setId("comAllselPlayBP1");
			a2.setId("comAllselPlayBP2");
			a3.setId("comAllselPlayBP3");
			this.add(new Label("    "), 0, 0);
			this.add(new Label("    "), 2, 0);
			this.add(new Label("    "), 4, 0);
			this.add(new Label("    "), 0, 2);
			this.add(a1, 1, 1);
			this.add(a2, 3, 1);
			this.add(a3, 5, 1);
			submitPlayB = new Button("Submit");
			submitPlayB.setOnAction(this);
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
	public void addCompare2Alls(Team a1T1, Team a1T2, Team a1T3, Team a2T1, Team a2T2, Team a2T3) {
		int a1T1Num = a1T1.getTeamNum();
		int a1T2Num = a1T2.getTeamNum();
		int a1T3Num = a1T3.getTeamNum();
		int a2T1Num = a2T1.getTeamNum();
		int a2T2Num = a2T2.getTeamNum();
		int a2T3Num = a2T3.getTeamNum();
		double a1T1Cy = a1T1.getAvgCycles();
		double a1T2Cy = a1T2.getAvgCycles();
		double a1T3Cy = a1T3.getAvgCycles();
		double a2T1Cy = a2T1.getAvgCycles();
		double a2T2Cy = a2T2.getAvgCycles();
		double a2T3Cy = a2T3.getAvgCycles();
		double a1T1Spe = a1T1.getAvgSpe();
		double a1T2Spe = a1T2.getAvgSpe();
		double a1T3Spe = a1T3.getAvgSpe();
		double a2T1Spe = a2T1.getAvgSpe();
		double a2T2Spe = a2T2.getAvgSpe();
		double a2T3Spe = a2T3.getAvgSpe();
		double a1T1Amp = a1T1.getAvgAmp();
		double a1T2Amp = a1T2.getAvgAmp();
		double a1T3Amp = a1T3.getAvgAmp();
		double a2T1Amp = a2T1.getAvgAmp();
		double a2T2Amp = a2T2.getAvgAmp();
		double a2T3Amp = a2T3.getAvgAmp();
		double a1T1Trap = a1T1.getAvgTrap();
		double a1T2Trap = a1T2.getAvgTrap();
		double a1T3Trap = a1T3.getAvgTrap();
		double a2T1Trap = a2T1.getAvgTrap();
		double a2T2Trap = a2T2.getAvgTrap();
		double a2T3Trap = a2T3.getAvgTrap();
		double a1T1Cli = a1T1.getAvgClimb();
		double a1T2Cli = a1T2.getAvgClimb();
		double a1T3Cli = a1T3.getAvgClimb();
		double a2T1Cli = a2T1.getAvgClimb();
		double a2T2Cli = a2T2.getAvgClimb();
		double a2T3Cli = a2T3.getAvgClimb();
		double a1T1HumN = a1T1.getHumAmpNotes();
		double a1T2HumN = a1T2.getHumAmpNotes();
		double a1T3HumN = a1T3.getHumAmpNotes();
		double a2T1HumN = a2T1.getHumAmpNotes();
		double a2T2HumN = a2T2.getHumAmpNotes();
		double a2T3HumN = a2T3.getHumAmpNotes();
		int a1T1TimesSco = a1T1.getTimesHumSco();
		int a1T2TimesSco = a1T2.getTimesHumSco();
		int a1T3TimesSco = a1T3.getTimesHumSco();
		int a2T1TimesSco = a2T1.getTimesHumSco();
		int a2T2TimesSco = a2T2.getTimesHumSco();
		int a2T3TimesSco = a2T3.getTimesHumSco();
		int a1T1TimesAmp = a1T1.getTimesHumAmp();
		int a1T2TimesAmp = a1T2.getTimesHumAmp();
		int a1T3TimesAmp = a1T3.getTimesHumAmp();
		int a2T1TimesAmp = a2T1.getTimesHumAmp();
		int a2T2TimesAmp = a2T2.getTimesHumAmp();
		int a2T3TimesAmp = a2T3.getTimesHumAmp();
		Label a1T1NumL = new Label(Integer.toString(a1T1Num) + "'s Stats");
		Label a1T2NumL = new Label(Integer.toString(a1T2Num) + "'s Stats");
		Label a1T3NumL = new Label(Integer.toString(a1T3Num) + "'s Stats");
		Label a2T1NumL = new Label(Integer.toString(a2T1Num) + "'s Stats");
		Label a2T2NumL = new Label(Integer.toString(a2T2Num) + "'s Stats");
		Label a2T3NumL = new Label(Integer.toString(a2T3Num) + "'s Stats");
		BorderPane a1T1NumBP = new BorderPane();
		BorderPane a1T2NumBP = new BorderPane();
		BorderPane a1T3NumBP = new BorderPane();
		BorderPane a2T1NumBP = new BorderPane();
		BorderPane a2T2NumBP = new BorderPane();
		BorderPane a2T3NumBP = new BorderPane();
		a1T1NumBP.setCenter(a1T1NumL);
		a1T2NumBP.setCenter(a1T2NumL);
		a1T3NumBP.setCenter(a1T3NumL);
		a2T1NumBP.setCenter(a2T1NumL);
		a2T2NumBP.setCenter(a2T2NumL);
		a2T3NumBP.setCenter(a2T3NumL);
		a1T1NumBP.setId("comAllstatBP6");
		a1T2NumBP.setId("comAllstatBP6");
		a1T3NumBP.setId("comAllstatBP6");
		a2T1NumBP.setId("comAllstatBP6");
		a2T2NumBP.setId("comAllstatBP6");
		a2T3NumBP.setId("comAllstatBP6");
		Label a1T1CyL = new Label(Double.toString(a1T1Cy));
		Label a1T2CyL = new Label(Double.toString(a1T2Cy));
		Label a1T3CyL = new Label(Double.toString(a1T3Cy));
		Label a2T1CyL = new Label(Double.toString(a2T1Cy));
		Label a2T2CyL = new Label(Double.toString(a2T2Cy));
		Label a2T3CyL = new Label(Double.toString(a2T3Cy));
		Label a1T1SpeL = new Label(Double.toString(a1T1Spe));
		Label a1T2SpeL = new Label(Double.toString(a1T2Spe));
		Label a1T3SpeL = new Label(Double.toString(a1T3Spe));
		Label a2T1SpeL = new Label(Double.toString(a2T1Spe));
		Label a2T2SpeL = new Label(Double.toString(a2T2Spe));
		Label a2T3SpeL = new Label(Double.toString(a2T3Spe));
		Label a1T1AmpL = new Label(Double.toString(a1T1Amp));
		Label a1T2AmpL = new Label(Double.toString(a1T2Amp));
		Label a1T3AmpL = new Label(Double.toString(a1T3Amp));
		Label a2T1AmpL = new Label(Double.toString(a2T1Amp));
		Label a2T2AmpL = new Label(Double.toString(a2T2Amp));
		Label a2T3AmpL = new Label(Double.toString(a2T3Amp));
		Label a1T1TrapL = new Label(Double.toString(a1T1Trap));
		Label a1T2TrapL = new Label(Double.toString(a1T2Trap));
		Label a1T3TrapL = new Label(Double.toString(a1T3Trap));
		Label a2T1TrapL = new Label(Double.toString(a2T1Trap));
		Label a2T2TrapL = new Label(Double.toString(a2T2Trap));
		Label a2T3TrapL = new Label(Double.toString(a2T3Trap));
		Label a1T1CliL = new Label(Double.toString(a1T1Cli));
		Label a1T2CliL = new Label(Double.toString(a1T2Cli));
		Label a1T3CliL = new Label(Double.toString(a1T3Cli));
		Label a2T1CliL = new Label(Double.toString(a2T1Cli));
		Label a2T2CliL = new Label(Double.toString(a2T2Cli));
		Label a2T3CliL = new Label(Double.toString(a2T3Cli));
		Label a1T1HumNL = new Label(Double.toString(a1T1HumN));
		Label a1T2HumNL = new Label(Double.toString(a1T2HumN));
		Label a1T3HumNL = new Label(Double.toString(a1T3HumN));
		Label a2T1HumNL = new Label(Double.toString(a2T1HumN));
		Label a2T2HumNL = new Label(Double.toString(a2T2HumN));
		Label a2T3HumNL = new Label(Double.toString(a2T3HumN));
		Label a1T1TimesScoL = new Label(Double.toString(a1T1TimesSco));
		Label a1T2TimesScoL = new Label(Double.toString(a1T2TimesSco));
		Label a1T3TimesScoL = new Label(Double.toString(a1T3TimesSco));
		Label a2T1TimesScoL = new Label(Double.toString(a2T1TimesSco));
		Label a2T2TimesScoL = new Label(Double.toString(a2T2TimesSco));
		Label a2T3TimesScoL = new Label(Double.toString(a2T3TimesSco));
		Label a1T1TimesAmpL = new Label(Double.toString(a1T1TimesAmp));
		Label a1T2TimesAmpL = new Label(Double.toString(a1T2TimesAmp));
		Label a1T3TimesAmpL = new Label(Double.toString(a1T3TimesAmp));
		Label a2T1TimesAmpL = new Label(Double.toString(a2T1TimesAmp));
		Label a2T2TimesAmpL = new Label(Double.toString(a2T2TimesAmp));
		Label a2T3TimesAmpL = new Label(Double.toString(a2T3TimesAmp));
		Label a1T1CyTitleL = new Label("Avg Cycles");
		Label a1T2CyTitleL = new Label("Avg Cycles");
		Label a1T3CyTitleL = new Label("Avg Cycles");
		Label a2T1CyTitleL = new Label("Avg Cycles");
		Label a2T2CyTitleL = new Label("Avg Cycles");
		Label a2T3CyTitleL = new Label("Avg Cycles");
		Label a1T1SpeTitleL = new Label("Avg Speaker");
		Label a1T2SpeTitleL = new Label("Avg Speaker");
		Label a1T3SpeTitleL = new Label("Avg Speaker");
		Label a2T1SpeTitleL = new Label("Avg Speaker");
		Label a2T2SpeTitleL = new Label("Avg Speaker");
		Label a2T3SpeTitleL = new Label("Avg Speaker");
		Label a1T1AmpTitleL = new Label("Avg Amp");
		Label a1T2AmpTitleL = new Label("Avg Amp");
		Label a1T3AmpTitleL = new Label("Avg Amp");
		Label a2T1AmpTitleL = new Label("Avg Amp");
		Label a2T2AmpTitleL = new Label("Avg Amp");
		Label a2T3AmpTitleL = new Label("Avg Amp");
		Label a1T1TrapTitleL = new Label("Avg Trap");
		Label a1T2TrapTitleL = new Label("Avg Trap");
		Label a1T3TrapTitleL = new Label("Avg Trap");
		Label a2T1TrapTitleL = new Label("Avg Trap");
		Label a2T2TrapTitleL = new Label("Avg Trap");
		Label a2T3TrapTitleL = new Label("Avg Trap");
		Label a1T1CliTitleL = new Label("Avg Climb");
		Label a1T2CliTitleL = new Label("Avg Climb");
		Label a1T3CliTitleL = new Label("Avg Climb");
		Label a2T1CliTitleL = new Label("Avg Climb");
		Label a2T2CliTitleL = new Label("Avg Climb");
		Label a2T3CliTitleL = new Label("Avg Climb");
		Label a1T1HumNTitleL = new Label("Avg High Notes");
		Label a1T2HumNTitleL = new Label("Avg High Notes");
		Label a1T3HumNTitleL = new Label("Avg High Notes");
		Label a2T1HumNTitleL = new Label("Avg High Notes");
		Label a2T2HumNTitleL = new Label("Avg High Notes");
		Label a2T3HumNTitleL = new Label("Avg High Notes");
		Label a1T1TimesScoTitleL = new Label("Times Scoure");
		Label a1T2TimesScoTitleL = new Label("Times Scoure");
		Label a1T3TimesScoTitleL = new Label("Times Scoure");
		Label a2T1TimesScoTitleL = new Label("Times Scoure");
		Label a2T2TimesScoTitleL = new Label("Times Scoure");
		Label a2T3TimesScoTitleL = new Label("Times Scoure");
		Label a1T1TimesAmpTitleL = new Label("Times Amp");
		Label a1T2TimesAmpTitleL = new Label("Times Amp");
		Label a1T3TimesAmpTitleL = new Label("Times Amp");
		Label a2T1TimesAmpTitleL = new Label("Times Amp");
		Label a2T2TimesAmpTitleL = new Label("Times Amp");
		Label a2T3TimesAmpTitleL = new Label("Times Amp");
		a1T1NumL.setId("smallTitle");
		a1T2NumL.setId("smallTitle");
		a1T3NumL.setId("smallTitle");
		a2T1NumL.setId("smallTitle");
		a2T2NumL.setId("smallTitle");
		a2T3NumL.setId("smallTitle");
		a1T1CyL.setId("avgStat");
		a1T2CyL.setId("avgStat");
		a1T3CyL.setId("avgStat");
		a2T1CyL.setId("avgStat");
		a2T2CyL.setId("avgStat");
		a2T3CyL.setId("avgStat");
		a1T1SpeL.setId("avgStat");
		a1T2SpeL.setId("avgStat");
		a1T3SpeL.setId("avgStat");
		a2T1SpeL.setId("avgStat");
		a2T2SpeL.setId("avgStat");
		a2T3SpeL.setId("avgStat");
		a1T1AmpL.setId("avgStat");
		a1T2AmpL.setId("avgStat");
		a1T3AmpL.setId("avgStat");
		a2T1AmpL.setId("avgStat");
		a2T2AmpL.setId("avgStat");
		a2T3AmpL.setId("avgStat");
		a1T1TrapL.setId("avgStat");
		a1T2TrapL.setId("avgStat");
		a1T3TrapL.setId("avgStat");
		a2T1TrapL.setId("avgStat");
		a2T2TrapL.setId("avgStat");
		a2T3TrapL.setId("avgStat");
		a1T1CliL.setId("avgStat");
		a1T2CliL.setId("avgStat");
		a1T3CliL.setId("avgStat");
		a2T1CliL.setId("avgStat");
		a2T2CliL.setId("avgStat");
		a2T3CliL.setId("avgStat");
		a1T1HumNL.setId("avgStat");
		a1T2HumNL.setId("avgStat");
		a1T3HumNL.setId("avgStat");
		a2T1HumNL.setId("avgStat");
		a2T2HumNL.setId("avgStat");
		a2T3HumNL.setId("avgStat");
		a1T1TimesScoL.setId("avgStat");
		a1T2TimesScoL.setId("avgStat");
		a1T3TimesScoL.setId("avgStat");
		a2T1TimesScoL.setId("avgStat");
		a2T2TimesScoL.setId("avgStat");
		a2T3TimesScoL.setId("avgStat");
		a1T1TimesAmpL.setId("avgStat");
		a1T2TimesAmpL.setId("avgStat");
		a1T3TimesAmpL.setId("avgStat");
		a2T1TimesAmpL.setId("avgStat");
		a2T2TimesAmpL.setId("avgStat");
		a2T3TimesAmpL.setId("avgStat");
		a1T1CyTitleL.setId("smallTitle");
		a1T2CyTitleL.setId("smallTitle");
		a1T3CyTitleL.setId("smallTitle");
		a2T1CyTitleL.setId("smallTitle");
		a2T2CyTitleL.setId("smallTitle");
		a2T3CyTitleL.setId("smallTitle");
		a1T1SpeTitleL.setId("smallTitle");
		a1T2SpeTitleL.setId("smallTitle");
		a1T3SpeTitleL.setId("smallTitle");
		a2T1SpeTitleL.setId("smallTitle");
		a2T2SpeTitleL.setId("smallTitle");
		a2T3SpeTitleL.setId("smallTitle");
		a1T1AmpTitleL.setId("smallTitle");
		a1T2AmpTitleL.setId("smallTitle");
		a1T3AmpTitleL.setId("smallTitle");
		a2T1AmpTitleL.setId("smallTitle");
		a2T2AmpTitleL.setId("smallTitle");
		a2T3AmpTitleL.setId("smallTitle");
		a1T1TrapTitleL.setId("smallTitle");
		a1T2TrapTitleL.setId("smallTitle");
		a1T3TrapTitleL.setId("smallTitle");
		a2T1TrapTitleL.setId("smallTitle");
		a2T2TrapTitleL.setId("smallTitle");
		a2T3TrapTitleL.setId("smallTitle");
		a1T1CliTitleL.setId("smallTitle");
		a1T2CliTitleL.setId("smallTitle");
		a1T3CliTitleL.setId("smallTitle");
		a2T1CliTitleL.setId("smallTitle");
		a2T2CliTitleL.setId("smallTitle");
		a2T3CliTitleL.setId("smallTitle");
		a1T1HumNTitleL.setId("smallTitle");
		a1T2HumNTitleL.setId("smallTitle");
		a1T3HumNTitleL.setId("smallTitle");
		a2T1HumNTitleL.setId("smallTitle");
		a2T2HumNTitleL.setId("smallTitle");
		a2T3HumNTitleL.setId("smallTitle");
		a1T1TimesScoTitleL.setId("smallTitle");
		a1T2TimesScoTitleL.setId("smallTitle");
		a1T3TimesScoTitleL.setId("smallTitle");
		a2T1TimesScoTitleL.setId("smallTitle");
		a2T2TimesScoTitleL.setId("smallTitle");
		a2T3TimesScoTitleL.setId("smallTitle");
		a1T1TimesAmpTitleL.setId("smallTitle");
		a1T2TimesAmpTitleL.setId("smallTitle");
		a1T3TimesAmpTitleL.setId("smallTitle");
		a2T1TimesAmpTitleL.setId("smallTitle");
		a2T2TimesAmpTitleL.setId("smallTitle");
		a2T3TimesAmpTitleL.setId("smallTitle");
		BorderPane a1T1CyBP = new BorderPane();
		BorderPane a1T1SpeBP = new BorderPane();
		BorderPane a1T1AmpBP = new BorderPane();
		BorderPane a1T1TrapBP = new BorderPane();
		BorderPane a1T1CliBP = new BorderPane();
		BorderPane a1T1HighNBP = new BorderPane();
		BorderPane a1T1TimesScoBP = new BorderPane();
		BorderPane a1T1TimesAmpBP = new BorderPane();
		a1T1CyBP.setTop(a1T1CyTitleL);
		a1T1SpeBP.setTop(a1T1SpeTitleL);
		a1T1AmpBP.setTop(a1T1AmpTitleL);
		a1T1TrapBP.setTop(a1T1TrapTitleL);
		a1T1CliBP.setTop(a1T1CliTitleL);
		a1T1HighNBP.setTop(a1T1HumNTitleL);
		a1T1TimesScoBP.setTop(a1T1TimesScoTitleL);
		a1T1TimesAmpBP.setTop(a1T1TimesAmpTitleL);
		a1T1CyBP.setCenter(a1T1CyL);
		a1T1SpeBP.setCenter(a1T1SpeL);
		a1T1AmpBP.setCenter(a1T1AmpL);
		a1T1TrapBP.setCenter(a1T1TrapL);
		a1T1CliBP.setCenter(a1T1CliL);
		a1T1HighNBP.setCenter(a1T1HumNL);
		a1T1TimesScoBP.setCenter(a1T1TimesScoL);
		a1T1TimesAmpBP.setCenter(a1T1TimesAmpL);
		a1T1CyBP.setId("comAllstatBP1");
		a1T1SpeBP.setId("comAllstatBP2");
		a1T1AmpBP.setId("comAllstatBP3");
		a1T1TrapBP.setId("comAllstatBP4");
		a1T1CliBP.setId("comAllstatBP2");
		a1T1HighNBP.setId("comAllstatBP3");
		a1T1TimesScoBP.setId("comAllstatBP4");
		a1T1TimesAmpBP.setId("comAllstatBP5");
		BorderPane a1T2CyBP = new BorderPane();
		BorderPane a1T2SpeBP = new BorderPane();
		BorderPane a1T2AmpBP = new BorderPane();
		BorderPane a1T2TrapBP = new BorderPane();
		BorderPane a1T2CliBP = new BorderPane();
		BorderPane a1T2HighNBP = new BorderPane();
		BorderPane a1T2TimesScoBP = new BorderPane();
		BorderPane a1T2TimesAmpBP = new BorderPane();
		a1T2CyBP.setTop(a1T2CyTitleL);
		a1T2SpeBP.setTop(a1T2SpeTitleL);
		a1T2AmpBP.setTop(a1T2AmpTitleL);
		a1T2TrapBP.setTop(a1T2TrapTitleL);
		a1T2CliBP.setTop(a1T2CliTitleL);
		a1T2HighNBP.setTop(a1T2HumNTitleL);
		a1T2TimesScoBP.setTop(a1T2TimesScoTitleL);
		a1T2TimesAmpBP.setTop(a1T2TimesAmpTitleL);
		a1T2CyBP.setCenter(a1T2CyL);
		a1T2SpeBP.setCenter(a1T2SpeL);
		a1T2AmpBP.setCenter(a1T2AmpL);
		a1T2TrapBP.setCenter(a1T2TrapL);
		a1T2CliBP.setCenter(a1T2CliL);
		a1T2HighNBP.setCenter(a1T2HumNL);
		a1T2TimesScoBP.setCenter(a1T2TimesScoL);
		a1T2TimesAmpBP.setCenter(a1T2TimesAmpL);
		a1T2CyBP.setId("comAllstatBP3");
		a1T2SpeBP.setId("comAllstatBP4");
		a1T2AmpBP.setId("comAllstatBP5");
		a1T2TrapBP.setId("comAllstatBP6");
		a1T2CliBP.setId("comAllstatBP4");
		a1T2HighNBP.setId("comAllstatBP5");
		a1T2TimesScoBP.setId("comAllstatBP6");
		a1T2TimesAmpBP.setId("comAllstatBP7");
		BorderPane a1T3CyBP = new BorderPane();
		BorderPane a1T3SpeBP = new BorderPane();
		BorderPane a1T3AmpBP = new BorderPane();
		BorderPane a1T3TrapBP = new BorderPane();
		BorderPane a1T3CliBP = new BorderPane();
		BorderPane a1T3HighNBP = new BorderPane();
		BorderPane a1T3TimesScoBP = new BorderPane();
		BorderPane a1T3TimesAmpBP = new BorderPane();
		a1T3CyBP.setTop(a1T3CyTitleL);
		a1T3SpeBP.setTop(a1T3SpeTitleL);
		a1T3AmpBP.setTop(a1T3AmpTitleL);
		a1T3TrapBP.setTop(a1T3TrapTitleL);
		a1T3CliBP.setTop(a1T3CliTitleL);
		a1T3HighNBP.setTop(a1T3HumNTitleL);
		a1T3TimesScoBP.setTop(a1T3TimesScoTitleL);
		a1T3TimesAmpBP.setTop(a1T3TimesAmpTitleL);
		a1T3CyBP.setCenter(a1T3CyL);
		a1T3SpeBP.setCenter(a1T3SpeL);
		a1T3AmpBP.setCenter(a1T3AmpL);
		a1T3TrapBP.setCenter(a1T3TrapL);
		a1T3CliBP.setCenter(a1T3CliL);
		a1T3HighNBP.setCenter(a1T3HumNL);
		a1T3TimesScoBP.setCenter(a1T3TimesScoL);
		a1T3TimesAmpBP.setCenter(a1T3TimesAmpL);
		a1T3CyBP.setId("comAllstatBP5");
		a1T3SpeBP.setId("comAllstatBP6");
		a1T3AmpBP.setId("comAllstatBP7");
		a1T3TrapBP.setId("comAllstatBP8");
		a1T3CliBP.setId("comAllstatBP7");
		a1T3HighNBP.setId("comAllstatBP8");
		a1T3TimesScoBP.setId("comAllstatBP9");
		a1T3TimesAmpBP.setId("comAllstatBP8");
		BorderPane a2T1CyBP = new BorderPane();
		BorderPane a2T1SpeBP = new BorderPane();
		BorderPane a2T1AmpBP = new BorderPane();
		BorderPane a2T1TrapBP = new BorderPane();
		BorderPane a2T1CliBP = new BorderPane();
		BorderPane a2T1HighNBP = new BorderPane();
		BorderPane a2T1TimesScoBP = new BorderPane();
		BorderPane a2T1TimesAmpBP = new BorderPane();
		a2T1CyBP.setTop(a2T1CyTitleL);
		a2T1SpeBP.setTop(a2T1SpeTitleL);
		a2T1AmpBP.setTop(a2T1AmpTitleL);
		a2T1TrapBP.setTop(a2T1TrapTitleL);
		a2T1CliBP.setTop(a2T1CliTitleL);
		a2T1HighNBP.setTop(a2T1HumNTitleL);
		a2T1TimesScoBP.setTop(a2T1TimesScoTitleL);
		a2T1TimesAmpBP.setTop(a2T1TimesAmpTitleL);
		a2T1CyBP.setCenter(a2T1CyL);
		a2T1SpeBP.setCenter(a2T1SpeL);
		a2T1AmpBP.setCenter(a2T1AmpL);
		a2T1TrapBP.setCenter(a2T1TrapL);
		a2T1CliBP.setCenter(a2T1CliL);
		a2T1HighNBP.setCenter(a2T1HumNL);
		a2T1TimesScoBP.setCenter(a2T1TimesScoL);
		a2T1TimesAmpBP.setCenter(a2T1TimesAmpL);
		a2T1CyBP.setId("comAllstatBP1");
		a2T1SpeBP.setId("comAllstatBP2");
		a2T1AmpBP.setId("comAllstatBP3");
		a2T1TrapBP.setId("comAllstatBP4");
		a2T1CliBP.setId("comAllstatBP2");
		a2T1HighNBP.setId("comAllstatBP3");
		a2T1TimesScoBP.setId("comAllstatBP4");
		a2T1TimesAmpBP.setId("comAllstatBP5");
		BorderPane a2T2CyBP = new BorderPane();
		BorderPane a2T2SpeBP = new BorderPane();
		BorderPane a2T2AmpBP = new BorderPane();
		BorderPane a2T2TrapBP = new BorderPane();
		BorderPane a2T2CliBP = new BorderPane();
		BorderPane a2T2HighNBP = new BorderPane();
		BorderPane a2T2TimesScoBP = new BorderPane();
		BorderPane a2T2TimesAmpBP = new BorderPane();
		a2T2CyBP.setTop(a2T2CyTitleL);
		a2T2SpeBP.setTop(a2T2SpeTitleL);
		a2T2AmpBP.setTop(a2T2AmpTitleL);
		a2T2TrapBP.setTop(a2T2TrapTitleL);
		a2T2CliBP.setTop(a2T2CliTitleL);
		a2T2HighNBP.setTop(a2T2HumNTitleL);
		a2T2TimesScoBP.setTop(a2T2TimesScoTitleL);
		a2T2TimesAmpBP.setTop(a2T2TimesAmpTitleL);
		a2T2CyBP.setCenter(a2T2CyL);
		a2T2SpeBP.setCenter(a2T2SpeL);
		a2T2AmpBP.setCenter(a2T2AmpL);
		a2T2TrapBP.setCenter(a2T2TrapL);
		a2T2CliBP.setCenter(a2T2CliL);
		a2T2HighNBP.setCenter(a2T2HumNL);
		a2T2TimesScoBP.setCenter(a2T2TimesScoL);
		a2T2TimesAmpBP.setCenter(a2T2TimesAmpL);
		a2T2CyBP.setId("comAllstatBP3");
		a2T2SpeBP.setId("comAllstatBP4");
		a2T2AmpBP.setId("comAllstatBP5");
		a2T2TrapBP.setId("comAllstatBP6");
		a2T2CliBP.setId("comAllstatBP4");
		a2T2HighNBP.setId("comAllstatBP5");
		a2T2TimesScoBP.setId("comAllstatBP6");
		a2T2TimesAmpBP.setId("comAllstatBP7");
		BorderPane a2T3CyBP = new BorderPane();
		BorderPane a2T3SpeBP = new BorderPane();
		BorderPane a2T3AmpBP = new BorderPane();
		BorderPane a2T3TrapBP = new BorderPane();
		BorderPane a2T3CliBP = new BorderPane();
		BorderPane a2T3HighNBP = new BorderPane();
		BorderPane a2T3TimesScoBP = new BorderPane();
		BorderPane a2T3TimesAmpBP = new BorderPane();
		a2T3CyBP.setTop(a2T3CyTitleL);
		a2T3SpeBP.setTop(a2T3SpeTitleL);
		a2T3AmpBP.setTop(a2T3AmpTitleL);
		a2T3TrapBP.setTop(a2T3TrapTitleL);
		a2T3CliBP.setTop(a2T3CliTitleL);
		a2T3HighNBP.setTop(a2T3HumNTitleL);
		a2T3TimesScoBP.setTop(a2T3TimesScoTitleL);
		a2T3TimesAmpBP.setTop(a2T3TimesAmpTitleL);
		a2T3CyBP.setCenter(a2T3CyL);
		a2T3SpeBP.setCenter(a2T3SpeL);
		a2T3AmpBP.setCenter(a2T3AmpL);
		a2T3TrapBP.setCenter(a2T3TrapL);
		a2T3CliBP.setCenter(a2T3CliL);
		a2T3HighNBP.setCenter(a2T3HumNL);
		a2T3TimesScoBP.setCenter(a2T3TimesScoL);
		a2T3TimesAmpBP.setCenter(a2T3TimesAmpL);
		a2T3CyBP.setId("comAllstatBP5");
		a2T3SpeBP.setId("comAllstatBP6");
		a2T3AmpBP.setId("comAllstatBP7");
		a2T3TrapBP.setId("comAllstatBP8");
		a2T3CliBP.setId("comAllstatBP7");
		a2T3HighNBP.setId("comAllstatBP8");
		a2T3TimesScoBP.setId("comAllstatBP9");
		a2T3TimesAmpBP.setId("comAllstatBP8");
		Label a1TotalCyL = new Label(Double.toString(a1T1Cy + a1T2Cy + a1T3Cy));
		Label a1TotalSpeL = new Label(Double.toString(a1T1Spe + a1T2Spe + a1T3Spe));
		Label a1TotalAmpL = new Label(Double.toString(a1T1Amp + a1T2Amp + a1T3Amp));
		Label a1TotalTrapL = new Label(Double.toString(a1T1Trap + a1T2Trap + a1T3Trap));
		Label a1TotalCliL = new Label(Double.toString(a1T1Cli + a1T2Cli + a1T3Cli));
		Label a1TotalHighNL = new Label(Double.toString(a1T1HumN + a1T2HumN + a1T3HumN));
		Label a1TotalTimesScoL = new Label(Double.toString(a1T1TimesSco + a1T2TimesSco + a1T3TimesSco));
		Label a1TotalTimesAmpL = new Label(Double.toString(a1T1TimesAmp + a1T2TimesAmp + a1T3TimesAmp));
		Label a2TotalCyL = new Label(Double.toString(a1T1Cy + a1T2Cy + a1T3Cy));
		Label a2TotalSpeL = new Label(Double.toString(a1T1Spe + a1T2Spe + a1T3Spe));
		Label a2TotalAmpL = new Label(Double.toString(a1T1Amp + a1T2Amp + a1T3Amp));
		Label a2TotalTrapL = new Label(Double.toString(a1T1Trap + a1T2Trap + a1T3Trap));
		Label a2TotalCliL = new Label(Double.toString(a1T1Cli + a1T2Cli + a1T3Cli));
		Label a2TotalHighNL = new Label(Double.toString(a1T1HumN + a1T2HumN + a1T3HumN));
		Label a2TotalTimesScoL = new Label(Double.toString(a1T1TimesSco + a1T2TimesSco + a1T3TimesSco));
		Label a2TotalTimesAmpL = new Label(Double.toString(a1T1TimesAmp + a1T2TimesAmp + a1T3TimesAmp));
		Label a1CyTitleL = new Label("Avg Cycles");
		Label a1SpeTitleL = new Label("Avg Speaker");
		Label a1AmpTitleL = new Label("Avg Amp");
		Label a1TrapTitleL = new Label("Avg Trap");
		Label a1CliTitleL = new Label("Avg Climb");
		Label a1HighNTitleL = new Label("High Notes");
		Label a1TimesScoTitleL = new Label("Times Scoure");
		Label a1TimesAmpTitleL = new Label("Times Amp");
		Label a2CyTitleL = new Label("Avg Cycles");
		Label a2SpeTitleL = new Label("Avg Speaker");
		Label a2AmpTitleL = new Label("Avg Amp");
		Label a2TrapTitleL = new Label("Avg Trap");
		Label a2CliTitleL = new Label("Avg Climb");
		Label a2HighNTitleL = new Label("High Notes");
		Label a2TimesScoTitleL = new Label("Times Scoure");
		Label a2TimesAmpTitleL = new Label("Times Amp");
		Label a1Title = new Label("Alliance 1");
		Label a2Title = new Label("Alliance 2");
		Label a3Title = new Label("Alliance 3");
		a1Title.setId("smallTitle");
		a2Title.setId("smallTitle");
		a3Title.setId("smallTitle");
		BorderPane a1TitleBP = new BorderPane();
		BorderPane a2TitleBP = new BorderPane();
		BorderPane a3TitleBP = new BorderPane();
		a1TitleBP.setCenter(a1Title);
		a2TitleBP.setCenter(a2Title);
		a3TitleBP.setCenter(a3Title);
		a1TitleBP.setId("comAllstatBP5");
		a2TitleBP.setId("comAllstatBP5");
		a3TitleBP.setId("comAllstatBP5");
		a1TotalCyL.setId("avgStat");
		a1TotalSpeL.setId("avgStat");
		a1TotalAmpL.setId("avgStat");
		a1TotalTrapL.setId("avgStat");
		a1TotalCliL.setId("avgStat");
		a1TotalHighNL.setId("avgStat");
		a1TotalTimesScoL.setId("avgStat");
		a1TotalTimesAmpL.setId("avgStat");
		a2TotalCyL.setId("avgStat");
		a2TotalSpeL.setId("avgStat");
		a2TotalAmpL.setId("avgStat");
		a2TotalTrapL.setId("avgStat");
		a2TotalCliL.setId("avgStat");
		a2TotalHighNL.setId("avgStat");
		a2TotalTimesScoL.setId("avgStat");
		a2TotalTimesAmpL.setId("avgStat");
		a1CyTitleL.setId("smallTitle");
		a1SpeTitleL.setId("smallTitle");
		a1AmpTitleL.setId("smallTitle");
		a1TrapTitleL.setId("smallTitle");
		a1CliTitleL.setId("smallTitle");
		a1HighNTitleL.setId("smallTitle");
		a1TimesScoTitleL.setId("smallTitle");
		a1TimesAmpTitleL.setId("smallTitle");
		a2CyTitleL.setId("smallTitle");
		a2SpeTitleL.setId("smallTitle");
		a2AmpTitleL.setId("smallTitle");
		a2TrapTitleL.setId("smallTitle");
		a2CliTitleL.setId("smallTitle");
		a2HighNTitleL.setId("smallTitle");
		a2TimesScoTitleL.setId("smallTitle");
		a2TimesAmpTitleL.setId("smallTitle");
		BorderPane a1CyBP = new BorderPane();
		BorderPane a1SpeBP = new BorderPane();
		BorderPane a1AmpBP = new BorderPane();
		BorderPane a1TrapBP = new BorderPane();
		BorderPane a1CliBP = new BorderPane();
		BorderPane a1HighNBP = new BorderPane();
		BorderPane a1TimesScoBP = new BorderPane();
		BorderPane a1TimesAmpBP = new BorderPane();
		BorderPane a2CyBP = new BorderPane();
		BorderPane a2SpeBP = new BorderPane();
		BorderPane a2AmpBP = new BorderPane();
		BorderPane a2TrapBP = new BorderPane();
		BorderPane a2CliBP = new BorderPane();
		BorderPane a2HighNBP = new BorderPane();
		BorderPane a2TimesScoBP = new BorderPane();
		BorderPane a2TimesAmpBP = new BorderPane();
		a1CyBP.setTop(a1CyTitleL);
		a1SpeBP.setTop(a1SpeTitleL);
		a1AmpBP.setTop(a1AmpTitleL);
		a1TrapBP.setTop(a1TrapTitleL);
		a1CliBP.setTop(a1CliTitleL);
		a1HighNBP.setTop(a1HighNTitleL);
		a1TimesScoBP.setTop(a1TimesScoTitleL);
		a1TimesAmpBP.setTop(a1TimesAmpTitleL);
		a1CyBP.setCenter(a1TotalCyL);
		a1SpeBP.setCenter(a1TotalSpeL);
		a1AmpBP.setCenter(a1TotalAmpL);
		a1TrapBP.setCenter(a1TotalTrapL);
		a1CliBP.setCenter(a1TotalCliL);
		a1HighNBP.setCenter(a1TotalHighNL);
		a1TimesScoBP.setCenter(a1TotalTimesScoL);
		a1TimesAmpBP.setCenter(a1TotalTimesAmpL);
		a2CyBP.setTop(a2CyTitleL);
		a2SpeBP.setTop(a2SpeTitleL);
		a2AmpBP.setTop(a2AmpTitleL);
		a2TrapBP.setTop(a2TrapTitleL);
		a2CliBP.setTop(a2CliTitleL);
		a2HighNBP.setTop(a2HighNTitleL);
		a2TimesScoBP.setTop(a2TimesScoTitleL);
		a2TimesAmpBP.setTop(a2TimesAmpTitleL);
		a2CyBP.setCenter(a2TotalCyL);
		a2SpeBP.setCenter(a2TotalSpeL);
		a2AmpBP.setCenter(a2TotalAmpL);
		a2TrapBP.setCenter(a2TotalTrapL);
		a2CliBP.setCenter(a2TotalCliL);
		a2HighNBP.setCenter(a2TotalHighNL);
		a2TimesScoBP.setCenter(a2TotalTimesScoL);
		a2TimesAmpBP.setCenter(a2TotalTimesAmpL);
		a1CyBP.setId("comAllstatBP1");
		a1SpeBP.setId("comAllstatBP2");
		a1AmpBP.setId("comAllstatBP3");
		a1TrapBP.setId("comAllstatBP4");
		a1CliBP.setId("comAllstatBP2");
		a1HighNBP.setId("comAllstatBP3");
		a1TimesScoBP.setId("comAllstatBP4");
		a1TimesAmpBP.setId("comAllstatBP5");
		a2CyBP.setId("comAllstatBP1");
		a2SpeBP.setId("comAllstatBP2");
		a2AmpBP.setId("comAllstatBP3");
		a2TrapBP.setId("comAllstatBP4");
		a2CliBP.setId("comAllstatBP2");
		a2HighNBP.setId("comAllstatBP3");
		a2TimesScoBP.setId("comAllstatBP4");
		a2TimesAmpBP.setId("comAllstatBP5");
		VBox a1CyVB = new VBox(5);
		VBox a1OtherVB = new VBox(5);
		VBox a2CyVB = new VBox(5);
		VBox a2OtherVB = new VBox(5);
		a1CyVB.getChildren().addAll(a1TitleBP, a1CyBP, a1SpeBP, a1AmpBP, a1TrapBP);
		a1OtherVB.getChildren().addAll(a1CliBP, a1HighNBP, a1TimesScoBP, a1TimesAmpBP);
		a2CyVB.getChildren().addAll(a2TitleBP, a2CyBP, a2SpeBP, a2AmpBP, a2TrapBP);
		a2OtherVB.getChildren().addAll(a2CliBP, a2HighNBP, a2TimesScoBP, a2TimesAmpBP);
		VBox a1T1CyVB = new VBox(5);
		VBox a1T2CyVB = new VBox(5);
		VBox a1T3CyVB = new VBox(5);
		VBox a2T1CyVB = new VBox(5);
		VBox a2T2CyVB = new VBox(5);
		VBox a2T3CyVB = new VBox(5);
		VBox a1T1OtherVB = new VBox(5);
		VBox a1T2OtherVB = new VBox(5);
		VBox a1T3OtherVB = new VBox(5);
		VBox a2T1OtherVB = new VBox(5);
		VBox a2T2OtherVB = new VBox(5);
		VBox a2T3OtherVB = new VBox(5);
		a1T1CyVB.getChildren().addAll(a1T1NumBP, a1T1CyBP, a1T1SpeBP, a1T1AmpBP, a1T1TrapBP);
		a1T1OtherVB.getChildren().addAll(a1T1CliBP, a1T1HighNBP, a1T1TimesScoBP, a1T1TimesAmpBP);
		a1T2CyVB.getChildren().addAll(a1T2NumBP, a1T2CyBP, a1T2SpeBP, a1T2AmpBP, a1T2TrapBP);
		a1T2OtherVB.getChildren().addAll(a1T2CliBP, a1T2HighNBP, a1T2TimesScoBP, a1T2TimesAmpBP);
		a1T3CyVB.getChildren().addAll(a1T3NumBP, a1T3CyBP, a1T3SpeBP, a1T3AmpBP, a1T3TrapBP);
		a1T3OtherVB.getChildren().addAll(a1T3CliBP, a1T3HighNBP, a1T3TimesScoBP, a1T3TimesAmpBP);
		a2T1CyVB.getChildren().addAll(a2T1NumBP, a2T1CyBP, a2T1SpeBP, a2T1AmpBP, a2T1TrapBP);
		a2T1OtherVB.getChildren().addAll(a2T1CliBP, a2T1HighNBP, a2T1TimesScoBP, a2T1TimesAmpBP);
		a2T2CyVB.getChildren().addAll(a2T2NumBP, a2T2CyBP, a2T2SpeBP, a2T2AmpBP, a2T2TrapBP);
		a2T2OtherVB.getChildren().addAll(a2T2CliBP, a2T2HighNBP, a2T2TimesScoBP, a2T2TimesAmpBP);
		a2T3CyVB.getChildren().addAll(a2T3NumBP, a2T3CyBP, a2T3SpeBP, a2T3AmpBP, a2T3TrapBP);
		a2T3OtherVB.getChildren().addAll(a2T3CliBP, a2T3HighNBP, a2T3TimesScoBP, a2T3TimesAmpBP);
		Label blank1 = new Label("    ");
		Label blank2 = new Label("    ");
		HBox a1HB = new HBox(5);
		HBox a2HB = new HBox(5);
		a1HB.getChildren().addAll(a1CyVB, a1OtherVB, blank1, a1T1CyVB, a1T1OtherVB, a1T2CyVB, a1T2OtherVB, a1T3CyVB, a1T3OtherVB);
		a2HB.getChildren().addAll(a2CyVB, a2OtherVB, blank2, a2T1CyVB, a2T1OtherVB, a2T2CyVB, a2T2OtherVB, a2T3CyVB, a2T3OtherVB);
		this.add(new Label("    "), 0, 0);
		this.add(new Label("    "), 2, 0);
		this.add(new Label("    "), 4, 0);
		this.add(new Label("    "), 0, 2);
		this.add(new Label("    "), 0, 4);
		this.add(new Label("    "), 0, 6);
		this.add(a1HB, 1, 1);
		this.add(a2HB, 1, 3);
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
		BorderPane a1T1NumBP = new BorderPane();
		BorderPane a1T2NumBP = new BorderPane();
		BorderPane a1T3NumBP = new BorderPane();
		BorderPane a2T1NumBP = new BorderPane();
		BorderPane a2T2NumBP = new BorderPane();
		BorderPane a2T3NumBP = new BorderPane();
		BorderPane a3T1NumBP = new BorderPane();
		BorderPane a3T2NumBP = new BorderPane();
		BorderPane a3T3NumBP = new BorderPane();
		a1T1NumBP.setCenter(a1T1NumL);
		a1T2NumBP.setCenter(a1T2NumL);
		a1T3NumBP.setCenter(a1T3NumL);
		a2T1NumBP.setCenter(a2T1NumL);
		a2T2NumBP.setCenter(a2T2NumL);
		a2T3NumBP.setCenter(a2T3NumL);
		a3T1NumBP.setCenter(a3T1NumL);
		a3T2NumBP.setCenter(a3T2NumL);
		a3T3NumBP.setCenter(a3T3NumL);
		a1T1NumBP.setId("comAllstatBP6");
		a1T2NumBP.setId("comAllstatBP6");
		a1T3NumBP.setId("comAllstatBP6");
		a2T1NumBP.setId("comAllstatBP6");
		a2T2NumBP.setId("comAllstatBP6");
		a2T3NumBP.setId("comAllstatBP6");
		a3T1NumBP.setId("comAllstatBP6");
		a3T2NumBP.setId("comAllstatBP6");
		a3T3NumBP.setId("comAllstatBP6");
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
		Label a1T1TimesScoTitleL = new Label("Times Scoure");
		Label a1T2TimesScoTitleL = new Label("Times Scoure");
		Label a1T3TimesScoTitleL = new Label("Times Scoure");
		Label a2T1TimesScoTitleL = new Label("Times Scoure");
		Label a2T2TimesScoTitleL = new Label("Times Scoure");
		Label a2T3TimesScoTitleL = new Label("Times Scoure");
		Label a3T1TimesScoTitleL = new Label("Times Scoure");
		Label a3T2TimesScoTitleL = new Label("Times Scoure");
		Label a3T3TimesScoTitleL = new Label("Times Scoure");
		Label a1T1TimesAmpTitleL = new Label("Times Amp");
		Label a1T2TimesAmpTitleL = new Label("Times Amp");
		Label a1T3TimesAmpTitleL = new Label("Times Amp");
		Label a2T1TimesAmpTitleL = new Label("Times Amp");
		Label a2T2TimesAmpTitleL = new Label("Times Amp");
		Label a2T3TimesAmpTitleL = new Label("Times Amp");
		Label a3T1TimesAmpTitleL = new Label("Times Amp");
		Label a3T2TimesAmpTitleL = new Label("Times Amp");
		Label a3T3TimesAmpTitleL = new Label("Times Amp");
		a1T1NumL.setId("smallTitle");
		a1T2NumL.setId("smallTitle");
		a1T3NumL.setId("smallTitle");
		a2T1NumL.setId("smallTitle");
		a2T2NumL.setId("smallTitle");
		a2T3NumL.setId("smallTitle");
		a3T1NumL.setId("smallTitle");
		a3T2NumL.setId("smallTitle");
		a3T3NumL.setId("smallTitle");
		a1T1CyL.setId("avgStat");
		a1T2CyL.setId("avgStat");
		a1T3CyL.setId("avgStat");
		a2T1CyL.setId("avgStat");
		a2T2CyL.setId("avgStat");
		a2T3CyL.setId("avgStat");
		a3T1CyL.setId("avgStat");
		a3T2CyL.setId("avgStat");
		a3T3CyL.setId("avgStat");
		a1T1SpeL.setId("avgStat");
		a1T2SpeL.setId("avgStat");
		a1T3SpeL.setId("avgStat");
		a2T1SpeL.setId("avgStat");
		a2T2SpeL.setId("avgStat");
		a2T3SpeL.setId("avgStat");
		a3T1SpeL.setId("avgStat");
		a3T2SpeL.setId("avgStat");
		a3T3SpeL.setId("avgStat");
		a1T1AmpL.setId("avgStat");
		a1T2AmpL.setId("avgStat");
		a1T3AmpL.setId("avgStat");
		a2T1AmpL.setId("avgStat");
		a2T2AmpL.setId("avgStat");
		a2T3AmpL.setId("avgStat");
		a3T1AmpL.setId("avgStat");
		a3T2AmpL.setId("avgStat");
		a3T3AmpL.setId("avgStat");
		a1T1TrapL.setId("avgStat");
		a1T2TrapL.setId("avgStat");
		a1T3TrapL.setId("avgStat");
		a2T1TrapL.setId("avgStat");
		a2T2TrapL.setId("avgStat");
		a2T3TrapL.setId("avgStat");
		a3T1TrapL.setId("avgStat");
		a3T2TrapL.setId("avgStat");
		a3T3TrapL.setId("avgStat");
		a1T1CliL.setId("avgStat");
		a1T2CliL.setId("avgStat");
		a1T3CliL.setId("avgStat");
		a2T1CliL.setId("avgStat");
		a2T2CliL.setId("avgStat");
		a2T3CliL.setId("avgStat");
		a3T1CliL.setId("avgStat");
		a3T2CliL.setId("avgStat");
		a3T3CliL.setId("avgStat");
		a1T1HumNL.setId("avgStat");
		a1T2HumNL.setId("avgStat");
		a1T3HumNL.setId("avgStat");
		a2T1HumNL.setId("avgStat");
		a2T2HumNL.setId("avgStat");
		a2T3HumNL.setId("avgStat");
		a3T1HumNL.setId("avgStat");
		a3T2HumNL.setId("avgStat");
		a3T3HumNL.setId("avgStat");
		a1T1TimesScoL.setId("avgStat");
		a1T2TimesScoL.setId("avgStat");
		a1T3TimesScoL.setId("avgStat");
		a2T1TimesScoL.setId("avgStat");
		a2T2TimesScoL.setId("avgStat");
		a2T3TimesScoL.setId("avgStat");
		a3T1TimesScoL.setId("avgStat");
		a3T2TimesScoL.setId("avgStat");
		a3T3TimesScoL.setId("avgStat");
		a1T1TimesAmpL.setId("avgStat");
		a1T2TimesAmpL.setId("avgStat");
		a1T3TimesAmpL.setId("avgStat");
		a2T1TimesAmpL.setId("avgStat");
		a2T2TimesAmpL.setId("avgStat");
		a2T3TimesAmpL.setId("avgStat");
		a3T1TimesAmpL.setId("avgStat");
		a3T2TimesAmpL.setId("avgStat");
		a3T3TimesAmpL.setId("avgStat");
		a1T1CyTitleL.setId("smallTitle");
		a1T2CyTitleL.setId("smallTitle");
		a1T3CyTitleL.setId("smallTitle");
		a2T1CyTitleL.setId("smallTitle");
		a2T2CyTitleL.setId("smallTitle");
		a2T3CyTitleL.setId("smallTitle");
		a3T1CyTitleL.setId("smallTitle");
		a3T2CyTitleL.setId("smallTitle");
		a3T3CyTitleL.setId("smallTitle");
		a1T1SpeTitleL.setId("smallTitle");
		a1T2SpeTitleL.setId("smallTitle");
		a1T3SpeTitleL.setId("smallTitle");
		a2T1SpeTitleL.setId("smallTitle");
		a2T2SpeTitleL.setId("smallTitle");
		a2T3SpeTitleL.setId("smallTitle");
		a3T1SpeTitleL.setId("smallTitle");
		a3T2SpeTitleL.setId("smallTitle");
		a3T3SpeTitleL.setId("smallTitle");
		a1T1AmpTitleL.setId("smallTitle");
		a1T2AmpTitleL.setId("smallTitle");
		a1T3AmpTitleL.setId("smallTitle");
		a2T1AmpTitleL.setId("smallTitle");
		a2T2AmpTitleL.setId("smallTitle");
		a2T3AmpTitleL.setId("smallTitle");
		a3T1AmpTitleL.setId("smallTitle");
		a3T2AmpTitleL.setId("smallTitle");
		a3T3AmpTitleL.setId("smallTitle");
		a1T1TrapTitleL.setId("smallTitle");
		a1T2TrapTitleL.setId("smallTitle");
		a1T3TrapTitleL.setId("smallTitle");
		a2T1TrapTitleL.setId("smallTitle");
		a2T2TrapTitleL.setId("smallTitle");
		a2T3TrapTitleL.setId("smallTitle");
		a3T1TrapTitleL.setId("smallTitle");
		a3T2TrapTitleL.setId("smallTitle");
		a3T3TrapTitleL.setId("smallTitle");
		a1T1CliTitleL.setId("smallTitle");
		a1T2CliTitleL.setId("smallTitle");
		a1T3CliTitleL.setId("smallTitle");
		a2T1CliTitleL.setId("smallTitle");
		a2T2CliTitleL.setId("smallTitle");
		a2T3CliTitleL.setId("smallTitle");
		a3T1CliTitleL.setId("smallTitle");
		a3T2CliTitleL.setId("smallTitle");
		a3T3CliTitleL.setId("smallTitle");
		a1T1HumNTitleL.setId("smallTitle");
		a1T2HumNTitleL.setId("smallTitle");
		a1T3HumNTitleL.setId("smallTitle");
		a2T1HumNTitleL.setId("smallTitle");
		a2T2HumNTitleL.setId("smallTitle");
		a2T3HumNTitleL.setId("smallTitle");
		a3T1HumNTitleL.setId("smallTitle");
		a3T2HumNTitleL.setId("smallTitle");
		a3T3HumNTitleL.setId("smallTitle");
		a1T1TimesScoTitleL.setId("smallTitle");
		a1T2TimesScoTitleL.setId("smallTitle");
		a1T3TimesScoTitleL.setId("smallTitle");
		a2T1TimesScoTitleL.setId("smallTitle");
		a2T2TimesScoTitleL.setId("smallTitle");
		a2T3TimesScoTitleL.setId("smallTitle");
		a3T1TimesScoTitleL.setId("smallTitle");
		a3T2TimesScoTitleL.setId("smallTitle");
		a3T3TimesScoTitleL.setId("smallTitle");
		a1T1TimesAmpTitleL.setId("smallTitle");
		a1T2TimesAmpTitleL.setId("smallTitle");
		a1T3TimesAmpTitleL.setId("smallTitle");
		a2T1TimesAmpTitleL.setId("smallTitle");
		a2T2TimesAmpTitleL.setId("smallTitle");
		a2T3TimesAmpTitleL.setId("smallTitle");
		a3T1TimesAmpTitleL.setId("smallTitle");
		a3T2TimesAmpTitleL.setId("smallTitle");
		a3T3TimesAmpTitleL.setId("smallTitle");
		BorderPane a1T1CyBP = new BorderPane();
		BorderPane a1T1SpeBP = new BorderPane();
		BorderPane a1T1AmpBP = new BorderPane();
		BorderPane a1T1TrapBP = new BorderPane();
		BorderPane a1T1CliBP = new BorderPane();
		BorderPane a1T1HighNBP = new BorderPane();
		BorderPane a1T1TimesScoBP = new BorderPane();
		BorderPane a1T1TimesAmpBP = new BorderPane();
		a1T1CyBP.setTop(a1T1CyTitleL);
		a1T1SpeBP.setTop(a1T1SpeTitleL);
		a1T1AmpBP.setTop(a1T1AmpTitleL);
		a1T1TrapBP.setTop(a1T1TrapTitleL);
		a1T1CliBP.setTop(a1T1CliTitleL);
		a1T1HighNBP.setTop(a1T1HumNTitleL);
		a1T1TimesScoBP.setTop(a1T1TimesScoTitleL);
		a1T1TimesAmpBP.setTop(a1T1TimesAmpTitleL);
		a1T1CyBP.setCenter(a1T1CyL);
		a1T1SpeBP.setCenter(a1T1SpeL);
		a1T1AmpBP.setCenter(a1T1AmpL);
		a1T1TrapBP.setCenter(a1T1TrapL);
		a1T1CliBP.setCenter(a1T1CliL);
		a1T1HighNBP.setCenter(a1T1HumNL);
		a1T1TimesScoBP.setCenter(a1T1TimesScoL);
		a1T1TimesAmpBP.setCenter(a1T1TimesAmpL);
		a1T1CyBP.setId("comAllstatBP1");
		a1T1SpeBP.setId("comAllstatBP2");
		a1T1AmpBP.setId("comAllstatBP3");
		a1T1TrapBP.setId("comAllstatBP4");
		a1T1CliBP.setId("comAllstatBP2");
		a1T1HighNBP.setId("comAllstatBP3");
		a1T1TimesScoBP.setId("comAllstatBP4");
		a1T1TimesAmpBP.setId("comAllstatBP5");
		BorderPane a1T2CyBP = new BorderPane();
		BorderPane a1T2SpeBP = new BorderPane();
		BorderPane a1T2AmpBP = new BorderPane();
		BorderPane a1T2TrapBP = new BorderPane();
		BorderPane a1T2CliBP = new BorderPane();
		BorderPane a1T2HighNBP = new BorderPane();
		BorderPane a1T2TimesScoBP = new BorderPane();
		BorderPane a1T2TimesAmpBP = new BorderPane();
		a1T2CyBP.setTop(a1T2CyTitleL);
		a1T2SpeBP.setTop(a1T2SpeTitleL);
		a1T2AmpBP.setTop(a1T2AmpTitleL);
		a1T2TrapBP.setTop(a1T2TrapTitleL);
		a1T2CliBP.setTop(a1T2CliTitleL);
		a1T2HighNBP.setTop(a1T2HumNTitleL);
		a1T2TimesScoBP.setTop(a1T2TimesScoTitleL);
		a1T2TimesAmpBP.setTop(a1T2TimesAmpTitleL);
		a1T2CyBP.setCenter(a1T2CyL);
		a1T2SpeBP.setCenter(a1T2SpeL);
		a1T2AmpBP.setCenter(a1T2AmpL);
		a1T2TrapBP.setCenter(a1T2TrapL);
		a1T2CliBP.setCenter(a1T2CliL);
		a1T2HighNBP.setCenter(a1T2HumNL);
		a1T2TimesScoBP.setCenter(a1T2TimesScoL);
		a1T2TimesAmpBP.setCenter(a1T2TimesAmpL);
		a1T2CyBP.setId("comAllstatBP3");
		a1T2SpeBP.setId("comAllstatBP4");
		a1T2AmpBP.setId("comAllstatBP5");
		a1T2TrapBP.setId("comAllstatBP6");
		a1T2CliBP.setId("comAllstatBP4");
		a1T2HighNBP.setId("comAllstatBP5");
		a1T2TimesScoBP.setId("comAllstatBP6");
		a1T2TimesAmpBP.setId("comAllstatBP7");
		BorderPane a1T3CyBP = new BorderPane();
		BorderPane a1T3SpeBP = new BorderPane();
		BorderPane a1T3AmpBP = new BorderPane();
		BorderPane a1T3TrapBP = new BorderPane();
		BorderPane a1T3CliBP = new BorderPane();
		BorderPane a1T3HighNBP = new BorderPane();
		BorderPane a1T3TimesScoBP = new BorderPane();
		BorderPane a1T3TimesAmpBP = new BorderPane();
		a1T3CyBP.setTop(a1T3CyTitleL);
		a1T3SpeBP.setTop(a1T3SpeTitleL);
		a1T3AmpBP.setTop(a1T3AmpTitleL);
		a1T3TrapBP.setTop(a1T3TrapTitleL);
		a1T3CliBP.setTop(a1T3CliTitleL);
		a1T3HighNBP.setTop(a1T3HumNTitleL);
		a1T3TimesScoBP.setTop(a1T3TimesScoTitleL);
		a1T3TimesAmpBP.setTop(a1T3TimesAmpTitleL);
		a1T3CyBP.setCenter(a1T3CyL);
		a1T3SpeBP.setCenter(a1T3SpeL);
		a1T3AmpBP.setCenter(a1T3AmpL);
		a1T3TrapBP.setCenter(a1T3TrapL);
		a1T3CliBP.setCenter(a1T3CliL);
		a1T3HighNBP.setCenter(a1T3HumNL);
		a1T3TimesScoBP.setCenter(a1T3TimesScoL);
		a1T3TimesAmpBP.setCenter(a1T3TimesAmpL);
		a1T3CyBP.setId("comAllstatBP5");
		a1T3SpeBP.setId("comAllstatBP6");
		a1T3AmpBP.setId("comAllstatBP7");
		a1T3TrapBP.setId("comAllstatBP8");
		a1T3CliBP.setId("comAllstatBP7");
		a1T3HighNBP.setId("comAllstatBP8");
		a1T3TimesScoBP.setId("comAllstatBP9");
		a1T3TimesAmpBP.setId("comAllstatBP8");
		BorderPane a2T1CyBP = new BorderPane();
		BorderPane a2T1SpeBP = new BorderPane();
		BorderPane a2T1AmpBP = new BorderPane();
		BorderPane a2T1TrapBP = new BorderPane();
		BorderPane a2T1CliBP = new BorderPane();
		BorderPane a2T1HighNBP = new BorderPane();
		BorderPane a2T1TimesScoBP = new BorderPane();
		BorderPane a2T1TimesAmpBP = new BorderPane();
		a2T1CyBP.setTop(a2T1CyTitleL);
		a2T1SpeBP.setTop(a2T1SpeTitleL);
		a2T1AmpBP.setTop(a2T1AmpTitleL);
		a2T1TrapBP.setTop(a2T1TrapTitleL);
		a2T1CliBP.setTop(a2T1CliTitleL);
		a2T1HighNBP.setTop(a2T1HumNTitleL);
		a2T1TimesScoBP.setTop(a2T1TimesScoTitleL);
		a2T1TimesAmpBP.setTop(a2T1TimesAmpTitleL);
		a2T1CyBP.setCenter(a2T1CyL);
		a2T1SpeBP.setCenter(a2T1SpeL);
		a2T1AmpBP.setCenter(a2T1AmpL);
		a2T1TrapBP.setCenter(a2T1TrapL);
		a2T1CliBP.setCenter(a2T1CliL);
		a2T1HighNBP.setCenter(a2T1HumNL);
		a2T1TimesScoBP.setCenter(a2T1TimesScoL);
		a2T1TimesAmpBP.setCenter(a2T1TimesAmpL);
		a2T1CyBP.setId("comAllstatBP1");
		a2T1SpeBP.setId("comAllstatBP2");
		a2T1AmpBP.setId("comAllstatBP3");
		a2T1TrapBP.setId("comAllstatBP4");
		a2T1CliBP.setId("comAllstatBP2");
		a2T1HighNBP.setId("comAllstatBP3");
		a2T1TimesScoBP.setId("comAllstatBP4");
		a2T1TimesAmpBP.setId("comAllstatBP5");
		BorderPane a2T2CyBP = new BorderPane();
		BorderPane a2T2SpeBP = new BorderPane();
		BorderPane a2T2AmpBP = new BorderPane();
		BorderPane a2T2TrapBP = new BorderPane();
		BorderPane a2T2CliBP = new BorderPane();
		BorderPane a2T2HighNBP = new BorderPane();
		BorderPane a2T2TimesScoBP = new BorderPane();
		BorderPane a2T2TimesAmpBP = new BorderPane();
		a2T2CyBP.setTop(a2T2CyTitleL);
		a2T2SpeBP.setTop(a2T2SpeTitleL);
		a2T2AmpBP.setTop(a2T2AmpTitleL);
		a2T2TrapBP.setTop(a2T2TrapTitleL);
		a2T2CliBP.setTop(a2T2CliTitleL);
		a2T2HighNBP.setTop(a2T2HumNTitleL);
		a2T2TimesScoBP.setTop(a2T2TimesScoTitleL);
		a2T2TimesAmpBP.setTop(a2T2TimesAmpTitleL);
		a2T2CyBP.setCenter(a2T2CyL);
		a2T2SpeBP.setCenter(a2T2SpeL);
		a2T2AmpBP.setCenter(a2T2AmpL);
		a2T2TrapBP.setCenter(a2T2TrapL);
		a2T2CliBP.setCenter(a2T2CliL);
		a2T2HighNBP.setCenter(a2T2HumNL);
		a2T2TimesScoBP.setCenter(a2T2TimesScoL);
		a2T2TimesAmpBP.setCenter(a2T2TimesAmpL);
		a2T2CyBP.setId("comAllstatBP3");
		a2T2SpeBP.setId("comAllstatBP4");
		a2T2AmpBP.setId("comAllstatBP5");
		a2T2TrapBP.setId("comAllstatBP6");
		a2T2CliBP.setId("comAllstatBP4");
		a2T2HighNBP.setId("comAllstatBP5");
		a2T2TimesScoBP.setId("comAllstatBP6");
		a2T2TimesAmpBP.setId("comAllstatBP7");
		BorderPane a2T3CyBP = new BorderPane();
		BorderPane a2T3SpeBP = new BorderPane();
		BorderPane a2T3AmpBP = new BorderPane();
		BorderPane a2T3TrapBP = new BorderPane();
		BorderPane a2T3CliBP = new BorderPane();
		BorderPane a2T3HighNBP = new BorderPane();
		BorderPane a2T3TimesScoBP = new BorderPane();
		BorderPane a2T3TimesAmpBP = new BorderPane();
		a2T3CyBP.setTop(a2T3CyTitleL);
		a2T3SpeBP.setTop(a2T3SpeTitleL);
		a2T3AmpBP.setTop(a2T3AmpTitleL);
		a2T3TrapBP.setTop(a2T3TrapTitleL);
		a2T3CliBP.setTop(a2T3CliTitleL);
		a2T3HighNBP.setTop(a2T3HumNTitleL);
		a2T3TimesScoBP.setTop(a2T3TimesScoTitleL);
		a2T3TimesAmpBP.setTop(a2T3TimesAmpTitleL);
		a2T3CyBP.setCenter(a2T3CyL);
		a2T3SpeBP.setCenter(a2T3SpeL);
		a2T3AmpBP.setCenter(a2T3AmpL);
		a2T3TrapBP.setCenter(a2T3TrapL);
		a2T3CliBP.setCenter(a2T3CliL);
		a2T3HighNBP.setCenter(a2T3HumNL);
		a2T3TimesScoBP.setCenter(a2T3TimesScoL);
		a2T3TimesAmpBP.setCenter(a2T3TimesAmpL);
		a2T3CyBP.setId("comAllstatBP5");
		a2T3SpeBP.setId("comAllstatBP6");
		a2T3AmpBP.setId("comAllstatBP7");
		a2T3TrapBP.setId("comAllstatBP8");
		a2T3CliBP.setId("comAllstatBP7");
		a2T3HighNBP.setId("comAllstatBP8");
		a2T3TimesScoBP.setId("comAllstatBP9");
		a2T3TimesAmpBP.setId("comAllstatBP8");
		BorderPane a3T1CyBP = new BorderPane();
		BorderPane a3T1SpeBP = new BorderPane();
		BorderPane a3T1AmpBP = new BorderPane();
		BorderPane a3T1TrapBP = new BorderPane();
		BorderPane a3T1CliBP = new BorderPane();
		BorderPane a3T1HighNBP = new BorderPane();
		BorderPane a3T1TimesScoBP = new BorderPane();
		BorderPane a3T1TimesAmpBP = new BorderPane();
		a3T1CyBP.setTop(a3T1CyTitleL);
		a3T1SpeBP.setTop(a3T1SpeTitleL);
		a3T1AmpBP.setTop(a3T1AmpTitleL);
		a3T1TrapBP.setTop(a3T1TrapTitleL);
		a3T1CliBP.setTop(a3T1CliTitleL);
		a3T1HighNBP.setTop(a3T1HumNTitleL);
		a3T1TimesScoBP.setTop(a3T1TimesScoTitleL);
		a3T1TimesAmpBP.setTop(a3T1TimesAmpTitleL);
		a3T1CyBP.setCenter(a3T1CyL);
		a3T1SpeBP.setCenter(a3T1SpeL);
		a3T1AmpBP.setCenter(a3T1AmpL);
		a3T1TrapBP.setCenter(a3T1TrapL);
		a3T1CliBP.setCenter(a3T1CliL);
		a3T1HighNBP.setCenter(a3T1HumNL);
		a3T1TimesScoBP.setCenter(a3T1TimesScoL);
		a3T1TimesAmpBP.setCenter(a3T1TimesAmpL);
		a3T1CyBP.setId("comAllstatBP1");
		a3T1SpeBP.setId("comAllstatBP2");
		a3T1AmpBP.setId("comAllstatBP3");
		a3T1TrapBP.setId("comAllstatBP4");
		a3T1CliBP.setId("comAllstatBP2");
		a3T1HighNBP.setId("comAllstatBP3");
		a3T1TimesScoBP.setId("comAllstatBP4");
		a3T1TimesAmpBP.setId("comAllstatBP5");
		BorderPane a3T2CyBP = new BorderPane();
		BorderPane a3T2SpeBP = new BorderPane();
		BorderPane a3T2AmpBP = new BorderPane();
		BorderPane a3T2TrapBP = new BorderPane();
		BorderPane a3T2CliBP = new BorderPane();
		BorderPane a3T2HighNBP = new BorderPane();
		BorderPane a3T2TimesScoBP = new BorderPane();
		BorderPane a3T2TimesAmpBP = new BorderPane();
		a3T2CyBP.setTop(a3T2CyTitleL);
		a3T2SpeBP.setTop(a3T2SpeTitleL);
		a3T2AmpBP.setTop(a3T2AmpTitleL);
		a3T2TrapBP.setTop(a3T2TrapTitleL);
		a3T2CliBP.setTop(a3T2CliTitleL);
		a3T2HighNBP.setTop(a3T2HumNTitleL);
		a3T2TimesScoBP.setTop(a3T2TimesScoTitleL);
		a3T2TimesAmpBP.setTop(a3T2TimesAmpTitleL);
		a3T2CyBP.setCenter(a3T2CyL);
		a3T2SpeBP.setCenter(a3T2SpeL);
		a3T2AmpBP.setCenter(a3T2AmpL);
		a3T2TrapBP.setCenter(a3T2TrapL);
		a3T2CliBP.setCenter(a3T2CliL);
		a3T2HighNBP.setCenter(a3T2HumNL);
		a3T2TimesScoBP.setCenter(a3T2TimesScoL);
		a3T2TimesAmpBP.setCenter(a3T2TimesAmpL);
		a3T2CyBP.setId("comAllstatBP3");
		a3T2SpeBP.setId("comAllstatBP4");
		a3T2AmpBP.setId("comAllstatBP5");
		a3T2TrapBP.setId("comAllstatBP6");
		a3T2CliBP.setId("comAllstatBP4");
		a3T2HighNBP.setId("comAllstatBP5");
		a3T2TimesScoBP.setId("comAllstatBP6");
		a3T2TimesAmpBP.setId("comAllstatBP7");
		BorderPane a3T3CyBP = new BorderPane();
		BorderPane a3T3SpeBP = new BorderPane();
		BorderPane a3T3AmpBP = new BorderPane();
		BorderPane a3T3TrapBP = new BorderPane();
		BorderPane a3T3CliBP = new BorderPane();
		BorderPane a3T3HighNBP = new BorderPane();
		BorderPane a3T3TimesScoBP = new BorderPane();
		BorderPane a3T3TimesAmpBP = new BorderPane();
		a3T3CyBP.setTop(a3T3CyTitleL);
		a3T3SpeBP.setTop(a3T3SpeTitleL);
		a3T3AmpBP.setTop(a3T3AmpTitleL);
		a3T3TrapBP.setTop(a3T3TrapTitleL);
		a3T3CliBP.setTop(a3T3CliTitleL);
		a3T3HighNBP.setTop(a3T3HumNTitleL);
		a3T3TimesScoBP.setTop(a3T3TimesScoTitleL);
		a3T3TimesAmpBP.setTop(a3T3TimesAmpTitleL);
		a3T3CyBP.setCenter(a3T3CyL);
		a3T3SpeBP.setCenter(a3T3SpeL);
		a3T3AmpBP.setCenter(a3T3AmpL);
		a3T3TrapBP.setCenter(a3T3TrapL);
		a3T3CliBP.setCenter(a3T3CliL);
		a3T3HighNBP.setCenter(a3T3HumNL);
		a3T3TimesScoBP.setCenter(a3T3TimesScoL);
		a3T3TimesAmpBP.setCenter(a3T3TimesAmpL);
		a3T3CyBP.setId("comAllstatBP5");
		a3T3SpeBP.setId("comAllstatBP6");
		a3T3AmpBP.setId("comAllstatBP7");
		a3T3TrapBP.setId("comAllstatBP8");
		a3T3CliBP.setId("comAllstatBP7");
		a3T3HighNBP.setId("comAllstatBP8");
		a3T3TimesScoBP.setId("comAllstatBP9");
		a3T3TimesAmpBP.setId("comAllstatBP8");
		Label a1TotalCyL = new Label(Double.toString(a1T1Cy + a1T2Cy + a1T3Cy));
		Label a1TotalSpeL = new Label(Double.toString(a1T1Spe + a1T2Spe + a1T3Spe));
		Label a1TotalAmpL = new Label(Double.toString(a1T1Amp + a1T2Amp + a1T3Amp));
		Label a1TotalTrapL = new Label(Double.toString(a1T1Trap + a1T2Trap + a1T3Trap));
		Label a1TotalCliL = new Label(Double.toString(a1T1Cli + a1T2Cli + a1T3Cli));
		Label a1TotalHighNL = new Label(Double.toString(a1T1HumN + a1T2HumN + a1T3HumN));
		Label a1TotalTimesScoL = new Label(Double.toString(a1T1TimesSco + a1T2TimesSco + a1T3TimesSco));
		Label a1TotalTimesAmpL = new Label(Double.toString(a1T1TimesAmp + a1T2TimesAmp + a1T3TimesAmp));
		Label a2TotalCyL = new Label(Double.toString(a1T1Cy + a1T2Cy + a1T3Cy));
		Label a2TotalSpeL = new Label(Double.toString(a1T1Spe + a1T2Spe + a1T3Spe));
		Label a2TotalAmpL = new Label(Double.toString(a1T1Amp + a1T2Amp + a1T3Amp));
		Label a2TotalTrapL = new Label(Double.toString(a1T1Trap + a1T2Trap + a1T3Trap));
		Label a2TotalCliL = new Label(Double.toString(a1T1Cli + a1T2Cli + a1T3Cli));
		Label a2TotalHighNL = new Label(Double.toString(a1T1HumN + a1T2HumN + a1T3HumN));
		Label a2TotalTimesScoL = new Label(Double.toString(a1T1TimesSco + a1T2TimesSco + a1T3TimesSco));
		Label a2TotalTimesAmpL = new Label(Double.toString(a1T1TimesAmp + a1T2TimesAmp + a1T3TimesAmp));
		Label a3TotalCyL = new Label(Double.toString(a3T1Cy + a3T2Cy + a1T3Cy));
		Label a3TotalSpeL = new Label(Double.toString(a1T1Spe + a1T2Spe + a1T3Spe));
		Label a3TotalAmpL = new Label(Double.toString(a1T1Amp + a1T2Amp + a1T3Amp));
		Label a3TotalTrapL = new Label(Double.toString(a1T1Trap + a1T2Trap + a1T3Trap));
		Label a3TotalCliL = new Label(Double.toString(a1T1Cli + a1T2Cli + a1T3Cli));
		Label a3TotalHighNL = new Label(Double.toString(a1T1HumN + a1T2HumN + a1T3HumN));
		Label a3TotalTimesScoL = new Label(Double.toString(a1T1TimesSco + a1T2TimesSco + a1T3TimesSco));
		Label a3TotalTimesAmpL = new Label(Double.toString(a1T1TimesAmp + a1T2TimesAmp + a1T3TimesAmp));
		Label a1CyTitleL = new Label("Avg Cycles");
		Label a1SpeTitleL = new Label("Avg Speaker");
		Label a1AmpTitleL = new Label("Avg Amp");
		Label a1TrapTitleL = new Label("Avg Trap");
		Label a1CliTitleL = new Label("Avg Climb");
		Label a1HighNTitleL = new Label("High Notes");
		Label a1TimesScoTitleL = new Label("Times Scoure");
		Label a1TimesAmpTitleL = new Label("Times Amp");
		Label a2CyTitleL = new Label("Avg Cycles");
		Label a2SpeTitleL = new Label("Avg Speaker");
		Label a2AmpTitleL = new Label("Avg Amp");
		Label a2TrapTitleL = new Label("Avg Trap");
		Label a2CliTitleL = new Label("Avg Climb");
		Label a2HighNTitleL = new Label("High Notes");
		Label a2TimesScoTitleL = new Label("Times Scoure");
		Label a2TimesAmpTitleL = new Label("Times Amp");
		Label a3CyTitleL = new Label("Avg Cycles");
		Label a3SpeTitleL = new Label("Avg Speaker");
		Label a3AmpTitleL = new Label("Avg Amp");
		Label a3TrapTitleL = new Label("Avg Trap");
		Label a3CliTitleL = new Label("Avg Climb");
		Label a3HighNTitleL = new Label("High Notes");
		Label a3TimesScoTitleL = new Label("Times Scoure");
		Label a3TimesAmpTitleL = new Label("Times Amp");
		Label a1Title = new Label("Alliance 1");
		Label a2Title = new Label("Alliance 2");
		Label a3Title = new Label("Alliance 3");
		a1Title.setId("smallTitle");
		a2Title.setId("smallTitle");
		a3Title.setId("smallTitle");
		BorderPane a1TitleBP = new BorderPane();
		BorderPane a2TitleBP = new BorderPane();
		BorderPane a3TitleBP = new BorderPane();
		a1TitleBP.setCenter(a1Title);
		a2TitleBP.setCenter(a2Title);
		a3TitleBP.setCenter(a3Title);
		a1TitleBP.setId("comAllstatBP5");
		a2TitleBP.setId("comAllstatBP5");
		a3TitleBP.setId("comAllstatBP5");
		a1TotalCyL.setId("avgStat");
		a1TotalSpeL.setId("avgStat");
		a1TotalAmpL.setId("avgStat");
		a1TotalTrapL.setId("avgStat");
		a1TotalCliL.setId("avgStat");
		a1TotalHighNL.setId("avgStat");
		a1TotalTimesScoL.setId("avgStat");
		a1TotalTimesAmpL.setId("avgStat");
		a2TotalCyL.setId("avgStat");
		a2TotalSpeL.setId("avgStat");
		a2TotalAmpL.setId("avgStat");
		a2TotalTrapL.setId("avgStat");
		a2TotalCliL.setId("avgStat");
		a2TotalHighNL.setId("avgStat");
		a2TotalTimesScoL.setId("avgStat");
		a2TotalTimesAmpL.setId("avgStat");
		a3TotalCyL.setId("avgStat");
		a3TotalSpeL.setId("avgStat");
		a3TotalAmpL.setId("avgStat");
		a3TotalTrapL.setId("avgStat");
		a3TotalCliL.setId("avgStat");
		a3TotalHighNL.setId("avgStat");
		a3TotalTimesScoL.setId("avgStat");
		a3TotalTimesAmpL.setId("avgStat");
		a1CyTitleL.setId("smallTitle");
		a1SpeTitleL.setId("smallTitle");
		a1AmpTitleL.setId("smallTitle");
		a1TrapTitleL.setId("smallTitle");
		a1CliTitleL.setId("smallTitle");
		a1HighNTitleL.setId("smallTitle");
		a1TimesScoTitleL.setId("smallTitle");
		a1TimesAmpTitleL.setId("smallTitle");
		a2CyTitleL.setId("smallTitle");
		a2SpeTitleL.setId("smallTitle");
		a2AmpTitleL.setId("smallTitle");
		a2TrapTitleL.setId("smallTitle");
		a2CliTitleL.setId("smallTitle");
		a2HighNTitleL.setId("smallTitle");
		a2TimesScoTitleL.setId("smallTitle");
		a2TimesAmpTitleL.setId("smallTitle");
		a3CyTitleL.setId("smallTitle");
		a3SpeTitleL.setId("smallTitle");
		a3AmpTitleL.setId("smallTitle");
		a3TrapTitleL.setId("smallTitle");
		a3CliTitleL.setId("smallTitle");
		a3HighNTitleL.setId("smallTitle");
		a3TimesScoTitleL.setId("smallTitle");
		a3TimesAmpTitleL.setId("smallTitle");
		BorderPane a1CyBP = new BorderPane();
		BorderPane a1SpeBP = new BorderPane();
		BorderPane a1AmpBP = new BorderPane();
		BorderPane a1TrapBP = new BorderPane();
		BorderPane a1CliBP = new BorderPane();
		BorderPane a1HighNBP = new BorderPane();
		BorderPane a1TimesScoBP = new BorderPane();
		BorderPane a1TimesAmpBP = new BorderPane();
		BorderPane a2CyBP = new BorderPane();
		BorderPane a2SpeBP = new BorderPane();
		BorderPane a2AmpBP = new BorderPane();
		BorderPane a2TrapBP = new BorderPane();
		BorderPane a2CliBP = new BorderPane();
		BorderPane a2HighNBP = new BorderPane();
		BorderPane a2TimesScoBP = new BorderPane();
		BorderPane a2TimesAmpBP = new BorderPane();
		BorderPane a3CyBP = new BorderPane();
		BorderPane a3SpeBP = new BorderPane();
		BorderPane a3AmpBP = new BorderPane();
		BorderPane a3TrapBP = new BorderPane();
		BorderPane a3CliBP = new BorderPane();
		BorderPane a3HighNBP = new BorderPane();
		BorderPane a3TimesScoBP = new BorderPane();
		BorderPane a3TimesAmpBP = new BorderPane();
		a1CyBP.setTop(a1CyTitleL);
		a1SpeBP.setTop(a1SpeTitleL);
		a1AmpBP.setTop(a1AmpTitleL);
		a1TrapBP.setTop(a1TrapTitleL);
		a1CliBP.setTop(a1CliTitleL);
		a1HighNBP.setTop(a1HighNTitleL);
		a1TimesScoBP.setTop(a1TimesScoTitleL);
		a1TimesAmpBP.setTop(a1TimesAmpTitleL);
		a1CyBP.setCenter(a1TotalCyL);
		a1SpeBP.setCenter(a1TotalSpeL);
		a1AmpBP.setCenter(a1TotalAmpL);
		a1TrapBP.setCenter(a1TotalTrapL);
		a1CliBP.setCenter(a1TotalCliL);
		a1HighNBP.setCenter(a1TotalHighNL);
		a1TimesScoBP.setCenter(a1TotalTimesScoL);
		a1TimesAmpBP.setCenter(a1TotalTimesAmpL);
		a2CyBP.setTop(a2CyTitleL);
		a2SpeBP.setTop(a2SpeTitleL);
		a2AmpBP.setTop(a2AmpTitleL);
		a2TrapBP.setTop(a2TrapTitleL);
		a2CliBP.setTop(a2CliTitleL);
		a2HighNBP.setTop(a2HighNTitleL);
		a2TimesScoBP.setTop(a2TimesScoTitleL);
		a2TimesAmpBP.setTop(a2TimesAmpTitleL);
		a2CyBP.setCenter(a2TotalCyL);
		a2SpeBP.setCenter(a2TotalSpeL);
		a2AmpBP.setCenter(a2TotalAmpL);
		a2TrapBP.setCenter(a2TotalTrapL);
		a2CliBP.setCenter(a2TotalCliL);
		a2HighNBP.setCenter(a2TotalHighNL);
		a2TimesScoBP.setCenter(a2TotalTimesScoL);
		a2TimesAmpBP.setCenter(a2TotalTimesAmpL);
		a3CyBP.setTop(a3CyTitleL);
		a3SpeBP.setTop(a3SpeTitleL);
		a3AmpBP.setTop(a3AmpTitleL);
		a3TrapBP.setTop(a3TrapTitleL);
		a3CliBP.setTop(a3CliTitleL);
		a3HighNBP.setTop(a3HighNTitleL);
		a3TimesScoBP.setTop(a3TimesScoTitleL);
		a3TimesAmpBP.setTop(a3TimesAmpTitleL);
		a3CyBP.setCenter(a3TotalCyL);
		a3SpeBP.setCenter(a3TotalSpeL);
		a3AmpBP.setCenter(a3TotalAmpL);
		a3TrapBP.setCenter(a3TotalTrapL);
		a3CliBP.setCenter(a3TotalCliL);
		a3HighNBP.setCenter(a3TotalHighNL);
		a3TimesScoBP.setCenter(a3TotalTimesScoL);
		a3TimesAmpBP.setCenter(a3TotalTimesAmpL);
		a1CyBP.setId("comAllstatBP1");
		a1SpeBP.setId("comAllstatBP2");
		a1AmpBP.setId("comAllstatBP3");
		a1TrapBP.setId("comAllstatBP4");
		a1CliBP.setId("comAllstatBP2");
		a1HighNBP.setId("comAllstatBP3");
		a1TimesScoBP.setId("comAllstatBP4");
		a1TimesAmpBP.setId("comAllstatBP5");
		a2CyBP.setId("comAllstatBP1");
		a2SpeBP.setId("comAllstatBP2");
		a2AmpBP.setId("comAllstatBP3");
		a2TrapBP.setId("comAllstatBP4");
		a2CliBP.setId("comAllstatBP2");
		a2HighNBP.setId("comAllstatBP3");
		a2TimesScoBP.setId("comAllstatBP4");
		a2TimesAmpBP.setId("comAllstatBP5");
		a3CyBP.setId("comAllstatBP1");
		a3SpeBP.setId("comAllstatBP2");
		a3AmpBP.setId("comAllstatBP3");
		a3TrapBP.setId("comAllstatBP4");
		a3CliBP.setId("comAllstatBP2");
		a3HighNBP.setId("comAllstatBP3");
		a3TimesScoBP.setId("comAllstatBP4");
		a3TimesAmpBP.setId("comAllstatBP5");
		VBox a1CyVB = new VBox(5);
		VBox a1OtherVB = new VBox(5);
		VBox a2CyVB = new VBox(5);
		VBox a2OtherVB = new VBox(5);
		VBox a3CyVB = new VBox(5);
		VBox a3OtherVB = new VBox(5);
		a1CyVB.getChildren().addAll(a1TitleBP, a1CyBP, a1SpeBP, a1AmpBP, a1TrapBP);
		a1OtherVB.getChildren().addAll(a1CliBP, a1HighNBP, a1TimesScoBP, a1TimesAmpBP);
		a2CyVB.getChildren().addAll(a2TitleBP, a2CyBP, a2SpeBP, a2AmpBP, a2TrapBP);
		a2OtherVB.getChildren().addAll(a2CliBP, a2HighNBP, a2TimesScoBP, a2TimesAmpBP);
		a3CyVB.getChildren().addAll(a3TitleBP, a3CyBP, a3SpeBP, a3AmpBP, a3TrapBP);
		a3OtherVB.getChildren().addAll(a3CliBP, a3HighNBP, a3TimesScoBP, a3TimesAmpBP);
		VBox a1T1CyVB = new VBox(5);
		VBox a1T2CyVB = new VBox(5);
		VBox a1T3CyVB = new VBox(5);
		VBox a2T1CyVB = new VBox(5);
		VBox a2T2CyVB = new VBox(5);
		VBox a2T3CyVB = new VBox(5);
		VBox a3T1CyVB = new VBox(5);
		VBox a3T2CyVB = new VBox(5);
		VBox a3T3CyVB = new VBox(5);
		VBox a1T1OtherVB = new VBox(5);
		VBox a1T2OtherVB = new VBox(5);
		VBox a1T3OtherVB = new VBox(5);
		VBox a2T1OtherVB = new VBox(5);
		VBox a2T2OtherVB = new VBox(5);
		VBox a2T3OtherVB = new VBox(5);
		VBox a3T1OtherVB = new VBox(5);
		VBox a3T2OtherVB = new VBox(5);
		VBox a3T3OtherVB = new VBox(5);
		a1T1CyVB.getChildren().addAll(a1T1NumBP, a1T1CyBP, a1T1SpeBP, a1T1AmpBP, a1T1TrapBP);
		a1T1OtherVB.getChildren().addAll(a1T1CliBP, a1T1HighNBP, a1T1TimesScoBP, a1T1TimesAmpBP);
		a1T2CyVB.getChildren().addAll(a1T2NumBP, a1T2CyBP, a1T2SpeBP, a1T2AmpBP, a1T2TrapBP);
		a1T2OtherVB.getChildren().addAll(a1T2CliBP, a1T2HighNBP, a1T2TimesScoBP, a1T2TimesAmpBP);
		a1T3CyVB.getChildren().addAll(a1T3NumBP, a1T3CyBP, a1T3SpeBP, a1T3AmpBP, a1T3TrapBP);
		a1T3OtherVB.getChildren().addAll(a1T3CliBP, a1T3HighNBP, a1T3TimesScoBP, a1T3TimesAmpBP);
		a2T1CyVB.getChildren().addAll(a2T1NumBP, a2T1CyBP, a2T1SpeBP, a2T1AmpBP, a2T1TrapBP);
		a2T1OtherVB.getChildren().addAll(a2T1CliBP, a2T1HighNBP, a2T1TimesScoBP, a2T1TimesAmpBP);
		a2T2CyVB.getChildren().addAll(a2T2NumBP, a2T2CyBP, a2T2SpeBP, a2T2AmpBP, a2T2TrapBP);
		a2T2OtherVB.getChildren().addAll(a2T2CliBP, a2T2HighNBP, a2T2TimesScoBP, a2T2TimesAmpBP);
		a2T3CyVB.getChildren().addAll(a2T3NumBP, a2T3CyBP, a2T3SpeBP, a2T3AmpBP, a2T3TrapBP);
		a2T3OtherVB.getChildren().addAll(a2T3CliBP, a2T3HighNBP, a2T3TimesScoBP, a2T3TimesAmpBP);
		a3T1CyVB.getChildren().addAll(a3T1NumBP, a3T1CyBP, a3T1SpeBP, a3T1AmpBP, a3T1TrapBP);
		a3T1OtherVB.getChildren().addAll(a3T1CliBP, a3T1HighNBP, a3T1TimesScoBP, a3T1TimesAmpBP);
		a3T2CyVB.getChildren().addAll(a3T2NumBP, a3T2CyBP, a3T2SpeBP, a3T2AmpBP, a3T2TrapBP);
		a3T2OtherVB.getChildren().addAll(a3T2CliBP, a3T2HighNBP, a3T2TimesScoBP, a3T2TimesAmpBP);
		a3T3CyVB.getChildren().addAll(a3T3NumBP, a3T3CyBP, a3T3SpeBP, a3T3AmpBP, a3T3TrapBP);
		a3T3OtherVB.getChildren().addAll(a3T3CliBP, a3T3HighNBP, a3T3TimesScoBP, a3T3TimesAmpBP);
		Label blank1 = new Label("    ");
		Label blank2 = new Label("    ");
		Label blank3 = new Label("    ");
		HBox a1HB = new HBox(5);
		HBox a2HB = new HBox(5);
		HBox a3HB = new HBox(5);
		a1HB.getChildren().addAll(a1CyVB, a1OtherVB, blank1, a1T1CyVB, a1T1OtherVB, a1T2CyVB, a1T2OtherVB, a1T3CyVB, a1T3OtherVB);
		a2HB.getChildren().addAll(a2CyVB, a2OtherVB, blank2, a2T1CyVB, a2T1OtherVB, a2T2CyVB, a2T2OtherVB, a2T3CyVB, a2T3OtherVB);
		a3HB.getChildren().addAll(a3CyVB, a3OtherVB, blank3, a3T1CyVB, a3T1OtherVB, a3T2CyVB, a3T2OtherVB, a3T3CyVB, a3T3OtherVB);
		this.add(new Label("    "), 0, 0);
		this.add(new Label("    "), 2, 0);
		this.add(new Label("    "), 4, 0);
		this.add(new Label("    "), 0, 2);
		this.add(new Label("    "), 0, 4);
		this.add(new Label("    "), 0, 6);
		this.add(a1HB, 1, 1);
		this.add(a2HB, 1, 3);
		this.add(a3HB, 1, 5);
	}

	public void addCompare3PieChart(Team a1T1, Team a1T2, Team a1T3, Team a2T1, Team a2T2, Team a2T3, Team a3T1, Team a3T2, Team a3T3) {
		System.out.println("BoopComAlls4.0");
		double a1Cy = a1T1.getAvgCycles() + a1T2.getAvgCycles() + a1T3.getAvgCycles();
		double a1Spe = a1T1.getAvgSpe() + a1T2.getAvgSpe() + a1T3.getAvgSpe();
		double a1Amp = a1T1.getAvgAmp() + a1T2.getAvgAmp() + a1T3.getAvgAmp();
		double a1Trap = a1T1.getAvgTrap() + a1T2.getAvgTrap() + a1T3.getAvgTrap();
		double a1TimesSco = a1T1.getAvgCycles() + a1T2.getAvgCycles() + a1T3.getAvgCycles();
		double a1TimesAmp = a1T1.getAvgCycles() + a1T2.getAvgCycles() + a1T3.getAvgCycles();
		double a2Cy = a2T1.getAvgCycles() + a2T2.getAvgCycles() + a2T3.getAvgCycles();
		double a2Spe = a2T1.getAvgSpe() + a2T2.getAvgSpe() + a2T3.getAvgSpe();
		double a2Amp = a2T1.getAvgAmp() + a2T2.getAvgAmp() + a2T3.getAvgAmp();
		double a2Trap = a2T1.getAvgTrap() + a2T2.getAvgTrap() + a2T3.getAvgTrap();
		double a2TimesSco = a2T1.getAvgCycles() + a2T2.getAvgCycles() + a2T3.getAvgCycles();
		double a2TimesAmp = a2T1.getAvgCycles() + a2T2.getAvgCycles() + a2T3.getAvgCycles();
		double a3Cy = a3T1.getAvgCycles() + a3T2.getAvgCycles() + a3T3.getAvgCycles();
		double a3Spe = a3T1.getAvgSpe() + a3T2.getAvgSpe() + a3T3.getAvgSpe();
		double a3Amp = a3T1.getAvgAmp() + a3T2.getAvgAmp() + a3T3.getAvgAmp();
		double a3Trap = a3T1.getAvgTrap() + a3T2.getAvgTrap() + a3T3.getAvgTrap();
		double a3TimesSco = a3T1.getAvgCycles() + a3T2.getAvgCycles() + a3T3.getAvgCycles();
		double a3TimesAmp = a3T1.getAvgCycles() + a3T2.getAvgCycles() + a3T3.getAvgCycles();
		int a1TotalMatches = a1T1.getTotalMatchesPlayed() + a1T2.getTotalMatchesPlayed() + a1T3.getTotalMatchesPlayed();
		int a2TotalMatches = a2T1.getTotalMatchesPlayed() + a2T2.getTotalMatchesPlayed() + a2T3.getTotalMatchesPlayed();
		int a3TotalMatches = a3T1.getTotalMatchesPlayed() + a3T2.getTotalMatchesPlayed() + a3T3.getTotalMatchesPlayed();
		System.out.println("BoopComAlls4.1");
		//alliance 1 cy pie chart
		int a1SpeComPer = (int) ((a1Spe/a1Cy) * 100);
		int a1AmpComPer = (int) ((a1Amp/a1Cy) * 100);
		int a1TrapComPer = (int) ((a1Trap/a1Cy) * 100);
		int whoToAdd1 = 1;
		while(a1SpeComPer + a1AmpComPer + a1TrapComPer != 100) {
			if(whoToAdd1 == 1) {
				a1SpeComPer++;
				whoToAdd1++;
			}else if(whoToAdd1 == 2) {
				a1AmpComPer++;
				whoToAdd1++;
			}else if(whoToAdd1 == 3){
				a1TrapComPer++;
				whoToAdd1 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData1 = FXCollections.observableArrayList(new PieChart.Data("Speaker", a1SpeComPer), new PieChart.Data("Amp", a1AmpComPer), new PieChart.Data("Trap", a1TrapComPer));
		PieChart a1CyPieC = new PieChart(pieChartData1);
		a1CyPieC.autosize();
		a1CyPieC.setMaxSize(300, 300);
		a1CyPieC.setMinSize(300, 300);
		a1CyPieC.setLabelsVisible(true);
		System.out.println("BoopComAlls4.2");
		//alliance 1 hum position pie chart
		int a1TimesScoComPer = (int) ((a1TimesSco/a1TotalMatches));
		int a1TimesAmpComPer = (int) ((a1TimesAmp/a1TotalMatches));
		int whoToAdd2 = 1;
		while(a1TimesScoComPer + a1TimesAmpComPer != 100) {
			if(whoToAdd2 == 1) {
				a1TimesScoComPer++;
				whoToAdd2++;
			}else if(whoToAdd2 == 2) {
				a1TimesAmpComPer++;
				whoToAdd2 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData2 = FXCollections.observableArrayList(new PieChart.Data("Scoure", a1TimesScoComPer), new PieChart.Data("Amp", a1TimesAmpComPer));
		PieChart a1HumPieC = new PieChart(pieChartData2);
		a1HumPieC.autosize();
		a1HumPieC.setMaxSize(300, 300);
		a1HumPieC.setMinSize(300, 300);
		a1HumPieC.setLabelsVisible(true);
		a1HumPieC.setId("comAllsPieChartId");
		System.out.println("BoopComAlls4.3");
		//alliance 2 cy pie chart
		int a2SpeComPer = (int) ((a2Spe/a2Cy) * 100);
		int a2AmpComPer = (int) ((a2Amp/a2Cy) * 100);
		int a2TrapComPer = (int) ((a2Trap/a2Cy) * 100);
		int whoToAdd3 = 1;
		while(a2SpeComPer + a2AmpComPer + a2TrapComPer != 100) {
			if(whoToAdd3 == 1) {
				a2SpeComPer++;
				whoToAdd3++;
			}else if(whoToAdd3 == 2) {
				a2AmpComPer++;
				whoToAdd3++;
			}else if(whoToAdd3 == 3){
				a2TrapComPer++;
				whoToAdd3 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData3 = FXCollections.observableArrayList(new PieChart.Data("Speaker", a2SpeComPer), new PieChart.Data("Amp", a2AmpComPer), new PieChart.Data("Trap", a2TrapComPer));
		PieChart a2CyPieC = new PieChart(pieChartData3);
		a2CyPieC.autosize();
		a2CyPieC.setMaxSize(300, 300);
		a2CyPieC.setMinSize(300, 300);
		a2CyPieC.setLabelsVisible(true);
		System.out.println("BoopComAlls4.4");
		//alliance 2 hum position pie chart
		int a2TimesScoComPer = (int) ((a2TimesSco/a2TotalMatches));
		int a2TimesAmpComPer = (int) ((a2TimesAmp/a2TotalMatches));
		int whoToAdd4 = 1;
		while(a2TimesScoComPer + a2TimesAmpComPer != 100) {
			if(whoToAdd4 == 1) {
				a2TimesScoComPer++;
				whoToAdd4++;
			}else if(whoToAdd4 == 2) {
				a2TimesAmpComPer++;
				whoToAdd4 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData4 = FXCollections.observableArrayList(new PieChart.Data("Scoure", a2TimesScoComPer), new PieChart.Data("Amp", a2TimesAmpComPer));
		PieChart a2HumPieC = new PieChart(pieChartData4);
		a2HumPieC.autosize();
		a2HumPieC.setMaxSize(300, 300);
		a2HumPieC.setMinSize(300, 300);
		a2HumPieC.setLabelsVisible(true);
		a2HumPieC.setId("comAllsPieChartId");
		System.out.println("BoopComAlls4.5");
		//alliance 3 cy pie chart
		int a3SpeComPer = (int) ((a3Spe/a3Cy) * 100);
		int a3AmpComPer = (int) ((a3Amp/a3Cy) * 100);
		int a3TrapComPer = (int) ((a3Trap/a3Cy) * 100);
		int whoToAdd5 = 1;
		while(a3SpeComPer + a3AmpComPer + a3TrapComPer != 100) {
			if(whoToAdd5 == 1) {
				a3SpeComPer++;
				whoToAdd5++;
			}else if(whoToAdd5 == 2) {
				a3AmpComPer++;
				whoToAdd5++;
			}else if(whoToAdd5 == 3){
				a3TrapComPer++;
				whoToAdd5 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData5 = FXCollections.observableArrayList(new PieChart.Data("Speaker", a3SpeComPer), new PieChart.Data("Amp", a3AmpComPer), new PieChart.Data("Trap", a3TrapComPer));
		PieChart a3CyPieC = new PieChart(pieChartData5);
		a3CyPieC.autosize();
		a3CyPieC.setMaxSize(300, 300);
		a3CyPieC.setMinSize(300, 300);
		a3CyPieC.setLabelsVisible(true);
		System.out.println("BoopComAlls4.6");
		//alliance 3 hum position pie chart
		System.out.println("BoopComAlls4.6.0" + a3TimesSco);
		System.out.println("BoopComAlls4.6.0" + a3TimesAmp);
		System.out.println("BoopComAlls4.6.0" + a3TotalMatches);
		int a3TimesScoComPer = (int) ((a3TimesSco/a3TotalMatches));
		int a3TimesAmpComPer = (int) ((a3TimesAmp/a3TotalMatches));
		System.out.println("BoopComAlls4.6.1" + a3TimesScoComPer);
		System.out.println("BoopComAlls4.6.1" + a3TimesAmpComPer);
		int whoToAdd6 = 1;
		while(a3TimesScoComPer + a3TimesAmpComPer != 100) {
			if(whoToAdd6 == 1) {
				a3TimesScoComPer++;
				whoToAdd6++;
			}else if(whoToAdd6 == 2) {
				a3TimesAmpComPer++;
				whoToAdd6 = 1;
			}
		}
		System.out.println("BoopComAlls4.6.2" + a3TimesScoComPer);
		System.out.println("BoopComAlls4.6.2" + a3TimesAmpComPer);
		ObservableList<PieChart.Data> pieChartData6 = FXCollections.observableArrayList(new PieChart.Data("Scoure", a3TimesScoComPer), new PieChart.Data("Amp", a3TimesAmpComPer));
		PieChart a3HumPieC = new PieChart(pieChartData6);
		a3HumPieC.autosize();
		a3HumPieC.setMaxSize(300, 300);
		a3HumPieC.setMinSize(300, 300);
		a3HumPieC.setLabelsVisible(true);
		a3HumPieC.setId("comAllsPieChartId");
		System.out.println("BoopComAlls4.7");
		//V Boxes
		Label a1PieCL = new Label("Alliance 1 Pie Charts");
		Label a2PieCL = new Label("Alliance 2 Pie Charts");
		Label a3PieCL = new Label("Alliance 3 Pie Charts");
		a1PieCL.setId("smallTitle");
		a2PieCL.setId("smallTitle");
		a3PieCL.setId("smallTitle");
		BorderPane a1PieCLBP = new BorderPane();
		BorderPane a2PieCLBP = new BorderPane();
		BorderPane a3PieCLBP = new BorderPane();
		a1PieCLBP.setCenter(a1PieCL);
		a2PieCLBP.setCenter(a2PieCL);
		a3PieCLBP.setCenter(a3PieCL);
		a1PieCLBP.setId("comAllsPieCLBP");
		a2PieCLBP.setId("comAllsPieCLBP");
		a3PieCLBP.setId("comAllsPieCLBP");
		VBox a1PieCVB = new VBox(5);
		VBox a2PieCVB = new VBox(5);
		VBox a3PieCVB = new VBox(5);
		a1PieCVB.getChildren().addAll(a1PieCLBP, a1CyPieC, a1HumPieC);
		a2PieCVB.getChildren().addAll(a2PieCLBP, a2CyPieC, a2HumPieC);
		a3PieCVB.getChildren().addAll(a3PieCLBP, a3CyPieC, a3HumPieC);
		HBox pieChartsHB = new HBox(5);
		pieChartsHB.getChildren().addAll(a1PieCVB, a2PieCVB, a3PieCVB);
		this.add(pieChartsHB, 1, 7);
	}
	
	public void addCompare2PieChart(Team a1T1, Team a1T2, Team a1T3, Team a2T1, Team a2T2, Team a2T3) {
		double a1Cy = a1T1.getAvgCycles() + a1T2.getAvgCycles() + a1T3.getAvgCycles();
		double a1Spe = a1T1.getAvgSpe() + a1T2.getAvgSpe() + a1T3.getAvgSpe();
		double a1Amp = a1T1.getAvgAmp() + a1T2.getAvgAmp() + a1T3.getAvgAmp();
		double a1Trap = a1T1.getAvgTrap() + a1T2.getAvgTrap() + a1T3.getAvgTrap();
		double a1TimesSco = a1T1.getAvgCycles() + a1T2.getAvgCycles() + a1T3.getAvgCycles();
		double a1TimesAmp = a1T1.getAvgCycles() + a1T2.getAvgCycles() + a1T3.getAvgCycles();
		double a2Cy = a2T1.getAvgCycles() + a2T2.getAvgCycles() + a2T3.getAvgCycles();
		double a2Spe = a2T1.getAvgSpe() + a2T2.getAvgSpe() + a2T3.getAvgSpe();
		double a2Amp = a2T1.getAvgAmp() + a2T2.getAvgAmp() + a2T3.getAvgAmp();
		double a2Trap = a2T1.getAvgTrap() + a2T2.getAvgTrap() + a2T3.getAvgTrap();
		double a2TimesSco = a2T1.getAvgCycles() + a2T2.getAvgCycles() + a2T3.getAvgCycles();
		double a2TimesAmp = a2T1.getAvgCycles() + a2T2.getAvgCycles() + a2T3.getAvgCycles();
		int a1TotalMatches = a1T1.getTotalMatchesPlayed() + a1T2.getTotalMatchesPlayed() + a1T3.getTotalMatchesPlayed();
		int a2TotalMatches = a2T1.getTotalMatchesPlayed() + a2T2.getTotalMatchesPlayed() + a2T3.getTotalMatchesPlayed();
		//alliance 1 cy pie chart
		int a1SpeComPer = (int) ((a1Spe/a1Cy) * 100);
		int a1AmpComPer = (int) ((a1Amp/a1Cy) * 100);
		int a1TrapComPer = (int) ((a1Trap/a1Cy) * 100);
		int whoToAdd1 = 1;
		while(a1SpeComPer + a1AmpComPer + a1TrapComPer != 100) {
			if(whoToAdd1 == 1) {
				a1SpeComPer++;
				whoToAdd1++;
			}else if(whoToAdd1 == 2) {
				a1AmpComPer++;
				whoToAdd1++;
			}else if(whoToAdd1 == 3){
				a1TrapComPer++;
				whoToAdd1 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData1 = FXCollections.observableArrayList(new PieChart.Data("Speaker", a1SpeComPer), new PieChart.Data("Amp", a1AmpComPer), new PieChart.Data("Trap", a1TrapComPer));
		PieChart a1CyPieC = new PieChart(pieChartData1);
		a1CyPieC.autosize();
		a1CyPieC.setMaxSize(300, 300);
		a1CyPieC.setMinSize(300, 300);
		a1CyPieC.setLabelsVisible(true);
		//alliance 1 hum position pie chart
		int a1TimesScoComPer = (int) ((a1TimesSco/a1TotalMatches));
		int a1TimesAmpComPer = (int) ((a1TimesAmp/a1TotalMatches));
		int whoToAdd2 = 1;
		while(a1TimesScoComPer + a1TimesAmpComPer != 100) {
			if(whoToAdd2 == 1) {
				a1TimesScoComPer++;
				whoToAdd2++;
			}else if(whoToAdd2 == 2) {
				a1TimesAmpComPer++;
				whoToAdd2 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData2 = FXCollections.observableArrayList(new PieChart.Data("Scoure", a1TimesScoComPer), new PieChart.Data("Amp", a1TimesAmpComPer));
		PieChart a1HumPieC = new PieChart(pieChartData2);
		a1HumPieC.autosize();
		a1HumPieC.setMaxSize(300, 300);
		a1HumPieC.setMinSize(300, 300);
		a1HumPieC.setLabelsVisible(true);
		//alliance 2 cy pie chart
		int a2SpeComPer = (int) ((a2Spe/a2Cy) * 100);
		int a2AmpComPer = (int) ((a2Amp/a2Cy) * 100);
		int a2TrapComPer = (int) ((a2Trap/a2Cy) * 100);
		int whoToAdd3 = 1;
		while(a2SpeComPer + a2AmpComPer + a2TrapComPer != 100) {
			if(whoToAdd3 == 1) {
				a2SpeComPer++;
				whoToAdd3++;
			}else if(whoToAdd3 == 2) {
				a2AmpComPer++;
				whoToAdd3++;
			}else if(whoToAdd3 == 3){
				a2TrapComPer++;
				whoToAdd3 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData3 = FXCollections.observableArrayList(new PieChart.Data("Speaker", a2SpeComPer), new PieChart.Data("Amp", a2AmpComPer), new PieChart.Data("Trap", a2TrapComPer));
		PieChart a2CyPieC = new PieChart(pieChartData3);
		a2CyPieC.autosize();
		a2CyPieC.setMaxSize(300, 300);
		a2CyPieC.setMinSize(300, 300);
		a2CyPieC.setLabelsVisible(true);
		//alliance 2 hum position pie chart
		int a2TimesScoComPer = (int) ((a2TimesSco/a2TotalMatches));
		int a2TimesAmpComPer = (int) ((a2TimesAmp/a2TotalMatches));
		int whoToAdd4 = 1;
		while(a2TimesScoComPer + a2TimesAmpComPer != 100) {
			if(whoToAdd4 == 1) {
				a2TimesScoComPer++;
				whoToAdd4++;
			}else if(whoToAdd4 == 2) {
				a2TimesAmpComPer++;
				whoToAdd4 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData4 = FXCollections.observableArrayList(new PieChart.Data("Scoure", a2TimesScoComPer), new PieChart.Data("Amp", a2TimesAmpComPer));
		PieChart a2HumPieC = new PieChart(pieChartData4);
		a2HumPieC.autosize();
		a2HumPieC.setMaxSize(300, 300);
		a2HumPieC.setMinSize(300, 300);
		a2HumPieC.setLabelsVisible(true);
		//V Boxes
		Label a1PieCL = new Label("Alliance 1 Pie Charts");
		Label a2PieCL = new Label("Alliance 2 Pie Charts");
		a1PieCL.setId("smallTitle");
		a2PieCL.setId("smallTitle");
		BorderPane a1PieCLBP = new BorderPane();
		BorderPane a2PieCLBP = new BorderPane();
		a1PieCLBP.setCenter(a1PieCL);
		a2PieCLBP.setCenter(a2PieCL);
		a1PieCLBP.setId("comAllsPieCLBP");
		a2PieCLBP.setId("comAllsPieCLBP");
		VBox a1PieCVB = new VBox(5);
		VBox a2PieCVB = new VBox(5);
		a1PieCVB.getChildren().addAll(a1PieCLBP, a1CyPieC, a1HumPieC);
		a2PieCVB.getChildren().addAll(a2PieCLBP, a2CyPieC, a2HumPieC);
		HBox pieChartsHB = new HBox(5);
		pieChartsHB.getChildren().addAll(a1PieCVB, a2PieCVB);
		this.add(pieChartsHB, 1, 7);
	}
	
	public void addCompare3PlayPieChart(PlayoffAlliance a1, Team a1T1, Team a1T2, Team a1T3, int a1AllNum, PlayoffAlliance a2, Team a2T1, Team a2T2, Team a2T3, int a2AllNum, PlayoffAlliance a3, Team a3T1, Team a3T2, Team a3T3, int a3AllNum) {
		double a1Cy = a1T1.getAvgCycles() + a1T2.getAvgCycles() + a1T3.getAvgCycles();
		double a1Spe = a1T1.getAvgSpe() + a1T2.getAvgSpe() + a1T3.getAvgSpe();
		double a1Amp = a1T1.getAvgAmp() + a1T2.getAvgAmp() + a1T3.getAvgAmp();
		double a1Trap = a1T1.getAvgTrap() + a1T2.getAvgTrap() + a1T3.getAvgTrap();
		double a1Climb = a1T1.getAvgClimb() + a1T2.getAvgClimb() + a1T3.getAvgClimb();
		double a1TimesSco = a1T1.getTimesHumSco() + a1T2.getTimesHumSco() + a1T3.getTimesHumSco();
		double a1TimesAmp = a1T1.getTimesHumAmp() + a1T2.getTimesHumAmp() + a1T3.getTimesHumAmp();
		double a2Cy = a2T1.getAvgCycles() + a2T2.getAvgCycles() + a2T3.getAvgCycles();
		double a2Spe = a2T1.getAvgSpe() + a2T2.getAvgSpe() + a2T3.getAvgSpe();
		double a2Amp = a2T1.getAvgAmp() + a2T2.getAvgAmp() + a2T3.getAvgAmp();
		double a2Trap = a2T1.getAvgTrap() + a2T2.getAvgTrap() + a2T3.getAvgTrap();
		double a2Climb = a2T1.getAvgClimb() + a2T2.getAvgClimb() + a2T3.getAvgClimb();
		double a2TimesSco = a2T1.getTimesHumSco() + a2T2.getTimesHumSco() + a2T3.getTimesHumSco();
		double a2TimesAmp = a2T1.getTimesHumAmp() + a2T2.getTimesHumAmp() + a2T3.getTimesHumAmp();
		double a3Cy = a3T1.getAvgCycles() + a3T2.getAvgCycles() + a3T3.getAvgCycles();
		double a3Spe = a3T1.getAvgSpe() + a3T2.getAvgSpe() + a3T3.getAvgSpe();
		double a3Amp = a3T1.getAvgAmp() + a3T2.getAvgAmp() + a3T3.getAvgAmp();
		double a3Trap = a3T1.getAvgTrap() + a3T2.getAvgTrap() + a3T3.getAvgTrap();
		double a3Climb = a3T1.getAvgClimb() + a3T2.getAvgClimb() + a3T3.getAvgClimb();
		double a3TimesSco = a3T1.getTimesHumSco() + a3T2.getTimesHumSco() + a3T3.getTimesHumSco();
		double a3TimesAmp = a3T1.getTimesHumAmp() + a3T2.getTimesHumAmp() + a3T3.getTimesHumAmp();
		double a1TotalMatches = a1T1.getTotalMatchesPlayed() + a1T2.getTotalMatchesPlayed() + a1T3.getTotalMatchesPlayed();
		double a2TotalMatches = a2T1.getTotalMatchesPlayed() + a2T2.getTotalMatchesPlayed() + a2T3.getTotalMatchesPlayed();
		double a3TotalMatches = a3T1.getTotalMatchesPlayed() + a3T2.getTotalMatchesPlayed() + a3T3.getTotalMatchesPlayed();
		//alliance 1 cy pie chart
		int a1SpeComPer = (int) ((a1Spe/a1Cy) * 100);
		int a1AmpComPer = (int) ((a1Amp/a1Cy) * 100);
		int a1TrapComPer = (int) ((a1Trap/a1Cy) * 100);
		int whoToAdd1 = 1;
		while(a1SpeComPer + a1AmpComPer + a1TrapComPer != 100) {
			if(whoToAdd1 == 1) {
				a1SpeComPer++;
				whoToAdd1++;
			}else if(whoToAdd1 == 2) {
				a1AmpComPer++;
				whoToAdd1++;
			}else if(whoToAdd1 == 3){
				a1TrapComPer++;
				whoToAdd1 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData1 = FXCollections.observableArrayList(new PieChart.Data("Speaker", a1SpeComPer), new PieChart.Data("Amp", a1AmpComPer), new PieChart.Data("Trap", a1TrapComPer));
		PieChart a1CyPieC = new PieChart(pieChartData1);
		a1CyPieC.autosize();
		a1CyPieC.setMaxSize(300, 300);
		a1CyPieC.setMinSize(300, 300);
		a1CyPieC.setLabelsVisible(true);
		//alliance 2 cy pie chart
		int a2SpeComPer = (int) ((a2Spe/a2Cy) * 100);
		int a2AmpComPer = (int) ((a2Amp/a2Cy) * 100);
		int a2TrapComPer = (int) ((a2Trap/a2Cy) * 100);
		int whoToAdd2 = 1;
		while(a2SpeComPer + a2AmpComPer + a2TrapComPer != 100) {
			if(whoToAdd2 == 1) {
				a2SpeComPer++;
				whoToAdd2++;
			}else if(whoToAdd2 == 2) {
				a2AmpComPer++;
				whoToAdd2++;
			}else if(whoToAdd2 == 3){
				a2TrapComPer++;
				whoToAdd2 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData2 = FXCollections.observableArrayList(new PieChart.Data("Speaker", a2SpeComPer), new PieChart.Data("Amp", a2AmpComPer), new PieChart.Data("Trap", a2TrapComPer));
		PieChart a2CyPieC = new PieChart(pieChartData2);
		a2CyPieC.autosize();
		a2CyPieC.setMaxSize(300, 300);
		a2CyPieC.setMinSize(300, 300);
		a2CyPieC.setLabelsVisible(true);
		//alliance 3 cy pie chart
		int a3SpeComPer = (int) ((a3Spe/a3Cy) * 100);
		int a3AmpComPer = (int) ((a3Amp/a3Cy) * 100);
		int a3TrapComPer = (int) ((a3Trap/a3Cy) * 100);
		int whoToAdd3 = 1;
		while(a3SpeComPer + a3AmpComPer + a3TrapComPer != 100) {
			if(whoToAdd3 == 1) {
				a3SpeComPer++;
				whoToAdd3++;
			}else if(whoToAdd3 == 2) {
				a3AmpComPer++;
				whoToAdd3++;
			}else if(whoToAdd3 == 3){
				a3TrapComPer++;
				whoToAdd3 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData3 = FXCollections.observableArrayList(new PieChart.Data("Speaker", a3SpeComPer), new PieChart.Data("Amp", a3AmpComPer), new PieChart.Data("Trap", a3TrapComPer));
		PieChart a3CyPieC = new PieChart(pieChartData3);
		a3CyPieC.autosize();
		a3CyPieC.setMaxSize(300, 300);
		a3CyPieC.setMinSize(300, 300);
		a3CyPieC.setLabelsVisible(true);
		//alliance 1 Hum Player Position
		int a1TimesScoComPer = (int) ((a1TimesSco/a1TotalMatches));
		int a1TimesAmpComPer = (int) ((a1TimesAmp/a1TotalMatches));
		int whoToAdd4 = 1;
		while(a1TimesScoComPer + a1TimesAmpComPer != 100) {
			if(whoToAdd4 == 1) {
				a1TimesScoComPer++;
				whoToAdd4++;
			}else if(whoToAdd4 == 2) {
				a1TimesAmpComPer++;
				whoToAdd4 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData4 = FXCollections.observableArrayList(new PieChart.Data("Scoure", a1TimesScoComPer), new PieChart.Data("Amp", a1TimesAmpComPer));
		PieChart a1HumPieC = new PieChart(pieChartData4);
		a1HumPieC.autosize();
		a1HumPieC.setMaxSize(300, 300);
		a1HumPieC.setMinSize(300, 300);
		a1HumPieC.setLabelsVisible(true);
		//alliance 2 Hum Player Position
		int a2TimesScoComPer = (int) ((a2TimesSco/a2TotalMatches));
		int a2TimesAmpComPer = (int) ((a2TimesAmp/a2TotalMatches));
		int whoToAdd5 = 1;
		while(a2TimesScoComPer + a2TimesAmpComPer != 100) {
			if(whoToAdd5 == 1) {
				a2TimesScoComPer++;
				whoToAdd5++;
			}else if(whoToAdd5 == 2) {
				a2TimesAmpComPer++;
				whoToAdd5 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData5 = FXCollections.observableArrayList(new PieChart.Data("Scoure", a2TimesScoComPer), new PieChart.Data("Amp", a2TimesAmpComPer));
		PieChart a2HumPieC = new PieChart(pieChartData5);
		a2HumPieC.autosize();
		a2HumPieC.setMaxSize(300, 300);
		a2HumPieC.setMinSize(300, 300);
		a2HumPieC.setLabelsVisible(true);
		//alliance 3 Hum Player Position
		int a3TimesScoComPer = (int) ((a3TimesSco/a3TotalMatches));
		int a3TimesAmpComPer = (int) ((a3TimesAmp/a3TotalMatches));
		int whoToAdd6 = 1;
		while(a3TimesScoComPer + a3TimesAmpComPer != 100) {
			if(whoToAdd6 == 1) {
				a3TimesScoComPer++;
				whoToAdd6++;
			}else if(whoToAdd6 == 2) {
				a3TimesAmpComPer++;
				whoToAdd6 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData6 = FXCollections.observableArrayList(new PieChart.Data("Scoure", a3TimesScoComPer), new PieChart.Data("Amp", a3TimesAmpComPer));
		PieChart a3HumPieC = new PieChart(pieChartData6);
		a3HumPieC.autosize();
		a3HumPieC.setMaxSize(300, 300);
		a3HumPieC.setMinSize(300, 300);
		a3HumPieC.setLabelsVisible(true);
	}
	
	public void addCompare2PlayPieChart(PlayoffAlliance a1, Team a1T1, Team a1T2, Team a1T3, int a1AllNum, PlayoffAlliance a2, Team a2T1, Team a2T2, Team a2T3, int a2AllNum) {
		double a1Cy = a1T1.getAvgCycles() + a1T2.getAvgCycles() + a1T3.getAvgCycles();
		double a1Spe = a1T1.getAvgSpe() + a1T2.getAvgSpe() + a1T3.getAvgSpe();
		double a1Amp = a1T1.getAvgAmp() + a1T2.getAvgAmp() + a1T3.getAvgAmp();
		double a1Trap = a1T1.getAvgTrap() + a1T2.getAvgTrap() + a1T3.getAvgTrap();
		double a1Climb = a1T1.getAvgClimb() + a1T2.getAvgClimb() + a1T3.getAvgClimb();
		double a1TimesSco = a1T1.getTimesHumSco() + a1T2.getTimesHumSco() + a1T3.getTimesHumSco();
		double a1TimesAmp = a1T1.getTimesHumAmp() + a1T2.getTimesHumAmp() + a1T3.getTimesHumAmp();
		double a2Cy = a2T1.getAvgCycles() + a2T2.getAvgCycles() + a2T3.getAvgCycles();
		double a2Spe = a2T1.getAvgSpe() + a2T2.getAvgSpe() + a2T3.getAvgSpe();
		double a2Amp = a2T1.getAvgAmp() + a2T2.getAvgAmp() + a2T3.getAvgAmp();
		double a2Trap = a2T1.getAvgTrap() + a2T2.getAvgTrap() + a2T3.getAvgTrap();
		double a2Climb = a2T1.getAvgClimb() + a2T2.getAvgClimb() + a2T3.getAvgClimb();
		double a2TimesSco = a2T1.getTimesHumSco() + a2T2.getTimesHumSco() + a2T3.getTimesHumSco();
		double a2TimesAmp = a2T1.getTimesHumAmp() + a2T2.getTimesHumAmp() + a2T3.getTimesHumAmp();
		double a1TotalMatches = a1T1.getTotalMatchesPlayed() + a1T2.getTotalMatchesPlayed() + a1T3.getTotalMatchesPlayed();
		double a2TotalMatches = a2T1.getTotalMatchesPlayed() + a2T2.getTotalMatchesPlayed() + a2T3.getTotalMatchesPlayed();
		//alliance 1 cy pie chart
		int a1SpeComPer = (int) ((a1Spe/a1Cy) * 100);
		int a1AmpComPer = (int) ((a1Amp/a1Cy) * 100);
		int a1TrapComPer = (int) ((a1Trap/a1Cy) * 100);
		int whoToAdd1 = 1;
		while(a1SpeComPer + a1AmpComPer + a1TrapComPer != 100) {
			if(whoToAdd1 == 1) {
				a1SpeComPer++;
				whoToAdd1++;
			}else if(whoToAdd1 == 2) {
				a1AmpComPer++;
				whoToAdd1++;
			}else if(whoToAdd1 == 3){
				a1TrapComPer++;
				whoToAdd1 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData1 = FXCollections.observableArrayList(new PieChart.Data("Speaker", a1SpeComPer), new PieChart.Data("Amp", a1AmpComPer), new PieChart.Data("Trap", a1TrapComPer));
		PieChart a1CyPieC = new PieChart(pieChartData1);
		a1CyPieC.autosize();
		a1CyPieC.setMaxSize(300, 300);
		a1CyPieC.setMinSize(300, 300);
		a1CyPieC.setLabelsVisible(true);
		//alliance 2 cy pie chart
		int a2SpeComPer = (int) ((a2Spe/a2Cy) * 100);
		int a2AmpComPer = (int) ((a2Amp/a2Cy) * 100);
		int a2TrapComPer = (int) ((a2Trap/a2Cy) * 100);
		int whoToAdd2 = 1;
		while(a2SpeComPer + a2AmpComPer + a2TrapComPer != 100) {
			if(whoToAdd2 == 1) {
				a2SpeComPer++;
				whoToAdd2++;
			}else if(whoToAdd2 == 2) {
				a2AmpComPer++;
				whoToAdd2++;
			}else if(whoToAdd2 == 3){
				a2TrapComPer++;
				whoToAdd2 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData2 = FXCollections.observableArrayList(new PieChart.Data("Speaker", a2SpeComPer), new PieChart.Data("Amp", a2AmpComPer), new PieChart.Data("Trap", a2TrapComPer));
		PieChart a2CyPieC = new PieChart(pieChartData2);
		a2CyPieC.autosize();
		a2CyPieC.setMaxSize(300, 300);
		a2CyPieC.setMinSize(300, 300);
		a2CyPieC.setLabelsVisible(true);
		//alliance 1 Hum Player Position
		int a1TimesScoComPer = (int) ((a1TimesSco/a1TotalMatches));
		int a1TimesAmpComPer = (int) ((a1TimesAmp/a1TotalMatches));
		int whoToAdd4 = 1;
		while(a1TimesScoComPer + a1TimesAmpComPer != 100) {
			if(whoToAdd4 == 1) {
				a1TimesScoComPer++;
				whoToAdd4++;
			}else if(whoToAdd4 == 2) {
				a1TimesAmpComPer++;
				whoToAdd4 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData4 = FXCollections.observableArrayList(new PieChart.Data("Scoure", a1TimesScoComPer), new PieChart.Data("Amp", a1TimesAmpComPer));
		PieChart a1HumPieC = new PieChart(pieChartData4);
		a1HumPieC.autosize();
		a1HumPieC.setMaxSize(300, 300);
		a1HumPieC.setMinSize(300, 300);
		a1HumPieC.setLabelsVisible(true);
		//alliance 2 Hum Player Position
		int a2TimesScoComPer = (int) ((a2TimesSco/a2TotalMatches));
		int a2TimesAmpComPer = (int) ((a2TimesAmp/a2TotalMatches));
		int whoToAdd5 = 1;
		while(a2TimesScoComPer + a2TimesAmpComPer != 100) {
			if(whoToAdd5 == 1) {
				a2TimesScoComPer++;
				whoToAdd5++;
			}else if(whoToAdd5 == 2) {
				a2TimesAmpComPer++;
				whoToAdd5 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData5 = FXCollections.observableArrayList(new PieChart.Data("Scoure", a2TimesScoComPer), new PieChart.Data("Amp", a2TimesAmpComPer));
		PieChart a2HumPieC = new PieChart(pieChartData5);
		a2HumPieC.autosize();
		a2HumPieC.setMaxSize(300, 300);
		a2HumPieC.setMinSize(300, 300);
		a2HumPieC.setLabelsVisible(true);
	}
	
	public void addCompare1AllHas4thPlayAlls(PlayoffAlliance a1, Team a1T1, Team a1T2, Team a1T3, Team a1T4, int a1AllNum) {
		Label a1TitleL = null;
		if(a1AllNum == 1) {
			a1TitleL = new Label("Allaince 1's Stats");
		}
		if(a1AllNum == 2) {
			a1TitleL = new Label("Allaince 2's Stats");
		}
		if(a1AllNum == 3) {
			a1TitleL = new Label("Allaince 3's Stats");
		}
		if(a1AllNum == 4) {
			a1TitleL = new Label("Allaince 4's Stats");
		}
		if(a1AllNum == 5) {
			a1TitleL = new Label("Allaince 5's Stats");
		}
		if(a1AllNum == 6) {
			a1TitleL = new Label("Allaince 6's Stats");
		}
		if(a1AllNum == 7) {
			a1TitleL = new Label("Allaince 7's Stats");
		}
		if(a1AllNum == 8) {
			a1TitleL = new Label("Allaince 8's Stats");
		}
		a1TitleL.setId("smallTitle");
		double a1T1Cy = a1T1.getAvgCycles();
		double a1T2Cy = a1T2.getAvgCycles();
		double a1T3Cy = a1T3.getAvgCycles();
		double a1T4Cy = a1T4.getAvgCycles();
		double a1T4Spe = a1T4.getAvgSpe();
		double a1T4Amp = a1T4.getAvgAmp();
		double a1T4Trap = a1T4.getAvgTrap();
		double a1T4Cli = a1T4.getAvgClimb();
		int a1T4TimesSco = a1T4.getTimesHumSco();
		int a1T4TimesAmp = a1T4.getTimesHumAmp();
		double a1Cy = a1T1Cy + a1T2Cy + a1T3Cy + a1T4Cy;
		Label a1CyL = new Label(Double.toString(a1Cy));
		double a1T1Spe = a1T1.getAvgSpe();
		double a1T2Spe = a1T2.getAvgSpe();
		double a1T3Spe = a1T3.getAvgSpe();
		double a1Spe = a1T1Spe + a1T2Spe + a1T3Spe + a1T4Spe;
		Label a1SpeL = new Label(Double.toString(a1Spe));
		double a1T1Amp = a1T1.getAvgAmp();
		double a1T2Amp = a1T2.getAvgAmp();
		double a1T3Amp = a1T3.getAvgAmp();
		double a1Amp = a1T1Amp + a1T2Amp + a1T3Amp + a1T4Amp;
		Label a1AmpL = new Label(Double.toString(a1Amp));
		double a1T1Trap = a1T1.getAvgTrap();
		double a1T2Trap = a1T2.getAvgTrap();
		double a1T3Trap = a1T3.getAvgTrap();
		double a1Trap = a1T1Trap + a1T2Trap + a1T3Trap + a1T4Trap;
		Label a1TrapL = new Label(Double.toString(a1Trap));
		double a1T1Cli = a1T1.getAvgClimb();
		double a1T2Cli = a1T2.getAvgClimb();
		double a1T3Cli = a1T3.getAvgClimb();
		double a1Cli = a1T1Cli + a1T2Cli + a1T3Cli + a1T4Cli;
		Label a1CliL = new Label(Double.toString(a1Cli));
		int a1T1TimesSco = a1T1.getTimesHumSco();
		int a1T2TimesSco = a1T2.getTimesHumSco();
		int a1T3TimesSco = a1T3.getTimesHumSco();
		int a1TimesSco = a1T1TimesSco + a1T2TimesSco + a1T3TimesSco + a1T4TimesSco;
		Label a1TimesScoL = new Label(Integer.toString(a1TimesSco));
		int a1T1TimesAmp = a1T1.getTimesHumAmp();
		int a1T2TimesAmp = a1T2.getTimesHumAmp();
		int a1T3TimesAmp = a1T3.getTimesHumAmp();
		int a1TimesAmp = a1T1TimesAmp + a1T2TimesAmp + a1T3TimesAmp + a1T4TimesAmp;
		Label a1TimesAmpL = new Label(Integer.toString(a1TimesAmp));
		Label a1TitleCyL = new Label("Avg Cycles");
		Label a1TitleSpeL = new Label("Avg Speaker");
		Label a1TitleAmpL = new Label("Avg Amp");
		Label a1TitleTrapL = new Label("Avg Trap");
		Label a1TitleCliL = new Label("Avg Climb");
		Label a1TitleTimesScoL = new Label("Times Scoure");
		Label a1TitleTimesAmpL = new Label("Times Amp");
		a1CyL.setId("avgStat");
		a1SpeL.setId("avgStat");
		a1AmpL.setId("avgStat");
		a1TrapL.setId("avgStat");
		a1CliL.setId("avgStat");
		a1TimesScoL.setId("avgStat");
		a1TimesAmpL.setId("avgStat");
		a1TimesAmpL.setId("smallTitle");
		a1TitleCyL.setId("smallTitle");
		a1TitleSpeL.setId("smallTitle");
		a1TitleAmpL.setId("smallTitle");
		a1TitleTrapL.setId("smallTitle");
		a1TitleCliL.setId("smallTitle");
		a1TitleTimesScoL.setId("smallTitle");
		a1TitleTimesAmpL.setId("smallTitle");
		BorderPane a1TitleBP = new BorderPane();
		BorderPane a1CyBP = new BorderPane();
		BorderPane a1SpeBP = new BorderPane();
		BorderPane a1AmpBP = new BorderPane();
		BorderPane a1TrapBP = new BorderPane();
		BorderPane a1CliBP = new BorderPane();
		BorderPane a1TimesScoBP = new BorderPane();
		BorderPane a1TimesAmpBP = new BorderPane();
		a1CyBP.setTop(a1TitleCyL);
		a1SpeBP.setTop(a1TitleSpeL);
		a1AmpBP.setTop(a1TitleAmpL);
		a1TrapBP.setTop(a1TitleTrapL);
		a1CliBP.setTop(a1TitleCliL);
		a1TimesScoBP.setTop(a1TitleTimesScoL);
		a1TimesAmpBP.setTop(a1TitleTimesAmpL);
		a1TitleBP.setCenter(a1TitleL);
		a1CyBP.setCenter(a1CyL);
		a1SpeBP.setCenter(a1SpeL);
		a1AmpBP.setCenter(a1AmpL);
		a1TrapBP.setCenter(a1TrapL);
		a1CliBP.setCenter(a1CliL);
		a1TimesScoBP.setCenter(a1TimesScoL);
		a1TimesAmpBP.setCenter(a1TimesAmpL);
		a1TitleBP.setId("comAllsPlayAllTitleBP");
		a1CyBP.setId("comAllsPlayStatBP1");
		a1SpeBP.setId("comAllsPlayStatBP2");
		a1AmpBP.setId("comAllsPlayStatBP3");
		a1TrapBP.setId("comAllsPlayStatBP4");
		a1CliBP.setId("comAllsPlayStatBP5");
		a1TimesScoBP.setId("comAllsPlayStatBP6");
		a1TimesAmpBP.setId("comAllsPlayStatBP7");
		int a1T1TeamNum = a1T1.getTeamNum();
		int a1T2TeamNum = a1T2.getTeamNum();
		int a1T3TeamNum = a1T3.getTeamNum();
		Label a1T1TitleL = new Label(a1T1TeamNum + "'s Stats");
		Label a1T2TitleL = new Label(a1T2TeamNum + "'s Stats");
		Label a1T3TitleL = new Label(a1T3TeamNum + "'s Stats");
		Label a1T1CyL = new Label(Double.toString(a1T1Cy));
		Label a1T1SpeL = new Label(Double.toString(a1T1Spe));
		Label a1T1AmpL = new Label(Double.toString(a1T1Amp));
		Label a1T1TrapL = new Label(Double.toString(a1T1Trap));
		Label a1T1CliL = new Label(Double.toString(a1T1Cli));
		Label a1T1TimesScoL = new Label(Integer.toString(a1T1TimesSco));
		Label a1T1TimesAmpL = new Label(Integer.toString(a1T1TimesAmp));
		Label a1T2CyL = new Label(Double.toString(a1T2Cy));
		Label a1T2SpeL = new Label(Double.toString(a1T2Spe));
		Label a1T2AmpL = new Label(Double.toString(a1T2Amp));
		Label a1T2TrapL = new Label(Double.toString(a1T2Trap));
		Label a1T2CliL = new Label(Double.toString(a1T2Cli));
		Label a1T2TimesScoL = new Label(Integer.toString(a1T2TimesSco));
		Label a1T2TimesAmpL = new Label(Integer.toString(a1T2TimesAmp));
		Label a1T3CyL = new Label(Double.toString(a1T3Cy));
		Label a1T3SpeL = new Label(Double.toString(a1T3Spe));
		Label a1T3AmpL = new Label(Double.toString(a1T3Amp));
		Label a1T3TrapL = new Label(Double.toString(a1T3Trap));
		Label a1T3CliL = new Label(Double.toString(a1T3Cli));
		Label a1T3TimesScoL = new Label(Integer.toString(a1T3TimesSco));
		Label a1T3TimesAmpL = new Label(Integer.toString(a1T3TimesAmp));
		Label a1T1TitleCyL = new Label("Avg Cycles");
		Label a1T1TitleSpeL = new Label("Avg Speaker");
		Label a1T1TitleAmpL = new Label("Avg Amp");
		Label a1T1TitleTrapL = new Label("Avg Trap");
		Label a1T1TitleCliL = new Label("Avg Climb");
		Label a1T1TitleTimesScoL = new Label("Times Scoure");
		Label a1T1TitleTimesAmpL = new Label("Times Amp");
		Label a1T2TitleCyL = new Label("Avg Cycles");
		Label a1T2TitleSpeL = new Label("Avg Speaker");
		Label a1T2TitleAmpL = new Label("Avg Amp");
		Label a1T2TitleTrapL = new Label("Avg Trap");
		Label a1T2TitleCliL = new Label("Avg Climb");
		Label a1T2TitleTimesScoL = new Label("Times Scoure");
		Label a1T2TitleTimesAmpL = new Label("Times Amp");
		Label a1T3TitleCyL = new Label("Avg Cycles");
		Label a1T3TitleSpeL = new Label("Avg Speaker");
		Label a1T3TitleAmpL = new Label("Avg Amp");
		Label a1T3TitleTrapL = new Label("Avg Trap");
		Label a1T3TitleCliL = new Label("Avg Climb");
		Label a1T3TitleTimesScoL = new Label("Times Scoure");
		Label a1T3TitleTimesAmpL = new Label("Times Amp");
		a1T1CyL.setId("avgStat");
		a1T1SpeL.setId("avgStat");
		a1T1AmpL.setId("avgStat");
		a1T1TrapL.setId("avgStat");
		a1T1CliL.setId("avgStat");
		a1T1TimesScoL.setId("avgStat");
		a1T1TimesAmpL.setId("avgStat");
		a1T2CyL.setId("avgStat");
		a1T2SpeL.setId("avgStat");
		a1T2AmpL.setId("avgStat");
		a1T2TrapL.setId("avgStat");
		a1T2CliL.setId("avgStat");
		a1T2TimesScoL.setId("avgStat");
		a1T2TimesAmpL.setId("avgStat");
		a1T3CyL.setId("avgStat");
		a1T3SpeL.setId("avgStat");
		a1T3AmpL.setId("avgStat");
		a1T3TrapL.setId("avgStat");
		a1T3CliL.setId("avgStat");
		a1T3TimesScoL.setId("avgStat");
		a1T3TimesAmpL.setId("avgStat");
		a1T1TitleCyL.setId("smallTitle");
		a1T1TitleSpeL.setId("smallTitle");
		a1T1TitleAmpL.setId("smallTitle");
		a1T1TitleTrapL.setId("smallTitle");
		a1T1TitleCliL.setId("smallTitle");
		a1T1TitleTimesScoL.setId("smallTitle");
		a1T1TitleTimesAmpL.setId("smallTitle");
		a1T2TitleCyL.setId("smallTitle");
		a1T2TitleSpeL.setId("smallTitle");
		a1T2TitleAmpL.setId("smallTitle");
		a1T2TitleTrapL.setId("smallTitle");
		a1T2TitleCliL.setId("smallTitle");
		a1T2TitleTimesScoL.setId("smallTitle");
		a1T2TitleTimesAmpL.setId("smallTitle");
		a1T3TitleCyL.setId("smallTitle");
		a1T3TitleSpeL.setId("smallTitle");
		a1T3TitleAmpL.setId("smallTitle");
		a1T3TitleTrapL.setId("smallTitle");
		a1T3TitleCliL.setId("smallTitle");
		a1T3TitleTimesScoL.setId("smallTitle");
		a1T3TitleTimesAmpL.setId("smallTitle");
		a1T1TitleL.setId("smallTitle");
		a1T2TitleL.setId("smallTitle");
		a1T3TitleL.setId("smallTitle");
		BorderPane a1T1TitleBP = new BorderPane();
		BorderPane a1T1CyBP = new BorderPane();
		BorderPane a1T1SpeBP = new BorderPane();
		BorderPane a1T1AmpBP = new BorderPane();
		BorderPane a1T1TrapBP = new BorderPane();
		BorderPane a1T1CliBP = new BorderPane();
		BorderPane a1T1TimesScoBP = new BorderPane();
		BorderPane a1T1TimesAmpBP = new BorderPane();
		a1T1CyBP.setTop(a1T1TitleCyL);
		a1T1SpeBP.setTop(a1T1TitleSpeL);
		a1T1AmpBP.setTop(a1T1TitleAmpL);
		a1T1TrapBP.setTop(a1T1TitleTrapL);
		a1T1CliBP.setTop(a1T1TitleCliL);
		a1T1TimesScoBP.setTop(a1T1TitleTimesScoL);
		a1T1TimesAmpBP.setTop(a1T1TitleTimesAmpL);
		a1T1TitleBP.setCenter(a1T1TitleL);
		a1T1CyBP.setCenter(a1T1CyL);
		a1T1SpeBP.setCenter(a1T1SpeL);
		a1T1AmpBP.setCenter(a1T1AmpL);
		a1T1TrapBP.setCenter(a1T1TrapL);
		a1T1CliBP.setCenter(a1T1CliL);
		a1T1TimesScoBP.setCenter(a1T1TimesScoL);
		a1T1TimesAmpBP.setCenter(a1T1TimesAmpL);
		a1T1TitleBP.setId("comAllsPlayTitleBP");
		a1T1CyBP.setId("comAllsPlayStatBP1");
		a1T1SpeBP.setId("comAllsPlayStatBP2");
		a1T1AmpBP.setId("comAllsPlayStatBP3");
		a1T1TrapBP.setId("comAllsPlayStatBP4");
		a1T1CliBP.setId("comAllsPlayStatBP5");
		a1T1TimesScoBP.setId("comAllsPlayStatBP6");
		a1T1TimesAmpBP.setId("comAllsPlayStatBP7");
		BorderPane a1T2TitleBP = new BorderPane();
		BorderPane a1T2CyBP = new BorderPane();
		BorderPane a1T2SpeBP = new BorderPane();
		BorderPane a1T2AmpBP = new BorderPane();
		BorderPane a1T2TrapBP = new BorderPane();
		BorderPane a1T2CliBP = new BorderPane();
		BorderPane a1T2TimesScoBP = new BorderPane();
		BorderPane a1T2TimesAmpBP = new BorderPane();
		a1T2CyBP.setTop(a1T2TitleCyL);
		a1T2SpeBP.setTop(a1T2TitleSpeL);
		a1T2AmpBP.setTop(a1T2TitleAmpL);
		a1T2TrapBP.setTop(a1T2TitleTrapL);
		a1T2CliBP.setTop(a1T2TitleCliL);
		a1T2TimesScoBP.setTop(a1T2TitleTimesScoL);
		a1T2TimesAmpBP.setTop(a1T2TitleTimesAmpL);
		a1T2TitleBP.setCenter(a1T2TitleL);
		a1T2CyBP.setCenter(a1T2CyL);
		a1T2SpeBP.setCenter(a1T2SpeL);
		a1T2AmpBP.setCenter(a1T2AmpL);
		a1T2TrapBP.setCenter(a1T2TrapL);
		a1T2CliBP.setCenter(a1T2CliL);
		a1T2TimesScoBP.setCenter(a1T2TimesScoL);
		a1T2TimesAmpBP.setCenter(a1T2TimesAmpL);
		a1T2TitleBP.setId("comAllsPlayTitleBP");
		a1T2CyBP.setId("comAllsPlayStatBP1");
		a1T2SpeBP.setId("comAllsPlayStatBP2");
		a1T2AmpBP.setId("comAllsPlayStatBP3");
		a1T2TrapBP.setId("comAllsPlayStatBP4");
		a1T2CliBP.setId("comAllsPlayStatBP5");
		a1T2TimesScoBP.setId("comAllsPlayStatBP6");
		a1T2TimesAmpBP.setId("comAllsPlayStatBP7");
		BorderPane a1T3TitleBP = new BorderPane();
		BorderPane a1T3CyBP = new BorderPane();
		BorderPane a1T3SpeBP = new BorderPane();
		BorderPane a1T3AmpBP = new BorderPane();
		BorderPane a1T3TrapBP = new BorderPane();
		BorderPane a1T3CliBP = new BorderPane();
		BorderPane a1T3TimesScoBP = new BorderPane();
		BorderPane a1T3TimesAmpBP = new BorderPane();
		a1T3CyBP.setTop(a1T3TitleCyL);
		a1T3SpeBP.setTop(a1T3TitleSpeL);
		a1T3AmpBP.setTop(a1T3TitleAmpL);
		a1T3TrapBP.setTop(a1T3TitleTrapL);
		a1T3CliBP.setTop(a1T3TitleCliL);
		a1T3TimesScoBP.setTop(a1T3TitleTimesScoL);
		a1T3TimesAmpBP.setTop(a1T3TitleTimesAmpL);
		a1T3TitleBP.setCenter(a1T3TitleL);
		a1T3CyBP.setCenter(a1T3CyL);
		a1T3SpeBP.setCenter(a1T3SpeL);
		a1T3AmpBP.setCenter(a1T3AmpL);
		a1T3TrapBP.setCenter(a1T3TrapL);
		a1T3CliBP.setCenter(a1T3CliL);
		a1T3TimesScoBP.setCenter(a1TimesScoL);
		a1T3TimesAmpBP.setCenter(a1T3TimesAmpL);
		a1T3TitleBP.setId("comAllsPlayTitleBP");
		a1T3CyBP.setId("comAllsPlayStatBP1");
		a1T3SpeBP.setId("comAllsPlayStatBP2");
		a1T3AmpBP.setId("comAllsPlayStatBP3");
		a1T3TrapBP.setId("comAllsPlayStatBP4");
		a1T3CliBP.setId("comAllsPlayStatBP5");
		a1T3TimesScoBP.setId("comAllsPlayStatBP6");
		a1T3TimesAmpBP.setId("comAllsPlayStatBP7");
		Label a1T4CyL = new Label(Double.toString(a1T4Cy));
		Label a1T4SpeL = new Label(Double.toString(a1T4Spe));
		Label a1T4AmpL = new Label(Double.toString(a1T4Amp));
		Label a1T4TrapL = new Label(Double.toString(a1T4Trap));
		Label a1T4CliL = new Label(Double.toString(a1T4Cli));
		Label a1T4TimesScoL = new Label(Integer.toString(a1T4TimesSco));
		Label a1T4TimesAmpL = new Label(Integer.toString(a1T4TimesAmp));
		Label a1T4TitleCyL = new Label("Avg Cycles");
		Label a1T4TitleSpeL = new Label("Avg Speaker");
		Label a1T4TitleAmpL = new Label("Avg Amp");
		Label a1T4TitleTrapL = new Label("Avg Trap");
		Label a1T4TitleCliL = new Label("Avg Climb");
		Label a1T4TitleTimesScoL = new Label("Times Scoure");
		Label a1T4TitleTimesAmpL = new Label("Times Amp");
		int a1T4TeamNum = a1T4.getTeamNum();
		Label a1T4TitleL = new Label(a1T4TeamNum + "'s Stats");
		a1T4CyL.setId("avgStat");
		a1T4SpeL.setId("avgStat");
		a1T4AmpL.setId("avgStat");
		a1T4TrapL.setId("avgStat");
		a1T4CliL.setId("avgStat");
		a1T4TimesScoL.setId("avgStat");
		a1T4TimesAmpL.setId("avgStat");
		a1T4TitleCyL.setId("smallTitle");
		a1T4TitleSpeL.setId("smallTitle");
		a1T4TitleAmpL.setId("smallTitle");
		a1T4TitleTrapL.setId("smallTitle");
		a1T4TitleCliL.setId("smallTitle");
		a1T4TitleTimesScoL.setId("smallTitle");
		a1T4TitleTimesAmpL.setId("smallTitle");
		a1T4TitleL.setId("smallTitle");
		BorderPane a1T4TitleBP = new BorderPane();
		BorderPane a1T4CyBP = new BorderPane();
		BorderPane a1T4SpeBP = new BorderPane();
		BorderPane a1T4AmpBP = new BorderPane();
		BorderPane a1T4TrapBP = new BorderPane();
		BorderPane a1T4CliBP = new BorderPane();
		BorderPane a1T4TimesScoBP = new BorderPane();
		BorderPane a1T4TimesAmpBP = new BorderPane();
		a1T4CyBP.setTop(a1T4TitleCyL);
		a1T4SpeBP.setTop(a1T4TitleSpeL);
		a1T4AmpBP.setTop(a1T4TitleAmpL);
		a1T4TrapBP.setTop(a1T4TitleTrapL);
		a1T4CliBP.setTop(a1T4TitleCliL);
		a1T4TimesScoBP.setTop(a1T4TitleTimesScoL);
		a1T4TimesAmpBP.setTop(a1T4TitleTimesAmpL);
		a1T4TitleBP.setCenter(a1T4TitleL);
		a1T4CyBP.setCenter(a1T4CyL);
		a1T4SpeBP.setCenter(a1T4SpeL);
		a1T4AmpBP.setCenter(a1T4AmpL);
		a1T4TrapBP.setCenter(a1T4TrapL);
		a1T4CliBP.setCenter(a1T4CliL);
		a1T4TimesScoBP.setCenter(a1T4TimesScoL);
		a1T4TimesAmpBP.setCenter(a1T4TimesAmpL);
		a1T4TitleBP.setId("comAllsPlayTitleBP");
		a1T4CyBP.setId("comAllsPlayStatBP1");
		a1T4SpeBP.setId("comAllsPlayStatBP2");
		a1T4AmpBP.setId("comAllsPlayStatBP3");
		a1T4TrapBP.setId("comAllsPlayStatBP4");
		a1T4CliBP.setId("comAllsPlayStatBP5");
		a1T4TimesScoBP.setId("comAllsPlayStatBP6");
		a1T4TimesAmpBP.setId("comAllsPlayStatBP7");
		VBox a1T4VB = new VBox(5);
		a1T4VB.getChildren().addAll(a1T4TitleBP, a1T4CyBP, a1T4SpeBP, a1T4AmpBP, a1T4TrapBP, a1T4CliBP, a1T4TimesScoBP, a1T4TimesAmpBP);
		VBox a1VB = new VBox(5);
		VBox a1T1VB = new VBox(5);
		VBox a1T2VB = new VBox(5);
		VBox a1T3VB = new VBox(5);
		a1VB.getChildren().addAll(a1TitleBP, a1CyBP, a1SpeBP, a1AmpBP, a1TrapBP, a1CliBP, a1TimesScoBP, a1TimesAmpBP);
		a1T1VB.getChildren().addAll(a1T1TitleBP, a1T1CyBP, a1T1SpeBP, a1T1AmpBP, a1T1TrapBP, a1T1CliBP, a1T1TimesScoBP, a1T1TimesAmpBP);
		a1T2VB.getChildren().addAll(a1T2TitleBP, a1T2CyBP, a1T2SpeBP, a1T2AmpBP, a1T2TrapBP, a1T2CliBP, a1T2TimesScoBP, a1T2TimesAmpBP);
		a1T3VB.getChildren().addAll(a1T3TitleBP, a1T3CyBP, a1T3SpeBP, a1T3AmpBP, a1T3TrapBP, a1T3CliBP, a1T3TimesScoBP, a1T3TimesAmpBP);
		all1HB.getChildren().addAll(a1VB, a1T1VB, a1T2VB, a1T3VB);
		all1HB.getChildren().addAll(a1T4VB);
	}
	
	public void addCompare1AllNo4thPlayAlls(PlayoffAlliance a1, Team a1T1, Team a1T2, Team a1T3, int a1AllNum) {
		Label a1TitleL = null;
		if(a1AllNum == 1) {
			a1TitleL = new Label("Allaince 1's Stats");
		}
		if(a1AllNum == 2) {
			a1TitleL = new Label("Allaince 2's Stats");
		}
		if(a1AllNum == 3) {
			a1TitleL = new Label("Allaince 3's Stats");
		}
		if(a1AllNum == 4) {
			a1TitleL = new Label("Allaince 4's Stats");
		}
		if(a1AllNum == 5) {
			a1TitleL = new Label("Allaince 5's Stats");
		}
		if(a1AllNum == 6) {
			a1TitleL = new Label("Allaince 6's Stats");
		}
		if(a1AllNum == 7) {
			a1TitleL = new Label("Allaince 7's Stats");
		}
		if(a1AllNum == 8) {
			a1TitleL = new Label("Allaince 8's Stats");
		}
		a1TitleL.setId("smallTitle");
		double a1T1Cy = a1T1.getAvgCycles();
		double a1T2Cy = a1T2.getAvgCycles();
		double a1T3Cy = a1T3.getAvgCycles();
		double a1Cy = a1T1Cy + a1T2Cy + a1T3Cy;
		Label a1CyL = new Label(Double.toString(a1Cy));
		double a1T1Spe = a1T1.getAvgSpe();
		double a1T2Spe = a1T2.getAvgSpe();
		double a1T3Spe = a1T3.getAvgSpe();
		double a1Spe = a1T1Spe + a1T2Spe + a1T3Spe;
		Label a1SpeL = new Label(Double.toString(a1Spe));
		double a1T1Amp = a1T1.getAvgAmp();
		double a1T2Amp = a1T2.getAvgAmp();
		double a1T3Amp = a1T3.getAvgAmp();
		double a1Amp = a1T1Amp + a1T2Amp + a1T3Amp;
		Label a1AmpL = new Label(Double.toString(a1Amp));
		double a1T1Trap = a1T1.getAvgTrap();
		double a1T2Trap = a1T2.getAvgTrap();
		double a1T3Trap = a1T3.getAvgTrap();
		double a1Trap = a1T1Trap + a1T2Trap + a1T3Trap;
		Label a1TrapL = new Label(Double.toString(a1Trap));
		double a1T1Cli = a1T1.getAvgClimb();
		double a1T2Cli = a1T2.getAvgClimb();
		double a1T3Cli = a1T3.getAvgClimb();
		double a1Cli = a1T1Cli + a1T2Cli + a1T3Cli;
		Label a1CliL = new Label(Double.toString(a1Cli));
		int a1T1TimesSco = a1T1.getTimesHumSco();
		int a1T2TimesSco = a1T2.getTimesHumSco();
		int a1T3TimesSco = a1T3.getTimesHumSco();
		int a1TimesSco = a1T1TimesSco + a1T2TimesSco + a1T3TimesSco;
		Label a1TimesScoL = new Label(Integer.toString(a1TimesSco));
		int a1T1TimesAmp = a1T1.getTimesHumAmp();
		int a1T2TimesAmp = a1T2.getTimesHumAmp();
		int a1T3TimesAmp = a1T3.getTimesHumAmp();
		int a1TimesAmp = a1T1TimesAmp + a1T2TimesAmp + a1T3TimesAmp;
		Label a1TimesAmpL = new Label(Integer.toString(a1TimesAmp));
		Label a1TitleCyL = new Label("Avg Cycles");
		Label a1TitleSpeL = new Label("Avg Speaker");
		Label a1TitleAmpL = new Label("Avg Amp");
		Label a1TitleTrapL = new Label("Avg Trap");
		Label a1TitleCliL = new Label("Avg Climb");
		Label a1TitleTimesScoL = new Label("Times Scoure");
		Label a1TitleTimesAmpL = new Label("Times Amp");
		a1CyL.setId("avgStat");
		a1SpeL.setId("avgStat");
		a1AmpL.setId("avgStat");
		a1TrapL.setId("avgStat");
		a1CliL.setId("avgStat");
		a1TimesScoL.setId("avgStat");
		a1TimesAmpL.setId("avgStat");
		a1TimesAmpL.setId("smallTitle");
		a1TitleCyL.setId("smallTitle");
		a1TitleSpeL.setId("smallTitle");
		a1TitleAmpL.setId("smallTitle");
		a1TitleTrapL.setId("smallTitle");
		a1TitleCliL.setId("smallTitle");
		a1TitleTimesScoL.setId("smallTitle");
		a1TitleTimesAmpL.setId("smallTitle");
		BorderPane a1TitleBP = new BorderPane();
		BorderPane a1CyBP = new BorderPane();
		BorderPane a1SpeBP = new BorderPane();
		BorderPane a1AmpBP = new BorderPane();
		BorderPane a1TrapBP = new BorderPane();
		BorderPane a1CliBP = new BorderPane();
		BorderPane a1TimesScoBP = new BorderPane();
		BorderPane a1TimesAmpBP = new BorderPane();
		a1CyBP.setTop(a1TitleCyL);
		a1SpeBP.setTop(a1TitleSpeL);
		a1AmpBP.setTop(a1TitleAmpL);
		a1TrapBP.setTop(a1TitleTrapL);
		a1CliBP.setTop(a1TitleCliL);
		a1TimesScoBP.setTop(a1TitleTimesScoL);
		a1TimesAmpBP.setTop(a1TitleTimesAmpL);
		a1TitleBP.setCenter(a1TitleL);
		a1CyBP.setCenter(a1CyL);
		a1SpeBP.setCenter(a1SpeL);
		a1AmpBP.setCenter(a1AmpL);
		a1TrapBP.setCenter(a1TrapL);
		a1CliBP.setCenter(a1CliL);
		a1TimesScoBP.setCenter(a1TimesScoL);
		a1TimesAmpBP.setCenter(a1TimesAmpL);
		a1TitleBP.setId("comAllsPlayAllTitleBP");
		a1CyBP.setId("comAllsPlayStatBP1");
		a1SpeBP.setId("comAllsPlayStatBP2");
		a1AmpBP.setId("comAllsPlayStatBP3");
		a1TrapBP.setId("comAllsPlayStatBP4");
		a1CliBP.setId("comAllsPlayStatBP5");
		a1TimesScoBP.setId("comAllsPlayStatBP6");
		a1TimesAmpBP.setId("comAllsPlayStatBP7");
		int a1T1TeamNum = a1T1.getTeamNum();
		int a1T2TeamNum = a1T2.getTeamNum();
		int a1T3TeamNum = a1T3.getTeamNum();
		Label a1T1TitleL = new Label(a1T1TeamNum + "'s Stats");
		Label a1T2TitleL = new Label(a1T2TeamNum + "'s Stats");
		Label a1T3TitleL = new Label(a1T3TeamNum + "'s Stats");
		Label a1T1CyL = new Label(Double.toString(a1T1Cy));
		Label a1T1SpeL = new Label(Double.toString(a1T1Spe));
		Label a1T1AmpL = new Label(Double.toString(a1T1Amp));
		Label a1T1TrapL = new Label(Double.toString(a1T1Trap));
		Label a1T1CliL = new Label(Double.toString(a1T1Cli));
		Label a1T1TimesScoL = new Label(Integer.toString(a1T1TimesSco));
		Label a1T1TimesAmpL = new Label(Integer.toString(a1T1TimesAmp));
		Label a1T2CyL = new Label(Double.toString(a1T2Cy));
		Label a1T2SpeL = new Label(Double.toString(a1T2Spe));
		Label a1T2AmpL = new Label(Double.toString(a1T2Amp));
		Label a1T2TrapL = new Label(Double.toString(a1T2Trap));
		Label a1T2CliL = new Label(Double.toString(a1T2Cli));
		Label a1T2TimesScoL = new Label(Integer.toString(a1T2TimesSco));
		Label a1T2TimesAmpL = new Label(Integer.toString(a1T2TimesAmp));
		Label a1T3CyL = new Label(Double.toString(a1T3Cy));
		Label a1T3SpeL = new Label(Double.toString(a1T3Spe));
		Label a1T3AmpL = new Label(Double.toString(a1T3Amp));
		Label a1T3TrapL = new Label(Double.toString(a1T3Trap));
		Label a1T3CliL = new Label(Double.toString(a1T3Cli));
		Label a1T3TimesScoL = new Label(Integer.toString(a1T3TimesSco));
		Label a1T3TimesAmpL = new Label(Integer.toString(a1T3TimesAmp));
		Label a1T1TitleCyL = new Label("Avg Cycles");
		Label a1T1TitleSpeL = new Label("Avg Speaker");
		Label a1T1TitleAmpL = new Label("Avg Amp");
		Label a1T1TitleTrapL = new Label("Avg Trap");
		Label a1T1TitleCliL = new Label("Avg Climb");
		Label a1T1TitleTimesScoL = new Label("Times Scoure");
		Label a1T1TitleTimesAmpL = new Label("Times Amp");
		Label a1T2TitleCyL = new Label("Avg Cycles");
		Label a1T2TitleSpeL = new Label("Avg Speaker");
		Label a1T2TitleAmpL = new Label("Avg Amp");
		Label a1T2TitleTrapL = new Label("Avg Trap");
		Label a1T2TitleCliL = new Label("Avg Climb");
		Label a1T2TitleTimesScoL = new Label("Times Scoure");
		Label a1T2TitleTimesAmpL = new Label("Times Amp");
		Label a1T3TitleCyL = new Label("Avg Cycles");
		Label a1T3TitleSpeL = new Label("Avg Speaker");
		Label a1T3TitleAmpL = new Label("Avg Amp");
		Label a1T3TitleTrapL = new Label("Avg Trap");
		Label a1T3TitleCliL = new Label("Avg Climb");
		Label a1T3TitleTimesScoL = new Label("Times Scoure");
		Label a1T3TitleTimesAmpL = new Label("Times Amp");
		a1T1CyL.setId("avgStat");
		a1T1SpeL.setId("avgStat");
		a1T1AmpL.setId("avgStat");
		a1T1TrapL.setId("avgStat");
		a1T1CliL.setId("avgStat");
		a1T1TimesScoL.setId("avgStat");
		a1T1TimesAmpL.setId("avgStat");
		a1T2CyL.setId("avgStat");
		a1T2SpeL.setId("avgStat");
		a1T2AmpL.setId("avgStat");
		a1T2TrapL.setId("avgStat");
		a1T2CliL.setId("avgStat");
		a1T2TimesScoL.setId("avgStat");
		a1T2TimesAmpL.setId("avgStat");
		a1T3CyL.setId("avgStat");
		a1T3SpeL.setId("avgStat");
		a1T3AmpL.setId("avgStat");
		a1T3TrapL.setId("avgStat");
		a1T3CliL.setId("avgStat");
		a1T3TimesScoL.setId("avgStat");
		a1T3TimesAmpL.setId("avgStat");
		a1T1TitleCyL.setId("smallTitle");
		a1T1TitleSpeL.setId("smallTitle");
		a1T1TitleAmpL.setId("smallTitle");
		a1T1TitleTrapL.setId("smallTitle");
		a1T1TitleCliL.setId("smallTitle");
		a1T1TitleTimesScoL.setId("smallTitle");
		a1T1TitleTimesAmpL.setId("smallTitle");
		a1T2TitleCyL.setId("smallTitle");
		a1T2TitleSpeL.setId("smallTitle");
		a1T2TitleAmpL.setId("smallTitle");
		a1T2TitleTrapL.setId("smallTitle");
		a1T2TitleCliL.setId("smallTitle");
		a1T2TitleTimesScoL.setId("smallTitle");
		a1T2TitleTimesAmpL.setId("smallTitle");
		a1T3TitleCyL.setId("smallTitle");
		a1T3TitleSpeL.setId("smallTitle");
		a1T3TitleAmpL.setId("smallTitle");
		a1T3TitleTrapL.setId("smallTitle");
		a1T3TitleCliL.setId("smallTitle");
		a1T3TitleTimesScoL.setId("smallTitle");
		a1T3TitleTimesAmpL.setId("smallTitle");
		a1T1TitleL.setId("smallTitle");
		a1T2TitleL.setId("smallTitle");
		a1T3TitleL.setId("smallTitle");
		BorderPane a1T1TitleBP = new BorderPane();
		BorderPane a1T1CyBP = new BorderPane();
		BorderPane a1T1SpeBP = new BorderPane();
		BorderPane a1T1AmpBP = new BorderPane();
		BorderPane a1T1TrapBP = new BorderPane();
		BorderPane a1T1CliBP = new BorderPane();
		BorderPane a1T1TimesScoBP = new BorderPane();
		BorderPane a1T1TimesAmpBP = new BorderPane();
		a1T1CyBP.setTop(a1T1TitleCyL);
		a1T1SpeBP.setTop(a1T1TitleSpeL);
		a1T1AmpBP.setTop(a1T1TitleAmpL);
		a1T1TrapBP.setTop(a1T1TitleTrapL);
		a1T1CliBP.setTop(a1T1TitleCliL);
		a1T1TimesScoBP.setTop(a1T1TitleTimesScoL);
		a1T1TimesAmpBP.setTop(a1T1TitleTimesAmpL);
		a1T1TitleBP.setCenter(a1T1TitleL);
		a1T1CyBP.setCenter(a1T1CyL);
		a1T1SpeBP.setCenter(a1T1SpeL);
		a1T1AmpBP.setCenter(a1T1AmpL);
		a1T1TrapBP.setCenter(a1T1TrapL);
		a1T1CliBP.setCenter(a1T1CliL);
		a1T1TimesScoBP.setCenter(a1T1TimesScoL);
		a1T1TimesAmpBP.setCenter(a1T1TimesAmpL);
		a1T1TitleBP.setId("comAllsPlayTitleBP");
		a1T1CyBP.setId("comAllsPlayStatBP1");
		a1T1SpeBP.setId("comAllsPlayStatBP2");
		a1T1AmpBP.setId("comAllsPlayStatBP3");
		a1T1TrapBP.setId("comAllsPlayStatBP4");
		a1T1CliBP.setId("comAllsPlayStatBP5");
		a1T1TimesScoBP.setId("comAllsPlayStatBP6");
		a1T1TimesAmpBP.setId("comAllsPlayStatBP7");
		BorderPane a1T2TitleBP = new BorderPane();
		BorderPane a1T2CyBP = new BorderPane();
		BorderPane a1T2SpeBP = new BorderPane();
		BorderPane a1T2AmpBP = new BorderPane();
		BorderPane a1T2TrapBP = new BorderPane();
		BorderPane a1T2CliBP = new BorderPane();
		BorderPane a1T2TimesScoBP = new BorderPane();
		BorderPane a1T2TimesAmpBP = new BorderPane();
		a1T2CyBP.setTop(a1T2TitleCyL);
		a1T2SpeBP.setTop(a1T2TitleSpeL);
		a1T2AmpBP.setTop(a1T2TitleAmpL);
		a1T2TrapBP.setTop(a1T2TitleTrapL);
		a1T2CliBP.setTop(a1T2TitleCliL);
		a1T2TimesScoBP.setTop(a1T2TitleTimesScoL);
		a1T2TimesAmpBP.setTop(a1T2TitleTimesAmpL);
		a1T2TitleBP.setCenter(a1T2TitleL);
		a1T2CyBP.setCenter(a1T2CyL);
		a1T2SpeBP.setCenter(a1T2SpeL);
		a1T2AmpBP.setCenter(a1T2AmpL);
		a1T2TrapBP.setCenter(a1T2TrapL);
		a1T2CliBP.setCenter(a1T2CliL);
		a1T2TimesScoBP.setCenter(a1T2TimesScoL);
		a1T2TimesAmpBP.setCenter(a1T2TimesAmpL);
		a1T2TitleBP.setId("comAllsPlayTitleBP");
		a1T2CyBP.setId("comAllsPlayStatBP1");
		a1T2SpeBP.setId("comAllsPlayStatBP2");
		a1T2AmpBP.setId("comAllsPlayStatBP3");
		a1T2TrapBP.setId("comAllsPlayStatBP4");
		a1T2CliBP.setId("comAllsPlayStatBP5");
		a1T2TimesScoBP.setId("comAllsPlayStatBP6");
		a1T2TimesAmpBP.setId("comAllsPlayStatBP7");
		BorderPane a1T3TitleBP = new BorderPane();
		BorderPane a1T3CyBP = new BorderPane();
		BorderPane a1T3SpeBP = new BorderPane();
		BorderPane a1T3AmpBP = new BorderPane();
		BorderPane a1T3TrapBP = new BorderPane();
		BorderPane a1T3CliBP = new BorderPane();
		BorderPane a1T3TimesScoBP = new BorderPane();
		BorderPane a1T3TimesAmpBP = new BorderPane();
		a1T3CyBP.setTop(a1T3TitleCyL);
		a1T3SpeBP.setTop(a1T3TitleSpeL);
		a1T3AmpBP.setTop(a1T3TitleAmpL);
		a1T3TrapBP.setTop(a1T3TitleTrapL);
		a1T3CliBP.setTop(a1T3TitleCliL);
		a1T3TimesScoBP.setTop(a1T3TitleTimesScoL);
		a1T3TimesAmpBP.setTop(a1T3TitleTimesAmpL);
		a1T3TitleBP.setCenter(a1T3TitleL);
		a1T3CyBP.setCenter(a1T3CyL);
		a1T3SpeBP.setCenter(a1T3SpeL);
		a1T3AmpBP.setCenter(a1T3AmpL);
		a1T3TrapBP.setCenter(a1T3TrapL);
		a1T3CliBP.setCenter(a1T3CliL);
		a1T3TimesScoBP.setCenter(a1TimesScoL);
		a1T3TimesAmpBP.setCenter(a1T3TimesAmpL);
		a1T3TitleBP.setId("comAllsPlayTitleBP");
		a1T3CyBP.setId("comAllsPlayStatBP1");
		a1T3SpeBP.setId("comAllsPlayStatBP2");
		a1T3AmpBP.setId("comAllsPlayStatBP3");
		a1T3TrapBP.setId("comAllsPlayStatBP4");
		a1T3CliBP.setId("comAllsPlayStatBP5");
		a1T3TimesScoBP.setId("comAllsPlayStatBP6");
		a1T3TimesAmpBP.setId("comAllsPlayStatBP7");
		VBox a1VB = new VBox(5);
		VBox a1T1VB = new VBox(5);
		VBox a1T2VB = new VBox(5);
		VBox a1T3VB = new VBox(5);
		a1VB.getChildren().addAll(a1TitleBP, a1CyBP, a1SpeBP, a1AmpBP, a1TrapBP, a1CliBP, a1TimesScoBP, a1TimesAmpBP);
		a1T1VB.getChildren().addAll(a1T1TitleBP, a1T1CyBP, a1T1SpeBP, a1T1AmpBP, a1T1TrapBP, a1T1CliBP, a1T1TimesScoBP, a1T1TimesAmpBP);
		a1T2VB.getChildren().addAll(a1T2TitleBP, a1T2CyBP, a1T2SpeBP, a1T2AmpBP, a1T2TrapBP, a1T2CliBP, a1T2TimesScoBP, a1T2TimesAmpBP);
		a1T3VB.getChildren().addAll(a1T3TitleBP, a1T3CyBP, a1T3SpeBP, a1T3AmpBP, a1T3TrapBP, a1T3CliBP, a1T3TimesScoBP, a1T3TimesAmpBP);
		all1HB.getChildren().addAll(a1VB, a1T1VB, a1T2VB, a1T3VB);
	}
	
	public void addCompare2AllHas4thPlayAlls(PlayoffAlliance a2, Team a2T1, Team a2T2, Team a2T3, Team a2T4, int a2AllNum) {
		Label a2TitleL = null;
		if(a2AllNum == 1) {
			a2TitleL = new Label("Allaince 1's Stats");
		}
		if(a2AllNum == 2) {
			a2TitleL = new Label("Allaince 2's Stats");
		}
		if(a2AllNum == 3) {
			a2TitleL = new Label("Allaince 3's Stats");
		}
		if(a2AllNum == 4) {
			a2TitleL = new Label("Allaince 4's Stats");
		}
		if(a2AllNum == 5) {
			a2TitleL = new Label("Allaince 5's Stats");
		}
		if(a2AllNum == 6) {
			a2TitleL = new Label("Allaince 6's Stats");
		}
		if(a2AllNum == 7) {
			a2TitleL = new Label("Allaince 7's Stats");
		}
		if(a2AllNum == 8) {
			a2TitleL = new Label("Allaince 8's Stats");
		}
		a2TitleL.setId("smallTitle");
		double a2T1Cy = a2T1.getAvgCycles();
		double a2T2Cy = a2T2.getAvgCycles();
		double a2T3Cy = a2T3.getAvgCycles();
		double a2T4Cy = a2T4.getAvgCycles();
		double a2T4Spe = a2T4.getAvgSpe();
		double a2T4Amp = a2T4.getAvgAmp();
		double a2T4Trap = a2T4.getAvgTrap();
		double a2T4Cli = a2T4.getAvgClimb();
		int a2T4TimesSco = a2T4.getTimesHumSco();
		int a2T4TimesAmp = a2T4.getTimesHumAmp();
		double a2Cy = a2T1Cy + a2T2Cy + a2T3Cy + a2T4Cy;
		Label a2CyL = new Label(Double.toString(a2Cy));
		double a2T1Spe = a2T1.getAvgSpe();
		double a2T2Spe = a2T2.getAvgSpe();
		double a2T3Spe = a2T3.getAvgSpe();
		double a2Spe = a2T1Spe + a2T2Spe + a2T3Spe + a2T4Spe;
		Label a2SpeL = new Label(Double.toString(a2Spe));
		double a2T1Amp = a2T1.getAvgAmp();
		double a2T2Amp = a2T2.getAvgAmp();
		double a2T3Amp = a2T3.getAvgAmp();
		double a2Amp = a2T1Amp + a2T2Amp + a2T3Amp + a2T4Amp;
		Label a2AmpL = new Label(Double.toString(a2Amp));
		double a2T1Trap = a2T1.getAvgTrap();
		double a2T2Trap = a2T2.getAvgTrap();
		double a2T3Trap = a2T3.getAvgTrap();
		double a2Trap = a2T1Trap + a2T2Trap + a2T3Trap + a2T4Trap;
		Label a2TrapL = new Label(Double.toString(a2Trap));
		double a2T1Cli = a2T1.getAvgClimb();
		double a2T2Cli = a2T2.getAvgClimb();
		double a2T3Cli = a2T3.getAvgClimb();
		double a2Cli = a2T1Cli + a2T2Cli + a2T3Cli + a2T4Cli;
		Label a2CliL = new Label(Double.toString(a2Cli));
		int a2T1TimesSco = a2T1.getTimesHumSco();
		int a2T2TimesSco = a2T2.getTimesHumSco();
		int a2T3TimesSco = a2T3.getTimesHumSco();
		int a2TimesSco = a2T1TimesSco + a2T2TimesSco + a2T3TimesSco + a2T4TimesSco;
		Label a2TimesScoL = new Label(Integer.toString(a2TimesSco));
		int a2T1TimesAmp = a2T1.getTimesHumAmp();
		int a2T2TimesAmp = a2T2.getTimesHumAmp();
		int a2T3TimesAmp = a2T3.getTimesHumAmp();
		int a2TimesAmp = a2T1TimesAmp + a2T2TimesAmp + a2T3TimesAmp + a2T4TimesAmp;
		Label a2TimesAmpL = new Label(Integer.toString(a2TimesAmp));
		Label a2TitleCyL = new Label("Avg Cycles");
		Label a2TitleSpeL = new Label("Avg Speaker");
		Label a2TitleAmpL = new Label("Avg Amp");
		Label a2TitleTrapL = new Label("Avg Trap");
		Label a2TitleCliL = new Label("Avg Climb");
		Label a2TitleTimesScoL = new Label("Times Scoure");
		Label a2TitleTimesAmpL = new Label("Times Amp");
		a2CyL.setId("avgStat");
		a2SpeL.setId("avgStat");
		a2AmpL.setId("avgStat");
		a2TrapL.setId("avgStat");
		a2CliL.setId("avgStat");
		a2TimesScoL.setId("avgStat");
		a2TimesAmpL.setId("avgStat");
		a2TimesAmpL.setId("smallTitle");
		a2TitleCyL.setId("smallTitle");
		a2TitleSpeL.setId("smallTitle");
		a2TitleAmpL.setId("smallTitle");
		a2TitleTrapL.setId("smallTitle");
		a2TitleCliL.setId("smallTitle");
		a2TitleTimesScoL.setId("smallTitle");
		a2TitleTimesAmpL.setId("smallTitle");
		BorderPane a2TitleBP = new BorderPane();
		BorderPane a2CyBP = new BorderPane();
		BorderPane a2SpeBP = new BorderPane();
		BorderPane a2AmpBP = new BorderPane();
		BorderPane a2TrapBP = new BorderPane();
		BorderPane a2CliBP = new BorderPane();
		BorderPane a2TimesScoBP = new BorderPane();
		BorderPane a2TimesAmpBP = new BorderPane();
		a2CyBP.setTop(a2TitleCyL);
		a2SpeBP.setTop(a2TitleSpeL);
		a2AmpBP.setTop(a2TitleAmpL);
		a2TrapBP.setTop(a2TitleTrapL);
		a2CliBP.setTop(a2TitleCliL);
		a2TimesScoBP.setTop(a2TitleTimesScoL);
		a2TimesAmpBP.setTop(a2TitleTimesAmpL);
		a2TitleBP.setCenter(a2TitleL);
		a2CyBP.setCenter(a2CyL);
		a2SpeBP.setCenter(a2SpeL);
		a2AmpBP.setCenter(a2AmpL);
		a2TrapBP.setCenter(a2TrapL);
		a2CliBP.setCenter(a2CliL);
		a2TimesScoBP.setCenter(a2TimesScoL);
		a2TimesAmpBP.setCenter(a2TimesAmpL);
		a2TitleBP.setId("comAllsPlayAllTitleBP");
		a2CyBP.setId("comAllsPlayStatBP1");
		a2SpeBP.setId("comAllsPlayStatBP2");
		a2AmpBP.setId("comAllsPlayStatBP3");
		a2TrapBP.setId("comAllsPlayStatBP4");
		a2CliBP.setId("comAllsPlayStatBP5");
		a2TimesScoBP.setId("comAllsPlayStatBP6");
		a2TimesAmpBP.setId("comAllsPlayStatBP7");
		int a2T1TeamNum = a2T1.getTeamNum();
		int a2T2TeamNum = a2T2.getTeamNum();
		int a2T3TeamNum = a2T3.getTeamNum();
		Label a2T1TitleL = new Label(a2T1TeamNum + "'s Stats");
		Label a2T2TitleL = new Label(a2T2TeamNum + "'s Stats");
		Label a2T3TitleL = new Label(a2T3TeamNum + "'s Stats");
		Label a2T1CyL = new Label(Double.toString(a2T1Cy));
		Label a2T1SpeL = new Label(Double.toString(a2T1Spe));
		Label a2T1AmpL = new Label(Double.toString(a2T1Amp));
		Label a2T1TrapL = new Label(Double.toString(a2T1Trap));
		Label a2T1CliL = new Label(Double.toString(a2T1Cli));
		Label a2T1TimesScoL = new Label(Integer.toString(a2T1TimesSco));
		Label a2T1TimesAmpL = new Label(Integer.toString(a2T1TimesAmp));
		Label a2T2CyL = new Label(Double.toString(a2T2Cy));
		Label a2T2SpeL = new Label(Double.toString(a2T2Spe));
		Label a2T2AmpL = new Label(Double.toString(a2T2Amp));
		Label a2T2TrapL = new Label(Double.toString(a2T2Trap));
		Label a2T2CliL = new Label(Double.toString(a2T2Cli));
		Label a2T2TimesScoL = new Label(Integer.toString(a2T2TimesSco));
		Label a2T2TimesAmpL = new Label(Integer.toString(a2T2TimesAmp));
		Label a2T3CyL = new Label(Double.toString(a2T3Cy));
		Label a2T3SpeL = new Label(Double.toString(a2T3Spe));
		Label a2T3AmpL = new Label(Double.toString(a2T3Amp));
		Label a2T3TrapL = new Label(Double.toString(a2T3Trap));
		Label a2T3CliL = new Label(Double.toString(a2T3Cli));
		Label a2T3TimesScoL = new Label(Integer.toString(a2T3TimesSco));
		Label a2T3TimesAmpL = new Label(Integer.toString(a2T3TimesAmp));
		Label a2T1TitleCyL = new Label("Avg Cycles");
		Label a2T1TitleSpeL = new Label("Avg Speaker");
		Label a2T1TitleAmpL = new Label("Avg Amp");
		Label a2T1TitleTrapL = new Label("Avg Trap");
		Label a2T1TitleCliL = new Label("Avg Climb");
		Label a2T1TitleTimesScoL = new Label("Times Scoure");
		Label a2T1TitleTimesAmpL = new Label("Times Amp");
		Label a2T2TitleCyL = new Label("Avg Cycles");
		Label a2T2TitleSpeL = new Label("Avg Speaker");
		Label a2T2TitleAmpL = new Label("Avg Amp");
		Label a2T2TitleTrapL = new Label("Avg Trap");
		Label a2T2TitleCliL = new Label("Avg Climb");
		Label a2T2TitleTimesScoL = new Label("Times Scoure");
		Label a2T2TitleTimesAmpL = new Label("Times Amp");
		Label a2T3TitleCyL = new Label("Avg Cycles");
		Label a2T3TitleSpeL = new Label("Avg Speaker");
		Label a2T3TitleAmpL = new Label("Avg Amp");
		Label a2T3TitleTrapL = new Label("Avg Trap");
		Label a2T3TitleCliL = new Label("Avg Climb");
		Label a2T3TitleTimesScoL = new Label("Times Scoure");
		Label a2T3TitleTimesAmpL = new Label("Times Amp");
		a2T1CyL.setId("avgStat");
		a2T1SpeL.setId("avgStat");
		a2T1AmpL.setId("avgStat");
		a2T1TrapL.setId("avgStat");
		a2T1CliL.setId("avgStat");
		a2T1TimesScoL.setId("avgStat");
		a2T1TimesAmpL.setId("avgStat");
		a2T2CyL.setId("avgStat");
		a2T2SpeL.setId("avgStat");
		a2T2AmpL.setId("avgStat");
		a2T2TrapL.setId("avgStat");
		a2T2CliL.setId("avgStat");
		a2T2TimesScoL.setId("avgStat");
		a2T2TimesAmpL.setId("avgStat");
		a2T3CyL.setId("avgStat");
		a2T3SpeL.setId("avgStat");
		a2T3AmpL.setId("avgStat");
		a2T3TrapL.setId("avgStat");
		a2T3CliL.setId("avgStat");
		a2T3TimesScoL.setId("avgStat");
		a2T3TimesAmpL.setId("avgStat");
		a2T1TitleCyL.setId("smallTitle");
		a2T1TitleSpeL.setId("smallTitle");
		a2T1TitleAmpL.setId("smallTitle");
		a2T1TitleTrapL.setId("smallTitle");
		a2T1TitleCliL.setId("smallTitle");
		a2T1TitleTimesScoL.setId("smallTitle");
		a2T1TitleTimesAmpL.setId("smallTitle");
		a2T2TitleCyL.setId("smallTitle");
		a2T2TitleSpeL.setId("smallTitle");
		a2T2TitleAmpL.setId("smallTitle");
		a2T2TitleTrapL.setId("smallTitle");
		a2T2TitleCliL.setId("smallTitle");
		a2T2TitleTimesScoL.setId("smallTitle");
		a2T2TitleTimesAmpL.setId("smallTitle");
		a2T3TitleCyL.setId("smallTitle");
		a2T3TitleSpeL.setId("smallTitle");
		a2T3TitleAmpL.setId("smallTitle");
		a2T3TitleTrapL.setId("smallTitle");
		a2T3TitleCliL.setId("smallTitle");
		a2T3TitleTimesScoL.setId("smallTitle");
		a2T3TitleTimesAmpL.setId("smallTitle");
		a2T1TitleL.setId("smallTitle");
		a2T2TitleL.setId("smallTitle");
		a2T3TitleL.setId("smallTitle");
		BorderPane a2T1TitleBP = new BorderPane();
		BorderPane a2T1CyBP = new BorderPane();
		BorderPane a2T1SpeBP = new BorderPane();
		BorderPane a2T1AmpBP = new BorderPane();
		BorderPane a2T1TrapBP = new BorderPane();
		BorderPane a2T1CliBP = new BorderPane();
		BorderPane a2T1TimesScoBP = new BorderPane();
		BorderPane a2T1TimesAmpBP = new BorderPane();
		a2T1CyBP.setTop(a2T1TitleCyL);
		a2T1SpeBP.setTop(a2T1TitleSpeL);
		a2T1AmpBP.setTop(a2T1TitleAmpL);
		a2T1TrapBP.setTop(a2T1TitleTrapL);
		a2T1CliBP.setTop(a2T1TitleCliL);
		a2T1TimesScoBP.setTop(a2T1TitleTimesScoL);
		a2T1TimesAmpBP.setTop(a2T1TitleTimesAmpL);
		a2T1TitleBP.setCenter(a2T1TitleL);
		a2T1CyBP.setCenter(a2T1CyL);
		a2T1SpeBP.setCenter(a2T1SpeL);
		a2T1AmpBP.setCenter(a2T1AmpL);
		a2T1TrapBP.setCenter(a2T1TrapL);
		a2T1CliBP.setCenter(a2T1CliL);
		a2T1TimesScoBP.setCenter(a2T1TimesScoL);
		a2T1TimesAmpBP.setCenter(a2T1TimesAmpL);
		a2T1TitleBP.setId("comAllsPlayTitleBP");
		a2T1CyBP.setId("comAllsPlayStatBP1");
		a2T1SpeBP.setId("comAllsPlayStatBP2");
		a2T1AmpBP.setId("comAllsPlayStatBP3");
		a2T1TrapBP.setId("comAllsPlayStatBP4");
		a2T1CliBP.setId("comAllsPlayStatBP5");
		a2T1TimesScoBP.setId("comAllsPlayStatBP6");
		a2T1TimesAmpBP.setId("comAllsPlayStatBP7");
		BorderPane a2T2TitleBP = new BorderPane();
		BorderPane a2T2CyBP = new BorderPane();
		BorderPane a2T2SpeBP = new BorderPane();
		BorderPane a2T2AmpBP = new BorderPane();
		BorderPane a2T2TrapBP = new BorderPane();
		BorderPane a2T2CliBP = new BorderPane();
		BorderPane a2T2TimesScoBP = new BorderPane();
		BorderPane a2T2TimesAmpBP = new BorderPane();
		a2T2CyBP.setTop(a2T2TitleCyL);
		a2T2SpeBP.setTop(a2T2TitleSpeL);
		a2T2AmpBP.setTop(a2T2TitleAmpL);
		a2T2TrapBP.setTop(a2T2TitleTrapL);
		a2T2CliBP.setTop(a2T2TitleCliL);
		a2T2TimesScoBP.setTop(a2T2TitleTimesScoL);
		a2T2TimesAmpBP.setTop(a2T2TitleTimesAmpL);
		a2T2TitleBP.setCenter(a2T2TitleL);
		a2T2CyBP.setCenter(a2T2CyL);
		a2T2SpeBP.setCenter(a2T2SpeL);
		a2T2AmpBP.setCenter(a2T2AmpL);
		a2T2TrapBP.setCenter(a2T2TrapL);
		a2T2CliBP.setCenter(a2T2CliL);
		a2T2TimesScoBP.setCenter(a2T2TimesScoL);
		a2T2TimesAmpBP.setCenter(a2T2TimesAmpL);
		a2T2TitleBP.setId("comAllsPlayTitleBP");
		a2T2CyBP.setId("comAllsPlayStatBP1");
		a2T2SpeBP.setId("comAllsPlayStatBP2");
		a2T2AmpBP.setId("comAllsPlayStatBP3");
		a2T2TrapBP.setId("comAllsPlayStatBP4");
		a2T2CliBP.setId("comAllsPlayStatBP5");
		a2T2TimesScoBP.setId("comAllsPlayStatBP6");
		a2T2TimesAmpBP.setId("comAllsPlayStatBP7");
		BorderPane a2T3TitleBP = new BorderPane();
		BorderPane a2T3CyBP = new BorderPane();
		BorderPane a2T3SpeBP = new BorderPane();
		BorderPane a2T3AmpBP = new BorderPane();
		BorderPane a2T3TrapBP = new BorderPane();
		BorderPane a2T3CliBP = new BorderPane();
		BorderPane a2T3TimesScoBP = new BorderPane();
		BorderPane a2T3TimesAmpBP = new BorderPane();
		a2T3CyBP.setTop(a2T3TitleCyL);
		a2T3SpeBP.setTop(a2T3TitleSpeL);
		a2T3AmpBP.setTop(a2T3TitleAmpL);
		a2T3TrapBP.setTop(a2T3TitleTrapL);
		a2T3CliBP.setTop(a2T3TitleCliL);
		a2T3TimesScoBP.setTop(a2T3TitleTimesScoL);
		a2T3TimesAmpBP.setTop(a2T3TitleTimesAmpL);
		a2T3TitleBP.setCenter(a2T3TitleL);
		a2T3CyBP.setCenter(a2T3CyL);
		a2T3SpeBP.setCenter(a2T3SpeL);
		a2T3AmpBP.setCenter(a2T3AmpL);
		a2T3TrapBP.setCenter(a2T3TrapL);
		a2T3CliBP.setCenter(a2T3CliL);
		a2T3TimesScoBP.setCenter(a2TimesScoL);
		a2T3TimesAmpBP.setCenter(a2T3TimesAmpL);
		a2T3TitleBP.setId("comAllsPlayTitleBP");
		a2T3CyBP.setId("comAllsPlayStatBP1");
		a2T3SpeBP.setId("comAllsPlayStatBP2");
		a2T3AmpBP.setId("comAllsPlayStatBP3");
		a2T3TrapBP.setId("comAllsPlayStatBP4");
		a2T3CliBP.setId("comAllsPlayStatBP5");
		a2T3TimesScoBP.setId("comAllsPlayStatBP6");
		a2T3TimesAmpBP.setId("comAllsPlayStatBP7");
		Label a2T4CyL = new Label(Double.toString(a2T4Cy));
		Label a2T4SpeL = new Label(Double.toString(a2T4Spe));
		Label a2T4AmpL = new Label(Double.toString(a2T4Amp));
		Label a2T4TrapL = new Label(Double.toString(a2T4Trap));
		Label a2T4CliL = new Label(Double.toString(a2T4Cli));
		Label a2T4TimesScoL = new Label(Integer.toString(a2T4TimesSco));
		Label a2T4TimesAmpL = new Label(Integer.toString(a2T4TimesAmp));
		Label a2T4TitleCyL = new Label("Avg Cycles");
		Label a2T4TitleSpeL = new Label("Avg Speaker");
		Label a2T4TitleAmpL = new Label("Avg Amp");
		Label a2T4TitleTrapL = new Label("Avg Trap");
		Label a2T4TitleCliL = new Label("Avg Climb");
		Label a2T4TitleTimesScoL = new Label("Times Scoure");
		Label a2T4TitleTimesAmpL = new Label("Times Amp");
		int a2T4TeamNum = a2T4.getTeamNum();
		Label a2T4TitleL = new Label(a2T4TeamNum + "'s Stats");
		a2T4CyL.setId("avgStat");
		a2T4SpeL.setId("avgStat");
		a2T4AmpL.setId("avgStat");
		a2T4TrapL.setId("avgStat");
		a2T4CliL.setId("avgStat");
		a2T4TimesScoL.setId("avgStat");
		a2T4TimesAmpL.setId("avgStat");
		a2T4TitleCyL.setId("smallTitle");
		a2T4TitleSpeL.setId("smallTitle");
		a2T4TitleAmpL.setId("smallTitle");
		a2T4TitleTrapL.setId("smallTitle");
		a2T4TitleCliL.setId("smallTitle");
		a2T4TitleTimesScoL.setId("smallTitle");
		a2T4TitleTimesAmpL.setId("smallTitle");
		a2T4TitleL.setId("smallTitle");
		BorderPane a2T4TitleBP = new BorderPane();
		BorderPane a2T4CyBP = new BorderPane();
		BorderPane a2T4SpeBP = new BorderPane();
		BorderPane a2T4AmpBP = new BorderPane();
		BorderPane a2T4TrapBP = new BorderPane();
		BorderPane a2T4CliBP = new BorderPane();
		BorderPane a2T4TimesScoBP = new BorderPane();
		BorderPane a2T4TimesAmpBP = new BorderPane();
		a2T4CyBP.setTop(a2T4TitleCyL);
		a2T4SpeBP.setTop(a2T4TitleSpeL);
		a2T4AmpBP.setTop(a2T4TitleAmpL);
		a2T4TrapBP.setTop(a2T4TitleTrapL);
		a2T4CliBP.setTop(a2T4TitleCliL);
		a2T4TimesScoBP.setTop(a2T4TitleTimesScoL);
		a2T4TimesAmpBP.setTop(a2T4TitleTimesAmpL);
		a2T4TitleBP.setCenter(a2T4TitleL);
		a2T4CyBP.setCenter(a2T4CyL);
		a2T4SpeBP.setCenter(a2T4SpeL);
		a2T4AmpBP.setCenter(a2T4AmpL);
		a2T4TrapBP.setCenter(a2T4TrapL);
		a2T4CliBP.setCenter(a2T4CliL);
		a2T4TimesScoBP.setCenter(a2T4TimesScoL);
		a2T4TimesAmpBP.setCenter(a2T4TimesAmpL);
		a2T4TitleBP.setId("comAllsPlayTitleBP");
		a2T4CyBP.setId("comAllsPlayStatBP1");
		a2T4SpeBP.setId("comAllsPlayStatBP2");
		a2T4AmpBP.setId("comAllsPlayStatBP3");
		a2T4TrapBP.setId("comAllsPlayStatBP4");
		a2T4CliBP.setId("comAllsPlayStatBP5");
		a2T4TimesScoBP.setId("comAllsPlayStatBP6");
		a2T4TimesAmpBP.setId("comAllsPlayStatBP7");
		VBox a2T4VB = new VBox(5);
		a2T4VB.getChildren().addAll(a2T4TitleBP, a2T4CyBP, a2T4SpeBP, a2T4AmpBP, a2T4TrapBP, a2T4CliBP, a2T4TimesScoBP, a2T4TimesAmpBP);
		VBox a2VB = new VBox(5);
		VBox a2T1VB = new VBox(5);
		VBox a2T2VB = new VBox(5);
		VBox a2T3VB = new VBox(5);
		a2VB.getChildren().addAll(a2TitleBP, a2CyBP, a2SpeBP, a2AmpBP, a2TrapBP, a2CliBP, a2TimesScoBP, a2TimesAmpBP);
		a2T1VB.getChildren().addAll(a2T1TitleBP, a2T1CyBP, a2T1SpeBP, a2T1AmpBP, a2T1TrapBP, a2T1CliBP, a2T1TimesScoBP, a2T1TimesAmpBP);
		a2T2VB.getChildren().addAll(a2T2TitleBP, a2T2CyBP, a2T2SpeBP, a2T2AmpBP, a2T2TrapBP, a2T2CliBP, a2T2TimesScoBP, a2T2TimesAmpBP);
		a2T3VB.getChildren().addAll(a2T3TitleBP, a2T3CyBP, a2T3SpeBP, a2T3AmpBP, a2T3TrapBP, a2T3CliBP, a2T3TimesScoBP, a2T3TimesAmpBP);
		all2HB.getChildren().addAll(a2VB, a2T1VB, a2T2VB, a2T3VB);
		all2HB.getChildren().addAll(a2T4VB);
	}
	
	public void addCompare2AllNo4thPlayAlls(PlayoffAlliance a2, Team a2T1, Team a2T2, Team a2T3, int a2AllNum) {
		System.out.println("BoopComAllsPlay6.4.1.0");
		Label a2TitleL = null;
		if(a2AllNum == 1) {
			a2TitleL = new Label("Allaince 1's Stats");
		}
		if(a2AllNum == 2) {
			a2TitleL = new Label("Allaince 2's Stats");
		}
		if(a2AllNum == 3) {
			a2TitleL = new Label("Allaince 3's Stats");
		}
		if(a2AllNum == 4) {
			a2TitleL = new Label("Allaince 4's Stats");
		}
		if(a2AllNum == 5) {
			a2TitleL = new Label("Allaince 5's Stats");
		}
		if(a2AllNum == 6) {
			a2TitleL = new Label("Allaince 6's Stats");
		}
		if(a2AllNum == 7) {
			a2TitleL = new Label("Allaince 7's Stats");
		}
		if(a2AllNum == 8) {
			a2TitleL = new Label("Allaince 8's Stats");
		}
		a2TitleL.setId("smallTitle");
		System.out.println("BoopComAllsPlay6.4.1.1");
		double a2T1Cy = a2T1.getAvgCycles();
		double a2T2Cy = a2T2.getAvgCycles();
		double a2T3Cy = a2T3.getAvgCycles();
		double a2Cy = a2T1Cy + a2T2Cy + a2T3Cy;
		Label a2CyL = new Label(Double.toString(a2Cy));
		double a2T1Spe = a2T1.getAvgSpe();
		double a2T2Spe = a2T2.getAvgSpe();
		double a2T3Spe = a2T3.getAvgSpe();
		double a2Spe = a2T1Spe + a2T2Spe + a2T3Spe;
		Label a2SpeL = new Label(Double.toString(a2Spe));
		double a2T1Amp = a2T1.getAvgAmp();
		double a2T2Amp = a2T2.getAvgAmp();
		double a2T3Amp = a2T3.getAvgAmp();
		double a2Amp = a2T1Amp + a2T2Amp + a2T3Amp;
		Label a2AmpL = new Label(Double.toString(a2Amp));
		double a2T1Trap = a2T1.getAvgTrap();
		double a2T2Trap = a2T2.getAvgTrap();
		double a2T3Trap = a2T3.getAvgTrap();
		double a2Trap = a2T1Trap + a2T2Trap + a2T3Trap;
		Label a2TrapL = new Label(Double.toString(a2Trap));
		double a2T1Cli = a2T1.getAvgClimb();
		double a2T2Cli = a2T2.getAvgClimb();
		double a2T3Cli = a2T3.getAvgClimb();
		double a2Cli = a2T1Cli + a2T2Cli + a2T3Cli;
		Label a2CliL = new Label(Double.toString(a2Cli));
		int a2T1TimesSco = a2T1.getTimesHumSco();
		int a2T2TimesSco = a2T2.getTimesHumSco();
		int a2T3TimesSco = a2T3.getTimesHumSco();
		int a2TimesSco = a2T1TimesSco + a2T2TimesSco + a2T3TimesSco;
		Label a2TimesScoL = new Label(Integer.toString(a2TimesSco));
		int a2T1TimesAmp = a2T1.getTimesHumAmp();
		int a2T2TimesAmp = a2T2.getTimesHumAmp();
		int a2T3TimesAmp = a2T3.getTimesHumAmp();
		int a2TimesAmp = a2T1TimesAmp + a2T2TimesAmp + a2T3TimesAmp;
		System.out.println("BoopComAllsPlay6.4.1.2");
		Label a2TimesAmpL = new Label(Integer.toString(a2TimesAmp));
		Label a2TitleCyL = new Label("Avg Cycles");
		Label a2TitleSpeL = new Label("Avg Speaker");
		Label a2TitleAmpL = new Label("Avg Amp");
		Label a2TitleTrapL = new Label("Avg Trap");
		Label a2TitleCliL = new Label("Avg Climb");
		Label a2TitleTimesScoL = new Label("Times Scoure");
		Label a2TitleTimesAmpL = new Label("Times Amp");
		a2CyL.setId("avgStat");
		a2SpeL.setId("avgStat");
		a2AmpL.setId("avgStat");
		a2TrapL.setId("avgStat");
		a2CliL.setId("avgStat");
		a2TimesScoL.setId("avgStat");
		a2TimesAmpL.setId("avgStat");
		a2TimesAmpL.setId("smallTitle");
		a2TitleCyL.setId("smallTitle");
		a2TitleSpeL.setId("smallTitle");
		a2TitleAmpL.setId("smallTitle");
		a2TitleTrapL.setId("smallTitle");
		a2TitleCliL.setId("smallTitle");
		a2TitleTimesScoL.setId("smallTitle");
		a2TitleTimesAmpL.setId("smallTitle");
		BorderPane a2TitleBP = new BorderPane();
		BorderPane a2CyBP = new BorderPane();
		BorderPane a2SpeBP = new BorderPane();
		BorderPane a2AmpBP = new BorderPane();
		BorderPane a2TrapBP = new BorderPane();
		BorderPane a2CliBP = new BorderPane();
		BorderPane a2TimesScoBP = new BorderPane();
		BorderPane a2TimesAmpBP = new BorderPane();
		a2CyBP.setTop(a2TitleCyL);
		a2SpeBP.setTop(a2TitleSpeL);
		a2AmpBP.setTop(a2TitleAmpL);
		a2TrapBP.setTop(a2TitleTrapL);
		a2CliBP.setTop(a2TitleCliL);
		a2TimesScoBP.setTop(a2TitleTimesScoL);
		a2TimesAmpBP.setTop(a2TitleTimesAmpL);
		a2TitleBP.setCenter(a2TitleL);
		a2CyBP.setCenter(a2CyL);
		a2SpeBP.setCenter(a2SpeL);
		a2AmpBP.setCenter(a2AmpL);
		a2TrapBP.setCenter(a2TrapL);
		a2CliBP.setCenter(a2CliL);
		a2TimesScoBP.setCenter(a2TimesScoL);
		a2TimesAmpBP.setCenter(a2TimesAmpL);
		a2TitleBP.setId("comAllsPlayAllTitleBP");
		a2CyBP.setId("comAllsPlayStatBP1");
		a2SpeBP.setId("comAllsPlayStatBP2");
		a2AmpBP.setId("comAllsPlayStatBP3");
		a2TrapBP.setId("comAllsPlayStatBP4");
		a2CliBP.setId("comAllsPlayStatBP5");
		a2TimesScoBP.setId("comAllsPlayStatBP6");
		a2TimesAmpBP.setId("comAllsPlayStatBP7");
		System.out.println("BoopComAllsPlay6.4.1.3");
		int a2T1TeamNum = a2T1.getTeamNum();
		int a2T2TeamNum = a2T2.getTeamNum();
		int a2T3TeamNum = a2T3.getTeamNum();
		System.out.println("BoopComAllsPlay6.4.1.4");
		Label a2T1TitleL = new Label(a2T1TeamNum + "'s Stats");
		Label a2T2TitleL = new Label(a2T2TeamNum + "'s Stats");
		Label a2T3TitleL = new Label(a2T3TeamNum + "'s Stats");
		Label a2T1CyL = new Label(Double.toString(a2T1Cy));
		Label a2T1SpeL = new Label(Double.toString(a2T1Spe));
		Label a2T1AmpL = new Label(Double.toString(a2T1Amp));
		Label a2T1TrapL = new Label(Double.toString(a2T1Trap));
		Label a2T1CliL = new Label(Double.toString(a2T1Cli));
		Label a2T1TimesScoL = new Label(Integer.toString(a2T1TimesSco));
		Label a2T1TimesAmpL = new Label(Integer.toString(a2T1TimesAmp));
		Label a2T2CyL = new Label(Double.toString(a2T2Cy));
		Label a2T2SpeL = new Label(Double.toString(a2T2Spe));
		Label a2T2AmpL = new Label(Double.toString(a2T2Amp));
		Label a2T2TrapL = new Label(Double.toString(a2T2Trap));
		Label a2T2CliL = new Label(Double.toString(a2T2Cli));
		Label a2T2TimesScoL = new Label(Integer.toString(a2T2TimesSco));
		Label a2T2TimesAmpL = new Label(Integer.toString(a2T2TimesAmp));
		Label a2T3CyL = new Label(Double.toString(a2T3Cy));
		Label a2T3SpeL = new Label(Double.toString(a2T3Spe));
		Label a2T3AmpL = new Label(Double.toString(a2T3Amp));
		Label a2T3TrapL = new Label(Double.toString(a2T3Trap));
		Label a2T3CliL = new Label(Double.toString(a2T3Cli));
		Label a2T3TimesScoL = new Label(Integer.toString(a2T3TimesSco));
		Label a2T3TimesAmpL = new Label(Integer.toString(a2T3TimesAmp));
		Label a2T1TitleCyL = new Label("Avg Cycles");
		Label a2T1TitleSpeL = new Label("Avg Speaker");
		Label a2T1TitleAmpL = new Label("Avg Amp");
		Label a2T1TitleTrapL = new Label("Avg Trap");
		Label a2T1TitleCliL = new Label("Avg Climb");
		Label a2T1TitleTimesScoL = new Label("Times Scoure");
		Label a2T1TitleTimesAmpL = new Label("Times Amp");
		Label a2T2TitleCyL = new Label("Avg Cycles");
		Label a2T2TitleSpeL = new Label("Avg Speaker");
		Label a2T2TitleAmpL = new Label("Avg Amp");
		Label a2T2TitleTrapL = new Label("Avg Trap");
		Label a2T2TitleCliL = new Label("Avg Climb");
		Label a2T2TitleTimesScoL = new Label("Times Scoure");
		Label a2T2TitleTimesAmpL = new Label("Times Amp");
		Label a2T3TitleCyL = new Label("Avg Cycles");
		Label a2T3TitleSpeL = new Label("Avg Speaker");
		Label a2T3TitleAmpL = new Label("Avg Amp");
		Label a2T3TitleTrapL = new Label("Avg Trap");
		Label a2T3TitleCliL = new Label("Avg Climb");
		Label a2T3TitleTimesScoL = new Label("Times Scoure");
		Label a2T3TitleTimesAmpL = new Label("Times Amp");
		System.out.println("BoopComAllsPlay6.4.1.5");
		a2T1CyL.setId("avgStat");
		a2T1SpeL.setId("avgStat");
		a2T1AmpL.setId("avgStat");
		a2T1TrapL.setId("avgStat");
		a2T1CliL.setId("avgStat");
		a2T1TimesScoL.setId("avgStat");
		a2T1TimesAmpL.setId("avgStat");
		a2T2CyL.setId("avgStat");
		a2T2SpeL.setId("avgStat");
		a2T2AmpL.setId("avgStat");
		a2T2TrapL.setId("avgStat");
		a2T2CliL.setId("avgStat");
		a2T2TimesScoL.setId("avgStat");
		a2T2TimesAmpL.setId("avgStat");
		a2T3CyL.setId("avgStat");
		a2T3SpeL.setId("avgStat");
		a2T3AmpL.setId("avgStat");
		a2T3TrapL.setId("avgStat");
		a2T3CliL.setId("avgStat");
		a2T3TimesScoL.setId("avgStat");
		a2T3TimesAmpL.setId("avgStat");
		a2T1TitleCyL.setId("smallTitle");
		a2T1TitleSpeL.setId("smallTitle");
		a2T1TitleAmpL.setId("smallTitle");
		a2T1TitleTrapL.setId("smallTitle");
		a2T1TitleCliL.setId("smallTitle");
		a2T1TitleTimesScoL.setId("smallTitle");
		a2T1TitleTimesAmpL.setId("smallTitle");
		a2T2TitleCyL.setId("smallTitle");
		a2T2TitleSpeL.setId("smallTitle");
		a2T2TitleAmpL.setId("smallTitle");
		a2T2TitleTrapL.setId("smallTitle");
		a2T2TitleCliL.setId("smallTitle");
		a2T2TitleTimesScoL.setId("smallTitle");
		a2T2TitleTimesAmpL.setId("smallTitle");
		a2T3TitleCyL.setId("smallTitle");
		a2T3TitleSpeL.setId("smallTitle");
		a2T3TitleAmpL.setId("smallTitle");
		a2T3TitleTrapL.setId("smallTitle");
		a2T3TitleCliL.setId("smallTitle");
		a2T3TitleTimesScoL.setId("smallTitle");
		a2T3TitleTimesAmpL.setId("smallTitle");
		a2T1TitleL.setId("smallTitle");
		a2T2TitleL.setId("smallTitle");
		a2T3TitleL.setId("smallTitle");
		System.out.println("BoopComAllsPlay6.4.1.6");
		BorderPane a2T1TitleBP = new BorderPane();
		BorderPane a2T1CyBP = new BorderPane();
		BorderPane a2T1SpeBP = new BorderPane();
		BorderPane a2T1AmpBP = new BorderPane();
		BorderPane a2T1TrapBP = new BorderPane();
		BorderPane a2T1CliBP = new BorderPane();
		BorderPane a2T1TimesScoBP = new BorderPane();
		BorderPane a2T1TimesAmpBP = new BorderPane();
		a2T1CyBP.setTop(a2T1TitleCyL);
		a2T1SpeBP.setTop(a2T1TitleSpeL);
		a2T1AmpBP.setTop(a2T1TitleAmpL);
		a2T1TrapBP.setTop(a2T1TitleTrapL);
		a2T1CliBP.setTop(a2T1TitleCliL);
		a2T1TimesScoBP.setTop(a2T1TitleTimesScoL);
		a2T1TimesAmpBP.setTop(a2T1TitleTimesAmpL);
		a2T1TitleBP.setCenter(a2T1TitleL);
		a2T1CyBP.setCenter(a2T1CyL);
		a2T1SpeBP.setCenter(a2T1SpeL);
		a2T1AmpBP.setCenter(a2T1AmpL);
		a2T1TrapBP.setCenter(a2T1TrapL);
		a2T1CliBP.setCenter(a2T1CliL);
		a2T1TimesScoBP.setCenter(a2T1TimesScoL);
		a2T1TimesAmpBP.setCenter(a2T1TimesAmpL);
		a2T1TitleBP.setId("comAllsPlayTitleBP");
		a2T1CyBP.setId("comAllsPlayStatBP1");
		a2T1SpeBP.setId("comAllsPlayStatBP2");
		a2T1AmpBP.setId("comAllsPlayStatBP3");
		a2T1TrapBP.setId("comAllsPlayStatBP4");
		a2T1CliBP.setId("comAllsPlayStatBP5");
		a2T1TimesScoBP.setId("comAllsPlayStatBP6");
		a2T1TimesAmpBP.setId("comAllsPlayStatBP7");
		BorderPane a2T2TitleBP = new BorderPane();
		BorderPane a2T2CyBP = new BorderPane();
		BorderPane a2T2SpeBP = new BorderPane();
		BorderPane a2T2AmpBP = new BorderPane();
		BorderPane a2T2TrapBP = new BorderPane();
		BorderPane a2T2CliBP = new BorderPane();
		BorderPane a2T2TimesScoBP = new BorderPane();
		BorderPane a2T2TimesAmpBP = new BorderPane();
		a2T2CyBP.setTop(a2T2TitleCyL);
		a2T2SpeBP.setTop(a2T2TitleSpeL);
		a2T2AmpBP.setTop(a2T2TitleAmpL);
		a2T2TrapBP.setTop(a2T2TitleTrapL);
		a2T2CliBP.setTop(a2T2TitleCliL);
		a2T2TimesScoBP.setTop(a2T2TitleTimesScoL);
		a2T2TimesAmpBP.setTop(a2T2TitleTimesAmpL);
		a2T2TitleBP.setCenter(a2T2TitleL);
		a2T2CyBP.setCenter(a2T2CyL);
		a2T2SpeBP.setCenter(a2T2SpeL);
		a2T2AmpBP.setCenter(a2T2AmpL);
		a2T2TrapBP.setCenter(a2T2TrapL);
		a2T2CliBP.setCenter(a2T2CliL);
		a2T2TimesScoBP.setCenter(a2T2TimesScoL);
		a2T2TimesAmpBP.setCenter(a2T2TimesAmpL);
		a2T2TitleBP.setId("comAllsPlayTitleBP");
		a2T2CyBP.setId("comAllsPlayStatBP1");
		a2T2SpeBP.setId("comAllsPlayStatBP2");
		a2T2AmpBP.setId("comAllsPlayStatBP3");
		a2T2TrapBP.setId("comAllsPlayStatBP4");
		a2T2CliBP.setId("comAllsPlayStatBP5");
		a2T2TimesScoBP.setId("comAllsPlayStatBP6");
		a2T2TimesAmpBP.setId("comAllsPlayStatBP7");
		BorderPane a2T3TitleBP = new BorderPane();
		BorderPane a2T3CyBP = new BorderPane();
		BorderPane a2T3SpeBP = new BorderPane();
		BorderPane a2T3AmpBP = new BorderPane();
		BorderPane a2T3TrapBP = new BorderPane();
		BorderPane a2T3CliBP = new BorderPane();
		BorderPane a2T3TimesScoBP = new BorderPane();
		BorderPane a2T3TimesAmpBP = new BorderPane();
		a2T3CyBP.setTop(a2T3TitleCyL);
		a2T3SpeBP.setTop(a2T3TitleSpeL);
		a2T3AmpBP.setTop(a2T3TitleAmpL);
		a2T3TrapBP.setTop(a2T3TitleTrapL);
		a2T3CliBP.setTop(a2T3TitleCliL);
		a2T3TimesScoBP.setTop(a2T3TitleTimesScoL);
		a2T3TimesAmpBP.setTop(a2T3TitleTimesAmpL);
		a2T3TitleBP.setCenter(a2T3TitleL);
		a2T3CyBP.setCenter(a2T3CyL);
		a2T3SpeBP.setCenter(a2T3SpeL);
		a2T3AmpBP.setCenter(a2T3AmpL);
		a2T3TrapBP.setCenter(a2T3TrapL);
		a2T3CliBP.setCenter(a2T3CliL);
		a2T3TimesScoBP.setCenter(a2TimesScoL);
		a2T3TimesAmpBP.setCenter(a2T3TimesAmpL);
		a2T3TitleBP.setId("comAllsPlayTitleBP");
		a2T3CyBP.setId("comAllsPlayStatBP1");
		a2T3SpeBP.setId("comAllsPlayStatBP2");
		a2T3AmpBP.setId("comAllsPlayStatBP3");
		a2T3TrapBP.setId("comAllsPlayStatBP4");
		a2T3CliBP.setId("comAllsPlayStatBP5");
		a2T3TimesScoBP.setId("comAllsPlayStatBP6");
		a2T3TimesAmpBP.setId("comAllsPlayStatBP7");
		VBox a2VB = new VBox(5);
		VBox a2T1VB = new VBox(5);
		VBox a2T2VB = new VBox(5);
		VBox a2T3VB = new VBox(5);
		a2VB.getChildren().addAll(a2TitleBP, a2CyBP, a2SpeBP, a2AmpBP, a2TrapBP, a2CliBP, a2TimesScoBP, a2TimesAmpBP);
		a2T1VB.getChildren().addAll(a2T1TitleBP, a2T1CyBP, a2T1SpeBP, a2T1AmpBP, a2T1TrapBP, a2T1CliBP, a2T1TimesScoBP, a2T1TimesAmpBP);
		a2T2VB.getChildren().addAll(a2T2TitleBP, a2T2CyBP, a2T2SpeBP, a2T2AmpBP, a2T2TrapBP, a2T2CliBP, a2T2TimesScoBP, a2T2TimesAmpBP);
		a2T3VB.getChildren().addAll(a2T3TitleBP, a2T3CyBP, a2T3SpeBP, a2T3AmpBP, a2T3TrapBP, a2T3CliBP, a2T3TimesScoBP, a2T3TimesAmpBP);
		all2HB.getChildren().addAll(a2VB, a2T1VB, a2T2VB, a2T3VB);
	}
	
	public void addCompare3AllHas4thPlayAlls(PlayoffAlliance a3, Team a3T1, Team a3T2, Team a3T3, Team a3T4, int a3AllNum) {
		Label a3TitleL = null;
		if(a3AllNum == 1) {
			a3TitleL = new Label("Alliance 1's Stats");
		}
		if(a3AllNum == 2) {
			a3TitleL = new Label("Allaince 2's Stats");
		}
		if(a3AllNum == 3) {
			a3TitleL = new Label("Allaince 3's Stats");
		}
		if(a3AllNum == 4) {
			a3TitleL = new Label("Allaince 4's Stats");
		}
		if(a3AllNum == 5) {
			a3TitleL = new Label("Allaince 5's Stats");
		}
		if(a3AllNum == 6) {
			a3TitleL = new Label("Allaince 6's Stats");
		}
		if(a3AllNum == 7) {
			a3TitleL = new Label("Allaince 7's Stats");
		}
		if(a3AllNum == 8) {
			a3TitleL = new Label("Allaince 8's Stats");
		}
		a3TitleL.setId("smallTitle");
		double a3T1Cy = a3T1.getAvgCycles();
		double a3T2Cy = a3T2.getAvgCycles();
		double a3T3Cy = a3T3.getAvgCycles();
		double a3T4Cy = a3T4.getAvgCycles();
		double a3T4Spe = a3T4.getAvgSpe();
		double a3T4Amp = a3T4.getAvgAmp();
		double a3T4Trap = a3T4.getAvgTrap();
		double a3T4Cli = a3T4.getAvgClimb();
		int a3T4TimesSco = a3T4.getTimesHumSco();
		int a3T4TimesAmp = a3T4.getTimesHumAmp();
		double a3Cy = a3T1Cy + a3T2Cy + a3T3Cy + a3T4Cy; 
		Label a3CyL = new Label(Double.toString(a3Cy));
		double a3T1Spe = a3T1.getAvgSpe();
		double a3T2Spe = a3T2.getAvgSpe();
		double a3T3Spe = a3T3.getAvgSpe();
		double a3Spe = a3T1Spe + a3T2Spe + a3T3Spe + a3T4Spe;
		Label a3SpeL = new Label(Double.toString(a3Spe));
		double a3T1Amp = a3T1.getAvgAmp();
		double a3T2Amp = a3T2.getAvgAmp();
		double a3T3Amp = a3T3.getAvgAmp();
		double a3Amp = a3T1Amp + a3T2Amp + a3T3Amp + a3T4Amp;
		Label a3AmpL = new Label(Double.toString(a3Amp));
		double a3T1Trap = a3T1.getAvgTrap();
		double a3T2Trap = a3T2.getAvgTrap();
		double a3T3Trap = a3T3.getAvgTrap();
		double a3Trap = a3T1Trap + a3T2Trap + a3T3Trap + a3T4Trap;
		Label a3TrapL = new Label(Double.toString(a3Trap));
		double a3T1Cli = a3T1.getAvgClimb();
		double a3T2Cli = a3T2.getAvgClimb();
		double a3T3Cli = a3T3.getAvgClimb();
		double a3Cli = a3T1Cli + a3T2Cli + a3T3Cli + a3T4Cli;
		Label a3CliL = new Label(Double.toString(a3Cli));
		int a3T1TimesSco = a3T1.getTimesHumSco();
		int a3T2TimesSco = a3T2.getTimesHumSco();
		int a3T3TimesSco = a3T3.getTimesHumSco();
		int a3TimesSco = a3T1TimesSco + a3T2TimesSco + a3T3TimesSco + a3T4TimesSco;
		Label a3TimesScoL = new Label(Integer.toString(a3TimesSco));
		int a3T1TimesAmp = a3T1.getTimesHumAmp();
		int a3T2TimesAmp = a3T2.getTimesHumAmp();
		int a3T3TimesAmp = a3T3.getTimesHumAmp();
		int a3TimesAmp = a3T1TimesAmp + a3T2TimesAmp + a3T3TimesAmp + a3T4TimesAmp;
		Label a3TimesAmpL = new Label(Integer.toString(a3TimesAmp));
		Label a3TitleCyL = new Label("Avg Cycles");
		Label a3TitleSpeL = new Label("Avg Speaker");
		Label a3TitleAmpL = new Label("Avg Amp");
		Label a3TitleTrapL = new Label("Avg Trap");
		Label a3TitleCliL = new Label("Avg Climb");
		Label a3TitleTimesScoL = new Label("Times Scoure");
		Label a3TitleTimesAmpL = new Label("Times Amp");
		a3CyL.setId("avgStat");
		a3SpeL.setId("avgStat");
		a3AmpL.setId("avgStat");
		a3TrapL.setId("avgStat");
		a3CliL.setId("avgStat");
		a3TimesScoL.setId("avgStat");
		a3TimesAmpL.setId("avgStat");
		a3TimesAmpL.setId("smallTitle");
		a3TitleCyL.setId("smallTitle");
		a3TitleSpeL.setId("smallTitle");
		a3TitleAmpL.setId("smallTitle");
		a3TitleTrapL.setId("smallTitle");
		a3TitleCliL.setId("smallTitle");
		a3TitleTimesScoL.setId("smallTitle");
		a3TitleTimesAmpL.setId("smallTitle");
		BorderPane a3TitleBP = new BorderPane();
		BorderPane a3CyBP = new BorderPane();
		BorderPane a3SpeBP = new BorderPane();
		BorderPane a3AmpBP = new BorderPane();
		BorderPane a3TrapBP = new BorderPane();
		BorderPane a3CliBP = new BorderPane();
		BorderPane a3TimesScoBP = new BorderPane();
		BorderPane a3TimesAmpBP = new BorderPane();
		a3CyBP.setTop(a3TitleCyL);
		a3SpeBP.setTop(a3TitleSpeL);
		a3AmpBP.setTop(a3TitleAmpL);
		a3TrapBP.setTop(a3TitleTrapL);
		a3CliBP.setTop(a3TitleCliL);
		a3TimesScoBP.setTop(a3TitleTimesScoL);
		a3TimesAmpBP.setTop(a3TitleTimesAmpL);
		a3TitleBP.setCenter(a3TitleL);
		a3CyBP.setCenter(a3CyL);
		a3SpeBP.setCenter(a3SpeL);
		a3AmpBP.setCenter(a3AmpL);
		a3TrapBP.setCenter(a3TrapL);
		a3CliBP.setCenter(a3CliL);
		a3TimesScoBP.setCenter(a3TimesScoL);
		a3TimesAmpBP.setCenter(a3TimesAmpL);
		a3TitleBP.setId("comAllsPlayAllTitleBP");
		a3CyBP.setId("comAllsPlayStatBP1");
		a3SpeBP.setId("comAllsPlayStatBP2");
		a3AmpBP.setId("comAllsPlayStatBP3");
		a3TrapBP.setId("comAllsPlayStatBP4");
		a3CliBP.setId("comAllsPlayStatBP5");
		a3TimesScoBP.setId("comAllsPlayStatBP6");
		a3TimesAmpBP.setId("comAllsPlayStatBP7");
		int a3T1TeamNum = a3T1.getTeamNum();
		int a3T2TeamNum = a3T2.getTeamNum();
		int a3T3TeamNum = a3T3.getTeamNum();
		Label a3T1TitleL = new Label(a3T1TeamNum + "'s Stats");
		Label a3T2TitleL = new Label(a3T2TeamNum + "'s Stats");
		Label a3T3TitleL = new Label(a3T3TeamNum + "'s Stats");
		Label a3T1CyL = new Label(Double.toString(a3T1Cy));
		Label a3T1SpeL = new Label(Double.toString(a3T1Spe));
		Label a3T1AmpL = new Label(Double.toString(a3T1Amp));
		Label a3T1TrapL = new Label(Double.toString(a3T1Trap));
		Label a3T1CliL = new Label(Double.toString(a3T1Cli));
		Label a3T1TimesScoL = new Label(Integer.toString(a3T1TimesSco));
		Label a3T1TimesAmpL = new Label(Integer.toString(a3T1TimesAmp));
		Label a3T2CyL = new Label(Double.toString(a3T2Cy));
		Label a3T2SpeL = new Label(Double.toString(a3T2Spe));
		Label a3T2AmpL = new Label(Double.toString(a3T2Amp));
		Label a3T2TrapL = new Label(Double.toString(a3T2Trap));
		Label a3T2CliL = new Label(Double.toString(a3T2Cli));
		Label a3T2TimesScoL = new Label(Integer.toString(a3T2TimesSco));
		Label a3T2TimesAmpL = new Label(Integer.toString(a3T2TimesAmp));
		Label a3T3CyL = new Label(Double.toString(a3T3Cy));
		Label a3T3SpeL = new Label(Double.toString(a3T3Spe));
		Label a3T3AmpL = new Label(Double.toString(a3T3Amp));
		Label a3T3TrapL = new Label(Double.toString(a3T3Trap));
		Label a3T3CliL = new Label(Double.toString(a3T3Cli));
		Label a3T3TimesScoL = new Label(Integer.toString(a3T3TimesSco));
		Label a3T3TimesAmpL = new Label(Integer.toString(a3T3TimesAmp));
		Label a3T1TitleCyL = new Label("Avg Cycles");
		Label a3T1TitleSpeL = new Label("Avg Speaker");
		Label a3T1TitleAmpL = new Label("Avg Amp");
		Label a3T1TitleTrapL = new Label("Avg Trap");
		Label a3T1TitleCliL = new Label("Avg Climb");
		Label a3T1TitleTimesScoL = new Label("Times Scoure");
		Label a3T1TitleTimesAmpL = new Label("Times Amp");
		Label a3T2TitleCyL = new Label("Avg Cycles");
		Label a3T2TitleSpeL = new Label("Avg Speaker");
		Label a3T2TitleAmpL = new Label("Avg Amp");
		Label a3T2TitleTrapL = new Label("Avg Trap");
		Label a3T2TitleCliL = new Label("Avg Climb");
		Label a3T2TitleTimesScoL = new Label("Times Scoure");
		Label a3T2TitleTimesAmpL = new Label("Times Amp");
		Label a3T3TitleCyL = new Label("Avg Cycles");
		Label a3T3TitleSpeL = new Label("Avg Speaker");
		Label a3T3TitleAmpL = new Label("Avg Amp");
		Label a3T3TitleTrapL = new Label("Avg Trap");
		Label a3T3TitleCliL = new Label("Avg Climb");
		Label a3T3TitleTimesScoL = new Label("Times Scoure");
		Label a3T3TitleTimesAmpL = new Label("Times Amp");
		a3T1CyL.setId("avgStat");
		a3T1SpeL.setId("avgStat");
		a3T1AmpL.setId("avgStat");
		a3T1TrapL.setId("avgStat");
		a3T1CliL.setId("avgStat");
		a3T1TimesScoL.setId("avgStat");
		a3T1TimesAmpL.setId("avgStat");
		a3T2CyL.setId("avgStat");
		a3T2SpeL.setId("avgStat");
		a3T2AmpL.setId("avgStat");
		a3T2TrapL.setId("avgStat");
		a3T2CliL.setId("avgStat");
		a3T2TimesScoL.setId("avgStat");
		a3T2TimesAmpL.setId("avgStat");
		a3T3CyL.setId("avgStat");
		a3T3SpeL.setId("avgStat");
		a3T3AmpL.setId("avgStat");
		a3T3TrapL.setId("avgStat");
		a3T3CliL.setId("avgStat");
		a3T3TimesScoL.setId("avgStat");
		a3T3TimesAmpL.setId("avgStat");
		a3T1TitleCyL.setId("smallTitle");
		a3T1TitleSpeL.setId("smallTitle");
		a3T1TitleAmpL.setId("smallTitle");
		a3T1TitleTrapL.setId("smallTitle");
		a3T1TitleCliL.setId("smallTitle");
		a3T1TitleTimesScoL.setId("smallTitle");
		a3T1TitleTimesAmpL.setId("smallTitle");
		a3T2TitleCyL.setId("smallTitle");
		a3T2TitleSpeL.setId("smallTitle");
		a3T2TitleAmpL.setId("smallTitle");
		a3T2TitleTrapL.setId("smallTitle");
		a3T2TitleCliL.setId("smallTitle");
		a3T2TitleTimesScoL.setId("smallTitle");
		a3T2TitleTimesAmpL.setId("smallTitle");
		a3T3TitleCyL.setId("smallTitle");
		a3T3TitleSpeL.setId("smallTitle");
		a3T3TitleAmpL.setId("smallTitle");
		a3T3TitleTrapL.setId("smallTitle");
		a3T3TitleCliL.setId("smallTitle");
		a3T3TitleTimesScoL.setId("smallTitle");
		a3T3TitleTimesAmpL.setId("smallTitle");
		a3T1TitleL.setId("smallTitle");
		a3T2TitleL.setId("smallTitle");
		a3T3TitleL.setId("smallTitle");
		BorderPane a3T1TitleBP = new BorderPane();
		BorderPane a3T1CyBP = new BorderPane();
		BorderPane a3T1SpeBP = new BorderPane();
		BorderPane a3T1AmpBP = new BorderPane();
		BorderPane a3T1TrapBP = new BorderPane();
		BorderPane a3T1CliBP = new BorderPane();
		BorderPane a3T1TimesScoBP = new BorderPane();
		BorderPane a3T1TimesAmpBP = new BorderPane();
		a3T1CyBP.setTop(a3T1TitleCyL);
		a3T1SpeBP.setTop(a3T1TitleSpeL);
		a3T1AmpBP.setTop(a3T1TitleAmpL);
		a3T1TrapBP.setTop(a3T1TitleTrapL);
		a3T1CliBP.setTop(a3T1TitleCliL);
		a3T1TimesScoBP.setTop(a3T1TitleTimesScoL);
		a3T1TimesAmpBP.setTop(a3T1TitleTimesAmpL);
		a3T1TitleBP.setCenter(a3T1TitleL);
		a3T1CyBP.setCenter(a3T1CyL);
		a3T1SpeBP.setCenter(a3T1SpeL);
		a3T1AmpBP.setCenter(a3T1AmpL);
		a3T1TrapBP.setCenter(a3T1TrapL);
		a3T1CliBP.setCenter(a3T1CliL);
		a3T1TimesScoBP.setCenter(a3T1TimesScoL);
		a3T1TimesAmpBP.setCenter(a3T1TimesAmpL);
		a3T1TitleBP.setId("comAllsPlayTitleBP");
		a3T1CyBP.setId("comAllsPlayStatBP1");
		a3T1SpeBP.setId("comAllsPlayStatBP2");
		a3T1AmpBP.setId("comAllsPlayStatBP3");
		a3T1TrapBP.setId("comAllsPlayStatBP4");
		a3T1CliBP.setId("comAllsPlayStatBP5");
		a3T1TimesScoBP.setId("comAllsPlayStatBP6");
		a3T1TimesAmpBP.setId("comAllsPlayStatBP7");
		BorderPane a3T2TitleBP = new BorderPane();
		BorderPane a3T2CyBP = new BorderPane();
		BorderPane a3T2SpeBP = new BorderPane();
		BorderPane a3T2AmpBP = new BorderPane();
		BorderPane a3T2TrapBP = new BorderPane();
		BorderPane a3T2CliBP = new BorderPane();
		BorderPane a3T2TimesScoBP = new BorderPane();
		BorderPane a3T2TimesAmpBP = new BorderPane();
		a3T2CyBP.setTop(a3T2TitleCyL);
		a3T2SpeBP.setTop(a3T2TitleSpeL);
		a3T2AmpBP.setTop(a3T2TitleAmpL);
		a3T2TrapBP.setTop(a3T2TitleTrapL);
		a3T2CliBP.setTop(a3T2TitleCliL);
		a3T2TimesScoBP.setTop(a3T2TitleTimesScoL);
		a3T2TimesAmpBP.setTop(a3T2TitleTimesAmpL);
		a3T2TitleBP.setCenter(a3T2TitleL);
		a3T2CyBP.setCenter(a3T2CyL);
		a3T2SpeBP.setCenter(a3T2SpeL);
		a3T2AmpBP.setCenter(a3T2AmpL);
		a3T2TrapBP.setCenter(a3T2TrapL);
		a3T2CliBP.setCenter(a3T2CliL);
		a3T2TimesScoBP.setCenter(a3T2TimesScoL);
		a3T2TimesAmpBP.setCenter(a3T2TimesAmpL);
		a3T2TitleBP.setId("comAllsPlayTitleBP");
		a3T2CyBP.setId("comAllsPlayStatBP1");
		a3T2SpeBP.setId("comAllsPlayStatBP2");
		a3T2AmpBP.setId("comAllsPlayStatBP3");
		a3T2TrapBP.setId("comAllsPlayStatBP4");
		a3T2CliBP.setId("comAllsPlayStatBP5");
		a3T2TimesScoBP.setId("comAllsPlayStatBP6");
		a3T2TimesAmpBP.setId("comAllsPlayStatBP7");
		BorderPane a3T3TitleBP = new BorderPane();
		BorderPane a3T3CyBP = new BorderPane();
		BorderPane a3T3SpeBP = new BorderPane();
		BorderPane a3T3AmpBP = new BorderPane();
		BorderPane a3T3TrapBP = new BorderPane();
		BorderPane a3T3CliBP = new BorderPane();
		BorderPane a3T3TimesScoBP = new BorderPane();
		BorderPane a3T3TimesAmpBP = new BorderPane();
		a3T3CyBP.setTop(a3T3TitleCyL);
		a3T3SpeBP.setTop(a3T3TitleSpeL);
		a3T3AmpBP.setTop(a3T3TitleAmpL);
		a3T3TrapBP.setTop(a3T3TitleTrapL);
		a3T3CliBP.setTop(a3T3TitleCliL);
		a3T3TimesScoBP.setTop(a3T3TitleTimesScoL);
		a3T3TimesAmpBP.setTop(a3T3TitleTimesAmpL);
		a3T3TitleBP.setCenter(a3T3TitleL);
		a3T3CyBP.setCenter(a3T3CyL);
		a3T3SpeBP.setCenter(a3T3SpeL);
		a3T3AmpBP.setCenter(a3T3AmpL);
		a3T3TrapBP.setCenter(a3T3TrapL);
		a3T3CliBP.setCenter(a3T3CliL);
		a3T3TimesScoBP.setCenter(a3T3TimesScoL);
		a3T3TimesAmpBP.setCenter(a3T3TimesAmpL);
		a3T3TitleBP.setId("comAllsPlayTitleBP");
		a3T3CyBP.setId("comAllsPlayStatBP1");
		a3T3SpeBP.setId("comAllsPlayStatBP2");
		a3T3AmpBP.setId("comAllsPlayStatBP3");
		a3T3TrapBP.setId("comAllsPlayStatBP4");
		a3T3CliBP.setId("comAllsPlayStatBP5");
		a3T3TimesScoBP.setId("comAllsPlayStatBP6");
		a3T3TimesAmpBP.setId("comAllsPlayStatBP7");
		//a4 stuff
		Label a3T4CyL = new Label(Double.toString(a3T4Cy));
		Label a3T4SpeL = new Label(Double.toString(a3T4Spe));
		Label a3T4AmpL = new Label(Double.toString(a3T4Amp));
		Label a3T4TrapL = new Label(Double.toString(a3T4Trap));
		Label a3T4CliL = new Label(Double.toString(a3T4Cli));
		Label a3T4TimesScoL = new Label(Integer.toString(a3T4TimesSco));
		Label a3T4TimesAmpL = new Label(Integer.toString(a3T4TimesAmp));
		Label a3T4TitleCyL = new Label("Avg Cycles");
		Label a3T4TitleSpeL = new Label("Avg Speaker");
		Label a3T4TitleAmpL = new Label("Avg Amp");
		Label a3T4TitleTrapL = new Label("Avg Trap");
		Label a3T4TitleCliL = new Label("Avg Climb");
		Label a3T4TitleTimesScoL = new Label("Times Scoure");
		Label a3T4TitleTimesAmpL = new Label("Times Amp");
		int a3T4TeamNum = a3T4.getTeamNum();
		Label a3T4TitleL = new Label(a3T4TeamNum + "'s Stats");
		a3T4CyL.setId("avgStat");
		a3T4SpeL.setId("avgStat");
		a3T4AmpL.setId("avgStat");
		a3T4TrapL.setId("avgStat");
		a3T4CliL.setId("avgStat");
		a3T4TimesScoL.setId("avgStat");
		a3T4TimesAmpL.setId("avgStat");
		a3T4TitleCyL.setId("smallTitle");
		a3T4TitleSpeL.setId("smallTitle");
		a3T4TitleAmpL.setId("smallTitle");
		a3T4TitleTrapL.setId("smallTitle");
		a3T4TitleCliL.setId("smallTitle");
		a3T4TitleTimesScoL.setId("smallTitle");
		a3T4TitleTimesAmpL.setId("smallTitle");
		a3T4TitleL.setId("smallTitle");
		BorderPane a3T4TitleBP = new BorderPane();
		BorderPane a3T4CyBP = new BorderPane();
		BorderPane a3T4SpeBP = new BorderPane();
		BorderPane a3T4AmpBP = new BorderPane();
		BorderPane a3T4TrapBP = new BorderPane();
		BorderPane a3T4CliBP = new BorderPane();
		BorderPane a3T4TimesScoBP = new BorderPane();
		BorderPane a3T4TimesAmpBP = new BorderPane();
		a3T4CyBP.setTop(a3T4TitleCyL);
		a3T4SpeBP.setTop(a3T4TitleSpeL);
		a3T4AmpBP.setTop(a3T4TitleAmpL);
		a3T4TrapBP.setTop(a3T4TitleTrapL);
		a3T4CliBP.setTop(a3T4TitleCliL);
		a3T4TimesScoBP.setTop(a3T4TitleTimesScoL);
		a3T4TimesAmpBP.setTop(a3T4TitleTimesAmpL);
		a3T4TitleBP.setCenter(a3T4TitleL);
		a3T4CyBP.setCenter(a3T4CyL);
		a3T4SpeBP.setCenter(a3T4SpeL);
		a3T4AmpBP.setCenter(a3T4AmpL);
		a3T4TrapBP.setCenter(a3T4TrapL);
		a3T4CliBP.setCenter(a3T4CliL);
		a3T4TimesScoBP.setCenter(a3T4TimesScoL);
		a3T4TimesAmpBP.setCenter(a3T4TimesAmpL);
		a3T4TitleBP.setId("comAllsPlayTitleBP");
		a3T4CyBP.setId("comAllsPlayStatBP1");
		a3T4SpeBP.setId("comAllsPlayStatBP2");
		a3T4AmpBP.setId("comAllsPlayStatBP3");
		a3T4TrapBP.setId("comAllsPlayStatBP4");
		a3T4CliBP.setId("comAllsPlayStatBP5");
		a3T4TimesScoBP.setId("comAllsPlayStatBP6");
		a3T4TimesAmpBP.setId("comAllsPlayStatBP7");
		VBox a3T4VB = new VBox(5);
		a3T4VB.getChildren().addAll(a3T4TitleBP, a3T4CyBP, a3T4SpeBP, a3T4AmpBP, a3T4TrapBP, a3T4CliBP, a3T4TimesScoBP, a3T4TimesAmpBP);
		VBox a3VB = new VBox(5);
		VBox a3T1VB = new VBox(5);
		VBox a3T2VB = new VBox(5);
		VBox a3T3VB = new VBox(5);
		a3VB.getChildren().addAll(a3TitleBP, a3CyBP, a3SpeBP, a3AmpBP, a3TrapBP, a3CliBP, a3TimesScoBP, a3TimesAmpBP);
		a3T1VB.getChildren().addAll(a3T1TitleBP, a3T1CyBP, a3T1SpeBP, a3T1AmpBP, a3T1TrapBP, a3T1CliBP, a3T1TimesScoBP, a3T1TimesAmpBP);
		a3T2VB.getChildren().addAll(a3T2TitleBP, a3T2CyBP, a3T2SpeBP, a3T2AmpBP, a3T2TrapBP, a3T2CliBP, a3T2TimesScoBP, a3T2TimesAmpBP);
		a3T3VB.getChildren().addAll(a3T3TitleBP, a3T3CyBP, a3T3SpeBP, a3T3AmpBP, a3T3TrapBP, a3T3CliBP, a3T3TimesScoBP, a3T3TimesAmpBP);
		all3HB.getChildren().addAll(a3VB, a3T1VB, a3T2VB, a3T3VB);
		all3HB.getChildren().addAll(a3T4VB);
	}
	
	public void addCompare3AllNo4thPlayAlls(PlayoffAlliance a3, Team a3T1, Team a3T2, Team a3T3, int a3AllNum) {
		Label a3TitleL = null;
		if(a3AllNum == 1) {
			a3TitleL = new Label("Allaince 1's Stats");
		}
		if(a3AllNum == 2) {
			a3TitleL = new Label("Allaince 2's Stats");
		}
		if(a3AllNum == 3) {
			a3TitleL = new Label("Allaince 3's Stats");
		}
		if(a3AllNum == 4) {
			a3TitleL = new Label("Allaince 4's Stats");
		}
		if(a3AllNum == 5) {
			a3TitleL = new Label("Allaince 5's Stats");
		}
		if(a3AllNum == 6) {
			a3TitleL = new Label("Allaince 6's Stats");
		}
		if(a3AllNum == 7) {
			a3TitleL = new Label("Allaince 7's Stats");
		}
		if(a3AllNum == 8) {
			a3TitleL = new Label("Allaince 8's Stats");
		}
		a3TitleL.setId("smallTitle");
		double a3T1Cy = a3T1.getAvgCycles();
		double a3T2Cy = a3T2.getAvgCycles();
		double a3T3Cy = a3T3.getAvgCycles();
		double a3Cy = a3T1Cy + a3T2Cy + a3T3Cy;
		Label a3CyL = new Label(Double.toString(a3Cy));
		double a3T1Spe = a3T1.getAvgSpe();
		double a3T2Spe = a3T2.getAvgSpe();
		double a3T3Spe = a3T3.getAvgSpe();
		double a3Spe = a3T1Spe + a3T2Spe + a3T3Spe;
		Label a3SpeL = new Label(Double.toString(a3Spe));
		double a3T1Amp = a3T1.getAvgAmp();
		double a3T2Amp = a3T2.getAvgAmp();
		double a3T3Amp = a3T3.getAvgAmp();
		double a3Amp = a3T1Amp + a3T2Amp + a3T3Amp;
		Label a3AmpL = new Label(Double.toString(a3Amp));
		double a3T1Trap = a3T1.getAvgTrap();
		double a3T2Trap = a3T2.getAvgTrap();
		double a3T3Trap = a3T3.getAvgTrap();
		double a3Trap = a3T1Trap + a3T2Trap + a3T3Trap;
		Label a3TrapL = new Label(Double.toString(a3Trap));
		double a3T1Cli = a3T1.getAvgClimb();
		double a3T2Cli = a3T2.getAvgClimb();
		double a3T3Cli = a3T3.getAvgClimb();
		double a3Cli = a3T1Cli + a3T2Cli + a3T3Cli;
		Label a3CliL = new Label(Double.toString(a3Cli));
		int a3T1TimesSco = a3T1.getTimesHumSco();
		int a3T2TimesSco = a3T2.getTimesHumSco();
		int a3T3TimesSco = a3T3.getTimesHumSco();
		int a3TimesSco = a3T1TimesSco + a3T2TimesSco + a3T3TimesSco;
		Label a3TimesScoL = new Label(Integer.toString(a3TimesSco));
		int a3T1TimesAmp = a3T1.getTimesHumAmp();
		int a3T2TimesAmp = a3T2.getTimesHumAmp();
		int a3T3TimesAmp = a3T3.getTimesHumAmp();
		int a3TimesAmp = a3T1TimesAmp + a3T2TimesAmp + a3T3TimesAmp;
		Label a3TimesAmpL = new Label(Integer.toString(a3TimesAmp));
		Label a3TitleCyL = new Label("Avg Cycles");
		Label a3TitleSpeL = new Label("Avg Speaker");
		Label a3TitleAmpL = new Label("Avg Amp");
		Label a3TitleTrapL = new Label("Avg Trap");
		Label a3TitleCliL = new Label("Avg Climb");
		Label a3TitleTimesScoL = new Label("Times Scoure");
		Label a3TitleTimesAmpL = new Label("Times Amp");
		a3CyL.setId("avgStat");
		a3SpeL.setId("avgStat");
		a3AmpL.setId("avgStat");
		a3TrapL.setId("avgStat");
		a3CliL.setId("avgStat");
		a3TimesScoL.setId("avgStat");
		a3TimesAmpL.setId("avgStat");
		a3TimesAmpL.setId("smallTitle");
		a3TitleCyL.setId("smallTitle");
		a3TitleSpeL.setId("smallTitle");
		a3TitleAmpL.setId("smallTitle");
		a3TitleTrapL.setId("smallTitle");
		a3TitleCliL.setId("smallTitle");
		a3TitleTimesScoL.setId("smallTitle");
		a3TitleTimesAmpL.setId("smallTitle");
		BorderPane a3TitleBP = new BorderPane();
		BorderPane a3CyBP = new BorderPane();
		BorderPane a3SpeBP = new BorderPane();
		BorderPane a3AmpBP = new BorderPane();
		BorderPane a3TrapBP = new BorderPane();
		BorderPane a3CliBP = new BorderPane();
		BorderPane a3TimesScoBP = new BorderPane();
		BorderPane a3TimesAmpBP = new BorderPane();
		a3CyBP.setTop(a3TitleCyL);
		a3SpeBP.setTop(a3TitleSpeL);
		a3AmpBP.setTop(a3TitleAmpL);
		a3TrapBP.setTop(a3TitleTrapL);
		a3CliBP.setTop(a3TitleCliL);
		a3TimesScoBP.setTop(a3TitleTimesScoL);
		a3TimesAmpBP.setTop(a3TitleTimesAmpL);
		a3TitleBP.setCenter(a3TitleL);
		a3CyBP.setCenter(a3CyL);
		a3SpeBP.setCenter(a3SpeL);
		a3AmpBP.setCenter(a3AmpL);
		a3TrapBP.setCenter(a3TrapL);
		a3CliBP.setCenter(a3CliL);
		a3TimesScoBP.setCenter(a3TimesScoL);
		a3TimesAmpBP.setCenter(a3TimesAmpL);
		a3TitleBP.setId("comAllsPlayAllTitleBP");
		a3CyBP.setId("comAllsPlayStatBP1");
		a3SpeBP.setId("comAllsPlayStatBP2");
		a3AmpBP.setId("comAllsPlayStatBP3");
		a3TrapBP.setId("comAllsPlayStatBP4");
		a3CliBP.setId("comAllsPlayStatBP5");
		a3TimesScoBP.setId("comAllsPlayStatBP6");
		a3TimesAmpBP.setId("comAllsPlayStatBP7");
		int a3T1TeamNum = a3T1.getTeamNum();
		int a3T2TeamNum = a3T2.getTeamNum();
		int a3T3TeamNum = a3T3.getTeamNum();
		Label a3T1TitleL = new Label(a3T1TeamNum + "'s Stats");
		Label a3T2TitleL = new Label(a3T2TeamNum + "'s Stats");
		Label a3T3TitleL = new Label(a3T3TeamNum + "'s Stats");
		Label a3T1CyL = new Label(Double.toString(a3T1Cy));
		Label a3T1SpeL = new Label(Double.toString(a3T1Spe));
		Label a3T1AmpL = new Label(Double.toString(a3T1Amp));
		Label a3T1TrapL = new Label(Double.toString(a3T1Trap));
		Label a3T1CliL = new Label(Double.toString(a3T1Cli));
		Label a3T1TimesScoL = new Label(Integer.toString(a3T1TimesSco));
		Label a3T1TimesAmpL = new Label(Integer.toString(a3T1TimesAmp));
		Label a3T2CyL = new Label(Double.toString(a3T2Cy));
		Label a3T2SpeL = new Label(Double.toString(a3T2Spe));
		Label a3T2AmpL = new Label(Double.toString(a3T2Amp));
		Label a3T2TrapL = new Label(Double.toString(a3T2Trap));
		Label a3T2CliL = new Label(Double.toString(a3T2Cli));
		Label a3T2TimesScoL = new Label(Integer.toString(a3T2TimesSco));
		Label a3T2TimesAmpL = new Label(Integer.toString(a3T2TimesAmp));
		Label a3T3CyL = new Label(Double.toString(a3T3Cy));
		Label a3T3SpeL = new Label(Double.toString(a3T3Spe));
		Label a3T3AmpL = new Label(Double.toString(a3T3Amp));
		Label a3T3TrapL = new Label(Double.toString(a3T3Trap));
		Label a3T3CliL = new Label(Double.toString(a3T3Cli));
		Label a3T3TimesScoL = new Label(Integer.toString(a3T3TimesSco));
		Label a3T3TimesAmpL = new Label(Integer.toString(a3T3TimesAmp));
		Label a3T1TitleCyL = new Label("Avg Cycles");
		Label a3T1TitleSpeL = new Label("Avg Speaker");
		Label a3T1TitleAmpL = new Label("Avg Amp");
		Label a3T1TitleTrapL = new Label("Avg Trap");
		Label a3T1TitleCliL = new Label("Avg Climb");
		Label a3T1TitleTimesScoL = new Label("Times Scoure");
		Label a3T1TitleTimesAmpL = new Label("Times Amp");
		Label a3T2TitleCyL = new Label("Avg Cycles");
		Label a3T2TitleSpeL = new Label("Avg Speaker");
		Label a3T2TitleAmpL = new Label("Avg Amp");
		Label a3T2TitleTrapL = new Label("Avg Trap");
		Label a3T2TitleCliL = new Label("Avg Climb");
		Label a3T2TitleTimesScoL = new Label("Times Scoure");
		Label a3T2TitleTimesAmpL = new Label("Times Amp");
		Label a3T3TitleCyL = new Label("Avg Cycles");
		Label a3T3TitleSpeL = new Label("Avg Speaker");
		Label a3T3TitleAmpL = new Label("Avg Amp");
		Label a3T3TitleTrapL = new Label("Avg Trap");
		Label a3T3TitleCliL = new Label("Avg Climb");
		Label a3T3TitleTimesScoL = new Label("Times Scoure");
		Label a3T3TitleTimesAmpL = new Label("Times Amp");
		a3T1CyL.setId("avgStat");
		a3T1SpeL.setId("avgStat");
		a3T1AmpL.setId("avgStat");
		a3T1TrapL.setId("avgStat");
		a3T1CliL.setId("avgStat");
		a3T1TimesScoL.setId("avgStat");
		a3T1TimesAmpL.setId("avgStat");
		a3T2CyL.setId("avgStat");
		a3T2SpeL.setId("avgStat");
		a3T2AmpL.setId("avgStat");
		a3T2TrapL.setId("avgStat");
		a3T2CliL.setId("avgStat");
		a3T2TimesScoL.setId("avgStat");
		a3T2TimesAmpL.setId("avgStat");
		a3T3CyL.setId("avgStat");
		a3T3SpeL.setId("avgStat");
		a3T3AmpL.setId("avgStat");
		a3T3TrapL.setId("avgStat");
		a3T3CliL.setId("avgStat");
		a3T3TimesScoL.setId("avgStat");
		a3T3TimesAmpL.setId("avgStat");
		a3T1TitleCyL.setId("smallTitle");
		a3T1TitleSpeL.setId("smallTitle");
		a3T1TitleAmpL.setId("smallTitle");
		a3T1TitleTrapL.setId("smallTitle");
		a3T1TitleCliL.setId("smallTitle");
		a3T1TitleTimesScoL.setId("smallTitle");
		a3T1TitleTimesAmpL.setId("smallTitle");
		a3T2TitleCyL.setId("smallTitle");
		a3T2TitleSpeL.setId("smallTitle");
		a3T2TitleAmpL.setId("smallTitle");
		a3T2TitleTrapL.setId("smallTitle");
		a3T2TitleCliL.setId("smallTitle");
		a3T2TitleTimesScoL.setId("smallTitle");
		a3T2TitleTimesAmpL.setId("smallTitle");
		a3T3TitleCyL.setId("smallTitle");
		a3T3TitleSpeL.setId("smallTitle");
		a3T3TitleAmpL.setId("smallTitle");
		a3T3TitleTrapL.setId("smallTitle");
		a3T3TitleCliL.setId("smallTitle");
		a3T3TitleTimesScoL.setId("smallTitle");
		a3T3TitleTimesAmpL.setId("smallTitle");
		a3T1TitleL.setId("smallTitle");
		a3T2TitleL.setId("smallTitle");
		a3T3TitleL.setId("smallTitle");
		BorderPane a3T1TitleBP = new BorderPane();
		BorderPane a3T1CyBP = new BorderPane();
		BorderPane a3T1SpeBP = new BorderPane();
		BorderPane a3T1AmpBP = new BorderPane();
		BorderPane a3T1TrapBP = new BorderPane();
		BorderPane a3T1CliBP = new BorderPane();
		BorderPane a3T1TimesScoBP = new BorderPane();
		BorderPane a3T1TimesAmpBP = new BorderPane();
		a3T1CyBP.setTop(a3T1TitleCyL);
		a3T1SpeBP.setTop(a3T1TitleSpeL);
		a3T1AmpBP.setTop(a3T1TitleAmpL);
		a3T1TrapBP.setTop(a3T1TitleTrapL);
		a3T1CliBP.setTop(a3T1TitleCliL);
		a3T1TimesScoBP.setTop(a3T1TitleTimesScoL);
		a3T1TimesAmpBP.setTop(a3T1TitleTimesAmpL);
		a3T1TitleBP.setCenter(a3T1TitleL);
		a3T1CyBP.setCenter(a3T1CyL);
		a3T1SpeBP.setCenter(a3T1SpeL);
		a3T1AmpBP.setCenter(a3T1AmpL);
		a3T1TrapBP.setCenter(a3T1TrapL);
		a3T1CliBP.setCenter(a3T1CliL);
		a3T1TimesScoBP.setCenter(a3T1TimesScoL);
		a3T1TimesAmpBP.setCenter(a3T1TimesAmpL);
		a3T1TitleBP.setId("comAllsPlayTitleBP");
		a3T1CyBP.setId("comAllsPlayStatBP1");
		a3T1SpeBP.setId("comAllsPlayStatBP2");
		a3T1AmpBP.setId("comAllsPlayStatBP3");
		a3T1TrapBP.setId("comAllsPlayStatBP4");
		a3T1CliBP.setId("comAllsPlayStatBP5");
		a3T1TimesScoBP.setId("comAllsPlayStatBP6");
		a3T1TimesAmpBP.setId("comAllsPlayStatBP7");
		BorderPane a3T2TitleBP = new BorderPane();
		BorderPane a3T2CyBP = new BorderPane();
		BorderPane a3T2SpeBP = new BorderPane();
		BorderPane a3T2AmpBP = new BorderPane();
		BorderPane a3T2TrapBP = new BorderPane();
		BorderPane a3T2CliBP = new BorderPane();
		BorderPane a3T2TimesScoBP = new BorderPane();
		BorderPane a3T2TimesAmpBP = new BorderPane();
		a3T2CyBP.setTop(a3T2TitleCyL);
		a3T2SpeBP.setTop(a3T2TitleSpeL);
		a3T2AmpBP.setTop(a3T2TitleAmpL);
		a3T2TrapBP.setTop(a3T2TitleTrapL);
		a3T2CliBP.setTop(a3T2TitleCliL);
		a3T2TimesScoBP.setTop(a3T2TitleTimesScoL);
		a3T2TimesAmpBP.setTop(a3T2TitleTimesAmpL);
		a3T2TitleBP.setCenter(a3T2TitleL);
		a3T2CyBP.setCenter(a3T2CyL);
		a3T2SpeBP.setCenter(a3T2SpeL);
		a3T2AmpBP.setCenter(a3T2AmpL);
		a3T2TrapBP.setCenter(a3T2TrapL);
		a3T2CliBP.setCenter(a3T2CliL);
		a3T2TimesScoBP.setCenter(a3T2TimesScoL);
		a3T2TimesAmpBP.setCenter(a3T2TimesAmpL);
		a3T2TitleBP.setId("comAllsPlayTitleBP");
		a3T2CyBP.setId("comAllsPlayStatBP1");
		a3T2SpeBP.setId("comAllsPlayStatBP2");
		a3T2AmpBP.setId("comAllsPlayStatBP3");
		a3T2TrapBP.setId("comAllsPlayStatBP4");
		a3T2CliBP.setId("comAllsPlayStatBP5");
		a3T2TimesScoBP.setId("comAllsPlayStatBP6");
		a3T2TimesAmpBP.setId("comAllsPlayStatBP7");
		BorderPane a3T3TitleBP = new BorderPane();
		BorderPane a3T3CyBP = new BorderPane();
		BorderPane a3T3SpeBP = new BorderPane();
		BorderPane a3T3AmpBP = new BorderPane();
		BorderPane a3T3TrapBP = new BorderPane();
		BorderPane a3T3CliBP = new BorderPane();
		BorderPane a3T3TimesScoBP = new BorderPane();
		BorderPane a3T3TimesAmpBP = new BorderPane();
		a3T3CyBP.setTop(a3T3TitleCyL);
		a3T3SpeBP.setTop(a3T3TitleSpeL);
		a3T3AmpBP.setTop(a3T3TitleAmpL);
		a3T3TrapBP.setTop(a3T3TitleTrapL);
		a3T3CliBP.setTop(a3T3TitleCliL);
		a3T3TimesScoBP.setTop(a3T3TitleTimesScoL);
		a3T3TimesAmpBP.setTop(a3T3TitleTimesAmpL);
		a3T3TitleBP.setCenter(a3T3TitleL);
		a3T3CyBP.setCenter(a3T3CyL);
		a3T3SpeBP.setCenter(a3T3SpeL);
		a3T3AmpBP.setCenter(a3T3AmpL);
		a3T3TrapBP.setCenter(a3T3TrapL);
		a3T3CliBP.setCenter(a3T3CliL);
		a3T3TimesScoBP.setCenter(a3TimesScoL);
		a3T3TimesAmpBP.setCenter(a3T3TimesAmpL);
		a3T3TitleBP.setId("comAllsPlayTitleBP");
		a3T3CyBP.setId("comAllsPlayStatBP1");
		a3T3SpeBP.setId("comAllsPlayStatBP2");
		a3T3AmpBP.setId("comAllsPlayStatBP3");
		a3T3TrapBP.setId("comAllsPlayStatBP4");
		a3T3CliBP.setId("comAllsPlayStatBP5");
		a3T3TimesScoBP.setId("comAllsPlayStatBP6");
		a3T3TimesAmpBP.setId("comAllsPlayStatBP7");
		VBox a3VB = new VBox(5);
		VBox a3T1VB = new VBox(5);
		VBox a3T2VB = new VBox(5);
		VBox a3T3VB = new VBox(5);
		a3VB.getChildren().addAll(a3TitleBP, a3CyBP, a3SpeBP, a3AmpBP, a3TrapBP, a3CliBP, a3TimesScoBP, a3TimesAmpBP);
		a3T1VB.getChildren().addAll(a3T1TitleBP, a3T1CyBP, a3T1SpeBP, a3T1AmpBP, a3T1TrapBP, a3T1CliBP, a3T1TimesScoBP, a3T1TimesAmpBP);
		a3T2VB.getChildren().addAll(a3T2TitleBP, a3T2CyBP, a3T2SpeBP, a3T2AmpBP, a3T2TrapBP, a3T2CliBP, a3T2TimesScoBP, a3T2TimesAmpBP);
		a3T3VB.getChildren().addAll(a3T3TitleBP, a3T3CyBP, a3T3SpeBP, a3T3AmpBP, a3T3TrapBP, a3T3CliBP, a3T3TimesScoBP, a3T3TimesAmpBP);
		all3HB.getChildren().addAll(a3VB, a3T1VB, a3T2VB, a3T3VB);
	}
	
	public void addCompare1AllHas4thPlayPieChart(PlayoffAlliance a1, Team a1T1, Team a1T2, Team a1T3, Team a1T4, int a1AllNum) {
		double a1Cy = a1T1.getAvgCycles() + a1T2.getAvgCycles() + a1T3.getAvgCycles() + a1T4.getAvgCycles();
		double a1Spe = a1T1.getAvgSpe() + a1T2.getAvgSpe() + a1T3.getAvgSpe() + a1T4.getAvgSpe();
		double a1Amp = a1T1.getAvgAmp() + a1T2.getAvgAmp() + a1T3.getAvgAmp() + a1T4.getAvgAmp();
		double a1Trap = a1T1.getAvgTrap() + a1T2.getAvgTrap() + a1T3.getAvgTrap() + a1T4.getAvgTrap();
		double a1Climb = a1T1.getAvgClimb() + a1T2.getAvgClimb() + a1T3.getAvgClimb() + a1T4.getAvgClimb();
		double a1TimesSco = a1T1.getTimesHumSco() + a1T2.getTimesHumSco() + a1T3.getTimesHumSco() + a1T4.getTimesHumSco();
		double a1TimesAmp = a1T1.getTimesHumAmp() + a1T2.getTimesHumAmp() + a1T3.getTimesHumAmp() + a1T4.getTimesHumAmp();
		double a1TotalMatches = a1T1.getTotalMatchesPlayed() + a1T2.getTotalMatchesPlayed() + a1T3.getTotalMatchesPlayed() + a1T4.getTotalMatchesPlayed();
		//alliance 1 cy pie chart
		int a1SpeComPer = (int) ((a1Spe/a1Cy) * 100);
		int a1AmpComPer = (int) ((a1Amp/a1Cy) * 100);
		int a1TrapComPer = (int) ((a1Trap/a1Cy) * 100);
		int whoToAdd1 = 1;
		while(a1SpeComPer + a1AmpComPer + a1TrapComPer != 100) {
			if(whoToAdd1 == 1) {
				a1SpeComPer++;
				whoToAdd1++;
			}else if(whoToAdd1 == 2) {
				a1AmpComPer++;
				whoToAdd1++;
			}else if(whoToAdd1 == 3){
				a1TrapComPer++;
				whoToAdd1 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData1 = FXCollections.observableArrayList(new PieChart.Data("Speaker", a1SpeComPer), new PieChart.Data("Amp", a1AmpComPer), new PieChart.Data("Trap", a1TrapComPer));
		PieChart a1CyPieC = new PieChart(pieChartData1);
		a1CyPieC.autosize();
		a1CyPieC.setMaxSize(300, 300);
		a1CyPieC.setMinSize(300, 300);
		a1CyPieC.setLabelsVisible(true);
		//alliance 1 Hum Player Position
		int a1TimesScoComPer = (int) ((a1TimesSco/a1TotalMatches));
		int a1TimesAmpComPer = (int) ((a1TimesAmp/a1TotalMatches));
		int whoToAdd4 = 1;
		while(a1TimesScoComPer + a1TimesAmpComPer != 100) {
			if(whoToAdd4 == 1) {
				a1TimesScoComPer++;
				whoToAdd4++;
			}else if(whoToAdd4 == 2) {
				a1TimesAmpComPer++;
				whoToAdd4 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData4 = FXCollections.observableArrayList(new PieChart.Data("Scoure", a1TimesScoComPer), new PieChart.Data("Amp", a1TimesAmpComPer));
		PieChart a1HumPieC = new PieChart(pieChartData4);
		a1HumPieC.autosize();
		a1HumPieC.setMaxSize(300, 300);
		a1HumPieC.setMinSize(300, 300);
		a1HumPieC.setLabelsVisible(true);
		all1HB.getChildren().addAll(a1CyPieC, a1HumPieC);
	}
	
	public void addCompare2AllHas4thPlayPieChart(PlayoffAlliance a2, Team a2T1, Team a2T2, Team a2T3, Team a2T4, int a2AllNum) {
		double a2Cy = a2T1.getAvgCycles() + a2T2.getAvgCycles() + a2T3.getAvgCycles() + a2T4.getAvgCycles();
		double a2Spe = a2T1.getAvgSpe() + a2T2.getAvgSpe() + a2T3.getAvgSpe() + a2T4.getAvgSpe();
		double a2Amp = a2T1.getAvgAmp() + a2T2.getAvgAmp() + a2T3.getAvgAmp() + a2T4.getAvgAmp();
		double a2Trap = a2T1.getAvgTrap() + a2T2.getAvgTrap() + a2T3.getAvgTrap() + a2T4.getAvgTrap();
		double a2Climb = a2T1.getAvgClimb() + a2T2.getAvgClimb() + a2T3.getAvgClimb() + a2T4.getAvgClimb();
		double a2TimesSco = a2T1.getTimesHumSco() + a2T2.getTimesHumSco() + a2T3.getTimesHumSco() + a2T4.getTimesHumSco();
		double a2TimesAmp = a2T1.getTimesHumAmp() + a2T2.getTimesHumAmp() + a2T3.getTimesHumAmp() + a2T4.getTimesHumAmp();
		double a2TotalMatches = a2T1.getTotalMatchesPlayed() + a2T2.getTotalMatchesPlayed() + a2T3.getTotalMatchesPlayed() + a2T4.getTotalMatchesPlayed();
		//alliance 2 cy pie chart
		int a2SpeComPer = (int) ((a2Spe/a2Cy) * 100);
		int a2AmpComPer = (int) ((a2Amp/a2Cy) * 100);
		int a2TrapComPer = (int) ((a2Trap/a2Cy) * 100);
		int whoToAdd2 = 1;
		while(a2SpeComPer + a2AmpComPer + a2TrapComPer != 100) {
			if(whoToAdd2 == 1) {
				a2SpeComPer++;
				whoToAdd2++;
			}else if(whoToAdd2 == 2) {
				a2AmpComPer++;
				whoToAdd2++;
			}else if(whoToAdd2 == 3){
				a2TrapComPer++;
				whoToAdd2 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData2 = FXCollections.observableArrayList(new PieChart.Data("Speaker", a2SpeComPer), new PieChart.Data("Amp", a2AmpComPer), new PieChart.Data("Trap", a2TrapComPer));
		PieChart a2CyPieC = new PieChart(pieChartData2);
		a2CyPieC.autosize();
		a2CyPieC.setMaxSize(300, 300);
		a2CyPieC.setMinSize(300, 300);
		a2CyPieC.setLabelsVisible(true);
		//alliance 2 Hum Player Position
		int a2TimesScoComPer = (int) ((a2TimesSco/a2TotalMatches));
		int a2TimesAmpComPer = (int) ((a2TimesAmp/a2TotalMatches));
		int whoToAdd5 = 1;
		while(a2TimesScoComPer + a2TimesAmpComPer != 100) {
			if(whoToAdd5 == 1) {
				a2TimesScoComPer++;
				whoToAdd5++;
			}else if(whoToAdd5 == 2) {
				a2TimesAmpComPer++;
				whoToAdd5 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData5 = FXCollections.observableArrayList(new PieChart.Data("Scoure", a2TimesScoComPer), new PieChart.Data("Amp", a2TimesAmpComPer));
		PieChart a2HumPieC = new PieChart(pieChartData5);
		a2HumPieC.autosize();
		a2HumPieC.setMaxSize(300, 300);
		a2HumPieC.setMinSize(300, 300);
		a2HumPieC.setLabelsVisible(true);
		all2HB.getChildren().addAll(a2CyPieC, a2HumPieC);
	}
	
	public void addCompare3AllHas4thPlayPieChart(PlayoffAlliance a3, Team a3T1, Team a3T2, Team a3T3, Team a3T4, int a3AllNum) {
		double a3Cy = a3T1.getAvgCycles() + a3T2.getAvgCycles() + a3T3.getAvgCycles() + a3T4.getAvgCycles();
		double a3Spe = a3T1.getAvgSpe() + a3T2.getAvgSpe() + a3T3.getAvgSpe() + a3T4.getAvgSpe();
		double a3Amp = a3T1.getAvgAmp() + a3T2.getAvgAmp() + a3T3.getAvgAmp() + a3T4.getAvgAmp();
		double a3Trap = a3T1.getAvgTrap() + a3T2.getAvgTrap() + a3T3.getAvgTrap() + a3T4.getAvgTrap();
		double a3Climb = a3T1.getAvgClimb() + a3T2.getAvgClimb() + a3T3.getAvgClimb() + a3T4.getAvgClimb();
		double a3TimesSco = a3T1.getTimesHumSco() + a3T2.getTimesHumSco() + a3T3.getTimesHumSco() + a3T4.getTimesHumSco();
		double a3TimesAmp = a3T1.getTimesHumAmp() + a3T2.getTimesHumAmp() + a3T3.getTimesHumAmp() + a3T4.getTimesHumAmp();
		double a3TotalMatches = a3T1.getTotalMatchesPlayed() + a3T2.getTotalMatchesPlayed() + a3T3.getTotalMatchesPlayed() + a3T4.getTotalMatchesPlayed();
		//alliance 3 cy pie chart
		int a3SpeComPer = (int) ((a3Spe/a3Cy) * 100);
		int a3AmpComPer = (int) ((a3Amp/a3Cy) * 100);
		int a3TrapComPer = (int) ((a3Trap/a3Cy) * 100);
		int whoToAdd3 = 1;
		while(a3SpeComPer + a3AmpComPer + a3TrapComPer != 100) {
			if(whoToAdd3 == 1) {
				a3SpeComPer++;
				whoToAdd3++;
			}else if(whoToAdd3 == 2) {
				a3AmpComPer++;
				whoToAdd3++;
			}else if(whoToAdd3 == 3){
				a3TrapComPer++;
				whoToAdd3 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData3 = FXCollections.observableArrayList(new PieChart.Data("Speaker", a3SpeComPer), new PieChart.Data("Amp", a3AmpComPer), new PieChart.Data("Trap", a3TrapComPer));
		PieChart a3CyPieC = new PieChart(pieChartData3);
		a3CyPieC.autosize();
		a3CyPieC.setMaxSize(300, 300);
		a3CyPieC.setMinSize(300, 300);
		a3CyPieC.setLabelsVisible(true);
		//alliance 3 Hum Player Position
		int a3TimesScoComPer = (int) ((a3TimesSco/a3TotalMatches));
		int a3TimesAmpComPer = (int) ((a3TimesAmp/a3TotalMatches));
		int whoToAdd6 = 1;
		while(a3TimesScoComPer + a3TimesAmpComPer != 100) {
			if(whoToAdd6 == 1) {
				a3TimesScoComPer++;
				whoToAdd6++;
			}else if(whoToAdd6 == 2) {
				a3TimesAmpComPer++;
				whoToAdd6 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData6 = FXCollections.observableArrayList(new PieChart.Data("Scoure", a3TimesScoComPer), new PieChart.Data("Amp", a3TimesAmpComPer));
		PieChart a3HumPieC = new PieChart(pieChartData6);
		a3HumPieC.autosize();
		a3HumPieC.setMaxSize(300, 300);
		a3HumPieC.setMinSize(300, 300);
		a3HumPieC.setLabelsVisible(true);
		all3HB.getChildren().addAll(a3CyPieC, a3HumPieC);
	}
	
	public void addCompare1AllNo4thPlayPieChart(PlayoffAlliance a1, Team a1T1, Team a1T2, Team a1T3, int a1AllNum) {
		double a1Cy = a1T1.getAvgCycles() + a1T2.getAvgCycles() + a1T3.getAvgCycles();
		double a1Spe = a1T1.getAvgSpe() + a1T2.getAvgSpe() + a1T3.getAvgSpe();
		double a1Amp = a1T1.getAvgAmp() + a1T2.getAvgAmp() + a1T3.getAvgAmp();
		double a1Trap = a1T1.getAvgTrap() + a1T2.getAvgTrap() + a1T3.getAvgTrap();
		double a1Climb = a1T1.getAvgClimb() + a1T2.getAvgClimb() + a1T3.getAvgClimb();
		double a1TimesSco = a1T1.getTimesHumSco() + a1T2.getTimesHumSco() + a1T3.getTimesHumSco();
		double a1TimesAmp = a1T1.getTimesHumAmp() + a1T2.getTimesHumAmp() + a1T3.getTimesHumAmp();
		double a1TotalMatches = a1T1.getTotalMatchesPlayed() + a1T2.getTotalMatchesPlayed() + a1T3.getTotalMatchesPlayed();
		//alliance 1 cy pie chart
		int a1SpeComPer = (int) ((a1Spe/a1Cy) * 100);
		int a1AmpComPer = (int) ((a1Amp/a1Cy) * 100);
		int a1TrapComPer = (int) ((a1Trap/a1Cy) * 100);
		int whoToAdd1 = 1;
		while(a1SpeComPer + a1AmpComPer + a1TrapComPer != 100) {
			if(whoToAdd1 == 1) {
				a1SpeComPer++;
				whoToAdd1++;
			}else if(whoToAdd1 == 2) {
				a1AmpComPer++;
				whoToAdd1++;
			}else if(whoToAdd1 == 3){
				a1TrapComPer++;
				whoToAdd1 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData1 = FXCollections.observableArrayList(new PieChart.Data("Speaker", a1SpeComPer), new PieChart.Data("Amp", a1AmpComPer), new PieChart.Data("Trap", a1TrapComPer));
		PieChart a1CyPieC = new PieChart(pieChartData1);
		a1CyPieC.autosize();
		a1CyPieC.setMaxSize(300, 300);
		a1CyPieC.setMinSize(300, 300);
		a1CyPieC.setLabelsVisible(true);
		//alliance 1 Hum Player Position
		int a1TimesScoComPer = (int) ((a1TimesSco/a1TotalMatches));
		int a1TimesAmpComPer = (int) ((a1TimesAmp/a1TotalMatches));
		int whoToAdd4 = 1;
		while(a1TimesScoComPer + a1TimesAmpComPer != 100) {
			if(whoToAdd4 == 1) {
				a1TimesScoComPer++;
				whoToAdd4++;
			}else if(whoToAdd4 == 2) {
				a1TimesAmpComPer++;
				whoToAdd4 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData4 = FXCollections.observableArrayList(new PieChart.Data("Scoure", a1TimesScoComPer), new PieChart.Data("Amp", a1TimesAmpComPer));
		PieChart a1HumPieC = new PieChart(pieChartData4);
		a1HumPieC.autosize();
		a1HumPieC.setMaxSize(300, 300);
		a1HumPieC.setMinSize(300, 300);
		a1HumPieC.setLabelsVisible(true);
		all1HB.getChildren().addAll(a1CyPieC, a1HumPieC);
	}
	
	public void addCompare2AllNo4thPlayPieChart(PlayoffAlliance a2, Team a2T1, Team a2T2, Team a2T3, int a2AllNum) {
		double a2Cy = a2T1.getAvgCycles() + a2T2.getAvgCycles() + a2T3.getAvgCycles();
		double a2Spe = a2T1.getAvgSpe() + a2T2.getAvgSpe() + a2T3.getAvgSpe();
		double a2Amp = a2T1.getAvgAmp() + a2T2.getAvgAmp() + a2T3.getAvgAmp();
		double a2Trap = a2T1.getAvgTrap() + a2T2.getAvgTrap() + a2T3.getAvgTrap();
		double a2Climb = a2T1.getAvgClimb() + a2T2.getAvgClimb() + a2T3.getAvgClimb();
		double a2TimesSco = a2T1.getTimesHumSco() + a2T2.getTimesHumSco() + a2T3.getTimesHumSco();
		double a2TimesAmp = a2T1.getTimesHumAmp() + a2T2.getTimesHumAmp() + a2T3.getTimesHumAmp();
		double a2TotalMatches = a2T1.getTotalMatchesPlayed() + a2T2.getTotalMatchesPlayed() + a2T3.getTotalMatchesPlayed();
		//alliance 2 cy pie chart
		int a2SpeComPer = (int) ((a2Spe/a2Cy) * 100);
		int a2AmpComPer = (int) ((a2Amp/a2Cy) * 100);
		int a2TrapComPer = (int) ((a2Trap/a2Cy) * 100);
		int whoToAdd2 = 1;
		while(a2SpeComPer + a2AmpComPer + a2TrapComPer != 100) {
			if(whoToAdd2 == 1) {
				a2SpeComPer++;
				whoToAdd2++;
			}else if(whoToAdd2 == 2) {
				a2AmpComPer++;
				whoToAdd2++;
			}else if(whoToAdd2 == 3){
				a2TrapComPer++;
				whoToAdd2 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData2 = FXCollections.observableArrayList(new PieChart.Data("Speaker", a2SpeComPer), new PieChart.Data("Amp", a2AmpComPer), new PieChart.Data("Trap", a2TrapComPer));
		PieChart a2CyPieC = new PieChart(pieChartData2);
		a2CyPieC.autosize();
		a2CyPieC.setMaxSize(300, 300);
		a2CyPieC.setMinSize(300, 300);
		a2CyPieC.setLabelsVisible(true);
		//alliance 2 Hum Player Position
		int a2TimesScoComPer = (int) ((a2TimesSco/a2TotalMatches));
		int a2TimesAmpComPer = (int) ((a2TimesAmp/a2TotalMatches));
		int whoToAdd5 = 1;
		while(a2TimesScoComPer + a2TimesAmpComPer != 100) {
			if(whoToAdd5 == 1) {
				a2TimesScoComPer++;
				whoToAdd5++;
			}else if(whoToAdd5 == 2) {
				a2TimesAmpComPer++;
				whoToAdd5 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData5 = FXCollections.observableArrayList(new PieChart.Data("Scoure", a2TimesScoComPer), new PieChart.Data("Amp", a2TimesAmpComPer));
		PieChart a2HumPieC = new PieChart(pieChartData5);
		a2HumPieC.autosize();
		a2HumPieC.setMaxSize(300, 300);
		a2HumPieC.setMinSize(300, 300);
		a2HumPieC.setLabelsVisible(true);
		all2HB.getChildren().addAll(a2CyPieC, a2HumPieC);
	}
	
	public void addCompare3AllNo4thPlayPieChart(PlayoffAlliance a3, Team a3T1, Team a3T2, Team a3T3, int a3AllNum) {
		double a3Cy = a3T1.getAvgCycles() + a3T2.getAvgCycles() + a3T3.getAvgCycles();
		double a3Spe = a3T1.getAvgSpe() + a3T2.getAvgSpe() + a3T3.getAvgSpe();
		double a3Amp = a3T1.getAvgAmp() + a3T2.getAvgAmp() + a3T3.getAvgAmp();
		double a3Trap = a3T1.getAvgTrap() + a3T2.getAvgTrap() + a3T3.getAvgTrap();
		double a3Climb = a3T1.getAvgClimb() + a3T2.getAvgClimb() + a3T3.getAvgClimb();
		double a3TimesSco = a3T1.getTimesHumSco() + a3T2.getTimesHumSco() + a3T3.getTimesHumSco();
		double a3TimesAmp = a3T1.getTimesHumAmp() + a3T2.getTimesHumAmp() + a3T3.getTimesHumAmp();
		double a3TotalMatches = a3T1.getTotalMatchesPlayed() + a3T2.getTotalMatchesPlayed() + a3T3.getTotalMatchesPlayed();
		//alliance 3 cy pie chart
		int a3SpeComPer = (int) ((a3Spe/a3Cy) * 100);
		int a3AmpComPer = (int) ((a3Amp/a3Cy) * 100);
		int a3TrapComPer = (int) ((a3Trap/a3Cy) * 100);
		int whoToAdd3 = 1;
		while(a3SpeComPer + a3AmpComPer + a3TrapComPer != 100) {
			if(whoToAdd3 == 1) {
				a3SpeComPer++;
				whoToAdd3++;
			}else if(whoToAdd3 == 2) {
				a3AmpComPer++;
				whoToAdd3++;
			}else if(whoToAdd3 == 3){
				a3TrapComPer++;
				whoToAdd3 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData3 = FXCollections.observableArrayList(new PieChart.Data("Speaker", a3SpeComPer), new PieChart.Data("Amp", a3AmpComPer), new PieChart.Data("Trap", a3TrapComPer));
		PieChart a3CyPieC = new PieChart(pieChartData3);
		a3CyPieC.autosize();
		a3CyPieC.setMaxSize(300, 300);
		a3CyPieC.setMinSize(300, 300);
		a3CyPieC.setLabelsVisible(true);
		//alliance 3 Hum Player Position
		int a3TimesScoComPer = (int) ((a3TimesSco/a3TotalMatches));
		int a3TimesAmpComPer = (int) ((a3TimesAmp/a3TotalMatches));
		int whoToAdd6 = 1;
		while(a3TimesScoComPer + a3TimesAmpComPer != 100) {
			if(whoToAdd6 == 1) {
				a3TimesScoComPer++;
				whoToAdd6++;
			}else if(whoToAdd6 == 2) {
				a3TimesAmpComPer++;
				whoToAdd6 = 1;
			}
		}
		ObservableList<PieChart.Data> pieChartData6 = FXCollections.observableArrayList(new PieChart.Data("Scoure", a3TimesScoComPer), new PieChart.Data("Amp", a3TimesAmpComPer));
		PieChart a3HumPieC = new PieChart(pieChartData6);
		a3HumPieC.autosize();
		a3HumPieC.setMaxSize(300, 300);
		a3HumPieC.setMinSize(300, 300);
		a3HumPieC.setLabelsVisible(true);
		all3HB.getChildren().addAll(a3CyPieC, a3HumPieC);
	}
	
	@Override

	public void handle(ActionEvent event) {
		try {
			if(event.getSource() == submitPlayB) {
				System.out.println("BoopComAllsPlay0");
				this.getChildren().clear();
				Boolean a1Has4th = false;
				Boolean a2Has4th = false;
				Boolean a3Has4th = false;
				String a1AllianceNumS = alliance1CB.getSelectionModel().getSelectedItem();
				String a2AllianceNumS = alliance2CB.getSelectionModel().getSelectedItem();
				String a3AllianceNumS = alliance3CB.getSelectionModel().getSelectedItem();
				int a1AllianceNum = 0;
				int a2AllianceNum = 0;
				int a3AllianceNum = 0;
				int numOfAlls = 0;
				System.out.println("BoopComAllsPlay1");
				if(a1AllianceNumS != null) {
					a1AllianceNum = Integer.parseInt(a1AllianceNumS);
				}
				if(a2AllianceNumS != null) {
					a2AllianceNum = Integer.parseInt(a2AllianceNumS);
				}
				if(a3AllianceNumS != null) {
					a3AllianceNum = Integer.parseInt(a3AllianceNumS);
				}
				PlayoffAlliance a1 = null;
				PlayoffAlliance a2 = null;
				PlayoffAlliance a3 = null;
				System.out.println("BoopComAllsPlay2" + a1AllianceNum + a2AllianceNum + a3AllianceNum);
				if(a1AllianceNum == 1) {
					a1 = thePOA.getAlliance1();
					numOfAlls++;
					System.out.println("BoopComAllsPlay2.1");
				}
				if(a1AllianceNum == 2) {
					a1 = thePOA.getAlliance2();
					numOfAlls++;
				}
				if(a1AllianceNum == 3) {
					a1 = thePOA.getAlliance3();
					numOfAlls++;
				}
				if(a1AllianceNum == 4) {
					a1 = thePOA.getAlliance4();
					numOfAlls++;
				}
				if(a1AllianceNum == 5) {
					a1 = thePOA.getAlliance5();
					numOfAlls++;
				}
				if(a1AllianceNum == 6) {
					a1 = thePOA.getAlliance6();
					numOfAlls++;
				}
				if(a1AllianceNum == 7) {
					a1 = thePOA.getAlliance7();
					numOfAlls++;
				}
				if(a1AllianceNum == 8) {
					a1 = thePOA.getAlliance8();
					numOfAlls++;
				}
				if(a2AllianceNum == 1) {
					a2 = thePOA.getAlliance1();
					numOfAlls++;
				}
				if(a2AllianceNum == 2) {
					a2 = thePOA.getAlliance2();
					numOfAlls++;
				}
				if(a2AllianceNum == 3) {
					a2 = thePOA.getAlliance3();
					numOfAlls++;
					System.out.println("BoopComAllsPlay2.2");
				}
				if(a2AllianceNum == 4) {
					a2 = thePOA.getAlliance4();
					numOfAlls++;
				}
				if(a2AllianceNum == 5) {
					a2 = thePOA.getAlliance5();
					numOfAlls++;
				}
				if(a2AllianceNum == 6) {
					a2 = thePOA.getAlliance6();
					numOfAlls++;
				}
				if(a2AllianceNum == 7) {
					a2 = thePOA.getAlliance7();
					numOfAlls++;
				}
				if(a2AllianceNum == 8) {
					a2 = thePOA.getAlliance8();
					numOfAlls++;
				}
				if(a3AllianceNum == 1) {
					a3 = thePOA.getAlliance1();
					numOfAlls++;
				}
				if(a3AllianceNum == 2) {
					a3 = thePOA.getAlliance2();
					numOfAlls++;
				}
				if(a3AllianceNum == 3) {
					a3 = thePOA.getAlliance3();
					numOfAlls++;
				}
				if(a3AllianceNum == 4) {
					a3 = thePOA.getAlliance4();
					numOfAlls++;
					System.out.println("BoopComAllsPlay2.3");
				}
				if(a3AllianceNum == 5) {
					a3 = thePOA.getAlliance5();
					numOfAlls++;
				}
				if(a3AllianceNum == 6) {
					a3 = thePOA.getAlliance6();
					numOfAlls++;
				}
				if(a3AllianceNum == 7) {
					a3 = thePOA.getAlliance7();
					numOfAlls++;
				}
				if(a3AllianceNum == 8) {
					a3 = thePOA.getAlliance8();
					numOfAlls++;
				}
				System.out.println("BoopComAllsPlay3");
				Team a1T1 = null;
				Team a1T2 = null;
				Team a1T3 = null;
				Team a1T4 = null;
				Team a2T1 = null;
				Team a2T2 = null;
				Team a2T3 = null;
				Team a2T4 = null;
				Team a3T1 = null;
				Team a3T2 = null;
				Team a3T3 = null;
				Team a3T4 = null;
				if(a1 != null) {
					if(a1.getTeam1() != null) {
						a1T1 = a1.getTeam1();
					}
					if(a1.getTeam2() != null) {
						a1T2 = a1.getTeam2();
					}
					if(a1.getTeam3() != null) {
						a1T3 = a1.getTeam3();
					}
					if(a1.getTeam4() != null) {
						a1T4 = a1.getTeam4();
						a1Has4th = true;
					}
				}
				if(a2 != null) {
					if(a2.getTeam1() != null) {
						a2T1 = a2.getTeam1();
					}
					if(a2.getTeam2() != null) {
						a2T2 = a2.getTeam2();
					}
					if(a2.getTeam3() != null) {
						a2T3 = a2.getTeam3();
					}
					if(a2.getTeam4() != null) {
						a2T4 = a2.getTeam4();
						a2Has4th = true;
					}
				}
				if(a3 != null) {
					if(a3.getTeam1() != null) {
						a3T1 = a3.getTeam1();
					}
					if(a3.getTeam2() != null) {
						a3T2 = a3.getTeam2();
					}
					if(a3.getTeam3() != null) {
						a3T3 = a3.getTeam3();
					}
					if(a3.getTeam4() != null) {
						a3T4 = a3.getTeam4();
						a3Has4th = true;
					}
				}
				System.out.println("BoopComAllsPlay4");
				this.add(new Label("    "), 0, 0);
				this.add(new Label("    "), 2, 0);
				this.add(new Label("    "), 0, 2);
				this.add(new Label("    "), 0, 4);
				this.add(new Label("    "), 0, 6);
				this.add(new Label("    "), 0, 8);
				this.add(new Label("    "), 0, 10);
				this.add(new Label("    "), 0, 12);
				System.out.println("BoopComAllsPlay5");
				if(numOfAlls == 2) {
					if(a1Has4th == true) {
						addCompare1AllHas4thPlayAlls(a1, a1T1, a1T2, a1T3, a1T4, a1AllianceNum);
						addCompare1AllHas4thPlayPieChart(a1, a1T1, a1T2, a1T3, a1T4, a1AllianceNum);
					}else {
						addCompare1AllNo4thPlayAlls(a1, a1T1, a1T2, a1T3, a1AllianceNum);
						addCompare1AllNo4thPlayPieChart(a1, a1T1, a1T2, a1T3, a1AllianceNum);
					}
					if(a2Has4th == true) {
						addCompare2AllHas4thPlayAlls(a2, a2T1, a2T2, a2T3, a2T4, a2AllianceNum);
						addCompare2AllHas4thPlayPieChart(a2, a2T1, a2T2, a2T3, a2T4, a2AllianceNum);
					}else {
						addCompare2AllNo4thPlayAlls(a2, a2T1, a2T2, a2T3, a2AllianceNum);
						addCompare2AllNo4thPlayPieChart(a2, a2T1, a2T2, a2T3, a2AllianceNum);
					}
					this.add(all1HB, 1, 1);
					this.add(all12HB, 1, 3);
					this.add(all2HB, 1, 5);
					this.add(all22HB, 1, 7);
				}else if(numOfAlls == 3) {
					System.out.println("BoopComAllsPlay6");
					if(a1Has4th == true) {
						System.out.println("BoopComAllsPlay6.1");
						addCompare1AllHas4thPlayAlls(a1, a1T1, a1T2, a1T3, a1T4, a1AllianceNum);
						addCompare1AllHas4thPlayPieChart(a1, a1T1, a1T2, a1T3, a1T4, a1AllianceNum);
					}else {
						System.out.println("BoopComAllsPlay6.2");
						addCompare1AllNo4thPlayAlls(a1, a1T1, a1T2, a1T3, a1AllianceNum);
						addCompare1AllNo4thPlayPieChart(a1, a1T1, a1T2, a1T3, a1AllianceNum);
					}
					if(a2Has4th == true) {
						System.out.println("BoopComAllsPlay6.3");
						addCompare2AllHas4thPlayAlls(a2, a2T1, a2T2, a2T3, a2T4, a2AllianceNum);
						addCompare2AllHas4thPlayPieChart(a2, a2T1, a2T2, a2T3, a2T4, a2AllianceNum);
					}else {
						System.out.println("BoopComAllsPlay6.4");
						addCompare2AllNo4thPlayAlls(a2, a2T1, a2T2, a2T3, a2AllianceNum);
						System.out.println("BoopComAllsPlay6.4.2");
						addCompare2AllNo4thPlayPieChart(a2, a2T1, a2T2, a2T3, a2AllianceNum);
						System.out.println("BoopComAllsPlay6.4.3");
					}
					if(a3Has4th == true) {
						System.out.println("BoopComAllsPlay6.5");
						addCompare3AllHas4thPlayAlls(a3, a3T1, a3T2, a3T3, a3T4, a3AllianceNum);
						addCompare3AllHas4thPlayPieChart(a3, a3T1, a3T2, a3T3, a3T4, a3AllianceNum);
					}else {
						System.out.println("BoopComAllsPlay6.6");
						addCompare3AllNo4thPlayAlls(a3, a3T1, a3T2, a3T3, a3AllianceNum);
						addCompare3AllNo4thPlayPieChart(a3, a3T1, a3T2, a3T3, a3AllianceNum);
					}
					System.out.println("BoopComAllsPlay7");
					this.add(all1HB, 1, 1);
					this.add(all12HB, 1, 3);
					this.add(all2HB, 1, 5);
					this.add(all22HB, 1, 7);
					this.add(all3HB, 1, 9);
					this.add(all32HB, 1, 11);
					System.out.println("BoopComAllsPlay8");
				}
				System.out.println("BoopComAllsPlay9");
			}
			if (event.getSource() == submitNonB) {
				this.getChildren().clear();
				System.out.println("BoopComAlls1");
				String selTeamNumA1T1S = allince1T1CB.getSelectionModel().getSelectedItem();
				String selTeamNumA1T2S = allince1T2CB.getSelectionModel().getSelectedItem();
				String selTeamNumA1T3S = allince1T3CB.getSelectionModel().getSelectedItem();
				String selTeamNumA2T1S = allince2T1CB.getSelectionModel().getSelectedItem();
				String selTeamNumA2T2S = allince2T2CB.getSelectionModel().getSelectedItem();
				String selTeamNumA2T3S = allince2T3CB.getSelectionModel().getSelectedItem();
				String selTeamNumA3T1S = allince3T1CB.getSelectionModel().getSelectedItem();
				String selTeamNumA3T2S = allince3T2CB.getSelectionModel().getSelectedItem();
				String selTeamNumA3T3S = allince3T3CB.getSelectionModel().getSelectedItem();
				int selTeamNumA1T1;
				int selTeamNumA1T2;
				int selTeamNumA1T3;
				int selTeamNumA2T1;
				int selTeamNumA2T2;
				int selTeamNumA2T3;
				int selTeamNumA3T1;
				int selTeamNumA3T2;
				int selTeamNumA3T3;
				Team a1T1 = null;
				Team a1T2 = null;
				Team a1T3 = null;
				Team a2T1 = null;
				Team a2T2 = null;
				Team a2T3 = null;
				Team a3T1 = null;
				Team a3T2 = null;
				Team a3T3 = null;
				int numOfSelected = 0;
				int isA1T1 = 0;
				int isA1T2 = 0;
				int isA1T3 = 0;
				int isA2T1 = 0;
				int isA2T2 = 0;
				int isA2T3 = 0;
				int isA3T1 = 0;
				int isA3T2 = 0;
				int isA3T3 = 0;
				if(selTeamNumA1T1S != null) {
					selTeamNumA1T1 = Integer.parseInt(selTeamNumA1T1S);
					a1T1 = theTL.getATeam(selTeamNumA1T1);
					numOfSelected++;
					isA1T1 = 1;
				}
				if(selTeamNumA1T2S != null) {
					selTeamNumA1T2 = Integer.parseInt(selTeamNumA1T2S);
					a1T2 = theTL.getATeam(selTeamNumA1T2);
					numOfSelected++;
					isA1T2 = 1;
				}
				if(selTeamNumA1T3S != null) {
					selTeamNumA1T3 = Integer.parseInt(selTeamNumA1T3S);
					a1T3 = theTL.getATeam(selTeamNumA1T3);
					numOfSelected++;
					isA1T3 = 1;
				}
				if(selTeamNumA2T1S != null) {
					selTeamNumA2T1 = Integer.parseInt(selTeamNumA2T1S);
					a2T1 = theTL.getATeam(selTeamNumA2T1);
					numOfSelected++;
					isA2T1 = 1;
				}
				if(selTeamNumA2T2S != null) {
					selTeamNumA2T2 = Integer.parseInt(selTeamNumA2T2S);
					a2T2 = theTL.getATeam(selTeamNumA2T2);
					numOfSelected++;
					isA2T2 = 1;
				}
				if(selTeamNumA2T3S != null) {
					selTeamNumA2T3 = Integer.parseInt(selTeamNumA2T3S);
					a2T3 = theTL.getATeam(selTeamNumA2T3);
					numOfSelected++;
					isA2T3 = 1;
				}
				if(selTeamNumA3T1S != null) {
					selTeamNumA3T1 = Integer.parseInt(selTeamNumA3T1S);
					a3T1 = theTL.getATeam(selTeamNumA3T1);
					numOfSelected++;
					isA3T1 = 1;
				}
				if(selTeamNumA3T2S != null) {
					selTeamNumA3T2 = Integer.parseInt(selTeamNumA3T2S);
					a3T2 = theTL.getATeam(selTeamNumA3T2);
					numOfSelected++;
					isA3T2 = 1;
				}
				if(selTeamNumA3T3S != null) {
					selTeamNumA3T3 = Integer.parseInt(selTeamNumA3T3S);
					a3T3 = theTL.getATeam(selTeamNumA3T3);
					numOfSelected++;
					isA3T3 = 1;
				}				
				System.out.println("BoopComAlls2");
				if(numOfSelected == 9) {
					System.out.println("BoopComAlls3");
					addCompare3Alls(a1T1, a1T2, a1T3, a2T1, a2T2, a2T3, a3T1, a3T2, a3T3);
					System.out.println("BoopComAlls4");
					addCompare3PieChart(a1T1, a1T2, a1T3, a2T1, a2T2, a2T3, a3T1, a3T2, a3T3);
				}else if(numOfSelected == 6) {
					addCompare2Alls(a1T1, a1T2, a1T3, a2T1, a2T2, a2T3);
					addCompare2PieChart(a1T1, a1T2, a1T3, a2T1, a2T2, a2T3);
				}
				System.out.println("BoopComAlls5");
				
			}
		} catch (Exception e) {
			Alert addcomA = new Alert(Alert.AlertType.INFORMATION);
			addcomA.setTitle("Error");
			addcomA.setContentText("Error with inputed values: " + e);
			addcomA.showAndWait();
		}
	}
}
