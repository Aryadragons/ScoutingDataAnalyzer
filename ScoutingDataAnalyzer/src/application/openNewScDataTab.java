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
			String csvHumAmpSkillS;
			String csvHumScoSkillS;
			String csvHumAmpNotesS;
			String csvTimesHumAmpS;
			String csvTimesHumScoS;
			List<String> csvCommentList;
			List<String> csvHumPostionsList;
			int csvTeamNum;
			int csvMatches;
			double csvCycles;
			double csvAmp;
			double csvSpe;
			double csvTrap;
			double csvClimb;
			double csvHumAmpSkill;
			double csvHumScoSkill;
			double csvHumAmpNotes;
			int csvTimesHumAmp;
			int csvTimesHumSco;
			MatchList csvMatchList;
			System.out.println("boop19.1");
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
				csvHumPostionsList = fileTeamList.listOfTeams.get(i).getHumanPostionList();
				csvHumAmpSkill = fileTeamList.listOfTeams.get(i).getHumAmpSkill();
				csvHumScoSkill = fileTeamList.listOfTeams.get(i).getHumScoSkill();
				csvHumAmpNotes = fileTeamList.listOfTeams.get(i).getHumAmpNotes();
				csvTimesHumAmp = fileTeamList.listOfTeams.get(i).getTimesHumAmp();
				csvTimesHumSco = fileTeamList.listOfTeams.get(i).getTimesHumSco();
				csvMatchList = fileTeamList.listOfTeams.get(i).getMatchList();
				csvTeamNumS = Integer.toString(csvTeamNum);
				csvMatchesS = Integer.toString(csvMatches);
				csvCyclesS = Double.toString(csvCycles);
				csvAmpS = Double.toString(csvAmp);
				csvSpeS = Double.toString(csvSpe);
				csvTrapS = Double.toString(csvTrap);
				csvClimbS = Double.toString(csvClimb);
				csvHumAmpSkillS= Double.toString(csvHumAmpSkill);
				csvHumScoSkillS= Double.toString(csvHumScoSkill);
				csvHumAmpNotesS= Double.toString(csvHumAmpNotes);
				csvTimesHumAmpS= Integer.toString(csvTimesHumAmp);
				csvTimesHumScoS= Integer.toString(csvTimesHumSco);
				System.out.println("boop19.2");
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
					    if (csvHumPostionsList != null) {
						    out.println(csvHumPostionsList.size());
						    for (int e = 0; e < csvHumPostionsList.size(); e++) {
						    	System.out.println("Boop19.25" + csvHumAmpSkillS);
						    	out.println(csvHumPostionsList.get(e));
						    	
						    }
					    } else {
					    	out.println("0");
					    }
					    System.out.println(csvHumAmpSkillS);
					    System.out.println("boop19.3");
					    out.println(csvHumAmpSkillS);
					    out.println(csvHumScoSkillS);
					    out.println(csvHumAmpNotesS);
					    out.println(csvTimesHumAmpS);
					    out.println(csvTimesHumScoS);
					    System.out.println("boop19.4");
					    int MLSize = csvMatchList.listOfMatches.size();
					    out.println(MLSize);
					    System.out.println("boop19.5" + MLSize);
					    for(int e = 0; e < MLSize; e++ ) {
					    	System.out.println("boop19.6" + csvTeamNum);
					    	Match tempM = csvMatchList.listOfMatches.get(e);
					    	int MTeamNum = tempM.getMatchTeamNum();
					    	int MMatchNum = tempM.getMatchNum();
					    	int MAmp = tempM.getMatchAmp();
					    	int MSpe = tempM.getMatchSpe();
					    	int MTrap = tempM.getMatchTrap();
					    	int MClimb = tempM.getMatchClimb();
					    	String MHumPosS = tempM.getMatchHumPos();
					    	int MAmpSkill = tempM.getMatchAmpSkill();
					    	int MScoSkill = tempM.getMatchScoSkill();
					    	int MAmpNotes = tempM.getMatchAmpNotes();
					    	String MCommentS = tempM.getMatchComment();
					    	//convert to strings
					    	System.out.println("boop19.7");
					    	String MTeamNumS = Integer.toString(MTeamNum);
					    	String MMatchNumS = Integer.toString(MMatchNum);
					    	String MAmpS = Integer.toString(MAmp);
					    	String MSpeS = Integer.toString(MSpe);
					    	String MTrapS = Integer.toString(MTrap);
					    	String MClimbS = Integer.toString(MClimb);
					    	String MAmpSkillS = Integer.toString(MAmpSkill);
					    	String MScoSkillS = Integer.toString(MScoSkill);
					    	String MAmpNotesS = Integer.toString(MAmpNotes);
					    	System.out.println("boop19.8");
					    	out.println(MTeamNumS);
					    	out.println(MMatchNumS);
					    	out.println(MAmpS);
					    	out.println(MSpeS);
					    	out.println(MTrapS);
					    	out.println(MClimbS);
					    	out.println(MHumPosS);
					    	out.println(MAmpSkillS);
					    	out.println(MScoSkillS);
					    	out.println(MAmpNotesS);
					    	out.println(MCommentS);
					    	System.out.println("boop19.9");
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
				String fileMatchNumS;
				String fileTeamNumSTrue = "";
				String fileAmpSTrue = "";
				String fileSpeSTrue = "";
				String fileTrapSTrue = "";
				String fileClimbSTrue = "";
				String fileCommentSTrue = "";
				String fileHumPostionSTrue;
				String fileHumSkillSTrue;
				String fileHumAmpNotesSTrue;
				String fileMatchNumSTrue;
				int fileTeamNum;
				int fileAmp;
				int fileSpe;
				int fileTrap;
				int fileClimb;
				int fileMatches;
				int fileMatchNum;
				int fileTeamNumT;
				int fileAmpT;
				int fileSpeT;
				int fileTrapT;
				int fileClimbT;
				int fileCyclesT;
				int fileMatchesT;
				List<String> commentListT;
				int fileHumAmpSkill = 0;
				int fileHumScoSkill = 0;
				int fileHumAmpNotes = 0;
				int fileHumAmpSkillT;
				int fileHumScoSkillT;
				int fileHumAmpNotesT;
				List<String> humPostionsListT;
				int timesHumAmpT;
				int timesHumScoT;
				//for(int i = 0; i < 5; i++) {
					//fileInput.next();
			//	}
				while(fileInput.hasNextLine()) {
					fileTeamNumS = fileInput.next();
					fileMatchNumS = fileInput.next();
					fileAmpS = fileInput.next();
					fileSpeS = fileInput.next();
					fileTrapS = fileInput.next();
					fileClimbS = fileInput.next();
					fileCommentS = fileInput.next();
					fileHumPostionS = fileInput.next();
					fileHumSkillS = fileInput.next();
					System.out.println("boop");
					int lengthOfFileHumPostion = fileHumPostionS.length() - 1;
					fileHumPostionSTrue = fileHumPostionS.substring(1, lengthOfFileHumPostion);
					System.out.println("boop1");
					int lengthOfFileHumSkill = fileHumSkillS.length() - 1;
					fileHumSkillSTrue = fileHumSkillS.substring(1, lengthOfFileHumSkill);
					System.out.println("boop2");
					// hum postion and skill stuff
					if (fileHumPostionSTrue.compareTo("Amp") == 0) {
						fileHumAmpSkill = Integer.parseInt(fileHumSkillSTrue);
						System.out.println(fileHumAmpSkill);
						fileHumAmpNotesS = fileInput.next();
						int lengthOfFileHumAmpNotes = fileHumAmpNotesS.length() - 1;
						fileHumAmpNotesSTrue = fileHumAmpNotesS.substring(1, lengthOfFileHumAmpNotes);
						fileHumAmpNotes = Integer.parseInt(fileHumAmpNotesSTrue);
					}
					if (fileHumPostionSTrue.compareTo("Scoure") == 0) {
						fileHumScoSkill = Integer.parseInt(fileHumSkillSTrue);
					}
					//remove "s part
					int lengthOfFileTeamNum = fileTeamNumS.length() - 1;
					fileTeamNumSTrue = fileTeamNumS.substring(1, lengthOfFileTeamNum);
					int lengthOfFileMatchNum = fileMatchNumS.length() - 1;
					fileMatchNumSTrue = fileMatchNumS.substring(1, lengthOfFileMatchNum);
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
					fileMatchNum = Integer.parseInt(fileMatchNumSTrue);
					fileAmp = Integer.parseInt(fileAmpSTrue);
					fileSpe = Integer.parseInt(fileSpeSTrue);
					fileTrap = Integer.parseInt(fileTrapSTrue);
					fileClimb = Integer.parseInt(fileClimbSTrue);
					System.out.println("boop3");
					// Match stuff
					Match tempM = new Match(fileTeamNum, fileMatchNum, fileAmp, fileSpe, fileTrap, fileClimb, fileHumPostionS, fileHumAmpSkill, fileHumAmpSkill, fileHumAmpNotes, fileCommentSTrue);
					if (fileTempTeamList.listOfTempTeams.size() == 0) {
						fileMatches = 1;
						fileTempTeamList.addTempTeam(fileTeamNum, (fileAmp + fileSpe + fileTrap), fileMatches, fileAmp, fileSpe, fileTrap, fileClimb, fileCommentSTrue, fileHumPostionSTrue, fileHumAmpSkill, fileHumScoSkill, fileHumAmpNotes, tempM);
					} else {
						if(fileTempTeamList.getATempTeam(fileTeamNum, fileTempTeamList) != null) {
							fileMatches = fileTempTeamList.getATempTeam(fileTeamNum, fileTempTeamList).getTotalMatchesPlayed();
							fileTempTeamList.addOnToTempTeam(fileTeamNum, (fileTrap + fileAmp + fileSpe), fileMatches, fileAmp, fileSpe, fileTrap, fileClimb, fileCommentSTrue, fileHumPostionSTrue, fileHumAmpSkill, fileHumScoSkill, fileHumAmpNotes, tempM);
						} else {
							fileMatches = 1;
							fileTempTeamList.addTempTeam(fileTeamNum, (fileAmp + fileSpe + fileTrap), fileMatches, fileAmp, fileSpe, fileTrap, fileClimb, fileCommentSTrue, fileHumPostionSTrue, fileHumAmpSkill, fileHumScoSkill, fileHumAmpNotes, tempM);
						}
					}
				}
				System.out.println("boop11");
				for (int i = 0; i < fileTempTeamList.listOfTempTeams.size(); i++) {
					System.out.println("boop12");
					fileTeamNumT = fileTempTeamList.listOfTempTeams.get(i).getTeamNum();
					System.out.println("boop13" + fileTeamNumT);
					fileMatchesT = fileTempTeamList.listOfTempTeams.get(i).getTotalMatchesPlayed();
					System.out.println("boop14" + fileMatchesT);
					fileCyclesT = fileTempTeamList.listOfTempTeams.get(i).getTotalCycles();
					fileAmpT = fileTempTeamList.listOfTempTeams.get(i).getTotalAmp();
					fileSpeT = fileTempTeamList.listOfTempTeams.get(i).getTotalSpe();
					fileTrapT = fileTempTeamList.listOfTempTeams.get(i).getTotalTrap();
					fileClimbT = fileTempTeamList.listOfTempTeams.get(i).getTotalClimb();
					commentListT = fileTempTeamList.listOfTempTeams.get(i).getCommentList();
					System.out.println("boop15");
					fileHumAmpSkillT = fileTempTeamList.listOfTempTeams.get(i).getHumAmpSkill();
					System.out.println(fileHumAmpSkillT);
					fileHumScoSkillT = fileTempTeamList.listOfTempTeams.get(i).getHumScoSkill();
					fileHumAmpNotesT = fileTempTeamList.listOfTempTeams.get(i).getHumAmpNotes();
					System.out.println("boop16");
					humPostionsListT = fileTempTeamList.listOfTempTeams.get(i).getHumanPostionList();
					System.out.println("boop17");
					timesHumAmpT = fileTempTeamList.listOfTempTeams.get(i).getTimesHumAmp();
					timesHumScoT = fileTempTeamList.listOfTempTeams.get(i).getTimesHumSco();
					System.out.println("boop18");
					MatchList tempMatchListT = fileTempTeamList.listOfTempTeams.get(i).getMatchList();
					fileTeamList.addTempTeam(fileTeamNumT, fileCyclesT, fileMatchesT, fileAmpT, fileSpeT, fileTrapT, fileClimbT, commentListT, humPostionsListT, fileHumAmpSkillT, fileHumScoSkillT, fileHumAmpNotesT, timesHumAmpT, timesHumScoT, tempMatchListT);
					System.out.println("boop19");
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
				String fileHumPostionS;
				String fileHumSkillS;
				String fileHumAmpNotesS;
				String fileMatchNumS;
				String fileTeamNumSTrue = "";
				String fileAmpSTrue = "";
				String fileSpeSTrue = "";
				String fileTrapSTrue = "";
				String fileClimbSTrue = "";
				String fileCommentSTrue = "";
				String fileHumPostionSTrue;
				String fileHumSkillSTrue;
				String fileHumAmpNotesSTrue;
				String fileMatchNumSTrue;
				int fileTeamNum;
				int fileAmp;
				int fileSpe;
				int fileTrap;
				int fileClimb;
				int fileMatches;
				int fileMatchNum;
				int fileTeamNumT;
				int fileAmpT;
				int fileSpeT;
				int fileTrapT;
				int fileClimbT;
				int fileCyclesT;
				int fileMatchesT;
				List<String> commentListT;
				int fileHumAmpSkill = 0;
				int fileHumScoSkill = 0;
				int fileHumAmpNotes = 0;
				int fileHumAmpSkillT;
				int fileHumScoSkillT;
				int fileHumAmpNotesT;
				List<String> humPostionsListT;
				int timesHumAmpT;
				int timesHumScoT;
				/**for(int i = 0; i < 5; i++) {
					fileInput.next();
				}**/
				while(fileInput.hasNextLine()) {
					fileTeamNumS = fileInput.next();
					fileMatchNumS = fileInput.next();
					fileAmpS = fileInput.next();
					fileSpeS = fileInput.next();
					fileTrapS = fileInput.next();
					fileClimbS = fileInput.next();
					fileCommentS = fileInput.next();
					fileHumPostionS = fileInput.next();
					fileHumSkillS = fileInput.next();
					int lengthOfFileHumPostion = fileHumPostionS.length() - 1;
					fileHumPostionSTrue = fileHumSkillS.substring(1, lengthOfFileHumPostion);
					int lengthOfFileHumSkill = fileHumSkillS.length() - 1;
					fileHumSkillSTrue = fileHumSkillS.substring(1, lengthOfFileHumSkill);
					// hum postion and skill stuff
					if (fileHumPostionSTrue.compareTo("Amp") == 0) {
						fileHumAmpSkill = Integer.parseInt(fileHumSkillSTrue);
						fileHumAmpNotesS = fileInput.next();
						int lengthOfFileHumAmpNotes = fileHumAmpNotesS.length() - 1;
						fileHumAmpNotesSTrue = fileHumAmpNotesS.substring(1, lengthOfFileHumAmpNotes);
						fileHumAmpNotes = Integer.parseInt(fileHumAmpNotesSTrue);
					}
					if (fileHumPostionSTrue.compareTo("Scoure") == 0) {
						fileHumScoSkill = Integer.parseInt(fileHumSkillSTrue);
					}
					//remove "s part
					int lengthOfFileTeamNum = fileTeamNumS.length() - 1;
					fileTeamNumSTrue = fileTeamNumS.substring(1, lengthOfFileTeamNum);
					int lengthOfFileMatchNum = fileMatchNumS.length() - 1;
					fileMatchNumSTrue = fileMatchNumS.substring(1, lengthOfFileMatchNum);
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
					fileTeamNum = Integer.parseInt(fileTeamNumS);
					fileMatchNum = Integer.parseInt(fileMatchNumSTrue);
					fileAmp = Integer.parseInt(fileAmpSTrue);
					fileSpe = Integer.parseInt(fileSpeSTrue);
					fileTrap = Integer.parseInt(fileTrapSTrue);
					fileClimb = Integer.parseInt(fileClimbSTrue);
					//match stuff
					Match tempM = new Match(fileTeamNum, fileMatchNum, fileAmp, fileSpe, fileTrap, fileClimb, fileHumPostionS, fileHumAmpSkill, fileHumAmpSkill, fileHumAmpNotes, fileCommentSTrue);
					if (fileTempTeamList.listOfTempTeams.size() == 0) {
						fileMatches = 1;
						fileTempTeamList.addTempTeam(fileTeamNum, (fileAmp + fileSpe + fileTrap), fileMatches, fileAmp, fileSpe, fileTrap, fileClimb, fileCommentSTrue, fileHumPostionSTrue, fileHumAmpSkill, fileHumScoSkill, fileHumAmpNotes, tempM);
					} else {
						if(fileTempTeamList.getATempTeam(fileTeamNum, fileTempTeamList) != null) {
							fileMatches = fileTempTeamList.getATempTeam(fileTeamNum, fileTempTeamList).getTotalMatchesPlayed();
							fileTempTeamList.addOnToTempTeam(fileTeamNum, (fileTrap + fileAmp + fileSpe), fileMatches, fileAmp, fileSpe, fileTrap, fileClimb, fileCommentSTrue, fileHumPostionSTrue, fileHumAmpSkill, fileHumScoSkill, fileHumAmpNotes, tempM);
						} else {
							fileMatches = 1;
							fileTempTeamList.addTempTeam(fileTeamNum, (fileAmp + fileSpe + fileTrap), fileMatches, fileAmp, fileSpe, fileTrap, fileClimb, fileCommentSTrue, fileHumPostionSTrue, fileHumAmpSkill, fileHumScoSkill, fileHumAmpNotes, tempM);
						}
					}
				}
				System.out.println("boop11");
				for (int i = 0; i < fileTempTeamList.listOfTempTeams.size(); i++) {
					System.out.println("boop12");
					fileTeamNumT = fileTempTeamList.listOfTempTeams.get(i).getTeamNum();
					System.out.println("boop13" + fileTeamNumT);
					fileMatchesT = fileTempTeamList.listOfTempTeams.get(i).getTotalMatchesPlayed();
					System.out.println("boop14" + fileMatchesT);
					fileCyclesT = fileTempTeamList.listOfTempTeams.get(i).getTotalCycles();
					fileAmpT = fileTempTeamList.listOfTempTeams.get(i).getTotalAmp();
					fileSpeT = fileTempTeamList.listOfTempTeams.get(i).getTotalSpe();
					fileTrapT = fileTempTeamList.listOfTempTeams.get(i).getTotalTrap();
					fileClimbT = fileTempTeamList.listOfTempTeams.get(i).getTotalClimb();
					commentListT = fileTempTeamList.listOfTempTeams.get(i).getCommentList();
					fileHumAmpSkillT = fileTempTeamList.listOfTempTeams.get(i).getHumAmpSkill();
					fileHumScoSkillT = fileTempTeamList.listOfTempTeams.get(i).getHumScoSkill();
					fileHumAmpNotesT = fileTempTeamList.listOfTempTeams.get(i).getHumAmpNotes();
					humPostionsListT = fileTempTeamList.listOfTempTeams.get(i).getHumanPostionList();
					timesHumAmpT = fileTempTeamList.listOfTempTeams.get(i).getTimesHumAmp();
					timesHumScoT = fileTempTeamList.listOfTempTeams.get(i).getTimesHumSco();
					MatchList tempMatchListT = fileTempTeamList.listOfTempTeams.get(i).getMatchList();
					fileTeamList.addTempTeam(fileTeamNumT, fileCyclesT, fileMatchesT, fileAmpT, fileSpeT, fileTrapT, fileClimbT, commentListT, humPostionsListT, fileHumAmpSkillT, fileHumScoSkillT, fileHumAmpNotesT, timesHumAmpT, timesHumScoT, tempMatchListT);
				}
				this.exportDataToCSV();
				fileInput.close();
			}
		}catch(Exception e) {
			System.out.println("Error:  " + e);
			;
		}
	}
}
