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
import javafx.scene.layout.VBox;

public class editPlayOffAlliancesTab extends GridPane implements EventHandler<ActionEvent>{
	private TextField team1TF;
	private TextField team2TF;
	private TextField team3TF;
	private TextField team4TF;
	private TextField team5TF;
	private TextField team6TF;
	private TextField team7TF;
	private TextField team8TF;
	private TextField team9TF;
	private TextField team10TF;
	private TextField team11TF;
	private TextField team12TF;
	private TextField team13TF;
	private TextField team14TF;
	private TextField team15TF;
	private TextField team16TF;
	private TextField team17TF;
	private TextField team18TF;
	private TextField team19TF;
	private TextField team20TF;
	private TextField team21TF;
	private TextField team22TF;
	private TextField team23TF;
	private TextField team24TF;
	private TextField team25TF;
	private TextField team26TF;
	private TextField team27TF;
	private TextField team28TF;
	private TextField team29TF;
	private TextField team30TF;
	private TextField team31TF;
	private TextField team32TF;
	private ComboBox<String> team1CB;
	private ComboBox<String> team2CB;
	private ComboBox<String> team3CB;
	private ComboBox<String> team4CB;
	private ComboBox<String> team5CB;
	private ComboBox<String> team6CB;
	private ComboBox<String> team7CB;
	private ComboBox<String> team8CB;
	private ComboBox<String> team9CB;
	private ComboBox<String> team10CB;
	private ComboBox<String> team11CB;
	private ComboBox<String> team12CB;
	private ComboBox<String> team13CB;
	private ComboBox<String> team14CB;
	private ComboBox<String> team15CB;
	private ComboBox<String> team16CB;
	private ComboBox<String> team17CB;
	private ComboBox<String> team18CB;
	private ComboBox<String> team19CB;
	private ComboBox<String> team20CB;
	private ComboBox<String> team21CB;
	private ComboBox<String> team22CB;
	private ComboBox<String> team23CB;
	private ComboBox<String> team24CB;
	private ComboBox<String> team25CB;
	private ComboBox<String> team26CB;
	private ComboBox<String> team27CB;
	private ComboBox<String> team28CB;
	private ComboBox<String> team29CB;
	private ComboBox<String> team30CB;
	private ComboBox<String> team31CB;
	private ComboBox<String> team32CB;
	private Button submitB;
	private List<Integer> listOfTeamNums;
	
	public editPlayOffAlliancesTab(PlayoffAlliances thePOA, List<Integer> importedListOfTeamNums) {
		listOfTeamNums = importedListOfTeamNums;
		team1TF = new TextField();
		team2TF = new TextField();
		team3TF = new TextField();
		team4TF = new TextField();
		team5TF = new TextField();
		team6TF = new TextField();
		team7TF = new TextField();
		team8TF = new TextField();
		team9TF = new TextField();
		team10TF = new TextField();
		team11TF = new TextField();
		team12TF = new TextField();
		team13TF = new TextField();
		team14TF = new TextField();
		team15TF = new TextField();
		team16TF = new TextField();
		team17TF = new TextField();
		team18TF = new TextField();
		team19TF = new TextField();
		team20TF = new TextField();
		team21TF = new TextField();
		team22TF = new TextField();
		team23TF = new TextField();
		team24TF = new TextField();
		team25TF = new TextField();
		team26TF = new TextField();
		team27TF = new TextField();
		team28TF = new TextField();
		team29TF = new TextField();
		team30TF = new TextField();
		team31TF = new TextField();
		team32TF = new TextField();
		team1CB = new ComboBox<String>();
		team2CB = new ComboBox<String>();
		team3CB = new ComboBox<String>();
		team4CB = new ComboBox<String>();
		team5CB = new ComboBox<String>();
		team6CB = new ComboBox<String>();
		team7CB = new ComboBox<String>();
		team8CB = new ComboBox<String>();
		team9CB = new ComboBox<String>();
		team10CB = new ComboBox<String>();
		team11CB = new ComboBox<String>();
		team12CB = new ComboBox<String>();
		team13CB = new ComboBox<String>();
		team14CB = new ComboBox<String>();
		team15CB = new ComboBox<String>();
		team16CB = new ComboBox<String>();
		team17CB = new ComboBox<String>();
		team18CB = new ComboBox<String>();
		team19CB = new ComboBox<String>();
		team20CB = new ComboBox<String>();
		team21CB = new ComboBox<String>();
		team22CB = new ComboBox<String>();
		team23CB = new ComboBox<String>();
		team24CB = new ComboBox<String>();
		team25CB = new ComboBox<String>();
		team26CB = new ComboBox<String>();
		team27CB = new ComboBox<String>();
		team28CB = new ComboBox<String>();
		team29CB = new ComboBox<String>();
		team30CB = new ComboBox<String>();
		team31CB = new ComboBox<String>();
		team32CB = new ComboBox<String>();
		//adding team list to them
		addComboBoxItems(team1CB);
		addComboBoxItems(team2CB);
		addComboBoxItems(team3CB);
		addComboBoxItems(team4CB);
		addComboBoxItems(team5CB);
		addComboBoxItems(team6CB);
		addComboBoxItems(team7CB);
		addComboBoxItems(team8CB);
		addComboBoxItems(team9CB);
		addComboBoxItems(team10CB);
		addComboBoxItems(team11CB);
		addComboBoxItems(team12CB);
		addComboBoxItems(team13CB);
		addComboBoxItems(team14CB);
		addComboBoxItems(team15CB);
		addComboBoxItems(team16CB);
		addComboBoxItems(team17CB);
		addComboBoxItems(team18CB);
		addComboBoxItems(team19CB);
		addComboBoxItems(team20CB);
		addComboBoxItems(team21CB);
		addComboBoxItems(team22CB);
		addComboBoxItems(team23CB);
		addComboBoxItems(team24CB);
		addComboBoxItems(team25CB);
		addComboBoxItems(team26CB);
		addComboBoxItems(team27CB);
		addComboBoxItems(team28CB);
		addComboBoxItems(team29CB);
		addComboBoxItems(team30CB);
		addComboBoxItems(team31CB);
		addComboBoxItems(team32CB);
		//Alliance 1 stuff
		BorderPane borderPaneA1 = new BorderPane();
		Label A1L = new Label("Allince 1:");
		A1L.setId("Title");
		borderPaneA1.setTop(A1L);
		VBox A1LabelVBox = new VBox(5);
		Label A1LT1 = new Label("Team 1:   ");
		Label A1LT2 = new Label("Team 2;   ");
		Label A1LT3 = new Label("Team 3:   ");
		Label A1LT4 = new Label("Team 4:   ");
		A1LabelVBox.getChildren().addAll(A1LT1, A1LT2, A1LT3, A1LT4);
		borderPaneA1.setLeft(A1LabelVBox);
		VBox A1TFVBox = new VBox(5);
		A1TFVBox.getChildren().addAll(team1TF, team2TF, team3TF, team25TF);
		borderPaneA1.setCenter(A1TFVBox);
		VBox A1CBVBox = new VBox(5);
		A1CBVBox.getChildren().addAll(team1CB, team2CB, team3CB, team25CB);
		borderPaneA1.setRight(A1CBVBox);
		//Alliance 2 stuff
		BorderPane borderPaneA2 = new BorderPane();
		Label A2L = new Label("Allince 1:");
		A2L.setId("Title");
		borderPaneA2.setTop(A2L);
		VBox A2LabelVBox = new VBox(5);
		Label A2LT1 = new Label("Team 1:   ");
		Label A2LT2 = new Label("Team 2;   ");
		Label A2LT3 = new Label("Team 3:   ");
		Label A2LT4 = new Label("Team 4:   ");
		A2LabelVBox.getChildren().addAll(A2LT1, A2LT2, A2LT3, A2LT4);
		borderPaneA2.setLeft(A2LabelVBox);
		VBox A2TFVBox = new VBox(5);
		A2TFVBox.getChildren().addAll(team4TF, team5TF, team6TF, team26TF);
		borderPaneA2.setCenter(A2TFVBox);
		VBox A2CBVBox = new VBox(5);
		A2CBVBox.getChildren().addAll(team4CB, team5CB, team6CB, team26CB);
		borderPaneA2.setRight(A2CBVBox);
		//Alliance 3 stuff
		BorderPane borderPaneA3 = new BorderPane();
		Label A3L = new Label("Allince 1:");
		A3L.setId("Title");
		borderPaneA3.setTop(A3L);
		VBox A3LabelVBox = new VBox(5);
		Label A3LT1 = new Label("Team 1:   ");
		Label A3LT2 = new Label("Team 2;   ");
		Label A3LT3 = new Label("Team 3:   ");
		Label A3LT4 = new Label("Team 4:   ");
		A3LabelVBox.getChildren().addAll(A3LT1, A3LT2, A3LT3, A3LT4);
		borderPaneA3.setLeft(A3LabelVBox);
		VBox A3TFVBox = new VBox(5);
		A3TFVBox.getChildren().addAll(team7TF, team8TF, team9TF, team27TF);
		borderPaneA3.setCenter(A3TFVBox);
		VBox A3CBVBox = new VBox(5);
		A3CBVBox.getChildren().addAll(team7CB, team8CB, team9CB, team27CB);
		borderPaneA3.setRight(A3CBVBox);
		//Alliance 4 stuff
		BorderPane borderPaneA4 = new BorderPane();
		Label A4L = new Label("Allince 1:");
		A4L.setId("Title");
		borderPaneA4.setTop(A4L);
		this.add(new Label("Team 1:   "), 1, 6);
		this.add(new Label("Team 2;   "), 2, 6);
		this.add(new Label("Team 3:   "), 3, 6);
		this.add(new Label("Team 4:   "), 4, 6);
		//Alliance 5 stuff
		BorderPane borderPaneA5 = new BorderPane();
		Label A5L = new Label("Allince 1:");
		A5L.setId("Title");
		borderPaneA5.setTop(A5L);
		this.add(new Label("Team 1:   "), 1, 8);
		this.add(new Label("Team 2;   "), 2, 8);
		this.add(new Label("Team 3:   "), 3, 8);
		this.add(new Label("Team 4:   "), 4, 8);
		//Alliance 6 stuff
		BorderPane borderPaneA6 = new BorderPane();
		Label A6L = new Label("Allince 1:");
		A6L.setId("Title");
		borderPaneA6.setTop(A6L);
		this.add(new Label("Team 1:   "), 1, 10);
		this.add(new Label("Team 2;   "), 2, 10);
		this.add(new Label("Team 3:   "), 3, 10);
		this.add(new Label("Team 4:   "), 4, 10);
		//Alliance 7 stuff
		BorderPane borderPaneA7 = new BorderPane();
		Label A7L = new Label("Allince 1:");
		A7L.setId("Title");
		borderPaneA7.setTop(A7L);
		this.add(new Label("Team 1:   "), 1, 12);
		this.add(new Label("Team 2;   "), 2, 12);
		this.add(new Label("Team 3:   "), 3, 12);
		this.add(new Label("Team 4:   "), 4, 12);
		//Alliance 8 stuff
		BorderPane borderPaneA8 = new BorderPane();
		Label A8L = new Label("Allince 1:");
		A8L.setId("Title");
		borderPaneA8.setTop(A8L);
		this.add(new Label("Team 1:   "), 1, 14);
		this.add(new Label("Team 2;   "), 2, 14);
		this.add(new Label("Team 3:   "), 3, 14);
		this.add(new Label("Team 4:   "), 4, 14);
	}
	
	private void addComboBoxItems(ComboBox<String> theCB) {
		String teamNumS;
		for (int i = 0; i < listOfTeamNums.size(); i++) {
			if (listOfTeamNums.get(i) != null) {
				teamNumS = Integer.toString(listOfTeamNums.get(i));
				theCB.getItems().add(teamNumS);
			}
		}
	}

	@Override
	public void handle(ActionEvent event) {
		try {
			if (event.getSource() == submitSelectB) {
				String strSelect = selectAllianceCB.getSelectionModel().getSelectedItem();
				if (strSelect.compareTo("1") == 0) {
					allianceSelected = 1;
				}
				if (strSelect.compareTo("2") == 0) {
					allianceSelected = 2;
				}
				if (strSelect.compareTo("3") == 0) {
					allianceSelected = 3;
				}
				if (strSelect.compareTo("4") == 0) {
					allianceSelected = 4;
				}
				if (strSelect.compareTo("5") == 0) {
					allianceSelected = 5;
				}
				if (strSelect.compareTo("6") == 0) {
					allianceSelected = 6;
				}
				if (strSelect.compareTo("7") == 0) {
					allianceSelected = 7;
				}
				if (strSelect.compareTo("8") == 0) {
					allianceSelected = 8;
				}
				this.add(new Label("Alliance: " + allianceSelected + " "), 0, 1);
			}
		} catch(Exception e) {
			System.out.println("Error: " + e);
		}
		
	}
}
