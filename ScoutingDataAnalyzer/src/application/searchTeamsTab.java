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
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class searchTeamsTab extends GridPane implements EventHandler<ActionEvent>{
	private ComboBox<String> teamListCB;
	private Button seTeamsB;
	private TeamList theTeamList;
	private TeamPitsList theTeamPitList;
	private DriveTeamDataList theDTDList;
	private DriveTeamCommentsList theDTCList;
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
	private BarChart<String,Number> autoBCBarC;
	private LineChart<String,Number> lineChart;
	private Color lightPurC = Color.web("rgb(219,178,255)");
	private Color midPurC = Color.web("rgb(170,0,255)");
	private ComboBox<String> autosListCB;
	private Button submitAutoB;
	
	public searchTeamsTab(TeamList mainTeamList, List<Integer> importedListOfTeamNums, TeamPitsList importedListOfTeamPits, DriveTeamDataList imListOfDTD, DriveTeamCommentsList imListOfDTC) {
		this.add(new Label("Select Team to Look Up"), 0, 0);
		teamListCB = new ComboBox<String>();
		listOfTeamNums = importedListOfTeamNums;
		addComboBoxItems();
		this.add(teamListCB, 0, 1);
		seTeamsB = new Button("Submit");
		seTeamsB.setOnAction(this);
		this.add(seTeamsB, 1, 1);
		theTeamList = mainTeamList;
		theTeamPitList = importedListOfTeamPits;
		if (importedListOfTeamPits == null) {
			System.out.println("Boop!!!!Pits");
		}
		if (imListOfDTD == null) {
			System.out.println("Boop!!!!");
		}
		theDTDList = imListOfDTD;
		theDTCList = imListOfDTC;
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
	    typeXAxisBarC.setTickLabelFill(lightPurC);
	    numScaleAxisBarC.setTickLabelFill(lightPurC);
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
	    avgBCBarC.setMinSize(150, 100);
	    avgBCBarC.setMaxSize(500, 250);
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
		typeXAxisHumBarC.setTickLabelFill(lightPurC);
		numScaleAxisHumBarC.setTickLabelFill(lightPurC);
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
		humBCBarC.setMinSize(150, 100);
		humBCBarC.setMaxSize(500, 250);
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
			System.out.println("Boop got here1");
			final CategoryAxis xAxis = new CategoryAxis();
			final NumberAxis yAxis = new NumberAxis();
			yAxis.setLabel("Cycles");
			xAxis.setLabel("Match");
			xAxis.setTickLabelFill(lightPurC);
			yAxis.setTickLabelFill(lightPurC);
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
			lineChart.setMaxSize(500, 250);
			lineChart.getData().add(series);
			this.add(lineChart, 1, 2);
		}
		if(stat.compareTo("Amp") == 0) {
			final CategoryAxis xAxis = new CategoryAxis();
			final NumberAxis yAxis = new NumberAxis();
			yAxis.setLabel("Amps");
			xAxis.setLabel("Match");
			xAxis.setTickLabelFill(lightPurC);
			yAxis.setTickLabelFill(lightPurC);
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
			lineChart.setMaxSize(500, 250);
			lineChart.getData().add(series);
			this.add(lineChart, 1, 2);
		}
		if(stat.compareTo("Specker") == 0) {
			final CategoryAxis xAxis = new CategoryAxis();
			final NumberAxis yAxis = new NumberAxis();
			yAxis.setLabel("Speckers");
			xAxis.setLabel("Match");
			xAxis.setTickLabelFill(lightPurC);
			yAxis.setTickLabelFill(lightPurC);
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
			lineChart.setMaxSize(500, 250);
			lineChart.getData().add(series);
			this.add(lineChart, 1, 2);
		}
		if(stat.compareTo("Trap") == 0) {
			final CategoryAxis xAxis = new CategoryAxis();
			final NumberAxis yAxis = new NumberAxis();
			yAxis.setLabel("Traps");
			xAxis.setLabel("Match");
			xAxis.setTickLabelFill(lightPurC);
			yAxis.setTickLabelFill(lightPurC);
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
			lineChart.setMaxSize(500, 250);
			lineChart.getData().add(series);
			this.add(lineChart, 1, 2);
		}
		if(stat.compareTo("Climb") == 0) {
			final CategoryAxis xAxis = new CategoryAxis();
			final NumberAxis yAxis = new NumberAxis();
			yAxis.setLabel("Climbs");
			xAxis.setLabel("Match");
			xAxis.setTickLabelFill(lightPurC);
			yAxis.setTickLabelFill(lightPurC);
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
			lineChart.setMaxSize(500, 250);
			lineChart.getData().add(series);
			this.add(lineChart, 1, 2);
		}
		if(stat.compareTo("Amp Skill") == 0) {
			final CategoryAxis xAxis = new CategoryAxis();
			final NumberAxis yAxis = new NumberAxis();
			yAxis.setLabel("Amp Skill");
			xAxis.setLabel("Match");
			xAxis.setTickLabelFill(lightPurC);
			yAxis.setTickLabelFill(lightPurC);
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
			lineChart.setMaxSize(500, 250);
			lineChart.getData().add(series);
			this.add(lineChart, 1, 2);
		}
		if(stat.compareTo("Scoure Skill") == 0) {
			final CategoryAxis xAxis = new CategoryAxis();
			final NumberAxis yAxis = new NumberAxis();
			yAxis.setLabel("Scoure Skill");
			xAxis.setLabel("Match");
			xAxis.setTickLabelFill(lightPurC);
			yAxis.setTickLabelFill(lightPurC);
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
			lineChart.setMaxSize(500, 250);
			lineChart.getData().add(series);
			this.add(lineChart, 1, 2);
		}
		if(stat.compareTo("Amp Notes") == 0) {
			final CategoryAxis xAxis = new CategoryAxis();
			final NumberAxis yAxis = new NumberAxis();
			yAxis.setLabel("Amp Notes");
			xAxis.setLabel("Match");
			xAxis.setTickLabelFill(lightPurC);
			yAxis.setTickLabelFill(lightPurC);
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
			lineChart.setMaxSize(500, 250);
			lineChart.getData().add(series);
			this.add(lineChart, 1, 2);
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
			int matchAutoSpe = theMatch.getTheAA().getAutoSpecker();
			int matchAutoAmp = theMatch.getTheAA().getAutoSpecker();
			System.out.println("Boop37.5");
			String[] matchThings = {"Cycles", "Amp", "Speaker", "Trap", "Climb", "Amp Skill", "Amp Notes", "Auto Speaker", "Auto Amp"};
			XYChart.Series<String,Number> matchBarC = new XYChart.Series<String,Number>();
			matchBarC.setName("Stat:");
			CategoryAxis typeXAxisBarC = new CategoryAxis();
		    NumberAxis numScaleAxisBarC = new NumberAxis(0, 20, 4);
		    matchBCBarC = new BarChart<String,Number>(typeXAxisBarC, numScaleAxisBarC);
		    typeXAxisBarC.setCategories(FXCollections.<String>observableArrayList(Arrays.asList(matchThings)));
		    typeXAxisBarC.setTickLabelFill(lightPurC);
		    numScaleAxisBarC.setTickLabelFill(lightPurC);
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
		    ampSkData.getData().add(new XYChart.Data<String,Number>("Amp Skill", matchASk));
		    XYChart.Series<String,Number> ampNData = new XYChart.Series<String,Number>();
		    ampNData.setName("Amp Notes Data");
		    ampNData.getData().add(new XYChart.Data<String,Number>("Amp Notes", matchAN));
		    XYChart.Series<String,Number> autoSpeData = new XYChart.Series<String,Number>();
		    autoSpeData.setName("Auto Speaker Data");
		    autoSpeData.getData().add(new XYChart.Data<String,Number>("Auto Speaker", matchAutoSpe));
		    XYChart.Series<String,Number> autoAmpData = new XYChart.Series<String,Number>();
		    autoAmpData.setName("Auto Amp Data");
		    autoAmpData.getData().add(new XYChart.Data<String,Number>("Auto Amp", matchAutoAmp));
		    matchBCBarC.getData().addAll(cyData, ampData, speData, trapData, cliData, ampSkData, ampNData, autoSpeData, autoAmpData);
		    matchBCBarC.setBarGap(2);
		    matchBCBarC.setMinSize(150, 100);
		    matchBCBarC.setMaxSize(500, 250);
		    this.add(matchBCBarC, 1, 1);
		    System.out.println("Boop37.6");
		}
		if(matchPos.compareTo("Scoure") == 0) {
			int matchCy = (theMatch.getMatchAmp() + theMatch.getMatchSpe() + theMatch.getMatchTrap());
			int matchAmp = theMatch.getMatchAmp();
			int matchSpe = theMatch.getMatchSpe();
			int matchTrap = theMatch.getMatchTrap();
			int matchCli = theMatch.getMatchClimb();
			int matchSSk = theMatch.getMatchScoSkill();
			int matchAutoSpe = theMatch.getTheAA().getAutoSpecker();
			int matchAutoAmp = theMatch.getTheAA().getAutoSpecker();
			String[] matchThings = {"Cycles", "Amp", "Speaker", "Trap", "Climb", "Scoure Skill", "Auto Speaker", "Auto Amp"};
			XYChart.Series<String,Number> matchBarC = new XYChart.Series<String,Number>();
			matchBarC.setName("Stat:");
			CategoryAxis typeXAxisBarC = new CategoryAxis();
		    NumberAxis numScaleAxisBarC = new NumberAxis(0, 20, 4);
		    matchBCBarC = new BarChart<String,Number>(typeXAxisBarC, numScaleAxisBarC);
		    typeXAxisBarC.setCategories(FXCollections.<String>observableArrayList(Arrays.asList(matchThings)));
		    typeXAxisBarC.setTickLabelFill(lightPurC);
		    numScaleAxisBarC.setTickLabelFill(lightPurC);
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
		    scoSkData.getData().add(new XYChart.Data<String,Number>("Scoure Skill", matchSSk));
		    XYChart.Series<String,Number> autoSpeData = new XYChart.Series<String,Number>();
		    autoSpeData.setName("Auto Speaker Data");
		    autoSpeData.getData().add(new XYChart.Data<String,Number>("Auto Speaker", matchAutoSpe));
		    XYChart.Series<String,Number> autoAmpData = new XYChart.Series<String,Number>();
		    autoAmpData.setName("Auto Amp Data");
		    autoAmpData.getData().add(new XYChart.Data<String,Number>("Auto Amp", matchAutoAmp));
		    matchBCBarC.getData().addAll(cyData, ampData, speData, trapData, cliData, scoSkData, autoSpeData, autoAmpData);
		    matchBCBarC.setBarGap(2);
		    matchBCBarC.setMinSize(150, 100);
		    matchBCBarC.setMaxSize(500, 250);
		    this.add(matchBCBarC, 1, 1);
		}
		if(matchPos.compareTo("None") == 0) {
			int matchCy = (theMatch.getMatchAmp() + theMatch.getMatchSpe() + theMatch.getMatchTrap());
			int matchAmp = theMatch.getMatchAmp();
			int matchSpe = theMatch.getMatchSpe();
			int matchTrap = theMatch.getMatchTrap();
			int matchCli = theMatch.getMatchClimb();
			int matchAutoSpe = theMatch.getTheAA().getAutoSpecker();
			int matchAutoAmp = theMatch.getTheAA().getAutoSpecker();
			String[] matchThings = {"Cycles", "Amp", "Speaker", "Trap", "Climb", "Auto Speaker", "Auto Amp"};
			XYChart.Series<String,Number> matchBarC = new XYChart.Series<String,Number>();
			matchBarC.setName("Stat:");
			CategoryAxis typeXAxisBarC = new CategoryAxis();
		    NumberAxis numScaleAxisBarC = new NumberAxis(0, 20, 4);
		    matchBCBarC = new BarChart<String,Number>(typeXAxisBarC, numScaleAxisBarC);
		    typeXAxisBarC.setCategories(FXCollections.<String>observableArrayList(Arrays.asList(matchThings)));
		    typeXAxisBarC.setTickLabelFill(lightPurC);
		    numScaleAxisBarC.setTickLabelFill(lightPurC);
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
		    XYChart.Series<String,Number> autoSpeData = new XYChart.Series<String,Number>();
		    autoSpeData.setName("Auto Speaker Data");
		    autoSpeData.getData().add(new XYChart.Data<String,Number>("Auto Speaker", matchAutoSpe));
		    XYChart.Series<String,Number> autoAmpData = new XYChart.Series<String,Number>();
		    autoAmpData.setName("Auto Amp Data");
		    autoAmpData.getData().add(new XYChart.Data<String,Number>("Auto Amp", matchAutoAmp));
		    matchBCBarC.getData().addAll(cyData, ampData, speData, trapData, cliData, autoSpeData, autoAmpData);
		    matchBCBarC.setBarGap(2);
		    matchBCBarC.setMinSize(150, 100);
		    matchBCBarC.setMaxSize(500, 250);
		    this.add(matchBCBarC, 1, 1);
		}
	}
	
	public void addPitDataStuff(int teamNum) {
		this.add(new Label("Number Of Student on Team " + teamNum + ": "), 0, 5);
		this.add(new Label("Number Of Mentors on Team " + teamNum + ": "), 0, 6);
		this.add(new Label("Number Of Battiers they have: "), 0, 7);
		this.add(new Label("What Programing langue they use: "), 2, 5);
		if(theTeamPitList.getATeamPit(teamNum).getDoHaveVis().compareTo("yes") == 0) {
			this.add(new Label("They do use Vision"), 2, 6);
			this.add(new Label("Number of Vision Cameras: "), 2, 7);
		} else {
			this.add(new Label("They do not use Vision"), 2, 6);
		}
		this.add(new Label("Number of Driver Cameras: "), 2, 8);
		this.add(new Label("Their Robot's Drive Train is: "), 0, 8);
		this.add(new Label("Their Robot's Drive Train uses This Motors: "), 0, 9);
		if(theTeamPitList.getATeamPit(teamNum).getDrTrType().compareTo("Swerve") == 0) {
			this.add(new Label("Their Robot uses this kind of Swerve: "), 0, 10);
			if(theTeamPitList.getATeamPit(teamNum).getSwevType().compareTo("Custom") == 0) {
			} else {
				this.add(new Label("Their Robot Uses this Gearing: "), 0, 11);
			}
		}
		//adding labels with the Values
		//students
		String studs = Integer.toString(theTeamPitList.getATeamPit(teamNum).getNumOfStud());
		Label studsL = new Label("                                           " + studs);
		studsL.setId("studslabel");
		this.add(studsL, 0, 5);
		//mentors
		String ments = Integer.toString(theTeamPitList.getATeamPit(teamNum).getNumOfMent());
		Label mentsL = new Label("                                           " + ments);
		mentsL.setId("studslabel");
		this.add(mentsL, 0, 6);
		//Robot Battiers
		String rBs = Integer.toString(theTeamPitList.getATeamPit(teamNum).getNumOfRobotBat());
		Label rBsL = new Label("                                     " + rBs);
		rBsL.setId("studslabel");
		this.add(rBsL, 0, 7);
		//Program Lan
		String progLans = theTeamPitList.getATeamPit(teamNum).getProgramLan();
		Label progLansL = new Label("                                           " + progLans);
		progLansL.setId("studslabel");
		this.add(progLansL, 2, 5);
		//VisCamera
		if(theTeamPitList.getATeamPit(teamNum).getDoHaveVis().compareTo("yes") == 0) {
			String visCams = Integer.toString(theTeamPitList.getATeamPit(teamNum).getNumOfVisCam());
			Label visCamsL = new Label("                                  " + visCams);
			visCamsL.setId("studslabel");
			this.add(visCamsL, 2, 7);
		}
		//Drive Cameras
		String drCams = Integer.toString(theTeamPitList.getATeamPit(teamNum).getNumOfDriverCams());
		Label drCamsL = new Label("                                  " + drCams);
		drCamsL.setId("studslabel");
		this.add(drCamsL, 2, 8);
		//Drive Train Type
		String drTypes = theTeamPitList.getATeamPit(teamNum).getDrTrType();
		Label drTypesL = new Label("                                  " + drTypes);
		drTypesL.setId("studslabel");
		this.add(drTypesL, 0, 8);
		//Swerve Kind
		if(theTeamPitList.getATeamPit(teamNum).getDrTrType().compareTo("Swerve") == 0) {
			String swTypes = theTeamPitList.getATeamPit(teamNum).getSwevType();
			Label swTypesL = new Label("                                             " + swTypes);
			swTypesL.setId("studslabel");
			this.add(swTypesL, 0, 10);
		//Swerve Gearing
			if(theTeamPitList.getATeamPit(teamNum).getSwevType().compareTo("Custom") == 0) {
			} else {
				String swGears = theTeamPitList.getATeamPit(teamNum).getSwevGearing();
				Label swGearsL = new Label("                                     " + swGears);
				swGearsL.setId("studslabel");
				this.add(swGearsL, 0, 11);
			}
		}
		//Drive Train Motors
		String drMots = theTeamPitList.getATeamPit(teamNum).getDrTrMotorType();
		Label drMotsL = new Label("                                                    " + drMots);
		drMotsL.setId("studslabel");
		this.add(drMotsL, 0, 9);
		
		this.add(new Label(""), 0, 12);
		this.add(new Label(""), 0, 13);
		this.add(new Label(""), 0, 14);
		
		//autos
		Label autoTitle = new Label("Autos:");
		autoTitle.setId("TitleLabel");
		this.add(autoTitle, 2, 5);
	}
	
	public void addPieCharts(Team theTeam) {
		System.out.println("Boop40" + theTeam.getTotalAmp() + theTeam.getTotalSpe() + theTeam.getTotalTrap());
		int ampValue = ((theTeam.getTotalAmp() * 100)/theTeam.getTotalCycles());
		System.out.println("Boop41" + ampValue);
		int speValue = ((theTeam.getTotalSpe() * 100)/theTeam.getTotalCycles());
		System.out.println("Boop42" + speValue);
		int trapValue = ((theTeam.getTotalTrap() * 100)/theTeam.getTotalCycles());
		System.out.println("Boop43" + trapValue);
		if ((ampValue + speValue + trapValue)!= 100) {
			int missingValue = (100- (ampValue + speValue + trapValue));
			speValue = (speValue + missingValue);
			System.out.println("Boop43.5");
		}
		System.out.println("Boop44 A:" + ampValue + "S:" + speValue + "T:" + trapValue);
		ObservableList<PieChart.Data> pieChartData =FXCollections.observableArrayList(new PieChart.Data("Amp", ampValue), new PieChart.Data("Specker", speValue), new PieChart.Data("Trap", trapValue));
		PieChart cyclePieC = new PieChart(pieChartData);
		cyclePieC.setMinSize(500, 500);
		cyclePieC.setLabelsVisible(true);
		this.add(cyclePieC, 0, 4);
		//adding human player pie chart
		int ampHumValue = ((theTeam.getTimesHumAmp() * 100)/theTeam.getTotalMatchesPlayed());
		int scoHumValue = ((theTeam.getTimesHumSco() * 100)/theTeam.getTotalMatchesPlayed());
		ObservableList<PieChart.Data> humPieChartData =FXCollections.observableArrayList(new PieChart.Data("Amp", ampHumValue), new PieChart.Data("Scoure", scoHumValue));
		PieChart humPieC = new PieChart(humPieChartData);
		humPieC.setMinSize(500, 500);
		humPieC.setLabelsVisible(true);
		this.add(humPieC, 2, 4);
	}
	
	public void addDTDStuff(int teamNum) {
		if(theDTDList.getATeamPit(teamNum).getIsAdult() == true) {
			Label adultWarningL = new Label("                                                             " + "Adult Drive Coach");
			adultWarningL.setId("ADC");
			this.add(adultWarningL, 0, 0);
		}
		//driver stuff
		Label driverInfoL = new Label("Driver Info:");
		this.add(driverInfoL, 0, 12);
		driverInfoL.setId("TitleLabel");
		this.add(new Label("Same Driver Throughout the Tourment?"), 0, 13);
		this.add(new Label("Same Driver as Last Tourment?"), 0, 14);
		this.add(new Label("Same Driver as Last Year?"), 0, 15);
		this.add(new Label("Hours Practicing With This Bot:"), 0, 16);
		this.add(new Label("Hours Practicing With The Same Drive Train:"), 0, 17);
		this.add(new Label("Hours Practicing With Any Bot:"), 0, 18);
		//add stats
		String saDrTour;
		if(theDTDList.getATeamPit(teamNum).getSaDrThisTour() == true) {
			saDrTour = "Yes";
		} else {
			saDrTour = "No";
		}
		Label saDrTourL = new Label("                                                " + saDrTour);
		saDrTourL.setId("studslabel");
		this.add(saDrTourL, 0, 13);
		String saDrPast;
		if(theDTDList.getATeamPit(teamNum).getSaDrPastTour() == true) {
			saDrPast = "Yes";
		} else {
			saDrPast = "No";
		}
		Label saDrPastL = new Label("                                     " + saDrPast);
		saDrPastL.setId("studslabel");
		this.add(saDrPastL, 0, 14);
		String saDrLast;
		if(theDTDList.getATeamPit(teamNum).getSaDrLastYear() == true) {
			saDrLast = "Yes";
		} else {
			saDrLast = "No";
		}
		Label saDrLastL = new Label("                                " + saDrLast);
		saDrLastL.setId("studslabel");
		this.add(saDrLastL, 0, 15);
		String saDrThis = Integer.toString(theDTDList.getATeamPit(teamNum).getDrHourThisBot());
		Label saDrThisL = new Label("                                      " + saDrThis);
		saDrThisL.setId("studslabel");
		this.add(saDrThisL, 0, 16);
		String saDrSame = Integer.toString(theDTDList.getATeamPit(teamNum).getDrHourSameDrTr());
		Label saDrSameL = new Label("                                                     " + saDrSame);
		saDrSameL.setId("studslabel");
		this.add(saDrSameL, 0, 17);
		String saDrAny = Integer.toString(theDTDList.getATeamPit(teamNum).getDrHourAnyBot());
		Label saDrAnyL = new Label("                                      " + saDrAny);
		saDrAnyL.setId("studslabel");
		this.add(saDrAnyL, 0, 18);
		//operator stuff
		Label opInfoL = new Label("Operator Info:");
		opInfoL.setId("TitleLabel");
		this.add(opInfoL, 2, 12);
		this.add(new Label("Same Operator Throughout the Tourment?"), 2, 13);
		this.add(new Label("Same Operator as Last Tourment?"), 2, 14);
		this.add(new Label("Same Operator as Last Year?"), 2, 15);
		this.add(new Label("Hours Practicing With This Bot:"), 2, 16);
		this.add(new Label("Hours Practicing With Any Bot"), 2, 17);
		//add stats
		String opInfoType = theDTDList.getATeamPit(teamNum).getOpRole();
		Label opInfoTypeL = new Label("                        " + opInfoType);
		opInfoTypeL.setId("TitleLabel");
		this.add(opInfoTypeL, 2, 12);
		String saOpTour;
		if(theDTDList.getATeamPit(teamNum).getSaOpThisTour() == true){
			saOpTour = "Yes";
		} else {
			saOpTour = "No";
		}
		Label saOpTourL = new Label("                                                    " + saOpTour);
		saOpTourL.setId("studslabel");
		this.add(saOpTourL, 2, 13);
		String saOpPast;
		if(theDTDList.getATeamPit(teamNum).getSaOpPastTour() == true) {
			saOpPast = "Yes";
		} else {
			saOpPast = "No";
		}
		Label saOpPastL = new Label("                                         " + saOpPast);
		saOpPastL.setId("studslabel");
		this.add(saOpPastL, 2, 14);
		String saOpLast;
		if(theDTDList.getATeamPit(teamNum).getSaOpLastYear() == true) {
			saOpLast = "Yes";
		} else {
			saOpLast = "No";
		}
		Label saOpLastL = new Label("                                   " + saOpLast);
		saOpLastL.setId("studslabel");
		this.add(saOpLastL, 2, 15);
		String saOpThis = Integer.toString(theDTDList.getATeamPit(teamNum).getOpHourThisBot());
		Label saOpThisL = new Label("                                     " + saOpThis);
		saOpThisL.setId("studslabel");
		this.add(saOpThisL, 2, 16);
		String saOpAny = Integer.toString(theDTDList.getATeamPit(teamNum).getOpHourAnyBot());
		Label saOpAnyL = new Label("                                     " + saOpAny);
		saOpAnyL.setId("studslabel");
		this.add(saOpAnyL, 2, 17);
		//drive coach stuff
		Label drCoInfoL = new Label("Drive Coach Info:");
		this.add(drCoInfoL, 2, 18);
		drCoInfoL.setId("TitleLabel");
		this.add(new Label("Is Drive Coach an Adult?"), 2, 19);
		this.add(new Label("How Long Have Thye Drive Coached:"), 2, 20);
		//add stats
		String adultDC;
		if(theDTDList.getATeamPit(teamNum).getIsAdult() == true) {
			adultDC = "Yes";
		} else {
			adultDC = "No";
		}
		Label adultDCL = new Label("                              " + adultDC);
		adultDCL.setId("studslabel");
		this.add(adultDCL, 2, 19);
		String timeDC = theDTDList.getATeamPit(teamNum).getTimeDriveCoach();
		Label timeDCL = new Label("                                             " + timeDC);
		timeDCL.setId("studslabel");
		this.add(timeDCL, 2, 20);
		//Human Player stuff
		Label humInfoL = new Label("Human Player Info:");
		this.add(humInfoL, 0, 19);
		humInfoL.setId("TitleLabel");
		this.add(new Label("Hours Human Player Practiced"), 0, 20);
		//add stats
		String humPrac = Integer.toString(theDTDList.getATeamPit(teamNum).getHumHoursPracitce());
		Label humPracL = new Label("                                    " + humPrac);
		humPracL.setId("studslabel");
		this.add(humPracL, 0, 20);
	}
	
	public void addDTCStuff(int teamNum){
		if(theDTCList.getADriveTeamComments(teamNum).gettotalBLevel() >= 2) {
			Label warning1 = new Label("                         Warning Level 1");
			warning1.setId("warn1");
			this.add(warning1, 2, 0);
		}
		if(theDTCList.getADriveTeamComments(teamNum).gettotalBLevel() >= 5) {
			Label warning2 = new Label("                         Warning Level 2");
			warning2.setId("warn2");
			this.add(warning2, 2, 0);
		}
		if(theDTCList.getADriveTeamComments(teamNum).gettotalBLevel() >= 10) {
			Label warning3 = new Label("                         Warning Level 3");
			warning3.setId("warn3");
			this.add(warning3, 2, 0);
		}
		if(theDTCList.getADriveTeamComments(teamNum).getStrategyLevel() >= 2) {
			Label strat = new Label("                                                    Good at Strategy");
			strat.setId("strat");
			this.add(strat, 2, 0);
		}
		Label dtcC = new Label("Comments From Drive Team:");
		dtcC.setId("TitleLabel");
		this.add(dtcC, 0, 21);
		int stuff = 22;
		int numOfB = 0;
		if(theDTCList.getADriveTeamComments(teamNum).getYellLevel() != 0) {
			stuff++;
			numOfB++;
			this.add(new Label("Yell Level: " + theDTCList.getADriveTeamComments(teamNum).getYellLevel()), 0, stuff);
		}
		if(theDTCList.getADriveTeamComments(teamNum).getControlLevel() != 0) {
			stuff++;
			numOfB++;
			this.add(new Label("Control Level: " + theDTCList.getADriveTeamComments(teamNum).getControlLevel()), 0, stuff);
		}
		if(theDTCList.getADriveTeamComments(teamNum).getPhysicalLevel() != 0) {
			stuff++;
			numOfB++;
			this.add(new Label("Physical Level: " + theDTCList.getADriveTeamComments(teamNum).getPhysicalLevel()), 0, stuff);
		}
		if(theDTCList.getADriveTeamComments(teamNum).getDiscrimLevel() != 0) {
			stuff++;
			numOfB++;
			this.add(new Label("Discrimination Level: " + theDTCList.getADriveTeamComments(teamNum).getDiscrimLevel()), 0, stuff);
		}
		if(theDTCList.getADriveTeamComments(teamNum).getDisCrimType() != null) {
			stuff++;
			numOfB++;
			this.add(new Label("Type/s of Discrimination: " + theDTCList.getADriveTeamComments(teamNum).getDisCrimType()), 0, stuff);
		}
		if(theDTCList.getADriveTeamComments(teamNum).getOtherBLevel() != 0) {
			stuff++;
			numOfB++;
			this.add(new Label("Other Bad Stuff Level: " + theDTCList.getADriveTeamComments(teamNum).getOtherBLevel()), 0, stuff);
		}
		if(theDTCList.getADriveTeamComments(teamNum).getFunLevel() != 0) {
			stuff++;
			this.add(new Label("Fun Level: " + theDTCList.getADriveTeamComments(teamNum).getFunLevel()), 2, (stuff - numOfB));
		}
		if(theDTCList.getADriveTeamComments(teamNum).getStrategyLevel() != 0) {
			stuff++;
			this.add(new Label("Strategy Level: " + theDTCList.getADriveTeamComments(teamNum).getStrategyLevel()), 2, (stuff - numOfB));
		}
		if(theDTCList.getADriveTeamComments(teamNum).getOtherGLevel() != 0) {
			stuff++;
			this.add(new Label("Ohter Good Stuff Level: " + theDTCList.getADriveTeamComments(teamNum).getOtherGLevel()), 2, (stuff - numOfB));
		}
		if(theDTCList.getADriveTeamComments(teamNum).getComments() != null) {
			stuff++;
			this.add(new Label("Comments: "), 0, stuff);
			stuff++;
			this.add(new Label(theDTCList.getADriveTeamComments(teamNum).getComments()), 0, stuff);
		}
	}
	
	public void addAutoStuff(int teamNum, int autoNumber) {
		if(theTeamList.getATeam(teamNum).getAutoList().listOfAutos.get(0) != null) {
			autosListCB = new ComboBox();
			for(int i = 0; i < theTeamList.getATeam(teamNum).getAutoList().listOfAutos.size(); i++) {
				double totalPieces = theTeamList.getATeam(teamNum).getAutoList().listOfAutos.get(i).getTotalAmp() + theTeamList.getATeam(teamNum).getAutoList().listOfAutos.get(i).getTotalSpecker();
				if(theTeamList.getATeam(teamNum).getAutoList().listOfAutos.get(i).getTotalControl() > totalPieces) {
					totalPieces = totalPieces + 0.5;
				}
				String startPosName = "";
				if (theTeamList.getATeam(teamNum).getAutoList().listOfAutos.get(i).getAutoStartPos() == 0) {
					startPosName = "Far Side";
				}
				if (theTeamList.getATeam(teamNum).getAutoList().listOfAutos.get(i).getAutoStartPos() == 1) {
					startPosName = "Far Side Speaker";
				}
				if (theTeamList.getATeam(teamNum).getAutoList().listOfAutos.get(i).getAutoStartPos() == 2) {
					startPosName = "Center Speaker";
				}
				if (theTeamList.getATeam(teamNum).getAutoList().listOfAutos.get(i).getAutoStartPos() == 3) {
					startPosName = "Amp Side Speaker";
				}
				if (theTeamList.getATeam(teamNum).getAutoList().listOfAutos.get(i).getAutoStartPos() == 4) {
					startPosName = "Amp Side";
				}
				String autoName = i + totalPieces + " Piece, " + startPosName;
				autosListCB.getItems().add(autoName);
			}
			submitAutoB = new Button("Submit Auto");
			Auto A = theTeamList.getATeam(teamNum).getAutoList().listOfAutos.get(autoNumber);
			if(A.getTimesUsed() == 0) {
				this.add(new Label("They Havn't Used This Auto"), 2, 1);
			}else{
				double speAvg = A.getAvgSpe();
				double ampAvg = A.getAvgSpe();
				double controlAvg = A.getAvgControl();
				String[] autoThings = {"Avg Speaker", "Avg Amp", "Avg Controled"};
				XYChart.Series<String,Number> autoBarC = new XYChart.Series<String,Number>();
				autoBarC.setName("Stat:");
				CategoryAxis typeXAxisBarC = new CategoryAxis();
			    NumberAxis numScaleAxisBarC = new NumberAxis(0, 8, 1);
			    autoBCBarC = new BarChart<String,Number>(typeXAxisBarC, numScaleAxisBarC);
			    typeXAxisBarC.setCategories(FXCollections.<String>observableArrayList(Arrays.asList(autoThings)));
			    typeXAxisBarC.setTickLabelFill(lightPurC);
			    numScaleAxisBarC.setTickLabelFill(lightPurC);
			    XYChart.Series<String,Number> speData = new XYChart.Series<String,Number>();
			    speData.setName("Avg Speaker");
			    speData.getData().add(new XYChart.Data<String,Number>("Avg Speaker", speAvg));
			    XYChart.Series<String,Number> ampData = new XYChart.Series<String,Number>();
			    ampData.setName("Avg Amp");
			    ampData.getData().add(new XYChart.Data<String,Number>("Avg Amp", ampAvg));
			    XYChart.Series<String,Number> cnData = new XYChart.Series<String,Number>();
			    cnData.setName("Avg Controled");
			    cnData.getData().add(new XYChart.Data<String,Number>("Avg Controled", controlAvg));
			    autoBCBarC.getData().addAll(ampData, speData, cnData);
			    autoBCBarC.setBarGap(2);
			    autoBCBarC.setMinSize(150, 100);
			    autoBCBarC.setMaxSize(500, 250);
			    this.add(autoBCBarC, 2, 1);
			    this.add(new Label("This Auto Has Been Used " + A.getTimesUsed() + " Times"), 2, 2);
			}
			// pie chart
		    int numOfAutosUsed = 0;
		    AutoList usedAutos = new AutoList();
		    for (int i = 0; i < theTeamList.getATeam(teamNum).getAutoList().listOfAutos.size(); i++) {
		    	if(theTeamList.getATeam(teamNum).getAutoList().listOfAutos.get(i).getTimesUsed() != 0) {
		    		usedAutos.listOfAutos.add(theTeamList.getATeam(teamNum).getAutoList().listOfAutos.get(i));
		    		numOfAutosUsed = numOfAutosUsed + theTeamList.getATeam(teamNum).getAutoList().listOfAutos.get(i).getTimesUsed();
		    	}
		    }
		    List<PieChart.Data> autoPCData;
		    ObservableList<PieChart.Data> autoPieChartData = null;
		    int totalPercent = 0;
		    int matches = theTeamList.getATeam(teamNum).getTotalMatchesPlayed();
		    String startPosName = "";
		    for(int i = 0; i < usedAutos.listOfAutos.size(); i++) {
		    	if( i == (usedAutos.listOfAutos.size() - 1)) {
		    		int usePercent = (usedAutos.listOfAutos.get(i).getTimesUsed() / matches) * 100;
		    		totalPercent = totalPercent + (usedAutos.listOfAutos.get(i).getTimesUsed() / matches) * 100;
		    		int add = 100 - totalPercent;
		    		usePercent = usePercent + add;
		    		if (theTeamList.getATeam(teamNum).getAutoList().listOfAutos.get(i).getAutoStartPos() == 0) {
						startPosName = "Far Side";
					}
					if (theTeamList.getATeam(teamNum).getAutoList().listOfAutos.get(i).getAutoStartPos() == 1) {
						startPosName = "Far Side Speaker";
					}
					if (theTeamList.getATeam(teamNum).getAutoList().listOfAutos.get(i).getAutoStartPos() == 2) {
						startPosName = "Center Speaker";
					}
					if (theTeamList.getATeam(teamNum).getAutoList().listOfAutos.get(i).getAutoStartPos() == 3) {
						startPosName = "Amp Side Speaker";
					}
					if (theTeamList.getATeam(teamNum).getAutoList().listOfAutos.get(i).getAutoStartPos() == 4) {
						startPosName = "Amp Side";
					}
		    		PieChart.Data temp = new PieChart.Data(startPosName, usePercent);
		    		autoPieChartData.add(temp);
		    	} else {
		    		int usePercent = (usedAutos.listOfAutos.get(i).getTimesUsed() / matches) * 100;
		    		totalPercent = totalPercent + (usedAutos.listOfAutos.get(i).getTimesUsed() / matches) * 100;
					if (theTeamList.getATeam(teamNum).getAutoList().listOfAutos.get(i).getAutoStartPos() == 0) {
						startPosName = "Far Side";
					}
					if (theTeamList.getATeam(teamNum).getAutoList().listOfAutos.get(i).getAutoStartPos() == 1) {
						startPosName = "Far Side Speaker";
					}
					if (theTeamList.getATeam(teamNum).getAutoList().listOfAutos.get(i).getAutoStartPos() == 2) {
						startPosName = "Center Speaker";
					}
					if (theTeamList.getATeam(teamNum).getAutoList().listOfAutos.get(i).getAutoStartPos() == 3) {
						startPosName = "Amp Side Speaker";
					}
					if (theTeamList.getATeam(teamNum).getAutoList().listOfAutos.get(i).getAutoStartPos() == 4) {
						startPosName = "Amp Side";
					}
		    		PieChart.Data temp = new PieChart.Data(startPosName, usePercent);
		    		autoPieChartData.add(temp);
		    	}
		    	
		    }
		    PieChart autoPieC = new PieChart(autoPieChartData);
		    autoPieC.setMinSize(500, 500);
		    autoPieC.setLabelsVisible(true);
			this.add(autoPieC, 2, 4);
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
				String title = (teamNumS + " " + theTeamPitList.getATeamPit(theTeam.getTeamNum()).getTeamName()+"'s Stats:");
				this.add(new Label(title), 0, 0);
				this.add(new Label("Comments:  "), 3, 0);
				List<String> commentList = theTeam.getCommentsList();
				commentsTA = new TextArea();
				commentsTA.setMaxSize(100, 100);
				String commentsS = "";
				for(int i = 0; i < commentList.size(); i++) {
					commentsS = commentsS + "\n" +commentList.get(i);
				}
				this.add(commentsTA, 3, 1);
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
				addStatChart("Cycles");
				System.out.println("Boop39");
				if(theTeamPitList != null) {
					addPitDataStuff(theTeam.getTeamNum());
				}
				addPieCharts(theTeam);
				System.out.println("Boop45");
				if(theDTDList != null) {
					System.out.println("Boop46");
					addDTDStuff(theTeam.getTeamNum());
					System.out.println("Boop47");
				}
				System.out.println("Boop48");
				if(theDTCList != null) {
					System.out.println("Boop49");
					if(theDTCList.getADriveTeamComments(theTeam.getTeamNum()) != null) {
						System.out.println("Boop50");
						addDTCStuff(theTeam.getTeamNum());
						System.out.println("Boop51");
					}
				}
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
