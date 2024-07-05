package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class compareTeamsTab extends GridPane implements EventHandler<ActionEvent>{
	
	private TextField howManyTeamsTF;
	private Button submitHowManyB;
	private Button submitTeamsB;

	
	
	public compareTeamsTab() {
		this.add(new Label("How many Teams Do you want to compare"), 0, 0);
		howManyTeamsTF = new TextField();
		this.add(howManyTeamsTF, 0, 1);
		submitHowManyB = new Button("Submit");
		submitHowManyB.setOnAction(this);
		this.add(submitHowManyB, 1, 1);
		this.add(new Label("Test"), 0, 2);
	}

	@Override
	public void handle(ActionEvent event) {
		try {
			if (event.getSource() == submitHowManyB) {
				String howManyStr = howManyTeamsTF.getText();
				int howManyInt = Integer.parseInt(howManyStr);
				for(int i = 0; i < howManyInt; i++) {
					this.add(new Label("Select Teams" + (i + 1)), (i + 1), 2);
				}
				submitTeamsB = new Button("Submit");
				this.add(submitTeamsB, howManyInt, 2);
			}
		} catch (Exception e) {
			Alert addcomA = new Alert(Alert.AlertType.INFORMATION);
			addcomA.setTitle("Error");
			addcomA.setContentText("Error with inputed values: " + e);
			addcomA.showAndWait();
		}
		
	}
}
