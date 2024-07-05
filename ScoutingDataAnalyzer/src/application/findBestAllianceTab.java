package application;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class findBestAllianceTab extends GridPane {
	
	private ComboBox<String> firstMetCB;
	private ComboBox<String> secondMetCB;
	private ComboBox<String> thirdMetCB;
	private ComboBox<String> fourthMetCB;
	private ComboBox<String> fifthMetCB;
	private Button submitB;
	private TextField firstAllinceTF;
	private TextField secondAllinceTF;
	private TextField thirdAllinceTF;
	private TextField forthAllinceTF;
	private TextField fifthAllinceTF;
	private TextField sixthAllinceTF;
	private TextField seventhAllinceTF;
	private TextField eighthAllinceTF;
	
	public findBestAllianceTab() {
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
		//adding Text fields
		this.add(new Label("List:"), 0, 2);
		firstAllinceTF = new TextField();
		secondAllinceTF = new TextField();
		thirdAllinceTF = new TextField();
		forthAllinceTF = new TextField();
		fifthAllinceTF = new TextField();
		sixthAllinceTF = new TextField();
		seventhAllinceTF = new TextField();
		eighthAllinceTF = new TextField();
		this.add(firstAllinceTF, 0, 3);
		this.add(secondAllinceTF, 0, 4);
		this.add(thirdAllinceTF, 0, 5);
		this.add(forthAllinceTF, 0, 6);
		this.add(fifthAllinceTF, 0, 7);
		this.add(sixthAllinceTF, 0, 8);
		this.add(seventhAllinceTF, 0, 9);
		this.add(eighthAllinceTF, 0, 10);
	}
}
