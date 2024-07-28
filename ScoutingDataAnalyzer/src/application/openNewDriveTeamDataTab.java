package application;

import java.io.File;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
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
		this.add(new Label("Open New Data That Will Replace All Drive Team Data"), 0, 0);
		this.add(new Label("Choosen File Name"), 0, 1);
		fileNameReTF = new TextField();
		this.add(fileNameReTF, 1, 1);
		this.add(new Label("Open New Data That Will Start Or Add On To Current Drive Team Data"), 0, 2);
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
			
			fileDTD.addDriveTeamData(teamNum, saDrThisTour, saDrPastTour, saDrLastYear, drHourThisBot, drHourSameDrTr, drHourAnyBot, opRoleSTrue, saOpThisTour, saOpPastTour, saOpLastYear, opHourThisBot, opHourAnyBot, isAdult, timeDriveCoachSTrue, humHoursPracitce);
		}
	}
	
	public void exportDTDData() {
		
	}
	
	@Override
	public void handle(ActionEvent event) {
		try {
			if(event.getSource() == goForReplaceB) {
				//clear list of Drive Team data
				openDTDFile();
			}
			if(event.getSource() == goForAddB) {
				openDTDFile();			
			}
			if(event.getSource() == submitReB) {
				System.out.println("Boop0");
				readInDTDFile();
				exportDTDData();
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
