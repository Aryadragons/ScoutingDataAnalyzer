package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;

public class openNewPitDataTab extends GridPane implements EventHandler<ActionEvent>{
	
	private Button goForReplaceB;
	private Button goForAddB;
	private Button submitReB;
	private Button submitAddB;
	private TextField fileNameReTF;
	private TextField fileNameAddTF;
	private Scanner fileInput;
	private TeamPitsList fileTPL;
	private AutoList fileAL;
	
	public openNewPitDataTab() {
		fileTPL = new TeamPitsList();
		this.add(new Label("Open New Data That Will Replace All Pit Data"), 0, 0);
		this.add(new Label("Choosen File Name"), 0, 1);
		fileNameReTF = new TextField();
		this.add(fileNameReTF, 1, 1);
		this.add(new Label("Open New Data That Will Start Or Add On To Current Pit Data"), 0, 2);
		this.add(new Label("Choosen File Name"), 0, 3);
		fileNameAddTF = new TextField();
		this.add(fileNameAddTF, 1, 3);
		goForReplaceB = new Button("Go");
		goForAddB = new Button("Go");
		submitReB = new Button("Submit");
		submitAddB = new Button("Submit");
		goForReplaceB.setOnAction(this);
		goForAddB.setOnAction(this);
		submitReB.setOnAction(this);
		submitAddB.setOnAction(this);
		this.add(goForReplaceB, 1, 0);
		this.add(goForAddB, 1, 2);
		this.add(submitReB, 2, 1);
		this.add(submitAddB, 2, 3);
		for (int i = 0; i < 23; i++) {
			this.add(new Label(""), 0, i);
		}
	}
	
	public void openPitDataFile() {
		try {
			FileChooser chooser = new FileChooser();
			File fileChosen = chooser.showOpenDialog(null);
			if (fileChosen != null) {
				System.out.println(fileChosen);
				fileInput = new Scanner(fileChosen);
				fileNameReTF.setText(fileChosen.toString());
			}
		}catch(Exception e) {
			System.out.println("Error:  " + e);
		}
	}
	
	public void readInPitDataFile() {
		String teamNumS;
		String teamNameS;
		String numOfStudS;
		String numOfMentS;
		String numOfRobotBatS;
		String programLanS;
		String doHaveVisS;
		String numOfVisCamS;
		String numOfDriverCamsS;
		String drTrTypeS;
		String swevTypeS;
		String swevGearingS;
		String drTrMotorTypeS;
		String teamNumSTrue;
		String teamNameSTrue;
		String numOfStudSTrue;
		String numOfMentSTrue;
		String numOfRobotBatSTrue;
		String programLanSTrue;
		String doHaveVisSTrue;
		String numOfVisCamSTrue;
		String numOfDriverCamsSTrue;
		String drTrTypeSTrue;
		String swevTypeSTrue;
		String swevGearingSTrue;
		String drTrMotorTypeSTrue;
		int teamNum;
		int numOfStud;
		int numOfMent;
		int numOfRobotBat;
		int numOfVisCam;
		int numOfDriverCams;
		//auto Stuff 
		String numOfAutosS;
		String numOfAutosSTrue;
		int numOfAutos;
		String autoStartPosS;
		String totalControlS;
		String totalSpeckerS;
		String totalAmpS;
		String numCenNotesS;
		String autoStartPosSTrue;
		String totalControlSTrue;
		String totalSpeckerSTrue;
		String totalAmpSTrue;
		String numCenNotesSTrue;
		int autoStartPos;
		int totalControl;
		int totalSpecker;
		int totalAmp;
		int numCenNotes;
		System.out.println("Boop1");
		while(fileInput.hasNextLine()) {
			teamNumS = fileInput.next();
			teamNameS = fileInput.next();
			numOfStudS = fileInput.next();
			numOfMentS = fileInput.next();
			numOfRobotBatS = fileInput.next();
			programLanS = fileInput.next();
			doHaveVisS = fileInput.next();
			numOfVisCamS = fileInput.next();
			numOfDriverCamsS = fileInput.next();
			drTrTypeS = fileInput.next();
			swevTypeS = fileInput.next();
			swevGearingS = fileInput.next();
			drTrMotorTypeS = fileInput.next();
			//team Num
			int lengthOfTeamNum = teamNumS.length() - 1;
			teamNumSTrue = teamNumS.substring(1, lengthOfTeamNum);
			teamNum = Integer.parseInt(teamNumSTrue);
			//auto stuff
			numOfAutosS = fileInput.next();
			int lengthOfNumOfAutos = numOfAutosS.length() - 1;
			numOfAutosSTrue = numOfAutosS.substring(1, lengthOfNumOfAutos);
			numOfAutos = Integer.parseInt(numOfAutosSTrue);
			for(int i = 0; i < numOfAutos; i++) {
				autoStartPosS = fileInput.next();
				totalControlS = fileInput.next();
				totalSpeckerS = fileInput.next();
				totalAmpS = fileInput.next();
				numCenNotesS = fileInput.next();
				int lengthOfAutoStartPos = autoStartPosS.length() - 1;
				autoStartPosSTrue = autoStartPosS.substring(1, lengthOfAutoStartPos);
				int lengthOfTotalControl = totalControlS.length() - 1;
				totalControlSTrue = totalControlS.substring(1, lengthOfTotalControl);
				int lengthOfTotalSpecker = totalSpeckerS.length() - 1;
				totalSpeckerSTrue = totalSpeckerS.substring(1, lengthOfTotalSpecker);
				int lengthOfTotalAmp = totalAmpS.length() - 1;
				totalAmpSTrue = totalAmpS.substring(1, lengthOfTotalAmp);
				int lengthOfNumCenNotes = numCenNotesS.length() - 1;
				numCenNotesSTrue = numCenNotesS.substring(1, lengthOfNumCenNotes);
				autoStartPos = Integer.parseInt(autoStartPosSTrue);
				totalControl = Integer.parseInt(totalControlSTrue);
				totalControl  = Integer.parseInt(totalSpeckerSTrue);
				totalAmp = Integer.parseInt(totalAmpSTrue);
				numCenNotes = Integer.parseInt(numCenNotesSTrue);
				fileAL.addPitAuto(teamNum, autoStartPos, totalControl, totalControl, totalAmp, numCenNotes);
			}
			System.out.println("Boop2");
			//detleing ""s
			int lengthOfTeamName = teamNameS.length() - 1;
			teamNameSTrue = teamNameS.substring(1, lengthOfTeamName);
			int lengthOfNumOfStud = numOfStudS.length() - 1;
			numOfStudSTrue = numOfStudS.substring(1, lengthOfNumOfStud);
			int lengthOfNumOfMent = numOfMentS.length() - 1;
			numOfMentSTrue = numOfMentS.substring(1, lengthOfNumOfMent);
			int lengthOfNumOfRobotBat = numOfRobotBatS.length() - 1;
			numOfRobotBatSTrue = numOfRobotBatS.substring(1, lengthOfNumOfRobotBat);
			int lengthOfProgramLan = programLanS.length() - 1;
			programLanSTrue = programLanS.substring(1, lengthOfProgramLan);
			int lengthOfDoHaveVis = doHaveVisS.length() - 1;
			doHaveVisSTrue = doHaveVisS.substring(1, lengthOfDoHaveVis);
			int lengthOfNumOfVisCam = numOfVisCamS.length() - 1;
			numOfVisCamSTrue = numOfVisCamS.substring(1, lengthOfNumOfVisCam);
			int lengthOfNumOfDriverCams = numOfDriverCamsS.length() - 1;
			numOfDriverCamsSTrue = numOfDriverCamsS.substring(1, lengthOfNumOfDriverCams);
			int lengthOfDrTrTypeS = drTrTypeS.length() - 1;
			drTrTypeSTrue = drTrTypeS.substring(1, lengthOfDrTrTypeS);
			int lengthOfSwevType = swevTypeS.length() - 1;
			swevTypeSTrue = swevTypeS.substring(1, lengthOfSwevType);
			int lengthOfSwevGearing = swevGearingS.length() - 1;
			swevGearingSTrue = swevGearingS.substring(1, lengthOfSwevGearing);
			int lengthOfDrTrMotorType =drTrMotorTypeS.length() - 1;
			drTrMotorTypeSTrue = drTrMotorTypeS.substring(1, lengthOfDrTrMotorType);
			System.out.println("Boop3" + teamNumSTrue);
			// making ints, ints
			numOfStud = Integer.parseInt(numOfStudSTrue);
			numOfMent = Integer.parseInt(numOfMentSTrue);
			numOfRobotBat = Integer.parseInt(numOfRobotBatSTrue);
			numOfVisCam = Integer.parseInt(numOfVisCamSTrue);
			numOfDriverCams = Integer.parseInt(numOfDriverCamsSTrue);
			System.out.println("Boop4");
			// adding to team pits list
			fileTPL.addTeamPit(teamNum, teamNameSTrue, numOfStud, numOfMent, numOfRobotBat, programLanSTrue, doHaveVisSTrue, numOfVisCam, numOfDriverCams, drTrTypeSTrue, swevTypeSTrue, swevGearingSTrue, drTrMotorTypeSTrue);
			System.out.println("Boop5");
		}
	}
	
	public void exportPitData() {
		int teamNum;
		int numOfStud;
		int numOfMent;
		int numOfRobotBat;
		int numOfVisCam;
		int numOfDriverCams;
		String teamNumS;
		String teamNameS;
		String numOfStudS;
		String numOfMentS;
		String numOfRobotBatS;
		String programLanS;
		String doHaveVisS;
		String numOfVisCamS;
		String numOfDriverCamsS;
		String drTrTypeS;
		String swevTypeS;
		String swevGearingS;
		String drTrMotorTypeS;
		try {
		new FileWriter("MainPitDataFiles.txt", false).close();
		for(int i = 0; i < fileTPL.listOfTeamPits.size(); i++) {
			// setting variables
			teamNum = fileTPL.listOfTeamPits.get(i).getTeamNum();
			numOfStud = fileTPL.listOfTeamPits.get(i).getNumOfStud();
			numOfMent = fileTPL.listOfTeamPits.get(i).getNumOfMent();
			numOfRobotBat = fileTPL.listOfTeamPits.get(i).getNumOfRobotBat();
			numOfVisCam = fileTPL.listOfTeamPits.get(i).getNumOfVisCam();
			numOfDriverCams = fileTPL.listOfTeamPits.get(i).getNumOfDriverCams();
			teamNumS = Integer.toString(teamNum);
			teamNameS = fileTPL.listOfTeamPits.get(i).getTeamName();
			numOfStudS = Integer.toString(numOfStud);
			numOfMentS = Integer.toString(numOfMent);
			numOfRobotBatS = Integer.toString(numOfRobotBat);
			programLanS = fileTPL.listOfTeamPits.get(i).getProgramLan();
			doHaveVisS = fileTPL.listOfTeamPits.get(i).getDoHaveVis();
			numOfVisCamS = Integer.toString(numOfVisCam);
			numOfDriverCamsS = Integer.toString(numOfDriverCams);
			drTrTypeS = fileTPL.listOfTeamPits.get(i).getDrTrType();
			swevTypeS = fileTPL.listOfTeamPits.get(i).getSwevType();
			swevGearingS = fileTPL.listOfTeamPits.get(i).getSwevGearing();
			drTrMotorTypeS = fileTPL.listOfTeamPits.get(i).getDrTrMotorType();
			FileWriter fw;
			fw = new FileWriter("MainPitDataFiles.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter out = new PrintWriter(bw);
			out.println(teamNumS);
			out.println(teamNameS);
			out.println(numOfStudS);
			out.println(numOfMentS);
			out.println(numOfRobotBatS);
			out.println(programLanS);
			out.println(doHaveVisS);
			out.println(numOfVisCamS);
			out.println(numOfDriverCamsS);
			out.println(drTrTypeS);
			out.println(swevTypeS);
			out.println(swevGearingS);
			out.println(drTrMotorTypeS);
			out.close();
		}
		} catch (IOException e) {
			System.out.println("Error" + e);
		}
	}
	
	@Override
	public void handle(ActionEvent event) {
		try {
			if(event.getSource() == goForReplaceB) {
				fileTPL.listOfTeamPits.clear();
				openPitDataFile();
			}
			if(event.getSource() == goForAddB) {
				openPitDataFile();			
			}
			if(event.getSource() == submitReB) {
				System.out.println("Boop0");
				readInPitDataFile();
				exportPitData();
			}
			if(event.getSource() == submitAddB) {
				readInPitDataFile();
				exportPitData();
			}
		}catch(Exception e) {
			System.out.println("Error:  " + e);
		}
		
	}
}
