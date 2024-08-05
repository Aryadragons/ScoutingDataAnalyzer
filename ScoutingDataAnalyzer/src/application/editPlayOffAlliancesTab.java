package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
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
	private PlayoffAlliances filePOA;
	
	public editPlayOffAlliancesTab(PlayoffAlliances thePOA, List<Integer> importedListOfTeamNums) {
		this.getChildren().clear();
		listOfTeamNums = importedListOfTeamNums;
		filePOA = thePOA;
		submitB = new Button("Submit");
		submitB.setOnAction(this);
		this.add(submitB, 0, 3);
		System.out.println("BoopEditPlay0");
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
		team1TF.setText("");
		team2TF.setText("");
		team3TF.setText("");
		team4TF.setText("");
		team5TF.setText("");
		team6TF.setText("");
		team7TF.setText("");
		team8TF.setText("");
		team9TF.setText("");
		team10TF.setText("");
		team11TF.setText("");
		team12TF.setText("");
		team13TF.setText("");
		team14TF.setText("");
		team15TF.setText("");
		team16TF.setText("");
		team17TF.setText("");
		team18TF.setText("");
		team19TF.setText("");
		team20TF.setText("");
		team21TF.setText("");
		team22TF.setText("");
		team23TF.setText("");
		team24TF.setText("");
		team25TF.setText("");
		team26TF.setText("");
		team27TF.setText("");
		team28TF.setText("");
		team29TF.setText("");
		team30TF.setText("");
		team31TF.setText("");
		team32TF.setText("");
		//alliance 1
		Team team1 = null;
		Team team2 = null;
		Team team3 = null;
		Team team4 = null;
		Team team5 = null;
		Team team6 = null;
		Team team7 = null;
		Team team8 = null;
		Team team9 = null;
		Team team10 = null;
		Team team11 = null;
		Team team12 = null;
		Team team13 = null;
		Team team14 = null;
		Team team15 = null;
		Team team16 = null;
		Team team17 = null;
		Team team18 = null;
		Team team19 = null;
		Team team20 = null;
		Team team21 = null;
		Team team22 = null;
		Team team23 = null;
		Team team24 = null;
		Team team25 = null;
		Team team26 = null;
		Team team27 = null;
		Team team28 = null;
		Team team29 = null;
		Team team30 = null;
		Team team31 = null;
		Team team32 = null;

		System.out.println("BoopEditPlay1");
		if(thePOA.getAlliance1() != null) {
			if(thePOA.getAlliance1().getTeam1() != null) {
				team1 = thePOA.getAlliance1().getTeam1();
				int teamNum1 = thePOA.getAlliance1().getTeam1().getTeamNum();
				System.out.println("BoopEditPlay2");
				if(team1 != null) {
					team1TF.setText(Integer.toString(teamNum1));
				}
			}else {
				team1TF.setText("");
			}
			if(thePOA.getAlliance1().getTeam2() != null) {
				team2 = thePOA.getAlliance1().getTeam2();
				int teamNum2 = thePOA.getAlliance1().getTeam2().getTeamNum();
				if(team2 != null) {
					team2TF.setText(Integer.toString(teamNum2));
				}
			}else {
				team2TF.setText("");
			}
			if(thePOA.getAlliance1().getTeam3() != null) {
				team3 = thePOA.getAlliance1().getTeam3();
				int teamNum3 = thePOA.getAlliance1().getTeam3().getTeamNum();
				if(team3 != null) {
					team3TF.setText(Integer.toString(teamNum3));
				}
			}else {
				team3TF.setText("");
			}
			if(thePOA.getAlliance1().getTeam4() != null) {
				team25 = thePOA.getAlliance1().getTeam4();
				int teamNum25 = thePOA.getAlliance1().getTeam4().getTeamNum();
				if(team25 != null) {
					team25TF.setText(Integer.toString(teamNum25));
				}
			}else {
				team25TF.setText("");
			}
		}
		if(thePOA.getAlliance2() != null) {
			if(thePOA.getAlliance2().getTeam1() != null) {
				team4 = thePOA.getAlliance2().getTeam1();
				int teamNum4 = thePOA.getAlliance2().getTeam1().getTeamNum();
				if(team4 != null) {
					team4TF.setText(Integer.toString(teamNum4));
				}
			}else {
				team4TF.setText("");
			}
			if(thePOA.getAlliance2().getTeam2() != null) {
				team5 = thePOA.getAlliance2().getTeam2();
				int teamNum5 = thePOA.getAlliance2().getTeam2().getTeamNum();
				if(team5 != null) {
					team5TF.setText(Integer.toString(teamNum5));
				}
			}else {
				team5TF.setText("");
			}
			if(thePOA.getAlliance2().getTeam3() != null) {
				team6 = thePOA.getAlliance2().getTeam3();
				int teamNum6 = thePOA.getAlliance2().getTeam3().getTeamNum();
				if(team6 != null) {
					team6TF.setText(Integer.toString(teamNum6));
				}
			}else {
				team6TF.setText("");
			}
			if(thePOA.getAlliance2().getTeam4() != null) {
				team26 = thePOA.getAlliance2().getTeam4();
				int teamNum26 = thePOA.getAlliance2().getTeam4().getTeamNum();
				if(team26 != null) {
					team26TF.setText(Integer.toString(teamNum26));
				}
			}else {
				team26TF.setText("");
			}
		}
		if(thePOA.getAlliance3() != null) {
			if(thePOA.getAlliance3().getTeam1() != null) {
				team7 = thePOA.getAlliance3().getTeam1();
				int teamNum7 = thePOA.getAlliance3().getTeam1().getTeamNum();
				if(team7 != null) {
					team7TF.setText(Integer.toString(teamNum7));
				}
			}else {
				team7TF.setText("");
			}
			if(thePOA.getAlliance3().getTeam2() != null) {
				team8 = thePOA.getAlliance3().getTeam2();
				int teamNum8 = thePOA.getAlliance3().getTeam2().getTeamNum();
				if(team8 != null) {
					team8TF.setText(Integer.toString(teamNum8));
				}
			}else {
				team8TF.setText("");
			}
			if(thePOA.getAlliance3().getTeam3() != null) {
				team9 = thePOA.getAlliance3().getTeam3();
				int teamNum9 = thePOA.getAlliance3().getTeam3().getTeamNum();
				if(team9 != null) {
					team9TF.setText(Integer.toString(teamNum9));
				}
			}else {
				team9TF.setText("");
			}
			if(thePOA.getAlliance3().getTeam4() != null) {
				team27 = thePOA.getAlliance3().getTeam4();
				int teamNum27 = thePOA.getAlliance3().getTeam4().getTeamNum();
				if(team27 != null) {
					team27TF.setText(Integer.toString(teamNum27));
				}
			}else {
				team27TF.setText("");
			}
		}
		if(thePOA.getAlliance4() != null) {
			if(thePOA.getAlliance4().getTeam1() != null) {
				team10 = thePOA.getAlliance4().getTeam1();
				int teamNum10 = thePOA.getAlliance4().getTeam1().getTeamNum();
				if(team10 != null) {
					team10TF.setText(Integer.toString(teamNum10));
				}
			}else {
				team10TF.setText("");
			}
			if(thePOA.getAlliance4().getTeam2() != null) {
				team11 = thePOA.getAlliance4().getTeam2();
				int teamNum11 = thePOA.getAlliance4().getTeam2().getTeamNum();
				if(team11 != null) {
					team11TF.setText(Integer.toString(teamNum11));
				}
			}else {
				team11TF.setText("");
			}
			if(thePOA.getAlliance4().getTeam3() != null) {
				team12 = thePOA.getAlliance4().getTeam3();
				int teamNum12 = thePOA.getAlliance4().getTeam3().getTeamNum();
				if(team12 != null) {
					team12TF.setText(Integer.toString(teamNum12));
				}
			}else {
				team12TF.setText("");
			}
			if(thePOA.getAlliance4().getTeam4() != null) {
				team28 = thePOA.getAlliance4().getTeam4();
				int teamNum28 = thePOA.getAlliance4().getTeam4().getTeamNum();
				if(team28 != null) {
					team28TF.setText(Integer.toString(teamNum28));
				}
			}else {
				team28TF.setText("");
			}
		}
		if(thePOA.getAlliance5() != null) {
			if(thePOA.getAlliance5().getTeam1() != null) {
				team13 = thePOA.getAlliance5().getTeam1();
				int teamNum13 = thePOA.getAlliance5().getTeam1().getTeamNum();
				if(team13 != null) {
					team13TF.setText(Integer.toString(teamNum13));
				}
			}else {
				team13TF.setText("");
			}
			if(thePOA.getAlliance5().getTeam2() != null) {
				team14 = thePOA.getAlliance5().getTeam2();
				int teamNum14 = thePOA.getAlliance5().getTeam2().getTeamNum();
				if(team14 != null) {
					team14TF.setText(Integer.toString(teamNum14));
				}
			}else {
				team14TF.setText("");
			}
			if(thePOA.getAlliance5().getTeam3() != null) {
				team15 = thePOA.getAlliance5().getTeam3();
				int teamNum15 = thePOA.getAlliance5().getTeam3().getTeamNum();
				if(team15 != null) {
					team15TF.setText(Integer.toString(teamNum15));
				}
			}else {
				team15TF.setText("");
			}
			if(thePOA.getAlliance5().getTeam4() != null) {
				team29 = thePOA.getAlliance5().getTeam4();
				int teamNum29 = thePOA.getAlliance5().getTeam4().getTeamNum();
				if(team29 != null) {
					team29TF.setText(Integer.toString(teamNum29));
				}
			}else {
				team29TF.setText("");
			}
		}
		if(thePOA.getAlliance6() != null) {
			if(thePOA.getAlliance6().getTeam1() != null) {
				team16 = thePOA.getAlliance6().getTeam1();
				int teamNum16 = thePOA.getAlliance6().getTeam1().getTeamNum();
				if(team16 != null) {
					team16TF.setText(Integer.toString(teamNum16));
				}
			}else {
				team16TF.setText("");
			}
			if(thePOA.getAlliance6().getTeam2() != null) {
				team17 = thePOA.getAlliance6().getTeam2();
				int teamNum17 = thePOA.getAlliance6().getTeam2().getTeamNum();
				if(team17 != null) {
					team17TF.setText(Integer.toString(teamNum17));
				}
			}else {
				team17TF.setText("");
			}
			if(thePOA.getAlliance6().getTeam3() != null) {
				team18 = thePOA.getAlliance6().getTeam3();
				int teamNum18 = thePOA.getAlliance6().getTeam3().getTeamNum();
				if(team18 != null) {
					team18TF.setText(Integer.toString(teamNum18));
				}
			}else {
				team18TF.setText("");
			}
			if(thePOA.getAlliance6().getTeam4() != null) {
				team30 = thePOA.getAlliance6().getTeam4();
				int teamNum30 = thePOA.getAlliance6().getTeam4().getTeamNum();
				if(team30 != null) {
					team30TF.setText(Integer.toString(teamNum30));
				}
			}else {
				team30TF.setText("");
			}
		}
		if(thePOA.getAlliance7() != null) {
			if(thePOA.getAlliance7().getTeam1() != null) {
				team19 = thePOA.getAlliance7().getTeam1();
				int teamNum19 = thePOA.getAlliance7().getTeam1().getTeamNum();
				if(team19 != null) {
					team19TF.setText(Integer.toString(teamNum19));
				}
			}else {
				team19TF.setText("");
			}
			if(thePOA.getAlliance7().getTeam2() != null) {
				team20 = thePOA.getAlliance7().getTeam2();
				int teamNum20 = thePOA.getAlliance7().getTeam2().getTeamNum();
				if(team20 != null) {
					team20TF.setText(Integer.toString(teamNum20));
				}
			}else {
				team20TF.setText("");
			}
			if(thePOA.getAlliance7().getTeam3() != null) {
				team21 = thePOA.getAlliance7().getTeam3();
				int teamNum21 = thePOA.getAlliance7().getTeam3().getTeamNum();
				if(team21 != null) {
					team21TF.setText(Integer.toString(teamNum21));
				}
			}else {
				team21TF.setText("");
			}
			if(thePOA.getAlliance7().getTeam4() != null) {
				team31 = thePOA.getAlliance7().getTeam4();
				int teamNum31 = thePOA.getAlliance7().getTeam4().getTeamNum();
				if(team31 != null) {
					team31TF.setText(Integer.toString(teamNum31));
				}
			}else {
				team31TF.setText("");
			}
		}
		if(thePOA.getAlliance8() != null) {
			if(thePOA.getAlliance8().getTeam1() != null) {
				team22 = thePOA.getAlliance8().getTeam1();
				int teamNum22 = thePOA.getAlliance8().getTeam1().getTeamNum();
				if(team22 != null) {
					team22TF.setText(Integer.toString(teamNum22));
				}
			}else {
				team22TF.setText("");
			}
			if(thePOA.getAlliance8().getTeam2() != null) {
				team23 = thePOA.getAlliance8().getTeam2();
				int teamNum23 = thePOA.getAlliance8().getTeam2().getTeamNum();
				if(team23 != null) {
					team23TF.setText(Integer.toString(teamNum23));
				}
			}else {
				team23TF.setText("");
			}
			if(thePOA.getAlliance8().getTeam3() != null) {
				team24 = thePOA.getAlliance8().getTeam3();
				int teamNum24 = thePOA.getAlliance8().getTeam3().getTeamNum();
				if(team24 != null) {
					team24TF.setText(Integer.toString(teamNum24));
				}
			}else {
				team24TF.setText("");
			}
			if(thePOA.getAlliance8().getTeam4() != null) {
				team32 = thePOA.getAlliance8().getTeam4();
				int teamNum32 = thePOA.getAlliance8().getTeam4().getTeamNum();
				if(team32 != null) {
					team32TF.setText(Integer.toString(teamNum32));
				}
			}else {
				team32TF.setText("");
			}
		}
		System.out.println("BoopEditPlay3");
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
		A1L.setId("TitleLabelPlay");
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
		Label A2L = new Label("Allince 2:");
		A2L.setId("TitleLabelPlay");
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
		Label A3L = new Label("Allince 3:");
		A3L.setId("TitleLabelPlay");
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
		Label A4L = new Label("Allince 4:");
		A4L.setId("TitleLabelPlay");
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
		Label A5L = new Label("Allince 5:");
		A5L.setId("TitleLabelPlay");
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
		Label A6L = new Label("Allince 6:");
		A6L.setId("TitleLabelPlay");
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
		Label A7L = new Label("Allince 7:");
		A7L.setId("TitleLabelPlay");
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
		Label A8L = new Label("Allince 8:");
		A8L.setId("TitleLabelPlay");
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
		this.add(new Label("  "), 1, 0);
		this.add(new Label("  "), 3, 0);
		this.add(new Label("  "), 5, 0);
		this.add(new Label("  "), 0, 1);
		this.add(borderPaneA1, 0, 0);
		this.add(borderPaneA2, 2, 0);
		this.add(borderPaneA3, 4, 0);
		this.add(borderPaneA4, 6, 0);
		this.add(borderPaneA5, 0, 2);
		this.add(borderPaneA6, 2, 2);
		this.add(borderPaneA7, 4, 2);
		this.add(borderPaneA8, 6, 2);
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
			if (event.getSource() == submitB) {
				System.out.println("BoopEditPlay4");
				String editTeam1 = team1CB.getSelectionModel().getSelectedItem();
				String editTeam2 = team2CB.getSelectionModel().getSelectedItem();
				String editTeam3 = team3CB.getSelectionModel().getSelectedItem();
				String editTeam4 = team4CB.getSelectionModel().getSelectedItem();
				String editTeam5 = team5CB.getSelectionModel().getSelectedItem();
				String editTeam6 = team6CB.getSelectionModel().getSelectedItem();
				String editTeam7 = team7CB.getSelectionModel().getSelectedItem();
				String editTeam8 = team8CB.getSelectionModel().getSelectedItem();
				String editTeam9 = team9CB.getSelectionModel().getSelectedItem();
				String editTeam10 = team10CB.getSelectionModel().getSelectedItem();
				String editTeam11 = team11CB.getSelectionModel().getSelectedItem();
				String editTeam12 = team12CB.getSelectionModel().getSelectedItem();
				String editTeam13 = team13CB.getSelectionModel().getSelectedItem();
				String editTeam14 = team14CB.getSelectionModel().getSelectedItem();
				String editTeam15 = team15CB.getSelectionModel().getSelectedItem();
				String editTeam16 = team16CB.getSelectionModel().getSelectedItem();
				String editTeam17 = team17CB.getSelectionModel().getSelectedItem();
				String editTeam18 = team18CB.getSelectionModel().getSelectedItem();
				String editTeam19 = team19CB.getSelectionModel().getSelectedItem();
				String editTeam20 = team20CB.getSelectionModel().getSelectedItem();
				String editTeam21 = team21CB.getSelectionModel().getSelectedItem();
				String editTeam22 = team22CB.getSelectionModel().getSelectedItem();
				String editTeam23 = team23CB.getSelectionModel().getSelectedItem();
				String editTeam24 = team24CB.getSelectionModel().getSelectedItem();
				String editTeam25 = team25CB.getSelectionModel().getSelectedItem();
				String editTeam26 = team26CB.getSelectionModel().getSelectedItem();
				String editTeam27 = team27CB.getSelectionModel().getSelectedItem();
				String editTeam28 = team28CB.getSelectionModel().getSelectedItem();
				String editTeam29 = team29CB.getSelectionModel().getSelectedItem();
				String editTeam30 = team30CB.getSelectionModel().getSelectedItem();
				String editTeam31 = team31CB.getSelectionModel().getSelectedItem();
				String editTeam32 = team32CB.getSelectionModel().getSelectedItem();
				System.out.println("BoopEditPlay5");
				new FileWriter("PlayAlliancesFile.txt", false).close();
				FileWriter fw = new FileWriter("PlayAlliancesFile.txt", true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw);
			    System.out.println("BoopEditPlay6");
				if(editTeam1 != null) {
					System.out.println("BoopEditPlay6.1");
					out.println(editTeam1);
				} else {
					System.out.println("BoopEditPlay6.2");
					if (filePOA.getAlliance1() != null) {
						if (filePOA.getAlliance1().getTeam1() != null) {
							out.println(Integer.toString(filePOA.getAlliance1().getTeam1().getTeamNum()));
						}else {
							out.println(0);
						}
					}else {
						out.println(0);
					}
				}
				if(editTeam2 != null) {
					out.println(editTeam2);
				} else {
					if (filePOA.getAlliance1() != null) {
						if (filePOA.getAlliance1().getTeam2() != null) {
							out.println(Integer.toString(filePOA.getAlliance1().getTeam2().getTeamNum()));
						}else {
							out.println(0);
						}
					}else {
						out.println(0);
					}
				}
				if(editTeam3 != null) {
					out.println(editTeam3);
				} else {
					if (filePOA.getAlliance1() != null) {
						if (filePOA.getAlliance1().getTeam3() != null) {
							out.println(Integer.toString(filePOA.getAlliance1().getTeam3().getTeamNum()));
						}else {
							out.println(0);
						}
					}else {
						out.println(0);
					}
				}
				if(editTeam4 != null) {
					out.println(editTeam4);
				} else {
					if (filePOA.getAlliance2() != null) {
						if (filePOA.getAlliance2().getTeam1() != null) {
							out.println(Integer.toString(filePOA.getAlliance2().getTeam1().getTeamNum()));
						}else {
							out.println(0);
						}
					}else {
						out.println(0);
					}
				}
				if(editTeam5 != null) {
					out.println(editTeam5);
				} else {
					if (filePOA.getAlliance2() != null) {
						if (filePOA.getAlliance2().getTeam2() != null) {
							out.println(Integer.toString(filePOA.getAlliance2().getTeam2().getTeamNum()));
						}else {
							out.println(0);
						}
					}else {
						out.println(0);
					}
				}
				if(editTeam6 != null) {
					out.println(editTeam6);
				} else {
					if (filePOA.getAlliance2() != null) {
						if (filePOA.getAlliance2().getTeam3() != null) {
							out.println(Integer.toString(filePOA.getAlliance2().getTeam3().getTeamNum()));
						}else {
							out.println(0);
						}
					}else {
						out.println(0);
					}
				}
				if(editTeam7 != null) {
					out.println(editTeam7);
				} else {
					if (filePOA.getAlliance3() != null) {
						if (filePOA.getAlliance3().getTeam1() != null) {
							out.println(Integer.toString(filePOA.getAlliance3().getTeam1().getTeamNum()));
						}else {
							out.println(0);
						}
					}else {
						out.println(0);
					}
				}
				if(editTeam8 != null) {
					out.println(editTeam8);
				} else {
					if (filePOA.getAlliance3() != null) {
						if (filePOA.getAlliance3().getTeam2() != null) {
							out.println(Integer.toString(filePOA.getAlliance3().getTeam2().getTeamNum()));
						}else {
							out.println(0);
						}
					}else {
						out.println(0);
					}
				}
				if(editTeam9 != null) {
					out.println(editTeam9);
				} else {
					if (filePOA.getAlliance3() != null) {
						if (filePOA.getAlliance3().getTeam3() != null) {
							out.println(Integer.toString(filePOA.getAlliance3().getTeam3().getTeamNum()));
						}else {
							out.println(0);
						}
					}else {
						out.println(0);
					}
				}
				if(editTeam10 != null) {
					out.println(editTeam10);
				} else {
					if (filePOA.getAlliance4() != null) {
						if (filePOA.getAlliance4().getTeam1() != null) {
							out.println(Integer.toString(filePOA.getAlliance4().getTeam1().getTeamNum()));
						}else {
							out.println(0);
						}
					}else {
						out.println(0);
					}
				}
				if(editTeam11!= null) {
					out.println(editTeam11);
				} else {
					if (filePOA.getAlliance4() != null) {
						if (filePOA.getAlliance4().getTeam2() != null) {
							out.println(Integer.toString(filePOA.getAlliance4().getTeam3().getTeamNum()));
						}else {
							out.println(0);
						}
					}else {
						out.println(0);
					}
				}
				if(editTeam12 != null) {
					out.println(editTeam12);
				} else {
					if (filePOA.getAlliance4() != null) {
						if (filePOA.getAlliance4().getTeam3() != null) {
							out.println(Integer.toString(filePOA.getAlliance4().getTeam3().getTeamNum()));
						}else {
							out.println(0);
						}
					}else {
						out.println(0);
					}
				}
				if(editTeam13 != null) {
					out.println(editTeam13);
				} else {
					if (filePOA.getAlliance5() != null) {
						if (filePOA.getAlliance5().getTeam1() != null) {
							out.println(Integer.toString(filePOA.getAlliance5().getTeam1().getTeamNum()));
						}else {
							out.println(0);
						}
					}else {
						out.println(0);
					}
				}
				if(editTeam14 != null) {
					out.println(editTeam14);
				} else {
					if (filePOA.getAlliance5() != null) {
						if (filePOA.getAlliance5().getTeam2() != null) {
							out.println(Integer.toString(filePOA.getAlliance5().getTeam2().getTeamNum()));
						}else {
							out.println(0);
						}
					}else {
						out.println(0);
					}
				}
				if(editTeam15 != null) {
					out.println(editTeam15);
				} else {
					if (filePOA.getAlliance5() != null) {
						if (filePOA.getAlliance5().getTeam3() != null) {
							out.println(Integer.toString(filePOA.getAlliance5().getTeam3().getTeamNum()));
						}else {
							out.println(0);
						}
					}else {
						out.println(0);
					}
				}
				if(editTeam16 != null) {
					out.println(editTeam16);
				} else {
					if (filePOA.getAlliance6() != null) {
						if (filePOA.getAlliance6().getTeam1() != null) {
							out.println(Integer.toString(filePOA.getAlliance6().getTeam1().getTeamNum()));
						}else {
							out.println(0);
						}
					}else {
						out.println(0);
					}
				}
				if(editTeam17 != null) {
					out.println(editTeam17);
				} else {
					if (filePOA.getAlliance6() != null) {
						if (filePOA.getAlliance6().getTeam2() != null) {
							out.println(Integer.toString(filePOA.getAlliance6().getTeam2().getTeamNum()));
						}else {
							out.println(0);
						}
					}else {
						out.println(0);
					}
				}
				if(editTeam18 != null) {
					out.println(editTeam18);
				} else {
					if (filePOA.getAlliance6() != null) {
						if (filePOA.getAlliance6().getTeam3() != null) {
							out.println(Integer.toString(filePOA.getAlliance6().getTeam3().getTeamNum()));
						}else {
							out.println(0);
						}
					}else {
						out.println(0);
					}
				}
				if(editTeam19 != null) {
					out.println(editTeam19);
				} else {
					if (filePOA.getAlliance7() != null) {
						if (filePOA.getAlliance7().getTeam1() != null) {
							out.println(Integer.toString(filePOA.getAlliance7().getTeam1().getTeamNum()));
						}else {
							out.println(0);
						}
					}else {
						out.println(0);
					}
				}
				if(editTeam20 != null) {
					out.println(editTeam20);
				} else {
					if (filePOA.getAlliance7() != null) {
						if (filePOA.getAlliance7().getTeam2() != null) {
							out.println(Integer.toString(filePOA.getAlliance7().getTeam2().getTeamNum()));
						}else {
							out.println(0);
						}
					}else {
						out.println(0);
					}
				}
				if(editTeam21 != null) {
					out.println(editTeam21);
				} else {
					if (filePOA.getAlliance7() != null) {
						if (filePOA.getAlliance7().getTeam3() != null) {
							out.println(Integer.toString(filePOA.getAlliance7().getTeam3().getTeamNum()));
						}else {
							out.println(0);
						}
					}else {
						out.println(0);
					}
				}
				if(editTeam22 != null) {
					out.println(editTeam22);
				} else {
					if (filePOA.getAlliance8() != null) {
						if (filePOA.getAlliance8().getTeam1() != null) {
							out.println(Integer.toString(filePOA.getAlliance8().getTeam1().getTeamNum()));
						}else {
							out.println(0);
						}
					}else {
						out.println(0);
					}
				}
				if(editTeam23 != null) {
					out.println(editTeam23);
				} else {
					if (filePOA.getAlliance8() != null) {
						if (filePOA.getAlliance8().getTeam2() != null) {
							out.println(Integer.toString(filePOA.getAlliance8().getTeam2().getTeamNum()));
						}else {
							out.println(0);
						}
					}else {
						out.println(0);
					}
				}
				if(editTeam24 != null) {
					out.println(editTeam24);
				} else {
					if (filePOA.getAlliance8() != null) {
						if (filePOA.getAlliance8().getTeam3() != null) {
							out.println(Integer.toString(filePOA.getAlliance8().getTeam3().getTeamNum()));
						}else {
							out.println(0);
						}
					}else {
						out.println(0);
					}
				}
				if(editTeam25 != null) {
					out.println(editTeam25);
				} else {
					if (filePOA.getAlliance1() != null) {
						if (filePOA.getAlliance1().getTeam4() != null) {
							out.println(Integer.toString(filePOA.getAlliance1().getTeam4().getTeamNum()));
						}else {
							out.println(0);
						}
					}else {
						out.println(0);
					}
				}
				if(editTeam26 != null) {
					out.println(editTeam26);
				} else {
					if (filePOA.getAlliance2() != null) {
						if (filePOA.getAlliance2().getTeam4() != null) {
							out.println(Integer.toString(filePOA.getAlliance2().getTeam4().getTeamNum()));
						}else {
							out.println(0);
						}
					}else {
						out.println(0);
					}
				}
				if(editTeam27 != null) {
					out.println(editTeam27);
				} else {
					if (filePOA.getAlliance3() != null) {
						if (filePOA.getAlliance3().getTeam4() != null) {
							out.println(Integer.toString(filePOA.getAlliance3().getTeam4().getTeamNum()));
						}else {
							out.println(0);
						}
					}else {
						out.println(0);
					}
					
				}
				if(editTeam28 != null) {
					out.println(editTeam28);
				} else {
					if (filePOA.getAlliance4() != null) {
						if (filePOA.getAlliance4().getTeam4() != null) {
							out.println(Integer.toString(filePOA.getAlliance4().getTeam4().getTeamNum()));
						}else {
							out.println(0);
						}
					}
					else {
						out.println(0);
					}
				}
				if(editTeam29 != null) {
					out.println(editTeam29);
				} else {
					if (filePOA.getAlliance5() != null) {
						if (filePOA.getAlliance5().getTeam4() != null) {
							out.println(Integer.toString(filePOA.getAlliance5().getTeam4().getTeamNum()));
						}else {
							out.println(0);
						}
					}
					else {
						out.println(0);
					}
				}
				if(editTeam30 != null) {
					out.println(editTeam30);
				} else {
					if (filePOA.getAlliance6() != null) {
						if (filePOA.getAlliance6().getTeam4() != null) {
							out.println(Integer.toString(filePOA.getAlliance6().getTeam4().getTeamNum()));
						}else {
							out.println(0);
						}
					}
					else {
						out.println(0);
					}
				}
				if(editTeam31 != null) {
					out.println(editTeam31);
				} else {
					if (filePOA.getAlliance7() != null) {
						if (filePOA.getAlliance7().getTeam4() != null) {
							out.println(Integer.toString(filePOA.getAlliance7().getTeam4().getTeamNum()));
						}else {
							out.println(0);
						}
					}
					else {
						out.println(0);
					}
				}
				if(editTeam32 != null) {
					out.println(editTeam32);
				} else {
					if (filePOA.getAlliance8() != null) {
						if (filePOA.getAlliance8().getTeam4() != null) {
							out.println(Integer.toString(filePOA.getAlliance8().getTeam4().getTeamNum()));
						}else {
							out.println(0);
						}
					}
					else {
						out.println(0);
					}
				}
				out.close();
				Label doneL = new Label("Edited");
				doneL.setId("EditedPlay");
				this.add(doneL, 2, 3);
			}
		} catch(Exception e) {
			System.out.println("Error: " + e);
		}
		
	}
}
