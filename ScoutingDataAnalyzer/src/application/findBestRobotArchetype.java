package application;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class findBestRobotArchetype extends GridPane{
	
	private ComboBox<String> listArchetypesCB;
	private Button submitB;
	
	public findBestRobotArchetype() {
		this.add(new Label("Select Robot Archatype"), 0, 0);
		listArchetypesCB = new ComboBox<String>();
		listArchetypesCB.getItems().addAll("Amp Bot", "Speaker Bot", "Defense Bot");
		this.add(listArchetypesCB, 1, 0);
		submitB = new Button("Submit");
		this.add(submitB, 2, 0);
	}
}
