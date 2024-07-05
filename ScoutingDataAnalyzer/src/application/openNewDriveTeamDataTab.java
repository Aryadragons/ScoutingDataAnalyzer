package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class openNewDriveTeamDataTab extends GridPane{
	
	private Button goForReplaceB;
	private Button goForAddB;
	private Button submitReB;
	private Button submitAddB;
	private TextField fileNameReTF;
	private TextField fileNameAddTF;
	
	public openNewDriveTeamDataTab() {
		this.add(new Label("Open New Data That Will Replace All Pit Data"), 0, 0);
		this.add(new Label("Choosen File Name"), 0, 1);
		fileNameReTF = new TextField();
		this.add(fileNameReTF, 1, 1);
		this.add(new Label("Open New Data That Will Start Or Add On To Current Pit Data"), 0, 2);
		this.add(new Label("Choosen File Name"), 0, 3);
		fileNameAddTF = new TextField();
		this.add(fileNameAddTF, 1, 3);
		goForReplaceB = new Button("Go");
		goForAddB = new Button("Go");
		submitReB = new Button("Submit");
		submitAddB = new Button("Submit");
		this.add(goForReplaceB, 1, 0);
		this.add(goForAddB, 1, 2);
		this.add(submitReB, 2, 1);
		this.add(submitAddB, 2, 3);
	}
}
