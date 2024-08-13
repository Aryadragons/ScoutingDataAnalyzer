package application;

import java.util.List;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class searchMatchTab extends GridPane implements EventHandler<ActionEvent>{
	
	private Button submitNonB;
	private Button submitPlayB;
	private ComboBox<String> teamCB;
	private TextField matchNumTF;
	private ComboBox<String> isPracCB;
	private ComboBox<String> isReplayCB;
	private List<Integer> listOfTeamNums;
	
	public searchMatchTab(List<Integer> importedListOfTeamNums, boolean imIsPlayoff) {
		listOfTeamNums = importedListOfTeamNums;
		if(imIsPlayoff == false) {
			Label selTeamL = new Label("Select Team:  ");
			Label selMatchNumL = new Label("Select Match Number:  ");
			Label selPracMatchL = new Label("Is It a Practice Match?");
			Label selRePlayL = new Label("Is It a Match Replay");
			submitNonB = new Button("Submit");
			submitNonB.setOnAction(this);
			BorderPane selTeamBP = new BorderPane();
			BorderPane selMatchNumBP = new BorderPane();
			BorderPane selPracBP = new BorderPane();
			BorderPane selRePlayBP = new BorderPane();
			teamCB = new ComboBox<String>();
			addComboBoxItems();
			matchNumTF = new TextField();
			isPracCB = new ComboBox<String>();
			isPracCB.getItems().addAll("Yes", "No");
			isReplayCB = new ComboBox<String>();
			isReplayCB.getItems().addAll("Yes", "No");
			selTeamBP.setTop(selTeamL);
			selMatchNumBP.setTop(selMatchNumL);
			selPracBP.setTop(selPracMatchL);
			selRePlayBP.setTop(selRePlayL);
			selTeamBP.setTop(teamCB);
			selMatchNumBP.setTop(matchNumTF);
			selPracBP.setTop(isPracCB);
			selRePlayBP.setTop(isReplayCB);
			HBox selHB = new HBox(5);
			selHB.getChildren().addAll(selTeamBP, selMatchNumBP, selPracBP, selRePlayBP);
			this.add(new Label("    "), 0, 0);
			this.add(new Label("    "), 2, 0);
			this.add(selHB, 1, 1);
			this.add(submitNonB, 1, 3);
		}else {
			Label selTeamL = new Label("Select Team:  ");
			Label selMatchNumL = new Label("Select Match Number:  ");
			Label selRePlayL = new Label("Is It a Match Replay");
			submitPlayB = new Button("Submit");
			submitPlayB.setOnAction(this);
			BorderPane selTeamBP = new BorderPane();
			BorderPane selMatchNumBP = new BorderPane();
			BorderPane selRePlayBP = new BorderPane();
			teamCB = new ComboBox<String>();
			addComboBoxItems();
			matchNumTF = new TextField();
			isReplayCB = new ComboBox<String>();
			isReplayCB.getItems().addAll("Yes", "No");
			selTeamBP.setTop(selTeamL);
			selMatchNumBP.setTop(selMatchNumL);
			selRePlayBP.setTop(selRePlayL);
			selTeamBP.setTop(teamCB);
			selMatchNumBP.setTop(matchNumTF);
			selRePlayBP.setTop(isReplayCB);
			HBox selHB = new HBox(5);
			selHB.getChildren().addAll(selTeamBP, selMatchNumBP, selRePlayBP);
			this.add(new Label("    "), 0, 0);
			this.add(new Label("    "), 2, 0);
			this.add(selHB, 1, 1);
			this.add(submitPlayB, 1, 3);
		}
	}
	
	private void addComboBoxItems() {
		String teamNumS;
		for (int i = 0; i < listOfTeamNums.size(); i++) {
			if (listOfTeamNums.get(i) != null) {
				teamNumS = Integer.toString(listOfTeamNums.get(i));
				teamCB.getItems().add(teamNumS);
			}
		}
	}

	@Override
	public void handle(ActionEvent event) {
		try {
			if(event.getSource() == submitNonB){
				this.getChildren().clear();
			}
			if(event.getSource() == submitPlayB) {
				this.getChildren().clear();
			}
		} catch(Exception e) {
			System.out.println("Error: " + e);
		}
		
	}
}
