package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
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
	private FileWriter csvWriter;
	
	public openNewScDataTab(TempTeamList theTempTeamList, TeamList theTeamList) {
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
	}
	
	public void exportDataToCSV() {
		try {
			System.out.println("Boop14");
			csvWriter = new FileWriter("MainScoutingDataFiles.csv");
			System.out.println("Boop15");
			String csvTeamNumS;
			String csvMatchesS;
			String csvCyclesS;
			String csvAmpS;
			String csvSpeS;
			String csvTrapS;
			String csvClimbS;
			int csvTeamNum;
			int csvMatches;
			int csvCycles;
			int csvAmp;
			int csvSpe;
			int csvTrap;
			int csvClimb;
			for(int i = 0; i < fileTeamList.listOfTeams.size(); i++) {
				System.out.println("Boop16");
				csvTeamNum = fileTeamList.listOfTeams.get(i).getTeamNum();
				csvMatches = fileTeamList.listOfTeams.get(i).getTotalMatchesPlayed();
				csvCycles = fileTeamList.listOfTeams.get(i).getAvgCycles();
				csvAmp = fileTeamList.listOfTeams.get(i).getAvgAmp();
				csvSpe = fileTeamList.listOfTeams.get(i).getAvgSpe();
				csvTrap = fileTeamList.listOfTeams.get(i).getAvgTrap();
				csvClimb = fileTeamList.listOfTeams.get(i).getAvgClimb();
				csvTeamNumS = Integer.toString(csvTeamNum);
				csvMatchesS = Integer.toString(csvMatches);
				csvCyclesS = Integer.toString(csvCycles);
				csvAmpS = Integer.toString(csvAmp);
				csvSpeS = Integer.toString(csvSpe);
				csvTrapS = Integer.toString(csvTrap);
				csvClimbS = Integer.toString(csvClimb);
				System.out.println("Boop17");
				csvWriter.append(csvTeamNumS);
				csvWriter.append(csvMatchesS);
				csvWriter.append(csvCyclesS);
				csvWriter.append(csvAmpS);
				csvWriter.append(csvSpeS);
				csvWriter.append(csvTrapS);
				csvWriter.append(csvClimbS);
				csvWriter.append("\n");
				System.out.println("Boop18");
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
				System.out.println("Boop");
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
				System.out.println("Boop1");
				String fileTeamNumS = "0";
				String fileAmpS = null;
				String fileSpeS;
				String fileTrapS;
				String fileClimbS;
				String fileCommentS;
				String fileTeamNumSTrue = "0";
				String fileAmpSTrue = null;
				String fileSpeSTrue;
				String fileTrapSTrue;
				String fileClimbSTrue;
				String fileCommentSTrue;
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
				//for(int i = 0; i < 5; i++) {
					//fileInput.next();
			//	}
				fileTeamNumS = fileInput.next();
				System.out.println("Boop2");
				while(fileTeamNumS != null) {
					System.out.println("Boop3");
					fileAmpS = fileInput.next();
					fileSpeS = fileInput.next();
					fileTrapS = fileInput.next();
					fileClimbS = fileInput.next();
					fileCommentS = fileInput.next();
					System.out.println("Boop4");
					System.out.println(fileTeamNumS);
					System.out.println(fileAmpS);
					System.out.println(fileSpeS);
					System.out.println(fileTrapS);
					System.out.println(fileClimbS);
					//remove "s part
					
					fileTeamNum = Integer.parseInt(fileTeamNumS);
					fileAmp = Integer.parseInt(fileAmpS);
					fileSpe = Integer.parseInt(fileSpeS);
					fileTrap = Integer.parseInt(fileTrapS);
					fileClimb = Integer.parseInt(fileClimbS);
					System.out.println("Boop5");
					fileMatches = fileTempTeamList.getATempTeam(fileTeamNum).getTotalMatchesPlayed();
					if(fileTempTeamList.getATempTeam(fileTeamNum) != null) {
						System.out.println("Boop6");
						fileTempTeamList.addOnToTempTeam(fileTeamNum, (fileTrap + fileAmp + fileSpe), fileMatches, fileAmp, fileSpe, fileTrap, fileClimb, fileCommentS);
					} else {
						System.out.println("Boop7");
						fileTempTeamList.addTempTeam(fileTeamNum, (fileAmp + fileSpe + fileTrap), fileMatches, fileAmp, fileSpe, fileTrap, fileClimb, fileCommentS);
					}
					System.out.println("Boop8");
					fileTeamNumS = fileInput.next();
				}
				System.out.println("Boop9");
				for (int i = 0; i < fileTempTeamList.listOfTempTeams.size(); i++) {
					System.out.println("Boop10");
					fileTeamNumT = fileTempTeamList.listOfTempTeams.get(i).getTeamNum();
					fileMatchesT = fileTempTeamList.listOfTempTeams.get(i).getTotalMatchesPlayed();
					fileCyclesT = fileTempTeamList.listOfTempTeams.get(i).getTotalCycles();
					fileAmpT = fileTempTeamList.listOfTempTeams.get(i).getTotalAmp();
					fileSpeT = fileTempTeamList.listOfTempTeams.get(i).getTotalSpe();
					fileTrapT = fileTempTeamList.listOfTempTeams.get(i).getTotalTrap();
					fileClimbT = fileTempTeamList.listOfTempTeams.get(i).getTotalClimb();
					commentListT = fileTempTeamList.listOfTempTeams.get(i).getCommentList();
					System.out.println("Boop11");
					fileTeamList.addTempTeam(fileTeamNumT, fileCyclesT, fileMatchesT, fileAmpT, fileSpeT, fileTrapT, fileClimbT, commentListT);
					System.out.println("Boop12");
				}
				System.out.println("Boop13");
				this.exportDataToCSV();	
				}
			if(event.getSource() == submitAddB) {
				String fileTeamNumS = "0";
				String fileAmpS = null;
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
					fileMatches = fileTempTeamList.getATempTeam(fileTeamNum).getTotalMatchesPlayed();
					if(fileTempTeamList.getATempTeam(fileTeamNum) != null) {
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
