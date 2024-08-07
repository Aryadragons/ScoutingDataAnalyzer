package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class setPlayOffAlliancesTab extends GridPane implements EventHandler<ActionEvent>{
	
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
	private String team1S;
	private String team2S;
	private String team3S;
	private String team4S;
	private String team5S;
	private String team6S;
	private String team7S;
	private String team8S;
	private String team9S;
	private String team10S;
	private String team11S;
	private String team12S;
	private String team13S;
	private String team14S;
	private String team15S;
	private String team16S;
	private String team17S;
	private String team18S;
	private String team19S;
	private String team20S;
	private String team21S;
	private String team22S;
	private String team23S;
	private String team24S;
	private String team25S;
	private String team26S;
	private String team27S;
	private String team28S;
	private String team29S;
	private String team30S;
	private String team31S;
	private String team32S;

	public setPlayOffAlliancesTab(List<Integer> importedListOfTeamNums) {
		listOfTeamNums = importedListOfTeamNums;
		Label A1L = new Label("Allince 1 Teams:");
		A1L.setId("TitleLabelPlay");
		Label A2L = new Label("Allince 2 Teams:");
		A2L.setId("TitleLabelPlay");
		Label A3L = new Label("Allince 3 Teams:");
		A3L.setId("TitleLabelPlay");
		Label A4L = new Label("Allince 4 Teams:");
		A4L.setId("TitleLabelPlay");
		Label A5L = new Label("Allince 5 Teams:");
		A5L.setId("TitleLabelPlay");
		Label A6L = new Label("Allince 6 Teams:");
		A6L.setId("TitleLabelPlay");
		Label A7L = new Label("Allince 7 Teams:");
		A7L.setId("TitleLabelPlay");
		Label A8L = new Label("Allince 8 Teams:");
		A8L.setId("TitleLabelPlay");
		Label A1T1L = new Label("Team 1:");
		Label A1T2L = new Label("Team 2:");
		Label A1T3L = new Label("Team 3:");
		Label A1T25L = new Label("Team 25:");
		Label A2T4L = new Label("Team 4:");
		Label A2T5L = new Label("Team 5:");
		Label A2T6L = new Label("Team 6:");
		Label A2T26L = new Label("Team 26:");
		Label A3T7L = new Label("Team 7:");
		Label A3T8L = new Label("Team 8:");
		Label A3T9L = new Label("Team 9:");
		Label A3T27L = new Label("Team 27:");
		Label A4T10L = new Label("Team 10:");
		Label A4T11L = new Label("Team 11:");
		Label A4T12L = new Label("Team 12:");
		Label A4T28L = new Label("Team 28:");
		Label A5T13L = new Label("Team 13:");
		Label A5T14L = new Label("Team 14:");
		Label A5T15L = new Label("Team 15:");
		Label A5T29L = new Label("Team 29:");
		Label A6T16L = new Label("Team 16:");
		Label A6T17L = new Label("Team 17:");
		Label A6T18L = new Label("Team 18:");
		Label A6T30L = new Label("Team 30:");
		Label A7T19L = new Label("Team 19:");
		Label A7T20L = new Label("Team 20:");
		Label A7T21L = new Label("Team 21:");
		Label A7T31L = new Label("Team 31:");
		Label A8T22L = new Label("Team 22:");
		Label A8T23L = new Label("Team 23:");
		Label A8T24L = new Label("Team 24:");
		Label A8T32L = new Label("Team 32:");
		A1T1L.setId("setPlayL");
		A1T2L.setId("setPlayL");
		A1T3L.setId("setPlayL");
		A1T25L.setId("setPlayL");
		A2T4L.setId("setPlayL");
		A2T5L.setId("setPlayL");
		A2T6L.setId("setPlayL");
		A2T26L.setId("setPlayL");
		A3T7L.setId("setPlayL");
		A3T8L.setId("setPlayL");
		A3T9L.setId("setPlayL");
		A3T27L.setId("setPlayL");
		A4T10L.setId("setPlayL");
		A4T11L.setId("setPlayL");
		A4T12L.setId("setPlayL");
		A4T28L.setId("setPlayL");
		A5T13L.setId("setPlayL");
		A5T14L.setId("setPlayL");
		A5T15L.setId("setPlayL");
		A5T29L.setId("setPlayL");
		A6T16L.setId("setPlayL");
		A6T17L.setId("setPlayL");
		A6T18L.setId("setPlayL");
		A6T30L.setId("setPlayL");
		A7T19L.setId("setPlayL");
		A7T20L.setId("setPlayL");
		A7T21L.setId("setPlayL");
		A7T31L.setId("setPlayL");
		A8T22L.setId("setPlayL");
		A8T23L.setId("setPlayL");
		A8T24L.setId("setPlayL");
		A8T32L.setId("setPlayL");
		VBox A1VBLabel = new VBox(5);
		A1VBLabel.getChildren().addAll(A1T1L, A1T2L, A1T3L, A1T25L);
		VBox A2VBLabel = new VBox(5);
		A2VBLabel.getChildren().addAll(A2T4L, A2T5L, A2T6L, A2T26L);
		VBox A3VBLabel = new VBox(5);
		A3VBLabel.getChildren().addAll(A3T7L, A3T8L, A3T9L, A3T27L);
		VBox A4VBLabel = new VBox(5);
		A4VBLabel.getChildren().addAll(A4T10L, A4T11L, A4T12L, A4T28L);
		VBox A5VBLabel = new VBox(5);
		A5VBLabel.getChildren().addAll(A5T13L, A5T14L, A5T15L, A5T29L);
		VBox A6VBLabel = new VBox(5);
		A6VBLabel.getChildren().addAll(A6T16L, A6T17L, A6T18L, A6T30L);
		VBox A7VBLabel = new VBox(5);
		A7VBLabel.getChildren().addAll(A7T19L, A7T20L, A7T21L, A7T31L);
		VBox A8VBLabel = new VBox(5);
		A8VBLabel.getChildren().addAll(A8T22L, A8T23L, A8T24L, A8T32L);
		
		// adding combo boxes for each team
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
		//adding other VBox
		VBox A1VBCB = new VBox(5);
		A1VBCB.getChildren().addAll(team1CB, team2CB, team3CB, team25CB);
		VBox A2VBCB = new VBox(5);
		A2VBCB.getChildren().addAll(team4CB, team5CB, team6CB, team26CB);
		VBox A3VBCB = new VBox(5);
		A3VBCB.getChildren().addAll(team7CB, team8CB, team9CB, team27CB);
		VBox A4VBCB = new VBox(5);
		A4VBCB.getChildren().addAll(team10CB, team11CB, team12CB, team28CB);
		VBox A5VBCB = new VBox(5);
		A5VBCB.getChildren().addAll(team13CB, team14CB, team15CB, team29CB);
		VBox A6VBCB = new VBox(5);
		A6VBCB.getChildren().addAll(team16CB, team17CB, team18CB, team30CB);
		VBox A7VBCB = new VBox(5);
		A7VBCB.getChildren().addAll(team19CB, team20CB, team21CB, team31CB);
		VBox A8VBCB = new VBox(5);
		A8VBCB.getChildren().addAll(team22CB, team23CB, team24CB, team32CB);
		BorderPane A1BP = new BorderPane();
		A1BP.setTop(A1L);
		A1BP.setLeft(A1VBLabel);
		A1BP.setRight(A1VBCB);
		A1BP.setId("BPA1");
		BorderPane A2BP = new BorderPane();
		A2BP.setTop(A2L);
		A2BP.setLeft(A2VBLabel);
		A2BP.setRight(A2VBCB);
		A2BP.setId("BPA2");
		BorderPane A3BP = new BorderPane();
		A3BP.setTop(A3L);
		A3BP.setLeft(A3VBLabel);
		A3BP.setRight(A3VBCB);
		A3BP.setId("BPA3");
		BorderPane A4BP = new BorderPane();
		A4BP.setTop(A4L);
		A4BP.setLeft(A4VBLabel);
		A4BP.setRight(A4VBCB);
		A4BP.setId("BPA4");
		BorderPane A5BP = new BorderPane();
		A5BP.setTop(A5L);
		A5BP.setLeft(A5VBLabel);
		A5BP.setRight(A5VBCB);
		A5BP.setId("BPA5");
		BorderPane A6BP = new BorderPane();
		A6BP.setTop(A6L);
		A6BP.setLeft(A6VBLabel);
		A6BP.setRight(A6VBCB);
		A6BP.setId("BPA6");
		BorderPane A7BP = new BorderPane();
		A7BP.setTop(A7L);
		A7BP.setLeft(A7VBLabel);
		A7BP.setRight(A7VBCB);
		A7BP.setId("BPA7");
		BorderPane A8BP = new BorderPane();
		A8BP.setTop(A8L);
		A8BP.setLeft(A8VBLabel);
		A8BP.setRight(A8VBCB);
		A8BP.setId("BPA8");
		this.add(new Label("     "), 0, 0);
		this.add(A1BP, 1, 1);
		this.add(new Label("     "), 2, 0);
		this.add(A2BP, 3, 1);
		this.add(new Label("     "), 4, 0);
		this.add(A3BP, 5, 1);
		this.add(new Label("     "), 6, 0);
		this.add(A4BP, 7, 1);
		this.add(new Label("     "), 0, 2);
		this.add(A5BP, 1, 3);
		this.add(A6BP, 3, 3);
		this.add(A7BP, 5, 3);
		this.add(A8BP, 7, 3);
		submitB = new Button("Submit");
		submitB.setOnAction(this);
		this.add(submitB, 1, 4);
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
	
	private void exportTeamsNums() {
		try {
			new FileWriter("PlayAlliancesFile.txt", false).close();
			FileWriter fw = new FileWriter("PlayAlliancesFile.txt", true);
		    BufferedWriter bw = new BufferedWriter(fw);
		    PrintWriter out = new PrintWriter(bw);
		    if(team1S != null) {
		    	out.println(team1S);
		    }else {
		    	out.println("0");
		    }
		    if(team2S != null) {
		    	out.println(team2S);
		    }else {
		    	out.println("0");
		    }

		    if(team3S != null) {
		    	out.println(team3S);
		    }else {
		    	out.println("0");
		    }

		    if(team4S != null) {
		    	out.println(team4S);
		    }else {
		    	out.println("0");
		    }

		    if(team5S != null) {
		    	out.println(team5S);
		    }else {
		    	out.println("0");
		    }

		    if(team6S != null) {
		    	out.println(team6S);
		    }else {
		    	out.println("0");
		    }

		    if(team7S != null) {
		    	out.println(team7S);
		    }else {
		    	out.println("0");
		    }

		    if(team8S != null) {
		    	out.println(team8S);
		    }else {
		    	out.println("0");
		    }

		    if(team9S != null) {
		    	out.println(team9S);
		    }else {
		    	out.println("0");
		    }

		    if(team10S != null) {
		    	out.println(team10S);
		    }else {
		    	out.println("0");
		    }

		    if(team11S != null) {
		    	out.println(team11S);
		    }else {
		    	out.println("0");
		    }

		    if(team12S != null) {
		    	out.println(team12S);
		    }else {
		    	out.println("0");
		    }

		    if(team13S != null) {
		    	out.println(team13S);
		    }else {
		    	out.println("0");
		    }

		    if(team14S != null) {
		    	out.println(team14S);
		    }else {
		    	out.println("0");
		    }

		    if(team15S != null) {
		    	out.println(team15S);
		    }else {
		    	out.println("0");
		    }

		    if(team16S != null) {
		    	out.println(team16S);
		    }else {
		    	out.println("0");
		    }

		    if(team17S != null) {
		    	out.println(team17S);
		    }else {
		    	out.println("0");
		    }

		    if(team18S != null) {
		    	out.println(team18S);
		    }else {
		    	out.println("0");
		    }
		    
		    if(team19S != null) {
		    	out.println(team19S);
		    }else {
		    	out.println("0");
		    }
		    
		    if(team20S != null) {
		    	out.println(team20S);
		    }else {
		    	out.println("0");
		    }
		    if(team21S != null) {
		    	out.println(team21S);
		    }else {
		    	out.println("0");
		    }
		    if(team22S != null) {
		    	out.println(team22S);
		    }else {
		    	out.println("0");
		    }
		    if(team23S != null) {
		    	out.println(team23S);
		    }else {
		    	out.println("0");
		    }
		    if(team24S != null) {
		    	out.println(team24S);
		    }else {
		    	out.println("0");
		    }
		    if(team25S != null) {
		    	out.println(team25S);
		    }else {
		    	out.println("0");
		    }
		    if(team26S != null) {
		    	out.println(team26S);
		    }else {
		    	out.println("0");
		    }
		    if(team27S != null) {
		    	out.println(team27S);
		    }else {
		    	out.println("0");
		    }
		    if(team28S != null) {
		    	out.println(team28S);
		    }else {
		    	out.println("0");
		    }
		    if(team29S != null) {
		    	out.println(team29S);
		    }else {
		    	out.println("0");
		    }
		    if(team30S != null) {
		    	out.println(team30S);
		    }else {
		    	out.println("0");
		    }
		    if(team31S != null) {
		    	out.println(team31S);
		    }else {
		    	out.println("0");
		    }
		    if(team32S != null) {
		    	out.println(team32S);
		    }else {
		    	out.println("0");
		    }
		    out.close();
		} catch (IOException e) {
			System.out.println("Error: " + e);
		}
	}
	
	@Override
	public void handle(ActionEvent event) {
		try {
			if(event.getSource() == submitB) {
				if(team1CB.getSelectionModel().getSelectedItem() != null) {
					team1S = team1CB.getSelectionModel().getSelectedItem();
				} else {
					team1S = null;
				}
				if(team2CB.getSelectionModel().getSelectedItem() != null) {
					team2S = team2CB.getSelectionModel().getSelectedItem();
				} else {
					team2S = null;
				}
				if(team3CB.getSelectionModel().getSelectedItem() != null) {
					team3S = team3CB.getSelectionModel().getSelectedItem();
				} else {
					team3S = null;
				}
				if(team4CB.getSelectionModel().getSelectedItem() != null) {
					team4S = team4CB.getSelectionModel().getSelectedItem();
				} else {
					team4S = null;
				}
				if(team5CB.getSelectionModel().getSelectedItem() != null) {
					team5S = team5CB.getSelectionModel().getSelectedItem();
				} else {
					team5S = null;
				}
				if(team6CB.getSelectionModel().getSelectedItem() != null) {
					team6S = team6CB.getSelectionModel().getSelectedItem();
				} else {
					team6S = null;
				}
				if(team7CB.getSelectionModel().getSelectedItem() != null) {
					team7S = team7CB.getSelectionModel().getSelectedItem();
				} else {
					team7S = null;
				}
				if(team8CB.getSelectionModel().getSelectedItem() != null) {
					team8S = team8CB.getSelectionModel().getSelectedItem();
				} else {
					team8S = null;
				}
				if(team9CB.getSelectionModel().getSelectedItem() != null) {
					team9S = team9CB.getSelectionModel().getSelectedItem();
				} else {
					team9S = null;
				}
				if(team10CB.getSelectionModel().getSelectedItem() != null) {
					team10S = team10CB.getSelectionModel().getSelectedItem();
				} else {
					team10S = null;
				}
				if(team11CB.getSelectionModel().getSelectedItem() != null) {
					team11S = team11CB.getSelectionModel().getSelectedItem();
				} else {
					team11S = null;
				}
				if(team12CB.getSelectionModel().getSelectedItem() != null) {
					team12S = team12CB.getSelectionModel().getSelectedItem();
				} else {
					team12S = null;
				}
				if(team13CB.getSelectionModel().getSelectedItem() != null) {
					team13S = team13CB.getSelectionModel().getSelectedItem();
				} else {
					team13S = null;
				}
				if(team14CB.getSelectionModel().getSelectedItem() != null) {
					team14S = team14CB.getSelectionModel().getSelectedItem();
				} else {
					team14S = null;
				}
				if(team15CB.getSelectionModel().getSelectedItem() != null) {
					team15S = team15CB.getSelectionModel().getSelectedItem();
				} else {
					team15S = null;
				}
				if(team16CB.getSelectionModel().getSelectedItem() != null) {
					team16S = team16CB.getSelectionModel().getSelectedItem();
				} else {
					team16S = null;
				}
				if(team17CB.getSelectionModel().getSelectedItem() != null) {
					team17S = team17CB.getSelectionModel().getSelectedItem();
				} else {
					team17S = null;
				}
				if(team18CB.getSelectionModel().getSelectedItem() != null) {
					team18S = team18CB.getSelectionModel().getSelectedItem();
				} else {
					team18S = null;
				}
				if(team19CB.getSelectionModel().getSelectedItem() != null) {
					team19S = team19CB.getSelectionModel().getSelectedItem();
				} else {
					team19S = null;
				}
				if(team20CB.getSelectionModel().getSelectedItem() != null) {
					team20S = team20CB.getSelectionModel().getSelectedItem();
				} else {
					team20S = null;
				}
				if(team21CB.getSelectionModel().getSelectedItem() != null) {
					team21S = team21CB.getSelectionModel().getSelectedItem();
				} else {
					team21S = null;
				}
				if(team22CB.getSelectionModel().getSelectedItem() != null) {
					team22S = team22CB.getSelectionModel().getSelectedItem();
				} else {
					team22S = null;
				}
				if(team23CB.getSelectionModel().getSelectedItem() != null) {
					team23S = team23CB.getSelectionModel().getSelectedItem();
				} else {
					team23S = null;
				}
				if(team24CB.getSelectionModel().getSelectedItem() != null) {
					team24S = team24CB.getSelectionModel().getSelectedItem();
				} else {
					team24S = null;
				}
				if(team25CB.getSelectionModel().getSelectedItem() != null) {
					team25S = team25CB.getSelectionModel().getSelectedItem();
				} else {
					team25S = null;
				}
				if(team26CB.getSelectionModel().getSelectedItem() != null) {
					team26S = team26CB.getSelectionModel().getSelectedItem();
				} else {
					team26S = null;
				}
				if(team27CB.getSelectionModel().getSelectedItem() != null) {
					team27S = team27CB.getSelectionModel().getSelectedItem();
				} else {
					team27S = null;
				}
				if(team28CB.getSelectionModel().getSelectedItem() != null) {
					team28S = team28CB.getSelectionModel().getSelectedItem();
				} else {
					team28S = null;
				}
				if(team29CB.getSelectionModel().getSelectedItem() != null) {
					team29S = team29CB.getSelectionModel().getSelectedItem();
				} else {
					team29S = null;
				}
				if(team30CB.getSelectionModel().getSelectedItem() != null) {
					team30S = team30CB.getSelectionModel().getSelectedItem();
				} else {
					team30S = null;
				}
				if(team31CB.getSelectionModel().getSelectedItem() != null) {
					team31S = team31CB.getSelectionModel().getSelectedItem();
				} else {
					team31S = null;
				}
				if(team32CB.getSelectionModel().getSelectedItem() != null) {
					team32S = team32CB.getSelectionModel().getSelectedItem();
				} else {
					team32S = null;
				}
				exportTeamsNums();
			}
			
			
		} catch(Exception e) {
			System.out.println("Error: " + e);
		}
		
	}
}
