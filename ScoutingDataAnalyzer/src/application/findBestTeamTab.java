package application;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class findBestTeamTab extends GridPane {
	
	private ComboBox<String> firstMetCB;
	private ComboBox<String> secondMetCB;
	private ComboBox<String> thirdMetCB;
	private ComboBox<String> fourthMetCB;
	private ComboBox<String> fifthMetCB;
	private ComboBox<String> range1CB;
	private ComboBox<String> range2CB;
	private ComboBox<String> range3CB;
	private ComboBox<String> range4CB;
	private ComboBox<String> range5CB;
	private ComboBox<String> numOfTeamsCB;
	private Button submitB;
	
	public findBestTeamTab() {
		Label mect1L = new Label("First Meterict to Sort on");
		Label mect2L = new Label("Second Meterict to Sort on");
		Label mect3L = new Label("Third Meterict to Sort on");
		Label mect4L = new Label("Fourth Meterict to Sort on");
		Label mect5L = new Label("Fifth Meterict to Sort on");
		mect1L.setId("smallTitle");
		mect2L.setId("smallTitle");
		mect3L.setId("smallTitle");
		mect4L.setId("smallTitle");
		mect5L.setId("smallTitle");
		firstMetCB = new ComboBox<String>();
		firstMetCB.getItems().addAll("Cycles", "Auto", "Speckers", "Amp", "Trap", "Climb", "High Notes");
		secondMetCB = new ComboBox<String>();
		secondMetCB.getItems().addAll("Cycles", "Auto", "Specker", "Amp", "Trap", "Climb", "High Notes");
		thirdMetCB = new ComboBox<String>();
		thirdMetCB.getItems().addAll("Cycles", "Auto", "Specker", "Amp", "Trap", "Climb", "High Notes");
		fourthMetCB = new ComboBox<String>();
		fourthMetCB.getItems().addAll("Cycles", "Auto", "Specker", "Amp", "Trap", "Climb", "High Notes");
		fifthMetCB = new ComboBox<String>();
		fifthMetCB.getItems().addAll("Cycles", "Auto", "Specker", "Amp", "Trap", "Climb", "High Notes");
		BorderPane mect1BP = new BorderPane();
		BorderPane mect2BP = new BorderPane();
		BorderPane mect3BP = new BorderPane();
		BorderPane mect4BP = new BorderPane();
		BorderPane mect5BP = new BorderPane();
		mect1BP.setTop(mect1L);
		mect2BP.setTop(mect2L);
		mect3BP.setTop(mect3L);
		mect4BP.setTop(mect4L);
		mect5BP.setTop(mect5L);
		mect1BP.setCenter(firstMetCB);
		mect2BP.setCenter(secondMetCB);
		mect3BP.setCenter(thirdMetCB);
		mect4BP.setCenter(fourthMetCB);
		mect5BP.setCenter(fifthMetCB);
		mect1BP.setId("findBestTeamSelMectBP");
		mect2BP.setId("findBestTeamSelMectBP");
		mect3BP.setId("findBestTeamSelMectBP");
		mect4BP.setId("findBestTeamSelMectBP");
		mect5BP.setId("findBestTeamSelMectBP");
		this.add(new Label("    "), 0, 0);
		this.add(new Label("    "), 2, 0);
		this.add(new Label("    "), 4, 0);
		this.add(new Label("    "), 6, 0);
		this.add(new Label("    "), 8, 0);
		this.add(new Label("    "), 0, 2);
		this.add(new Label("    "), 0, 4);
		this.add(mect1BP, 1, 1);
		this.add(mect2BP, 3, 1);
		this.add(mect3BP, 5, 1);
		this.add(mect4BP, 7, 1);
		this.add(mect5BP, 9, 1);
		Label range1L = new Label("Range of tieing for stat 1");
		Label range2L = new Label("Range of tieing for stat 2");
		Label range3L = new Label("Range of tieing for stat 3");
		Label range4L = new Label("Range of tieing for stat 4");
		Label range5L = new Label("Range of tieing for stat 5");
		range1L.setId("smallTitle");
		range2L.setId("smallTitle");
		range3L.setId("smallTitle");
		range4L.setId("smallTitle");
		range5L.setId("smallTitle");
		range1CB = new ComboBox<String>();
		range2CB = new ComboBox<String>();
		range3CB = new ComboBox<String>();
		range4CB = new ComboBox<String>();
		range5CB = new ComboBox<String>();
		range1CB.getItems().addAll("0.2", "0.5", "1", "2", "3", "4", "5");
		range2CB.getItems().addAll("0.2", "0.5", "1", "2", "3", "4", "5");
		range3CB.getItems().addAll("0.2", "0.5", "1", "2", "3", "4", "5");
		range4CB.getItems().addAll("0.2", "0.5", "1", "2", "3", "4", "5");
		range5CB.getItems().addAll("0.2", "0.5", "1", "2", "3", "4", "5");
		BorderPane range1BP = new BorderPane();
		BorderPane range2BP = new BorderPane();
		BorderPane range3BP = new BorderPane();
		BorderPane range4BP = new BorderPane();
		BorderPane range5BP = new BorderPane();
		range1BP.setTop(range1L);
		range2BP.setTop(range2L);
		range3BP.setTop(range3L);
		range4BP.setTop(range4L);
		range5BP.setTop(range5L);
		range1BP.setCenter(range1CB);
		range2BP.setCenter(range2CB);
		range3BP.setCenter(range3CB);
		range4BP.setCenter(range4CB);
		range5BP.setCenter(range5CB);
		range1BP.setId("findBestTeamSelRangeBP");
		range2BP.setId("findBestTeamSelRangeBP");
		range3BP.setId("findBestTeamSelRangeBP");
		range4BP.setId("findBestTeamSelRangeBP");
		range5BP.setId("findBestTeamSelRangeBP");
		Label numOfTeamsL = new Label("How Many teams");
		numOfTeamsL.setId("smallTitle");
		numOfTeamsCB = new ComboBox<String>();
		numOfTeamsCB
		//Adding in the Button
		submitB = new Button("Submit");
		this.add(submitB, 1, 5);
	}
	
	public void findBestTeams(int numOfTeams) {
		
	}
}
