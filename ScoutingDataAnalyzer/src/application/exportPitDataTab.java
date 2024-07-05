package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class exportPitDataTab extends GridPane{
	private Button doItB;
	
	public exportPitDataTab() {
		this.add(new Label("Export Pit Data In A CSV File To Your Device  "), 0, 0);
		doItB = new Button("Do It!");
		this.add(doItB, 1, 0);
	}	
}
