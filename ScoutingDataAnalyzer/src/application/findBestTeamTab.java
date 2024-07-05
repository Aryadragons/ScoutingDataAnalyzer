package application;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class findBestTeamTab extends GridPane {
	
	private ComboBox<String> firstMetCB;
	private ComboBox<String> secondMetCB;
	private ComboBox<String> thirdMetCB;
	private ComboBox<String> fourthMetCB;
	private ComboBox<String> fifthMetCB;
	private Button submitB;
	
	public findBestTeamTab() {
		this.add(new Label("First Meterict to Sort on"), 0, 0);
		this.add(new Label("Second Meterict to Sort on"), 1, 0);
		this.add(new Label("Third Meterict to Sort on"), 2, 0);
		this.add(new Label("Fourth Meterict to Sort on"), 3, 0);
		this.add(new Label("Fifth Meterict to Sort on"), 4, 0);
		firstMetCB = new ComboBox<String>();
		firstMetCB.getItems().addAll("Total Cycles", "Auto", "Specker Cycles", "Amp Cycles");
		secondMetCB = new ComboBox<String>();
		secondMetCB.getItems().addAll("Total Cycles", "Auto", "Specker Cycles", "Amp Cycles");
		thirdMetCB = new ComboBox<String>();
		thirdMetCB.getItems().addAll("Total Cycles", "Auto", "Specker Cycles", "Amp Cycles");
		fourthMetCB = new ComboBox<String>();
		fourthMetCB.getItems().addAll("Total Cycles", "Auto", "Specker Cycles", "Amp Cycles");
		fifthMetCB = new ComboBox<String>();
		fifthMetCB.getItems().addAll("Total Cycles", "Auto", "Specker Cycles", "Amp Cycles");
		this.add(firstMetCB, 0, 1);
		this.add(secondMetCB, 1, 1);
		this.add(thirdMetCB, 2, 1);
		this.add(fourthMetCB, 3, 1);
		this.add(fifthMetCB, 4, 1);
		//Adding in the Button
		submitB = new Button("Submit");
		this.add(submitB, 5, 1);
	}
}
