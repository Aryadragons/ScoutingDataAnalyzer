package application;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Data;
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
	private ComboBox<String> statListCB;
	private ComboBox<String> matchListCB;
	private Button statSubB;
	private Button matchSubB;
	private Team selectTeam;
	private BarChart<String,Number> matchBCBarC;
	private LineChart<String,Number> lineChart;
	
	public searchTeamsTab(TeamList mainTeamList, List<Integer> importedListOfTeamNums) {
		this.add(new Label("Select Team to Look Up"), 0, 0);
		teamListCB = new ComboBox<String>();
		listOfTeamNums = importedListOfTeamNums;
		addComboBoxItems();
		this.add(teamListCB, 0, 1);
		seTeamsB = new Button("Submit");
		seTeamsB.setOnAction(this);
		this.add(seTeamsB, 1, 1);
		theTeamList = mainTeamList;
		System.out.println(theTeamList.listOfTeams.get(0).getTeamNum());
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
	
	private void addStatAndMatchCB(int teamNum) {
		//Stat CB
		statListCB = new ComboBox<String>();
		statListCB.getItems().add("Cycles");
		statListCB.getItems().add("Amp");
		statListCB.getItems().add("Specker");
		statListCB.getItems().add("Trap");
		statListCB.getItems().add("Climb");
		statListCB.getItems().add("Amp Skill");
		statListCB.getItems().add("Scource Skill");
		statListCB.getItems().add("Amp Notes");
		this.add(statListCB, 2, 0);
		//Match CB
		matchListCB = new ComboBox<String>();
		MatchList teamML = theTeamList.getATeam(teamNum).getMatchList();
		int teamMLSize = teamML.listOfMatches.size();
		for (int i = 0; i < teamMLSize; i++) {
			int mNum = teamML.listOfMatches.get(i).getMatchNum();
			String mNumS = Integer.toString(mNum);
			matchListCB.getItems().add(mNumS);
		}
		this.add(matchListCB, 4, 0);
		//adding buttons
		statSubB = new Button("Submit");
		statSubB.setOnAction(this);
		this.add(statSubB, 3, 0);
		matchSubB = new Button("Submit");
		matchSubB.setOnAction(this);
		this.add(matchSubB, 5, 0);
	}
	
	private void addCharts(int team, double avgCy, double avgAmp, double avgSpe, double avgTrap, double avgCli, double avgHumAmpPostion, double avgHumScoPostion, double avgHumAmpSkill, double avgHumScoSkill, double avgHumAmpNotes, int timesAmp, int timesSco) {
		System.out.println("Team: " + team + "Cycles: " + avgCy + "Amp: " + avgAmp + "Speaker: " + avgSpe + "Trap: " + avgTrap + "Climb: " + avgCli);
		String[] avgThings = {"Cycles", "Amp", "Speaker", "Trap", "Climb"};
		XYChart.Series<String,Number> avgBarC = new XYChart.Series<String,Number>();
		avgBarC.setName("Avg:");
		CategoryAxis typeXAxisBarC = new CategoryAxis();
	    NumberAxis numScaleAxisBarC = new NumberAxis(0, 20, 4);
	    BarChart<String,Number> avgBCBarC = new BarChart<String,Number>(typeXAxisBarC, numScaleAxisBarC);
	    typeXAxisBarC.setCategories(FXCollections.<String>observableArrayList(Arrays.asList(avgThings)));
	    XYChart.Series<String,Number> cyData = new XYChart.Series<String,Number>();
	    cyData.setName("Cycle Data");
	    cyData.getData().add(new XYChart.Data<String,Number>("Cycles", avgCy));
	    XYChart.Series<String,Number> ampData = new XYChart.Series<String,Number>();
	    ampData.setName("Amp Data");
	    ampData.getData().add(new XYChart.Data<String,Number>("Amp", avgAmp));
	    XYChart.Series<String,Number> speData = new XYChart.Series<String,Number>();
	    speData.setName("Speaker Data");
	    speData.getData().add(new XYChart.Data<String,Number>("Speaker", avgSpe));
	    XYChart.Series<String,Number> trapData = new XYChart.Series<String,Number>();
	    trapData.setName("Trap Data");
	    trapData.getData().add(new XYChart.Data<String,Number>("Trap", avgTrap));
	    XYChart.Series<String,Number> cliData = new XYChart.Series<String,Number>();
	    cliData.setName("Climb Data");
	    cliData.getData().add(new XYChart.Data<String,Number>("Climb", avgCli));
	    avgBCBarC.getData().addAll(cyData, ampData, speData, trapData, cliData);
	    avgBCBarC.setBarGap(5);
	    avgBCBarC.setMinSize(200, 100);
	    this.add(avgBCBarC, 0, 1);
	    
	    //Human Player Data
	    System.out.println(avgHumAmpPostion);
	    System.out.println(avgHumScoPostion);
	    System.out.println(avgHumAmpSkill);
	    System.out.println(avgHumScoSkill);
	    System.out.println(avgHumAmpNotes);
	    System.out.println(timesAmp);
	    System.out.println(timesSco);
	    
	    String[] humThings = {"Percent Amp", "Times Scoure", "Amp Skill", "ScoureSkill", "High Notes",};
	    XYChart.Series<String,Number> humBarC = new XYChart.Series<String,Number>();
		humBarC.setName("Human Player:");
		CategoryAxis typeXAxisHumBarC = new CategoryAxis();
		NumberAxis numScaleAxisHumBarC;
		if (timesAmp > timesSco & timesAmp > 3) {
			numScaleAxisHumBarC = new NumberAxis(0, timesAmp, 2);
		}else if(timesAmp < timesSco & timesSco > 3) {
			numScaleAxisHumBarC = new NumberAxis(0, timesSco, 2);
		} else {
			numScaleAxisHumBarC = new NumberAxis(0, 4, 2);
		}
		BarChart<String,Number> humBCBarC = new BarChart<String,Number>(typeXAxisHumBarC, numScaleAxisHumBarC);
		typeXAxisBarC.setCategories(FXCollections.<String>observableArrayList(Arrays.asList(avgThings)));
		XYChart.Series<String,Number> timesAmpData = new XYChart.Series<String,Number>();
		timesAmpData.setName("Times At Amp");
		timesAmpData.getData().add(new XYChart.Data<String,Number>("Times Amp", timesAmp));
		XYChart.Series<String,Number> timesScoData = new XYChart.Series<String,Number>();
		timesScoData.setName("Times at Scoure");
		timesScoData.getData().add(new XYChart.Data<String,Number>("Times Scoure", timesSco));
		XYChart.Series<String,Number> avgHumAmpSkillData = new XYChart.Series<String,Number>();
		avgHumAmpSkillData.setName("Avg Amp Skill");
		avgHumAmpSkillData.getData().add(new XYChart.Data<String,Number>("Amp Skill", avgHumAmpSkill));
		XYChart.Series<String,Number> avgHumScoSkillData = new XYChart.Series<String,Number>();
		avgHumScoSkillData.setName("Avg Scoure Skill");
		avgHumScoSkillData.getData().add(new XYChart.Data<String,Number>("Sco Skill", avgHumScoSkill));
		XYChart.Series<String,Number> avgHumAmpNotesData = new XYChart.Series<String,Number>();
		avgHumAmpNotesData.setName("Avg High Notes");
		avgHumAmpNotesData.getData().add(new XYChart.Data<String,Number>("Amp Notes", avgHumAmpNotes));
		humBCBarC.getData().addAll(timesAmpData, timesScoData, avgHumAmpSkillData, avgHumScoSkillData, avgHumAmpNotesData);
		humBCBarC.setBarGap(5);
		humBCBarC.setMinSize(200, 100);
		this.add(new Label(), timesAmp, timesSco);
	    this.add(humBCBarC, 0, 2);
		 // add data
	   /* XYChart.Series<String,Number> series1 = new XYChart.Series<String,Number>();
	    series1.setName("Data Series 1");
	    series1.getData().add(new XYChart.Data<String,Number>("2007", 567));
	    XYChart.Series<String,Number> series2 = new XYChart.Series<String,Number>();
	    series2.setName("Data Series 1");
	    series2.getData().add(new XYChart.Data<String,Number>("2009", 547));
	    XYChart.Series<String,Number> series3 = new XYChart.Series<String,Number>();
	    series3.setName("Data Series 1");
	    series3.getData().add(new XYChart.Data<String,Number>("2008", 575));


	    String[] years = {"2007", "2008", "2009"};
	    final CategoryAxis xAxis = new CategoryAxis();
	    final NumberAxis yAxis = new NumberAxis();
	    final BarChart<String,Number> bc = new BarChart<String,Number>(xAxis, yAxis);
	    xAxis.setCategories(FXCollections.<String>observableArrayList(Arrays.asList(years)));
	    bc.getData().addAll(series1, series2, series3);
	    this.add(bc, 2, 0);
	    */
	}
	/*
	 * final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Month");       
        
        final LineChart<String,Number> lineChart = 
                new LineChart<String,Number>(xAxis,yAxis);
                
        lineChart.setTitle("Stock Monitoring, 2010");
                                
        XYChart.Series series = new XYChart.Series();
        series.setName("My portfolio");
        
        series.getData().add(new XYChart.Data("Jan", 23));
        series.getData().add(new XYChart.Data("Feb", 14));
        series.getData().add(new XYChart.Data("Mar", 15));
        series.getData().add(new XYChart.Data("Apr", 24));
        series.getData().add(new XYChart.Data("May", 34));
        series.getData().add(new XYChart.Data("Jun", 36));
        series.getData().add(new XYChart.Data("Jul", 22));
        series.getData().add(new XYChart.Data("Aug", 45));
        series.getData().add(new XYChart.Data("Sep", 43));
        series.getData().add(new XYChart.Data("Oct", 17));
        series.getData().add(new XYChart.Data("Nov", 29));
        series.getData().add(new XYChart.Data("Dec", 25));
        
        
        Scene scene  = new Scene(lineChart,800,600);
        lineChart.getData().add(series);
	 */
	private void addStatChart(String stat) {
		if(stat.compareTo("Cycles") == 0) {
			final CategoryAxis xAxis = new CategoryAxis();
			final NumberAxis yAxis = new NumberAxis();
			yAxis.setLabel("Cycles");
			xAxis.setLabel("Match");
			lineChart = new LineChart<String,Number>(xAxis,yAxis);
			lineChart.setTitle("Cycles over Match");
			XYChart.Series series = new XYChart.Series();
			series.setName("Cycles");
			int size = selectTeam.getMatchList().listOfMatches.size();
			for(int i = 0; i < size; i++) {
				Match tempM = selectTeam.getMatchList().listOfMatches.get(i);
				int mN = tempM.getMatchNum();
				String mNS = Integer.toString(mN);
				int mData = (tempM.getMatchAmp() + tempM.getMatchSpe() + tempM.getMatchTrap());
				series.getData().add(new XYChart.Data(mNS,mData));
			}
			lineChart.getData().add(series);
			this.add(lineChart, 2, 2);
		}
		if(stat.compareTo("Amp") == 0) {
			final CategoryAxis xAxis = new CategoryAxis();
			final NumberAxis yAxis = new NumberAxis();
			yAxis.setLabel("Amps");
			xAxis.setLabel("Match");
			lineChart = new LineChart<String,Number>(xAxis,yAxis);
			lineChart.setTitle("Amps over Match");
			XYChart.Series series = new XYChart.Series();
			series.setName("Amps");
			int size = selectTeam.getMatchList().listOfMatches.size();
			for(int i = 0; i < size; i++) {
				Match tempM = selectTeam.getMatchList().listOfMatches.get(i);
				int mN = tempM.getMatchNum();
				String mNS = Integer.toString(mN);
				int mData = (tempM.getMatchAmp());
				series.getData().add(new XYChart.Data(mNS,mData));
			}
			lineChart.getData().add(series);
			this.add(lineChart, 2, 2);
		}
		if(stat.compareTo("Specker") == 0) {
			final CategoryAxis xAxis = new CategoryAxis();
			final NumberAxis yAxis = new NumberAxis();
			yAxis.setLabel("Speckers");
			xAxis.setLabel("Match");
			lineChart = new LineChart<String,Number>(xAxis,yAxis);
			lineChart.setTitle("Speckers over Match");
			XYChart.Series series = new XYChart.Series();
			series.setName("Speckers");
			int size = selectTeam.getMatchList().listOfMatches.size();
			for(int i = 0; i < size; i++) {
				Match tempM = selectTeam.getMatchList().listOfMatches.get(i);
				int mN = tempM.getMatchNum();
				String mNS = Integer.toString(mN);
				int mData = (tempM.getMatchSpe());
				series.getData().add(new XYChart.Data(mNS,mData));
			}
			lineChart.getData().add(series);
			this.add(lineChart, 2, 2);
		}
		if(stat.compareTo("Trap") == 0) {
			final CategoryAxis xAxis = new CategoryAxis();
			final NumberAxis yAxis = new NumberAxis();
			yAxis.setLabel("Traps");
			xAxis.setLabel("Match");
			lineChart = new LineChart<String,Number>(xAxis,yAxis);
			lineChart.setTitle("Traps over Match");
			XYChart.Series series = new XYChart.Series();
			series.setName("Traps");
			int size = selectTeam.getMatchList().listOfMatches.size();
			for(int i = 0; i < size; i++) {
				Match tempM = selectTeam.getMatchList().listOfMatches.get(i);
				int mN = tempM.getMatchNum();
				String mNS = Integer.toString(mN);
				int mData = (tempM.getMatchTrap());
				series.getData().add(new XYChart.Data(mNS,mData));
			}
			lineChart.getData().add(series);
			this.add(lineChart, 2, 2);
		}
		if(stat.compareTo("Climb") == 0) {
			final CategoryAxis xAxis = new CategoryAxis();
			final NumberAxis yAxis = new NumberAxis();
			yAxis.setLabel("Climbs");
			xAxis.setLabel("Match");
			lineChart = new LineChart<String,Number>(xAxis,yAxis);
			lineChart.setTitle("Climbs over Match");
			XYChart.Series series = new XYChart.Series();
			series.setName("Climbs");
			int size = selectTeam.getMatchList().listOfMatches.size();
			for(int i = 0; i < size; i++) {
				Match tempM = selectTeam.getMatchList().listOfMatches.get(i);
				int mN = tempM.getMatchNum();
				String mNS = Integer.toString(mN);
				int mData = (tempM.getMatchClimb());
				series.getData().add(new XYChart.Data(mNS,mData));
			}
			lineChart.getData().add(series);
			this.add(lineChart, 2, 2);
		}
		if(stat.compareTo("Amp Skill") == 0) {
			final CategoryAxis xAxis = new CategoryAxis();
			final NumberAxis yAxis = new NumberAxis();
			yAxis.setLabel("Amp Skill");
			xAxis.setLabel("Match");
			lineChart = new LineChart<String,Number>(xAxis,yAxis);
			lineChart.setTitle("Amp Skill over Match");
			XYChart.Series series = new XYChart.Series();
			series.setName("Amp Skill");
			int size = selectTeam.getMatchList().listOfMatches.size();
			for(int i = 0; i < size; i++) {
				Match tempM = selectTeam.getMatchList().listOfMatches.get(i);
				int mN = tempM.getMatchNum();
				String mNS = Integer.toString(mN);
				int mData = (tempM.getMatchAmpSkill());
				series.getData().add(new XYChart.Data(mNS,mData));
			}
			lineChart.getData().add(series);
			this.add(lineChart, 2, 2);
		}
		if(stat.compareTo("Scoure Skill") == 0) {
			final CategoryAxis xAxis = new CategoryAxis();
			final NumberAxis yAxis = new NumberAxis();
			yAxis.setLabel("Scoure Skill");
			xAxis.setLabel("Match");
			lineChart = new LineChart<String,Number>(xAxis,yAxis);
			lineChart.setTitle("Scoure Skill over Match");
			XYChart.Series series = new XYChart.Series();
			series.setName("Scoure Skill");
			int size = selectTeam.getMatchList().listOfMatches.size();
			for(int i = 0; i < size; i++) {
				Match tempM = selectTeam.getMatchList().listOfMatches.get(i);
				int mN = tempM.getMatchNum();
				String mNS = Integer.toString(mN);
				int mData = (tempM.getMatchScoSkill());
				series.getData().add(new XYChart.Data(mNS,mData));
			}
			lineChart.getData().add(series);
			this.add(lineChart, 2, 2);
		}
		if(stat.compareTo("Amp Notes") == 0) {
			final CategoryAxis xAxis = new CategoryAxis();
			final NumberAxis yAxis = new NumberAxis();
			yAxis.setLabel("Amp Notes");
			xAxis.setLabel("Match");
			lineChart = new LineChart<String,Number>(xAxis,yAxis);
			lineChart.setTitle("AmpNotes over Match");
			XYChart.Series series = new XYChart.Series();
			series.setName("Amp Notes");
			int size = selectTeam.getMatchList().listOfMatches.size();
			for(int i = 0; i < size; i++) {
				Match tempM = selectTeam.getMatchList().listOfMatches.get(i);
				int mN = tempM.getMatchNum();
				String mNS = Integer.toString(mN);
				int mData = (tempM.getMatchAmpNotes());
				series.getData().add(new XYChart.Data(mNS,mData));
			}
			lineChart.getData().add(series);
			this.add(lineChart, 2, 2);
		}
	}
	
	private void addMatchChart(int matchNum, int teamNum) {
		System.out.println("Boop37.1");
		Match theMatch = null;
		int i = 0;
		int found = 0;
		Team tempT = theTeamList.getATeam(teamNum);
		System.out.println(theTeamList.getATeam(teamNum));
		System.out.println("Boop" + tempT);
		int size = tempT.getMatchList().listOfMatches.size();
		System.out.println("Boop1" + tempT);
		while (found == 0 & i < size) {
			System.out.println("Boop2" + tempT);
			if(tempT.getMatchList().listOfMatches.get(i).getMatchNum() == matchNum) {
				System.out.println("Boop2.5" + tempT);
				found = 1;
				theMatch = tempT.getMatchList().listOfMatches.get(i);
			} else {
				i++;
			}
		}
		System.out.println("Boop3" + theMatch);
		System.out.println("Boop3" + tempT);
		System.out.println("Boop37.2");
		String matchPos = theMatch.getMatchHumPos();
		System.out.println("Boop37.3" + matchPos);
		if(matchPos.compareTo("Amp") == 0) {
			System.out.println("Boop37.4");
			int matchCy = (theMatch.getMatchAmp() + theMatch.getMatchSpe() + theMatch.getMatchTrap());
			int matchAmp = theMatch.getMatchAmp();
			int matchSpe = theMatch.getMatchSpe();
			int matchTrap = theMatch.getMatchTrap();
			int matchCli = theMatch.getMatchClimb();
			int matchASk = theMatch.getMatchAmpSkill();
			int matchAN = theMatch.getMatchAmpNotes();
			System.out.println("Boop37.5");
			String[] matchThings = {"Cycles", "Amp", "Speaker", "Trap", "Climb", "Amp Skill", "Amp Notes"};
			XYChart.Series<String,Number> matchBarC = new XYChart.Series<String,Number>();
			matchBarC.setName("Stat:");
			CategoryAxis typeXAxisBarC = new CategoryAxis();
		    NumberAxis numScaleAxisBarC = new NumberAxis(0, 20, 4);
		    matchBCBarC = new BarChart<String,Number>(typeXAxisBarC, numScaleAxisBarC);
		    typeXAxisBarC.setCategories(FXCollections.<String>observableArrayList(Arrays.asList(matchThings)));
		    XYChart.Series<String,Number> cyData = new XYChart.Series<String,Number>();
		    cyData.setName("Cycle Data");
		    cyData.getData().add(new XYChart.Data<String,Number>("Cycles", matchCy));
		    XYChart.Series<String,Number> ampData = new XYChart.Series<String,Number>();
		    ampData.setName("Amp Data");
		    ampData.getData().add(new XYChart.Data<String,Number>("Amp", matchAmp));
		    XYChart.Series<String,Number> speData = new XYChart.Series<String,Number>();
		    speData.setName("Speaker Data");
		    speData.getData().add(new XYChart.Data<String,Number>("Speaker", matchSpe));
		    XYChart.Series<String,Number> trapData = new XYChart.Series<String,Number>();
		    trapData.setName("Trap Data");
		    trapData.getData().add(new XYChart.Data<String,Number>("Trap", matchTrap));
		    XYChart.Series<String,Number> cliData = new XYChart.Series<String,Number>();
		    cliData.setName("Climb Data");
		    cliData.getData().add(new XYChart.Data<String,Number>("Climb", matchCli));
		    XYChart.Series<String,Number> ampSkData = new XYChart.Series<String,Number>();
		    ampSkData.setName("Amp Skill Data");
		    ampSkData.getData().add(new XYChart.Data<String,Number>("Climb", matchASk));
		    XYChart.Series<String,Number> ampNData = new XYChart.Series<String,Number>();
		    ampNData.setName("Amp Notes Data");
		    ampNData.getData().add(new XYChart.Data<String,Number>("Climb", matchAN));
		    matchBCBarC.getData().addAll(cyData, ampData, speData, trapData, cliData, ampSkData, ampNData);
		    matchBCBarC.setBarGap(5);
		    matchBCBarC.setMinSize(200, 100);
		    this.add(matchBCBarC, 2, 2);
		    System.out.println("Boop37.6");
		}
		if(matchPos.compareTo("Scoure") == 0) {
			int matchCy = (theMatch.getMatchAmp() + theMatch.getMatchSpe() + theMatch.getMatchTrap());
			int matchAmp = theMatch.getMatchAmp();
			int matchSpe = theMatch.getMatchSpe();
			int matchTrap = theMatch.getMatchTrap();
			int matchCli = theMatch.getMatchClimb();
			int matchSSk = theMatch.getMatchScoSkill();
			String[] matchThings = {"Cycles", "Amp", "Speaker", "Trap", "Climb", "Scoure Skill"};
			XYChart.Series<String,Number> matchBarC = new XYChart.Series<String,Number>();
			matchBarC.setName("Stat:");
			CategoryAxis typeXAxisBarC = new CategoryAxis();
		    NumberAxis numScaleAxisBarC = new NumberAxis(0, 20, 4);
		    matchBCBarC = new BarChart<String,Number>(typeXAxisBarC, numScaleAxisBarC);
		    typeXAxisBarC.setCategories(FXCollections.<String>observableArrayList(Arrays.asList(matchThings)));
		    XYChart.Series<String,Number> cyData = new XYChart.Series<String,Number>();
		    cyData.setName("Cycle Data");
		    cyData.getData().add(new XYChart.Data<String,Number>("Cycles", matchCy));
		    XYChart.Series<String,Number> ampData = new XYChart.Series<String,Number>();
		    ampData.setName("Amp Data");
		    ampData.getData().add(new XYChart.Data<String,Number>("Amp", matchAmp));
		    XYChart.Series<String,Number> speData = new XYChart.Series<String,Number>();
		    speData.setName("Speaker Data");
		    speData.getData().add(new XYChart.Data<String,Number>("Speaker", matchSpe));
		    XYChart.Series<String,Number> trapData = new XYChart.Series<String,Number>();
		    trapData.setName("Trap Data");
		    trapData.getData().add(new XYChart.Data<String,Number>("Trap", matchTrap));
		    XYChart.Series<String,Number> cliData = new XYChart.Series<String,Number>();
		    cliData.setName("Climb Data");
		    cliData.getData().add(new XYChart.Data<String,Number>("Climb", matchCli));
		    XYChart.Series<String,Number> scoSkData = new XYChart.Series<String,Number>();
		    scoSkData.setName("Amp Skill Data");
		    scoSkData.getData().add(new XYChart.Data<String,Number>("Climb", matchSSk));
		    matchBCBarC.getData().addAll(cyData, ampData, speData, trapData, cliData, scoSkData);
		    matchBCBarC.setBarGap(5);
		    matchBCBarC.setMinSize(200, 100);
		    this.add(matchBCBarC, 2, 2);
		}
		if(matchPos.compareTo("None") == 0) {
			int matchCy = (theMatch.getMatchAmp() + theMatch.getMatchSpe() + theMatch.getMatchTrap());
			int matchAmp = theMatch.getMatchAmp();
			int matchSpe = theMatch.getMatchSpe();
			int matchTrap = theMatch.getMatchTrap();
			int matchCli = theMatch.getMatchClimb();
			String[] matchThings = {"Cycles", "Amp", "Speaker", "Trap", "Climb"};
			XYChart.Series<String,Number> matchBarC = new XYChart.Series<String,Number>();
			matchBarC.setName("Stat:");
			CategoryAxis typeXAxisBarC = new CategoryAxis();
		    NumberAxis numScaleAxisBarC = new NumberAxis(0, 20, 4);
		    matchBCBarC = new BarChart<String,Number>(typeXAxisBarC, numScaleAxisBarC);
		    typeXAxisBarC.setCategories(FXCollections.<String>observableArrayList(Arrays.asList(matchThings)));
		    XYChart.Series<String,Number> cyData = new XYChart.Series<String,Number>();
		    cyData.setName("Cycle Data");
		    cyData.getData().add(new XYChart.Data<String,Number>("Cycles", matchCy));
		    XYChart.Series<String,Number> ampData = new XYChart.Series<String,Number>();
		    ampData.setName("Amp Data");
		    ampData.getData().add(new XYChart.Data<String,Number>("Amp", matchAmp));
		    XYChart.Series<String,Number> speData = new XYChart.Series<String,Number>();
		    speData.setName("Speaker Data");
		    speData.getData().add(new XYChart.Data<String,Number>("Speaker", matchSpe));
		    XYChart.Series<String,Number> trapData = new XYChart.Series<String,Number>();
		    trapData.setName("Trap Data");
		    trapData.getData().add(new XYChart.Data<String,Number>("Trap", matchTrap));
		    XYChart.Series<String,Number> cliData = new XYChart.Series<String,Number>();
		    cliData.setName("Climb Data");
		    cliData.getData().add(new XYChart.Data<String,Number>("Climb", matchCli));
		    matchBCBarC.getData().addAll(cyData, ampData, speData, trapData, cliData);
		    matchBCBarC.setBarGap(5);
		    matchBCBarC.setMinSize(200, 100);
		    this.add(matchBCBarC, 2, 2);
		}
	}
	
	@Override
	public void handle(ActionEvent event) {
		try {
			if(event.getSource() == seTeamsB) {
				System.out.println("Boop30");
				Team theTeam;
				this.getChildren().clear();
				System.out.println("Boop31");
				String selectedTeamS = teamListCB.getSelectionModel().getSelectedItem();
				System.out.println("Boop31.1");
				int selectedTeam = Integer.parseInt(selectedTeamS);
				System.out.println("Boop31.2");
				theTeam = theTeamList.getATeam(selectedTeam);
				selectTeam = theTeam;
				System.out.println("Boop31.3");
				this.getChildren().clear();
				System.out.println("Boop32");
				String teamNumS = Integer.toString(theTeam.getTeamNum());
				String title = (teamNumS +"'s Stats:");
				this.add(new Label(title), 0, 0);
				this.add(new Label("Comments:  "), 1, 0);
				List<String> commentList = theTeam.getCommentsList();
				commentsTA = new TextArea();
				commentsTA.setMaxSize(100, 100);
				String commentsS = "";
				for(int i = 0; i < commentList.size(); i++) {
					commentsS = commentsS + "\n" +commentList.get(i);
				}
				this.add(commentsTA, 1, 1);
				commentsTA.setText(commentsS);
				System.out.println("Boop33");
				if (theTeam.getTotalMatchesPlayed() == 1) {
					this.add(new Label("Did 1 Match"), 1, 2);
				} else {
					this.add(new Label("Did " + theTeam.getTotalMatchesPlayed() + " Matches"), 1, 2);
				}
				System.out.println("Boop34");
				System.out.println(theTeam.getAvgHumAmpPostion());
			    System.out.println(theTeam.getAvgHumScoPostion());
			    System.out.println(theTeam.getHumAmpSkill());
			    System.out.println(theTeam.getHumScoSkill());
			    System.out.println(theTeam.getHumAmpNotes());
			    System.out.println(theTeam.getTimesHumAmp());
			    System.out.println(theTeam.getTimesHumSco());
				addCharts(theTeam.getTeamNum(), theTeam.getAvgCycles(), theTeam.getAvgAmp(), theTeam.getAvgSpe(), theTeam.getAvgTrap(), theTeam.getAvgClimb(), theTeam.getAvgHumAmpPostion(), theTeam.getAvgHumScoPostion(), theTeam.getHumAmpSkill(), theTeam.getHumScoSkill(), theTeam.getHumAmpNotes(), theTeam.getTimesHumAmp(), theTeam.getTimesHumSco());
				System.out.println("Boop35");
				addStatAndMatchCB(theTeam.getTeamNum());
				System.out.println("Boop36");
				int matchNum = theTeam.getMatchList().listOfMatches.get(0).getMatchNum();
				System.out.println("Boop37");
				addMatchChart(matchNum, theTeam.getTeamNum());
				System.out.println("Boop38");
				addStatChart("Cycle");
				System.out.println("Boop39");
			}
			if(event.getSource() == statSubB) {
				this.getChildren().remove(lineChart);
				String selectedStatS = statListCB.getSelectionModel().getSelectedItem();
				addStatChart(selectedStatS);
			}
			if(event.getSource() == matchSubB) {
				this.getChildren().remove(matchBCBarC);
				String selectedMatchS = matchListCB.getSelectionModel().getSelectedItem();
				int selectedMatch= Integer.parseInt(selectedMatchS);
				addMatchChart(selectedMatch ,selectTeam.getTeamNum());
			}
		} catch(Exception e) {
			System.out.println("Error: " + e);
		}
	}
}
