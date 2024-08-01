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
	private TextField enterTeamNum;
	private TextField enterMatch;
	private TextField enterYell;
	private TextField enterControl;
	private TextField enterPhysical;
	private TextField enterDiscrim;
	private TextField enterDisCrimType;
	private TextField enterOtherB;
	private TextField enterFun;
	private TextField enterStrategy;
	private TextField enterOhterG;
	private TextField enterComments;
	private Scanner fileInput;
	private DriveTeamCommentsList fileDTC;
	private Button addEnterB;
	
	public openNewDriveTeamComsTab() {
		fileDTC = new DriveTeamCommentsList();
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
		addDTCEnterySetUp();
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
			new FileWriter("MainDriveTeamCommentsFile.txt", false).close();
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
				fw = new FileWriter("MainDriveTeamCommentsFile.txt", true);
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
				out.close();
			}
		} catch (IOException e) {
			System.out.println("Error" + e);
		}
	}
	
	public void addDTCEnterySetUp() {
		this.add(new Label("Enter a Comment: "), 1, 5);
		this.add(new Label("Team Number:"), 1, 6);
		this.add(new Label("Match:"), 3, 6);
		this.add(new Label("Yell Level:"), 1, 7);
		this.add(new Label("Control Level:"), 1, 7);
		this.add(new Label("Physical Level:"), 5, 7);
		this.add(new Label("Discrimination Level:"), 1, 8);
		this.add(new Label("Discrimination Type:"), 3, 8);
		this.add(new Label("Other Level:"), 5, 8);
		this.add(new Label("Fun Level:"), 1, 9);
		this.add(new Label("Strategy Level:"), 3, 9);
		this.add(new Label("Other Level:"), 5, 9);
		enterTeamNum = new TextField();
		enterMatch = new TextField();
		enterYell = new TextField();
		enterControl = new TextField();
		enterPhysical = new TextField();
		enterDiscrim = new TextField();
		enterDisCrimType = new TextField();
		enterOtherB = new TextField();
		enterFun = new TextField();
		enterStrategy = new TextField();
		enterOhterG = new TextField();
		enterComments = new TextField();
		this.add(enterTeamNum, 2, 6);
		this.add(enterMatch, 4, 6);
		this.add(enterYell, 2, 7);
		this.add(enterControl, 4, 7);
		this.add(enterPhysical, 6, 7);
		this.add(enterDiscrim, 2, 8);
		this.add(enterDisCrimType, 4, 8);
		this.add(enterOtherB, 6, 8);
		this.add(enterFun, 2, 9);
		this.add(enterStrategy, 4, 9);
		this.add(enterOhterG, 6, 9);
		this.add(enterComments, 2, 10);
		addEnterB = new Button("Enter");
		addEnterB.setOnAction(this);
		this.add(addEnterB, 2, 11);
	}
	
	public void addDTCEntery() {
		int match = 0;
		int yellLevel = 0;
		int controlLevel = 0;
		int physicalLevel = 0;
		int discrimLevel = 0;
		int otherBLevel = 0;
		int totalBLevel = 0;
		int funLevel = 0;
		int strategyLevel = 0;
		int otherGLevel = 0;
		String discrimTypeS = "null";
		String commentsS = "null";
		String teamNumS = enterTeamNum.getText();
		String matchS = enterMatch.getText();
		String yellLevelS = enterYell.getText();
		String controlLevelS = enterControl.getText();
		String physicalLevelS = enterPhysical.getText();
		String discrimLevelS = enterDiscrim.getText();
		if(enterDisCrimType.getText() != "") {
			discrimTypeS = enterDisCrimType.getText();
		}
		String otherBLevelS = enterOtherB.getText();
		String totalBLevelS = enterTeamNum.getText();
		String funLevelS = enterFun.getText();
		String strategyLevelS = enterStrategy.getText();
		String otherGLevelS = enterOhterG.getText();
		if(enterOhterG.getText() != "") {
			commentsS = enterOhterG.getText();
		}
		int teamNum = Integer.parseInt(teamNumS);
		if(matchS.compareTo("0") != 0) {
			match = Integer.parseInt(matchS);
		}
		if(yellLevelS.compareTo("0") != 0) {
			yellLevel = Integer.parseInt(yellLevelS);
		}
		if(controlLevelS.compareTo("0") != 0) {
			controlLevel = Integer.parseInt(controlLevelS);
		}
		if(physicalLevelS.compareTo("0") != 0) {
			physicalLevel = Integer.parseInt(physicalLevelS);
		}
		if(discrimLevelS.compareTo("0") != 0) {
			discrimLevel = Integer.parseInt(discrimLevelS);
		}
		if(otherBLevelS.compareTo("0") != 0) {
			otherBLevel = Integer.parseInt(otherBLevelS);
		}
		if(totalBLevelS.compareTo("0") != 0) {
			totalBLevel = Integer.parseInt(totalBLevelS);
		}
		if(funLevelS.compareTo("0") != 0) {
			funLevel = Integer.parseInt(funLevelS);
		}
		if(strategyLevelS.compareTo("0") != 0) {
			strategyLevel = Integer.parseInt(strategyLevelS);
		}
		if(otherGLevelS.compareTo("0") != 0) {
			otherGLevel = Integer.parseInt(otherGLevelS);
		}
		fileDTC.addDriveTeamComments(teamNum, match, yellLevel, controlLevel, physicalLevel, discrimLevel, discrimTypeS, otherBLevel, totalBLevel, funLevel, strategyLevel, otherGLevel, commentsS);
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
			if(event.getSource() == addEnterB) {
				addDTCEntery();
			}
		}catch(Exception e) {
			System.out.println("Error:  " + e);
		}
	}
}
