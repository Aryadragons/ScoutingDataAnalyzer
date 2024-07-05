package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;

public class openNewScDataTab extends GridPane implements EventHandler<ActionEvent>{
	
	private Button goForReplaceB;
	private Button goForAddB;
	private Button submitReB;
	private Button submitAddB;
	private TextField fileNameReTF;
	private TextField fileNameAddTF;
	private TempTeamList fileTempTeamList;
	
	public openNewScDataTab(TempTeamList theTempTeamList) {
		fileTempTeamList = theTempTeamList;
		this.add(new Label("Open New Data That Will Replace All Scouting Data"), 0, 0);
		this.add(new Label("Choosen File Name"), 0, 1);
		fileNameReTF = new TextField();
		this.add(fileNameReTF, 1, 1);
		this.add(new Label("Open New Data That Will Start Or Add On To Current Scouting Data"), 0, 2);
		this.add(new Label("Choosen File Name"), 0, 3);
		fileNameAddTF = new TextField();
		this.add(fileNameAddTF, 1, 3);
		goForReplaceB = new Button("Go");
		goForAddB = new Button("Go");
		submitReB = new Button("Submit");
		submitReB.setOnAction(this);
		submitAddB = new Button("Submit");
		this.add(goForReplaceB, 1, 0);
		this.add(goForAddB, 1, 2);
		this.add(submitReB, 2, 1);
		this.add(submitAddB, 2, 3);
	}

	@Override
	public void handle(ActionEvent event) {
		try {
			if(event.getSource() == submitReB) {
				String fileTeamNumS = "0";
				String fileAmpS = null;
				String fileSpeS;
				String fileTrapS;
				String fileClimbS;
				int fileTeamNum;
				int fileAmp;
				int fileSpe;
				int fileTrap;
				int fileClimb;
				int fileMatches;
				int isNext;
				fileTempTeamList.clearTempTeamList();
				FileChooser chooser = new FileChooser();
				File fileChosen = chooser.showOpenDialog(null);
				if (fileChosen != null) {
					System.out.println(fileChosen);
					Scanner fileInput = new Scanner(fileChosen);
					for(int i = 0; i < 5; i++) {
						fileInput.next();
					}
					fileTeamNumS = fileInput.next();
					while(fileTeamNumS != null)
					fileAmpS = fileInput.next();
					fileSpeS = fileInput.next();
					fileTrapS = fileInput.next();
					fileClimbS = fileInput.next();
					fileTeamNum = Integer.parseInt(fileTeamNumS);
					fileAmp = Integer.parseInt(fileAmpS);
					fileSpe = Integer.parseInt(fileSpeS);
					fileTrap = Integer.parseInt(fileTrapS);
					fileClimb = Integer.parseInt(fileClimbS);
					fileMatches = fileTempTeamList.getATempTeam(fileTeamNum).getTotalMatchesPlayed();
					if(fileTempTeamList.getATempTeam(fileTeamNum) != null) {
						fileTempTeamList.addOnToTempTeam(fileTeamNum, (fileTrap + fileAmp + fileSpe), fileMatches, fileAmp, fileSpe, fileTrap, fileClimb);
					} else {
						fileTempTeamList.addTempTeam(fileTeamNum, (fileAmp + fileSpe + fileTrap), fileMatches, fileAmp, fileSpe, fileTrap, fileClimb);
					}
					fileTeamNumS = fileInput.next();
				}
			}
			if(event.getSource() == submitAddB) {
				String fileTeamNumS = "0";
				String fileAmpS = null;
				String fileSpeS;
				String fileTrapS;
				String fileClimbS;
				int fileTeamNum;
				int fileAmp;
				int fileSpe;
				int fileTrap;
				int fileClimb;
				int fileMatches;
				FileChooser chooser = new FileChooser();
				File fileChosen = chooser.showOpenDialog(null);
				if (fileChosen != null) {
					System.out.println(fileChosen);
					Scanner fileInput = new Scanner(fileChosen);
					for(int i = 0; i < 5; i++) {
						fileInput.next();
					}
					fileTeamNumS = fileInput.next();
					while(fileTeamNumS != null)
					fileAmpS = fileInput.next();
					fileSpeS = fileInput.next();
					fileTrapS = fileInput.next();
					fileClimbS = fileInput.next();
					fileTeamNum = Integer.parseInt(fileTeamNumS);
					fileAmp = Integer.parseInt(fileAmpS);
					fileSpe = Integer.parseInt(fileSpeS);
					fileTrap = Integer.parseInt(fileTrapS);
					fileClimb = Integer.parseInt(fileClimbS);
					fileMatches = fileTempTeamList.getATempTeam(fileTeamNum).getTotalMatchesPlayed();
					if(fileTempTeamList.getATempTeam(fileTeamNum) != null) {
						fileTempTeamList.addOnToTempTeam(fileTeamNum, (fileTrap + fileAmp + fileSpe), fileMatches, fileAmp, fileSpe, fileTrap, fileClimb);
					} else {
						fileTempTeamList.addTempTeam(fileTeamNum, (fileAmp + fileSpe + fileTrap), fileMatches, fileAmp, fileSpe, fileTrap, fileClimb);
					}
					fileTeamNumS = fileInput.next();
				}
			}
		} catch(Exception e) {
			
		}
	}
}
