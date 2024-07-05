package application;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class homePageTab extends GridPane{
	
	
	
	public homePageTab() {
		this.add(new Label("This Program is Design To Data Analyzer For Scouting Data From FRC's 2024 Game"), 0, 0);
		this.add(new Label("Search Features:"), 0, 1);
		this.add(new Label("The Search Features are for looking up speific Items in your Data and giving you a report on them"), 0, 2);
		this.add(new Label("Compare Features:"), 0, 3);
		this.add(new Label("The Compare Features are for comparing different teams, allinces, or autos and giving you a report of its findings"), 0, 4);
		this.add(new Label("Find Best Features:"), 0, 5);
		this.add(new Label("The Find Best Features are for giving an order list of the teams, allinces, or autos based on your sorting requirments"), 0, 6);
		this.add(new Label("Create Features:"), 0, 7);
		this.add(new Label("The Create Features are for creating an hyapethical situation or plan and seeing how effective it would be"), 0, 8);
		this.add(new Label("Open Features:"), 0, 9);
		this.add(new Label("The Open Features are for bring in data via files from your computer"), 0, 10);
		this.add(new Label("Edit Features:"), 0, 11);
		this.add(new Label("The Edit Features are for changing small amouts of data, or added/deleting a few peice of data escally Driveteam Comments"), 0, 12);
		this.add(new Label("Export Features:"), 0, 13);
		this.add(new Label("The Export features is for editing a the inputed file with all edits you have made to the data so you won't ha e to re enter them in"), 0, 14);
	}
}
