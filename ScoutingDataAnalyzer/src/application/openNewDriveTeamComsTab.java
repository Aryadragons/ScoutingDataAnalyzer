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
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
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
	private TextField enterOtherG;
	private TextField enterComments;
	private Scanner fileInput;
	private DriveTeamCommentsList fileDTC;
	private Button addEnterB;
	
	public openNewDriveTeamComsTab() {
		fileDTC = new DriveTeamCommentsList();
		fileNameReTF = new TextField();
		fileNameAddTF = new TextField();
		goForReplaceB = new Button("Go");
		goForAddB = new Button("Go");
		submitReB = new Button("Submit");
		submitAddB = new Button("Submit");
		goForReplaceB.setOnAction(this);
		goForAddB.setOnAction(this);
		submitReB.setOnAction(this);
		submitAddB.setOnAction(this);
		VBox replaceLVB = new VBox(5);
		Label openReL = new Label("Open New Data That Will Replace All Drive Team Comments");
		Label fileChoosenReL = new Label("Choosen File Name");
		VBox replaceBVB = new VBox(5);
		replaceBVB.getChildren().addAll(goForReplaceB, submitReB);
		BorderPane replaceBP = new BorderPane();
		replaceBP.setLeft(replaceLVB);
		replaceBP.setCenter(fileNameReTF);
		replaceBP.setRight(replaceBVB);
		replaceBP.setId("BPA4open");
		VBox addLVB = new VBox(5);
		Label openAddL = new Label("Open New Data That Will Start Or Add On To Current Drive Team Comments");
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
		this.add(new Label("    "), 0, 0);
		this.add(new Label("    "), 0, 2);
		this.add(replaceBP, 1, 1);
		this.add(addBP, 1, 3);
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
		Label enterComL = new Label("Enter a Comment:");
		Label enterTeamNumL = new Label("Team Number:");
		Label enterMAtchL = new Label("Match:");
		Label enterYellL = new Label("Yell Level:");
		Label enterConL = new Label("Control Level:");
		Label enterPhyL = new Label("Physical Level:");
		Label enterDisLL = new Label("Discrimination Level:");
		Label enterDicTL = new Label("Discrimination Type:");
		Label enterOtherBL = new Label("Other Level:");
		Label enterFunL = new Label("Fun Level:");
		Label enterStratL = new Label("Strategy Level:");
		Label enterOtherGL = new Label("Other Level:");
		enterComL.setId("TitleLabelPlay");
		enterTeamNumL.setId("TitleLabelPlay");
		enterMAtchL.setId("TitleLabelPlay");
		enterYellL.setId("TitleLabelPlay");
		enterConL.setId("TitleLabelPlay");
		enterPhyL.setId("TitleLabelPlay");
		enterDisLL.setId("TitleLabelPlay");
		enterDicTL.setId("TitleLabelPlay");
		enterOtherBL.setId("TitleLabelPlay");
		enterFunL.setId("TitleLabelPlay");
		enterStratL.setId("TitleLabelPlay");
		enterOtherGL.setId("TitleLabelPlay");
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
		enterOtherG = new TextField();
		enterComments = new TextField();
		VBox enterComVB = new VBox(5);
		enterComVB.getChildren().addAll(enterComL, enterComments);
		enterComVB.setId("openDTCVB1");
		VBox enterTeamNumVB = new VBox(5);
		enterTeamNumVB.getChildren().addAll();
		enterTeamNumVB.setId("openDTCVB2");
		VBox enterMatchVB = new VBox(5);
		enterMatchVB.getChildren().addAll();
		enterMatchVB.setId("openDTCVB3");
		VBox enterYellVB = new VBox(5);
		enterYellVB.getChildren().addAll();
		enterYellVB.setId("openDTCVB4");
		VBox enterConVB = new VBox(5);
		enterConVB.getChildren().addAll();
		enterConVB.setId("openDTCVB5");
		VBox enterPhyVB = new VBox(5);
		enterPhyVB.getChildren().addAll();
		enterPhyVB.setId("openDTCVB6");
		VBox enterDisLVB = new VBox(5);
		enterDisLVB.getChildren().addAll();
		enterDisLVB.setId("openDTCVB7");
		VBox enterDisTVB = new VBox(5);
		enterDisTVB.getChildren().addAll();
		enterDisTVB.setId("openDTCVB8");
		VBox enterOtherBVB = new VBox(5);
		enterOtherBVB.getChildren().addAll();
		enterOtherBVB.setId("openDTCVB9");
		VBox enterFunVB = new VBox(5);
		enterFunVB.getChildren().addAll();
		enterFunVB.setId("openDTCVB10");
		VBox enterStratVB = new VBox(5);
		enterStratVB.getChildren().addAll();
		enterStratVB.setId("openDTCVB9");
		VBox enterOtherGVB = new VBox(5);
		enterOtherGVB.getChildren().addAll();
		enterOtherGVB.setId("openDTCVB8");
		BorderPane enterComsBP = new BorderPane();
		enterComsBP.setCenter(enterComVB);
		BorderPane enterTeamNumBP = new BorderPane();
		enterTeamNumBP.setCenter(enterTeamNumVB);
		BorderPane enterMatchBP = new BorderPane();
		enterMatchBP.setCenter(enterMatchVB);
		BorderPane enterYellBP = new BorderPane();
		enterYellBP.setCenter(enterYellVB);
		BorderPane enterConBP = new BorderPane();
		enterConBP.setCenter(enterConVB);
		BorderPane enterPhyBP = new BorderPane();
		enterPhyBP.setCenter(enterPhyVB);
		BorderPane enterDisLBP = new BorderPane();
		enterDisLBP.setCenter(enterDisLVB);
		BorderPane enterDisTBP = new BorderPane();
		enterDisTBP.setCenter(enterDisTVB);
		BorderPane enterOtherBBP = new BorderPane();
		enterOtherBBP.setCenter(enterOtherBVB);
		BorderPane enterFunBP = new BorderPane();
		enterFunBP.setCenter(enterFunVB);
		BorderPane enterStratBP = new BorderPane();
		enterStratBP.setCenter(enterStratVB);
		BorderPane enterOtherGBP = new BorderPane();
		enterOtherGBP.setCenter(enterOtherGVB);
		enterComsBP.setId("openDTCBP1");
		enterTeamNumBP.setId("openDTCBP2");
		enterMatchBP.setId("openDTCBP3");
		enterYellBP.setId("openDTCBP4");
		enterConBP.setId("openDTCB51");
		enterPhyBP.setId("openDTCBP6");
		enterDisLBP.setId("openDTCBP7");
		enterDisTBP.setId("openDTCBP8");
		enterOtherBBP.setId("openDTCBP9");
		enterFunBP.setId("openDTCBP10");
		enterStratBP.setId("openDTCBP9");
		enterOtherGBP.setId("openDTCBP8");
		this.add(enterTeamNumBP, 1, 1);
		this.add(enterMatchBP, 3, 1);
		this.add(enterYellBP, 5, 1);
		this.add(enterConBP, 7, 1);
		this.add(enterPhyBP, 9, 1);
		this.add(enterDisLBP, 11, 1);
		this.add(enterDisTBP, 1, 3);
		this.add(enterOtherBBP, 3, 3);
		this.add(enterFunBP, 5, 3);
		this.add(enterStratBP, 7, 3);
		this.add(enterOtherGBP, 9, 3);
		this.add(enterComsBP, 11, 3);
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
		String otherGLevelS = enterOtherG.getText();
		if(enterOtherG.getText() != "") {
			commentsS = enterOtherG.getText();
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
