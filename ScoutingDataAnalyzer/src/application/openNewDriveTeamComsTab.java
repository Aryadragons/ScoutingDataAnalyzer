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

public class openNewDriveTeamComsTab extends GridPane implements EventHandler<ActionEvent>{
	
	private Button goForReplaceB;
	private Button goForAddB;
	private Button submitReB;
	private Button submitAddB;
	private TextField fileNameReTF;
	private TextField fileNameAddTF;
	private Scanner fileInput;
	private DriveTeamCommentsList fileDTC;
	
	public openNewDriveTeamComsTab() {
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
	
	public void openDTCFile() {
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
	
	public void readInDTCFile() {
		String teamNumS;
		String matchS;
		String yellLevelS;
		String controlLevelS;
		String physicalLevelS;
		String discrimLevelS;
		String discrimTypeS;
		String otherBLevelS;
		String totalBLevelS;
		String funLevelS;
		String strategyLevelS;
		String otherGLevelS;
		String commentsS;
		String teamNumSTrue;
		String matchSTrue;
		String yellLevelSTrue;
		String controlLevelSTrue;
		String physicalLevelSTrue;
		String discrimLevelSTrue;
		String discrimTypeSTrue;
		String otherBLevelSTrue;
		String totalBLevelSTrue;
		String funLevelSTrue;
		String strategyLevelSTrue;
		String otherGLevelSTrue;
		String commentsSTrue;
		int teamNum;
		int match;
		int yellLevel;
		int controlLevel;
		int physicalLevel;
		int discrimLevel;
		int otherBLevel;
		int totalBLevel;
		int funLevel;
		int strategyLevel;
		int otherGLevel;
		while(fileInput.hasNextLine()) {
			teamNumS = fileInput.next();
			matchS = fileInput.next();
			yellLevelS = fileInput.next();
			controlLevelS = fileInput.next();
			physicalLevelS = fileInput.next();
			discrimLevelS = fileInput.next();
			discrimTypeS = fileInput.next();
			otherBLevelS = fileInput.next();
			totalBLevelS = fileInput.next();
			funLevelS = fileInput.next();
			strategyLevelS = fileInput.next();
			otherGLevelS = fileInput.next();
			commentsS = fileInput.next();
			int lengthOfTeamNum = teamNumS.length() - 1;
			teamNumSTrue = teamNumS.substring(1, lengthOfTeamNum);
			int lengthOfMatch = matchS.length() - 1;
			matchSTrue = matchS.substring(1, lengthOfMatch);
			int lengthOfYellLevel = yellLevelS.length() - 1;
			yellLevelSTrue = yellLevelS.substring(1, lengthOfYellLevel);
			int lengthOfControlLevel = controlLevelS.length() - 1;
			controlLevelSTrue = controlLevelS.substring(1, lengthOfControlLevel);
			int lengthOfPhysicalLevel = physicalLevelS.length() - 1;
			physicalLevelSTrue = physicalLevelS.substring(1, lengthOfPhysicalLevel);
			int lengthOfDiscrimLevel = discrimLevelS.length() - 1;
			discrimLevelSTrue = discrimLevelS.substring(1, lengthOfDiscrimLevel);
			int lengthOfDiscrimType = discrimTypeS.length() - 1;
			discrimTypeSTrue = discrimTypeS.substring(1, lengthOfDiscrimType);
			int lengthOfOtherBLevel = otherBLevelS.length() - 1;
			otherBLevelSTrue = otherBLevelS.substring(1, lengthOfOtherBLevel);
			int lengthOfTotalBLevel = totalBLevelS.length() - 1;
			totalBLevelSTrue = totalBLevelS.substring(1, lengthOfTotalBLevel);
			int lengthOfFunLevel = funLevelS.length() - 1;
			funLevelSTrue = funLevelS.substring(1, lengthOfFunLevel);
			int lengthOfStrategyLevel = strategyLevelS.length() - 1;
			strategyLevelSTrue = strategyLevelS.substring(1, lengthOfStrategyLevel);
			int lengthOfOtherGLevel = otherGLevelS.length() - 1;
			otherGLevelSTrue = otherGLevelS.substring(1, lengthOfOtherGLevel);
			int lengthOfComments = commentsS.length() - 1;
			commentsSTrue = commentsS.substring(1, lengthOfComments);
			teamNum = Integer.parseInt(teamNumSTrue);
			match = Integer.parseInt(matchSTrue);
			yellLevel = Integer.parseInt(yellLevelSTrue);
			controlLevel = Integer.parseInt(controlLevelSTrue);
			physicalLevel = Integer.parseInt(physicalLevelSTrue);
			discrimLevel = Integer.parseInt(discrimLevelSTrue);
			otherBLevel = Integer.parseInt(otherBLevelSTrue);
			totalBLevel = Integer.parseInt(totalBLevelSTrue);
			funLevel = Integer.parseInt(funLevelSTrue);
			strategyLevel = Integer.parseInt(strategyLevelSTrue);
			otherGLevel = Integer.parseInt(otherGLevelSTrue);
			fileDTC.addDriveTeamComments(teamNum, match, yellLevel, controlLevel, physicalLevel, discrimLevel, discrimTypeSTrue, otherBLevel, totalBLevel, funLevel, strategyLevel, otherGLevel, commentsSTrue);
		}
	}
	
	public void exportDTCData() {
		int teamNum;
		int match;
		int yellLevel;
		int controlLevel;
		int physicalLevel;
		int discrimLevel;
		int otherBLevel;
		int totalBLevel;
		int funLevel;
		int strategyLevel;
		int otherGLevel;
		String teamNumS;
		String matchS;
		String yellLevelS;
		String controlLevelS;
		String physicalLevelS;
		String discrimLevelS;
		String discrimTypeS;
		String otherBLevelS;
		String totalBLevelS;
		String funLevelS;
		String strategyLevelS;
		String otherGLevelS;
		String commentsS;
		try {
			new FileWriter("MainDriveTeamDataFiles.txt", false).close();
			System.out.println("Boop 8");
			for(int i = 0; i < fileDTC.listOfDriveTeamComments.size(); i++) {
				teamNum = fileDTC.listOfDriveTeamComments.get(i).getTeamNum();
				match = fileDTC.listOfDriveTeamComments.get(i).getMatch();
				yellLevel = fileDTC.listOfDriveTeamComments.get(i).getYellLevel();
				controlLevel = fileDTC.listOfDriveTeamComments.get(i).getControlLevel();
				physicalLevel = fileDTC.listOfDriveTeamComments.get(i).getPhysicalLevel();
				discrimLevel = fileDTC.listOfDriveTeamComments.get(i).getDiscrimLevel();
				otherBLevel = fileDTC.listOfDriveTeamComments.get(i).getOtherBLevel();
				totalBLevel = fileDTC.listOfDriveTeamComments.get(i).gettotalBLevel();
				funLevel = fileDTC.listOfDriveTeamComments.get(i).getFunLevel();
				strategyLevel = fileDTC.listOfDriveTeamComments.get(i).getStrategyLevel();
				otherGLevel = fileDTC.listOfDriveTeamComments.get(i).getOtherGLevel();
				teamNumS = Integer.toString(teamNum);
				matchS = Integer.toString(match);
				yellLevelS = Integer.toString(yellLevel);
				controlLevelS = Integer.toString(controlLevel);
				physicalLevelS = Integer.toString(physicalLevel);
				discrimLevelS = Integer.toString(discrimLevel);
				discrimTypeS = fileDTC.listOfDriveTeamComments.get(i).getDisCrimType();
				otherBLevelS = Integer.toString(otherBLevel);
				totalBLevelS = Integer.toString(totalBLevel);
				funLevelS = Integer.toString(funLevel);
				strategyLevelS = Integer.toString(strategyLevel);
				otherGLevelS = Integer.toString(otherGLevel);
				commentsS = fileDTC.listOfDriveTeamComments.get(i).getComments();
				FileWriter fw;
				fw = new FileWriter("MainDriveTeamDataFiles.txt", true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw);
				out.println(teamNumS);
				out.println(matchS);
				out.println(yellLevelS);
				out.println(controlLevelS);
				out.println(physicalLevelS);
				out.println(discrimLevelS);
				out.println(discrimTypeS);
				out.println(otherBLevelS);
				out.println(totalBLevelS);
				out.println(funLevelS);
				out.println(strategyLevelS);
				out.println(otherGLevelS);
				out.println(commentsS);
			}
		} catch (IOException e) {
			System.out.println("Error" + e);
		}
	}
	
	@Override
	public void handle(ActionEvent event) {
		try {
			if(event.getSource() == goForReplaceB) {
				fileDTC.listOfDriveTeamComments.clear();
				openDTCFile();
			}
			if(event.getSource() == goForAddB) {
				openDTCFile();			
			}
			if(event.getSource() == submitReB) {
				System.out.println("Boop0");
				readInDTCFile();
				System.out.println("Boop 6");
				exportDTCData();
				System.out.println("Boop 14");
			}
			if(event.getSource() == submitAddB) {
				readInDTCFile();
				exportDTCData();
			}
		}catch(Exception e) {
			System.out.println("Error:  " + e);
		}
	}
}
