package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class editDriveTeamDataTab extends GridPane{
	private Button doThisAddB;
	private Button doThisEditB;
	private Button doThisDelB;
	
	public editDriveTeamDataTab() {
		this.add(new Label("Manually Add New Drive Team Data"), 0, 0);
		this.add(new Label("Edit Drive Team Data"), 0, 1);
		this.add(new Label("Delete Part of Drive Team Data"), 0, 2);
		doThisAddB = new Button("Do This!");
		doThisEditB = new Button("Do This!");
		doThisDelB = new Button("Do This!");
		this.add(doThisAddB, 1, 0);
		this.add(doThisEditB, 1, 1);
		this.add(doThisDelB, 1, 2);
	}
}
