package application;

import java.util.ArrayList;
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
import javafx.scene.layout.VBox;

public class searchMatchTab extends GridPane implements EventHandler<ActionEvent>{
	
	private Button submitNonB;
	private Button submitPlayB;
	private ComboBox<String> teamCB;
	private ComboBox<String> allCB;
	private TextField matchNumTF;
	private ComboBox<String> isPracCB;
	private ComboBox<String> isReplayCB;
	private List<Integer> listOfTeamNums;
	private MatchList mainML;
	private TeamList theTL;
	private PlayoffAlliances thePOA;
	
	public searchMatchTab(List<Integer> importedListOfTeamNums, boolean imIsPlayoff, MatchList imML, TeamList imTeamList, PlayoffAlliances imPlayAll) {
		listOfTeamNums = importedListOfTeamNums;
		mainML = imML;
		theTL = imTeamList;
		thePOA = imPlayAll;
		if(imIsPlayoff == false) {
			Label selTeamL = new Label("Select Team:");
			Label selMatchNumL = new Label("Select Match Number:");
			Label selPracMatchL = new Label("Is It a Practice Match?");
			Label selRePlayL = new Label("Is It a Match Replay");
			selTeamL.setId("smallTitle");
			selMatchNumL.setId("smallTitle");
			selPracMatchL.setId("smallTitle");
			selRePlayL.setId("smallTitle");
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
			selTeamBP.setCenter(teamCB);
			selMatchNumBP.setCenter(matchNumTF);
			selPracBP.setCenter(isPracCB);
			selRePlayBP.setCenter(isReplayCB);
			selTeamBP.setId("seMSelBp1");
			selMatchNumBP.setId("seMSelBp2");
			selPracBP.setId("seMSelBp3");
			selRePlayBP.setId("seMSelBp4");
			HBox selHB = new HBox(5);
			selHB.getChildren().addAll(selTeamBP, selMatchNumBP, selPracBP, selRePlayBP);
			this.add(new Label("    "), 0, 0);
			this.add(new Label("    "), 2, 0);
			this.add(selHB, 1, 1);
			this.add(submitNonB, 1, 3);
		}else {
			Label selTeamL = new Label("Select Alliance:  ");
			Label selMatchNumL = new Label("Select Match Number:  ");
			Label selRePlayL = new Label("Is It a Match Replay");
			selTeamL.setId("smallTitle");
			selMatchNumL.setId("smallTitle");
			selRePlayL.setId("smallTitle");
			submitPlayB = new Button("Submit");
			submitPlayB.setOnAction(this);
			BorderPane selTeamBP = new BorderPane();
			BorderPane selMatchNumBP = new BorderPane();
			BorderPane selRePlayBP = new BorderPane();
			allCB = new ComboBox<String>();
			addAllComboBoxItems();
			matchNumTF = new TextField();
			isReplayCB = new ComboBox<String>();
			isReplayCB.getItems().addAll("Yes", "No");
			selTeamBP.setTop(selTeamL);
			selMatchNumBP.setTop(selMatchNumL);
			selRePlayBP.setTop(selRePlayL);
			selTeamBP.setCenter(teamCB);
			selMatchNumBP.setCenter(matchNumTF);
			selRePlayBP.setCenter(isReplayCB);
			selTeamBP.setId("seMSelBp1");
			selMatchNumBP.setId("seMSelBp2");
			selRePlayBP.setId("seMSelBp3");
			HBox selHB = new HBox(5);
			selHB.getChildren().addAll(selTeamBP, selMatchNumBP, selRePlayBP);
			this.add(new Label("    "), 0, 0);
			this.add(new Label("    "), 2, 0);
			this.add(new Label("    "), 2, 1);
			this.add(new Label("    "), 2, 2);
			this.add(new Label("    "), 2, 3);
			this.add(new Label("    "), 2, 4);
			this.add(new Label("    "), 2, 5);
			this.add(new Label("    "), 2, 6);
			this.add(new Label("    "), 2, 7);
			this.add(new Label("    "), 2, 8);
			this.add(new Label("    "), 2, 9);
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
	
	public void addAllComboBoxItems() {
		if(thePOA.getAlliance1() != null) {
			System.out.println("BoopSeAll0");
			allCB.getItems().add("1");
		}
		if(thePOA.getAlliance2() != null) {
			System.out.println("BoopSeAll1");
			allCB.getItems().add("2");
		}
		if(thePOA.getAlliance3() != null) {
			System.out.println("BoopSeAll2");
			allCB.getItems().add("3");
		}
		if(thePOA.getAlliance4() != null) {
			allCB.getItems().add("4");
		}
		if(thePOA.getAlliance5() != null) {
			allCB.getItems().add("5");
		}
		if(thePOA.getAlliance6() != null) {
			allCB.getItems().add("6");
		}
		if(thePOA.getAlliance7() != null) {
			allCB.getItems().add("7");
		}
		if(thePOA.getAlliance8() != null) {
			allCB.getItems().add("8");
		}
	}
	
	public void setPlayoffStuff(int selAll, int matchNum, boolean isRePlay) {
		int mainTeamNum1 = 0;
		int mainTeamNum2 = 0;
		int mainTeamNum3 = 0;
		int mainTeamNum4 = 0;
		Team mainTeam1;
		Team mainTeam2;
		Team mainTeam3;
		Team mainTeam4;
		int nonTeamNum1 = 0;
		int nonTeamNum2 = 0;
		int nonTeamNum3 = 0;
		int nonTeamNum4 = 0;
		Team nonTeam1;
		Team nonTeam2;
		Team nonTeam3;
		Team nonTeam4;
		if(selAll == 1) {
			mainTeamNum1 = thePOA.getAlliance1().getTeam1().getTeamNum();
			mainTeamNum2 = thePOA.getAlliance1().getTeam2().getTeamNum();
			mainTeamNum3 = thePOA.getAlliance1().getTeam3().getTeamNum();
			mainTeamNum4 = thePOA.getAlliance1().getTeam4().getTeamNum();
			if(mainTeamNum1 != 0) {
				mainTeam1 = theTL.getATeam(mainTeamNum1);
			}
			if(mainTeamNum2 != 0) {
				mainTeam2 = theTL.getATeam(mainTeamNum2);
			}
			if(mainTeamNum3 != 0) {
				mainTeam3 = theTL.getATeam(mainTeamNum3);
			}
			if(mainTeamNum4 != 0) {
				mainTeam4 = theTL.getATeam(mainTeamNum4);
			}
		}
		if(selAll == 2) {
			mainTeamNum1 = thePOA.getAlliance2().getTeam1().getTeamNum();
			mainTeamNum2 = thePOA.getAlliance2().getTeam2().getTeamNum();
			mainTeamNum3 = thePOA.getAlliance2().getTeam3().getTeamNum();
			mainTeamNum4 = thePOA.getAlliance2().getTeam4().getTeamNum();
			if(mainTeamNum1 != 0) {
				mainTeam1 = theTL.getATeam(mainTeamNum1);
			}
			if(mainTeamNum2 != 0) {
				mainTeam2 = theTL.getATeam(mainTeamNum2);
			}
			if(mainTeamNum3 != 0) {
				mainTeam3 = theTL.getATeam(mainTeamNum3);
			}
			if(mainTeamNum4 != 0) {
				mainTeam4 = theTL.getATeam(mainTeamNum4);
			}
		}
		if(selAll == 3) {
			mainTeamNum1 = thePOA.getAlliance3().getTeam1().getTeamNum();
			mainTeamNum2 = thePOA.getAlliance3().getTeam2().getTeamNum();
			mainTeamNum3 = thePOA.getAlliance3().getTeam3().getTeamNum();
			mainTeamNum4 = thePOA.getAlliance3().getTeam4().getTeamNum();
			if(mainTeamNum1 != 0) {
				mainTeam1 = theTL.getATeam(mainTeamNum1);
			}
			if(mainTeamNum2 != 0) {
				mainTeam2 = theTL.getATeam(mainTeamNum2);
			}
			if(mainTeamNum3 != 0) {
				mainTeam3 = theTL.getATeam(mainTeamNum3);
			}
			if(mainTeamNum4 != 0) {
				mainTeam4 = theTL.getATeam(mainTeamNum4);
			}
		}
		if(selAll == 4) {
			mainTeamNum1 = thePOA.getAlliance4().getTeam1().getTeamNum();
			mainTeamNum2 = thePOA.getAlliance4().getTeam2().getTeamNum();
			mainTeamNum3 = thePOA.getAlliance4().getTeam3().getTeamNum();
			mainTeamNum4 = thePOA.getAlliance4().getTeam4().getTeamNum();
			if(mainTeamNum1 != 0) {
				mainTeam1 = theTL.getATeam(mainTeamNum1);
			}
			if(mainTeamNum2 != 0) {
				mainTeam2 = theTL.getATeam(mainTeamNum2);
			}
			if(mainTeamNum3 != 0) {
				mainTeam3 = theTL.getATeam(mainTeamNum3);
			}
			if(mainTeamNum4 != 0) {
				mainTeam4 = theTL.getATeam(mainTeamNum4);
			}
		}
		if(selAll == 5) {
			mainTeamNum1 = thePOA.getAlliance5().getTeam1().getTeamNum();
			mainTeamNum2 = thePOA.getAlliance5().getTeam2().getTeamNum();
			mainTeamNum3 = thePOA.getAlliance5().getTeam3().getTeamNum();
			mainTeamNum4 = thePOA.getAlliance5().getTeam4().getTeamNum();
			if(mainTeamNum1 != 0) {
				mainTeam1 = theTL.getATeam(mainTeamNum1);
			}
			if(mainTeamNum2 != 0) {
				mainTeam2 = theTL.getATeam(mainTeamNum2);
			}
			if(mainTeamNum3 != 0) {
				mainTeam3 = theTL.getATeam(mainTeamNum3);
			}
			if(mainTeamNum4 != 0) {
				mainTeam4 = theTL.getATeam(mainTeamNum4);
			}
		}
		if(selAll == 6) {
			mainTeamNum1 = thePOA.getAlliance6().getTeam1().getTeamNum();
			mainTeamNum2 = thePOA.getAlliance6().getTeam2().getTeamNum();
			mainTeamNum3 = thePOA.getAlliance6().getTeam3().getTeamNum();
			mainTeamNum4 = thePOA.getAlliance6().getTeam4().getTeamNum();
			if(mainTeamNum1 != 0) {
				mainTeam1 = theTL.getATeam(mainTeamNum1);
			}
			if(mainTeamNum2 != 0) {
				mainTeam2 = theTL.getATeam(mainTeamNum2);
			}
			if(mainTeamNum3 != 0) {
				mainTeam3 = theTL.getATeam(mainTeamNum3);
			}
			if(mainTeamNum4 != 0) {
				mainTeam4 = theTL.getATeam(mainTeamNum4);
			}
		}
		if(selAll == 7) {
			mainTeamNum1 = thePOA.getAlliance7().getTeam1().getTeamNum();
			mainTeamNum2 = thePOA.getAlliance7().getTeam2().getTeamNum();
			mainTeamNum3 = thePOA.getAlliance7().getTeam3().getTeamNum();
			mainTeamNum4 = thePOA.getAlliance7().getTeam4().getTeamNum();
			if(mainTeamNum1 != 0) {
				mainTeam1 = theTL.getATeam(mainTeamNum1);
			}
			if(mainTeamNum2 != 0) {
				mainTeam2 = theTL.getATeam(mainTeamNum2);
			}
			if(mainTeamNum3 != 0) {
				mainTeam3 = theTL.getATeam(mainTeamNum3);
			}
			if(mainTeamNum4 != 0) {
				mainTeam4 = theTL.getATeam(mainTeamNum4);
			}
		}
		if(selAll == 8) {
			mainTeamNum1 = thePOA.getAlliance8().getTeam1().getTeamNum();
			mainTeamNum2 = thePOA.getAlliance8().getTeam2().getTeamNum();
			mainTeamNum3 = thePOA.getAlliance8().getTeam3().getTeamNum();
			mainTeamNum4 = thePOA.getAlliance8().getTeam4().getTeamNum();
			if(mainTeamNum1 != 0) {
				mainTeam1 = theTL.getATeam(mainTeamNum1);
			}
			if(mainTeamNum2 != 0) {
				mainTeam2 = theTL.getATeam(mainTeamNum2);
			}
			if(mainTeamNum3 != 0) {
				mainTeam3 = theTL.getATeam(mainTeamNum3);
			}
			if(mainTeamNum4 != 0) {
				mainTeam4 = theTL.getATeam(mainTeamNum4);
			}
		}
		List<Match> allsMatch = mainML.getMatchFromFullList(matchNum, true);
		List<Match> blueTeams =  new ArrayList<>();
		List<Match> redTeams =  new ArrayList<>();
		Boolean mainColor = null;
		boolean isRedTeam1 = false;
		boolean isRedTeam2 = false;
		boolean isRedTeam3 = false;
		boolean isRedTeam4 = false;
		boolean isBlueTeam1 = false;
		boolean isBlueTeam2 = false;
		boolean isBlueTeam3 = false;
		boolean isBlueTeam4 = false;
		for(int i = 0; i < allsMatch.size(); i++) {
			Match m = allsMatch.get(i);
			boolean mColor = m.getAllianceColor();
			if(m.getMatchTeamNum() == mainTeamNum1) {
				mainColor = mColor;
				if(mainColor == false) {
					blueTeams.add(m);
					isBlueTeam1 = true;
				}else {
					redTeams.add(m);
					isRedTeam1 = true;
				}
			}else if(m.getMatchTeamNum() == mainTeamNum2){
				mainColor = mColor;
				if(mainColor == false) {
					blueTeams.add(m);
					isBlueTeam2 = true;
				}else {
					redTeams.add(m);
					isRedTeam2 = true;
				}
			}else if(m.getMatchTeamNum() == mainTeamNum3){
				mainColor = mColor;
				if(mainColor == false) {
					blueTeams.add(m);
					isBlueTeam3 = true;
				}else {
					redTeams.add(m);
					isRedTeam3 = true;
				}
			}else if(m.getMatchTeamNum() == mainTeamNum4){
				mainColor = mColor;
				if(mainColor == false) {
					blueTeams.add(m);
					isBlueTeam4 = true;
				}else {
					redTeams.add(m);
					isRedTeam4 = true;
				}
			}else {
				if(mColor == false) {
					blueTeams.add(m);
				}else {
					redTeams.add(m);
				}
			}
		}
		int nonAllNum;
		HBox blueHB = new HBox(6);
		HBox redHB = new HBox(6);
		if(mainColor = false) {
			nonAllNum = findNonAll(redTeams.get(0).getMatchTeamNum());
			if(nonAllNum == 1) {
				for(int i = 0; i < redTeams.size(); i++) {
					if(redTeams.get(i).getMatchTeamNum() == thePOA.getAlliance1().getTeam1().getTeamNum()) {
						isRedTeam1 = true;
						 nonTeamNum1 = redTeams.get(i).getMatchTeamNum();
						 nonTeam1 = theTL.getATeam(nonTeamNum1);
					}
					if(redTeams.get(i).getMatchTeamNum() == thePOA.getAlliance1().getTeam2().getTeamNum()) {
						isRedTeam2 = true;
						nonTeamNum2 = redTeams.get(i).getMatchTeamNum();
						nonTeam2 = theTL.getATeam(nonTeamNum2);
					}
					if(redTeams.get(i).getMatchTeamNum() == thePOA.getAlliance1().getTeam3().getTeamNum()) {
						isRedTeam3 = true;
						nonTeamNum3 = redTeams.get(i).getMatchTeamNum();
						nonTeam3 = theTL.getATeam(nonTeamNum3);
					}
					if(redTeams.get(i).getMatchTeamNum() == thePOA.getAlliance1().getTeam4().getTeamNum()) {
						isRedTeam4 = true;
						nonTeamNum4 = redTeams.get(i).getMatchTeamNum();
						nonTeam4 = theTL.getATeam(nonTeamNum4);
					}
				}
			}
			if(nonAllNum == 2) {
				for(int i = 0; i < redTeams.size(); i++) {
					if(redTeams.get(i).getMatchTeamNum() == thePOA.getAlliance2().getTeam1().getTeamNum()) {
						isRedTeam1 = true;
						 nonTeamNum1 = redTeams.get(i).getMatchTeamNum();
						 nonTeam1 = theTL.getATeam(nonTeamNum1);
					}
					if(redTeams.get(i).getMatchTeamNum() == thePOA.getAlliance2().getTeam2().getTeamNum()) {
						isRedTeam2 = true;
						nonTeamNum2 = redTeams.get(i).getMatchTeamNum();
						nonTeam2 = theTL.getATeam(nonTeamNum2);
					}
					if(redTeams.get(i).getMatchTeamNum() == thePOA.getAlliance2().getTeam3().getTeamNum()) {
						isRedTeam3 = true;
						nonTeamNum3 = redTeams.get(i).getMatchTeamNum();
						nonTeam3 = theTL.getATeam(nonTeamNum3);
					}
					if(redTeams.get(i).getMatchTeamNum() == thePOA.getAlliance2().getTeam4().getTeamNum()) {
						isRedTeam4 = true;
						nonTeamNum4 = redTeams.get(i).getMatchTeamNum();
						nonTeam4 = theTL.getATeam(nonTeamNum4);
					}
				}
			}
			if(nonAllNum == 3) {
				for(int i = 0; i < redTeams.size(); i++) {
					if(redTeams.get(i).getMatchTeamNum() == thePOA.getAlliance3().getTeam1().getTeamNum()) {
						isRedTeam1 = true;
						 nonTeamNum1 = redTeams.get(i).getMatchTeamNum();
						 nonTeam1 = theTL.getATeam(nonTeamNum1);
					}
					if(redTeams.get(i).getMatchTeamNum() == thePOA.getAlliance3().getTeam2().getTeamNum()) {
						isRedTeam2 = true;
						nonTeamNum2 = redTeams.get(i).getMatchTeamNum();
						nonTeam2 = theTL.getATeam(nonTeamNum2);
					}
					if(redTeams.get(i).getMatchTeamNum() == thePOA.getAlliance3().getTeam3().getTeamNum()) {
						isRedTeam3 = true;
						nonTeamNum3 = redTeams.get(i).getMatchTeamNum();
						nonTeam3 = theTL.getATeam(nonTeamNum3);
					}
					if(redTeams.get(i).getMatchTeamNum() == thePOA.getAlliance3().getTeam4().getTeamNum()) {
						isRedTeam4 = true;
						nonTeamNum4 = redTeams.get(i).getMatchTeamNum();
						nonTeam4 = theTL.getATeam(nonTeamNum4);
					}
				}
			}
			if(nonAllNum == 4) {
				for(int i = 0; i < redTeams.size(); i++) {
					if(redTeams.get(i).getMatchTeamNum() == thePOA.getAlliance4().getTeam1().getTeamNum()) {
						isRedTeam1 = true;
						 nonTeamNum1 = redTeams.get(i).getMatchTeamNum();
						 nonTeam1 = theTL.getATeam(nonTeamNum1);
					}
					if(redTeams.get(i).getMatchTeamNum() == thePOA.getAlliance4().getTeam2().getTeamNum()) {
						isRedTeam2 = true;
						nonTeamNum2 = redTeams.get(i).getMatchTeamNum();
						nonTeam2 = theTL.getATeam(nonTeamNum2);
					}
					if(redTeams.get(i).getMatchTeamNum() == thePOA.getAlliance4().getTeam3().getTeamNum()) {
						isRedTeam3 = true;
						nonTeamNum3 = redTeams.get(i).getMatchTeamNum();
						nonTeam3 = theTL.getATeam(nonTeamNum3);
					}
					if(redTeams.get(i).getMatchTeamNum() == thePOA.getAlliance4().getTeam4().getTeamNum()) {
						isRedTeam4 = true;
						nonTeamNum4 = redTeams.get(i).getMatchTeamNum();
						nonTeam4 = theTL.getATeam(nonTeamNum4);
					}
				}
			}
			if(nonAllNum == 5) {
				for(int i = 0; i < redTeams.size(); i++) {
					if(redTeams.get(i).getMatchTeamNum() == thePOA.getAlliance5().getTeam1().getTeamNum()) {
						isRedTeam1 = true;
						 nonTeamNum1 = redTeams.get(i).getMatchTeamNum();
						 nonTeam1 = theTL.getATeam(nonTeamNum1);
					}
					if(redTeams.get(i).getMatchTeamNum() == thePOA.getAlliance5().getTeam2().getTeamNum()) {
						isRedTeam2 = true;
						nonTeamNum2 = redTeams.get(i).getMatchTeamNum();
						nonTeam2 = theTL.getATeam(nonTeamNum2);
					}
					if(redTeams.get(i).getMatchTeamNum() == thePOA.getAlliance5().getTeam3().getTeamNum()) {
						isRedTeam3 = true;
						nonTeamNum3 = redTeams.get(i).getMatchTeamNum();
						nonTeam3 = theTL.getATeam(nonTeamNum3);
					}
					if(redTeams.get(i).getMatchTeamNum() == thePOA.getAlliance5().getTeam4().getTeamNum()) {
						isRedTeam4 = true;
						nonTeamNum4 = redTeams.get(i).getMatchTeamNum();
						nonTeam4 = theTL.getATeam(nonTeamNum4);
					}
				}
			}
			if(nonAllNum == 6) {
				for(int i = 0; i < redTeams.size(); i++) {
					if(redTeams.get(i).getMatchTeamNum() == thePOA.getAlliance6().getTeam1().getTeamNum()) {
						isRedTeam1 = true;
						 nonTeamNum1 = redTeams.get(i).getMatchTeamNum();
						 nonTeam1 = theTL.getATeam(nonTeamNum1);
					}
					if(redTeams.get(i).getMatchTeamNum() == thePOA.getAlliance6().getTeam2().getTeamNum()) {
						isRedTeam2 = true;
						nonTeamNum2 = redTeams.get(i).getMatchTeamNum();
						nonTeam2 = theTL.getATeam(nonTeamNum2);
					}
					if(redTeams.get(i).getMatchTeamNum() == thePOA.getAlliance6().getTeam3().getTeamNum()) {
						isRedTeam3 = true;
						nonTeamNum3 = redTeams.get(i).getMatchTeamNum();
						nonTeam3 = theTL.getATeam(nonTeamNum3);
					}
					if(redTeams.get(i).getMatchTeamNum() == thePOA.getAlliance6().getTeam4().getTeamNum()) {
						isRedTeam4 = true;
						nonTeamNum4 = redTeams.get(i).getMatchTeamNum();
						nonTeam4 = theTL.getATeam(nonTeamNum4);
					}
				}
			}
			if(nonAllNum == 7) {
				for(int i = 0; i < redTeams.size(); i++) {
					if(redTeams.get(i).getMatchTeamNum() == thePOA.getAlliance7().getTeam1().getTeamNum()) {
						isRedTeam1 = true;
						 nonTeamNum1 = redTeams.get(i).getMatchTeamNum();
						 nonTeam1 = theTL.getATeam(nonTeamNum1);
					}
					if(redTeams.get(i).getMatchTeamNum() == thePOA.getAlliance7().getTeam2().getTeamNum()) {
						isRedTeam2 = true;
						nonTeamNum2 = redTeams.get(i).getMatchTeamNum();
						nonTeam2 = theTL.getATeam(nonTeamNum2);
					}
					if(redTeams.get(i).getMatchTeamNum() == thePOA.getAlliance7().getTeam3().getTeamNum()) {
						isRedTeam3 = true;
						nonTeamNum3 = redTeams.get(i).getMatchTeamNum();
						nonTeam3 = theTL.getATeam(nonTeamNum3);
					}
					if(redTeams.get(i).getMatchTeamNum() == thePOA.getAlliance7().getTeam4().getTeamNum()) {
						isRedTeam4 = true;
						nonTeamNum4 = redTeams.get(i).getMatchTeamNum();
						nonTeam4 = theTL.getATeam(nonTeamNum4);
					}
				}
			}
			if(nonAllNum == 8) {
				for(int i = 0; i < redTeams.size(); i++) {
					if(redTeams.get(i).getMatchTeamNum() == thePOA.getAlliance8().getTeam1().getTeamNum()) {
						isRedTeam1 = true;
						 nonTeamNum1 = redTeams.get(i).getMatchTeamNum();
						 nonTeam1 = theTL.getATeam(nonTeamNum1);
					}
					if(redTeams.get(i).getMatchTeamNum() == thePOA.getAlliance8().getTeam2().getTeamNum()) {
						isRedTeam2 = true;
						nonTeamNum2 = redTeams.get(i).getMatchTeamNum();
						nonTeam2 = theTL.getATeam(nonTeamNum2);
					}
					if(redTeams.get(i).getMatchTeamNum() == thePOA.getAlliance8().getTeam3().getTeamNum()) {
						isRedTeam3 = true;
						nonTeamNum3 = redTeams.get(i).getMatchTeamNum();
						nonTeam3 = theTL.getATeam(nonTeamNum3);
					}
					if(redTeams.get(i).getMatchTeamNum() == thePOA.getAlliance8().getTeam4().getTeamNum()) {
						isRedTeam4 = true;
						nonTeamNum4 = redTeams.get(i).getMatchTeamNum();
						nonTeam4 = theTL.getATeam(nonTeamNum4);
					}
				}
			}
		}else {
			nonAllNum = findNonAll(blueTeams.get(0).getMatchTeamNum());
			if(nonAllNum == 1) {
				for(int i = 0; i < blueTeams.size(); i++) {
					if(blueTeams.get(i).getMatchTeamNum() == thePOA.getAlliance1().getTeam1().getTeamNum()) {
						isBlueTeam1 = true;
						 nonTeamNum1 = blueTeams.get(i).getMatchTeamNum();
						 nonTeam1 = theTL.getATeam(nonTeamNum1);
					}
					if(blueTeams.get(i).getMatchTeamNum() == thePOA.getAlliance1().getTeam2().getTeamNum()) {
						isBlueTeam2 = true;
						nonTeamNum2 = blueTeams.get(i).getMatchTeamNum();
						nonTeam2 = theTL.getATeam(nonTeamNum2);
					}
					if(blueTeams.get(i).getMatchTeamNum() == thePOA.getAlliance1().getTeam3().getTeamNum()) {
						isBlueTeam3 = true;
						nonTeamNum3 = blueTeams.get(i).getMatchTeamNum();
						nonTeam3 = theTL.getATeam(nonTeamNum3);
					}
					if(redTeams.get(i).getMatchTeamNum() == thePOA.getAlliance1().getTeam4().getTeamNum()) {
						isBlueTeam4 = true;
						nonTeamNum4 = blueTeams.get(i).getMatchTeamNum();
						nonTeam4 = theTL.getATeam(nonTeamNum4);
					}
				}
			}
			if(nonAllNum == 2) {
				for(int i = 0; i < blueTeams.size(); i++) {
					if(blueTeams.get(i).getMatchTeamNum() == thePOA.getAlliance2().getTeam1().getTeamNum()) {
						isBlueTeam1 = true;
						 nonTeamNum1 = blueTeams.get(i).getMatchTeamNum();
						 nonTeam1 = theTL.getATeam(nonTeamNum1);
					}
					if(blueTeams.get(i).getMatchTeamNum() == thePOA.getAlliance2().getTeam2().getTeamNum()) {
						isBlueTeam2 = true;
						nonTeamNum2 = blueTeams.get(i).getMatchTeamNum();
						nonTeam2 = theTL.getATeam(nonTeamNum2);
					}
					if(blueTeams.get(i).getMatchTeamNum() == thePOA.getAlliance2().getTeam3().getTeamNum()) {
						isBlueTeam3 = true;
						nonTeamNum3 = blueTeams.get(i).getMatchTeamNum();
						nonTeam3 = theTL.getATeam(nonTeamNum3);
					}
					if(blueTeams.get(i).getMatchTeamNum() == thePOA.getAlliance2().getTeam4().getTeamNum()) {
						isBlueTeam4 = true;
						nonTeamNum4 = blueTeams.get(i).getMatchTeamNum();
						nonTeam4 = theTL.getATeam(nonTeamNum4);
					}
				}
			}
			if(nonAllNum == 3) {
				for(int i = 0; i < blueTeams.size(); i++) {
					if(blueTeams.get(i).getMatchTeamNum() == thePOA.getAlliance3().getTeam1().getTeamNum()) {
						isBlueTeam1 = true;
						 nonTeamNum1 = blueTeams.get(i).getMatchTeamNum();
						 nonTeam1 = theTL.getATeam(nonTeamNum1);
					}
					if(blueTeams.get(i).getMatchTeamNum() == thePOA.getAlliance3().getTeam2().getTeamNum()) {
						isBlueTeam2 = true;
						nonTeamNum2 = blueTeams.get(i).getMatchTeamNum();
						nonTeam2 = theTL.getATeam(nonTeamNum2);
					}
					if(blueTeams.get(i).getMatchTeamNum() == thePOA.getAlliance3().getTeam3().getTeamNum()) {
						isBlueTeam3 = true;
						nonTeamNum3 = blueTeams.get(i).getMatchTeamNum();
						nonTeam3 = theTL.getATeam(nonTeamNum3);
					}
					if(blueTeams.get(i).getMatchTeamNum() == thePOA.getAlliance3().getTeam4().getTeamNum()) {
						isBlueTeam4 = true;
						nonTeamNum4 = blueTeams.get(i).getMatchTeamNum();
						nonTeam4 = theTL.getATeam(nonTeamNum4);
					}
				}
			}
			if(nonAllNum == 4) {
				for(int i = 0; i < blueTeams.size(); i++) {
					if(blueTeams.get(i).getMatchTeamNum() == thePOA.getAlliance4().getTeam1().getTeamNum()) {
						isBlueTeam1 = true;
						 nonTeamNum1 = blueTeams.get(i).getMatchTeamNum();
						 nonTeam1 = theTL.getATeam(nonTeamNum1);
					}
					if(blueTeams.get(i).getMatchTeamNum() == thePOA.getAlliance4().getTeam2().getTeamNum()) {
						isBlueTeam2 = true;
						nonTeamNum2 = blueTeams.get(i).getMatchTeamNum();
						nonTeam2 = theTL.getATeam(nonTeamNum2);
					}
					if(blueTeams.get(i).getMatchTeamNum() == thePOA.getAlliance4().getTeam3().getTeamNum()) {
						isBlueTeam3 = true;
						nonTeamNum3 = blueTeams.get(i).getMatchTeamNum();
						nonTeam3 = theTL.getATeam(nonTeamNum3);
					}
					if(blueTeams.get(i).getMatchTeamNum() == thePOA.getAlliance4().getTeam4().getTeamNum()) {
						isBlueTeam4 = true;
						nonTeamNum4 = blueTeams.get(i).getMatchTeamNum();
						nonTeam4 = theTL.getATeam(nonTeamNum4);
					}
				}
			}
			if(nonAllNum == 5) {
				for(int i = 0; i < blueTeams.size(); i++) {
					if(blueTeams.get(i).getMatchTeamNum() == thePOA.getAlliance5().getTeam1().getTeamNum()) {
						isBlueTeam1 = true;
						 nonTeamNum1 = blueTeams.get(i).getMatchTeamNum();
						 nonTeam1 = theTL.getATeam(nonTeamNum1);
					}
					if(blueTeams.get(i).getMatchTeamNum() == thePOA.getAlliance5().getTeam2().getTeamNum()) {
						isBlueTeam2 = true;
						nonTeamNum2 = blueTeams.get(i).getMatchTeamNum();
						nonTeam2 = theTL.getATeam(nonTeamNum2);
					}
					if(blueTeams.get(i).getMatchTeamNum() == thePOA.getAlliance5().getTeam3().getTeamNum()) {
						isBlueTeam3 = true;
						nonTeamNum3 = blueTeams.get(i).getMatchTeamNum();
						nonTeam3 = theTL.getATeam(nonTeamNum3);
					}
					if(blueTeams.get(i).getMatchTeamNum() == thePOA.getAlliance5().getTeam4().getTeamNum()) {
						isBlueTeam4 = true;
						nonTeamNum4 = blueTeams.get(i).getMatchTeamNum();
						nonTeam4 = theTL.getATeam(nonTeamNum4);
					}
				}
			}
			if(nonAllNum == 6) {
				for(int i = 0; i < blueTeams.size(); i++) {
					if(blueTeams.get(i).getMatchTeamNum() == thePOA.getAlliance6().getTeam1().getTeamNum()) {
						isBlueTeam1 = true;
						 nonTeamNum1 = blueTeams.get(i).getMatchTeamNum();
						 nonTeam1 = theTL.getATeam(nonTeamNum1);
					}
					if(blueTeams.get(i).getMatchTeamNum() == thePOA.getAlliance6().getTeam2().getTeamNum()) {
						isBlueTeam2 = true;
						nonTeamNum2 = blueTeams.get(i).getMatchTeamNum();
						nonTeam2 = theTL.getATeam(nonTeamNum2);
					}
					if(blueTeams.get(i).getMatchTeamNum() == thePOA.getAlliance6().getTeam3().getTeamNum()) {
						isBlueTeam3 = true;
						nonTeamNum3 = blueTeams.get(i).getMatchTeamNum();
						nonTeam3 = theTL.getATeam(nonTeamNum3);
					}
					if(blueTeams.get(i).getMatchTeamNum() == thePOA.getAlliance6().getTeam4().getTeamNum()) {
						isBlueTeam4 = true;
						nonTeamNum4 = blueTeams.get(i).getMatchTeamNum();
						nonTeam4 = theTL.getATeam(nonTeamNum4);
					}
				}
			}
			if(nonAllNum == 7) {
				for(int i = 0; i < blueTeams.size(); i++) {
					if(blueTeams.get(i).getMatchTeamNum() == thePOA.getAlliance7().getTeam1().getTeamNum()) {
						isBlueTeam1 = true;
						 nonTeamNum1 = blueTeams.get(i).getMatchTeamNum();
						 nonTeam1 = theTL.getATeam(nonTeamNum1);
					}
					if(blueTeams.get(i).getMatchTeamNum() == thePOA.getAlliance7().getTeam2().getTeamNum()) {
						isBlueTeam2 = true;
						nonTeamNum2 = blueTeams.get(i).getMatchTeamNum();
						nonTeam2 = theTL.getATeam(nonTeamNum2);
					}
					if(blueTeams.get(i).getMatchTeamNum() == thePOA.getAlliance7().getTeam3().getTeamNum()) {
						isBlueTeam3 = true;
						nonTeamNum3 = blueTeams.get(i).getMatchTeamNum();
						nonTeam3 = theTL.getATeam(nonTeamNum3);
					}
					if(blueTeams.get(i).getMatchTeamNum() == thePOA.getAlliance7().getTeam4().getTeamNum()) {
						isBlueTeam4 = true;
						nonTeamNum4 = blueTeams.get(i).getMatchTeamNum();
						nonTeam4 = theTL.getATeam(nonTeamNum4);
					}
				}
			}
			if(nonAllNum == 8) {
				for(int i = 0; i < blueTeams.size(); i++) {
					if(blueTeams.get(i).getMatchTeamNum() == thePOA.getAlliance8().getTeam1().getTeamNum()) {
						isBlueTeam1 = true;
						 nonTeamNum1 = blueTeams.get(i).getMatchTeamNum();
						 nonTeam1 = theTL.getATeam(nonTeamNum1);
					}
					if(blueTeams.get(i).getMatchTeamNum() == thePOA.getAlliance8().getTeam2().getTeamNum()) {
						isBlueTeam2 = true;
						nonTeamNum2 = blueTeams.get(i).getMatchTeamNum();
						nonTeam2 = theTL.getATeam(nonTeamNum2);
					}
					if(blueTeams.get(i).getMatchTeamNum() == thePOA.getAlliance8().getTeam3().getTeamNum()) {
						isBlueTeam3 = true;
						nonTeamNum3 = blueTeams.get(i).getMatchTeamNum();
						nonTeam3 = theTL.getATeam(nonTeamNum3);
					}
					if(blueTeams.get(i).getMatchTeamNum() == thePOA.getAlliance8().getTeam4().getTeamNum()) {
						isBlueTeam4 = true;
						nonTeamNum4 = blueTeams.get(i).getMatchTeamNum();
						nonTeam4 = theTL.getATeam(nonTeamNum4);
					}
				}
			}
		}
	}
	
	public int findNonAll(int tempTeamNum) {
		if(thePOA.getAlliance1().getTeam1().getTeamNum() == tempTeamNum) {
			return 1;
		}
		if(thePOA.getAlliance1().getTeam2().getTeamNum() == tempTeamNum) {
			return 1;
		}
		if(thePOA.getAlliance1().getTeam3().getTeamNum() == tempTeamNum) {
			return 1;
		}
		if(thePOA.getAlliance1().getTeam4().getTeamNum() == tempTeamNum) {
			return 1;
		}
		if(thePOA.getAlliance2().getTeam1().getTeamNum() == tempTeamNum) {
			return 2;
		}
		if(thePOA.getAlliance2().getTeam2().getTeamNum() == tempTeamNum) {
			return 2;
		}
		if(thePOA.getAlliance2().getTeam3().getTeamNum() == tempTeamNum) {
			return 2;
		}
		if(thePOA.getAlliance2().getTeam4().getTeamNum() == tempTeamNum) {
			return 2;
		}
		if(thePOA.getAlliance3().getTeam1().getTeamNum() == tempTeamNum) {
			return 3;
		}
		if(thePOA.getAlliance3().getTeam2().getTeamNum() == tempTeamNum) {
			return 3;
		}
		if(thePOA.getAlliance3().getTeam3().getTeamNum() == tempTeamNum) {
			return 3;
		}
		if(thePOA.getAlliance3().getTeam4().getTeamNum() == tempTeamNum) {
			return 3;
		}
		if(thePOA.getAlliance4().getTeam1().getTeamNum() == tempTeamNum) {
			return 4;
		}
		if(thePOA.getAlliance4().getTeam2().getTeamNum() == tempTeamNum) {
			return 4;
		}
		if(thePOA.getAlliance4().getTeam3().getTeamNum() == tempTeamNum) {
			return 4;
		}
		if(thePOA.getAlliance4().getTeam4().getTeamNum() == tempTeamNum) {
			return 4;
		}
		if(thePOA.getAlliance5().getTeam1().getTeamNum() == tempTeamNum) {
			return 5;
		}
		if(thePOA.getAlliance5().getTeam2().getTeamNum() == tempTeamNum) {
			return 5;
		}
		if(thePOA.getAlliance5().getTeam3().getTeamNum() == tempTeamNum) {
			return 5;
		}
		if(thePOA.getAlliance5().getTeam4().getTeamNum() == tempTeamNum) {
			return 5;
		}
		if(thePOA.getAlliance6().getTeam1().getTeamNum() == tempTeamNum) {
			return 6;
		}
		if(thePOA.getAlliance6().getTeam2().getTeamNum() == tempTeamNum) {
			return 6;
		}
		if(thePOA.getAlliance6().getTeam3().getTeamNum() == tempTeamNum) {
			return 6;
		}
		if(thePOA.getAlliance6().getTeam4().getTeamNum() == tempTeamNum) {
			return 6;
		}
		if(thePOA.getAlliance7().getTeam1().getTeamNum() == tempTeamNum) {
			return 7;
		}
		if(thePOA.getAlliance7().getTeam2().getTeamNum() == tempTeamNum) {
			return 7;
		}
		if(thePOA.getAlliance7().getTeam3().getTeamNum() == tempTeamNum) {
			return 7;
		}
		if(thePOA.getAlliance7().getTeam4().getTeamNum() == tempTeamNum) {
			return 7;
		}
		if(thePOA.getAlliance8().getTeam1().getTeamNum() == tempTeamNum) {
			return 8;
		}
		if(thePOA.getAlliance8().getTeam2().getTeamNum() == tempTeamNum) {
			return 8;
		}
		if(thePOA.getAlliance8().getTeam3().getTeamNum() == tempTeamNum) {
			return 8;
		}
		if(thePOA.getAlliance8().getTeam4().getTeamNum() == tempTeamNum) {
			return 8;
		}
		return 0;
	}
	
	@Override
	public void handle(ActionEvent event) {
		try {
			//Blue = false, Red = true
			if(event.getSource() == submitNonB){
				this.getChildren().clear();
				this.add(new Label("    "), 0, 0);
				this.add(new Label("    "), 2, 0);
				this.add(new Label("    "), 2, 1);
				this.add(new Label("    "), 2, 2);
				this.add(new Label("    "), 2, 3);
				this.add(new Label("    "), 2, 4);
				this.add(new Label("    "), 2, 5);
				this.add(new Label("    "), 2, 6);
				this.add(new Label("    "), 2, 7);
				this.add(new Label("    "), 2, 8);
				this.add(new Label("    "), 2, 9);
				System.out.print("BoopseM0");
				String selTeamNumS = teamCB.getSelectionModel().getSelectedItem();
				String matchNumS = matchNumTF.getText();
				String isPracS = isPracCB.getSelectionModel().getSelectedItem();
				String isReplayS = isReplayCB.getSelectionModel().getSelectedItem();
				System.out.print("BoopseM1");
				int selTeamNum = Integer.parseInt(selTeamNumS);
				int matchNum = Integer.parseInt(matchNumS);
				boolean isPrac = Boolean.parseBoolean(isPracS);
				boolean isReplay = Boolean.parseBoolean(isReplayS);
				System.out.print("BoopseM2");
				List<Match> teamsMatch = mainML.getMatchFromFullList(matchNum, false);
				System.out.print("BoopseM3");
				List<Match> blueTeams =  new ArrayList<>();
				List<Match> redTeams =  new ArrayList<>();
				TeamList redTs = new TeamList();
				TeamList blueTs = new TeamList();
				Boolean mainColor = null;
				System.out.print("BoopseM4");
				for(int i = 0; i < teamsMatch.size(); i++) {
					System.out.print("BoopseM5");
					Match m = teamsMatch.get(i);
					boolean mColor = m.getAllianceColor();
					System.out.print("BoopseM6");
					if(mColor == false) {
						System.out.print("BoopseM7");
						blueTeams.add(m);
						blueTs.listOfTeams.add(theTL.getATeam(m.getMatchTeamNum()));
						if(m.getMatchTeamNum() == selTeamNum) {
							System.out.print("BoopseM8");
							mainColor = false;
						}
					}else {
						System.out.print("BoopseM9");
						redTeams.add(m);
						redTs.listOfTeams.add(theTL.getATeam(m.getMatchTeamNum()));
						if(m.getMatchTeamNum() == selTeamNum) {
							System.out.print("BoopseM10");
							mainColor = true;
						}
					}
				}
				System.out.print("BoopseM11");
				HBox blueHB = new HBox(6);
				HBox redHB = new HBox(6);
				System.out.print("BoopseM12Blue:" + blueTeams.size() + "Red:" + redTeams.size());
				
				if(blueTeams.size() == 3) {
					System.out.print("BoopseM13Blue3");
					int teamNum1 = blueTeams.get(0).getMatchTeamNum();
					int teamNum2 = blueTeams.get(1).getMatchTeamNum();
					int teamNum3 = blueTeams.get(2).getMatchTeamNum();
					Label blue1TeamNumL = new Label(Integer.toString(teamNum1) + "'s Stats");
					Label blue2TeamNumL = new Label(Integer.toString(teamNum2) + "'s Stats");
					Label blue3TeamNumL = new Label(Integer.toString(teamNum3) + "'s Stats");
					blue1TeamNumL.setId("smallTitle");
					blue2TeamNumL.setId("smallTitle");
					blue3TeamNumL.setId("smallTitle");
					BorderPane blue1TeamNumBP = new BorderPane();
					BorderPane blue2TeamNumBP = new BorderPane();
					BorderPane blue3TeamNumBP = new BorderPane();
					blue1TeamNumBP.setCenter(blue1TeamNumL);
					blue2TeamNumBP.setCenter(blue2TeamNumL);
					blue3TeamNumBP.setCenter(blue3TeamNumL);
					Label blue1Cy = new Label(Integer.toString(blueTeams.get(0).getMatchAmp() + blueTeams.get(0).getMatchSpe() + blueTeams.get(0).getMatchTrap()));
					Label blue2Cy = new Label(Integer.toString(blueTeams.get(1).getMatchAmp() + blueTeams.get(1).getMatchSpe() + blueTeams.get(1).getMatchTrap()));
					Label blue3Cy = new Label(Integer.toString(blueTeams.get(2).getMatchAmp() + blueTeams.get(2).getMatchSpe() + blueTeams.get(2).getMatchTrap()));
					blue1Cy.setId("avgStat");
					blue2Cy.setId("avgStat");
					blue3Cy.setId("avgStat");
					Label blue1Amp = new Label(Integer.toString(blueTeams.get(0).getMatchAmp()));
					Label blue2Amp = new Label(Integer.toString(blueTeams.get(1).getMatchAmp()));
					Label blue3Amp = new Label(Integer.toString(blueTeams.get(2).getMatchAmp()));
					Label blue1Spe = new Label(Integer.toString(blueTeams.get(0).getMatchSpe()));
					Label blue2Spe = new Label(Integer.toString(blueTeams.get(1).getMatchSpe()));
					Label blue3Spe = new Label(Integer.toString(blueTeams.get(2).getMatchSpe()));
					Label blue1Trap = new Label(Integer.toString(blueTeams.get(0).getMatchTrap()));
					Label blue2Trap = new Label(Integer.toString(blueTeams.get(1).getMatchTrap()));
					Label blue3Trap = new Label(Integer.toString(blueTeams.get(2).getMatchTrap()));
					blue1Amp.setId("avgStat");
					blue2Amp.setId("avgStat");
					blue3Amp.setId("avgStat");
					blue1Spe.setId("avgStat");
					blue2Spe.setId("avgStat");
					blue3Spe.setId("avgStat");
					blue1Trap.setId("avgStat");
					blue2Trap.setId("avgStat");
					blue3Trap.setId("avgStat");
					Label blue1AvgCy = new Label(Double.toString(theTL.getATeam(teamNum1).getAvgCycles()));
					Label blue2AvgCy = new Label(Double.toString(theTL.getATeam(teamNum2).getAvgCycles()));
					Label blue3AvgCy = new Label(Double.toString(theTL.getATeam(teamNum3).getAvgCycles()));
					Label blue1AvgSpe = new Label(Double.toString(theTL.getATeam(teamNum1).getAvgSpe()));
					Label blue2AvgSpe = new Label(Double.toString(theTL.getATeam(teamNum2).getAvgSpe()));
					Label blue3AvgSpe = new Label(Double.toString(theTL.getATeam(teamNum3).getAvgSpe()));
					Label blue1AvgAmp = new Label(Double.toString(theTL.getATeam(teamNum1).getAvgAmp()));
					Label blue2AvgAmp = new Label(Double.toString(theTL.getATeam(teamNum2).getAvgAmp()));
					Label blue3AvgAmp = new Label(Double.toString(theTL.getATeam(teamNum3).getAvgAmp()));
					Label blue1AvgTrap = new Label(Double.toString(theTL.getATeam(teamNum1).getAvgTrap()));
					Label blue2AvgTrap = new Label(Double.toString(theTL.getATeam(teamNum2).getAvgTrap()));
					Label blue3AvgTrap = new Label(Double.toString(theTL.getATeam(teamNum3).getAvgTrap()));
					blue1AvgCy.setId("avgStat");
					blue2AvgCy.setId("avgStat");
					blue3AvgCy.setId("avgStat");
					blue1AvgSpe.setId("avgStat");
					blue2AvgSpe.setId("avgStat");
					blue3AvgSpe.setId("avgStat");
					blue1AvgAmp.setId("avgStat");
					blue2AvgAmp.setId("avgStat");
					blue3AvgAmp.setId("avgStat");
					blue1AvgTrap.setId("avgStat");
					blue2AvgTrap.setId("avgStat");
					blue3AvgTrap.setId("avgStat");
					Label blue1Cli = new Label(Integer.toString(blueTeams.get(0).getMatchClimb()));
					Label blue2Cli = new Label(Integer.toString(blueTeams.get(1).getMatchClimb()));
					Label blue3Cli = new Label(Integer.toString(blueTeams.get(2).getMatchClimb()));
					Label blue1AvgCli = new Label(Double.toString(theTL.getATeam(teamNum1).getAvgClimb()));
					Label blue2AvgCli = new Label(Double.toString(theTL.getATeam(teamNum2).getAvgClimb()));
					Label blue3AvgCli = new Label(Double.toString(theTL.getATeam(teamNum3).getAvgClimb()));
					blue1Cli.setId("avgStat");
					blue2Cli.setId("avgStat");
					blue3Cli.setId("avgStat");
					blue1AvgCli.setId("avgStat");
					blue2AvgCli.setId("avgStat");
					blue3AvgCli.setId("avgStat");
					Label blue1CyQL = new Label("Match Cycles");
					Label blue1SpeQL = new Label("Match Speaker");
					Label blue1AmpQL = new Label("Match Amp");
					Label blue1TrapQL = new Label("Match Trap");
					Label blue1CliQL = new Label("Match Climb");
					Label blue2CyQL = new Label("Match Cycles");
					Label blue2SpeQL = new Label("Match Speaker");
					Label blue2AmpQL = new Label("Match Amp");
					Label blue2TrapQL = new Label("Match Trap");
					Label blue2CliQL = new Label("Match Climb");
					Label blue3CyQL = new Label("Match Cycles");
					Label blue3SpeQL = new Label("Match Speaker");
					Label blue3AmpQL = new Label("Match Amp");
					Label blue3TrapQL = new Label("Match Trap");
					Label blue3CliQL = new Label("Match Climb");
					Label blue1AvgCyQL = new Label("Avg Cycles");
					Label blue1AvgSpeQL = new Label("Avg Speaker");
					Label blue1AvgAmpQL = new Label("Avg Amp");
					Label blue1AvgTrapQL = new Label("Avg Trap");
					Label blue1AvgCliQL = new Label("Avg Climb");
					Label blue2AvgCyQL = new Label("Avg Cycles");
					Label blue2AvgSpeQL = new Label("Avg Speaker");
					Label blue2AvgAmpQL = new Label("Avg Amp");
					Label blue2AvgTrapQL = new Label("Avg Trap");
					Label blue2AvgCliQL = new Label("Avg Climb");
					Label blue3AvgCyQL = new Label("Avg Cycles");
					Label blue3AvgSpeQL = new Label("Avg Speaker");
					Label blue3AvgAmpQL = new Label("Avg Amp");
					Label blue3AvgTrapQL = new Label("Avg Trap");
					Label blue3AvgCliQL = new Label("Avg Climb");
					blue1CyQL.setId("smallTitle");
					blue1SpeQL.setId("smallTitle");
					blue1AmpQL.setId("smallTitle");
					blue1TrapQL.setId("smallTitle");
					blue1CliQL.setId("smallTitle");
					blue2CyQL.setId("smallTitle");
					blue2SpeQL.setId("smallTitle");
					blue2AmpQL.setId("smallTitle");
					blue2TrapQL.setId("smallTitle");
					blue2CliQL.setId("smallTitle");
					blue3CyQL.setId("smallTitle");
					blue3SpeQL.setId("smallTitle");
					blue3AmpQL.setId("smallTitle");
					blue3TrapQL.setId("smallTitle");
					blue3CliQL.setId("smallTitle");
					blue1AvgCyQL.setId("smallTitle");
					blue1AvgSpeQL.setId("smallTitle");
					blue1AvgAmpQL.setId("smallTitle");
					blue1AvgTrapQL.setId("smallTitle");
					blue1AvgCliQL.setId("smallTitle");
					blue2AvgCyQL.setId("smallTitle");
					blue2AvgSpeQL.setId("smallTitle");
					blue2AvgAmpQL.setId("smallTitle");
					blue2AvgTrapQL.setId("smallTitle");
					blue2AvgCliQL.setId("smallTitle");
					blue3AvgCyQL.setId("smallTitle");
					blue3AvgSpeQL.setId("smallTitle");
					blue3AvgAmpQL.setId("smallTitle");
					blue3AvgTrapQL.setId("smallTitle");
					blue3AvgCliQL.setId("smallTitle");
					BorderPane blue1CyBP = new BorderPane();
					BorderPane blue1SpeBP = new BorderPane();
					BorderPane blue1AmpBP = new BorderPane();
					BorderPane blue1TrapBP = new BorderPane();
					BorderPane blue1CliBP = new BorderPane();
					BorderPane blue1CyAvgBP = new BorderPane();
					BorderPane blue1SpeAvgBP = new BorderPane();
					BorderPane blue1AmpAvgBP = new BorderPane();
					BorderPane blue1TrapAvgBP = new BorderPane();
					BorderPane blue1CliAvgBP = new BorderPane();
					BorderPane blue2CyBP = new BorderPane();
					BorderPane blue2SpeBP = new BorderPane();
					BorderPane blue2AmpBP = new BorderPane();
					BorderPane blue2TrapBP = new BorderPane();
					BorderPane blue2CliBP = new BorderPane();
					BorderPane blue2CyAvgBP = new BorderPane();
					BorderPane blue2SpeAvgBP = new BorderPane();
					BorderPane blue2AmpAvgBP = new BorderPane();
					BorderPane blue2TrapAvgBP = new BorderPane();
					BorderPane blue2CliAvgBP = new BorderPane();
					BorderPane blue3CyBP = new BorderPane();
					BorderPane blue3SpeBP = new BorderPane();
					BorderPane blue3AmpBP = new BorderPane();
					BorderPane blue3TrapBP = new BorderPane();
					BorderPane blue3CliBP = new BorderPane();
					BorderPane blue3CyAvgBP = new BorderPane();
					BorderPane blue3SpeAvgBP = new BorderPane();
					BorderPane blue3AmpAvgBP = new BorderPane();
					BorderPane blue3TrapAvgBP = new BorderPane();
					BorderPane blue3CliAvgBP = new BorderPane();
					blue1CyBP.setTop(blue1CyQL);
					blue1SpeBP.setTop(blue1SpeQL);
					blue1AmpBP.setTop(blue1AmpQL);
					blue1TrapBP.setTop(blue1TrapQL);
					blue1CliBP.setTop(blue1CliQL);
					blue1CyAvgBP.setTop(blue1AvgCyQL);
					blue1SpeAvgBP.setTop(blue1AvgSpeQL);
					blue1AmpAvgBP.setTop(blue1AvgAmpQL);
					blue1TrapAvgBP.setTop(blue1AvgTrapQL);
					blue1CliAvgBP.setTop(blue1AvgCliQL);
					blue2CyBP.setTop(blue2CyQL);
					blue2SpeBP.setTop(blue2SpeQL);
					blue2AmpBP.setTop(blue2AmpQL);
					blue2TrapBP.setTop(blue2TrapQL);
					blue2CliBP.setTop(blue2CliQL);
					blue2CyAvgBP.setTop(blue2AvgCyQL);
					blue2SpeAvgBP.setTop(blue2AvgSpeQL);
					blue2AmpAvgBP.setTop(blue2AvgAmpQL);
					blue2TrapAvgBP.setTop(blue2AvgTrapQL);
					blue2CliAvgBP.setTop(blue2AvgCliQL);
					blue3CyBP.setTop(blue3CyQL);
					blue3SpeBP.setTop(blue3SpeQL);
					blue3AmpBP.setTop(blue3AmpQL);
					blue3TrapBP.setTop(blue3TrapQL);
					blue3CliBP.setTop(blue3CliQL);
					blue3CyAvgBP.setTop(blue3AvgCyQL);
					blue3SpeAvgBP.setTop(blue3AvgSpeQL);
					blue3AmpAvgBP.setTop(blue3AvgAmpQL);
					blue3TrapAvgBP.setTop(blue3AvgTrapQL);
					blue3CliAvgBP.setTop(blue3AvgCliQL);
					blue1CyBP.setCenter(blue1Cy);
					blue1SpeBP.setCenter(blue1Spe);
					blue1AmpBP.setCenter(blue1Amp);
					blue1TrapBP.setCenter(blue1Trap);
					blue1CliBP.setCenter(blue1Cli);
					blue1CyAvgBP.setCenter(blue1AvgCy);
					blue1SpeAvgBP.setCenter(blue1AvgSpe);
					blue1AmpAvgBP.setCenter(blue1AvgAmp);
					blue1TrapAvgBP.setCenter(blue1AvgTrap);
					blue1CliAvgBP.setCenter(blue1AvgCli);
					blue2CyBP.setCenter(blue2Cy);
					blue2SpeBP.setCenter(blue2Spe);
					blue2AmpBP.setCenter(blue2Amp);
					blue2TrapBP.setCenter(blue2Trap);
					blue2CliBP.setCenter(blue2Cli);
					blue2CyAvgBP.setCenter(blue2AvgCy);
					blue2SpeAvgBP.setCenter(blue2AvgSpe);
					blue2AmpAvgBP.setCenter(blue2AvgAmp);
					blue2TrapAvgBP.setCenter(blue2AvgTrap);
					blue2CliAvgBP.setCenter(blue2AvgCli);
					blue3CyBP.setCenter(blue3Cy);
					blue3SpeBP.setCenter(blue3Spe);
					blue3AmpBP.setCenter(blue3Amp);
					blue3TrapBP.setCenter(blue3Trap);
					blue3CliBP.setCenter(blue3Cli);
					blue3CyAvgBP.setCenter(blue3AvgCy);
					blue3SpeAvgBP.setCenter(blue3AvgSpe);
					blue3AmpAvgBP.setCenter(blue3AvgAmp);
					blue3TrapAvgBP.setCenter(blue3AvgTrap);
					blue3CliAvgBP.setCenter(blue3AvgCli);
					if(mainColor == false) {
						blue1TeamNumBP.setId("seMStatBP1");
						blue1CyBP.setId("seMStatBP3");
						blue1SpeBP.setId("seMStatBP5");
						blue1AmpBP.setId("seMStatBP7");
						blue1TrapBP.setId("seMStatBP9");
						blue1CliBP.setId("seMStatBP7");
						blue1CyAvgBP.setId("seMStatBP4");
						blue1SpeAvgBP.setId("seMStatBP6");
						blue1AmpAvgBP.setId("seMStatBP8");
						blue1TrapAvgBP.setId("seMStatBP8");
						blue1CliAvgBP.setId("seMStatBP6");
						blue1TeamNumBP.setId("seMStatBP9");
						blue2CyBP.setId("seMStatBP7");
						blue2SpeBP.setId("seMStatBP5");
						blue2AmpBP.setId("seMStatBP3");
						blue2TrapBP.setId("seMStatBP1");
						blue2CliBP.setId("seMStatBP3");
						blue2CyAvgBP.setId("seMStatBP6");
						blue2SpeAvgBP.setId("seMStatBP4");
						blue2AmpAvgBP.setId("seMStatBP2");
						blue2TrapAvgBP.setId("seMStatBP2");
						blue2CliAvgBP.setId("seMStatBP4");
						blue1TeamNumBP.setId("seMStatBP1");
						blue3CyBP.setId("seMStatBP3");
						blue3SpeBP.setId("seMStatBP5");
						blue3AmpBP.setId("seMStatBP7");
						blue3TrapBP.setId("seMStatBP9");
						blue3CliBP.setId("seMStatBP7");
						blue3CyAvgBP.setId("seMStatBP4");
						blue3SpeAvgBP.setId("seMStatBP6");
						blue3AmpAvgBP.setId("seMStatBP8");
						blue3TrapAvgBP.setId("seMStatBP8");
						blue3CliAvgBP.setId("seMStatBP6");
						VBox blue1VB = new VBox(5);
						VBox blue2VB = new VBox(5);
						VBox blue3VB = new VBox(5);
						blue1VB.getChildren().addAll(blue1TeamNumBP, blue1CyBP, blue1CyAvgBP, blue1SpeBP, blue1SpeAvgBP, blue1AmpBP, blue1AmpAvgBP, blue1TrapBP, blue1TrapAvgBP, blue1CliBP, blue1CliAvgBP);
						blue2VB.getChildren().addAll(blue2TeamNumBP, blue2CyBP, blue2CyAvgBP, blue2SpeBP, blue2SpeAvgBP, blue2AmpBP, blue2AmpAvgBP, blue2TrapBP, blue2TrapAvgBP, blue2CliBP, blue2CliAvgBP);
						blue3VB.getChildren().addAll(blue3TeamNumBP, blue3CyBP, blue3CyAvgBP, blue3SpeBP, blue3SpeAvgBP, blue3AmpBP, blue3AmpAvgBP, blue3TrapBP, blue3TrapAvgBP, blue3CliBP, blue3CliAvgBP);
						Label blueCy = new Label(Integer.toString(blueTeams.get(0).getMatchAmp() + blueTeams.get(1).getMatchAmp() + blueTeams.get(2).getMatchAmp() + blueTeams.get(0).getMatchSpe() + blueTeams.get(1).getMatchSpe() + blueTeams.get(2).getMatchSpe()) + blueTeams.get(0).getMatchTrap() + blueTeams.get(1).getMatchTrap() + blueTeams.get(2).getMatchTrap());
						Label blueSpe = new Label(Integer.toString(blueTeams.get(0).getMatchSpe() + blueTeams.get(1).getMatchSpe() + blueTeams.get(2).getMatchSpe()));;
						Label blueAmp = new Label(Integer.toString(blueTeams.get(0).getMatchAmp() + blueTeams.get(1).getMatchAmp() + blueTeams.get(2).getMatchAmp()));;
						Label blueTrap = new Label(Integer.toString(blueTeams.get(0).getMatchTrap() + blueTeams.get(1).getMatchTrap() + blueTeams.get(2).getMatchTrap()));;
						Label blueCli = new Label(Integer.toString(blueTeams.get(0).getMatchClimb() + blueTeams.get(1).getMatchClimb() + blueTeams.get(2).getMatchClimb()));;
						Label blueAll = new Label("Blue Alliance");
						Label blueAllCyQL = new Label("Match Cycles");
						Label blueAllSpeQL = new Label("Match Speaker");
						Label blueAllAmpQL = new Label("Match Amp");
						Label blueAllTrapQL = new Label("Match Trap");
						Label blueAllCliQL = new Label("Match Climb");
						blueCy .setId("avgStat");
						blueSpe.setId("avgStat");
						blueAmp.setId("avgStat");
						blueTrap.setId("avgStat");
						blueCli.setId("avgStat");
						blueAll.setId("smallTitle");
						blueAllCyQL.setId("smallTitle");
						blueAllSpeQL.setId("smallTitle");
						blueAllAmpQL.setId("smallTitle");
						blueAllTrapQL.setId("smallTitle");
						blueAllCliQL.setId("smallTitle");
						BorderPane BlueCyBP = new BorderPane();
						BorderPane BlueSpeBP = new BorderPane();
						BorderPane BlueAmpBP = new BorderPane();
						BorderPane BlueTrapBP = new BorderPane();
						BorderPane BlueCliBP = new BorderPane();
						BlueCyBP.setTop(blueAllCyQL);
						BlueSpeBP.setTop(blueAllSpeQL);
						BlueAmpBP.setTop(blueAllAmpQL);
						BlueTrapBP.setTop(blueAllTrapQL);
						BlueCliBP.setTop(blueAllCliQL);
						BlueCyBP.setCenter(blueCy);
						BlueSpeBP.setCenter(blueSpe);
						BlueAmpBP.setCenter(blueAmp);
						BlueTrapBP.setCenter(blueTrap);
						BlueCliBP.setCenter(blueCli);
						BlueCyBP.setId("seMStatBP5");
						BlueSpeBP.setId("seMStatBP4");
						BlueAmpBP.setId("seMStatBP3");
						BlueTrapBP.setId("seMStatBP2");
						BlueCliBP.setId("seMStatBP1");
						BorderPane blueAllNameBP = new BorderPane();
						blueAllNameBP.setCenter(blueAll);
						blueAllNameBP.setId("seMStatBP6");
						VBox blueAllBP = new VBox(5);
						blueAllBP.getChildren().addAll(blueAllNameBP, BlueCyBP, BlueSpeBP, BlueAmpBP, BlueTrapBP, BlueCliBP);
						blueHB.getChildren().addAll(blueAllBP, blue1VB, blue2VB, blue3VB);
					}else {
						System.out.print("BoopseM0");
						blue1TeamNumBP.setId("seMStatBP9");
						blue1CyBP.setId("seMStatBP7");
						blue1SpeBP.setId("seMStatBP5");
						blue1AmpBP.setId("seMStatBP3");
						blue1TrapBP.setId("seMStatBP1");
						blue1CliBP.setId("seMStatBP3");
						blue1CyAvgBP.setId("seMStatBP6");
						blue1SpeAvgBP.setId("seMStatBP4");
						blue1AmpAvgBP.setId("seMStatBP2");
						blue1TrapAvgBP.setId("seMStatBP2");
						blue1CliAvgBP.setId("seMStatBP4");
						blue2TeamNumBP.setId("seMStatBP1");
						blue2CyBP.setId("seMStatBP3");
						blue2SpeBP.setId("seMStatBP5");
						blue2AmpBP.setId("seMStatBP7");
						blue2TrapBP.setId("seMStatBP9");
						blue2CliBP.setId("seMStatBP7");
						blue2CyAvgBP.setId("seMStatBP4");
						blue2SpeAvgBP.setId("seMStatBP6");
						blue2AmpAvgBP.setId("seMStatBP8");
						blue2TrapAvgBP.setId("seMStatBP8");
						blue2CliAvgBP.setId("seMStatBP6");
						blue3TeamNumBP.setId("seMStatBP9");
						blue3CyBP.setId("seMStatBP7");
						blue3SpeBP.setId("seMStatBP5");
						blue3AmpBP.setId("seMStatBP3");
						blue3TrapBP.setId("seMStatBP1");
						blue3CliBP.setId("seMStatBP3");
						blue3CyAvgBP.setId("seMStatBP6");
						blue3SpeAvgBP.setId("seMStatBP4");
						blue3AmpAvgBP.setId("seMStatBP2");
						blue3TrapAvgBP.setId("seMStatBP2");
						blue3CliAvgBP.setId("seMStatBP4");
						VBox blue1VB = new VBox(5);
						VBox blue2VB = new VBox(5);
						VBox blue3VB = new VBox(5);
						Label blueCy = new Label(Integer.toString(blueTeams.get(0).getMatchAmp() + blueTeams.get(1).getMatchAmp() + blueTeams.get(2).getMatchAmp() + blueTeams.get(0).getMatchSpe() + blueTeams.get(1).getMatchSpe() + blueTeams.get(2).getMatchSpe() + blueTeams.get(0).getMatchTrap() + blueTeams.get(1).getMatchTrap() + blueTeams.get(2).getMatchTrap()));
						Label blueSpe = new Label(Integer.toString(blueTeams.get(0).getMatchSpe() + blueTeams.get(1).getMatchSpe() + blueTeams.get(2).getMatchSpe()));;
						Label blueAmp = new Label(Integer.toString(blueTeams.get(0).getMatchAmp() + blueTeams.get(1).getMatchAmp() + blueTeams.get(2).getMatchAmp()));;
						Label blueTrap = new Label(Integer.toString(blueTeams.get(0).getMatchTrap() + blueTeams.get(1).getMatchTrap() + blueTeams.get(2).getMatchTrap()));;
						Label blueCli = new Label(Integer.toString(blueTeams.get(0).getMatchClimb() + blueTeams.get(1).getMatchClimb() + blueTeams.get(2).getMatchClimb()));;
						Label blueAll = new Label("Blue Alliance");
						Label blueAllCyQL = new Label("Match Cycles");
						Label blueAllSpeQL = new Label("Match Speaker");
						Label blueAllAmpQL = new Label("Match Amp");
						Label blueAllTrapQL = new Label("Match Trap");
						Label blueAllCliQL = new Label("Match Climb");
						blueCy .setId("avgStat");
						blueSpe.setId("avgStat");
						blueAmp.setId("avgStat");
						blueTrap.setId("avgStat");
						blueCli.setId("avgStat");
						blueAll.setId("smallTitle");
						blueAllCyQL.setId("smallTitle");
						blueAllSpeQL.setId("smallTitle");
						blueAllAmpQL.setId("smallTitle");
						blueAllTrapQL.setId("smallTitle");
						blueAllCliQL.setId("smallTitle");
						BorderPane BlueCyBP = new BorderPane();
						BorderPane BlueSpeBP = new BorderPane();
						BorderPane BlueAmpBP = new BorderPane();
						BorderPane BlueTrapBP = new BorderPane();
						BorderPane BlueCliBP = new BorderPane();
						BlueCyBP.setTop(blueAllCyQL);
						BlueSpeBP.setTop(blueAllSpeQL);
						BlueAmpBP.setTop(blueAllAmpQL);
						BlueTrapBP.setTop(blueAllTrapQL);
						BlueCliBP.setTop(blueAllCliQL);
						BlueCyBP.setCenter(blueCy);
						BlueSpeBP.setCenter(blueSpe);
						BlueAmpBP.setCenter(blueAmp);
						BlueTrapBP.setCenter(blueTrap);
						BlueCliBP.setCenter(blueCli);
						BlueCyBP.setId("seMStatBP5");
						BlueSpeBP.setId("seMStatBP4");
						BlueAmpBP.setId("seMStatBP3");
						BlueTrapBP.setId("seMStatBP2");
						BlueCliBP.setId("seMStatBP1");
						BorderPane blueAllNameBP = new BorderPane();
						blueAllNameBP.setCenter(blueAll);
						blueAllNameBP.setId("seMStatBP6");
						VBox blueAllBP = new VBox(5);
						blueAllBP.getChildren().addAll(blueAllNameBP, BlueCyBP, BlueSpeBP, BlueAmpBP, BlueTrapBP, BlueCliBP);
						blue1VB.getChildren().addAll(blue1TeamNumBP, blue1CyBP, blue1CyAvgBP, blue1SpeBP, blue1SpeAvgBP, blue1AmpBP, blue1AmpAvgBP, blue1TrapBP, blue1TrapAvgBP, blue1CliBP, blue1CliAvgBP);
						blue2VB.getChildren().addAll(blue2TeamNumBP, blue2CyBP, blue2CyAvgBP, blue2SpeBP, blue2SpeAvgBP, blue2AmpBP, blue2AmpAvgBP, blue2TrapBP, blue2TrapAvgBP, blue2CliBP, blue2CliAvgBP);
						blue3VB.getChildren().addAll(blue3TeamNumBP, blue3CyBP, blue3CyAvgBP, blue3SpeBP, blue3SpeAvgBP, blue3AmpBP, blue3AmpAvgBP, blue3TrapBP, blue3TrapAvgBP, blue3CliBP, blue3CliAvgBP);
						blueHB.getChildren().addAll(blueAllBP, blue1VB, blue2VB, blue3VB);
					}
				}else if(blueTeams.size() == 2) {
					System.out.print("BoopseM13Blue2");
					int teamNum1 = blueTeams.get(0).getMatchTeamNum();
					int teamNum2 = blueTeams.get(1).getMatchTeamNum();
					Label blue1TeamNumL = new Label(Integer.toString(teamNum1));
					Label blue2TeamNumL = new Label(Integer.toString(teamNum2));
					Label noDataLabel1L = new Label("No Data");
					blue1TeamNumL.setId("smallTitle");
					blue2TeamNumL.setId("smallTitle");
					noDataLabel1L.setId("smallTitle");
					BorderPane blue1TeamNumBP = new BorderPane();
					BorderPane blue2TeamNumBP = new BorderPane();
					BorderPane noData1BP = new BorderPane();
					blue1TeamNumBP.setCenter(blue1TeamNumL);
					blue2TeamNumBP.setCenter(blue2TeamNumL);
					noData1BP.setCenter(noDataLabel1L);
					Label blue1Cy = new Label(Integer.toString(blueTeams.get(0).getMatchAmp() + blueTeams.get(0).getMatchSpe() + blueTeams.get(0).getMatchTrap()));
					Label blue2Cy = new Label(Integer.toString(blueTeams.get(1).getMatchAmp() + blueTeams.get(1).getMatchSpe() + blueTeams.get(1).getMatchTrap()));
					blue1Cy.setId("avgStat");
					blue2Cy.setId("avgStat");
					Label blue1Amp = new Label(Integer.toString(blueTeams.get(0).getMatchAmp()));
					Label blue2Amp = new Label(Integer.toString(blueTeams.get(1).getMatchAmp()));
					Label blue1Spe = new Label(Integer.toString(blueTeams.get(0).getMatchSpe()));
					Label blue2Spe = new Label(Integer.toString(blueTeams.get(1).getMatchSpe()));
					Label blue1Trap = new Label(Integer.toString(blueTeams.get(0).getMatchTrap()));
					Label blue2Trap = new Label(Integer.toString(blueTeams.get(1).getMatchTrap()));
					blue1Amp.setId("avgStat");
					blue2Amp.setId("avgStat");
					blue1Spe.setId("avgStat");
					blue2Spe.setId("avgStat");
					blue1Trap.setId("avgStat");
					blue2Trap.setId("avgStat");
					Label blue1AvgCy = new Label(Double.toString(theTL.getATeam(teamNum1).getAvgCycles()));
					Label blue2AvgCy = new Label(Double.toString(theTL.getATeam(teamNum2).getAvgCycles()));
					Label blue1AvgSpe = new Label(Double.toString(theTL.getATeam(teamNum1).getAvgSpe()));
					Label blue2AvgSpe = new Label(Double.toString(theTL.getATeam(teamNum2).getAvgSpe()));
					Label blue1AvgAmp = new Label(Double.toString(theTL.getATeam(teamNum1).getAvgAmp()));
					Label blue2AvgAmp = new Label(Double.toString(theTL.getATeam(teamNum2).getAvgAmp()));
					Label blue1AvgTrap = new Label(Double.toString(theTL.getATeam(teamNum1).getAvgTrap()));
					Label blue2AvgTrap = new Label(Double.toString(theTL.getATeam(teamNum2).getAvgTrap()));
					blue1AvgCy.setId("avgStat");
					blue2AvgCy.setId("avgStat");
					blue1AvgSpe.setId("avgStat");
					blue2AvgSpe.setId("avgStat");
					blue1AvgAmp.setId("avgStat");
					blue2AvgAmp.setId("avgStat");
					blue1AvgTrap.setId("avgStat");
					blue2AvgTrap.setId("avgStat");
					Label blue1Cli = new Label(Integer.toString(blueTeams.get(0).getMatchClimb()));
					Label blue2Cli = new Label(Integer.toString(blueTeams.get(1).getMatchClimb()));
					Label blue1AvgCli = new Label(Double.toString(theTL.getATeam(teamNum1).getAvgClimb()));
					Label blue2AvgCli = new Label(Double.toString(theTL.getATeam(teamNum2).getAvgClimb()));
					blue1Cli.setId("avgStat");
					blue2Cli.setId("avgStat");
					blue1AvgCli.setId("avgStat");
					blue2AvgCli.setId("avgStat");
					Label blue1CyQL = new Label("Match Cycles");
					Label blue1SpeQL = new Label("Match Speaker");
					Label blue1AmpQL = new Label("Match Amp");
					Label blue1TrapQL = new Label("Match Trap");
					Label blue1CliQL = new Label("Match Climb");
					Label blue2CyQL = new Label("Match Cycles");
					Label blue2SpeQL = new Label("Match Speaker");
					Label blue2AmpQL = new Label("Match Amp");
					Label blue2TrapQL = new Label("Match Trap");
					Label blue2CliQL = new Label("Match Climb");
					Label blue1AvgCyQL = new Label("Avg Cycles");
					Label blue1AvgSpeQL = new Label("Avg Speaker");
					Label blue1AvgAmpQL = new Label("Avg Amp");
					Label blue1AvgTrapQL = new Label("Avg Trap");
					Label blue1AvgCliQL = new Label("Avg Climb");
					Label blue2AvgCyQL = new Label("Avg Cycles");
					Label blue2AvgSpeQL = new Label("Avg Speaker");
					Label blue2AvgAmpQL = new Label("Avg Amp");
					Label blue2AvgTrapQL = new Label("Avg Trap");
					Label blue2AvgCliQL = new Label("Avg Climb");
					blue1CyQL.setId("smallTitle");
					blue1SpeQL.setId("smallTitle");
					blue1AmpQL.setId("smallTitle");
					blue1TrapQL.setId("smallTitle");
					blue1CliQL.setId("smallTitle");
					blue2CyQL.setId("smallTitle");
					blue2SpeQL.setId("smallTitle");
					blue2AmpQL.setId("smallTitle");
					blue2TrapQL.setId("smallTitle");
					blue2CliQL.setId("smallTitle");
					blue1AvgCyQL.setId("smallTitle");
					blue1AvgSpeQL.setId("smallTitle");
					blue1AvgAmpQL.setId("smallTitle");
					blue1AvgTrapQL.setId("smallTitle");
					blue1AvgCliQL.setId("smallTitle");
					blue2AvgCyQL.setId("smallTitle");
					blue2AvgSpeQL.setId("smallTitle");
					blue2AvgAmpQL.setId("smallTitle");
					blue2AvgTrapQL.setId("smallTitle");
					blue2AvgCliQL.setId("smallTitle");
					BorderPane blue1CyBP = new BorderPane();
					BorderPane blue1SpeBP = new BorderPane();
					BorderPane blue1AmpBP = new BorderPane();
					BorderPane blue1TrapBP = new BorderPane();
					BorderPane blue1CliBP = new BorderPane();
					BorderPane blue1CyAvgBP = new BorderPane();
					BorderPane blue1SpeAvgBP = new BorderPane();
					BorderPane blue1AmpAvgBP = new BorderPane();
					BorderPane blue1TrapAvgBP = new BorderPane();
					BorderPane blue1CliAvgBP = new BorderPane();
					BorderPane blue2CyBP = new BorderPane();
					BorderPane blue2SpeBP = new BorderPane();
					BorderPane blue2AmpBP = new BorderPane();
					BorderPane blue2TrapBP = new BorderPane();
					BorderPane blue2CliBP = new BorderPane();
					BorderPane blue2CyAvgBP = new BorderPane();
					BorderPane blue2SpeAvgBP = new BorderPane();
					BorderPane blue2AmpAvgBP = new BorderPane();
					BorderPane blue2TrapAvgBP = new BorderPane();
					BorderPane blue2CliAvgBP = new BorderPane();
					blue1CyBP.setTop(blue1CyQL);
					blue1SpeBP.setTop(blue1SpeQL);
					blue1AmpBP.setTop(blue1AmpQL);
					blue1TrapBP.setTop(blue1TrapQL);
					blue1CliBP.setTop(blue1CliQL);
					blue1CyAvgBP.setTop(blue1AvgCyQL);
					blue1SpeAvgBP.setTop(blue1AvgSpeQL);
					blue1AmpAvgBP.setTop(blue1AvgAmpQL);
					blue1TrapAvgBP.setTop(blue1AvgTrapQL);
					blue1CliAvgBP.setTop(blue1AvgCliQL);
					blue2CyBP.setTop(blue1CyQL);
					blue2SpeBP.setTop(blue2SpeQL);
					blue2AmpBP.setTop(blue2AmpQL);
					blue2TrapBP.setTop(blue2TrapQL);
					blue2CliBP.setTop(blue2CliQL);
					blue2CyAvgBP.setTop(blue2AvgCyQL);
					blue2SpeAvgBP.setTop(blue2AvgSpeQL);
					blue2AmpAvgBP.setTop(blue2AvgAmpQL);
					blue2TrapAvgBP.setTop(blue2AvgTrapQL);
					blue2CliAvgBP.setTop(blue2AvgCliQL);
					blue1CyBP.setCenter(blue1Cy);
					blue1SpeBP.setCenter(blue1Spe);
					blue1AmpBP.setCenter(blue1Amp);
					blue1TrapBP.setCenter(blue1Trap);
					blue1CliBP.setCenter(blue1Cli);
					blue1CyAvgBP.setCenter(blue1AvgCy);
					blue1SpeAvgBP.setCenter(blue1AvgSpe);
					blue1AmpAvgBP.setCenter(blue1AvgAmp);
					blue1TrapAvgBP.setCenter(blue1AvgTrap);
					blue1CliAvgBP.setCenter(blue1AvgCli);
					blue2CyBP.setCenter(blue1Cy);
					blue2SpeBP.setCenter(blue2Spe);
					blue2AmpBP.setCenter(blue2Amp);
					blue2TrapBP.setCenter(blue2Trap);
					blue2CliBP.setCenter(blue2Cli);
					blue2CyAvgBP.setCenter(blue2AvgCy);
					blue2SpeAvgBP.setCenter(blue2AvgSpe);
					blue2AmpAvgBP.setCenter(blue2AvgAmp);
					blue2TrapAvgBP.setCenter(blue2AvgTrap);
					blue2CliAvgBP.setCenter(blue2AvgCli);
					if(mainColor == false) {
						blue1TeamNumBP.setId("seMStatBP1");
						blue1CyBP.setId("seMStatBP3");
						blue1SpeBP.setId("seMStatBP5");
						blue1AmpBP.setId("seMStatBP7");
						blue1TrapBP.setId("seMStatBP9");
						blue1CliBP.setId("seMStatBP7");
						blue1CyAvgBP.setId("seMStatBP4");
						blue1SpeAvgBP.setId("seMStatBP6");
						blue1AmpAvgBP.setId("seMStatBP8");
						blue1TrapAvgBP.setId("seMStatBP8");
						blue1CliAvgBP.setId("seMStatBP6");
						blue2TeamNumBP.setId("seMStatBP9");
						blue2CyBP.setId("seMStatBP7");
						blue2SpeBP.setId("seMStatBP5");
						blue2AmpBP.setId("seMStatBP3");
						blue2TrapBP.setId("seMStatBP1");
						blue2CliBP.setId("seMStatBP3");
						blue2CyAvgBP.setId("seMStatBP6");
						blue2SpeAvgBP.setId("seMStatBP4");
						blue2AmpAvgBP.setId("seMStatBP2");
						blue2TrapAvgBP.setId("seMStatBP2");
						blue2CliAvgBP.setId("seMStatBP4");
						noData1BP.setId("seMStatBP1");
						VBox blue1VB = new VBox(5);
						VBox blue2VB = new VBox(5);
						VBox blue3VB = new VBox(5);
						Label blueCy = new Label(Integer.toString(blueTeams.get(0).getMatchAmp() + blueTeams.get(1).getMatchAmp() + blueTeams.get(0).getMatchSpe() + blueTeams.get(1).getMatchSpe() + blueTeams.get(0).getMatchTrap() + blueTeams.get(1).getMatchTrap()));
						Label blueSpe = new Label(Integer.toString(blueTeams.get(0).getMatchSpe() + blueTeams.get(1).getMatchSpe()));;
						Label blueAmp = new Label(Integer.toString(blueTeams.get(0).getMatchAmp() + blueTeams.get(1).getMatchAmp()));;
						Label blueTrap = new Label(Integer.toString(blueTeams.get(0).getMatchTrap() + blueTeams.get(1).getMatchTrap()));;
						Label blueCli = new Label(Integer.toString(blueTeams.get(0).getMatchClimb() + blueTeams.get(1).getMatchClimb()));;
						Label blueAll = new Label("Blue Alliance");
						Label blueAllCyQL = new Label("Match Cycles");
						Label blueAllSpeQL = new Label("Match Speaker");
						Label blueAllAmpQL = new Label("Match Amp");
						Label blueAllTrapQL = new Label("Match Trap");
						Label blueAllCliQL = new Label("Match Climb");
						blueCy .setId("avgStat");
						blueSpe.setId("avgStat");
						blueAmp.setId("avgStat");
						blueTrap.setId("avgStat");
						blueCli.setId("avgStat");
						blueAll.setId("smallTitle");
						blueAllCyQL.setId("smallTitle");
						blueAllSpeQL.setId("smallTitle");
						blueAllAmpQL.setId("smallTitle");
						blueAllTrapQL.setId("smallTitle");
						blueAllCliQL.setId("smallTitle");
						BorderPane BlueCyBP = new BorderPane();
						BorderPane BlueSpeBP = new BorderPane();
						BorderPane BlueAmpBP = new BorderPane();
						BorderPane BlueTrapBP = new BorderPane();
						BorderPane BlueCliBP = new BorderPane();
						BlueCyBP.setTop(blueAllCyQL);
						BlueSpeBP.setTop(blueAllSpeQL);
						BlueAmpBP.setTop(blueAllAmpQL);
						BlueTrapBP.setTop(blueAllTrapQL);
						BlueCliBP.setTop(blueAllCliQL);
						BlueCyBP.setCenter(blueCy);
						BlueSpeBP.setCenter(blueSpe);
						BlueAmpBP.setCenter(blueAmp);
						BlueTrapBP.setCenter(blueTrap);
						BlueCliBP.setCenter(blueCli);
						BlueCyBP.setId("seMStatBP5");
						BlueSpeBP.setId("seMStatBP4");
						BlueAmpBP.setId("seMStatBP3");
						BlueTrapBP.setId("seMStatBP2");
						BlueCliBP.setId("seMStatBP1");
						BorderPane blueAllNameBP = new BorderPane();
						blueAllNameBP.setCenter(blueAll);
						blueAllNameBP.setId("seMStatBP6");
						VBox blueAllBP = new VBox(5);
						blueAllBP.getChildren().addAll(blueAllNameBP, BlueCyBP, BlueSpeBP, BlueAmpBP, BlueTrapBP, BlueCliBP);
						blue1VB.getChildren().addAll(blue1TeamNumBP, blue1CyBP, blue1CyAvgBP, blue1SpeBP, blue1SpeAvgBP, blue1AmpBP, blue1AmpAvgBP, blue1TrapBP, blue1TrapAvgBP, blue1CliBP, blue1CliAvgBP);
						blue2VB.getChildren().addAll(blue2TeamNumBP, blue2CyBP, blue2CyAvgBP, blue2SpeBP, blue2SpeAvgBP, blue2AmpBP, blue2AmpAvgBP, blue2TrapBP, blue2TrapAvgBP, blue2CliBP, blue2CliAvgBP);
						blue3VB.getChildren().add(noData1BP);
						blueHB.getChildren().addAll(blueAllBP, blue1VB, blue2VB, blue3VB);
					}else {
						blue1TeamNumBP.setId("seMStatBP9");
						blue1CyBP.setId("seMStatBP7");
						blue1SpeBP.setId("seMStatBP5");
						blue1AmpBP.setId("seMStatBP3");
						blue1TrapBP.setId("seMStatBP1");
						blue1CliBP.setId("seMStatBP3");
						blue1CyAvgBP.setId("seMStatBP6");
						blue1SpeAvgBP.setId("seMStatBP4");
						blue1AmpAvgBP.setId("seMStatBP2");
						blue1TrapAvgBP.setId("seMStatBP2");
						blue1CliAvgBP.setId("seMStatBP4");
						blue2TeamNumBP.setId("seMStatBP1");
						blue2CyBP.setId("seMStatBP3");
						blue2SpeBP.setId("seMStatBP5");
						blue2AmpBP.setId("seMStatBP7");
						blue2TrapBP.setId("seMStatBP9");
						blue2CliBP.setId("seMStatBP7");
						blue2CyAvgBP.setId("seMStatBP4");
						blue2SpeAvgBP.setId("seMStatBP6");
						blue2AmpAvgBP.setId("seMStatBP8");
						blue2TrapAvgBP.setId("seMStatBP8");
						blue2CliAvgBP.setId("seMStatBP6");
						noData1BP.setId("seMStatBP9");
						VBox blue1VB = new VBox(5);
						VBox blue2VB = new VBox(5);
						VBox blue3VB = new VBox(5);
						Label blueCy = new Label(Integer.toString(blueTeams.get(0).getMatchAmp() + blueTeams.get(1).getMatchAmp() + blueTeams.get(0).getMatchSpe() + blueTeams.get(1).getMatchSpe() + blueTeams.get(0).getMatchTrap() + blueTeams.get(1).getMatchTrap()));
						Label blueSpe = new Label(Integer.toString(blueTeams.get(0).getMatchSpe() + blueTeams.get(1).getMatchSpe()));;
						Label blueAmp = new Label(Integer.toString(blueTeams.get(0).getMatchAmp() + blueTeams.get(1).getMatchAmp()));;
						Label blueTrap = new Label(Integer.toString(blueTeams.get(0).getMatchTrap() + blueTeams.get(1).getMatchTrap()));;
						Label blueCli = new Label(Integer.toString(blueTeams.get(0).getMatchClimb() + blueTeams.get(1).getMatchClimb()));;
						Label blueAll = new Label("Blue Alliance");
						Label blueAllCyQL = new Label("Match Cycles");
						Label blueAllSpeQL = new Label("Match Speaker");
						Label blueAllAmpQL = new Label("Match Amp");
						Label blueAllTrapQL = new Label("Match Trap");
						Label blueAllCliQL = new Label("Match Climb");
						blueCy .setId("avgStat");
						blueSpe.setId("avgStat");
						blueAmp.setId("avgStat");
						blueTrap.setId("avgStat");
						blueCli.setId("avgStat");
						blueAll.setId("smallTitle");
						blueAllCyQL.setId("smallTitle");
						blueAllSpeQL.setId("smallTitle");
						blueAllAmpQL.setId("smallTitle");
						blueAllTrapQL.setId("smallTitle");
						blueAllCliQL.setId("smallTitle");
						BorderPane BlueCyBP = new BorderPane();
						BorderPane BlueSpeBP = new BorderPane();
						BorderPane BlueAmpBP = new BorderPane();
						BorderPane BlueTrapBP = new BorderPane();
						BorderPane BlueCliBP = new BorderPane();
						BlueCyBP.setTop(blueAllCyQL);
						BlueSpeBP.setTop(blueAllSpeQL);
						BlueAmpBP.setTop(blueAllAmpQL);
						BlueTrapBP.setTop(blueAllTrapQL);
						BlueCliBP.setTop(blueAllCliQL);
						BlueCyBP.setCenter(blueCy);
						BlueSpeBP.setCenter(blueSpe);
						BlueAmpBP.setCenter(blueAmp);
						BlueTrapBP.setCenter(blueTrap);
						BlueCliBP.setCenter(blueCli);
						BlueCyBP.setId("seMStatBP5");
						BlueSpeBP.setId("seMStatBP4");
						BlueAmpBP.setId("seMStatBP3");
						BlueTrapBP.setId("seMStatBP2");
						BlueCliBP.setId("seMStatBP1");
						BorderPane blueAllNameBP = new BorderPane();
						blueAllNameBP.setCenter(blueAll);
						blueAllNameBP.setId("seMStatBP6");
						VBox blueAllBP = new VBox(5);
						blueAllBP.getChildren().addAll(blueAllNameBP, BlueCyBP, BlueSpeBP, BlueAmpBP, BlueTrapBP, BlueCliBP);
						blue1VB.getChildren().addAll(blue1TeamNumBP, blue1CyBP, blue1CyAvgBP, blue1SpeBP, blue1SpeAvgBP, blue1AmpBP, blue1AmpAvgBP, blue1TrapBP, blue1TrapAvgBP, blue1CliBP, blue1CliAvgBP);
						blue2VB.getChildren().addAll(blue2TeamNumBP, blue2CyBP, blue2CyAvgBP, blue2SpeBP, blue2SpeAvgBP, blue2AmpBP, blue2AmpAvgBP, blue2TrapBP, blue2TrapAvgBP, blue2CliBP, blue2CliAvgBP);
						blue3VB.getChildren().add(noData1BP);
						blueHB.getChildren().addAll(blueAllBP, blue1VB, blue2VB, blue3VB);
					}
				}else if(blueTeams.size() == 1) {
					System.out.print("BoopseM13Blue1");
					int teamNum1 = blueTeams.get(0).getMatchTeamNum();
					Label blue1TeamNumL = new Label(Integer.toString(teamNum1));
					Label noDataLabel1L = new Label("No Data");
					Label noDataLabel2L = new Label("No Data");
					blue1TeamNumL.setId("smallTitle");
					noDataLabel1L.setId("smallTitle");
					noDataLabel2L.setId("smallTitle");
					BorderPane blue1TeamNumBP = new BorderPane();
					BorderPane noData1BP = new BorderPane();
					BorderPane noData2BP = new BorderPane();
					blue1TeamNumBP.setCenter(blue1TeamNumL);
					noData1BP.setCenter(noDataLabel1L);
					noData2BP.setCenter(noDataLabel2L);
					Label blue1Cy = new Label(Integer.toString(blueTeams.get(0).getMatchAmp() + blueTeams.get(0).getMatchSpe() + blueTeams.get(0).getMatchTrap()));
					blue1Cy.setId("avgStat");
					Label blue1Amp = new Label(Integer.toString(blueTeams.get(0).getMatchAmp()));
					Label blue1Spe = new Label(Integer.toString(blueTeams.get(0).getMatchSpe()));
					Label blue1Trap = new Label(Integer.toString(blueTeams.get(0).getMatchTrap()));
					blue1Amp.setId("avgStat");
					blue1Spe.setId("avgStat");
					blue1Trap.setId("avgStat");
					Label blue1AvgCy = new Label(Double.toString(theTL.getATeam(teamNum1).getAvgCycles()));
					Label blue1AvgSpe = new Label(Double.toString(theTL.getATeam(teamNum1).getAvgSpe()));
					Label blue1AvgAmp = new Label(Double.toString(theTL.getATeam(teamNum1).getAvgAmp()));
					Label blue1AvgTrap = new Label(Double.toString(theTL.getATeam(teamNum1).getAvgTrap()));
					blue1AvgCy.setId("avgStat");
					blue1AvgSpe.setId("avgStat");
					blue1AvgAmp.setId("avgStat");
					blue1AvgTrap.setId("avgStat");
					Label blue1Cli = new Label(Integer.toString(blueTeams.get(0).getMatchClimb()));
					Label blue1AvgCli = new Label(Double.toString(theTL.getATeam(teamNum1).getAvgClimb()));
					blue1Cli.setId("avgStat");
					blue1AvgCli.setId("avgStat");
					Label blue1CyQL = new Label("Match Cycles");
					Label blue1SpeQL = new Label("Match Speaker");
					Label blue1AmpQL = new Label("Match Amp");
					Label blue1TrapQL = new Label("Match Trap");
					Label blue1CliQL = new Label("Match Climb");
					Label blue1AvgCyQL = new Label("Avg Cycles");
					Label blue1AvgSpeQL = new Label("Avg Speaker");
					Label blue1AvgAmpQL = new Label("Avg Amp");
					Label blue1AvgTrapQL = new Label("Avg Trap");
					Label blue1AvgCliQL = new Label("Avg Climb");
					blue1CyQL.setId("smallTitle");
					blue1SpeQL.setId("smallTitle");
					blue1AmpQL.setId("smallTitle");
					blue1TrapQL.setId("smallTitle");
					blue1CliQL.setId("smallTitle");
					blue1AvgCyQL.setId("smallTitle");
					blue1AvgSpeQL.setId("smallTitle");
					blue1AvgAmpQL.setId("smallTitle");
					blue1AvgTrapQL.setId("smallTitle");
					blue1AvgCliQL.setId("smallTitle");
					BorderPane blue1CyBP = new BorderPane();
					BorderPane blue1SpeBP = new BorderPane();
					BorderPane blue1AmpBP = new BorderPane();
					BorderPane blue1TrapBP = new BorderPane();
					BorderPane blue1CliBP = new BorderPane();
					BorderPane blue1CyAvgBP = new BorderPane();
					BorderPane blue1SpeAvgBP = new BorderPane();
					BorderPane blue1AmpAvgBP = new BorderPane();
					BorderPane blue1TrapAvgBP = new BorderPane();
					BorderPane blue1CliAvgBP = new BorderPane();
					blue1CyBP.setTop(blue1CyQL);
					blue1SpeBP.setTop(blue1SpeQL);
					blue1AmpBP.setTop(blue1AmpQL);
					blue1TrapBP.setTop(blue1TrapQL);
					blue1CliBP.setTop(blue1CliQL);
					blue1CyAvgBP.setTop(blue1AvgCyQL);
					blue1SpeAvgBP.setTop(blue1AvgSpeQL);
					blue1AmpAvgBP.setTop(blue1AvgAmpQL);
					blue1TrapAvgBP.setTop(blue1AvgTrapQL);
					blue1CliAvgBP.setTop(blue1AvgCliQL);
					blue1CyBP.setCenter(blue1Cy);
					blue1SpeBP.setCenter(blue1Spe);
					blue1AmpBP.setCenter(blue1Amp);
					blue1TrapBP.setCenter(blue1Trap);
					blue1CliBP.setCenter(blue1Cli);
					blue1CyAvgBP.setCenter(blue1AvgCy);
					blue1SpeAvgBP.setCenter(blue1AvgSpe);
					blue1AmpAvgBP.setCenter(blue1AvgAmp);
					blue1TrapAvgBP.setCenter(blue1AvgTrap);
					blue1CliAvgBP.setCenter(blue1AvgCli);
					if(mainColor == false) {
						blue1TeamNumBP.setId("seMStatBP1");
						blue1CyBP.setId("seMStatBP3");
						blue1SpeBP.setId("seMStatBP5");
						blue1AmpBP.setId("seMStatBP7");
						blue1TrapBP.setId("seMStatBP9");
						blue1CliBP.setId("seMStatBP7");
						blue1CyAvgBP.setId("seMStatBP4");
						blue1SpeAvgBP.setId("seMStatBP6");
						blue1AmpAvgBP.setId("seMStatBP8");
						blue1TrapAvgBP.setId("seMStatBP8");
						blue1CliAvgBP.setId("seMStatBP6");
						noData1BP.setId("seMStatBP9");
						noData2BP.setId("seMStatBP1");
						VBox blue1VB = new VBox(5);
						VBox blue2VB = new VBox(5);
						VBox blue3VB = new VBox(5);
						Label blueCy = new Label(Integer.toString(blueTeams.get(0).getMatchAmp() + blueTeams.get(0).getMatchSpe() + blueTeams.get(0).getMatchTrap()));
						Label blueSpe = new Label(Integer.toString(blueTeams.get(0).getMatchSpe() + blueTeams.get(1).getMatchSpe()));;
						Label blueAmp = new Label(Integer.toString(blueTeams.get(0).getMatchAmp() + blueTeams.get(1).getMatchAmp()));;
						Label blueTrap = new Label(Integer.toString(blueTeams.get(0).getMatchTrap() + blueTeams.get(1).getMatchTrap()));;
						Label blueCli = new Label(Integer.toString(blueTeams.get(0).getMatchClimb() + blueTeams.get(1).getMatchClimb()));;
						Label blueAll = new Label("Blue Alliance");
						Label blueAllCyQL = new Label("Match Cycles");
						Label blueAllSpeQL = new Label("Match Speaker");
						Label blueAllAmpQL = new Label("Match Amp");
						Label blueAllTrapQL = new Label("Match Trap");
						Label blueAllCliQL = new Label("Match Climb");
						blueCy .setId("avgStat");
						blueSpe.setId("avgStat");
						blueAmp.setId("avgStat");
						blueTrap.setId("avgStat");
						blueCli.setId("avgStat");
						blueAll.setId("smallTitle");
						blueAllCyQL.setId("smallTitle");
						blueAllSpeQL.setId("smallTitle");
						blueAllAmpQL.setId("smallTitle");
						blueAllTrapQL.setId("smallTitle");
						blueAllCliQL.setId("smallTitle");
						BorderPane BlueCyBP = new BorderPane();
						BorderPane BlueSpeBP = new BorderPane();
						BorderPane BlueAmpBP = new BorderPane();
						BorderPane BlueTrapBP = new BorderPane();
						BorderPane BlueCliBP = new BorderPane();
						BlueCyBP.setTop(blueAllCyQL);
						BlueSpeBP.setTop(blueAllSpeQL);
						BlueAmpBP.setTop(blueAllAmpQL);
						BlueTrapBP.setTop(blueAllTrapQL);
						BlueCliBP.setTop(blueAllCliQL);
						BlueCyBP.setCenter(blueCy);
						BlueSpeBP.setCenter(blueSpe);
						BlueAmpBP.setCenter(blueAmp);
						BlueTrapBP.setCenter(blueTrap);
						BlueCliBP.setCenter(blueCli);
						BlueCyBP.setId("seMStatBP5");
						BlueSpeBP.setId("seMStatBP4");
						BlueAmpBP.setId("seMStatBP3");
						BlueTrapBP.setId("seMStatBP2");
						BlueCliBP.setId("seMStatBP1");
						BorderPane blueAllNameBP = new BorderPane();
						blueAllNameBP.setCenter(blueAll);
						blueAllNameBP.setId("seMStatBP6");
						VBox blueAllBP = new VBox(5);
						blueAllBP.getChildren().addAll(blueAllNameBP, BlueCyBP, BlueSpeBP, BlueAmpBP, BlueTrapBP, BlueCliBP);
						blue1VB.getChildren().addAll(blue1TeamNumBP, blue1CyBP, blue1CyAvgBP, blue1SpeBP, blue1SpeAvgBP, blue1AmpBP, blue1AmpAvgBP, blue1TrapBP, blue1TrapAvgBP, blue1CliBP, blue1CliAvgBP);
						blue2VB.getChildren().add(noData1BP);
						blue3VB.getChildren().add(noData2BP);
						blueHB.getChildren().addAll(blueAllBP, blue1VB, blue2VB, blue3VB);
					}else {
						blue1TeamNumBP.setId("seMStatBP9");
						blue1CyBP.setId("seMStatBP7");
						blue1SpeBP.setId("seMStatBP5");
						blue1AmpBP.setId("seMStatBP3");
						blue1TrapBP.setId("seMStatBP1");
						blue1CliBP.setId("seMStatBP3");
						blue1CyAvgBP.setId("seMStatBP6");
						blue1SpeAvgBP.setId("seMStatBP4");
						blue1AmpAvgBP.setId("seMStatBP2");
						blue1TrapAvgBP.setId("seMStatBP2");
						blue1CliAvgBP.setId("seMStatBP4");
						noData1BP.setId("seMStatBP1");
						noData2BP.setId("seMStatBP9");
						VBox blue1VB = new VBox(5);
						VBox blue2VB = new VBox(5);
						VBox blue3VB = new VBox(5);
						Label blueCy = new Label(Integer.toString(blueTeams.get(0).getMatchAmp() + blueTeams.get(0).getMatchSpe() + blueTeams.get(0).getMatchTrap()));
						Label blueSpe = new Label(Integer.toString(blueTeams.get(0).getMatchSpe() + blueTeams.get(1).getMatchSpe()));;
						Label blueAmp = new Label(Integer.toString(blueTeams.get(0).getMatchAmp() + blueTeams.get(1).getMatchAmp()));;
						Label blueTrap = new Label(Integer.toString(blueTeams.get(0).getMatchTrap() + blueTeams.get(1).getMatchTrap()));;
						Label blueCli = new Label(Integer.toString(blueTeams.get(0).getMatchClimb() + blueTeams.get(1).getMatchClimb()));;
						Label blueAll = new Label("Blue Alliance");
						Label blueAllCyQL = new Label("Match Cycles");
						Label blueAllSpeQL = new Label("Match Speaker");
						Label blueAllAmpQL = new Label("Match Amp");
						Label blueAllTrapQL = new Label("Match Trap");
						Label blueAllCliQL = new Label("Match Climb");
						blueCy .setId("avgStat");
						blueSpe.setId("avgStat");
						blueAmp.setId("avgStat");
						blueTrap.setId("avgStat");
						blueCli.setId("avgStat");
						blueAll.setId("smallTitle");
						blueAllCyQL.setId("smallTitle");
						blueAllSpeQL.setId("smallTitle");
						blueAllAmpQL.setId("smallTitle");
						blueAllTrapQL.setId("smallTitle");
						blueAllCliQL.setId("smallTitle");
						BorderPane BlueCyBP = new BorderPane();
						BorderPane BlueSpeBP = new BorderPane();
						BorderPane BlueAmpBP = new BorderPane();
						BorderPane BlueTrapBP = new BorderPane();
						BorderPane BlueCliBP = new BorderPane();
						BlueCyBP.setTop(blueAllCyQL);
						BlueSpeBP.setTop(blueAllSpeQL);
						BlueAmpBP.setTop(blueAllAmpQL);
						BlueTrapBP.setTop(blueAllTrapQL);
						BlueCliBP.setTop(blueAllCliQL);
						BlueCyBP.setCenter(blueCy);
						BlueSpeBP.setCenter(blueSpe);
						BlueAmpBP.setCenter(blueAmp);
						BlueTrapBP.setCenter(blueTrap);
						BlueCliBP.setCenter(blueCli);
						BlueCyBP.setId("seMStatBP5");
						BlueSpeBP.setId("seMStatBP4");
						BlueAmpBP.setId("seMStatBP3");
						BlueTrapBP.setId("seMStatBP2");
						BlueCliBP.setId("seMStatBP1");
						BorderPane blueAllNameBP = new BorderPane();
						blueAllNameBP.setCenter(blueAll);
						blueAllNameBP.setId("seMStatBP6");
						VBox blueAllBP = new VBox(5);
						blueAllBP.getChildren().addAll(blueAllNameBP, BlueCyBP, BlueSpeBP, BlueAmpBP, BlueTrapBP, BlueCliBP);
						blue1VB.getChildren().addAll(blue1TeamNumBP, blue1CyBP, blue1CyAvgBP, blue1SpeBP, blue1SpeAvgBP, blue1AmpBP, blue1AmpAvgBP, blue1TrapBP, blue1TrapAvgBP, blue1CliBP, blue1CliAvgBP);
						blue2VB.getChildren().add(noData1BP);
						blue3VB.getChildren().add(noData1BP);
						blueHB.getChildren().addAll(blueAllBP, blue1VB, blue2VB, blue3VB);
					}
				}else if(blueTeams.size() == 0) {
					System.out.print("BoopseM13Blue0");
					Label noDataLabel1L = new Label("No Data");
					Label noDataLabel2L = new Label("No Data");
					Label noDataLabel3L = new Label("No Data");
					noDataLabel1L.setId("smallTitle");
					noDataLabel2L.setId("smallTitle");
					noDataLabel3L.setId("smallTitle");
					BorderPane noData1BP = new BorderPane();
					BorderPane noData2BP = new BorderPane();
					BorderPane noData3BP = new BorderPane();
					noData1BP.setCenter(noDataLabel1L);
					noData2BP.setCenter(noDataLabel2L);
					noData3BP.setCenter(noDataLabel3L);
					if(mainColor == false) {
						noData1BP.setId("seMStatBP9");
						noData2BP.setId("seMStatBP1");
						noData2BP.setId("seMStatBP9");
						VBox blue1VB = new VBox(5);
						VBox blue2VB = new VBox(5);
						VBox blue3VB = new VBox(5);
						blue1VB.getChildren().addAll(noData1BP);
						blue2VB.getChildren().add(noData2BP);
						blue3VB.getChildren().add(noData3BP);
						blueHB.getChildren().addAll(blue1VB, blue2VB, blue3VB);
					}else {
						noData1BP.setId("seMStatBP1");
						noData2BP.setId("seMStatBP9");
						noData2BP.setId("seMStatBP1");
						VBox blue1VB = new VBox(5);
						VBox blue2VB = new VBox(5);
						VBox blue3VB = new VBox(5);
						blue1VB.getChildren().addAll(noData1BP);
						blue2VB.getChildren().add(noData2BP);
						blue3VB.getChildren().add(noData3BP);
						blueHB.getChildren().addAll(blue1VB, blue2VB, blue3VB);
					}
				}
				if(redTeams.size() == 3) {
					System.out.print("BoopseM13red3");
					int teamNum1 = redTeams.get(0).getMatchTeamNum();
					int teamNum2 = redTeams.get(1).getMatchTeamNum();
					int teamNum3 = redTeams.get(2).getMatchTeamNum();
					Label red1TeamNumL = new Label(Integer.toString(teamNum1) + "'s Stats");
					Label red2TeamNumL = new Label(Integer.toString(teamNum2) + "'s Stats");
					Label red3TeamNumL = new Label(Integer.toString(teamNum3) + "'s Stats");
					red1TeamNumL.setId("smallTitle");
					red2TeamNumL.setId("smallTitle");
					red3TeamNumL.setId("smallTitle");
					BorderPane red1TeamNumBP = new BorderPane();
					BorderPane red2TeamNumBP = new BorderPane();
					BorderPane red3TeamNumBP = new BorderPane();
					red1TeamNumBP.setCenter(red1TeamNumL);
					red2TeamNumBP.setCenter(red2TeamNumL);
					red3TeamNumBP.setCenter(red3TeamNumL);
					Label red1Cy = new Label(Integer.toString(redTeams.get(0).getMatchAmp() + redTeams.get(0).getMatchSpe() + redTeams.get(0).getMatchTrap()));
					Label red2Cy = new Label(Integer.toString(redTeams.get(1).getMatchAmp() + redTeams.get(1).getMatchSpe() + redTeams.get(1).getMatchTrap()));
					Label red3Cy = new Label(Integer.toString(redTeams.get(2).getMatchAmp() + redTeams.get(2).getMatchSpe() + redTeams.get(2).getMatchTrap()));
					red1Cy.setId("avgStat");
					red2Cy.setId("avgStat");
					red3Cy.setId("avgStat");
					Label red1Amp = new Label(Integer.toString(redTeams.get(0).getMatchAmp()));
					Label red2Amp = new Label(Integer.toString(redTeams.get(1).getMatchAmp()));
					Label red3Amp = new Label(Integer.toString(redTeams.get(2).getMatchAmp()));
					Label red1Spe = new Label(Integer.toString(redTeams.get(0).getMatchSpe()));
					Label red2Spe = new Label(Integer.toString(redTeams.get(1).getMatchSpe()));
					Label red3Spe = new Label(Integer.toString(redTeams.get(2).getMatchSpe()));
					Label red1Trap = new Label(Integer.toString(redTeams.get(0).getMatchTrap()));
					Label red2Trap = new Label(Integer.toString(redTeams.get(1).getMatchTrap()));
					Label red3Trap = new Label(Integer.toString(redTeams.get(2).getMatchTrap()));
					red1Amp.setId("avgStat");
					red2Amp.setId("avgStat");
					red3Amp.setId("avgStat");
					red1Spe.setId("avgStat");
					red2Spe.setId("avgStat");
					red3Spe.setId("avgStat");
					red1Trap.setId("avgStat");
					red2Trap.setId("avgStat");
					red3Trap.setId("avgStat");
					Label red1AvgCy = new Label(Double.toString(theTL.getATeam(teamNum1).getAvgCycles()));
					Label red2AvgCy = new Label(Double.toString(theTL.getATeam(teamNum2).getAvgCycles()));
					Label red3AvgCy = new Label(Double.toString(theTL.getATeam(teamNum3).getAvgCycles()));
					Label red1AvgSpe = new Label(Double.toString(theTL.getATeam(teamNum1).getAvgSpe()));
					Label red2AvgSpe = new Label(Double.toString(theTL.getATeam(teamNum2).getAvgSpe()));
					Label red3AvgSpe = new Label(Double.toString(theTL.getATeam(teamNum3).getAvgSpe()));
					Label red1AvgAmp = new Label(Double.toString(theTL.getATeam(teamNum1).getAvgAmp()));
					Label red2AvgAmp = new Label(Double.toString(theTL.getATeam(teamNum2).getAvgAmp()));
					Label red3AvgAmp = new Label(Double.toString(theTL.getATeam(teamNum3).getAvgAmp()));
					Label red1AvgTrap = new Label(Double.toString(theTL.getATeam(teamNum1).getAvgTrap()));
					Label red2AvgTrap = new Label(Double.toString(theTL.getATeam(teamNum2).getAvgTrap()));
					Label red3AvgTrap = new Label(Double.toString(theTL.getATeam(teamNum3).getAvgTrap()));
					red1AvgCy.setId("avgStat");
					red2AvgCy.setId("avgStat");
					red3AvgCy.setId("avgStat");
					red1AvgSpe.setId("avgStat");
					red2AvgSpe.setId("avgStat");
					red3AvgSpe.setId("avgStat");
					red1AvgAmp.setId("avgStat");
					red2AvgAmp.setId("avgStat");
					red3AvgAmp.setId("avgStat");
					red1AvgTrap.setId("avgStat");
					red2AvgTrap.setId("avgStat");
					red3AvgTrap.setId("avgStat");
					Label red1Cli = new Label(Integer.toString(redTeams.get(0).getMatchClimb()));
					Label red2Cli = new Label(Integer.toString(redTeams.get(1).getMatchClimb()));
					Label red3Cli = new Label(Integer.toString(redTeams.get(2).getMatchClimb()));
					Label red1AvgCli = new Label(Double.toString(theTL.getATeam(teamNum1).getAvgClimb()));
					Label red2AvgCli = new Label(Double.toString(theTL.getATeam(teamNum2).getAvgClimb()));
					Label red3AvgCli = new Label(Double.toString(theTL.getATeam(teamNum3).getAvgClimb()));
					red1Cli.setId("avgStat");
					red2Cli.setId("avgStat");
					red3Cli.setId("avgStat");
					red1AvgCli.setId("avgStat");
					red2AvgCli.setId("avgStat");
					red3AvgCli.setId("avgStat");
					Label red1CyQL = new Label("Match Cycles");
					Label red1SpeQL = new Label("Match Speaker");
					Label red1AmpQL = new Label("Match Amp");
					Label red1TrapQL = new Label("Match Trap");
					Label red1CliQL = new Label("Match Climb");
					Label red2CyQL = new Label("Match Cycles");
					Label red2SpeQL = new Label("Match Speaker");
					Label red2AmpQL = new Label("Match Amp");
					Label red2TrapQL = new Label("Match Trap");
					Label red2CliQL = new Label("Match Climb");
					Label red3CyQL = new Label("Match Cycles");
					Label red3SpeQL = new Label("Match Speaker");
					Label red3AmpQL = new Label("Match Amp");
					Label red3TrapQL = new Label("Match Trap");
					Label red3CliQL = new Label("Match Climb");
					Label red1AvgCyQL = new Label("Avg Cycles");
					Label red1AvgSpeQL = new Label("Avg Speaker");
					Label red1AvgAmpQL = new Label("Avg Amp");
					Label red1AvgTrapQL = new Label("Avg Trap");
					Label red1AvgCliQL = new Label("Avg Climb");
					Label red2AvgCyQL = new Label("Avg Cycles");
					Label red2AvgSpeQL = new Label("Avg Speaker");
					Label red2AvgAmpQL = new Label("Avg Amp");
					Label red2AvgTrapQL = new Label("Avg Trap");
					Label red2AvgCliQL = new Label("Avg Climb");
					Label red3AvgCyQL = new Label("Avg Cycles");
					Label red3AvgSpeQL = new Label("Avg Speaker");
					Label red3AvgAmpQL = new Label("Avg Amp");
					Label red3AvgTrapQL = new Label("Avg Trap");
					Label red3AvgCliQL = new Label("Avg Climb");
					red1CyQL.setId("smallTitle");
					red1SpeQL.setId("smallTitle");
					red1AmpQL.setId("smallTitle");
					red1TrapQL.setId("smallTitle");
					red1CliQL.setId("smallTitle");
					red2CyQL.setId("smallTitle");
					red2SpeQL.setId("smallTitle");
					red2AmpQL.setId("smallTitle");
					red2TrapQL.setId("smallTitle");
					red2CliQL.setId("smallTitle");
					red3CyQL.setId("smallTitle");
					red3SpeQL.setId("smallTitle");
					red3AmpQL.setId("smallTitle");
					red3TrapQL.setId("smallTitle");
					red3CliQL.setId("smallTitle");
					red1AvgCyQL.setId("smallTitle");
					red1AvgSpeQL.setId("smallTitle");
					red1AvgAmpQL.setId("smallTitle");
					red1AvgTrapQL.setId("smallTitle");
					red1AvgCliQL.setId("smallTitle");
					red2AvgCyQL.setId("smallTitle");
					red2AvgSpeQL.setId("smallTitle");
					red2AvgAmpQL.setId("smallTitle");
					red2AvgTrapQL.setId("smallTitle");
					red2AvgCliQL.setId("smallTitle");
					red3AvgCyQL.setId("smallTitle");
					red3AvgSpeQL.setId("smallTitle");
					red3AvgAmpQL.setId("smallTitle");
					red3AvgTrapQL.setId("smallTitle");
					red3AvgCliQL.setId("smallTitle");
					BorderPane red1CyBP = new BorderPane();
					BorderPane red1SpeBP = new BorderPane();
					BorderPane red1AmpBP = new BorderPane();
					BorderPane red1TrapBP = new BorderPane();
					BorderPane red1CliBP = new BorderPane();
					BorderPane red1CyAvgBP = new BorderPane();
					BorderPane red1SpeAvgBP = new BorderPane();
					BorderPane red1AmpAvgBP = new BorderPane();
					BorderPane red1TrapAvgBP = new BorderPane();
					BorderPane red1CliAvgBP = new BorderPane();
					BorderPane red2CyBP = new BorderPane();
					BorderPane red2SpeBP = new BorderPane();
					BorderPane red2AmpBP = new BorderPane();
					BorderPane red2TrapBP = new BorderPane();
					BorderPane red2CliBP = new BorderPane();
					BorderPane red2CyAvgBP = new BorderPane();
					BorderPane red2SpeAvgBP = new BorderPane();
					BorderPane red2AmpAvgBP = new BorderPane();
					BorderPane red2TrapAvgBP = new BorderPane();
					BorderPane red2CliAvgBP = new BorderPane();
					BorderPane red3CyBP = new BorderPane();
					BorderPane red3SpeBP = new BorderPane();
					BorderPane red3AmpBP = new BorderPane();
					BorderPane red3TrapBP = new BorderPane();
					BorderPane red3CliBP = new BorderPane();
					BorderPane red3CyAvgBP = new BorderPane();
					BorderPane red3SpeAvgBP = new BorderPane();
					BorderPane red3AmpAvgBP = new BorderPane();
					BorderPane red3TrapAvgBP = new BorderPane();
					BorderPane red3CliAvgBP = new BorderPane();
					red1CyBP.setTop(red1CyQL);
					red1SpeBP.setTop(red1SpeQL);
					red1AmpBP.setTop(red1AmpQL);
					red1TrapBP.setTop(red1TrapQL);
					red1CliBP.setTop(red1CliQL);
					red1CyAvgBP.setTop(red1AvgCyQL);
					red1SpeAvgBP.setTop(red1AvgSpeQL);
					red1AmpAvgBP.setTop(red1AvgAmpQL);
					red1TrapAvgBP.setTop(red1AvgTrapQL);
					red1CliAvgBP.setTop(red1AvgCliQL);
					red2CyBP.setTop(red2CyQL);
					red2SpeBP.setTop(red2SpeQL);
					red2AmpBP.setTop(red2AmpQL);
					red2TrapBP.setTop(red2TrapQL);
					red2CliBP.setTop(red2CliQL);
					red2CyAvgBP.setTop(red2AvgCyQL);
					red2SpeAvgBP.setTop(red2AvgSpeQL);
					red2AmpAvgBP.setTop(red2AvgAmpQL);
					red2TrapAvgBP.setTop(red2AvgTrapQL);
					red2CliAvgBP.setTop(red2AvgCliQL);
					red3CyBP.setTop(red3CyQL);
					red3SpeBP.setTop(red3SpeQL);
					red3AmpBP.setTop(red3AmpQL);
					red3TrapBP.setTop(red3TrapQL);
					red3CliBP.setTop(red3CliQL);
					red3CyAvgBP.setTop(red3AvgCyQL);
					red3SpeAvgBP.setTop(red3AvgSpeQL);
					red3AmpAvgBP.setTop(red3AvgAmpQL);
					red3TrapAvgBP.setTop(red3AvgTrapQL);
					red3CliAvgBP.setTop(red3AvgCliQL);
					red1CyBP.setCenter(red1Cy);
					red1SpeBP.setCenter(red1Spe);
					red1AmpBP.setCenter(red1Amp);
					red1TrapBP.setCenter(red1Trap);
					red1CliBP.setCenter(red1Cli);
					red1CyAvgBP.setCenter(red1AvgCy);
					red1SpeAvgBP.setCenter(red1AvgSpe);
					red1AmpAvgBP.setCenter(red1AvgAmp);
					red1TrapAvgBP.setCenter(red1AvgTrap);
					red1CliAvgBP.setCenter(red1AvgCli);
					red2CyBP.setCenter(red2Cy);
					red2SpeBP.setCenter(red2Spe);
					red2AmpBP.setCenter(red2Amp);
					red2TrapBP.setCenter(red2Trap);
					red2CliBP.setCenter(red2Cli);
					red2CyAvgBP.setCenter(red2AvgCy);
					red2SpeAvgBP.setCenter(red2AvgSpe);
					red2AmpAvgBP.setCenter(red2AvgAmp);
					red2TrapAvgBP.setCenter(red2AvgTrap);
					red2CliAvgBP.setCenter(red2AvgCli);
					red3CyBP.setCenter(red3Cy);
					red3SpeBP.setCenter(red3Spe);
					red3AmpBP.setCenter(red3Amp);
					red3TrapBP.setCenter(red3Trap);
					red3CliBP.setCenter(red3Cli);
					red3CyAvgBP.setCenter(red3AvgCy);
					red3SpeAvgBP.setCenter(red3AvgSpe);
					red3AmpAvgBP.setCenter(red3AvgAmp);
					red3TrapAvgBP.setCenter(red3AvgTrap);
					red3CliAvgBP.setCenter(red3AvgCli);
					if(mainColor == true) {
						red1TeamNumBP.setId("seMStatBP1");
						red1CyBP.setId("seMStatBP3");
						red1SpeBP.setId("seMStatBP5");
						red1AmpBP.setId("seMStatBP7");
						red1TrapBP.setId("seMStatBP9");
						red1CliBP.setId("seMStatBP7");
						red1CyAvgBP.setId("seMStatBP4");
						red1SpeAvgBP.setId("seMStatBP6");
						red1AmpAvgBP.setId("seMStatBP8");
						red1TrapAvgBP.setId("seMStatBP8");
						red1CliAvgBP.setId("seMStatBP6");
						red2TeamNumBP.setId("seMStatBP9");
						red2CyBP.setId("seMStatBP7");
						red2SpeBP.setId("seMStatBP5");
						red2AmpBP.setId("seMStatBP3");
						red2TrapBP.setId("seMStatBP1");
						red2CliBP.setId("seMStatBP3");
						red2CyAvgBP.setId("seMStatBP6");
						red2SpeAvgBP.setId("seMStatBP4");
						red2AmpAvgBP.setId("seMStatBP2");
						red2TrapAvgBP.setId("seMStatBP2");
						red2CliAvgBP.setId("seMStatBP4");
						red3TeamNumBP.setId("seMStatBP1");
						red3CyBP.setId("seMStatBP3");
						red3SpeBP.setId("seMStatBP5");
						red3AmpBP.setId("seMStatBP7");
						red3TrapBP.setId("seMStatBP9");
						red3CliBP.setId("seMStatBP7");
						red3CyAvgBP.setId("seMStatBP4");
						red3SpeAvgBP.setId("seMStatBP6");
						red3AmpAvgBP.setId("seMStatBP8");
						red3TrapAvgBP.setId("seMStatBP8");
						red3CliAvgBP.setId("seMStatBP6");
						VBox red1VB = new VBox(5);
						VBox red2VB = new VBox(5);
						VBox red3VB = new VBox(5);
						Label redCy = new Label(Integer.toString(redTeams.get(0).getMatchAmp() + redTeams.get(1).getMatchAmp() + redTeams.get(2).getMatchAmp() + redTeams.get(0).getMatchSpe() + redTeams.get(1).getMatchSpe() + redTeams.get(2).getMatchSpe() + redTeams.get(0).getMatchTrap() + redTeams.get(1).getMatchTrap() + redTeams.get(2).getMatchTrap()));
						Label redSpe = new Label(Integer.toString(redTeams.get(0).getMatchSpe() + redTeams.get(1).getMatchSpe() + redTeams.get(2).getMatchSpe()));;
						Label redAmp = new Label(Integer.toString(redTeams.get(0).getMatchAmp() + redTeams.get(1).getMatchAmp() + redTeams.get(2).getMatchAmp()));;
						Label redTrap = new Label(Integer.toString(redTeams.get(0).getMatchTrap() + redTeams.get(1).getMatchTrap() + redTeams.get(2).getMatchTrap()));;
						Label redCli = new Label(Integer.toString(redTeams.get(0).getMatchClimb() + redTeams.get(1).getMatchClimb() + redTeams.get(2).getMatchClimb()));;
						Label redAll = new Label("Red Alliance");
						Label redAllCyQL = new Label("Match Cycles");
						Label redAllSpeQL = new Label("Match Speaker");
						Label redAllAmpQL = new Label("Match Amp");
						Label redAllTrapQL = new Label("Match Trap");
						Label redAllCliQL = new Label("Match Climb");
						redCy .setId("avgStat");
						redSpe.setId("avgStat");
						redAmp.setId("avgStat");
						redTrap.setId("avgStat");
						redCli.setId("avgStat");
						redAll.setId("smallTitle");
						redAllCyQL.setId("smallTitle");
						redAllSpeQL.setId("smallTitle");
						redAllAmpQL.setId("smallTitle");
						redAllTrapQL.setId("smallTitle");
						redAllCliQL.setId("smallTitle");
						BorderPane RedCyBP = new BorderPane();
						BorderPane RedSpeBP = new BorderPane();
						BorderPane RedAmpBP = new BorderPane();
						BorderPane RedTrapBP = new BorderPane();
						BorderPane RedCliBP = new BorderPane();
						RedCyBP.setTop(redAllCyQL);
						RedSpeBP.setTop(redAllSpeQL);
						RedAmpBP.setTop(redAllAmpQL);
						RedTrapBP.setTop(redAllTrapQL);
						RedCliBP.setTop(redAllCliQL);
						RedCyBP.setCenter(redCy);
						RedSpeBP.setCenter(redSpe);
						RedAmpBP.setCenter(redAmp);
						RedTrapBP.setCenter(redTrap);
						RedCliBP.setCenter(redCli);
						RedCyBP.setId("seMStatBP5");
						RedSpeBP.setId("seMStatBP4");
						RedAmpBP.setId("seMStatBP3");
						RedTrapBP.setId("seMStatBP2");
						RedCliBP.setId("seMStatBP1");
						BorderPane redAllNameBP = new BorderPane();
						redAllNameBP.setCenter(redAll);
						redAllNameBP.setId("seMStatBP6");
						VBox redAllBP = new VBox(5);
						redAllBP.getChildren().addAll(redAllNameBP, RedCyBP, RedSpeBP, RedAmpBP, RedTrapBP, RedCliBP);
						red1VB.getChildren().addAll(red1TeamNumBP, red1CyBP, red1CyAvgBP, red1SpeBP, red1SpeAvgBP, red1AmpBP, red1AmpAvgBP, red1TrapBP, red1TrapAvgBP, red1CliBP, red1CliAvgBP);
						red2VB.getChildren().addAll(red2TeamNumBP, red2CyBP, red2CyAvgBP, red2SpeBP, red2SpeAvgBP, red2AmpBP, red2AmpAvgBP, red2TrapBP, red2TrapAvgBP, red2CliBP, red2CliAvgBP);
						red3VB.getChildren().addAll(red3TeamNumBP, red3CyBP, red3CyAvgBP, red3SpeBP, red3SpeAvgBP, red3AmpBP, red3AmpAvgBP, red3TrapBP, red3TrapAvgBP, red3CliBP, red3CliAvgBP);
						redHB.getChildren().addAll(redAllBP, red1VB, red2VB, red3VB);
					}else {
						red1TeamNumBP.setId("seMStatBP9");
						red1CyBP.setId("seMStatBP7");
						red1SpeBP.setId("seMStatBP5");
						red1AmpBP.setId("seMStatBP3");
						red1TrapBP.setId("seMStatBP1");
						red1CliBP.setId("seMStatBP3");
						red1CyAvgBP.setId("seMStatBP6");
						red1SpeAvgBP.setId("seMStatBP4");
						red1AmpAvgBP.setId("seMStatBP2");
						red1TrapAvgBP.setId("seMStatBP2");
						red1CliAvgBP.setId("seMStatBP4");
						red2TeamNumBP.setId("seMStatBP1");
						red2CyBP.setId("seMStatBP3");
						red2SpeBP.setId("seMStatBP5");
						red2AmpBP.setId("seMStatBP7");
						red2TrapBP.setId("seMStatBP9");
						red2CliBP.setId("seMStatBP7");
						red2CyAvgBP.setId("seMStatBP4");
						red2SpeAvgBP.setId("seMStatBP6");
						red2AmpAvgBP.setId("seMStatBP8");
						red2TrapAvgBP.setId("seMStatBP8");
						red2CliAvgBP.setId("seMStatBP6");
						red3TeamNumBP.setId("seMStatBP9");
						red3CyBP.setId("seMStatBP7");
						red3SpeBP.setId("seMStatBP5");
						red3AmpBP.setId("seMStatBP3");
						red3TrapBP.setId("seMStatBP1");
						red3CliBP.setId("seMStatBP3");
						red3CyAvgBP.setId("seMStatBP6");
						red3SpeAvgBP.setId("seMStatBP4");
						red3AmpAvgBP.setId("seMStatBP2");
						red3TrapAvgBP.setId("seMStatBP2");
						red3CliAvgBP.setId("seMStatBP4");
						VBox red1VB = new VBox(5);
						VBox red2VB = new VBox(5);
						VBox red3VB = new VBox(5);
						Label redCy = new Label(Integer.toString(redTeams.get(0).getMatchAmp() + redTeams.get(1).getMatchAmp() + redTeams.get(2).getMatchAmp() + redTeams.get(0).getMatchSpe() + redTeams.get(1).getMatchSpe() + redTeams.get(2).getMatchSpe() + redTeams.get(0).getMatchTrap() + redTeams.get(1).getMatchTrap() + redTeams.get(2).getMatchTrap()));
						Label redSpe = new Label(Integer.toString(redTeams.get(0).getMatchSpe() + redTeams.get(1).getMatchSpe() + redTeams.get(2).getMatchSpe()));;
						Label redAmp = new Label(Integer.toString(redTeams.get(0).getMatchAmp() + redTeams.get(1).getMatchAmp() + redTeams.get(2).getMatchAmp()));;
						Label redTrap = new Label(Integer.toString(redTeams.get(0).getMatchTrap() + redTeams.get(1).getMatchTrap() + redTeams.get(2).getMatchTrap()));;
						Label redCli = new Label(Integer.toString(redTeams.get(0).getMatchClimb() + redTeams.get(1).getMatchClimb() + redTeams.get(2).getMatchClimb()));;
						Label redAll = new Label("Red Alliance");
						Label redAllCyQL = new Label("Match Cycles");
						Label redAllSpeQL = new Label("Match Speaker");
						Label redAllAmpQL = new Label("Match Amp");
						Label redAllTrapQL = new Label("Match Trap");
						Label redAllCliQL = new Label("Match Climb");
						redCy .setId("avgStat");
						redSpe.setId("avgStat");
						redAmp.setId("avgStat");
						redTrap.setId("avgStat");
						redCli.setId("avgStat");
						redAll.setId("smallTitle");
						redAllCyQL.setId("smallTitle");
						redAllSpeQL.setId("smallTitle");
						redAllAmpQL.setId("smallTitle");
						redAllTrapQL.setId("smallTitle");
						redAllCliQL.setId("smallTitle");
						BorderPane RedCyBP = new BorderPane();
						BorderPane RedSpeBP = new BorderPane();
						BorderPane RedAmpBP = new BorderPane();
						BorderPane RedTrapBP = new BorderPane();
						BorderPane RedCliBP = new BorderPane();
						RedCyBP.setTop(redAllCyQL);
						RedSpeBP.setTop(redAllSpeQL);
						RedAmpBP.setTop(redAllAmpQL);
						RedTrapBP.setTop(redAllTrapQL);
						RedCliBP.setTop(redAllCliQL);
						RedCyBP.setCenter(redCy);
						RedSpeBP.setCenter(redSpe);
						RedAmpBP.setCenter(redAmp);
						RedTrapBP.setCenter(redTrap);
						RedCliBP.setCenter(redCli);
						RedCyBP.setId("seMStatBP5");
						RedSpeBP.setId("seMStatBP4");
						RedAmpBP.setId("seMStatBP3");
						RedTrapBP.setId("seMStatBP2");
						RedCliBP.setId("seMStatBP1");
						BorderPane redAllNameBP = new BorderPane();
						redAllNameBP.setCenter(redAll);
						redAllNameBP.setId("seMStatBP6");
						VBox redAllBP = new VBox(5);
						redAllBP.getChildren().addAll(redAllNameBP, RedCyBP, RedSpeBP, RedAmpBP, RedTrapBP, RedCliBP);
						red1VB.getChildren().addAll(red1TeamNumBP, red1CyBP, red1CyAvgBP, red1SpeBP, red1SpeAvgBP, red1AmpBP, red1AmpAvgBP, red1TrapBP, red1TrapAvgBP, red1CliBP, red1CliAvgBP);
						red2VB.getChildren().addAll(red2TeamNumBP, red2CyBP, red2CyAvgBP, red2SpeBP, red2SpeAvgBP, red2AmpBP, red2AmpAvgBP, red2TrapBP, red2TrapAvgBP, red2CliBP, red2CliAvgBP);
						red3VB.getChildren().addAll(red3TeamNumBP, red3CyBP, red3CyAvgBP, red3SpeBP, red3SpeAvgBP, red3AmpBP, red3AmpAvgBP, red3TrapBP, red3TrapAvgBP, red3CliBP, red3CliAvgBP);
						redHB.getChildren().addAll(redAllBP, red1VB, red2VB, red3VB);
					}
				}else if(redTeams.size() == 2) {
					System.out.print("BoopseM13red2");
					int teamNum1 = redTeams.get(0).getMatchTeamNum();
					int teamNum2 = redTeams.get(1).getMatchTeamNum();
					Label red1TeamNumL = new Label(Integer.toString(teamNum1));
					Label red2TeamNumL = new Label(Integer.toString(teamNum2));
					Label noDataLabel1L = new Label("No Data");
					red1TeamNumL.setId("smallTitle");
					red2TeamNumL.setId("smallTitle");
					noDataLabel1L.setId("smallTitle");
					BorderPane red1TeamNumBP = new BorderPane();
					BorderPane red2TeamNumBP = new BorderPane();
					BorderPane noData1BP = new BorderPane();
					red1TeamNumBP.setCenter(red1TeamNumL);
					red2TeamNumBP.setCenter(red2TeamNumL);
					noData1BP.setCenter(noDataLabel1L);
					Label red1Cy = new Label(Integer.toString(redTeams.get(0).getMatchAmp() + redTeams.get(0).getMatchSpe() + redTeams.get(0).getMatchTrap()));
					Label red2Cy = new Label(Integer.toString(redTeams.get(1).getMatchAmp() + redTeams.get(1).getMatchSpe() + redTeams.get(1).getMatchTrap()));
					red1Cy.setId("avgStat");
					red2Cy.setId("avgStat");
					Label red1Amp = new Label(Integer.toString(redTeams.get(0).getMatchAmp()));
					Label red2Amp = new Label(Integer.toString(redTeams.get(1).getMatchAmp()));
					Label red1Spe = new Label(Integer.toString(redTeams.get(0).getMatchSpe()));
					Label red2Spe = new Label(Integer.toString(redTeams.get(1).getMatchSpe()));
					Label red1Trap = new Label(Integer.toString(redTeams.get(0).getMatchTrap()));
					Label red2Trap = new Label(Integer.toString(redTeams.get(1).getMatchTrap()));
					red1Amp.setId("avgStat");
					red2Amp.setId("avgStat");
					red1Spe.setId("avgStat");
					red2Spe.setId("avgStat");
					red1Trap.setId("avgStat");
					red2Trap.setId("avgStat");
					Label red1AvgCy = new Label(Double.toString(theTL.getATeam(teamNum1).getAvgCycles()));
					Label red2AvgCy = new Label(Double.toString(theTL.getATeam(teamNum2).getAvgCycles()));
					Label red1AvgSpe = new Label(Double.toString(theTL.getATeam(teamNum1).getAvgSpe()));
					Label red2AvgSpe = new Label(Double.toString(theTL.getATeam(teamNum2).getAvgSpe()));
					Label red1AvgAmp = new Label(Double.toString(theTL.getATeam(teamNum1).getAvgAmp()));
					Label red2AvgAmp = new Label(Double.toString(theTL.getATeam(teamNum2).getAvgAmp()));
					Label red1AvgTrap = new Label(Double.toString(theTL.getATeam(teamNum1).getAvgTrap()));
					Label red2AvgTrap = new Label(Double.toString(theTL.getATeam(teamNum2).getAvgTrap()));
					red1AvgCy.setId("avgStat");
					red2AvgCy.setId("avgStat");
					red1AvgSpe.setId("avgStat");
					red2AvgSpe.setId("avgStat");
					red1AvgAmp.setId("avgStat");
					red2AvgAmp.setId("avgStat");
					red1AvgTrap.setId("avgStat");
					red2AvgTrap.setId("avgStat");
					Label red1Cli = new Label(Integer.toString(redTeams.get(0).getMatchClimb()));
					Label red2Cli = new Label(Integer.toString(redTeams.get(1).getMatchClimb()));
					Label red1AvgCli = new Label(Double.toString(theTL.getATeam(teamNum1).getAvgClimb()));
					Label red2AvgCli = new Label(Double.toString(theTL.getATeam(teamNum2).getAvgClimb()));
					red1Cli.setId("avgStat");
					red2Cli.setId("avgStat");
					red1AvgCli.setId("avgStat");
					red2AvgCli.setId("avgStat");
					Label red1CyQL = new Label("Match Cycles");
					Label red1SpeQL = new Label("Match Speaker");
					Label red1AmpQL = new Label("Match Amp");
					Label red1TrapQL = new Label("Match Trap");
					Label red1CliQL = new Label("Match Climb");
					Label red2CyQL = new Label("Match Cycles");
					Label red2SpeQL = new Label("Match Speaker");
					Label red2AmpQL = new Label("Match Amp");
					Label red2TrapQL = new Label("Match Trap");
					Label red2CliQL = new Label("Match Climb");
					Label red1AvgCyQL = new Label("Avg Cycles");
					Label red1AvgSpeQL = new Label("Avg Speaker");
					Label red1AvgAmpQL = new Label("Avg Amp");
					Label red1AvgTrapQL = new Label("Avg Trap");
					Label red1AvgCliQL = new Label("Avg Climb");
					Label red2AvgCyQL = new Label("Avg Cycles");
					Label red2AvgSpeQL = new Label("Avg Speaker");
					Label red2AvgAmpQL = new Label("Avg Amp");
					Label red2AvgTrapQL = new Label("Avg Trap");
					Label red2AvgCliQL = new Label("Avg Climb");
					red1CyQL.setId("smallTitle");
					red1SpeQL.setId("smallTitle");
					red1AmpQL.setId("smallTitle");
					red1TrapQL.setId("smallTitle");
					red1CliQL.setId("smallTitle");
					red2CyQL.setId("smallTitle");
					red2SpeQL.setId("smallTitle");
					red2AmpQL.setId("smallTitle");
					red2TrapQL.setId("smallTitle");
					red2CliQL.setId("smallTitle");
					red1AvgCyQL.setId("smallTitle");
					red1AvgSpeQL.setId("smallTitle");
					red1AvgAmpQL.setId("smallTitle");
					red1AvgTrapQL.setId("smallTitle");
					red1AvgCliQL.setId("smallTitle");
					red2AvgCyQL.setId("smallTitle");
					red2AvgSpeQL.setId("smallTitle");
					red2AvgAmpQL.setId("smallTitle");
					red2AvgTrapQL.setId("smallTitle");
					red2AvgCliQL.setId("smallTitle");
					BorderPane red1CyBP = new BorderPane();
					BorderPane red1SpeBP = new BorderPane();
					BorderPane red1AmpBP = new BorderPane();
					BorderPane red1TrapBP = new BorderPane();
					BorderPane red1CliBP = new BorderPane();
					BorderPane red1CyAvgBP = new BorderPane();
					BorderPane red1SpeAvgBP = new BorderPane();
					BorderPane red1AmpAvgBP = new BorderPane();
					BorderPane red1TrapAvgBP = new BorderPane();
					BorderPane red1CliAvgBP = new BorderPane();
					BorderPane red2CyBP = new BorderPane();
					BorderPane red2SpeBP = new BorderPane();
					BorderPane red2AmpBP = new BorderPane();
					BorderPane red2TrapBP = new BorderPane();
					BorderPane red2CliBP = new BorderPane();
					BorderPane red2CyAvgBP = new BorderPane();
					BorderPane red2SpeAvgBP = new BorderPane();
					BorderPane red2AmpAvgBP = new BorderPane();
					BorderPane red2TrapAvgBP = new BorderPane();
					BorderPane red2CliAvgBP = new BorderPane();
					red1CyBP.setTop(red1CyQL);
					red1SpeBP.setTop(red1SpeQL);
					red1AmpBP.setTop(red1AmpQL);
					red1TrapBP.setTop(red1TrapQL);
					red1CliBP.setTop(red1CliQL);
					red1CyAvgBP.setTop(red1AvgCyQL);
					red1SpeAvgBP.setTop(red1AvgSpeQL);
					red1AmpAvgBP.setTop(red1AvgAmpQL);
					red1TrapAvgBP.setTop(red1AvgTrapQL);
					red1CliAvgBP.setTop(red1AvgCliQL);
					red2CyBP.setTop(red1CyQL);
					red2SpeBP.setTop(red2SpeQL);
					red2AmpBP.setTop(red2AmpQL);
					red2TrapBP.setTop(red2TrapQL);
					red2CliBP.setTop(red2CliQL);
					red2CyAvgBP.setTop(red2AvgCyQL);
					red2SpeAvgBP.setTop(red2AvgSpeQL);
					red2AmpAvgBP.setTop(red2AvgAmpQL);
					red2TrapAvgBP.setTop(red2AvgTrapQL);
					red2CliAvgBP.setTop(red2AvgCliQL);
					red1CyBP.setCenter(red1Cy);
					red1SpeBP.setCenter(red1Spe);
					red1AmpBP.setCenter(red1Amp);
					red1TrapBP.setCenter(red1Trap);
					red1CliBP.setCenter(red1Cli);
					red1CyAvgBP.setCenter(red1AvgCy);
					red1SpeAvgBP.setCenter(red1AvgSpe);
					red1AmpAvgBP.setCenter(red1AvgAmp);
					red1TrapAvgBP.setCenter(red1AvgTrap);
					red1CliAvgBP.setCenter(red1AvgCli);
					red2CyBP.setCenter(red1Cy);
					red2SpeBP.setCenter(red2Spe);
					red2AmpBP.setCenter(red2Amp);
					red2TrapBP.setCenter(red2Trap);
					red2CliBP.setCenter(red2Cli);
					red2CyAvgBP.setCenter(red2AvgCy);
					red2SpeAvgBP.setCenter(red2AvgSpe);
					red2AmpAvgBP.setCenter(red2AvgAmp);
					red2TrapAvgBP.setCenter(red2AvgTrap);
					red2CliAvgBP.setCenter(red2AvgCli);
					if(mainColor == true) {
						red1TeamNumBP.setId("seMStatBP1");
						red1CyBP.setId("seMStatBP3");
						red1SpeBP.setId("seMStatBP5");
						red1AmpBP.setId("seMStatBP7");
						red1TrapBP.setId("seMStatBP9");
						red1CliBP.setId("seMStatBP7");
						red1CyAvgBP.setId("seMStatBP4");
						red1SpeAvgBP.setId("seMStatBP6");
						red1AmpAvgBP.setId("seMStatBP8");
						red1TrapAvgBP.setId("seMStatBP8");
						red1CliAvgBP.setId("seMStatBP6");
						red1TeamNumBP.setId("seMStatBP9");
						red2CyBP.setId("seMStatBP7");
						red2SpeBP.setId("seMStatBP5");
						red2AmpBP.setId("seMStatBP3");
						red2TrapBP.setId("seMStatBP1");
						red2CliBP.setId("seMStatBP3");
						red2CyAvgBP.setId("seMStatBP6");
						red2SpeAvgBP.setId("seMStatBP4");
						red2AmpAvgBP.setId("seMStatBP2");
						red2TrapAvgBP.setId("seMStatBP2");
						red2CliAvgBP.setId("seMStatBP4");
						noData1BP.setId("seMStatBP1");
						VBox red1VB = new VBox(5);
						VBox red2VB = new VBox(5);
						VBox red3VB = new VBox(5);
						Label redCy = new Label(Integer.toString(redTeams.get(0).getMatchAmp() + redTeams.get(1).getMatchAmp() + redTeams.get(0).getMatchSpe() + redTeams.get(1).getMatchSpe() + redTeams.get(0).getMatchTrap() + redTeams.get(1).getMatchTrap()));
						Label redSpe = new Label(Integer.toString(redTeams.get(0).getMatchSpe() + redTeams.get(1).getMatchSpe()));
						Label redAmp = new Label(Integer.toString(redTeams.get(0).getMatchAmp() + redTeams.get(1).getMatchAmp()));
						Label redTrap = new Label(Integer.toString(redTeams.get(0).getMatchTrap() + redTeams.get(1).getMatchTrap()));
						Label redCli = new Label(Integer.toString(redTeams.get(0).getMatchClimb() + redTeams.get(1).getMatchClimb()));
						Label redAll = new Label("Red Alliance");
						Label redAllCyQL = new Label("Match Cycles");
						Label redAllSpeQL = new Label("Match Speaker");
						Label redAllAmpQL = new Label("Match Amp");
						Label redAllTrapQL = new Label("Match Trap");
						Label redAllCliQL = new Label("Match Climb");
						redCy .setId("avgStat");
						redSpe.setId("avgStat");
						redAmp.setId("avgStat");
						redTrap.setId("avgStat");
						redCli.setId("avgStat");
						redAll.setId("smallTitle");
						redAllCyQL.setId("smallTitle");
						redAllSpeQL.setId("smallTitle");
						redAllAmpQL.setId("smallTitle");
						redAllTrapQL.setId("smallTitle");
						redAllCliQL.setId("smallTitle");
						BorderPane RedCyBP = new BorderPane();
						BorderPane RedSpeBP = new BorderPane();
						BorderPane RedAmpBP = new BorderPane();
						BorderPane RedTrapBP = new BorderPane();
						BorderPane RedCliBP = new BorderPane();
						RedCyBP.setTop(redAllCyQL);
						RedSpeBP.setTop(redAllSpeQL);
						RedAmpBP.setTop(redAllAmpQL);
						RedTrapBP.setTop(redAllTrapQL);
						RedCliBP.setTop(redAllCliQL);
						RedCyBP.setCenter(redCy);
						RedSpeBP.setCenter(redSpe);
						RedAmpBP.setCenter(redAmp);
						RedTrapBP.setCenter(redTrap);
						RedCliBP.setCenter(redCli);
						RedCyBP.setId("seMStatBP5");
						RedSpeBP.setId("seMStatBP4");
						RedAmpBP.setId("seMStatBP3");
						RedTrapBP.setId("seMStatBP2");
						RedCliBP.setId("seMStatBP1");
						BorderPane redAllNameBP = new BorderPane();
						redAllNameBP.setCenter(redAll);
						redAllNameBP.setId("seMStatBP6");
						VBox redAllBP = new VBox(5);
						redAllBP.getChildren().addAll(redAllNameBP, RedCyBP, RedSpeBP, RedAmpBP, RedTrapBP, RedCliBP);
						red1VB.getChildren().addAll(red1TeamNumBP, red1CyBP, red1CyAvgBP, red1SpeBP, red1SpeAvgBP, red1AmpBP, red1AmpAvgBP, red1TrapBP, red1TrapAvgBP, red1CliBP, red1CliAvgBP);
						red2VB.getChildren().addAll(red2TeamNumBP, red2CyBP, red2CyAvgBP, red2SpeBP, red2SpeAvgBP, red2AmpBP, red2AmpAvgBP, red2TrapBP, red2TrapAvgBP, red2CliBP, red2CliAvgBP);
						red3VB.getChildren().add(noData1BP);
						redHB.getChildren().addAll(redAllBP, red1VB, red2VB, red3VB);
					}else {
						red1TeamNumBP.setId("seMStatBP9");
						red1CyBP.setId("seMStatBP7");
						red1SpeBP.setId("seMStatBP5");
						red1AmpBP.setId("seMStatBP3");
						red1TrapBP.setId("seMStatBP1");
						red1CliBP.setId("seMStatBP3");
						red1CyAvgBP.setId("seMStatBP6");
						red1SpeAvgBP.setId("seMStatBP4");
						red1AmpAvgBP.setId("seMStatBP2");
						red1TrapAvgBP.setId("seMStatBP2");
						red1CliAvgBP.setId("seMStatBP4");
						red2TeamNumBP.setId("seMStatBP1");
						red2CyBP.setId("seMStatBP3");
						red2SpeBP.setId("seMStatBP5");
						red2AmpBP.setId("seMStatBP7");
						red2TrapBP.setId("seMStatBP9");
						red2CliBP.setId("seMStatBP7");
						red2CyAvgBP.setId("seMStatBP4");
						red2SpeAvgBP.setId("seMStatBP6");
						red2AmpAvgBP.setId("seMStatBP8");
						red2TrapAvgBP.setId("seMStatBP8");
						red2CliAvgBP.setId("seMStatBP6");
						noData1BP.setId("seMStatBP9");
						VBox red1VB = new VBox(5);
						VBox red2VB = new VBox(5);
						VBox red3VB = new VBox(5);
						Label redCy = new Label(Integer.toString(redTeams.get(0).getMatchAmp() + redTeams.get(1).getMatchAmp() + redTeams.get(0).getMatchSpe() + redTeams.get(1).getMatchSpe() + redTeams.get(0).getMatchTrap() + redTeams.get(1).getMatchTrap()));
						Label redSpe = new Label(Integer.toString(redTeams.get(0).getMatchSpe() + redTeams.get(1).getMatchSpe()));
						Label redAmp = new Label(Integer.toString(redTeams.get(0).getMatchAmp() + redTeams.get(1).getMatchAmp()));
						Label redTrap = new Label(Integer.toString(redTeams.get(0).getMatchTrap() + redTeams.get(1).getMatchTrap()));
						Label redCli = new Label(Integer.toString(redTeams.get(0).getMatchClimb() + redTeams.get(1).getMatchClimb()));
						Label redAll = new Label("Red Alliance");
						Label redAllCyQL = new Label("Match Cycles");
						Label redAllSpeQL = new Label("Match Speaker");
						Label redAllAmpQL = new Label("Match Amp");
						Label redAllTrapQL = new Label("Match Trap");
						Label redAllCliQL = new Label("Match Climb");
						redCy .setId("avgStat");
						redSpe.setId("avgStat");
						redAmp.setId("avgStat");
						redTrap.setId("avgStat");
						redCli.setId("avgStat");
						redAll.setId("smallTitle");
						redAllCyQL.setId("smallTitle");
						redAllSpeQL.setId("smallTitle");
						redAllAmpQL.setId("smallTitle");
						redAllTrapQL.setId("smallTitle");
						redAllCliQL.setId("smallTitle");
						BorderPane RedCyBP = new BorderPane();
						BorderPane RedSpeBP = new BorderPane();
						BorderPane RedAmpBP = new BorderPane();
						BorderPane RedTrapBP = new BorderPane();
						BorderPane RedCliBP = new BorderPane();
						RedCyBP.setTop(redAllCyQL);
						RedSpeBP.setTop(redAllSpeQL);
						RedAmpBP.setTop(redAllAmpQL);
						RedTrapBP.setTop(redAllTrapQL);
						RedCliBP.setTop(redAllCliQL);
						RedCyBP.setCenter(redCy);
						RedSpeBP.setCenter(redSpe);
						RedAmpBP.setCenter(redAmp);
						RedTrapBP.setCenter(redTrap);
						RedCliBP.setCenter(redCli);
						RedCyBP.setId("seMStatBP5");
						RedSpeBP.setId("seMStatBP4");
						RedAmpBP.setId("seMStatBP3");
						RedTrapBP.setId("seMStatBP2");
						RedCliBP.setId("seMStatBP1");
						BorderPane redAllNameBP = new BorderPane();
						redAllNameBP.setCenter(redAll);
						redAllNameBP.setId("seMStatBP6");
						VBox redAllBP = new VBox(5);
						redAllBP.getChildren().addAll(redAllNameBP, RedCyBP, RedSpeBP, RedAmpBP, RedTrapBP, RedCliBP);
						red1VB.getChildren().addAll(red1TeamNumBP, red1CyBP, red1CyAvgBP, red1SpeBP, red1SpeAvgBP, red1AmpBP, red1AmpAvgBP, red1TrapBP, red1TrapAvgBP, red1CliBP, red1CliAvgBP);
						red2VB.getChildren().addAll(red2TeamNumBP, red2CyBP, red2CyAvgBP, red2SpeBP, red2SpeAvgBP, red2AmpBP, red2AmpAvgBP, red2TrapBP, red2TrapAvgBP, red2CliBP, red2CliAvgBP);
						red3VB.getChildren().add(noData1BP);
						redHB.getChildren().addAll(redAllBP, red1VB, red2VB, red3VB);
					}
				}else if(redTeams.size() == 1) {
					System.out.print("BoopseM13red1");
					int teamNum1 = redTeams.get(0).getMatchTeamNum();
					Label red1TeamNumL = new Label(Integer.toString(teamNum1));
					Label noDataLabel1L = new Label("No Data");
					Label noDataLabel2L = new Label("No Data");
					red1TeamNumL.setId("smallTitle");
					noDataLabel1L.setId("smallTitle");
					noDataLabel2L.setId("smallTitle");
					BorderPane red1TeamNumBP = new BorderPane();
					BorderPane noData1BP = new BorderPane();
					BorderPane noData2BP = new BorderPane();
					red1TeamNumBP.setCenter(red1TeamNumL);
					noData1BP.setCenter(noDataLabel1L);
					noData2BP.setCenter(noDataLabel2L);
					Label red1Cy = new Label(Integer.toString(redTeams.get(0).getMatchAmp() + redTeams.get(0).getMatchSpe() + redTeams.get(0).getMatchTrap()));
					red1Cy.setId("avgStat");
					Label red1Amp = new Label(Integer.toString(redTeams.get(0).getMatchAmp()));
					Label red1Spe = new Label(Integer.toString(redTeams.get(0).getMatchSpe()));
					Label red1Trap = new Label(Integer.toString(redTeams.get(0).getMatchTrap()));
					red1Amp.setId("avgStat");
					red1Spe.setId("avgStat");
					red1Trap.setId("avgStat");
					Label red1AvgCy = new Label(Double.toString(theTL.getATeam(teamNum1).getAvgCycles()));
					Label red1AvgSpe = new Label(Double.toString(theTL.getATeam(teamNum1).getAvgSpe()));
					Label red1AvgAmp = new Label(Double.toString(theTL.getATeam(teamNum1).getAvgAmp()));
					Label red1AvgTrap = new Label(Double.toString(theTL.getATeam(teamNum1).getAvgTrap()));
					red1AvgCy.setId("avgStat");
					red1AvgSpe.setId("avgStat");
					red1AvgAmp.setId("avgStat");
					red1AvgTrap.setId("avgStat");
					Label red1Cli = new Label(Integer.toString(redTeams.get(0).getMatchClimb()));
					Label red1AvgCli = new Label(Double.toString(theTL.getATeam(teamNum1).getAvgClimb()));
					red1Cli.setId("avgStat");
					red1AvgCli.setId("avgStat");
					Label red1CyQL = new Label("Match Cycles");
					Label red1SpeQL = new Label("Match Speaker");
					Label red1AmpQL = new Label("Match Amp");
					Label red1TrapQL = new Label("Match Trap");
					Label red1CliQL = new Label("Match Climb");
					Label red1AvgCyQL = new Label("Avg Cycles");
					Label red1AvgSpeQL = new Label("Avg Speaker");
					Label red1AvgAmpQL = new Label("Avg Amp");
					Label red1AvgTrapQL = new Label("Avg Trap");
					Label red1AvgCliQL = new Label("Avg Climb");
					red1CyQL.setId("smallTitle");
					red1SpeQL.setId("smallTitle");
					red1AmpQL.setId("smallTitle");
					red1TrapQL.setId("smallTitle");
					red1CliQL.setId("smallTitle");
					red1AvgCyQL.setId("smallTitle");
					red1AvgSpeQL.setId("smallTitle");
					red1AvgAmpQL.setId("smallTitle");
					red1AvgTrapQL.setId("smallTitle");
					red1AvgCliQL.setId("smallTitle");
					BorderPane red1CyBP = new BorderPane();
					BorderPane red1SpeBP = new BorderPane();
					BorderPane red1AmpBP = new BorderPane();
					BorderPane red1TrapBP = new BorderPane();
					BorderPane red1CliBP = new BorderPane();
					BorderPane red1CyAvgBP = new BorderPane();
					BorderPane red1SpeAvgBP = new BorderPane();
					BorderPane red1AmpAvgBP = new BorderPane();
					BorderPane red1TrapAvgBP = new BorderPane();
					BorderPane red1CliAvgBP = new BorderPane();
					red1CyBP.setTop(red1CyQL);
					red1SpeBP.setTop(red1SpeQL);
					red1AmpBP.setTop(red1AmpQL);
					red1TrapBP.setTop(red1TrapQL);
					red1CliBP.setTop(red1CliQL);
					red1CyAvgBP.setTop(red1AvgCyQL);
					red1SpeAvgBP.setTop(red1AvgSpeQL);
					red1AmpAvgBP.setTop(red1AvgAmpQL);
					red1TrapAvgBP.setTop(red1AvgTrapQL);
					red1CliAvgBP.setTop(red1AvgCliQL);
					red1CyBP.setCenter(red1Cy);
					red1SpeBP.setCenter(red1Spe);
					red1AmpBP.setCenter(red1Amp);
					red1TrapBP.setCenter(red1Trap);
					red1CliBP.setCenter(red1Cli);
					red1CyAvgBP.setCenter(red1AvgCy);
					red1SpeAvgBP.setCenter(red1AvgSpe);
					red1AmpAvgBP.setCenter(red1AvgAmp);
					red1TrapAvgBP.setCenter(red1AvgTrap);
					red1CliAvgBP.setCenter(red1AvgCli);
					if(mainColor == true) {
						red1TeamNumBP.setId("seMStatBP1");
						red1CyBP.setId("seMStatBP3");
						red1SpeBP.setId("seMStatBP5");
						red1AmpBP.setId("seMStatBP7");
						red1TrapBP.setId("seMStatBP9");
						red1CliBP.setId("seMStatBP7");
						red1CyAvgBP.setId("seMStatBP4");
						red1SpeAvgBP.setId("seMStatBP6");
						red1AmpAvgBP.setId("seMStatBP8");
						red1TrapAvgBP.setId("seMStatBP8");
						red1CliAvgBP.setId("seMStatBP6");
						noData1BP.setId("seMStatBP9");
						noData2BP.setId("seMStatBP1");
						VBox red1VB = new VBox(5);
						VBox red2VB = new VBox(5);
						VBox red3VB = new VBox(5);
						Label redCy = new Label(Integer.toString(redTeams.get(0).getMatchAmp() + redTeams.get(0).getMatchSpe() + redTeams.get(0).getMatchTrap()));
						Label redSpe = new Label(Integer.toString(redTeams.get(0).getMatchSpe()));
						Label redAmp = new Label(Integer.toString(redTeams.get(0).getMatchAmp()));
						Label redTrap = new Label(Integer.toString(redTeams.get(0).getMatchTrap()));
						Label redCli = new Label(Integer.toString(redTeams.get(0).getMatchClimb()));
						Label redAll = new Label("Red Alliance");
						Label redAllCyQL = new Label("Match Cycles");
						Label redAllSpeQL = new Label("Match Speaker");
						Label redAllAmpQL = new Label("Match Amp");
						Label redAllTrapQL = new Label("Match Trap");
						Label redAllCliQL = new Label("Match Climb");
						redCy .setId("avgStat");
						redSpe.setId("avgStat");
						redAmp.setId("avgStat");
						redTrap.setId("avgStat");
						redCli.setId("avgStat");
						redAll.setId("smallTitle");
						redAllCyQL.setId("smallTitle");
						redAllSpeQL.setId("smallTitle");
						redAllAmpQL.setId("smallTitle");
						redAllTrapQL.setId("smallTitle");
						redAllCliQL.setId("smallTitle");
						BorderPane RedCyBP = new BorderPane();
						BorderPane RedSpeBP = new BorderPane();
						BorderPane RedAmpBP = new BorderPane();
						BorderPane RedTrapBP = new BorderPane();
						BorderPane RedCliBP = new BorderPane();
						RedCyBP.setTop(redAllCyQL);
						RedSpeBP.setTop(redAllSpeQL);
						RedAmpBP.setTop(redAllAmpQL);
						RedTrapBP.setTop(redAllTrapQL);
						RedCliBP.setTop(redAllCliQL);
						RedCyBP.setCenter(redCy);
						RedSpeBP.setCenter(redSpe);
						RedAmpBP.setCenter(redAmp);
						RedTrapBP.setCenter(redTrap);
						RedCliBP.setCenter(redCli);
						RedCyBP.setId("seMStatBP5");
						RedSpeBP.setId("seMStatBP4");
						RedAmpBP.setId("seMStatBP3");
						RedTrapBP.setId("seMStatBP2");
						RedCliBP.setId("seMStatBP1");
						BorderPane redAllNameBP = new BorderPane();
						redAllNameBP.setCenter(redAll);
						redAllNameBP.setId("seMStatBP6");
						VBox redAllBP = new VBox(5);
						redAllBP.getChildren().addAll(redAllNameBP, RedCyBP, RedSpeBP, RedAmpBP, RedTrapBP, RedCliBP);
						red1VB.getChildren().addAll(red1TeamNumBP, red1CyBP, red1CyAvgBP, red1SpeBP, red1SpeAvgBP, red1AmpBP, red1AmpAvgBP, red1TrapBP, red1TrapAvgBP, red1CliBP, red1CliAvgBP);
						red2VB.getChildren().add(noData1BP);
						red3VB.getChildren().add(noData2BP);
						redHB.getChildren().addAll(redAllBP, red1VB, red2VB, red3VB);
					}else {
						red1TeamNumBP.setId("seMStatBP9");
						red1CyBP.setId("seMStatBP7");
						red1SpeBP.setId("seMStatBP5");
						red1AmpBP.setId("seMStatBP3");
						red1TrapBP.setId("seMStatBP1");
						red1CliBP.setId("seMStatBP3");
						red1CyAvgBP.setId("seMStatBP6");
						red1SpeAvgBP.setId("seMStatBP4");
						red1AmpAvgBP.setId("seMStatBP2");
						red1TrapAvgBP.setId("seMStatBP2");
						red1CliAvgBP.setId("seMStatBP4");
						noData1BP.setId("seMStatBP1");
						noData2BP.setId("seMStatBP9");
						VBox red1VB = new VBox(5);
						VBox red2VB = new VBox(5);
						VBox red3VB = new VBox(5);
						Label redCy = new Label(Integer.toString(redTeams.get(0).getMatchAmp() + redTeams.get(0).getMatchSpe() + redTeams.get(0).getMatchTrap()));
						Label redSpe = new Label(Integer.toString(redTeams.get(0).getMatchSpe()));
						Label redAmp = new Label(Integer.toString(redTeams.get(0).getMatchAmp()));
						Label redTrap = new Label(Integer.toString(redTeams.get(0).getMatchTrap()));
						Label redCli = new Label(Integer.toString(redTeams.get(0).getMatchClimb()));
						Label redAll = new Label("Red Alliance");
						Label redAllCyQL = new Label("Match Cycles");
						Label redAllSpeQL = new Label("Match Speaker");
						Label redAllAmpQL = new Label("Match Amp");
						Label redAllTrapQL = new Label("Match Trap");
						Label redAllCliQL = new Label("Match Climb");
						redCy .setId("avgStat");
						redSpe.setId("avgStat");
						redAmp.setId("avgStat");
						redTrap.setId("avgStat");
						redCli.setId("avgStat");
						redAll.setId("smallTitle");
						redAllCyQL.setId("smallTitle");
						redAllSpeQL.setId("smallTitle");
						redAllAmpQL.setId("smallTitle");
						redAllTrapQL.setId("smallTitle");
						redAllCliQL.setId("smallTitle");
						BorderPane RedCyBP = new BorderPane();
						BorderPane RedSpeBP = new BorderPane();
						BorderPane RedAmpBP = new BorderPane();
						BorderPane RedTrapBP = new BorderPane();
						BorderPane RedCliBP = new BorderPane();
						RedCyBP.setTop(redAllCyQL);
						RedSpeBP.setTop(redAllSpeQL);
						RedAmpBP.setTop(redAllAmpQL);
						RedTrapBP.setTop(redAllTrapQL);
						RedCliBP.setTop(redAllCliQL);
						RedCyBP.setCenter(redCy);
						RedSpeBP.setCenter(redSpe);
						RedAmpBP.setCenter(redAmp);
						RedTrapBP.setCenter(redTrap);
						RedCliBP.setCenter(redCli);
						RedCyBP.setId("seMStatBP5");
						RedSpeBP.setId("seMStatBP4");
						RedAmpBP.setId("seMStatBP3");
						RedTrapBP.setId("seMStatBP2");
						RedCliBP.setId("seMStatBP1");
						BorderPane redAllNameBP = new BorderPane();
						redAllNameBP.setCenter(redAll);
						redAllNameBP.setId("seMStatBP6");
						VBox redAllBP = new VBox(5);
						redAllBP.getChildren().addAll(redAllNameBP, redAllNameBP, RedCyBP, RedSpeBP, RedAmpBP, RedTrapBP, RedCliBP);
						red1VB.getChildren().addAll(red1TeamNumBP, red1CyBP, red1CyAvgBP, red1SpeBP, red1SpeAvgBP, red1AmpBP, red1AmpAvgBP, red1TrapBP, red1TrapAvgBP, red1CliBP, red1CliAvgBP);
						red2VB.getChildren().add(noData1BP);
						red3VB.getChildren().add(noData1BP);
						redHB.getChildren().addAll(redAllBP, red1VB, red2VB, red3VB);
					}
				}else if(redTeams.size() == 0) {
					System.out.print("BoopseM13red0");
					Label noDataLabel1L = new Label("No Data");
					Label noDataLabel2L = new Label("No Data");
					Label noDataLabel3L = new Label("No Data");
					noDataLabel1L.setId("smallTitle");
					noDataLabel2L.setId("smallTitle");
					noDataLabel3L.setId("smallTitle");
					BorderPane noData1BP = new BorderPane();
					BorderPane noData2BP = new BorderPane();
					BorderPane noData3BP = new BorderPane();
					noData1BP.setCenter(noDataLabel1L);
					noData2BP.setCenter(noDataLabel2L);
					noData3BP.setCenter(noDataLabel3L);
					if(mainColor == true) {
						noData1BP.setId("seMStatBP9");
						noData2BP.setId("seMStatBP1");
						noData2BP.setId("seMStatBP9");
						VBox red1VB = new VBox(5);
						VBox red2VB = new VBox(5);
						VBox red3VB = new VBox(5);
						red1VB.getChildren().addAll(noData1BP);
						red2VB.getChildren().add(noData2BP);
						red3VB.getChildren().add(noData3BP);
						redHB.getChildren().addAll(red1VB, red2VB, red3VB);
					}else {
						noData1BP.setId("seMStatBP1");
						noData2BP.setId("seMStatBP9");
						noData2BP.setId("seMStatBP1");
						VBox red1VB = new VBox(5);
						VBox red2VB = new VBox(5);
						VBox red3VB = new VBox(5);
						red1VB.getChildren().addAll(noData1BP);
						red2VB.getChildren().add(noData2BP);
						red3VB.getChildren().add(noData3BP);
						redHB.getChildren().addAll(red1VB, red2VB, red3VB);
					}
				}
				this.add(new Label("    "), 0, 0);
				this.add(new Label("    "), 2, 0);
				this.add(new Label("    "), 3, 0);
				if(mainColor = false) {
					this.add(blueHB, 1, 1);
					this.add(redHB, 4, 1);
				}else {
					this.add(blueHB, 4, 1);
					this.add(redHB, 1, 1);
				}

			}
			if(event.getSource() == submitPlayB) {
				this.getChildren().clear();
				String allNumS = allCB.getSelectionModel().getSelectedItem();
				String matchNumS = matchNumTF.getText();
				String isReplayS = isReplayCB.getSelectionModel().getSelectedItem();
				int allNum = Integer.parseInt(allNumS);
				int matchNum = Integer.parseInt(matchNumS);
				boolean IsReplay = Boolean.parseBoolean(isReplayS);
			}
		} catch(Exception e) {
			System.out.println("Error: " + e);
		}
		
	}
}
