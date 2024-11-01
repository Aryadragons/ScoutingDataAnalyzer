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
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
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
	private BorderPane statCBBP = new BorderPane();
	private String commentsS;
	
	
	public searchTeamsTab(TeamList mainTeamList, List<Integer> importedListOfTeamNums, TeamPitsList importedListOfTeamPits, DriveTeamDataList imListOfDTD, DriveTeamCommentsList imListOfDTC) {
		Label selectTeamL = new Label("Select Team to Look Up");
		selectTeamL.setId("smallTitle");
		teamListCB = new ComboBox<String>();
		listOfTeamNums = importedListOfTeamNums;
		addComboBoxItems();
		seTeamsB = new Button("Submit");
		seTeamsB.setOnAction(this);
		BorderPane selectTeamBP = new BorderPane();
		selectTeamBP.setTop(selectTeamL);
		selectTeamBP.setRight(seTeamsB);
		selectTeamBP.setLeft(teamListCB);
		selectTeamBP.setId("searchTeamsSelTBP");
		this.add(new Label("    "), 0, 0);
		this.add(selectTeamBP, 1, 1);
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
		//Match CB
		matchListCB = new ComboBox<String>();
		MatchList teamML = theTeamList.getATeam(teamNum).getMatchList();
		int teamMLSize = teamML.listOfMatches.size();
		for (int i = 0; i < teamMLSize; i++) {
			int mNum = teamML.listOfMatches.get(i).getMatchNum();
			String mNumS = Integer.toString(mNum);
			matchListCB.getItems().add(mNumS);
		}
		//adding buttons
		statSubB = new Button("Submit");
		statSubB.setOnAction(this);
		matchSubB = new Button("Submit");
		matchSubB.setOnAction(this);
		
	}
	
	
	private void addAvgsStats(int team, double avgCy, double avgAmp, double avgSpe, double avgTrap, double avgCli, double avgHumAmpPostion, double avgHumScoPostion, double avgHumAmpSkill, double avgHumScoSkill, double avgHumAmpNotes, int timesAmp, int timesSco, Team theTeam) {
		Label avgCyclesL = new Label("Avg Cycles:");
		Label avgSpeL = new Label("Avg Spe:");
		Label avgAmpL = new Label("Avg Amp:");
		Label avgTrapL = new Label("Avg Trap:");
		Label avgCliL = new Label("Avg Slimb:");
		Label timesScoL = new Label("Times at Scoure:");
		Label timesAmpL = new Label("Times at Amp:");
		Label avgScoSkillL = new Label("Avg Scoure Skill:");
		Label avgAmpSkillL = new Label("Avg Amp Skill:");
		Label avgAmpNotesL = new Label("Avg Amp Notes:");
		avgCyclesL.setId("smallTitle");
		avgSpeL.setId("smallTitle");
		avgAmpL.setId("smallTitle");
		avgTrapL.setId("smallTitle");
		avgCliL.setId("smallTitle");
		timesScoL.setId("smallTitle");
		timesAmpL.setId("smallTitle");
		avgScoSkillL.setId("smallTitle");
		avgAmpSkillL.setId("smallTitle");
		avgAmpNotesL.setId("smallTitle");
		BorderPane avgCyclesBP = new BorderPane();
		BorderPane avgSpeBP = new BorderPane();
		BorderPane avgAmpBP = new BorderPane();
		BorderPane avgTrapBP = new BorderPane();
		BorderPane avgClimbBP = new BorderPane();
		BorderPane timesScoBP = new BorderPane();
		BorderPane timesAmpBP = new BorderPane();
		BorderPane avgScoSkillBP = new BorderPane();
		BorderPane avgAmpSkillBP = new BorderPane();
		BorderPane avgAmpNotesBP = new BorderPane();
		avgCyclesBP.setTop(avgCyclesL);
		avgSpeBP.setTop(avgSpeL);
		avgAmpBP.setTop(avgAmpL);
		avgTrapBP.setTop(avgTrapL);
		avgClimbBP.setTop(avgCliL);
		timesScoBP.setTop(timesScoL);
		timesAmpBP.setTop(timesAmpL);
		avgScoSkillBP.setTop(avgScoSkillL);
		avgAmpSkillBP.setTop(avgAmpSkillL);
		avgAmpNotesBP.setTop(avgAmpNotesL);
		Label avgCyclesAL = new Label(Double.toString(avgCy));
		Label avgSpeAL = new Label(Double.toString(avgSpe));
		Label avgAmpAL = new Label(Double.toString(avgAmp));
		Label avgTrapAL = new Label(Double.toString(avgTrap));
		Label avgCliAL = new Label(Double.toString(avgCli));
		Label timesScoAL = new Label(Double.toString(timesAmp));
		Label timesAmpAL = new Label(Double.toString(timesSco));
		Label avgScoSkillAL = new Label(Double.toString(avgHumScoSkill));
		Label avgAmpSkillAL = new Label(Double.toString(avgHumAmpSkill));
		Label avgAmpNotesAL = new Label(Double.toString(avgHumAmpNotes));
		avgCyclesAL.setId("avgStat");
		avgSpeAL.setId("avgStat");
		avgAmpAL.setId("avgStat");
		avgTrapAL.setId("avgStat");
		avgCliAL.setId("avgStat");
		timesScoAL.setId("avgStat");
		timesAmpAL.setId("avgStat");
		avgScoSkillAL.setId("avgStat");
		avgAmpSkillAL.setId("avgStat");
		avgAmpNotesAL.setId("avgStat");
		avgCyclesBP.setCenter(avgCyclesAL);
		avgSpeBP.setCenter(avgSpeAL);
		avgAmpBP.setCenter(avgAmpAL);
		avgTrapBP.setCenter(avgTrapAL);
		avgClimbBP.setCenter(avgCliAL);
		timesScoBP.setCenter(timesScoAL);
		timesAmpBP.setCenter(timesAmpAL);
		avgScoSkillBP.setCenter(avgScoSkillAL);
		avgAmpSkillBP.setCenter(avgAmpSkillAL);
		avgAmpNotesBP.setCenter(avgAmpNotesAL);
		avgCyclesBP.setId("avgCyclesBP");
		avgSpeBP.setId("avgSpeBP");
		avgAmpBP.setId("avgAmpBP");
		avgTrapBP.setId("avgTrapBP");
		avgClimbBP.setId("avgClimbBP");
		timesScoBP.setId("timesScoBP");
		timesAmpBP.setId("timesAmpBP");
		avgScoSkillBP.setId("avgScoSkillBP");
		avgAmpSkillBP.setId("avgAmpSkillBP");
		avgAmpNotesBP.setId("avgAmpNotesBP");
		Label empty1L = new Label("    ");
		Label empty2L = new Label("    ");
		Label empty3L = new Label(" ");
		VBox avgRobotVB = new VBox(5);
		avgRobotVB.getChildren().addAll(empty1L, avgCyclesBP, avgSpeBP, avgAmpBP, avgTrapBP, avgClimbBP);
		VBox avgHumanVB = new VBox(5);
		avgHumanVB.getChildren().addAll(empty2L, timesScoBP, timesAmpBP, avgScoSkillBP, avgAmpSkillBP, avgAmpNotesBP);
		String teamNumS = Integer.toString(theTeam.getTeamNum());
		Label title = new Label(teamNumS + " " + theTeamPitList.getATeamPit(theTeam.getTeamNum()).getTeamName()+"'s Stats:");
		title.setId("smallTitle");
		BorderPane teamTitleBP = new BorderPane();
		teamTitleBP.setTop(title);
		BorderPane teamBP = new BorderPane();
		teamBP.setLeft(avgRobotVB);
		teamBP.setRight(avgHumanVB);
		teamBP.setTop(teamTitleBP);
		teamBP.setCenter(empty3L);
		teamTitleBP.setId("teamTitleBP");
		this.add(new Label("    "), 0, 0);
		this.add(teamBP, 1, 1);
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
	    avgBCBarC.setBarGap(2);
	    avgBCBarC.setMinSize(150, 150);
	    avgBCBarC.setMaxSize(350, 250);
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
		humBCBarC.setBarGap(2);
		humBCBarC.setMinSize(150, 150);
		humBCBarC.setMaxSize(350, 250);
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
	private void addStatChart(String stat, int teamNum, int matchNum) {
		BorderPane matchBarChartBP = new BorderPane();
		VBox matchChartVB = new VBox(5);
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
			lineChart.setMaxSize(350, 250);
			lineChart.getData().add(series);
			matchChartVB.getChildren().add(lineChart);
			
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
			lineChart.setMaxSize(350, 250);
			lineChart.getData().add(series);
			matchChartVB.getChildren().add(lineChart);
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
			lineChart.setMaxSize(350, 250);
			lineChart.getData().add(series);
			matchChartVB.getChildren().add(lineChart);
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
			lineChart.setMaxSize(350, 250);
			lineChart.getData().add(series);
			matchChartVB.getChildren().add(lineChart);
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
			lineChart.setMaxSize(350, 250);
			lineChart.getData().add(series);
			matchChartVB.getChildren().add(lineChart);
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
			lineChart.setMaxSize(350, 250);
			lineChart.getData().add(series);
			matchChartVB.getChildren().add(lineChart);
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
			lineChart.setMaxSize(350, 250);
			lineChart.getData().add(series);
			matchChartVB.getChildren().add(lineChart);
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
			lineChart.setMaxSize(350, 250);
			lineChart.getData().add(series);
			matchChartVB.getChildren().add(lineChart);
		}
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
			String[] matchThings = {"Cycle", "Amp", "Spe", "Trap", "Climb", "Amp Sk", "Amp Note", "Auto Spe", "Auto Amp"};
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
		    cyData.getData().add(new XYChart.Data<String,Number>("Cycle", matchCy));
		    XYChart.Series<String,Number> ampData = new XYChart.Series<String,Number>();
		    ampData.setName("Amp Data");
		    ampData.getData().add(new XYChart.Data<String,Number>("Amp", matchAmp));
		    XYChart.Series<String,Number> speData = new XYChart.Series<String,Number>();
		    speData.setName("Speaker Data");
		    speData.getData().add(new XYChart.Data<String,Number>("Spe", matchSpe));
		    XYChart.Series<String,Number> trapData = new XYChart.Series<String,Number>();
		    trapData.setName("Trap Data");
		    trapData.getData().add(new XYChart.Data<String,Number>("Trap", matchTrap));
		    XYChart.Series<String,Number> cliData = new XYChart.Series<String,Number>();
		    cliData.setName("Climb Data");
		    cliData.getData().add(new XYChart.Data<String,Number>("Climb", matchCli));
		    XYChart.Series<String,Number> ampSkData = new XYChart.Series<String,Number>();
		    ampSkData.setName("Amp Skill Data");
		    ampSkData.getData().add(new XYChart.Data<String,Number>("Amp Sk", matchASk));
		    XYChart.Series<String,Number> ampNData = new XYChart.Series<String,Number>();
		    ampNData.setName("Amp Notes Data");
		    ampNData.getData().add(new XYChart.Data<String,Number>("Amp Note", matchAN));
		    XYChart.Series<String,Number> autoSpeData = new XYChart.Series<String,Number>();
		    autoSpeData.setName("Auto Speaker Data");
		    autoSpeData.getData().add(new XYChart.Data<String,Number>("Auto Spe", matchAutoSpe));
		    XYChart.Series<String,Number> autoAmpData = new XYChart.Series<String,Number>();
		    autoAmpData.setName("Auto Amp Data");
		    autoAmpData.getData().add(new XYChart.Data<String,Number>("Auto Amp", matchAutoAmp));
		    matchBCBarC.getData().addAll(cyData, ampData, speData, trapData, cliData, ampSkData, ampNData, autoSpeData, autoAmpData);
		    matchBCBarC.setBarGap(2);
		    matchBCBarC.setMinSize(150, 300);
		    matchBCBarC.setMaxSize(500, 300);
		    matchChartVB.getChildren().add(matchBCBarC);
		    System.out.println("Boop37.6");
		}
		if(matchPos.compareTo("Scoure") == 0) {
			System.out.println("Boop37.67");
			int matchCy = (theMatch.getMatchAmp() + theMatch.getMatchSpe() + theMatch.getMatchTrap());
			int matchAmp = theMatch.getMatchAmp();
			int matchSpe = theMatch.getMatchSpe();
			int matchTrap = theMatch.getMatchTrap();
			int matchCli = theMatch.getMatchClimb();
			int matchSSk = theMatch.getMatchScoSkill();
			int matchAutoSpe = theMatch.getTheAA().getAutoSpecker();
			int matchAutoAmp = theMatch.getTheAA().getAutoSpecker();
			String[] matchThings = {"Cycle", "Amp", "Spe", "Trap", "Climb", "Scoure Sk", "Auto Spe", "Auto Amp"};
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
		    cyData.getData().add(new XYChart.Data<String,Number>("Cycle", matchCy));
		    XYChart.Series<String,Number> ampData = new XYChart.Series<String,Number>();
		    ampData.setName("Amp Data");
		    ampData.getData().add(new XYChart.Data<String,Number>("Amp", matchAmp));
		    XYChart.Series<String,Number> speData = new XYChart.Series<String,Number>();
		    speData.setName("Speaker Data");
		    speData.getData().add(new XYChart.Data<String,Number>("Spe", matchSpe));
		    XYChart.Series<String,Number> trapData = new XYChart.Series<String,Number>();
		    trapData.setName("Trap Data");
		    trapData.getData().add(new XYChart.Data<String,Number>("Trap", matchTrap));
		    XYChart.Series<String,Number> cliData = new XYChart.Series<String,Number>();
		    cliData.setName("Climb Data");
		    cliData.getData().add(new XYChart.Data<String,Number>("Climb", matchCli));
		    XYChart.Series<String,Number> scoSkData = new XYChart.Series<String,Number>();
		    scoSkData.setName("Amp Skill Data");
		    scoSkData.getData().add(new XYChart.Data<String,Number>("Scoure Sk", matchSSk));
		    XYChart.Series<String,Number> autoSpeData = new XYChart.Series<String,Number>();
		    autoSpeData.setName("Auto Speaker Data");
		    autoSpeData.getData().add(new XYChart.Data<String,Number>("Auto Spe", matchAutoSpe));
		    XYChart.Series<String,Number> autoAmpData = new XYChart.Series<String,Number>();
		    autoAmpData.setName("Auto Amp Data");
		    autoAmpData.getData().add(new XYChart.Data<String,Number>("Auto Amp", matchAutoAmp));
		    matchBCBarC.getData().addAll(cyData, ampData, speData, trapData, cliData, scoSkData, autoSpeData, autoAmpData);
		    matchBCBarC.setBarGap(2);
		    matchBCBarC.setMinSize(150, 150);
		    matchBCBarC.setMaxSize(500, 250);
		    matchChartVB.getChildren().add(matchBCBarC);
		   
		}
		if(matchPos.compareTo("None") == 0) {
			System.out.println("Boop37.67");
			int matchCy = (theMatch.getMatchAmp() + theMatch.getMatchSpe() + theMatch.getMatchTrap());
			int matchAmp = theMatch.getMatchAmp();
			int matchSpe = theMatch.getMatchSpe();
			int matchTrap = theMatch.getMatchTrap();
			int matchCli = theMatch.getMatchClimb();
			int matchAutoSpe = theMatch.getTheAA().getAutoSpecker();
			int matchAutoAmp = theMatch.getTheAA().getAutoSpecker();
			String[] matchThings = {"Cycle", "Amp", "Spe", "Trap", "Climb", "Auto Spe", "Auto Amp"};
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
		    cyData.getData().add(new XYChart.Data<String,Number>("Cycle", matchCy));
		    XYChart.Series<String,Number> ampData = new XYChart.Series<String,Number>();
		    ampData.setName("Amp Data");
		    ampData.getData().add(new XYChart.Data<String,Number>("Amp", matchAmp));
		    XYChart.Series<String,Number> speData = new XYChart.Series<String,Number>();
		    speData.setName("Speaker Data");
		    speData.getData().add(new XYChart.Data<String,Number>("Spe", matchSpe));
		    XYChart.Series<String,Number> trapData = new XYChart.Series<String,Number>();
		    trapData.setName("Trap Data");
		    trapData.getData().add(new XYChart.Data<String,Number>("Trap", matchTrap));
		    XYChart.Series<String,Number> cliData = new XYChart.Series<String,Number>();
		    cliData.setName("Climb Data");
		    cliData.getData().add(new XYChart.Data<String,Number>("Climb", matchCli));
		    XYChart.Series<String,Number> autoSpeData = new XYChart.Series<String,Number>();
		    autoSpeData.setName("Auto Speaker Data");
		    autoSpeData.getData().add(new XYChart.Data<String,Number>("Auto Spe", matchAutoSpe));
		    XYChart.Series<String,Number> autoAmpData = new XYChart.Series<String,Number>();
		    autoAmpData.setName("Auto Amp Data");
		    autoAmpData.getData().add(new XYChart.Data<String,Number>("Auto Amp", matchAutoAmp));
		    matchBCBarC.getData().addAll(cyData, ampData, speData, trapData, cliData, autoSpeData, autoAmpData);
		    matchBCBarC.setBarGap(2);
		    matchBCBarC.setMinSize(150, 175);
		    matchBCBarC.setMaxSize(500, 250);
		    matchChartVB.getChildren().add(matchBCBarC);
		}
		BorderPane matchStatChartBP = new BorderPane();
		matchStatChartBP.setLeft(matchChartVB);
		matchStatChartBP.setTop(statListCB);
		matchStatChartBP.setBottom(matchListCB);
		this.add(matchStatChartBP, 2, 1);
		this.add(statSubB, 2, 2);
		
	}
	
	private void addMatchChart(int matchNum, int teamNum) {

	}
	
	public void addPitDataStuff(int teamNum) {
		Label numStudsQL = new Label("Number Of Student on Team " + teamNum + ": ");
		Label numMentsQL = new Label("Number Of Mentors on Team " + teamNum + ": ");
		Label numBattsQL = new Label("Number Of Battiers they have: ");
		Label proLanQL = new Label("What Programing langue they use: ");
		Label haveVisQL = new Label("They do use Vision");
		Label dontVisQL = new Label("They do not use Vision");
		Label numVisCamsQL = new Label("Number of Vision Cameras: ");
		Label numDriveCamsQL = new Label("Number of Driver Cameras: ");
		Label drTrQL = new Label("Their Robot's Drive Train is: ");
		Label drTrMotorQL = new Label("Their Robot's Drive Train uses This Motors: ");
		Label sweKindQL = new Label("Their Robot uses this kind of Swerve: ");
		Label sweGearQL = new Label("Their Robot Uses this Gearing: ");
		//adding labels with the Values
		//students
		String studs = Integer.toString(theTeamPitList.getATeamPit(teamNum).getNumOfStud());
		Label studsL = new Label(studs);
		studsL.setId("studslabel");
		
		//mentors
		String ments = Integer.toString(theTeamPitList.getATeamPit(teamNum).getNumOfMent());
		Label mentsL = new Label(ments);
		mentsL.setId("studslabel");

		//Robot Battiers
		String rBs = Integer.toString(theTeamPitList.getATeamPit(teamNum).getNumOfRobotBat());
		Label rBsL = new Label(rBs);
		rBsL.setId("studslabel");
		
		//Program Lan
		String progLans = theTeamPitList.getATeamPit(teamNum).getProgramLan();
		Label progLansL = new Label(progLans);
		progLansL.setId("studslabel");

		//VisCamera
		Label visCamsL = null;
		if(theTeamPitList.getATeamPit(teamNum).getDoHaveVis().compareTo("yes") == 0) {
			String visCams = Integer.toString(theTeamPitList.getATeamPit(teamNum).getNumOfVisCam());
			visCamsL = new Label(visCams);
			visCamsL.setId("studslabel");
			
		}
		//Drive Cameras
		String drCams = Integer.toString(theTeamPitList.getATeamPit(teamNum).getNumOfDriverCams());
		Label drCamsL = new Label(drCams);
		drCamsL.setId("studslabel");
		
		//Drive Train Type
		String drTypes = theTeamPitList.getATeamPit(teamNum).getDrTrType();
		Label drTypesL = new Label(drTypes);
		drTypesL.setId("studslabel");
		
		//Swerve Kind
		Label swTypesL = null;
		Label swGearsL = null;
		if(theTeamPitList.getATeamPit(teamNum).getDrTrType().compareTo("Swerve") == 0) {
			String swTypes = theTeamPitList.getATeamPit(teamNum).getSwevType();
			swTypesL = new Label(swTypes);
			swTypesL.setId("studslabel");
			
		//Swerve Gearing
			if(theTeamPitList.getATeamPit(teamNum).getSwevType().compareTo("Custom") == 0) {
			} else {
				String swGears = theTeamPitList.getATeamPit(teamNum).getSwevGearing();
				swGearsL = new Label(swGears);
				swGearsL.setId("studslabel");
				
			}
		}
		//Drive Train Motors
		String drMots = theTeamPitList.getATeamPit(teamNum).getDrTrMotorType();
		Label drMotsL = new Label(drMots);
		drMotsL.setId("studslabel");
		
		//questions Vboxes
		VBox studsMentsQVB = new VBox(5);
		studsMentsQVB.getChildren().addAll(numStudsQL, numMentsQL);
		VBox programingQVB = new VBox(5);
		VBox driveTrQVB = new VBox(5);
		//answer VBoxes
		VBox studsMentsVB = new VBox(5);
		studsMentsVB.getChildren().addAll(studsL, mentsL);
		VBox programingVB = new VBox(5);
		VBox driveTrVB = new VBox(5);
		if(theTeamPitList.getATeamPit(teamNum).getDoHaveVis().compareTo("yes") == 0) {
			programingQVB.getChildren().addAll(proLanQL, haveVisQL, numVisCamsQL, numDriveCamsQL);
			programingVB.getChildren().addAll(progLansL, visCamsL, drCamsL);
		} else {
			programingQVB.getChildren().addAll(proLanQL, dontVisQL, numDriveCamsQL);
			programingVB.getChildren().addAll(progLansL, drCamsL);
		}
		if(theTeamPitList.getATeamPit(teamNum).getDrTrType().compareTo("Swerve") == 0) {
			if(theTeamPitList.getATeamPit(teamNum).getSwevType().compareTo("Custom") == 0) {
				driveTrQVB.getChildren().addAll(drTrQL, drTrMotorQL, sweKindQL);
				driveTrVB.getChildren().addAll(drTypesL, drMotsL, swTypesL);
			} else {
				driveTrQVB.getChildren().addAll(drTrQL, drTrMotorQL, sweKindQL, sweGearQL);
				driveTrVB.getChildren().addAll(drTypesL, drMotsL, swTypesL, swGearsL);
			}
		}else {
			driveTrQVB.getChildren().addAll(drTrQL, drTrMotorQL);
			driveTrVB.getChildren().addAll(drTypesL, drMotsL);
		}
		BorderPane studsMentsBP = new BorderPane();
		BorderPane battsBP = new BorderPane();
		BorderPane progBP = new BorderPane();
		BorderPane driveBP = new BorderPane();
		studsMentsBP.setLeft(studsMentsQVB);
		studsMentsBP.setRight(studsMentsVB);
		battsBP.setLeft(numBattsQL);
		battsBP.setRight(rBsL);
		progBP.setLeft(programingQVB);
		progBP.setRight(programingVB);
		driveBP.setLeft(driveTrQVB);
		driveBP.setRight(driveTrVB);
		studsMentsBP.setId("seTeamsStudMentsBP");
		battsBP.setId("seTeamsBattsBP");
		progBP.setId("seTeamsProgramBP");
		driveBP.setId("seTeamsDriveTrBP");
		this.add(studsMentsBP, 1, 6);
		this.add(battsBP, 1, 7);
		this.add(progBP, 2, 6);
		this.add(driveBP, 1, 8);
		System.out.println("BoopPits");
		//autos
		Label autoTitle = new Label("Autos:");
		autoTitle.setId("TitleLabel");
		this.add(autoTitle, 3, 5);
		System.out.println("BoopPits1");
		int autoInfoPos = 6;
		int autoNumBP = 1;
		for (int i = 0; i < theTeamPitList.getATeamPit(teamNum).getTheAutoList().listOfAutos.size(); i++) {
			System.out.println("BoopPits2");
			double totalPieces = theTeamPitList.getATeamPit(teamNum).getTheAutoList().listOfAutos.get(i).getTotalAmp() + theTeamPitList.getATeamPit(teamNum).getTheAutoList().listOfAutos.get(i).getTotalSpecker();
			if(theTeamPitList.getATeamPit(teamNum).getTheAutoList().listOfAutos.get(i).getTotalControl() > totalPieces) {
				totalPieces = totalPieces + 0.5;
			}
			String startPosName = "";
			if (theTeamPitList.getATeamPit(teamNum).getTheAutoList().listOfAutos.get(i).getAutoStartPos() == 0) {
				startPosName = "Far Side";
			}
			if (theTeamPitList.getATeamPit(teamNum).getTheAutoList().listOfAutos.get(i).getAutoStartPos() == 1) {
				startPosName = "Far Side Speaker";
			}
			if (theTeamPitList.getATeamPit(teamNum).getTheAutoList().listOfAutos.get(i).getAutoStartPos() == 2) {
				startPosName = "Center Speaker";
			}
			if (theTeamPitList.getATeamPit(teamNum).getTheAutoList().listOfAutos.get(i).getAutoStartPos() == 3) {
				startPosName = "Amp Side Speaker";
			}
			if (theTeamPitList.getATeamPit(teamNum).getTheAutoList().listOfAutos.get(i).getAutoStartPos() == 4) {
				startPosName = "Amp Side";
			}
			System.out.println("BoopPits3");
			String autoName = totalPieces + " Piece, " + startPosName + " Spe: " + theTeamPitList.getATeamPit(teamNum).getTheAutoList().listOfAutos.get(i).getTotalSpecker();
			Label autoNameL = new Label(autoName);
			BorderPane autoPane = new BorderPane();
			autoPane.setId("seTeamsAutoBP" + autoNumBP);
			autoPane.setCenter(autoNameL);
			this.add(autoPane, 3, autoInfoPos);
			autoInfoPos++;
			autoNumBP++;
			if(autoNumBP > 9) {
				autoNumBP = 1;
			}
		}
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
		ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(new PieChart.Data("Amp", ampValue), new PieChart.Data("Specker", speValue), new PieChart.Data("Trap", trapValue));
		PieChart cyclePieC = new PieChart(pieChartData);
		cyclePieC.autosize();
		cyclePieC.setMaxSize(350, 350);
		cyclePieC.setLabelsVisible(true);
		this.add(cyclePieC, 1, 3);
		//adding human player pie chart
		int ampHumValue = ((theTeam.getTimesHumAmp() * 100)/theTeam.getTotalMatchesPlayed());
		int scoHumValue = ((theTeam.getTimesHumSco() * 100)/theTeam.getTotalMatchesPlayed());
		ObservableList<PieChart.Data> humPieChartData = FXCollections.observableArrayList(new PieChart.Data("Amp", ampHumValue), new PieChart.Data("Scoure", scoHumValue));
		PieChart humPieC = new PieChart(humPieChartData);
		humPieC.setMaxSize(350, 350);
		humPieC.autosize();
		
		humPieC.setLabelsVisible(true);
		this.add(humPieC, 2, 3);
	}
	
	public void addDTDStuff(int teamNum) {
		if(theDTDList.getATeamPit(teamNum).getIsAdult() == true) {
			Label adultWarningL = new Label("Adult Drive Coach");
			adultWarningL.setId("ADC");
			this.add(adultWarningL, 1, 0);
		}
		//driver stuff
		Label driverInfoL = new Label("Driver Info:");
		this.add(driverInfoL, 1, 9);
		driverInfoL.setId("TitleLabel");
		Label saDriverTourQL = new Label("Same Driver Throughout the Tourment?");
		Label saDriverLastQL = new Label("Same Driver as Last Tourment?");
		Label saDriverYearQL = new Label("Same Driver as Last Year?");
		Label hoursThisDrQL = new Label("Hours Practicing With This Bot:");
		Label hoursSaDrQL = new Label("Hours Practicing With The Same Drive Train:");
		Label hoursAnyDrQL = new Label("Hours Practicing With Any Bot:");
		VBox saDriverQVB = new VBox(5);
		saDriverQVB.getChildren().addAll(saDriverTourQL, saDriverLastQL, saDriverYearQL);
		VBox hourDriverQVB = new VBox(5);
		hourDriverQVB.getChildren().addAll(hoursThisDrQL, hoursSaDrQL, hoursAnyDrQL);
		Label saOperatorTourQL = new Label("Same Operator Throughout the Tourment?");
		Label saOperatorLastQL = new Label("Same Operator as Last Tourment?");
		Label saOperatorYearQL = new Label("Same Operator as Last Year?");
		Label hoursThisOpQL = new Label("Hours Practicing With This Bot:");
		Label hoursAnyOpQL = new Label("Hours Practicing With Any Bot:");
		VBox saOperatorQVB = new VBox(5);
		saOperatorQVB.getChildren().addAll(saOperatorTourQL, saOperatorLastQL, saOperatorYearQL);
		VBox hourOperatorQVB = new VBox(5);
		hourOperatorQVB.getChildren().addAll(hoursThisOpQL, hoursAnyOpQL);
		//add stats
		String saDrTour;
		if(theDTDList.getATeamPit(teamNum).getSaDrThisTour() == true) {
			saDrTour = "Yes";
		} else {
			saDrTour = "No";
		}
		Label saDrTourL = new Label(saDrTour);
		saDrTourL.setId("studslabel");
		String saDrPast;
		if(theDTDList.getATeamPit(teamNum).getSaDrPastTour() == true) {
			saDrPast = "Yes";
		} else {
			saDrPast = "No";
		}
		Label saDrPastL = new Label(saDrPast);
		saDrPastL.setId("studslabel");
		String saDrLast;
		if(theDTDList.getATeamPit(teamNum).getSaDrLastYear() == true) {
			saDrLast = "Yes";
		} else {
			saDrLast = "No";
		}
		Label saDrLastL = new Label(saDrLast);
		saDrLastL.setId("studslabel");
		String saDrThis = Integer.toString(theDTDList.getATeamPit(teamNum).getDrHourThisBot());
		Label saDrThisL = new Label(saDrThis);
		saDrThisL.setId("studslabel");
		String saDrSame = Integer.toString(theDTDList.getATeamPit(teamNum).getDrHourSameDrTr());
		Label saDrSameL = new Label(saDrSame);
		saDrSameL.setId("studslabel");
		String saDrAny = Integer.toString(theDTDList.getATeamPit(teamNum).getDrHourAnyBot());
		Label saDrAnyL = new Label(saDrAny);
		saDrAnyL.setId("studslabel");
		//operator stuff
		Label opInfoL = new Label("Operator Info:");
		opInfoL.setId("TitleLabel");
		//add stats
		String opInfoType = theDTDList.getATeamPit(teamNum).getOpRole();
		Label opInfoTypeL = new Label(opInfoType);
		opInfoTypeL.setId("TitleLabel");
		String saOpTour;
		if(theDTDList.getATeamPit(teamNum).getSaOpThisTour() == true){
			saOpTour = "Yes";
		} else {
			saOpTour = "No";
		}
		Label saOpTourL = new Label(saOpTour);
		saOpTourL.setId("studslabel");
		this.add(saOpTourL, 1, 13);
		String saOpPast;
		if(theDTDList.getATeamPit(teamNum).getSaOpPastTour() == true) {
			saOpPast = "Yes";
		} else {
			saOpPast = "No";
		}
		Label saOpPastL = new Label(saOpPast);
		saOpPastL.setId("studslabel");
		this.add(saOpPastL, 1, 14);
		String saOpLast;
		if(theDTDList.getATeamPit(teamNum).getSaOpLastYear() == true) {
			saOpLast = "Yes";
		} else {
			saOpLast = "No";
		}
		Label saOpLastL = new Label(saOpLast);
		saOpLastL.setId("studslabel");
		String saOpThis = Integer.toString(theDTDList.getATeamPit(teamNum).getOpHourThisBot());
		Label saOpThisL = new Label(saOpThis);
		saOpThisL.setId("studslabel");
		String saOpAny = Integer.toString(theDTDList.getATeamPit(teamNum).getOpHourAnyBot());
		Label saOpAnyL = new Label(saOpAny);
		saOpAnyL.setId("studslabel");
		VBox saDriverVB = new VBox(5);
		saDriverVB.getChildren().addAll(saDrTourL, saDrPastL, saDrLastL);
		VBox hourDriverVB = new VBox(5);
		hourDriverVB.getChildren().addAll(saDrThisL, saDrSameL, saDrAnyL);
		VBox saOperatorVB = new VBox(5);
		saOperatorVB.getChildren().addAll(saOpTourL, saOpPastL, saOpLastL);
		VBox hourOperatorVB = new VBox(5);
		hourOperatorVB.getChildren().addAll(saOpThisL, saOpAnyL);
		BorderPane saDriverBP = new BorderPane();
		saDriverBP.setLeft(saDriverQVB);
		saDriverBP.setRight(saDriverVB);
		saDriverBP.setId("saDriverBP");
		BorderPane hourDriverBP = new BorderPane();
		hourDriverBP.setLeft(hourDriverQVB);
		hourDriverBP.setRight(hourDriverVB);
		hourDriverBP.setId("hourDriverBP");
		BorderPane saOperatorBP = new BorderPane();
		saOperatorBP.setLeft(saOperatorQVB);
		saOperatorBP.setRight(saOperatorVB);
		saOperatorBP.setId("saOperatorBP");
		BorderPane hourOperatorBP = new BorderPane();
		hourOperatorBP.setLeft(hourOperatorQVB);
		hourOperatorBP.setRight(hourOperatorVB);
		hourOperatorBP.setId("hourOperatorBP");
		this.add(saDriverBP, 1, 10);
		this.add(hourDriverBP, 1, 11);
		this.add(saOperatorBP, 2, 10);
		this.add(hourOperatorBP, 2, 11);
		//drive coach stuff
		Label drCoInfoL = new Label("Drive Coach Info:");
		this.add(drCoInfoL, 1, 18);
		drCoInfoL.setId("TitleLabel");
		Label isAdultL = new Label("Is Drive Coach an Adult?");
		Label howLongCoL = new Label("How Long Have Thye Drive Coached:");
		VBox drCoachQVB = new VBox(5);
		drCoachQVB.getChildren().addAll(isAdultL, howLongCoL);
		//add stats
		String adultDC;
		if(theDTDList.getATeamPit(teamNum).getIsAdult() == true) {
			adultDC = "Yes";
		} else {
			adultDC = "No";
		}
		Label adultDCL = new Label(adultDC);
		adultDCL.setId("studslabel");
		String timeDC = theDTDList.getATeamPit(teamNum).getTimeDriveCoach();
		Label timeDCL = new Label(timeDC);
		timeDCL.setId("studslabel");
		VBox drCoachVB = new VBox(5);
		drCoachVB.getChildren().addAll(adultDCL, timeDCL);
		BorderPane drCoachBP = new BorderPane();
		drCoachBP.setLeft(drCoachQVB);
		drCoachBP.setRight(drCoachVB);
		drCoachBP.setId("drCoachVB");
		//Human Player stuff
		Label humInfoL = new Label("Human Player Info:");
		humInfoL.setId("TitleLabel");
		Label humHoursQL = new Label("Hours Human Player Practiced");
		//add stats
		String humPrac = Integer.toString(theDTDList.getATeamPit(teamNum).getHumHoursPracitce());
		Label humPracL = new Label("                                    " + humPrac);
		humPracL.setId("studslabel");
		BorderPane humPlayerBP = new BorderPane();
		humPlayerBP.setLeft(humHoursQL);
		humPlayerBP.setRight(humPracL);
		humPlayerBP.setId("humPlayerBP");
		this.add(drCoachBP, 1, 18);
		this.add(humPlayerBP, 2, 18);
	}
	
	public void addDTCStuff(int teamNum){
		if(theDTCList.getADriveTeamComments(teamNum).gettotalBLevel() >= 2) {
			Label warning1 = new Label("Warning Level 1");
			warning1.setId("warn1");
			this.add(warning1, 2, 0);
		}
		if(theDTCList.getADriveTeamComments(teamNum).gettotalBLevel() >= 5) {
			Label warning2 = new Label("Warning Level 2");
			warning2.setId("warn2");
			this.add(warning2, 2, 0);
		}
		if(theDTCList.getADriveTeamComments(teamNum).gettotalBLevel() >= 10) {
			Label warning3 = new Label("Warning Level 3");
			warning3.setId("warn3");
			this.add(warning3, 2, 0);
		}
		Label dtcC = new Label("Comments From Drive Team:");
		dtcC.setId("TitleLabel");
		this.add(dtcC, 1, 21);
		int stuff = 22;
		int numOfB = 0;
		int numOfG = 0;
		VBox badStuffVB = new VBox(5);
		VBox goodStuffVB = new VBox(5);
		if(theDTCList.getADriveTeamComments(teamNum).getYellLevel() != 0) {
			stuff++;
			numOfB++;
			Label yell1L = new Label("Yell Level: ");
			yell1L.setId("smallTitle");
			Label yell2L = new Label(Integer.toString(theDTCList.getADriveTeamComments(teamNum).getYellLevel()));
			yell2L.setId("avgStat");
			BorderPane yellBP = new BorderPane();
			yellBP.setTop(yell1L);
			yellBP.setCenter(yell2L);
			yellBP.setId("seDTCBP1");
			badStuffVB.getChildren().add(yellBP);
		}
		if(theDTCList.getADriveTeamComments(teamNum).getControlLevel() != 0) {
			stuff++;
			numOfB++;
			Label control1L = new Label("Control Level: ");
			control1L.setId("smallTitle");
			Label control2L = new Label(Integer.toString(theDTCList.getADriveTeamComments(teamNum).getControlLevel()));
			control2L.setId("avgStat");
			BorderPane controlBP = new BorderPane();
			controlBP.setTop(control1L);
			controlBP.setCenter(control2L);
			controlBP.setId("seDTCBP2");
			badStuffVB.getChildren().add(controlBP);
		}
		if(theDTCList.getADriveTeamComments(teamNum).getPhysicalLevel() != 0) {
			stuff++;
			numOfB++;
			Label physical1L = new Label("Physical Level: ");
			physical1L.setId("smallTitle");
			Label physical2L = new Label(Integer.toString(theDTCList.getADriveTeamComments(teamNum).getPhysicalLevel()));
			physical2L.setId("avgStat");
			BorderPane physicalBP = new BorderPane();
			physicalBP.setTop(physical1L);
			physicalBP.setCenter(physical2L);
			physicalBP.setId("seDTCBP3");
			badStuffVB.getChildren().add(physicalBP);
		}
		if(theDTCList.getADriveTeamComments(teamNum).getDiscrimLevel() != 0) {
			stuff++;
			numOfB++;
			Label disLevel1L = new Label("Discrimination Level: ");
			disLevel1L.setId("smallTitle");
			Label disLevel2L = new Label(Integer.toString(theDTCList.getADriveTeamComments(teamNum).getDiscrimLevel()));
			disLevel2L.setId("avgStat");
			BorderPane disLevelBP = new BorderPane();
			disLevelBP.setTop(disLevel1L);
			disLevelBP.setCenter(disLevel2L);
			disLevelBP.setId("seDTCBP4");
			badStuffVB.getChildren().add(disLevelBP);
		}
		if(theDTCList.getADriveTeamComments(teamNum).getDisCrimType() != null) {
			stuff++;
			numOfB++;
			Label disType1L = new Label("Type/s of Discrimination: ");
			disType1L.setId("smallTitle");
			Label disType2L = new Label(theDTCList.getADriveTeamComments(teamNum).getDisCrimType());
			disType2L.setId("avgStat");
			BorderPane disTypeBP = new BorderPane();
			disTypeBP.setTop(disType1L);
			disTypeBP.setCenter(disType2L);
			disTypeBP.setId("seDTCBP5");
			badStuffVB.getChildren().add(disTypeBP);
		}
		if(theDTCList.getADriveTeamComments(teamNum).getOtherBLevel() != 0) {
			stuff++;
			numOfB++;
			Label otherB1L = new Label("Other Bad Stuff Level: ");
			otherB1L.setId("smallTitle");
			Label otherB2L = new Label(Integer.toString(theDTCList.getADriveTeamComments(teamNum).getOtherBLevel()));
			otherB2L.setId("avgStat");
			BorderPane otherBBP = new BorderPane();
			otherBBP.setTop(otherB1L);
			otherBBP.setCenter(otherB2L);
			otherBBP.setId("seDTCBP6");
			badStuffVB.getChildren().add(otherBBP);
		}
		if(theDTCList.getADriveTeamComments(teamNum).getFunLevel() != 0) {
			stuff++;
			numOfG++;
			Label Fun1L = new Label("Fun Level: ");
			Fun1L.setId("smallTitle");
			Label Fun2L = new Label(Integer.toString(theDTCList.getADriveTeamComments(teamNum).getFunLevel()));
			Fun2L.setId("avgStat");
			BorderPane FunBP = new BorderPane();
			FunBP.setTop(Fun1L);
			FunBP.setCenter(Fun2L);
			FunBP.setId("seDTCBP2");
			goodStuffVB.getChildren().add(FunBP);
		}
		if(theDTCList.getADriveTeamComments(teamNum).getStrategyLevel() != 0) {
			stuff++;
			numOfG++;
			Label strat1L = new Label("Strategy Level: ");
			strat1L.setId("smallTitle");
			Label strat2L = new Label(Integer.toString(theDTCList.getADriveTeamComments(teamNum).getStrategyLevel()));
			strat2L.setId("avgStat");
			BorderPane stratBP = new BorderPane();
			stratBP.setTop(strat1L);
			stratBP.setCenter(strat2L);
			stratBP.setId("seDTCBP3");
			goodStuffVB.getChildren().add(stratBP);
		}
		if(theDTCList.getADriveTeamComments(teamNum).getOtherGLevel() != 0) {
			stuff++;
			numOfG++;
			Label otherG1L = new Label("Ohter Good Stuff Level: ");
			otherG1L.setId("smallTitle");
			Label otherG2L = new Label(Integer.toString(theDTCList.getADriveTeamComments(teamNum).getOtherGLevel()));
			otherG2L.setId("avgStat");
			BorderPane otherGBP = new BorderPane();
			otherGBP.setTop(otherG1L);
			otherGBP.setCenter(otherG2L);
			otherGBP.setId("seDTCBP4");
			goodStuffVB.getChildren().add(otherGBP);
		}
		BorderPane DTCBorderPane = new BorderPane();
		if(theDTCList.getADriveTeamComments(teamNum).getComments() != null) {
			stuff++;
			Label comments1L = new Label("Comments: ");
			comments1L.setId("smallTitle");
			Label comments2L = new Label(theDTCList.getADriveTeamComments(teamNum).getComments());
			comments2L.setId("avgStat");
			BorderPane commentsBP = new BorderPane();
			commentsBP.setTop(comments1L);
			commentsBP.setCenter(comments2L);
			commentsBP.setId("seDTCBP7");
			DTCBorderPane.setBottom(commentsBP);
		}
		if(numOfB != 0) {
			DTCBorderPane.setLeft(badStuffVB);
		}
		if(numOfG != 0) {
			DTCBorderPane.setRight(goodStuffVB);
		}
		this.add(DTCBorderPane, 1, 22);
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
				String autoName = totalPieces + " Piece, " + startPosName + " Spe: " + theTeamList.getATeam(teamNum).getAutoList().listOfAutos.get(i).getTotalSpecker();
				autosListCB.getItems().add(autoName);
			}
			
			submitAutoB = new Button("Submit Auto");
			submitAutoB.setOnAction(this);
			Auto A = theTeamList.getATeam(teamNum).getAutoList().listOfAutos.get(autoNumber);
			if(A.getTimesUsed() == 0) {
				this.add(new Label("They Havn't Used This Auto"), 3, 1);
			}else{
				double speAvg = A.getAvgSpe();
				double ampAvg = A.getAvgAmp();
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
			    autoBCBarC.setMinSize(250, 200);
			    autoBCBarC.setMaxSize(300, 250);
			    BorderPane autoBarChartBP = new BorderPane();
			    autoBarChartBP.setTop(autoBCBarC);
			    this.add(new Label("This Auto Has Been Used " + A.getTimesUsed() + " Times"), 3, 0);
			}
			VBox autoVB = new VBox(5);
			Label commentsL = new Label("Comments:");
			commentsL.setId("smallTitle");
			BorderPane commentBP = new BorderPane();
			commentBP.setTop(commentsL);
			commentBP.setCenter(commentsTA);
			commentBP.setId("commentsBP");
			commentsTA.setText(commentsS);
			this.add(commentBP, 3, 2);
			autoVB.getChildren().addAll(autosListCB, autoBCBarC,submitAutoB, commentBP);
			this.add(autoVB, 3, 1);
			// pie chart
		    int numOfAutosUsed = 0;
		    System.out.println("BoopAutoPC");
		    AutoList usedAutos = new AutoList();
		    for (int i = 0; i < theTeamList.getATeam(teamNum).getAutoList().listOfAutos.size(); i++) {
		    	System.out.println("BoopAutoPC0");
		    	if(theTeamList.getATeam(teamNum).getAutoList().listOfAutos.get(i).getTimesUsed() != 0) {
		    		System.out.println("BoopAutoPC1");
		    		usedAutos.listOfAutos.add(theTeamList.getATeam(teamNum).getAutoList().listOfAutos.get(i));
		    		numOfAutosUsed = numOfAutosUsed + theTeamList.getATeam(teamNum).getAutoList().listOfAutos.get(i).getTimesUsed();
		    	}
		    }
		    PieChart autoPieC = new PieChart();
		    int totalPercent = 0;
		    int matches = theTeamList.getATeam(teamNum).getTotalMatchesPlayed();
		    String startPosName = "";
		    for(int i = 0; i < usedAutos.listOfAutos.size(); i++) {
		    	System.out.println("BoopAutoPC2");
		    	if( i == (usedAutos.listOfAutos.size() - 1)) {
		    		System.out.println("BoopAutoPC3");
		    		int usePercent = (usedAutos.listOfAutos.get(i).getTimesUsed() / matches) * 100;
		    		totalPercent = totalPercent + (usedAutos.listOfAutos.get(i).getTimesUsed() / matches) * 100;
		    		int add = 100 - totalPercent;
		    		usePercent = usePercent + add;
		    		//name stuff
		    		double totalPieces = theTeamList.getATeam(teamNum).getAutoList().listOfAutos.get(i).getTotalAmp() + theTeamList.getATeam(teamNum).getAutoList().listOfAutos.get(i).getTotalSpecker();
					if(theTeamList.getATeam(teamNum).getAutoList().listOfAutos.get(i).getTotalControl() > totalPieces) {
						totalPieces = totalPieces + 0.5;
					}
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
					String name = startPosName + totalPieces;
					//adding auto pie chart data
					PieChart.Data autoData = new PieChart.Data(name , totalPercent);

				    autoPieC.getData().add(autoData);
		    	} else {
		    		System.out.println("BoopAutoPC4");
		    		int usePercent = (usedAutos.listOfAutos.get(i).getTimesUsed() / matches) * 100;
		    		totalPercent = totalPercent + (usedAutos.listOfAutos.get(i).getTimesUsed() / matches) * 100;
		    		//name stuff
		    		double totalPieces = theTeamList.getATeam(teamNum).getAutoList().listOfAutos.get(i).getTotalAmp() + theTeamList.getATeam(teamNum).getAutoList().listOfAutos.get(i).getTotalSpecker();
					if(theTeamList.getATeam(teamNum).getAutoList().listOfAutos.get(i).getTotalControl() > totalPieces) {
						totalPieces = totalPieces + 0.5;
					}
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
		    		//adding auto pie chart data
					String name = startPosName + totalPieces;
					//adding auto pie chart data
					PieChart.Data autoData = new PieChart.Data(name , totalPercent);

				    autoPieC.getData().add(autoData);
		    	}
		    	
		    }
		    autoPieC.setLabelsVisible(true);
		    autoPieC.setMinSize(350, 350);
		    autoPieC.setMaxSize(500, 350);
		    autoPieC.autosize();
			this.add(autoPieC, 3, 3);
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
				List<String> commentList = theTeam.getCommentsList();
				commentsTA = new TextArea();
				commentsTA.setMaxSize(250, 250);
				commentsS = "";
				for(int i = 0; i < commentList.size(); i++) {
					commentsS = commentsS + "\n" +commentList.get(i);
				}
				System.out.println("Boop33");
				Label didMatchesL;
				if (theTeam.getTotalMatchesPlayed() == 1) {
					didMatchesL = new Label("Did 1 Match");
				} else {
					didMatchesL = new Label("Did " + theTeam.getTotalMatchesPlayed() + " Matches");
				}
				didMatchesL.setId("smallTitle");
				this.add(didMatchesL, 1, 2);
				System.out.println("Boop34");
				System.out.println(theTeam.getAvgHumAmpPostion());
			    System.out.println(theTeam.getAvgHumScoPostion());
			    System.out.println(theTeam.getHumAmpSkill());
			    System.out.println(theTeam.getHumScoSkill());
			    System.out.println(theTeam.getHumAmpNotes());
			    System.out.println(theTeam.getTimesHumAmp());
			    System.out.println(theTeam.getTimesHumSco());
			    addAvgsStats(theTeam.getTeamNum(), theTeam.getAvgCycles(), theTeam.getAvgAmp(), theTeam.getAvgSpe(), theTeam.getAvgTrap(), theTeam.getAvgClimb(), theTeam.getAvgHumAmpPostion(), theTeam.getAvgHumScoPostion(), theTeam.getHumAmpSkill(), theTeam.getHumScoSkill(), theTeam.getHumAmpNotes(), theTeam.getTimesHumAmp(), theTeam.getTimesHumSco(), theTeam);
				System.out.println("Boop35");
				addStatAndMatchCB(theTeam.getTeamNum());
				System.out.println("Boop36");
				int matchNum = theTeam.getMatchList().listOfMatches.get(0).getMatchNum();
				System.out.println("Boop37");
				addMatchChart(matchNum, theTeam.getTeamNum());
				System.out.println("Boop38");
				addStatChart("Cycles", theTeam.getTeamNum(), matchNum);
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
				addAutoStuff(theTeam.getTeamNum(), 0);
			}
			if(event.getSource() == statSubB) {
				Team theTeam;
				String selectedTeamS = teamListCB.getSelectionModel().getSelectedItem();
				System.out.println("Boop31.1");
				int selectedTeam = Integer.parseInt(selectedTeamS);
				theTeam = theTeamList.getATeam(selectedTeam);
				this.getChildren().remove(lineChart);
				String selectedStatS = statListCB.getSelectionModel().getSelectedItem();
				this.getChildren().remove(matchBCBarC);
				String selectedMatchS = matchListCB.getSelectionModel().getSelectedItem();
				int selectedMatch= Integer.parseInt(selectedMatchS);
				addStatChart(selectedStatS, theTeam.getTeamNum(), selectedMatch);
			}
			if(event.getSource() == matchSubB) {
				this.getChildren().remove(matchBCBarC);
				String selectedMatchS = matchListCB.getSelectionModel().getSelectedItem();
				int selectedMatch= Integer.parseInt(selectedMatchS);
				addMatchChart(selectedMatch ,selectTeam.getTeamNum());
			}
			if(event.getSource() == submitAutoB) {
				this.getChildren().remove(autoBCBarC);
				String selectedAutoS = autosListCB.getSelectionModel().getSelectedItem();
				if(selectedAutoS.substring(9, 10).compareTo("Fa") == 0) {
					if(selectedAutoS.length() > 25) {
						int conValue = Integer.parseInt(selectedAutoS.substring(0, 0));
						int speValue = Integer.parseInt(selectedAutoS.substring(31));
						String selectedTeamS = teamListCB.getSelectionModel().getSelectedItem();
						int selectedTeam = Integer.parseInt(selectedTeamS);
						Team theTeam;
						theTeam = theTeamList.getATeam(selectedTeam);
						selectTeam = theTeam;
						int found = 0;
						int size = theTeam.getAutoList().listOfAutos.size();
						int i = 0;
						Auto A = new Auto();
						System.out.println("Boop30.5");
						while(i < size & found == 0) {
							A = theTeam.getAutoList().listOfAutos.get(i);
							System.out.println("Boop30.6");
							if(A.getAutoStartPos() == 1) {
								System.out.println("Boop30.7");
								if(A.getTotalControl() == conValue) {
									System.out.println("Boop30.8");
									if(A.getTotalSpecker() == speValue) {
										System.out.println("Boop30.9");
										found = 1;
									}else {
										System.out.println("Boop30.9");
										i++;
									}
								}else {
									System.out.println("Boop30.8");
									i++;
								}
							}else {
								System.out.println("Boop30.7");
								i++;
							}
						}
						
						addAutoStuff(selectedTeam, i);
					}else{
						int speValue = Integer.parseInt(selectedAutoS.substring(23));
						int conValue = Integer.parseInt(selectedAutoS.substring(0, 0));
						String selectedTeamS = teamListCB.getSelectionModel().getSelectedItem();
						int selectedTeam = Integer.parseInt(selectedTeamS);
						Team theTeam;
						theTeam = theTeamList.getATeam(selectedTeam);
						selectTeam = theTeam;
						int found = 0;
						int size = theTeam.getAutoList().listOfAutos.size();
						int i = 0;
						Auto A = new Auto();
						System.out.println("Boop30.5");
						while(i < size & found == 0) {
							A = theTeam.getAutoList().listOfAutos.get(i);
							System.out.println("Boop30.6");
							if(A.getAutoStartPos() == 0) {
								System.out.println("Boop30.7");
								if(A.getTotalControl() == conValue) {
									System.out.println("Boop30.8");
									if(A.getTotalSpecker() == speValue) {
										System.out.println("Boop30.9");
										found = 1;
									}else {
										System.out.println("Boop30.9");
										i++;
									}
								}else {
									System.out.println("Boop30.8");
									i++;
								}
							}else {
								System.out.println("Boop30.7");
								i++;
							}
						}
						
						addAutoStuff(selectedTeam, i);
					}
				}else if(selectedAutoS.substring(9, 10).compareTo("Ce") == 0) {
					int conValue = Integer.parseInt(selectedAutoS.substring(0, 0));
					int speValue = Integer.parseInt(selectedAutoS.substring(29));
					String selectedTeamS = teamListCB.getSelectionModel().getSelectedItem();
					int selectedTeam = Integer.parseInt(selectedTeamS);
					Team theTeam;
					theTeam = theTeamList.getATeam(selectedTeam);
					selectTeam = theTeam;
					int found = 0;
					int size = theTeam.getAutoList().listOfAutos.size();
					int i = 0;
					Auto A = new Auto();
					System.out.println("Boop30.5");
					while(i < size & found == 0) {
						A = theTeam.getAutoList().listOfAutos.get(i);
						System.out.println("Boop30.6");
						if(A.getAutoStartPos() == 2) {
							System.out.println("Boop30.7");
							if(A.getTotalControl() == conValue) {
								System.out.println("Boop30.8");
								if(A.getTotalSpecker() == speValue) {
									System.out.println("Boop30.9");
									found = 1;
								}else {
									System.out.println("Boop30.9");
									i++;
								}
							}else {
								System.out.println("Boop30.8");
								i++;
							}
						}else {
							System.out.println("Boop30.7");
							i++;
						}
					}
					
					addAutoStuff(selectedTeam, i);
				}else{
					if(selectedAutoS.length() > 25) {
						int conValue = Integer.parseInt(selectedAutoS.substring(0, 0));
						int speValue = Integer.parseInt(selectedAutoS.substring(31));
						String selectedTeamS = teamListCB.getSelectionModel().getSelectedItem();
						int selectedTeam = Integer.parseInt(selectedTeamS);
						Team theTeam;
						theTeam = theTeamList.getATeam(selectedTeam);
						selectTeam = theTeam;
						int found = 0;
						int size = theTeam.getAutoList().listOfAutos.size();
						int i = 0;
						Auto A = new Auto();
						System.out.println("Boop30.5");
						while(i < size & found == 0) {
							A = theTeam.getAutoList().listOfAutos.get(i);
							System.out.println("Boop30.6");
							if(A.getAutoStartPos() == 3) {
								System.out.println("Boop30.7");
								if(A.getTotalControl() == conValue) {
									System.out.println("Boop30.8");
									if(A.getTotalSpecker() == speValue) {
										System.out.println("Boop30.9");
										found = 1;
									}else {
										System.out.println("Boop30.9");
										i++;
									}
								}else {
									System.out.println("Boop30.8");
									i++;
								}
							}else {
								System.out.println("Boop30.7");
								i++;
							}
						}
						
						addAutoStuff(selectedTeam, i);
					}else {
						int conValue = Integer.parseInt(selectedAutoS.substring(0, 0));
						int speValue = Integer.parseInt(selectedAutoS.substring(23));
						String selectedTeamS = teamListCB.getSelectionModel().getSelectedItem();
						int selectedTeam = Integer.parseInt(selectedTeamS);
						Team theTeam;
						theTeam = theTeamList.getATeam(selectedTeam);
						selectTeam = theTeam;
						int found = 0;
						int size = theTeam.getAutoList().listOfAutos.size();
						int i = 0;
						Auto A = new Auto();
						System.out.println("Boop30.5");
						while(i < size & found == 0) {
							A = theTeam.getAutoList().listOfAutos.get(i);
							System.out.println("Boop30.6");
							if(A.getAutoStartPos() == 4) {
								System.out.println("Boop30.7");
								if(A.getTotalControl() == conValue) {
									System.out.println("Boop30.8");
									if(A.getTotalSpecker() == speValue) {
										System.out.println("Boop30.9");
										found = 1;
									}else {
										System.out.println("Boop30.9");
										i++;
									}
								}else {
									System.out.println("Boop30.8");
									i++;
								}
							}else {
								System.out.println("Boop30.7");
								i++;
							}
						}
						
						addAutoStuff(selectedTeam, i);
					}
				}
			}
		} catch(Exception e) {
			System.out.println("Error: " + e);
		}
	}
}
