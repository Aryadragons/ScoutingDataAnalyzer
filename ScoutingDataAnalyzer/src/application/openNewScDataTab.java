package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
	private TeamList fileTeamList;
	private Scanner fileInput;
	
	public openNewScDataTab(TempTeamList theTempTeamList, TeamList theTeamList) {
		fileTempTeamList = new TempTeamList();
		fileTeamList = new TeamList();
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
		goForReplaceB.setOnAction(this);
		goForAddB.setOnAction(this);
		submitReB = new Button("Submit");
		submitReB.setOnAction(this);
		submitAddB = new Button("Submit");
		submitAddB.setOnAction(this);
		this.add(goForReplaceB, 1, 0);
		this.add(goForAddB, 1, 2);
		this.add(submitReB, 2, 1);
		this.add(submitAddB, 2, 3);
		for (int i = 0; i < 23; i++) {
			this.add(new Label(""), 0, i);
		}
	}
	
	public void exportDataToCSV() {
		try {
			String csvTeamNumS;
			String csvMatchesS;
			String csvCyclesS;
			String csvAmpS;
			String csvSpeS;
			String csvTrapS;
			String csvClimbS;
			String csvCommentS;
			List<String> csvCommentList;
			int csvTeamNum;
			int csvMatches;
			int csvCycles;
			int csvAmp;
			int csvSpe;
			int csvTrap;
			int csvClimb;
			new FileWriter("MainScoutingDataFiles.txt", false).close();
			for(int i = 0; i < fileTeamList.listOfTeams.size(); i++) {
				csvTeamNum = fileTeamList.listOfTeams.get(i).getTeamNum();
				csvMatches = fileTeamList.listOfTeams.get(i).getTotalMatchesPlayed();
				csvCycles = fileTeamList.listOfTeams.get(i).getAvgCycles();
				csvAmp = fileTeamList.listOfTeams.get(i).getAvgAmp();
				csvSpe = fileTeamList.listOfTeams.get(i).getAvgSpe();
				csvTrap = fileTeamList.listOfTeams.get(i).getAvgTrap();
				csvClimb = fileTeamList.listOfTeams.get(i).getAvgClimb();
				csvCommentList = fileTeamList.listOfTeams.get(i).getCommentsList();
				csvTeamNumS = Integer.toString(csvTeamNum);
				csvMatchesS = Integer.toString(csvMatches);
				csvCyclesS = Integer.toString(csvCycles);
				csvAmpS = Integer.toString(csvAmp);
				csvSpeS = Integer.toString(csvSpe);
				csvTrapS = Integer.toString(csvTrap);
				csvClimbS = Integer.toString(csvClimb);
				FileWriter fw = new FileWriter("MainScoutingDataFiles.txt", true);
					    BufferedWriter bw = new BufferedWriter(fw);
					    PrintWriter out = new PrintWriter(bw);
					    out.println(csvTeamNumS);
					    out.println(csvMatchesS);
					    out.println(csvCyclesS);
					    out.println(csvAmpS);
					    out.println(csvSpeS);
					    out.println(csvTrapS);
					    out.println(csvClimbS);
					    csvCommentList.toString();
					    out.println(csvCommentList.size());
					    for (int e = 0; e < csvCommentList.size(); e++) {
					    	out.println(csvCommentList.get(e));
					    	
					    }
					    out.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void handle(ActionEvent event) {
		try {
			if(event.getSource() == goForReplaceB) {
				fileTempTeamList.clearTempTeamList();
				FileChooser chooser = new FileChooser();
				File fileChosen = chooser.showOpenDialog(null);
				if (fileChosen != null) {
					System.out.println(fileChosen);
					fileInput = new Scanner(fileChosen);
					fileNameReTF.setText(fileChosen.toString());
				}
			}
			if(event.getSource() == goForReplaceB) {
				fileTempTeamList.clearTempTeamList();
				FileChooser chooser = new FileChooser();
				File fileChosen = chooser.showOpenDialog(null);
				if (fileChosen != null) {
					System.out.println(fileChosen);
					fileInput = new Scanner(fileChosen);
					fileNameReTF.setText(fileChosen.toString());
				}
			}
			if(event.getSource() == submitReB) {
				String fileTeamNumS;
				String fileAmpS;
				String fileSpeS;
				String fileTrapS;
				String fileClimbS;
				String fileCommentS;
				String fileHumPostionS;
				String fileHumSkillS;
				String fileHumAmpNotesS;
				String fileTeamNumSTrue = "";
				String fileAmpSTrue = "";
				String fileSpeSTrue = "";
				String fileTrapSTrue = "";
				String fileClimbSTrue = "";
				String fileCommentSTrue = "";
				String fileHumPostionSTrue;
				String fileHumSkillSTrue;
				String fileHumAmpNotesSTrue;
				int fileTeamNum;
				int fileAmp;
				int fileSpe;
				int fileTrap;
				int fileClimb;
				int fileMatches;
				int fileTeamNumT;
				int fileAmpT;
				int fileSpeT;
				int fileTrapT;
				int fileClimbT;
				int fileCyclesT;
				int fileMatchesT;
				List<String> commentListT;
				int fileHumAmpSkill;
				int fileHumScoSkill;
				int fileHumAmpNotes;
				//for(int i = 0; i < 5; i++) {
					//fileInput.next();
			//	}
				while(fileInput.hasNextLine()) {
					fileTeamNumS = fileInput.next();
					fileAmpS = fileInput.next();
					fileSpeS = fileInput.next();
					fileTrapS = fileInput.next();
					fileClimbS = fileInput.next();
					fileCommentS = fileInput.next();
					fileHumPostionS = fileInput.next();
					fileHumSkillS = fileInput.next();
					int lengthOfFileHumSkill = fileHumSkillS.length() - 1;
					fileHumSkillSTrue = fileHumSkillS.substring(1, lengthOfFileHumSkill);
					// hum postion and skill stuff
					if (fileHumPostionS.compareTo("Amp") == 0) {
						fileHumAmpSkill = Integer.parseInt(fileHumSkillSTrue);
						fileHumAmpNotesS = fileInput.next();
						int lengthOfFileHumAmpNotes = fileHumAmpNotesS.length() - 1;
						fileHumAmpNotesSTrue = fileHumAmpNotesS.substring(1, lengthOfFileHumAmpNotes);
						fileHumAmpNotes = Integer.parseInt(fileHumAmpNotesSTrue);
					}
					if (fileHumPostionS.compareTo("Scoure") == 0) {
						fileHumScoSkill = Integer.parseInt(fileHumSkillSTrue);
					}
					//remove "s part
					int lengthOfFileTeamNum = fileTeamNumS.length() - 1;
					fileTeamNumSTrue = fileTeamNumS.substring(1, lengthOfFileTeamNum);
					
					int lengthOfFileAmp = fileAmpS.length() - 1;
					fileAmpSTrue = fileAmpS.substring(1, lengthOfFileAmp);
					int lengthOfFileSpe = fileSpeS.length() - 1;
					fileSpeSTrue = fileSpeS.substring(1, lengthOfFileSpe);
					int lengthOfFileTrap = fileTrapS.length() - 1;
					fileTrapSTrue = fileTrapS.substring(1, lengthOfFileTrap);
					int lengthOfFileClimb = fileClimbS.length() - 1;
					fileClimbSTrue = fileClimbS.substring(1, lengthOfFileClimb);
					
					int lengthOfFileComment = fileCommentS.length() - 1;
					if (lengthOfFileComment == 0) {
						fileCommentSTrue = "None";
					} else {
						fileCommentSTrue = fileCommentS.substring(1, lengthOfFileComment);
					}
					fileTeamNum = Integer.parseInt(fileTeamNumSTrue);
					fileAmp = Integer.parseInt(fileAmpSTrue);
					fileSpe = Integer.parseInt(fileSpeSTrue);
					fileTrap = Integer.parseInt(fileTrapSTrue);
					fileClimb = Integer.parseInt(fileClimbSTrue);
					if (fileTempTeamList.listOfTempTeams.size() == 0) {
						fileMatches = 1;
						fileTempTeamList.addTempTeam(fileTeamNum, (fileAmp + fileSpe + fileTrap), fileMatches, fileAmp, fileSpe, fileTrap, fileClimb, fileCommentSTrue);
					} else {
						if(fileTempTeamList.getATempTeam(fileTeamNum, fileTempTeamList) != null) {
							fileMatches = fileTempTeamList.getATempTeam(fileTeamNum, fileTempTeamList).getTotalMatchesPlayed();
							fileTempTeamList.addOnToTempTeam(fileTeamNum, (fileTrap + fileAmp + fileSpe), fileMatches, fileAmp, fileSpe, fileTrap, fileClimb, fileCommentSTrue);
						} else {
							fileMatches = 1;
							fileTempTeamList.addTempTeam(fileTeamNum, (fileAmp + fileSpe + fileTrap), fileMatches, fileAmp, fileSpe, fileTrap, fileClimb, fileCommentSTrue);
						}
					}
				}
				for (int i = 0; i < fileTempTeamList.listOfTempTeams.size(); i++) {
					fileTeamNumT = fileTempTeamList.listOfTempTeams.get(i).getTeamNum();
					fileMatchesT = fileTempTeamList.listOfTempTeams.get(i).getTotalMatchesPlayed();
					fileCyclesT = fileTempTeamList.listOfTempTeams.get(i).getTotalCycles();
					fileAmpT = fileTempTeamList.listOfTempTeams.get(i).getTotalAmp();
					fileSpeT = fileTempTeamList.listOfTempTeams.get(i).getTotalSpe();
					fileTrapT = fileTempTeamList.listOfTempTeams.get(i).getTotalTrap();
					fileClimbT = fileTempTeamList.listOfTempTeams.get(i).getTotalClimb();
					commentListT = fileTempTeamList.listOfTempTeams.get(i).getCommentList();
					fileTeamList.addTempTeam(fileTeamNumT, fileCyclesT, fileMatchesT, fileAmpT, fileSpeT, fileTrapT, fileClimbT, commentListT);
				}
				this.exportDataToCSV();	
				fileInput.close();
				}
			if(event.getSource() == submitAddB) {
				String fileTeamNumS;
				String fileAmpS;
				String fileSpeS;
				String fileTrapS;
				String fileClimbS;
				String fileCommentS;
				int fileTeamNum;
				int fileAmp;
				int fileSpe;
				int fileTrap;
				int fileClimb;
				int fileMatches;
				for(int i = 0; i < 5; i++) {
					fileInput.next();
				}
				fileTeamNumS = fileInput.next();
				while(fileTeamNumS != null) {
					fileAmpS = fileInput.next();
					fileSpeS = fileInput.next();
					fileTrapS = fileInput.next();
					fileClimbS = fileInput.next();
					fileCommentS = fileInput.next();
					fileTeamNum = Integer.parseInt(fileTeamNumS);
					fileAmp = Integer.parseInt(fileAmpS);
					fileSpe = Integer.parseInt(fileSpeS);
					fileTrap = Integer.parseInt(fileTrapS);
					fileClimb = Integer.parseInt(fileClimbS);
					fileMatches = fileTempTeamList.getATempTeam(fileTeamNum, fileTempTeamList).getTotalMatchesPlayed();
					if(fileTempTeamList.getATempTeam(fileTeamNum, fileTempTeamList) != null) {
						fileTempTeamList.addOnToTempTeam(fileTeamNum, (fileTrap + fileAmp + fileSpe), fileMatches, fileAmp, fileSpe, fileTrap, fileClimb, fileCommentS);
					} else {
						fileTempTeamList.addTempTeam(fileTeamNum, (fileAmp + fileSpe + fileTrap), fileMatches, fileAmp, fileSpe, fileTrap, fileClimb, fileCommentS);
					}
					fileTeamNumS = fileInput.next();
				}
				this.exportDataToCSV();
			}
		}catch(Exception e) {
			System.out.println("Error:  " + e);
			;
		}
	}
}
