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
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;

public class openNewDriveTeamDataTab extends GridPane implements EventHandler<ActionEvent>{
	
	private Button goForReplaceB;
	private Button goForAddB;
	private Button submitReB;
	private Button submitAddB;
	private TextField fileNameReTF;
	private TextField fileNameAddTF;
	private Scanner fileInput;
	private DriveTeamDataList fileDTD;
	
	public openNewDriveTeamDataTab() {
		fileDTD = new DriveTeamDataList();
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
		Label openReL = new Label("Open New Data That Will Replace All Drive Team Data");
		openReL.setId("TitleLabelPlay");
		Label fileChoosenReL = new Label("Choosen File Name");
		fileChoosenReL.setId("TitleLabelPlay");
		replaceLVB.getChildren().addAll(openReL, fileChoosenReL);
		VBox replaceBVB = new VBox(5);
		replaceBVB.getChildren().addAll(goForReplaceB, submitReB);
		BorderPane replaceBP = new BorderPane();
		replaceBP.setLeft(replaceLVB);
		replaceBP.setCenter(fileNameReTF);
		replaceBP.setRight(replaceBVB);
		replaceBP.setId("BPA4open");
		VBox addLVB = new VBox(5);
		Label openAddL = new Label("Open New Data That Will Start Or Add On To Current Drive Team Data");
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
	}
	
	public void openDTDFile() {
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
	
	public void readInDTDFile() {
		String teamNumS;
		String saDrThisTourS;
		String saDrPastTourS;
		String saDrLastYearS;
		String drHourThisBotS;
		String drHourSameDrTrS;
		String drHourAnyBotS;
		String opRoleS;
		String saOpThisTourS;
		String saOpPastTourS;
		String saOpLastYearS;
		String opHourThisBotS;
		String opHourAnyBotS;
		String isAdultS;
		String timeDriveCoachS;
		String humHoursPracitceS;
		String teamNumSTrue;
		String saDrThisTourSTrue;
		String saDrPastTourSTrue;
		String saDrLastYearSTrue;
		String drHourThisBotSTrue;
		String drHourSameDrTrSTrue;
		String drHourAnyBotSTrue;
		String opRoleSTrue;
		String saOpThisTourSTrue;
		String saOpPastTourSTrue;
		String saOpLastYearSTrue;
		String opHourThisBotSTrue;
		String opHourAnyBotSTrue;
		String isAdultSTrue;
		String timeDriveCoachSTrue;
		String humHoursPracitceSTrue;
		int teamNum;
		boolean saDrThisTour;
		boolean saDrPastTour;
		boolean saDrLastYear;
		int drHourThisBot;
		int drHourSameDrTr;
		int drHourAnyBot;
		boolean saOpThisTour;
		boolean saOpPastTour;
		boolean saOpLastYear;
		int opHourThisBot;
		int opHourAnyBot;
		boolean isAdult;
		int humHoursPracitce;
		System.out.println("Boop 1");
		while(fileInput.hasNextLine()) {
			teamNumS = fileInput.next();
			saDrThisTourS = fileInput.next();
			saDrPastTourS = fileInput.next();
			saDrLastYearS = fileInput.next();
			drHourThisBotS = fileInput.next();
			drHourSameDrTrS = fileInput.next();
			drHourAnyBotS = fileInput.next();
			opRoleS = fileInput.next();
			saOpThisTourS = fileInput.next();
			saOpPastTourS = fileInput.next();
			saOpLastYearS = fileInput.next();
			opHourThisBotS = fileInput.next();
			opHourAnyBotS = fileInput.next();
			isAdultS = fileInput.next();
			timeDriveCoachS = fileInput.next();
			humHoursPracitceS = fileInput.next();
			System.out.println("Boop 2");
			int lengthOfTeamNum = teamNumS.length() - 1;
			teamNumSTrue = teamNumS.substring(1, lengthOfTeamNum);
			int lengthOfsaDrThisTourS = saDrThisTourS.length() - 1;
			saDrThisTourSTrue = saDrThisTourS.substring(1, lengthOfsaDrThisTourS);
			int lengthOfsaDrPastTourS = saDrPastTourS.length() - 1;
			saDrPastTourSTrue = saDrPastTourS.substring(1, lengthOfsaDrPastTourS);
			int lengthOfsaDrLastYearS = saDrLastYearS.length() - 1;
			saDrLastYearSTrue = saDrLastYearS.substring(1,  lengthOfsaDrLastYearS);
			int lengthOfdrHourThisBotS = drHourThisBotS.length() - 1;
			drHourThisBotSTrue = drHourThisBotS.substring(1, lengthOfdrHourThisBotS);
			int lengthOfdrHourSameDrTrS = drHourSameDrTrS.length() - 1;
			drHourSameDrTrSTrue = drHourSameDrTrS.substring(1, lengthOfdrHourSameDrTrS);
			int lengthOfdrHourAnyBotS = drHourAnyBotS.length() - 1;
			drHourAnyBotSTrue = drHourAnyBotS.substring(1, lengthOfdrHourAnyBotS);
			int lengthOfopRoleS = opRoleS.length() - 1;
			opRoleSTrue = opRoleS.substring(1, lengthOfopRoleS);
			int lengthOfsaOpThisTourS = saOpThisTourS.length() - 1;
			saOpThisTourSTrue = saOpThisTourS.substring(1, lengthOfsaOpThisTourS);
			int lengthOfsaOpPastTourS = saOpPastTourS.length() - 1;
			saOpPastTourSTrue = saOpPastTourS.substring(1, lengthOfsaOpPastTourS);
			int lengthOfsaOpLastYearS = saOpLastYearS.length() - 1;
			saOpLastYearSTrue = saOpLastYearS.substring(1, lengthOfsaOpLastYearS);
			int lengthOfopHourThisBotS = opHourThisBotS.length() - 1;
			opHourThisBotSTrue = opHourThisBotS.substring(1, lengthOfopHourThisBotS);
			int lengthOfopHourAnyBotS = opHourAnyBotS.length() - 1;
			opHourAnyBotSTrue = opHourAnyBotS.substring(1, lengthOfopHourAnyBotS);
			int lengthOfisAdultS = isAdultS.length() - 1;
			isAdultSTrue = isAdultS.substring(1, lengthOfisAdultS);
			int lengthOftimeDriveCoachS = timeDriveCoachS.length() - 1;
			timeDriveCoachSTrue = timeDriveCoachS.substring(1, lengthOftimeDriveCoachS);
			int lengthOfhumHoursPracitceS = humHoursPracitceS.length() - 1;
			humHoursPracitceSTrue = humHoursPracitceS.substring(1, lengthOfhumHoursPracitceS);
			System.out.println("Boop 3");
			teamNum = Integer.parseInt(teamNumSTrue);
			saDrThisTour = Boolean.parseBoolean(saDrThisTourSTrue);
			saDrPastTour = Boolean.parseBoolean(saDrPastTourSTrue);
			saDrLastYear = Boolean.parseBoolean(saDrLastYearSTrue);
			drHourThisBot = Integer.parseInt(drHourThisBotSTrue);
			drHourSameDrTr = Integer.parseInt(drHourSameDrTrSTrue);
			drHourAnyBot = Integer.parseInt(drHourAnyBotSTrue);
			saOpThisTour = Boolean.parseBoolean(saOpThisTourSTrue);
			saOpPastTour = Boolean.parseBoolean(saOpPastTourSTrue);
			saOpLastYear = Boolean.parseBoolean(saOpLastYearSTrue);
			opHourThisBot = Integer.parseInt(opHourThisBotSTrue);
			opHourAnyBot = Integer.parseInt(opHourAnyBotSTrue);
			isAdult = Boolean.parseBoolean(isAdultSTrue);
			humHoursPracitce = Integer.parseInt(humHoursPracitceSTrue);
			System.out.println("Boop 4");
			fileDTD.addDriveTeamData(teamNum, saDrThisTour, saDrPastTour, saDrLastYear, drHourThisBot, drHourSameDrTr, drHourAnyBot, opRoleSTrue, saOpThisTour, saOpPastTour, saOpLastYear, opHourThisBot, opHourAnyBot, isAdult, timeDriveCoachSTrue, humHoursPracitce);
			System.out.println("Boop 5" + opRoleSTrue);
			System.out.println("Boop 5.1" + fileDTD.listOfDriveTeamData.get(0).getOpRole());
		}
	}
	
	public void exportDTDData() {
		int teamNumEx;
		boolean saDrThisTourEx;
		boolean saDrPastTourEx;
		boolean saDrLastYearExEx;
		int drHourThisBotEx;
		int drHourSameDrTrEx;
		int drHourAnyBotEx;
		boolean saOpThisTourEx;
		boolean saOpPastTourEx;
		boolean saOpLastYearEx;
		int opHourThisBotEx;
		int opHourAnyBotEx;
		boolean isAdultEx;
		int humHoursPracitceEx;
		String teamNumExS;
		String saDrThisTourExS;
		String saDrPastTourExS;
		String saDrLastYearExS;
		String drHourThisBotExS;
		String drHourSameDrTrExS;
		String drHourAnyBotExS;
		String opRoleExS;
		String saOpThisTourExS;
		String saOpPastTourExS;
		String saOpLastYearExS;
		String opHourThisBotExS;
		String opHourAnyBotExS;
		String isAdultExS;
		String timeDriveCoachExS;
		String humHoursPracitceExS;
		System.out.println("Boop 7");
		try {
			new FileWriter("MainDriveTeamDataFiles.txt", false).close();
			System.out.println("Boop 8");
			for(int i = 0; i < fileDTD.listOfDriveTeamData.size(); i++) {
				teamNumEx = fileDTD.listOfDriveTeamData.get(i).getTeamNum();
				saDrThisTourEx = fileDTD.listOfDriveTeamData.get(i).getSaDrThisTour();
				saDrPastTourEx = fileDTD.listOfDriveTeamData.get(i).getSaDrPastTour();
				saDrLastYearExEx = fileDTD.listOfDriveTeamData.get(i).getSaDrLastYear();
				drHourThisBotEx = fileDTD.listOfDriveTeamData.get(i).getDrHourThisBot();
				drHourSameDrTrEx = fileDTD.listOfDriveTeamData.get(i).getDrHourSameDrTr();
				drHourAnyBotEx = fileDTD.listOfDriveTeamData.get(i).getDrHourAnyBot();
				opRoleExS = fileDTD.listOfDriveTeamData.get(i).getOpRole();
				saOpThisTourEx = fileDTD.listOfDriveTeamData.get(i).getSaOpThisTour();
				saOpPastTourEx = fileDTD.listOfDriveTeamData.get(i).getSaOpPastTour();
				saOpLastYearEx = fileDTD.listOfDriveTeamData.get(i).getSaOpLastYear();
				opHourThisBotEx = fileDTD.listOfDriveTeamData.get(i).getOpHourThisBot();
				opHourAnyBotEx = fileDTD.listOfDriveTeamData.get(i).getOpHourAnyBot();
				isAdultEx = fileDTD.listOfDriveTeamData.get(i).getIsAdult();
				timeDriveCoachExS = fileDTD.listOfDriveTeamData.get(i).getTimeDriveCoach();
				humHoursPracitceEx = fileDTD.listOfDriveTeamData.get(i).getHumHoursPracitce();
				System.out.println("Boop 9");
				teamNumExS = Integer.toString(teamNumEx);
				saDrThisTourExS = Boolean.toString(saDrThisTourEx);
				saDrPastTourExS = Boolean.toString(saDrPastTourEx);
				saDrLastYearExS = Boolean.toString(saDrLastYearExEx);
				drHourThisBotExS = Integer.toString(drHourThisBotEx);
				drHourSameDrTrExS = Integer.toString(drHourSameDrTrEx);
				drHourAnyBotExS = Integer.toString(drHourAnyBotEx);
				saOpThisTourExS = Boolean.toString(saOpThisTourEx);
				saOpPastTourExS = Boolean.toString(saOpPastTourEx);
				saOpLastYearExS = Boolean.toString(saDrLastYearExEx);
				opHourThisBotExS = Integer.toString(opHourThisBotEx);
				opHourAnyBotExS = Integer.toString(opHourAnyBotEx);
				isAdultExS = Boolean.toString(isAdultEx);
				humHoursPracitceExS = Integer.toString(humHoursPracitceEx);
				System.out.println("Boop 10" + humHoursPracitceExS);
				FileWriter fw;
				fw = new FileWriter("MainDriveTeamDataFiles.txt", true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw);
				System.out.println("Boop 11");
				out.println(teamNumExS);
				out.println(saDrThisTourExS);
				out.println(saDrPastTourExS);
				out.println(saDrLastYearExS);
				out.println(drHourThisBotExS);
				out.println(drHourSameDrTrExS);
				out.println(drHourAnyBotExS);
				out.println(opRoleExS);
				out.println(saOpThisTourExS);
				out.println(saOpPastTourExS);
				out.println(saOpLastYearExS);
				out.println(opHourThisBotExS);
				out.println(opHourAnyBotExS);
				out.println(isAdultExS);
				out.println(timeDriveCoachExS);
				out.println(humHoursPracitceExS);
				System.out.println("Boop 12");
				out.close();
			}
		} catch (IOException e) {
			System.out.println("Error" + e);
		}
		System.out.println("Boop 13");
	}
	
	@Override
	public void handle(ActionEvent event) {
		try {
			if(event.getSource() == goForReplaceB) {
				fileDTD.listOfDriveTeamData.clear();
				openDTDFile();
			}
			if(event.getSource() == goForAddB) {
				openDTDFile();			
			}
			if(event.getSource() == submitReB) {
				System.out.println("Boop0");
				readInDTDFile();
				System.out.println("Boop 6");
				exportDTDData();
				System.out.println("Boop 14");
			}
			if(event.getSource() == submitAddB) {
				readInDTDFile();
				exportDTDData();
			}
		}catch(Exception e) {
			System.out.println("Error:  " + e);
		}
	}
}
