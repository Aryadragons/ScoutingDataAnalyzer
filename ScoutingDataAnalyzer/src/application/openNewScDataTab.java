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
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
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
		VBox replaceLVB = new VBox(5);
		Label openReL = new Label("Open New Data That Will Replace All Scouting Data");
		Label fileChoosenReL = new Label("Choosen File Name");
		openReL.setId("TitleLabelPlay");
		fileChoosenReL.setId("TitleLabelPlay");
		replaceLVB.getChildren().addAll(openReL, fileChoosenReL);
		this.add(new Label("    "), 0, 0);
		this.add(new Label("    "), 0, 2);
		fileNameReTF = new TextField();
		fileNameAddTF = new TextField();
		goForReplaceB = new Button("Go");
		goForAddB = new Button("Go");
		goForReplaceB.setOnAction(this);
		goForAddB.setOnAction(this);
		submitReB = new Button("Submit");
		submitReB.setOnAction(this);
		submitAddB = new Button("Submit");
		submitAddB.setOnAction(this);
		VBox replaceBVB = new VBox(5);
		replaceBVB.getChildren().addAll(goForReplaceB, submitReB);
		BorderPane replaceBP = new BorderPane();
		replaceBP.setLeft(replaceLVB);
		replaceBP.setCenter(fileNameReTF);
		replaceBP.setRight(replaceBVB);
		replaceBP.setId("BPA4open");
		VBox addLVB = new VBox(5);
		Label openAddL = new Label("Open New Data That Will Start Or Add On To Current Scouting Data");
		Label fileChoosenAddL = new Label("Choosen File Name");
		openAddL.setId("TitleLabelPlay");
		fileChoosenAddL.setId("TitleLabelPlay");
		addLVB.getChildren().addAll(openAddL, fileChoosenAddL);
		VBox addBVB = new VBox(5);
		addBVB.getChildren().addAll(goForAddB, submitAddB);
		BorderPane addBP = new BorderPane();
		addBP.setLeft(addLVB);
		addBP.setCenter(fileNameAddTF);
		addBP.setRight(addBVB);
		addBP.setId("BPA6open");
		this.add(replaceBP, 1, 1);
		this.add(addBP, 1, 3);
	}
	
	public void exportDataToCSV() {
		try {
			String csvTeamNumS;
			String csvMatchesS;
			String csvTotalCyclesS;
			String csvTotalAmpS;
			String csvTotalSpeS;
			String csvTotalTrapS;
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
			int csvTotalCycles;
			int csvTotalAmp;
			int csvTotalSpe;
			int csvTotalTrap;
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
				csvTotalCycles = fileTeamList.listOfTeams.get(i).getTotalCycles();
				csvTotalAmp = fileTeamList.listOfTeams.get(i).getTotalAmp();
				csvTotalSpe = fileTeamList.listOfTeams.get(i).getTotalSpe();
				csvTotalTrap = fileTeamList.listOfTeams.get(i).getTotalTrap();
				csvCycles = fileTeamList.listOfTeams.get(i).getAvgCycles();
				csvAmp = fileTeamList.listOfTeams.get(i).getAvgAmp();
				csvSpe = fileTeamList.listOfTeams.get(i).getAvgSpe();
				csvTrap = fileTeamList.listOfTeams.get(i).getAvgTrap();
				csvClimb = fileTeamList.listOfTeams.get(i).getAvgClimb();
				csvCommentList = fileTeamList.listOfTeams.get(i).getCommentsList();
				csvHumPostionsList = fileTeamList.listOfTeams.get(i).getHumanPostionList();
				if(fileTeamList.listOfTeams.get(i).getHumanPostionList() == null) {
					System.out.println("boop19.12");
				}
				csvHumAmpSkill = fileTeamList.listOfTeams.get(i).getHumAmpSkill();
				csvHumScoSkill = fileTeamList.listOfTeams.get(i).getHumScoSkill();
				csvHumAmpNotes = fileTeamList.listOfTeams.get(i).getHumAmpNotes();
				csvTimesHumAmp = fileTeamList.listOfTeams.get(i).getTimesHumAmp();
				csvTimesHumSco = fileTeamList.listOfTeams.get(i).getTimesHumSco();
				csvMatchList = fileTeamList.listOfTeams.get(i).getMatchList();
				csvTeamNumS = Integer.toString(csvTeamNum);
				csvMatchesS = Integer.toString(csvMatches);
				csvTotalCyclesS = Integer.toString(csvTotalCycles);
				csvTotalAmpS = Integer.toString(csvTotalAmp);
				csvTotalSpeS = Integer.toString(csvTotalSpe);
				csvTotalTrapS = Integer.toString(csvTotalTrap);
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
					    out.println(csvTotalCyclesS);
					    out.println(csvTotalAmpS);
					    out.println(csvTotalSpeS);
					    out.println(csvTotalTrapS);
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
					    System.out.println("Boop19.23");
					    if (csvHumPostionsList != null) {
					    	System.out.println("Boop19.24");
						    out.println(csvHumPostionsList.size());
						    for (int u = 0; u < csvHumPostionsList.size(); u++) {
						    	System.out.println("Boop19.25" + csvHumPostionsList.get(u));
						    	out.println(csvHumPostionsList.get(u));
						    	
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
					    	Boolean MIsPrac = tempM.getIsPracMatch();
					    	Boolean MIsPlay = tempM.getIsPlayoff();
					    	Boolean MAllColor = tempM.getAllianceColor();
					    	Boolean MIsReplay = tempM.getIsReplay();
					    	int MAmp = tempM.getMatchAmp();
					    	int MSpe = tempM.getMatchSpe();
					    	int MTrap = tempM.getMatchTrap();
					    	int MClimb = tempM.getMatchClimb();
					    	String MHumPosS = tempM.getMatchHumPos();
					    	int MAmpSkill = tempM.getMatchAmpSkill();
					    	int MScoSkill = tempM.getMatchScoSkill();
					    	int MAmpNotes = tempM.getMatchAmpNotes();
					    	String MCommentS = tempM.getMatchComment();
					    	// auto stuff
					    	int autoStartPos = tempM.getTheAA().getAutoStartPos();
							int autoANControl = tempM.getTheAA().getAutoANControl();
							int autoASpecker = tempM.getTheAA().getAutoASpecker();
							int autoAAmp = tempM.getTheAA().getAutoAAmp();
							int autoNControl = tempM.getTheAA().getAutoNControl();
							int autoSpecker = tempM.getTheAA().getAutoASpecker();
							int autoAmp = tempM.getTheAA().getAutoAmp();
							System.out.println("boop19.7" + autoStartPos + autoANControl);
							String autoStartPosS = Integer.toString(autoStartPos);
							String autoANControlS = Integer.toString(autoANControl);
							String autoASpeckerS = Integer.toString(autoASpecker);
							String autoAAmpS = Integer.toString(autoAAmp);
							String autoNControlS = Integer.toString(autoNControl);
							String autoSpeckerS = Integer.toString(autoSpecker);
							String autoAmpS = Integer.toString(autoAmp);
					    	//convert to strings
					    	System.out.println("boop19.7" + autoStartPosS + autoANControlS);
					    	String MTeamNumS = Integer.toString(MTeamNum);
					    	String MMatchNumS = Integer.toString(MMatchNum);
					    	String MIsPracS = Boolean.toString(MIsPrac);
					    	String MIsPlayS = Boolean.toString(MIsPlay);
					    	String MAllColorS = Boolean.toString(MAllColor);
					    	String MIsReplayS = Boolean.toString(MIsReplay);
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
					    	out.println(MIsPracS);
					    	out.println(MIsPlayS);
					    	out.println(MAllColorS);
					    	out.println(MIsReplayS);
					    	out.println(MAmpS);
					    	out.println(MSpeS);
					    	out.println(MTrapS);
					    	out.println(MClimbS);
					    	out.println(MHumPosS);
					    	out.println(MAmpSkillS);
					    	out.println(MScoSkillS);
					    	out.println(MAmpNotesS);
					    	out.println(MCommentS);
					    	out.println(autoStartPosS);
					    	out.println(autoANControlS);
					    	out.println(autoASpeckerS);
					    	out.println(autoAAmpS);
					    	out.println(autoNControlS);
					    	out.println(autoSpeckerS);
					    	out.println(autoAmpS);
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
			if(event.getSource() == goForAddB) {
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
				String fileAllColorS;
				String fileAllColorSTrue;
				String fileIsPracS;
				String fileIsPracSTrue;
				String fileIsPlayS;
				String fileIsPlaySTrue;
				String fileIsReplayS;
				String fileIsReplaySTrue;
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
				Boolean fileAllColor;
				Boolean fileIsPrac;
				Boolean fileIsPlay;
				Boolean fileIsReplay;
				// auto stuff
				String autoStartPosS;
				String autoANControlS;
				String autoASpeckerS;
				String autoAAmpS;
				String autoNControlS;
				String autoSpeckerS;
				String autoAmpS;
				String autoStartPosSTrue;
				String autoANControlSTrue;
				String autoASpeckerSTrue;
				String autoAAmpSTrue;
				String autoNControlSTrue;
				String autoSpeckerSTrue;
				String autoAmpSTrue;
				int autoStartPos;
				int autoANControl;
				int autoASpecker;
				int autoAAmp;
				int autoNControl;
				int autoSpecker;
				int autoAmp;
				//for(int i = 0; i < 5; i++) {
					//fileInput.next();
			//	}
				while(fileInput.hasNextLine()) {
					fileTeamNumS = fileInput.next();
					fileMatchNumS = fileInput.next();
					fileIsPracS  = fileInput.next();
					fileIsPlayS  = fileInput.next();
					fileAllColorS = fileInput.next();
					fileIsReplayS  = fileInput.next();
					//auto stuff
					autoStartPosS = fileInput.next();
					autoANControlS = fileInput.next();
					autoASpeckerS = fileInput.next();
					autoAAmpS = fileInput.next();
					autoNControlS = fileInput.next();
					autoSpeckerS = fileInput.next();
					autoAmpS = fileInput.next();
					System.out.println("boop19.7" + autoStartPosS + autoANControlS);
					int lengthOfAutoStartPos = autoStartPosS.length() - 1;
					autoStartPosSTrue = autoStartPosS.substring(1, lengthOfAutoStartPos);
					int lengthOfAutoANControl = autoANControlS.length() - 1;
					autoANControlSTrue = autoANControlS.substring(1, lengthOfAutoANControl);
					int lengthOfAutoASpecker = autoASpeckerS.length() - 1;
					autoASpeckerSTrue = autoASpeckerS.substring(1, lengthOfAutoASpecker);
					int lengthOfAutoAAmp = autoAAmpS.length() - 1;
					autoAAmpSTrue = autoAAmpS.substring(1, lengthOfAutoAAmp);
					int lengthOfAutoNControl = autoNControlS.length() - 1;
					autoNControlSTrue = autoNControlS.substring(1, lengthOfAutoNControl);
					int lengthOfAutoSpecker = autoSpeckerS.length() - 1;
					autoSpeckerSTrue = autoSpeckerS.substring(1, lengthOfAutoSpecker);
					int lengthOfAutoAmp = autoAmpS.length() - 1;
					System.out.println("boop19.7" + autoStartPosSTrue + autoANControlSTrue);
					autoAmpSTrue = autoAmpS.substring(1, lengthOfAutoAmp);
					autoStartPos = Integer.parseInt(autoStartPosSTrue);
					autoANControl = Integer.parseInt(autoANControlSTrue);
					autoASpecker = Integer.parseInt(autoASpeckerSTrue);
					autoAAmp = Integer.parseInt(autoAAmpSTrue);
					autoNControl = Integer.parseInt(autoNControlSTrue);
					autoSpecker = Integer.parseInt(autoSpeckerSTrue);
					autoAmp = Integer.parseInt(autoAmpSTrue);
					System.out.println("boop19.7" + autoStartPos + autoANControl);
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
					int lengthOfIsPracSFile = fileIsPracS.length() - 1;
					fileIsPracSTrue = fileIsPracS.substring(1, lengthOfIsPracSFile);
					int lengthOfIsPlaySFile = fileIsPlayS.length() - 1;
					fileIsPlaySTrue = fileIsPlayS.substring(1, lengthOfIsPlaySFile);
					int lengthOfFileAllColor = fileAllColorS.length() - 1;
					fileAllColorSTrue = fileAllColorS.substring(1, lengthOfFileAllColor);
					int lengthOfIsReplaySFile = fileIsReplayS.length() - 1;
					fileIsReplaySTrue = fileIsReplayS.substring(1, lengthOfIsReplaySFile);
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
					fileIsPrac = Boolean.parseBoolean(fileIsPracSTrue);
					fileIsPlay = Boolean.parseBoolean(fileIsPlaySTrue);
					fileAllColor = Boolean.parseBoolean(fileAllColorSTrue);
					fileIsReplay = Boolean.parseBoolean(fileIsReplaySTrue);
					fileAmp = Integer.parseInt(fileAmpSTrue);
					fileSpe = Integer.parseInt(fileSpeSTrue);
					fileTrap = Integer.parseInt(fileTrapSTrue);
					fileClimb = Integer.parseInt(fileClimbSTrue);
					System.out.println("boop3");
					// Match stuff
					AutoAttempt fileAuto = new AutoAttempt(fileTeamNum, fileMatchNum, autoStartPos, autoANControl, autoASpecker, autoAAmp, autoNControl, autoSpecker, autoAmp);
					Match tempM = new Match(fileTeamNum, fileMatchNum, fileAmp, fileSpe, fileTrap, fileClimb, fileHumPostionSTrue, fileHumAmpSkill, fileHumAmpSkill, fileHumAmpNotes, fileCommentSTrue, fileAuto, fileAllColor, fileIsPrac, fileIsReplay, fileIsPlay);
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
					if(fileTempTeamList.listOfTempTeams.get(i).getHumanPostionList() == null) {
						System.out.println("boop16.5");
					}
					humPostionsListT = fileTempTeamList.listOfTempTeams.get(i).getHumanPostionList(); 
					if(humPostionsListT == null) {
						System.out.println("boop16.6");
					}
					System.out.println("boop17");
					timesHumAmpT = fileTempTeamList.listOfTempTeams.get(i).getTimesHumAmp();
					timesHumScoT = fileTempTeamList.listOfTempTeams.get(i).getTimesHumSco();
					System.out.println("boop18");
					MatchList tempMatchListT = fileTempTeamList.listOfTempTeams.get(i).getMatchList();
					fileTeamList.addTempTeam(fileTeamNumT, fileCyclesT, fileMatchesT, fileAmpT, fileSpeT, fileTrapT, fileClimbT, commentListT, humPostionsListT, fileHumAmpSkillT, fileHumScoSkillT, fileHumAmpNotesT, timesHumAmpT, timesHumScoT, tempMatchListT);
					System.out.println("boop19" + fileTeamList.listOfTeams.get(i).getHumanPostionList().get(0));
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
				String fileAllColorS;
				String fileAllColorSTrue;
				String fileIsPracS;
				String fileIsPracSTrue;
				String fileIsPlayS;
				String fileIsPlaySTrue;
				String fileIsReplayS;
				String fileIsReplaySTrue;
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
				Boolean fileAllColor;
				Boolean fileIsPrac;
				Boolean fileIsPlay;
				Boolean fileIsReplay;
				// auto stuff
				String autoStartPosS;
				String autoANControlS;
				String autoASpeckerS;
				String autoAAmpS;
				String autoNControlS;
				String autoSpeckerS;
				String autoAmpS;
				String autoStartPosSTrue;
				String autoANControlSTrue;
				String autoASpeckerSTrue;
				String autoAAmpSTrue;
				String autoNControlSTrue;
				String autoSpeckerSTrue;
				String autoAmpSTrue;
				int autoStartPos;
				int autoANControl;
				int autoASpecker;
				int autoAAmp;
				int autoNControl;
				int autoSpecker;
				int autoAmp;
				/**for(int i = 0; i < 5; i++) {
					fileInput.next();
				}**/
				while(fileInput.hasNextLine()) {
					fileTeamNumS = fileInput.next();
					fileMatchNumS = fileInput.next();
					fileIsPracS  = fileInput.next();
					fileIsPlayS  = fileInput.next();
					fileAllColorS = fileInput.next();
					fileIsReplayS  = fileInput.next();
					//auto stuff
					autoStartPosS = fileInput.next();
					autoANControlS = fileInput.next();
					autoASpeckerS = fileInput.next();
					autoAAmpS = fileInput.next();
					autoNControlS = fileInput.next();
					autoSpeckerS = fileInput.next();
					autoAmpS = fileInput.next();
					int lengthOfAutoStartPos = autoStartPosS.length() - 1;
					autoStartPosSTrue = autoStartPosS.substring(1, lengthOfAutoStartPos);
					int lengthOfAutoANControl = autoANControlS.length() - 1;
					autoANControlSTrue = autoANControlS.substring(1, lengthOfAutoANControl);
					int lengthOfAutoASpecker = autoASpeckerS.length() - 1;
					autoASpeckerSTrue = autoASpeckerS.substring(1, lengthOfAutoASpecker);
					int lengthOfAutoAAmp = autoAAmpS.length() - 1;
					autoAAmpSTrue = autoAAmpS.substring(1, lengthOfAutoAAmp);
					int lengthOfAutoNControl = autoNControlS.length() - 1;
					autoNControlSTrue = autoNControlS.substring(1, lengthOfAutoNControl);
					int lengthOfAutoSpecker = autoSpeckerS.length() - 1;
					autoSpeckerSTrue = autoSpeckerS.substring(1, lengthOfAutoSpecker);
					int lengthOfAutoAmp = autoAmpS.length() - 1;
					autoAmpSTrue = autoAmpS.substring(1, lengthOfAutoAmp);
					autoStartPos = Integer.parseInt(autoStartPosSTrue);
					autoANControl = Integer.parseInt(autoANControlSTrue);
					autoASpecker = Integer.parseInt(autoASpeckerSTrue);
					autoAAmp = Integer.parseInt(autoAAmpSTrue);
					autoNControl = Integer.parseInt(autoNControlSTrue);
					autoSpecker = Integer.parseInt(autoSpeckerSTrue);
					autoAmp = Integer.parseInt(autoAmpSTrue);
					
					fileAmpS = fileInput.next();
					fileSpeS = fileInput.next();
					fileTrapS = fileInput.next();
					fileClimbS = fileInput.next();
					fileCommentS = fileInput.next();
					fileHumPostionS = fileInput.next();
					fileHumSkillS = fileInput.next();
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
					int lengthOfIsPracSFile = fileIsPracS.length() - 1;
					fileIsPracSTrue = fileIsPracS.substring(1, lengthOfIsPracSFile);
					int lengthOfIsPlaySFile = fileIsPlayS.length() - 1;
					fileIsPlaySTrue = fileIsPlayS.substring(1, lengthOfIsPlaySFile);
					int lengthOfFileAllColor = fileAllColorS.length() - 1;
					fileAllColorSTrue = fileAllColorS.substring(1, lengthOfFileAllColor);
					int lengthOfIsReplaySFile = fileIsReplayS.length() - 1;
					fileIsReplaySTrue = fileIsReplayS.substring(1, lengthOfIsReplaySFile);
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
					fileIsPrac = Boolean.parseBoolean(fileIsPracSTrue);
					fileIsPlay = Boolean.parseBoolean(fileIsPlaySTrue);
					fileAllColor = Boolean.parseBoolean(fileAllColorSTrue);
					fileIsReplay = Boolean.parseBoolean(fileIsReplaySTrue);
					fileAmp = Integer.parseInt(fileAmpSTrue);
					fileSpe = Integer.parseInt(fileSpeSTrue);
					fileTrap = Integer.parseInt(fileTrapSTrue);
					fileClimb = Integer.parseInt(fileClimbSTrue);
					//match stuff
					System.out.println("Boop");
					AutoAttempt fileAuto = new AutoAttempt(fileTeamNum, fileMatchNum, autoStartPos, autoANControl, autoASpecker, autoAAmp, autoNControl, autoSpecker, autoAmp);
					Match tempM = new Match(fileTeamNum, fileMatchNum, fileAmp, fileSpe, fileTrap, fileClimb, fileHumPostionSTrue, fileHumAmpSkill, fileHumAmpSkill, fileHumAmpNotes, fileCommentSTrue, fileAuto, fileAllColor, fileIsPrac, fileIsReplay, fileIsPlay);
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
