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
import javafx.scene.layout.GridPane;

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
		Label A2L = new Label("Allince 2 Teams:");
		Label A3L = new Label("Allince 3 Teams:");
		Label A4L = new Label("Allince 4 Teams:");
		Label A5L = new Label("Allince 5 Teams:");
		Label A6L = new Label("Allince 6 Teams:");
		Label A7L = new Label("Allince 7 Teams:");
		Label A8L = new Label("Allince 8 Teams:");
		/*Label A1T1L = new Label("Team 1:");
		Label A1T1L = new Label("Team 1:");
		Label A1T1L = new Label("Team 1:");
		Label A1T1L = new Label("Team 1:");
		Label A1T1L = new Label("Team 1:");
		Label A1T1L = new Label("Team 1:");
		Label A1T1L = new Label("Team 1:");
		Label A1T1L = new Label("Team 1:");
		Label A1T1L = new Label("Team 1:");
		Label A1T1L = new Label("Team 1:");
		Label A1T1L = new Label("Team 1:");
		*/
		this.add(new Label("Allince 1 Teams:   "), 0, 0);
		this.add(new Label("Team 1:   "), 1, 0);
		this.add(new Label("Team 2;   "), 2, 0);
		this.add(new Label("Team 3:   "), 3, 0);
		this.add(new Label("Team 4:   "), 4, 0);
		this.add(new Label("Allince 2 Teams:   "), 0, 2);
		this.add(new Label("Team 1:   "), 1, 2);
		this.add(new Label("Team 2;   "), 2, 2);
		this.add(new Label("Team 3:   "), 3, 2);
		this.add(new Label("Team 4:   "), 4, 2);
		this.add(new Label("Allince 3 Teams:   "), 0, 4);
		this.add(new Label("Team 1:   "), 1, 4);
		this.add(new Label("Team 2;   "), 2, 4);
		this.add(new Label("Team 3:   "), 3, 4);
		this.add(new Label("Team 4:   "), 4, 4);
		this.add(new Label("Allince 4 Teams:   "), 0, 6);
		this.add(new Label("Team 1:   "), 1, 6);
		this.add(new Label("Team 2;   "), 2, 6);
		this.add(new Label("Team 3:   "), 3, 6);
		this.add(new Label("Team 4:   "), 4, 6);
		this.add(new Label("Allince 5 Teams:   "), 0, 8);
		this.add(new Label("Team 1:   "), 1, 8);
		this.add(new Label("Team 2;   "), 2, 8);
		this.add(new Label("Team 3:   "), 3, 8);
		this.add(new Label("Team 4:   "), 4, 8);
		this.add(new Label("Allince 6 Teams:   "), 0, 10);
		this.add(new Label("Team 1:   "), 1, 10);
		this.add(new Label("Team 2;   "), 2, 10);
		this.add(new Label("Team 3:   "), 3, 10);
		this.add(new Label("Team 4:   "), 4, 10);
		this.add(new Label("Allince 7 Teams:   "), 0, 12);
		this.add(new Label("Team 1:   "), 1, 12);
		this.add(new Label("Team 2;   "), 2, 12);
		this.add(new Label("Team 3:   "), 3, 12);
		this.add(new Label("Team 4:   "), 4, 12);
		this.add(new Label("Allince 8 Teams:   "), 0, 14);
		this.add(new Label("Team 1:   "), 1, 14);
		this.add(new Label("Team 2;   "), 2, 14);
		this.add(new Label("Team 3:   "), 3, 14);
		this.add(new Label("Team 4:   "), 4, 14);
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
		//adding them to the gui
		this.add(team1CB, 1, 1);
		this.add(team2CB, 2, 1);
		this.add(team3CB, 3, 1);
		this.add(team25CB, 4, 1);
		this.add(team4CB, 1, 3);
		this.add(team5CB, 2, 3);
		this.add(team6CB, 3, 3);
		this.add(team26CB, 4, 3);
		this.add(team7CB, 1, 5);
		this.add(team8CB, 2, 5);
		this.add(team9CB, 3, 5);
		this.add(team27CB, 4, 5);
		this.add(team10CB, 1, 7);
		this.add(team11CB, 2, 7);
		this.add(team12CB, 3, 7);
		this.add(team28CB, 4, 7);
		this.add(team13CB, 1, 9);
		this.add(team14CB, 2, 9);
		this.add(team15CB, 3, 9);
		this.add(team29CB, 4, 9);
		this.add(team16CB, 1, 11);
		this.add(team17CB, 2, 11);
		this.add(team18CB, 3, 11);
		this.add(team30CB, 4, 11);
		this.add(team19CB, 1, 13);
		this.add(team20CB, 2, 13);
		this.add(team21CB, 3, 13);
		this.add(team31CB, 4, 13);
		this.add(team22CB, 1, 15);
		this.add(team23CB, 2, 15);
		this.add(team24CB, 3, 15);
		this.add(team32CB, 4, 15);
		submitB = new Button("Submit");
		submitB.setOnAction(this);
		this.add(submitB, 4, 0);
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
