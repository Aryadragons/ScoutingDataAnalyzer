package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class exportScDataTab extends GridPane{
	
	private Button doItB;
	
	public exportScDataTab() {
		this.add(new Label("Export Scouting Data In A CSV File To Your Device  "), 0, 0);
		doItB = new Button("Do It!");
		this.add(doItB, 1, 0);
		for (int i = 0; i < 23; i++) {
			this.add(new Label(""), 0, i);
		}
	}	
}
