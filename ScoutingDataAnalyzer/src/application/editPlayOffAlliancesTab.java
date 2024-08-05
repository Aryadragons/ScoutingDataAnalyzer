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
		submitB = new Button("Submit");
		this.add(submitB, 0, 3);
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
		//alliance 1
		int teamNum1 = thePOA.getAlliance1().getTeam1().getTeamNum();
		if(teamNum1 == 0) {
			team1TF.setText(Integer.toString(teamNum1));
		}
		int teamNum2 = thePOA.getAlliance1().getTeam2().getTeamNum();
		if(teamNum2 == 0) {
			team2TF.setText(Integer.toString(teamNum2));
		}
		int teamNum3 = thePOA.getAlliance1().getTeam3().getTeamNum();
		if(teamNum3 == 0) {
			team3TF.setText(Integer.toString(teamNum3));
		}
		int teamNum25 = thePOA.getAlliance1().getTeam4().getTeamNum();
		if(teamNum25 == 0) {
			team25TF.setText(Integer.toString(teamNum25));
		}
		//alliance 2
		int teamNum4 = thePOA.getAlliance2().getTeam1().getTeamNum();
		if(teamNum4 == 0) {
			team4TF.setText(Integer.toString(teamNum4));
		}
		int teamNum5 = thePOA.getAlliance2().getTeam2().getTeamNum();
		if(teamNum5 == 0) {
			team5TF.setText(Integer.toString(teamNum5));
		}
		int teamNum6 = thePOA.getAlliance2().getTeam3().getTeamNum();
		if(teamNum6 == 0) {
			team6TF.setText(Integer.toString(teamNum6));
		}
		int teamNum26 = thePOA.getAlliance2().getTeam4().getTeamNum();
		if(teamNum26 == 0) {
			team26TF.setText(Integer.toString(teamNum26));
		}
		//alliance 3
		int teamNum7 = thePOA.getAlliance3().getTeam1().getTeamNum();
		if(teamNum7 == 0) {
			team7TF.setText(Integer.toString(teamNum7));
		}
		int teamNum8 = thePOA.getAlliance3().getTeam2().getTeamNum();
		if(teamNum8 == 0) {
			team8TF.setText(Integer.toString(teamNum8));
		}
		int teamNum9 = thePOA.getAlliance3().getTeam3().getTeamNum();
		if(teamNum9 == 0) {
			team9TF.setText(Integer.toString(teamNum9));
		}
		int teamNum27 = thePOA.getAlliance3().getTeam4().getTeamNum();
		if(teamNum27 == 0) {
			team27TF.setText(Integer.toString(teamNum27));
		}
		//alliance 4
		int teamNum10 = thePOA.getAlliance4().getTeam1().getTeamNum();
		if(teamNum10 == 0) {
			team10TF.setText(Integer.toString(teamNum10));
		}
		int teamNum11 = thePOA.getAlliance4().getTeam2().getTeamNum();
		if(teamNum11 == 0) {
			team11TF.setText(Integer.toString(teamNum11));
		}
		int teamNum12 = thePOA.getAlliance4().getTeam3().getTeamNum();
		if(teamNum12== 0) {
			team12TF.setText(Integer.toString(teamNum12));
		}
		int teamNum28 = thePOA.getAlliance4().getTeam4().getTeamNum();
		if(teamNum28 == 0) {
			team28TF.setText(Integer.toString(teamNum28));
		}
		//alliance 5
		int teamNum13 = thePOA.getAlliance5().getTeam1().getTeamNum();
		if(teamNum13 == 0) {
			team13TF.setText(Integer.toString(teamNum11));
		}
		int teamNum14 = thePOA.getAlliance5().getTeam2().getTeamNum();
		if(teamNum14 == 0) {
			team14TF.setText(Integer.toString(teamNum14));
		}
		int teamNum15 = thePOA.getAlliance5().getTeam3().getTeamNum();
		if(teamNum15== 0) {
			team15TF.setText(Integer.toString(teamNum15));
		}
		int teamNum29 = thePOA.getAlliance5().getTeam4().getTeamNum();
		if(teamNum29 == 0) {
			team29TF.setText(Integer.toString(teamNum29));
		}
		//alliance 6
		int teamNum16 = thePOA.getAlliance6().getTeam1().getTeamNum();
		if(teamNum16 == 0) {
			team16TF.setText(Integer.toString(teamNum16));
		}
		int teamNum17 = thePOA.getAlliance6().getTeam2().getTeamNum();
		if(teamNum17 == 0) {
			team17TF.setText(Integer.toString(teamNum17));
		}
		int teamNum18 = thePOA.getAlliance6().getTeam3().getTeamNum();
		if(teamNum18== 0) {
			team18TF.setText(Integer.toString(teamNum18));
		}
		int teamNum30 = thePOA.getAlliance6().getTeam4().getTeamNum();
		if(teamNum30 == 0) {
			team30TF.setText(Integer.toString(teamNum30));
		}
		//alliance 7
		int teamNum19 = thePOA.getAlliance7().getTeam1().getTeamNum();
		if(teamNum19 == 0) {
			team19TF.setText(Integer.toString(teamNum19));
		}
		int teamNum20 = thePOA.getAlliance7().getTeam2().getTeamNum();
		if(teamNum20 == 0) {
			team20TF.setText(Integer.toString(teamNum20));
		}
		int teamNum21 = thePOA.getAlliance7().getTeam3().getTeamNum();
		if(teamNum21== 0) {
			team21TF.setText(Integer.toString(teamNum21));
		}
		int teamNum31 = thePOA.getAlliance7().getTeam4().getTeamNum();
		if(teamNum31 == 0) {
			team31TF.setText(Integer.toString(teamNum31));
		}
		//alliance 8
		int teamNum22 = thePOA.getAlliance8().getTeam1().getTeamNum();
		if(teamNum22 == 0) {
			team22TF.setText(Integer.toString(teamNum22));
		}
		int teamNum23 = thePOA.getAlliance8().getTeam2().getTeamNum();
		if(teamNum23 == 0) {
			team23TF.setText(Integer.toString(teamNum23));
		}
		int teamNum24 = thePOA.getAlliance8().getTeam3().getTeamNum();
		if(teamNum24== 0) {
			team24TF.setText(Integer.toString(teamNum24));
		}
		int teamNum32 = thePOA.getAlliance8().getTeam4().getTeamNum();
		if(teamNum32 == 0) {
			team32TF.setText(Integer.toString(teamNum32));
		}
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
		A1L.setId("TitleLabel");
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
		borderPaneA1.setId("BPA1");
		//Alliance 2 stuff
		BorderPane borderPaneA2 = new BorderPane();
		Label A2L = new Label("Allince 1:");
		A2L.setId("TitleLabel");
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
		borderPaneA2.setId("BPA2");
		//Alliance 3 stuff
		BorderPane borderPaneA3 = new BorderPane();
		Label A3L = new Label("Allince 1:");
		A3L.setId("TitleLabel");
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
		borderPaneA3.setId("BPA3");
		//Alliance 4 stuff
		BorderPane borderPaneA4 = new BorderPane();
		Label A4L = new Label("Allince 1:");
		A4L.setId("TitleLabel");
		borderPaneA4.setTop(A4L);
		VBox A4LabelVBox = new VBox(5);
		Label A4LT1 = new Label("Team 1:   ");
		Label A4LT2 = new Label("Team 2;   ");
		Label A4LT3 = new Label("Team 3:   ");
		Label A4LT4 = new Label("Team 4:   ");
		A4LabelVBox.getChildren().addAll(A4LT1, A4LT2, A4LT3, A4LT4);
		borderPaneA4.setLeft(A4LabelVBox);
		VBox A4TFVBox = new VBox(5);
		A4TFVBox.getChildren().addAll(team10TF, team11TF, team12TF, team28TF);
		borderPaneA4.setCenter(A4TFVBox);
		VBox A4CBVBox = new VBox(5);
		A4CBVBox.getChildren().addAll(team10CB, team11CB, team12CB, team28CB);
		borderPaneA4.setRight(A4CBVBox);
		borderPaneA4.setId("BPA4");
		//Alliance 5 stuff
		BorderPane borderPaneA5 = new BorderPane();
		Label A5L = new Label("Allince 1:");
		A5L.setId("TitleLabel");
		borderPaneA5.setTop(A5L);
		VBox A5LabelVBox = new VBox(5);
		Label A5LT1 = new Label("Team 1:   ");
		Label A5LT2 = new Label("Team 2;   ");
		Label A5LT3 = new Label("Team 3:   ");
		Label A5LT4 = new Label("Team 4:   ");
		A5LabelVBox.getChildren().addAll(A5LT1, A5LT2, A5LT3, A5LT4);
		borderPaneA5.setLeft(A5LabelVBox);
		VBox A5TFVBox = new VBox(5);
		A5TFVBox.getChildren().addAll(team13TF, team14TF, team15TF, team29TF);
		borderPaneA5.setCenter(A5TFVBox);
		VBox A5CBVBox = new VBox(5);
		A5CBVBox.getChildren().addAll(team13CB, team14CB, team15CB, team29CB);
		borderPaneA5.setRight(A5CBVBox);
		borderPaneA5.setId("BPA5");
		//Alliance 6 stuff
		BorderPane borderPaneA6 = new BorderPane();
		Label A6L = new Label("Allince 1:");
		A6L.setId("TitleLabel");
		borderPaneA6.setTop(A6L);
		VBox A6LabelVBox = new VBox(5);
		Label A6LT1 = new Label("Team 1:   ");
		Label A6LT2 = new Label("Team 2;   ");
		Label A6LT3 = new Label("Team 3:   ");
		Label A6LT4 = new Label("Team 4:   ");
		A6LabelVBox.getChildren().addAll(A6LT1, A6LT2, A6LT3, A6LT4);
		borderPaneA6.setLeft(A6LabelVBox);
		VBox A6TFVBox = new VBox(5);
		A6TFVBox.getChildren().addAll(team16TF, team17TF, team18TF, team30TF);
		borderPaneA6.setCenter(A6TFVBox);
		VBox A6CBVBox = new VBox(5);
		A6CBVBox.getChildren().addAll(team16CB, team17CB, team18CB, team30CB);
		borderPaneA6.setRight(A6CBVBox);
		borderPaneA6.setId("BPA6");
		//Alliance 7 stuff
		BorderPane borderPaneA7 = new BorderPane();
		Label A7L = new Label("Allince 1:");
		A7L.setId("TitleLabel");
		borderPaneA7.setTop(A7L);
		borderPaneA7.setTop(A7L);
		VBox A7LabelVBox = new VBox(5);
		Label A7LT1 = new Label("Team 1:   ");
		Label A7LT2 = new Label("Team 2;   ");
		Label A7LT3 = new Label("Team 3:   ");
		Label A7LT4 = new Label("Team 4:   ");
		A7LabelVBox.getChildren().addAll(A7LT1, A7LT2, A7LT3, A7LT4);
		borderPaneA7.setLeft(A7LabelVBox);
		VBox A7TFVBox = new VBox(5);
		A7TFVBox.getChildren().addAll(team19TF, team20TF, team21TF, team31TF);
		borderPaneA7.setCenter(A7TFVBox);
		VBox A7CBVBox = new VBox(5);
		A7CBVBox.getChildren().addAll(team19CB, team20CB, team21CB, team31CB);
		borderPaneA7.setRight(A7CBVBox);
		borderPaneA7.setId("BPA7");
		//Alliance 8 stuff
		BorderPane borderPaneA8 = new BorderPane();
		Label A8L = new Label("Allince 1:");
		A8L.setId("TitleLabel");
		borderPaneA8.setTop(A8L);
		VBox A8LabelVBox = new VBox(5);
		Label A8LT1 = new Label("Team 1:   ");
		Label A8LT2 = new Label("Team 2;   ");
		Label A8LT3 = new Label("Team 3:   ");
		Label A8LT4 = new Label("Team 4:   ");
		A8LabelVBox.getChildren().addAll(A8LT1, A8LT2, A8LT3, A8LT4);
		borderPaneA8.setLeft(A8LabelVBox);
		VBox A8TFVBox = new VBox(5);
		A8TFVBox.getChildren().addAll(team22TF, team23TF, team24TF, team32TF);
		borderPaneA8.setCenter(A8TFVBox);
		VBox A8CBVBox = new VBox(5);
		A8CBVBox.getChildren().addAll(team22CB, team23CB, team24CB, team32CB);
		borderPaneA8.setRight(A8CBVBox);
		borderPaneA8.setId("BPA8");
		
		this.add(borderPaneA1, 0, 0);
		this.add(borderPaneA2, 0, 1);
		this.add(borderPaneA3, 0, 2);
		this.add(borderPaneA4, 0, 3);
		this.add(borderPaneA5, 1, 0);
		this.add(borderPaneA6, 1, 1);
		this.add(borderPaneA7, 1, 2);
		this.add(borderPaneA8, 1, 3);
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
