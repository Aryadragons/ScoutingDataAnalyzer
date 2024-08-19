package application;

import java.util.List;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class compareAlliancesTab extends GridPane{
	
	private ComboBox<String> allince1T1CB;
	private ComboBox<String> allince1T2CB;
	private ComboBox<String> allince1T3CB;
	private ComboBox<String> allince2T1CB;
	private ComboBox<String> allince2T2CB;
	private ComboBox<String> allince2T3CB;
	private ComboBox<String> allince3T1CB;
	private ComboBox<String> allince3T2CB;
	private ComboBox<String> allince3T3CB;
	private ComboBox<String> allince1CB;
	private ComboBox<String> allince2CB;
	private ComboBox<String> allince3CB;
	private Button submitNonB;
	private List<Integer> listOfTeamNums;
	private TeamList theTL;
	private PlayoffAlliances thePOA;
	private DriveTeamDataList theDTD;
	private DriveTeamCommentsList theDTC;
	
	public compareAlliancesTab(boolean isPlayoffTime, List<Integer> importedListOfTeamNums, TeamList imTL, PlayoffAlliances imPlayoffAlls, DriveTeamDataList imDTD, DriveTeamCommentsList imDTC) {
		listOfTeamNums = importedListOfTeamNums;
		theTL = imTL;
		thePOA = imPlayoffAlls;
		theDTD = imDTD;
		theDTC = imDTC;
		if(isPlayoffTime == false) {
			Label a1T1L = new Label("Select the 1st team on Allince 1");
			Label a1T2L = new Label("Select the 2nd team on Allince 1");
			Label a1T3L = new Label("Select the 3rd team on Allince 1");
			Label a2T1L = new Label("Select the 1st team on Allince 2");
			Label a2T2L = new Label("Select the 2nd team on Allince 2");
			Label a2T3L = new Label("Select the 3rd team on Allince 2");
			Label a3T1L = new Label("Select the 1st team on Allince 3");
			Label a3T2L = new Label("Select the 2nd team on Allince 3");
			Label a3T3L = new Label("Select the 3rd team on Allince 3");
			a1T1L.setId("smallTitle");
			a1T2L.setId("smallTitle");
			a1T3L.setId("smallTitle");
			a2T1L.setId("smallTitle");
			a2T2L.setId("smallTitle");
			a2T3L.setId("smallTitle");
			a3T1L.setId("smallTitle");
			a3T2L.setId("smallTitle");
			a3T3L.setId("smallTitle");
			allince1T1CB = new ComboBox<String>();
			allince1T2CB = new ComboBox<String>();
			allince1T3CB = new ComboBox<String>();
			allince2T1CB = new ComboBox<String>();
			allince2T2CB = new ComboBox<String>();
			allince2T3CB = new ComboBox<String>();
			allince3T1CB = new ComboBox<String>();
			allince3T2CB = new ComboBox<String>();
			allince3T3CB = new ComboBox<String>();
			addComboBoxItems(allince1T1CB);
			addComboBoxItems(allince1T2CB);
			addComboBoxItems(allince1T3CB);
			addComboBoxItems(allince2T1CB);
			addComboBoxItems(allince2T2CB);
			addComboBoxItems(allince2T3CB);
			addComboBoxItems(allince3T1CB);
			addComboBoxItems(allince3T2CB);
			addComboBoxItems(allince3T3CB);
			BorderPane a1T1  = new BorderPane();
			BorderPane a1T2  = new BorderPane();
			BorderPane a1T3  = new BorderPane();
			BorderPane a2T1  = new BorderPane();
			BorderPane a2T2  = new BorderPane();
			BorderPane a2T3  = new BorderPane();
			BorderPane a3T1  = new BorderPane();
			BorderPane a3T2  = new BorderPane();
			BorderPane a3T3  = new BorderPane();
			a1T1.setTop(a1T1L);
			a1T2.setTop(a1T2L);
			a1T3.setTop(a1T3L);
			a2T1.setTop(a2T1L);
			a2T2.setTop(a2T2L);
			a2T3.setTop(a2T3L);
			a3T1.setTop(a3T1L);
			a3T2.setTop(a3T2L);
			a3T3.setTop(a3T3L);
			a1T1.setCenter(allince1T1CB);
			a1T2.setCenter(allince1T2CB);
			a1T3.setCenter(allince1T3CB);
			a2T1.setCenter(allince2T1CB);
			a2T2.setCenter(allince2T2CB);
			a2T3.setCenter(allince2T3CB);
			a3T1.setCenter(allince3T1CB);
			a3T2.setCenter(allince3T2CB);
			a3T3.setCenter(allince3T3CB);
			a1T1.setId("comAllselBP1");
			a1T2.setId("comAllselBP2");
			a1T3.setId("comAllselBP3");
			a2T1.setId("comAllselBP2");
			a2T2.setId("comAllselBP3");
			a2T3.setId("comAllselBP4");
			a3T1.setId("comAllselBP3");
			a3T2.setId("comAllselBP4");
			a3T3.setId("comAllselBP5");
			this.add(new Label("    "), 0, 0);
			this.add(new Label("    "), 2, 0);
			this.add(new Label("    "), 4, 0);
			this.add(new Label("    "), 0, 2);
			this.add(new Label("    "), 0, 4);
			this.add(new Label("    "), 0, 6);
			this.add(a1T1, 1, 1);
			this.add(a1T2, 3, 1);
			this.add(a1T3, 5, 1);
			this.add(a2T1, 1, 3);
			this.add(a2T2, 3, 3);
			this.add(a2T3, 5, 3);
			this.add(a3T1, 1, 5);
			this.add(a3T2, 3, 5);
			this.add(a3T3, 5, 5);
			//adding button
			submitNonB = new Button("Submit");
			this.add(submitNonB, 1, 7);
		}else {
			Label a1L = new Label("Select the 1st Allince");
			Label a2L = new Label("Select the 2nd Allince");
			Label a3L = new Label("Select the 3rd Allince");
			a1L.setId("smallTitle");
			a2L.setId("smallTitle");
			a3L.setId("smallTitle");
			allince1CB = new ComboBox<String>();
			allince2CB = new ComboBox<String>();
			allince3CB = new ComboBox<String>();
			addComboBoxItems(allince1CB);
			addComboBoxItems(allince2CB);
			addComboBoxItems(allince3CB);
			BorderPane a1  = new BorderPane();
			BorderPane a2  = new BorderPane();
			BorderPane a3  = new BorderPane();
			a1.setTop(a1L);
			a2.setTop(a2L);
			a3.setTop(a3L);
			a1.setCenter(allince1CB);
			a2.setCenter(allince2CB);
			a3.setCenter(allince3CB);
			a1.setId("comAllselBP1");
			a2.setId("comAllselBP2");
			a3.setId("comAllselBP3");
			this.add(new Label("    "), 0, 0);
			this.add(new Label("    "), 2, 0);
			this.add(new Label("    "), 4, 0);
			this.add(new Label("    "), 0, 2);
			this.add(a1T1, 1, 1);
			this.add(a1T2, 3, 1);
			this.add(a1T3, 5, 1);
		}
	}
	
	private void addComboBoxItems(ComboBox<String> temp) {
		String teamNumS;
		for (int i = 0; i < listOfTeamNums.size(); i++) {
			if (listOfTeamNums.get(i) != null) {
				teamNumS = Integer.toString(listOfTeamNums.get(i));
				temp.getItems().add(teamNumS);
			}
		}
	}
	
}
