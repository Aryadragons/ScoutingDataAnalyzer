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
	
	public void addCharts(int team, double avgCy, double avgAmp, double avgSpe, double avgTrap, double avgCli, double avgHumAmpPostion, double avgHumScoPostion, double avgHumAmpSkill, double avgHumScoSkill, double avgHumAmpNotes, int timesAmp, int timesSco) {
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
			}
		} catch(Exception e) {
			System.out.println("Error: " + e);
		}
	}
}
