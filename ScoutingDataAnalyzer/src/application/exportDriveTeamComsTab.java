package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class exportDriveTeamComsTab extends GridPane{
	private Button doItB;
	
	public exportDriveTeamComsTab() {
		this.add(new Label("Export Drive Team Comments In A CSV File To Your Device  "), 0, 0);
		doItB = new Button("Do It!");
		this.add(doItB, 1, 0);
	}	
}
