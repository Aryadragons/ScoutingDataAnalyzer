package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class editScDataTab extends GridPane {
	
	private Button doThisAddB;
	private Button doThisEditB;
	private Button doThisDelB;
	
	public editScDataTab() {
		this.add(new Label("Manually Add New Scouting Data"), 0, 0);
		this.add(new Label("Edit Scouting Data"), 0, 1);
		this.add(new Label("Delete Part of Scouting Data"), 0, 2);
		doThisAddB = new Button("Do This!");
		doThisEditB = new Button("Do This!");
		doThisDelB = new Button("Do This!");
		this.add(doThisAddB, 1, 0);
		this.add(doThisEditB, 1, 1);
		this.add(doThisDelB, 1, 2);
		for (int i = 0; i < 23; i++) {
			this.add(new Label(""), 0, i);
		}
	}
}
