package application;
	
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.FileChooser;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.image.Image;


public class Main extends Application implements EventHandler<ActionEvent>{
	//boop
	// Looking Up Data Menu Items
	private MenuItem searchTeamsMI;
	private MenuItem searchAllianceMI;
	private MenuItem searchAutosMI;
	private MenuItem searchMatchMI;
	private MenuItem compareTeamsMI;
	private MenuItem compareAllianceMI;
	private MenuItem compareAutosMI;
	private MenuItem compareMatchMI;
	private MenuItem findBestTeamMI;
	private MenuItem findBestAllianceMI;
	private MenuItem findBestAutoMI;
	private MenuItem findBestStatMI;
	private MenuItem findBestRobotArchetypeMI;
	// Using Data Menu Items
	private MenuItem createAllianceMI;
	private MenuItem createMatchMI;
	private MenuItem createAutoplanMI;
	private MenuItem createMacthPlanMI;
	//Data Menu Items
	private MenuItem setPlayOffAlliancesMI;
	private MenuItem editPlayOffAlliancesMI;
	private MenuItem deletePlayOffAlliancesMI;
	private MenuItem openNewScDataMI;
	private MenuItem openNewPitDataMI;
	private MenuItem openNewDriveTeamDataMI;
	private MenuItem openNewDriveTeamComsMI;
	private MenuItem editScDataMI;
	private MenuItem editPitDataMI;
	private MenuItem editDriveTeamDataMI;
	private MenuItem editDriveTeamComsMI;
	private MenuItem exportPitDataMI;
	private MenuItem exportScDataMI;
	private MenuItem exportDriveTeamDataMI;
	private MenuItem exportDriveTeamComsMI;
	private TabPane mainTP;
	//Home page Menu Item
	private MenuItem homePageMI;
	//Adding list of stuff
	private TempTeamList mainTempTeamList;
	private TeamList mainTeamList;
	// adding save data files stuff
	private Button saveDataB;
	private Scanner fileInput;
	private Scanner fileInputP;
	private Scanner fileInputDTD;
	private Scanner fileInputDTC;
	private Scanner fileInputPlay;
	private Label savedDataL;
	private Label savedPlayoffL;
	private int timesSavedD = 0;
	private int timesSavedPlay = 0;
	//
	private List<Integer> listOfTeamNums;
	private List<Integer> listOfTeamNumsSorted;
	//Pit data stuff
	private TeamPitsList fileTPL;
	//Drive team Data stuff
	private DriveTeamDataList fileDTDL;
	//Drive team Comments Stuff
	private DriveTeamCommentsList fileDTCL;
	// Auto Stuff
	private AutoList fileAL;
	private AutoList theAutoList;
	private AutoList thePitAutoList;
	//playoff Alliances stuff
	PlayoffAlliances thePOA;
	private Button savePlayoffB;
	//main MatchList
	private MatchList mainMatchList;
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,1400,800);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//adding menu bar
			MenuBar MB = createMenuBar();
			mainTempTeamList = new TempTeamList();
			mainTeamList = new TeamList();
			fileTPL = new TeamPitsList();
			fileDTDL = new DriveTeamDataList();
			fileDTCL = new DriveTeamCommentsList();
			fileAL = new AutoList();
			thePOA = new PlayoffAlliances();
			theAutoList = new AutoList();
			thePitAutoList = new AutoList();
			mainMatchList = new MatchList();
			root.setTop(MB);
			//adding the Tab panes
			mainTP = new TabPane();
			mainTP.setMinSize(1400, 600);
			root.setBottom(mainTP);
			//adding save files stuff
			saveDataB = new Button("Save All Data");
			saveDataB.setOnAction(this);
			savePlayoffB = new Button("Save PlayOff Alliances");
			savePlayoffB.setOnAction(this);
			savedDataL = new Label("Saved Data");
			savedPlayoffL = new Label("Saved Playoff Allinces");
			savedDataL.setId("saveDL0");
			savedPlayoffL.setId("savePlayL0");
			VBox saveDataVB = new VBox(5);
			saveDataVB.getChildren().addAll(saveDataB, savedDataL);
			saveDataVB.setId("saveDVB");
			saveDataVB.setAlignment(Pos.CENTER);
			VBox savePlayoffVB = new VBox(5);
			savePlayoffVB.getChildren().addAll(savePlayoffB, savedPlayoffL);
			savePlayoffVB.setId("savePlayVB");
			savePlayoffVB.setAlignment(Pos.CENTER);
			HBox saveHBox = new HBox(10);
			saveHBox.getChildren().addAll(saveDataVB, savePlayoffVB);
			saveHBox.setAlignment(Pos.CENTER);
			root.setCenter(saveHBox);
			//background stuff
			FileInputStream input = new FileInputStream("BackgroundV4.png"); 
            Image image = new Image(input); 
            BackgroundImage backgroundimage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
            // create Background 
            Background background = new Background(backgroundimage);
			root.setBackground(background);
			
			//
			listOfTeamNums = new ArrayList<Integer>();
			listOfTeamNumsSorted = new ArrayList<Integer>();
			// adding css file stuff
			scene.getStylesheets().add(getClass().getResource("ScoutingDataAnalyzercssFile.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private MenuBar createMenuBar() {
		// Creating the Menu Bar
		MenuBar mB = new MenuBar();
		mB.getStyleClass().add("menu-bar");
		// Creating the Menus
		Menu homePageMenu = new Menu("Home");
		Menu searchMenu = new Menu("Search:");
		Menu compareMenu = new Menu("Compare:");
		Menu findBestMenu = new Menu("Find The Best:");
		Menu createMenu = new Menu("Create:");
		Menu playOffMenu = new Menu("Playoff Alliances");
		Menu openMenu = new Menu("Open Data");
		Menu editMenu = new Menu("Edit Data");
		Menu exportMenu = new Menu("Export Data");
		// Creating the Menu Items
		//home page
		homePageMI = new MenuItem("Home");
		homePageMI.setOnAction(this);
		//search stuff
		searchTeamsMI = new MenuItem("Teams");
		searchTeamsMI.setOnAction(this);
		searchAllianceMI = new MenuItem("Alliances");
		searchAllianceMI.setOnAction(this);
		searchAutosMI = new MenuItem("Autos");
		searchAutosMI.setOnAction(this);
		searchMatchMI = new MenuItem("Match");
		searchMatchMI.setOnAction(this);
		//compare stuff
		compareTeamsMI = new MenuItem("Teams");
		compareTeamsMI.setOnAction(this);
		compareAllianceMI = new MenuItem("Alliances");
		compareAllianceMI.setOnAction(this);
		compareAutosMI = new MenuItem("Autos");
		compareAutosMI.setOnAction(this);
		compareMatchMI = new MenuItem("Match");
		compareMatchMI.setOnAction(this);
		//find best stuff
		findBestTeamMI = new MenuItem("Team");
		findBestTeamMI.setOnAction(this);
		findBestAllianceMI = new MenuItem("Alliance");
		findBestAllianceMI.setOnAction(this);
		findBestAutoMI = new MenuItem("Auto");
		findBestAutoMI.setOnAction(this);
		findBestStatMI = new MenuItem("Stat");
		findBestStatMI.setOnAction(this);
		findBestRobotArchetypeMI = new MenuItem("Robot Archetype");
		findBestRobotArchetypeMI.setOnAction(this);
		//create stuff
		createAllianceMI = new MenuItem("Alliance");
		createAllianceMI.setOnAction(this);
		createMatchMI = new MenuItem("Match");
		createMatchMI.setOnAction(this);
		createAutoplanMI = new MenuItem("Auto Plan");
		createAutoplanMI.setOnAction(this);
		createMacthPlanMI = new MenuItem("Macth Plan");
		createMacthPlanMI.setOnAction(this);
		// Playoff Alliances
		setPlayOffAlliancesMI= new MenuItem("Set");
		setPlayOffAlliancesMI.setOnAction(this);
		editPlayOffAlliancesMI = new MenuItem("Edit");
		editPlayOffAlliancesMI.setOnAction(this);
		deletePlayOffAlliancesMI = new MenuItem("Delete");
		deletePlayOffAlliancesMI.setOnAction(this);
		//open stuff
		openNewScDataMI = new MenuItem("Scouting Data");
		openNewScDataMI.setOnAction(this);
		openNewPitDataMI = new MenuItem("Pit Data");
		openNewPitDataMI.setOnAction(this);
		openNewDriveTeamDataMI = new MenuItem("Drive Team Data");
		openNewDriveTeamDataMI.setOnAction(this);
		openNewDriveTeamComsMI = new MenuItem("Drive Team Comments");
		openNewDriveTeamComsMI.setOnAction(this);
		//edit stuff
		editScDataMI = new MenuItem("Scouting Data");
		editScDataMI.setOnAction(this);
		editPitDataMI = new MenuItem("Pit Data");
		editPitDataMI.setOnAction(this);
		editDriveTeamDataMI = new MenuItem("Drive Team Data");
		editDriveTeamDataMI.setOnAction(this);
		editDriveTeamComsMI = new MenuItem("Drive Team Comments");
		editDriveTeamComsMI.setOnAction(this);
		//export stuff
		exportScDataMI = new MenuItem("Scouting Data");
		exportScDataMI.setOnAction(this);
		exportPitDataMI = new MenuItem("Pit Data");
		exportPitDataMI.setOnAction(this);
		exportDriveTeamDataMI = new MenuItem("Drive Team Data");
		exportDriveTeamDataMI.setOnAction(this);
		exportDriveTeamComsMI = new MenuItem("Drive Team Comments");
		exportDriveTeamComsMI.setOnAction(this);
		//Adding Menu Items to their Menus
		homePageMenu.getItems().addAll(homePageMI);
		searchMenu.getItems().addAll(searchTeamsMI, searchAutosMI, searchAllianceMI, searchMatchMI);
		compareMenu.getItems().addAll(compareTeamsMI, compareAllianceMI, compareAutosMI, compareMatchMI);
		findBestMenu.getItems().addAll(findBestTeamMI, findBestAllianceMI, findBestAutoMI, findBestStatMI, findBestRobotArchetypeMI);
		createMenu.getItems().addAll(createAllianceMI, createMatchMI, createAutoplanMI, createMacthPlanMI);
		playOffMenu.getItems().addAll(setPlayOffAlliancesMI, editPlayOffAlliancesMI, deletePlayOffAlliancesMI);
		openMenu.getItems().addAll(openNewScDataMI, openNewPitDataMI, openNewDriveTeamDataMI, openNewDriveTeamComsMI);
		editMenu.getItems().addAll(editScDataMI, editPitDataMI, editDriveTeamDataMI, editDriveTeamComsMI);
		exportMenu.getItems().addAll(exportScDataMI, exportPitDataMI, exportDriveTeamDataMI, exportDriveTeamComsMI);
		//Adding Menu Items to the Menu Bar
		mB.getMenus().addAll(homePageMenu, searchMenu, compareMenu, findBestMenu, createMenu, playOffMenu, openMenu, editMenu, exportMenu);
		return mB;
	}
	
	private void updateDataList() {
		System.out.println("Boop20");
		File file = new File("MainScoutingDataFiles.txt");
		System.out.println("Boop21");
		try {
			fileInput = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("Error" + e);
		}
		System.out.println("Boop22");
		mainTeamList.listOfTeams.clear();
		String fileTeamNumS = "0";
		String fileAmpS = null;
		String fileSpeS;
		String fileTrapS;
		String fileClimbS;
		String fileMatchesS;
		String fileTotalCyclesS;
		String fileTotalAmpS;
		String fileTotalSpeS;
		String fileTotalTrapS;
		String fileCyclesS;
		String fileNumOfCommsS;
		String fileHumAmpSkillS;
		String fileHumScoSkillS;
		String fileHumAmpNotesS;
		String fileTimesHumAmpS;
		String fileTimesHumScoS;
		int fileTeamNum;
		int fileTotalCycles;
		int fileTotalAmp;
		int fileTotalSpe;
		int fileTotalTrap;
		double fileAmp;
		double fileSpe;
		double fileTrap;
		double fileClimb;
		int fileMatches;
		double fileCycles;
		double fileNumOfComms;
		double fileHumAmpSkill;
		double fileHumScoSkill;
		double fileHumAmpNotes;
		int fileTimesHumAmp;
		int fileTimesHumSco;
		List<String> commentList = new ArrayList<>();
		List<String> fileHumPostionsList = new ArrayList<>();
		System.out.println("Boop23");
		while(fileInput.hasNext() == true) {
			fileTeamNumS = fileInput.next();
			fileMatchesS  = fileInput.next();
			fileTotalCyclesS = fileInput.next();
			fileTotalAmpS = fileInput.next();
			fileTotalSpeS = fileInput.next();
			fileTotalTrapS = fileInput.next();
			fileCyclesS = fileInput.next();
			fileAmpS = fileInput.next();
			fileSpeS = fileInput.next();
			fileTrapS = fileInput.next();
			fileClimbS = fileInput.next();
			fileNumOfCommsS = fileInput.next();
			fileNumOfComms = Integer.parseInt(fileNumOfCommsS);
			for(int i = 0; i < fileNumOfComms; i++) {
				commentList.add(fileInput.next());
			}
			System.out.println("Boop24");
			fileMatches = Integer.parseInt(fileMatchesS);
			String posListSizeS = fileInput.next();
			int posListSize = Integer.parseInt(posListSizeS);
			System.out.println("Boop24.1 " + fileMatchesS + "" + fileMatches);
			for(int i = 0; i < posListSize; i++) {
				String pos = fileInput.next();
				System.out.println("Boop24.2 " + pos);
				fileHumPostionsList.add(pos);
			}
			System.out.println("Boop25");
			fileHumAmpSkillS = fileInput.next();
			fileHumScoSkillS = fileInput.next();
			fileHumAmpNotesS = fileInput.next();
			fileTimesHumAmpS = fileInput.next();
			fileTimesHumScoS = fileInput.next();
			System.out.println("Boop26");
			fileTeamNum = Integer.parseInt(fileTeamNumS);
			//Matches Sutff
			MatchList fileMatchList = new MatchList();
			String TotalMsS = fileInput.next();
			int TotalMs = Integer.parseInt(TotalMsS);
			for (int i = 0; i < TotalMs; i++) {
				String MTeamNumS = fileInput.next();
		    	String MMatchNumS = fileInput.next();
		    	String MIsPracS = fileInput.next();
		    	String MAllColorS = fileInput.next();
		    	String MIsReplayS = fileInput.next();
		    	String MAmpS = fileInput.next();
		    	String MSpeS = fileInput.next();
		    	String MTrapS = fileInput.next();
		    	String MClimbS = fileInput.next();
		    	String MHumPosS = fileInput.next();
		    	String MAmpSkillS = fileInput.next();
		    	String MScoSkillS = fileInput.next();
		    	String MAmpNotesS = fileInput.next();
		    	String MCommentS = fileInput.next();
		    	int MTeamNum = Integer.parseInt(MTeamNumS);
		    	int MMatchNum = Integer.parseInt(MMatchNumS);
		    	int MAmp = Integer.parseInt(MAmpS);
		    	int MSpe = Integer.parseInt(MSpeS);
		    	int MTrap = Integer.parseInt(MTrapS);
		    	int MClimb = Integer.parseInt(MClimbS);
		    	int MAmpSkill = Integer.parseInt(MAmpSkillS);
		    	int MScoSkill = Integer.parseInt(MScoSkillS);
		    	int MAmpNotes = Integer.parseInt(MAmpNotesS);
		    	Boolean MAllColor = Boolean.parseBoolean(MAllColorS);
		    	Boolean MIsPrac = Boolean.parseBoolean(MIsPracS);
		    	Boolean MIsReplay = Boolean.parseBoolean(MIsReplayS);
		    	String autoStartPosS = fileInput.next();
				String autoANControlS = fileInput.next();
				String autoASpeckerS = fileInput.next();
				String autoAAmpS = fileInput.next();
				String autoNControlS = fileInput.next();
				String autoSpeckerS = fileInput.next();
				String autoAmpS = fileInput.next();
				int autoStartPos = Integer.parseInt(autoStartPosS);
				int autoANControl = Integer.parseInt(autoANControlS);
				int autoASpecker = Integer.parseInt(autoASpeckerS);
				int autoAAmp = Integer.parseInt(autoAAmpS);
				int autoNControl = Integer.parseInt(autoNControlS);
				int autoSpecker = Integer.parseInt(autoSpeckerS);
				int autoAmp = Integer.parseInt(autoAmpS);
				System.out.println("Boop26.3" + autoANControl);
				AutoAttempt fileAuto = new AutoAttempt(fileTeamNum, MMatchNum, autoStartPos, autoANControl, autoASpecker, autoAAmp, autoNControl, autoSpecker, autoAmp);
		    	Match fileMatch = new Match(MTeamNum, MMatchNum, MAmp, MSpe, MTrap, MClimb, MHumPosS, MAmpSkill, MScoSkill, MAmpNotes, MCommentS, fileAuto, MAllColor, MIsPrac, MIsReplay);
		    	fileMatchList.addPreMadeMatch(fileMatch);
		    	mainMatchList.addPreMadeMatch(fileMatch);
			}
			
			
			fileTotalCycles = Integer.parseInt(fileTotalCyclesS);
			fileTotalAmp = Integer.parseInt(fileTotalAmpS);
			fileTotalSpe = Integer.parseInt(fileTotalSpeS);
			fileTotalTrap = Integer.parseInt(fileTotalTrapS);
			System.out.println("Boop26.5" + fileTotalCycles + fileTotalAmp + fileTotalSpe + fileTotalTrap);
			fileAmp = Double.parseDouble(fileAmpS);
			fileSpe = Double.parseDouble(fileSpeS);
			fileTrap = Double.parseDouble(fileTrapS);
			fileClimb = Double.parseDouble(fileClimbS);
			fileMatches  = Integer.parseInt(fileMatchesS);
			fileCycles  = Double.parseDouble(fileCyclesS);
			System.out.println("Boop26.5");
			fileHumAmpSkill = Double.parseDouble(fileHumAmpSkillS);
			System.out.println("Boop26.6" + fileHumAmpSkill);
			fileHumScoSkill = Double.parseDouble(fileHumScoSkillS);
			System.out.println("Boop26.7");
			fileHumAmpNotes = Double.parseDouble(fileHumAmpNotesS);
			System.out.println("Boop26.8");
			fileTimesHumAmp = Integer.parseInt(fileTimesHumAmpS);
			System.out.println("Boop26.9");
			fileTimesHumSco = Integer.parseInt(fileTimesHumScoS);
			System.out.println("Boop27");
			listOfTeamNums.add(fileTeamNum);
			System.out.println("Boop28");
			AutoList aAL = new AutoList();
			if(fileTPL != null) {
				if(fileTPL.getATeamPit(fileTeamNum) != null) {
					for(int i = 0; i < fileMatchList.listOfMatches.size(); i++) {
						int fileStartPos = fileMatchList.listOfMatches.get(i).getTheAA().getAutoStartPos();
						int fileAControl = fileMatchList.listOfMatches.get(i).getTheAA().getAutoANControl();
						int fileAAutoSpe = fileMatchList.listOfMatches.get(i).getTheAA().getAutoASpecker();
						int fileAutoSpeaker = fileMatchList.listOfMatches.get(i).getTheAA().getAutoSpecker();
						int fileAutoAmp = fileMatchList.listOfMatches.get(i).getTheAA().getAutoAmp();
						int fileAutoControl = fileMatchList.listOfMatches.get(i).getTheAA().getAutoNControl();
						if(aAL.getAnAuto(fileTeamNum, fileStartPos, fileAControl, fileAAutoSpe) != null) {
							aAL.getAnAuto(fileTeamNum, fileStartPos, fileAControl, fileAAutoSpe).submitAnUse(fileAutoSpeaker, fileAutoAmp, fileAutoControl);;
						} else {
							System.out.println("Boop30" + fileAControl);
							Auto theA = fileTPL.getMasterPitAutoList().getAnAuto(fileTeamNum, fileStartPos, fileAControl, fileAAutoSpe);
							System.out.println("Boop31");
							theA.submitAnUse(fileAutoSpeaker, fileAutoAmp, fileAutoControl);
							System.out.println("Boop32Boop");
							aAL.listOfAutos.add(theA);
							theAutoList.listOfAutos.add(theA);
							System.out.println(theA);
							System.out.println("Boop33");
						}
					}
				}
			}
			mainTeamList.addTempTeamInMain(fileTeamNum, fileTotalCycles, fileTotalAmp, fileTotalSpe, fileTotalTrap, fileCycles, fileMatches, fileAmp, fileSpe, fileTrap, fileClimb, commentList, fileHumPostionsList, fileHumAmpSkill, fileHumScoSkill, fileHumAmpNotes, fileTimesHumAmp, fileTimesHumSco, fileMatchList, aAL);
			System.out.println("Boop29");
		}
		sortListOfTeamNums();
	}
	private void updatePitData() {
		System.out.println("Boop boop");
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
		int teamNum;
		int numOfStud;
		int numOfMent;
		int numOfRobotBat;
		int numOfVisCam;
		int numOfDriverCams;
		//auto Stuff 
		String numOfAutosS;
		int numOfAutos;
		String autoStartPosS;
		String totalControlS;
		String totalSpeckerS;
		String totalAmpS;
		String numCenNotesS;
		int autoStartPos;
		int totalControl;
		int totalSpecker;
		int totalAmp;
		int numCenNotes;
		File file = new File("MainPitDataFiles.txt");
		try {
			fileInputP = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("Error" + e);
		}
		System.out.println("Boop boop1");
		while(fileInputP.hasNext() == true) {
			fileAL.listOfAutos.clear();
			System.out.println("Boop boop2");
			teamNumS = fileInputP.next();
			teamNameS = fileInputP.next();
			numOfStudS = fileInputP.next();
			numOfMentS = fileInputP.next();
			numOfRobotBatS = fileInputP.next();
			programLanS = fileInputP.next();
			doHaveVisS = fileInputP.next();
			numOfVisCamS = fileInputP.next();
			numOfDriverCamsS = fileInputP.next();
			drTrTypeS = fileInputP.next();
			swevTypeS = fileInputP.next();
			swevGearingS = fileInputP.next();
			drTrMotorTypeS = fileInputP.next();
			System.out.println("Boop boop3");
			teamNum = Integer.parseInt(teamNumS);
			System.out.println("Boop boop3.1");
			numOfStud = Integer.parseInt(numOfStudS);
			System.out.println("Boop boop3.2");
			numOfMent = Integer.parseInt(numOfMentS);
			System.out.println("Boop boop3.3");
			numOfRobotBat = Integer.parseInt(numOfRobotBatS);
			System.out.println("Boop boop3.4");
			numOfVisCam = Integer.parseInt(numOfVisCamS);
			System.out.println("Boop boop3.5");
			numOfDriverCams = Integer.parseInt(numOfDriverCamsS);
			System.out.println("Boop boop3.6");
			//auto stuff
			numOfAutosS = fileInputP.next();
			numOfAutos = Integer.parseInt(numOfAutosS);
			System.out.println("Boop boop4");
			for(int i = 0; i < numOfAutos; i++) {
				System.out.println("Boop boop5");
				autoStartPosS = fileInputP.next();
				totalControlS = fileInputP.next();
				totalSpeckerS = fileInputP.next();
				totalAmpS = fileInputP.next();
				numCenNotesS = fileInputP.next();
				autoStartPos = Integer.parseInt(autoStartPosS);
				totalControl = Integer.parseInt(totalControlS);
				totalSpecker = Integer.parseInt(totalSpeckerS);
				totalAmp = Integer.parseInt(totalAmpS);
				numCenNotes = Integer.parseInt(numCenNotesS);
				fileAL.addPitAuto(teamNum, autoStartPos, totalControl, totalSpecker, totalAmp, numCenNotes);
				thePitAutoList.addPitAuto(teamNum, autoStartPos, totalControl, totalSpecker, totalAmp, numCenNotes);
				System.out.println("Boop boop6");
			}
			
			fileTPL.addTeamPit(teamNum, teamNameS, numOfStud, numOfMent, numOfRobotBat, programLanS, doHaveVisS, numOfVisCam, numOfDriverCams, drTrTypeS, swevTypeS, swevGearingS, drTrMotorTypeS, fileAL);
			System.out.println("Boop" + fileTPL.toString());
			System.out.println("Boop" + teamNum);
		}
		System.out.println("Boop");
		fileTPL.setMasterPitAutoList(thePitAutoList);
	}
	
	private void updateDriveTeamDataList() {
		System.out.println("BoopDTDM1");
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
		System.out.println("BoopDTDM2");
		File file = new File("MainDriveTeamDataFiles.txt");
		try {
			fileInputDTD = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("Error" + e);
		}
		System.out.println("BoopDTDM3");
		while(fileInputDTD.hasNext() == true) {
			System.out.println("BoopDTDM4");
			teamNumS = fileInputDTD.next();
			System.out.println("BoopDTDM4.1");
			saDrThisTourS = fileInputDTD.next();
			saDrPastTourS = fileInputDTD.next();
			saDrLastYearS = fileInputDTD.next();
			System.out.println("BoopDTDM4.25");
			drHourThisBotS = fileInputDTD.next();
			drHourSameDrTrS = fileInputDTD.next();
			drHourAnyBotS = fileInputDTD.next();
			System.out.println("BoopDTDM4.5");
			opRoleS = fileInputDTD.next();
			System.out.println("BoopDTDM4.6");
			saOpThisTourS = fileInputDTD.next();
			saOpPastTourS = fileInputDTD.next();
			saOpLastYearS = fileInputDTD.next();
			opHourThisBotS = fileInputDTD.next();
			opHourAnyBotS = fileInputDTD.next();
			isAdultS = fileInputDTD.next();
			timeDriveCoachS = fileInputDTD.next();
			humHoursPracitceS = fileInputDTD.next();
			System.out.println("BoopDTDM5");
			teamNum = Integer.parseInt(teamNumS);
			saDrThisTour = Boolean.parseBoolean(saDrThisTourS);
			saDrPastTour = Boolean.parseBoolean(saDrPastTourS);
			saDrLastYear = Boolean.parseBoolean(saDrLastYearS);
			drHourThisBot = Integer.parseInt(drHourThisBotS);
			drHourSameDrTr = Integer.parseInt(drHourSameDrTrS);
			drHourAnyBot = Integer.parseInt(drHourAnyBotS);
			saOpThisTour = Boolean.parseBoolean(saOpThisTourS);
			saOpPastTour = Boolean.parseBoolean(saOpPastTourS);
			saOpLastYear = Boolean.parseBoolean(saOpLastYearS);
			opHourThisBot = Integer.parseInt(opHourThisBotS);
			opHourAnyBot = Integer.parseInt(opHourAnyBotS);
			isAdult = Boolean.parseBoolean(isAdultS);
			humHoursPracitce = Integer.parseInt(humHoursPracitceS);
			System.out.println("BoopDTDM6");
			fileDTDL.addDriveTeamData(teamNum, saDrThisTour, saDrPastTour, saDrLastYear, drHourThisBot, drHourSameDrTr, drHourAnyBot, opRoleS, saOpThisTour, saOpPastTour, saOpLastYear, opHourThisBot, opHourAnyBot, isAdult, timeDriveCoachS, humHoursPracitce);
		}
		if(fileDTDL == null) {
			System.out.println("BoopBoop!!!!!");
		}
	}
	
	private void updateDriveTeamCommentsList() {
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
		System.out.println("Boop DTC 0");
		File file = new File("MainDriveTeamCommentsFile.txt");
		System.out.println("Boop DTC 0.1");
		try {
			System.out.println("Boop DTC 0.2");
			fileInputDTC = new Scanner(file);
			System.out.println("Boop DTC 0.3");
		} catch (FileNotFoundException e) {
			System.out.println("Error" + e);
		}
		System.out.println("Boop DTC 0.4");
		while(fileInputDTC.hasNext() == true) {
			System.out.println("Boop DTC 1");
			teamNumS = fileInputDTC.next();
			matchS = fileInputDTC.next();
			yellLevelS = fileInputDTC.next();
			controlLevelS = fileInputDTC.next();
			physicalLevelS = fileInputDTC.next();
			discrimLevelS = fileInputDTC.next();
			System.out.println("Boop DTC 2");
			discrimTypeS = fileInputDTC.next();
			otherBLevelS = fileInputDTC.next();
			totalBLevelS = fileInputDTC.next();
			funLevelS = fileInputDTC.next();
			strategyLevelS = fileInputDTC.next();
			otherGLevelS = fileInputDTC.next();
			commentsS = fileInputDTC.next();
			System.out.println("Boop DTC 3");
			teamNum = Integer.parseInt(teamNumS);
			match = Integer.parseInt(matchS);
			yellLevel = Integer.parseInt(yellLevelS);
			controlLevel = Integer.parseInt(controlLevelS);
			physicalLevel = Integer.parseInt(physicalLevelS);
			discrimLevel = Integer.parseInt(discrimLevelS);
			otherBLevel = Integer.parseInt(otherBLevelS);
			totalBLevel = Integer.parseInt(totalBLevelS);
			funLevel = Integer.parseInt(funLevelS);
			strategyLevel = Integer.parseInt(strategyLevelS);
			otherGLevel = Integer.parseInt(otherGLevelS);
			System.out.println("Boop DTC 4");
			fileDTCL.addDriveTeamComments(teamNum, match, yellLevel, controlLevel, physicalLevel, discrimLevel, discrimTypeS, otherBLevel, totalBLevel, funLevel, strategyLevel, otherGLevel, commentsS);
			System.out.println("Boop DTC 5");
		}
		if(fileDTCL == null) {
			System.out.println("BoopBoopDTC!!!!!");
		}
	}
	
	private void updatePlayoffList() {
		System.out.println("BoopPlay0");
		File file = new File("PlayAlliancesFile.txt");
		System.out.println("BoopPlay1");
		try {
			fileInputPlay = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("Error" + e);
		}
		System.out.println("BoopPlay2");
		String team1S;
		String team2S;
		String team3S;
		String team4S;
		String team5S;
		String team6S;
		String team7S;
		String team8S;
		String team9S;
		String team10S;
		String team11S;
		String team12S;
		String team13S;
		String team14S;
		String team15S;
		String team16S;
		String team17S;
		String team18S;
		String team19S;
		String team20S;
		String team21S;
		String team22S;
		String team23S;
		String team24S;
		String team25S;
		String team26S;
		String team27S;
		String team28S;
		String team29S;
		String team30S;
		String team31S;
		String team32S;
		int team1;
		int team2;
		int team3;
		int team4;
		int team5;
		int team6;
		int team7;
		int team8;
		int team9;
		int team10;
		int team11;
		int team12;
		int team13;
		int team14;
		int team15;
		int team16;
		int team17;
		int team18;
		int team19;
		int team20;
		int team21;
		int team22;
		int team23;
		int team24;
		int team25;
		int team26;
		int team27;
		int team28;
		int team29;
		int team30;
		int team31;
		int team32;
		Team team1T = null;
		Team team2T = null;
		Team team3T = null;
		Team team4T = null;
		Team team5T = null;
		Team team6T = null;
		Team team7T = null;
		Team team8T = null;
		Team team9T = null;
		Team team10T = null;
		Team team11T = null;
		Team team12T = null;
		Team team13T = null;
		Team team14T = null;
		Team team15T = null;
		Team team16T = null;
		Team team17T = null;
		Team team18T = null;
		Team team19T = null;
		Team team20T = null;
		Team team21T = null;
		Team team22T = null;
		Team team23T = null;
		Team team24T = null;
		Team team25T = null;
		Team team26T = null;
		Team team27T = null;
		Team team28T = null;
		Team team29T = null;
		Team team30T = null;
		Team team31T = null;
		Team team32T = null;
		int teamsOnA1 = 0;
		int teamsOnA2 = 0;
		int teamsOnA3 = 0;
		int teamsOnA4 = 0;
		int teamsOnA5 = 0;
		int teamsOnA6 = 0;
		int teamsOnA7 = 0;
		int teamsOnA8 = 0;
		System.out.println("BoopPlay3");
		System.out.println("BoopPlay4");
		team1S = fileInputPlay.next();
		team2S = fileInputPlay.next();
		team3S = fileInputPlay.next();
		team4S = fileInputPlay.next();
		team5S = fileInputPlay.next();
		team6S = fileInputPlay.next();
		team7S = fileInputPlay.next();
		team8S = fileInputPlay.next();
		team9S = fileInputPlay.next();
		team10S = fileInputPlay.next();
		team11S = fileInputPlay.next();
		team12S = fileInputPlay.next();
		team13S = fileInputPlay.next();
		team14S = fileInputPlay.next();
		team15S = fileInputPlay.next();
		team16S = fileInputPlay.next();
		team17S = fileInputPlay.next();
		team18S = fileInputPlay.next();
		team19S = fileInputPlay.next();
		team20S = fileInputPlay.next();
		team21S = fileInputPlay.next();
		team22S = fileInputPlay.next();
		team23S = fileInputPlay.next();
		team24S = fileInputPlay.next();
		team25S = fileInputPlay.next();
		team26S = fileInputPlay.next();
		team27S = fileInputPlay.next();
		team28S = fileInputPlay.next();
		team29S = fileInputPlay.next();
		team30S = fileInputPlay.next();
		team31S = fileInputPlay.next();
		team32S = fileInputPlay.next();
		team1 = Integer.parseInt(team1S);
		team2 = Integer.parseInt(team2S);
		team3 = Integer.parseInt(team3S);
		team4 = Integer.parseInt(team4S);
		team5 = Integer.parseInt(team5S);
		team6 = Integer.parseInt(team6S);
		team7 = Integer.parseInt(team7S);
		team8 = Integer.parseInt(team8S);
		team9 = Integer.parseInt(team9S);
		team10 = Integer.parseInt(team10S);
		team11 = Integer.parseInt(team11S);
		team12 = Integer.parseInt(team12S);
		team13 = Integer.parseInt(team13S);
		team14 = Integer.parseInt(team14S);
		team15 = Integer.parseInt(team15S);
		team16 = Integer.parseInt(team16S);
		team17 = Integer.parseInt(team17S);
		team18 = Integer.parseInt(team18S);
		team19 = Integer.parseInt(team19S);
		team20 = Integer.parseInt(team20S);
		team21 = Integer.parseInt(team21S);
		team22 = Integer.parseInt(team22S);
		team23 = Integer.parseInt(team23S);
		team24 = Integer.parseInt(team24S);
		team25 = Integer.parseInt(team25S);
		team26 = Integer.parseInt(team26S);
		team27 = Integer.parseInt(team27S);
		team28 = Integer.parseInt(team28S);
		team29 = Integer.parseInt(team29S);
		team30 = Integer.parseInt(team30S);
		team31 = Integer.parseInt(team31S);
		team32 = Integer.parseInt(team32S);
		System.out.println("BoopPlay5");
		if(team1 != 0) {
			teamsOnA1++;
			team1T = mainTeamList.getATeam(team1);
		}
		if(team2 != 0) {
			teamsOnA1++;
			team2T = mainTeamList.getATeam(team2);
		}
		if(team3 != 0) {
			teamsOnA1++;
			team3T = mainTeamList.getATeam(team3);
		}
		if(team4 != 0) {
			teamsOnA2++;
			team4T = mainTeamList.getATeam(team4);
			System.out.println("BoopPlay5.1");
		}
		if(team5 != 0) {
			teamsOnA2++;
			team5T = mainTeamList.getATeam(team5);
			System.out.println("BoopPlay5.2");
		}
		if(team6 != 0) {
			teamsOnA2++;
			team6T = mainTeamList.getATeam(team6);
			System.out.println("BoopPlay5.3 A2:" + teamsOnA2++);
		}
		if(team7 != 0) {
			teamsOnA3++;
			team7T = mainTeamList.getATeam(team7);
		}
		if(team8 != 0) {
			teamsOnA3++;
			team8T = mainTeamList.getATeam(team8);
		}
		if(team9 != 0) {
			teamsOnA3++;
			team9T = mainTeamList.getATeam(team9);
		}
		if(team10 != 0) {
			teamsOnA4++;
			team10T = mainTeamList.getATeam(team10);
		}
		if(team11 != 0) {
			teamsOnA4++;
			team11T = mainTeamList.getATeam(team12);
		}
		if(team12 != 0) {
			teamsOnA4++;
			team12T = mainTeamList.getATeam(team12);
		}
		if(team13 != 0) {
			teamsOnA5++;
			team13T = mainTeamList.getATeam(team13);
		}
		if(team14 != 0) {
			teamsOnA5++;
			team14T = mainTeamList.getATeam(team14);
		}
		if(team15 != 0) {
			teamsOnA5++;
			team15T = mainTeamList.getATeam(team15);
		}
		if(team16 != 0) {
			teamsOnA6++;
			team16T = mainTeamList.getATeam(team16);
		}
		if(team17 != 0) {
			teamsOnA6++;
			team17T = mainTeamList.getATeam(team17);
		}
		if(team18 != 0) {
			teamsOnA6++;
			team18T = mainTeamList.getATeam(team18);
		}
		if(team19 != 0) {
			teamsOnA7++;
			team19T = mainTeamList.getATeam(team19);
		}
		if(team20 != 0) {
			teamsOnA7++;
			team20T = mainTeamList.getATeam(team20);
		}
		if(team21 != 0) {
			teamsOnA7++;
			team21T = mainTeamList.getATeam(team21);
		}
		if(team22 != 0) {
			teamsOnA8++;
			team22T = mainTeamList.getATeam(team22);
		}
		if(team23 != 0) {
			teamsOnA8++;
			team23T = mainTeamList.getATeam(team23);
		}
		if(team24 != 0) {
			teamsOnA8++;
			team24T = mainTeamList.getATeam(team24);
		}
		if(team25 != 0) {
			teamsOnA1++;
			team25T = mainTeamList.getATeam(team25);
		}
		if(team26 != 0) {
			teamsOnA2++;
			team26T = mainTeamList.getATeam(team26);
		}
		if(team27 != 0) {
			teamsOnA3++;
			team27T = mainTeamList.getATeam(team27);
		}
		if(team28 != 0) {
			teamsOnA4++;
			team28T = mainTeamList.getATeam(team28);
		}
		if(team29 != 0) {
			teamsOnA5++;
			team29T = mainTeamList.getATeam(team29);
		}
		if(team30 != 0) {
			teamsOnA6++;
			team30T = mainTeamList.getATeam(team30);
		}
		if(team31 != 0) {
			teamsOnA7++;
			team31T = mainTeamList.getATeam(team31);
		}
		if(team32 != 0) {
			teamsOnA8++;
			team32T = mainTeamList.getATeam(team32);
		}
		System.out.println("BoopPlay6");
		if(teamsOnA1 == 4) {
			thePOA.setAlliance1(team1T, team2T, team3T, team25T);
		}
		if(teamsOnA1 == 3) {
			thePOA.setAlliance1(team1T, team2T, team3T);
			System.out.println("BoopPlay6.1");
		}
		if(teamsOnA1 == 2) {
			thePOA.setAlliance1(team1T, team2T);
		}
		if(teamsOnA1 == 1) {
			thePOA.setAlliance1(team1T);
		}
		if(teamsOnA2 == 4) {
			thePOA.setAlliance2(team4T, team5T, team6T, team26T);
		}
		if(teamsOnA2 == 3) {
			thePOA.setAlliance2(team4T, team5T, team6T);
			System.out.println("BoopPlay6.2");
		}
		if(teamsOnA2 == 2) {
			thePOA.setAlliance2(team4T, team5T);
		}
		if(teamsOnA2 == 1) {
			thePOA.setAlliance2(team5T);
		}
		if(teamsOnA3 == 4) {
			thePOA.setAlliance3(team7T, team8T, team9T, team27T);
		}
		if(teamsOnA3 == 3) {
			thePOA.setAlliance3(team7T, team8T, team9T);
		}
		if(teamsOnA3 == 2) {
			thePOA.setAlliance3(team7T, team8T);
		}
		if(teamsOnA3 == 1) {
			thePOA.setAlliance3(team7T);
		}
		if(teamsOnA4 == 4) {
			thePOA.setAlliance4(team10T, team11T, team12T, team28T);
		}
		if(teamsOnA4 == 3) {
			thePOA.setAlliance4(team10T, team11T, team12T);
		}
		if(teamsOnA4 == 2) {
			thePOA.setAlliance4(team10T, team11T);
		}
		if(teamsOnA4 == 1) {
			thePOA.setAlliance4(team10T);
		}
		if(teamsOnA5 == 4) {
			thePOA.setAlliance5(team13T, team14T, team15T, team29T);
		}
		if(teamsOnA5 == 3) {
			thePOA.setAlliance5(team13T, team14T, team15T);
		}
		if(teamsOnA5 == 2) {
			thePOA.setAlliance5(team13T, team14T);
		}
		if(teamsOnA5 == 1) {
			thePOA.setAlliance5(team13T);
		}
		if(teamsOnA6 == 4) {
			thePOA.setAlliance6(team16T, team17T, team18T, team30T);
		}
		if(teamsOnA6 == 3) {
			thePOA.setAlliance6(team16T, team17T, team18T);
		}
		if(teamsOnA6 == 2) {
			thePOA.setAlliance6(team16T, team17T);
		}
		if(teamsOnA6 == 1) {
			thePOA.setAlliance6(team16T);
		}
		if(teamsOnA7 == 4) {
			thePOA.setAlliance7(team19T, team20T, team21T, team31T);
		}
		if(teamsOnA7 == 3) {
			thePOA.setAlliance7(team19T, team20T, team21T);
		}
		if(teamsOnA7 == 2) {
			thePOA.setAlliance7(team19T, team20T);
		}
		if(teamsOnA7 == 1) {
			thePOA.setAlliance7(team19T);
		}
		if(teamsOnA8 == 4) {
			thePOA.setAlliance8(team22T, team23T, team24T, team32T);
		}
		if(teamsOnA8 == 3) {
			thePOA.setAlliance8(team22T, team23T, team24T);
		}
		if(teamsOnA8 == 2) {
			thePOA.setAlliance8(team22T, team23T);
		}
		if(teamsOnA8 == 1) {
			thePOA.setAlliance8(team22T);
		}
		System.out.println("BoopPlay7");	
	}
	
	private void sortListOfTeamNums() {
		listOfTeamNumsSorted.clear();
		for (int i = 0; i < 80; i++) {
			listOfTeamNumsSorted.add(null);
		}
		int place;
		for (int i = 0; i < listOfTeamNums.size(); i++) {
			place = 0;
			for(int e = 0; e < listOfTeamNums.size(); e++) {
				if (listOfTeamNums.get(i) > listOfTeamNums.get(e)) {
					place++;
				}
			}
			listOfTeamNumsSorted.set(place, listOfTeamNums.get(i));
		}
	}
	
	private void makeSearchTeams() {
		searchTeamsTab seTeams = new searchTeamsTab(mainTeamList, listOfTeamNumsSorted, fileTPL, fileDTDL, fileDTCL);
		seTeams.setId("seTeamsStyle");
		seTeams.setMinHeight(800);
		seTeams.setMinWidth(1400);
		FileInputStream inputSeTeams;
		try {
			inputSeTeams = new FileInputStream("TabsBackgroundV4.png");
			Image imageSeTeams = new Image(inputSeTeams); 
	        BackgroundImage backgroundimageSeTeams = new BackgroundImage(imageSeTeams, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundSeTeams = new Background(backgroundimageSeTeams);
			seTeams.setBackground(backgroundSeTeams);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		ScrollPane sp = new ScrollPane();
		sp.setHbarPolicy(ScrollBarPolicy.NEVER);
		sp.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		sp.setContent(seTeams);
		sp.setMinHeight(600);
		Tab seTeamsTab = new Tab("Search Teams", sp);
		mainTP.getTabs().addAll(seTeamsTab);
	}
	
	private void makeSearchAllinces() {
		searchAllincesTab seAllinces;
		if(thePOA.getAlliance1() != null) {
			seAllinces = new searchAllincesTab(true, listOfTeamNumsSorted, mainTeamList, thePOA, fileDTDL, fileDTCL);
		}else {
			seAllinces = new searchAllincesTab(false, listOfTeamNumsSorted, mainTeamList, thePOA, fileDTDL, fileDTCL);
		}
		seAllinces.setMinHeight(800);
		seAllinces.setMinWidth(1400);
		seAllinces.setMaxHeight(1400);
		seAllinces.setMaxWidth(1400);
		FileInputStream inputSeAllinces;
		try {
			inputSeAllinces = new FileInputStream("TabsBackgroundV4.png");
			Image imageSeAllinces = new Image(inputSeAllinces); 
	        BackgroundImage backgroundimageSeAllinces = new BackgroundImage(imageSeAllinces, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundSeAllinces = new Background(backgroundimageSeAllinces);
	        seAllinces.setBackground(backgroundSeAllinces);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		ScrollPane sp = new ScrollPane();
		sp.setHbarPolicy(ScrollBarPolicy.NEVER);
		sp.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		sp.setContent(seAllinces);
		sp.setMinHeight(600);
		Tab seAllincesTab = new Tab("Search Alliances", sp);
		mainTP.getTabs().addAll(seAllincesTab);
	}
	
	private void makeSearchAutos() {
		searchAutosTab seAutos = new searchAutosTab(theAutoList);
		seAutos.setMinHeight(1400);
		seAutos.setMinWidth(1400);
		seAutos.setMaxWidth(1400);
		FileInputStream inputSeAutos;
		try {
			inputSeAutos = new FileInputStream("TabsBackgroundV4.png");
			Image imageSeAutos = new Image(inputSeAutos); 
	        BackgroundImage backgroundimageSeAutos = new BackgroundImage(imageSeAutos, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundSeAutos = new Background(backgroundimageSeAutos);
	        seAutos.setBackground(backgroundSeAutos);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		ScrollPane sp = new ScrollPane();
		sp.setHbarPolicy(ScrollBarPolicy.NEVER);
		sp.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		sp.setContent(seAutos);
		sp.setMinHeight(600);
		Tab seAutosTab = new Tab("Search Autos", sp);
		mainTP.getTabs().addAll(seAutosTab);
	}
	
	private void makeSearchMatch() {
		searchMatchTab seMatch;
		if(thePOA.getAlliance1() != null) {
			seMatch = new searchMatchTab(listOfTeamNumsSorted, true, mainMatchList, mainTeamList);
		} else {
			seMatch = new searchMatchTab(listOfTeamNumsSorted, false, mainMatchList, mainTeamList);
		}
		seMatch.setMinHeight(1400);
		seMatch.setMinWidth(1400);
		seMatch.setMaxHeight(1400);
		seMatch.setMaxWidth(1400);
		FileInputStream inputSeMacth;
		try {
			inputSeMacth = new FileInputStream("TabsBackgroundV4.png");
			Image imageSeMacth = new Image(inputSeMacth); 
	        BackgroundImage backgroundimageSeMacth = new BackgroundImage(imageSeMacth, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundSeMacth = new Background(backgroundimageSeMacth);
	        seMatch.setBackground(backgroundSeMacth);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		ScrollPane sp = new ScrollPane();
		sp.setHbarPolicy(ScrollBarPolicy.NEVER);
		sp.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		sp.setContent(seMatch);
		Tab seMatchTab = new Tab("Search Match", sp);
		mainTP.getTabs().addAll(seMatchTab);
	}
	
	private void makeCompareTeams() {
		compareTeamsTab comTeams = new compareTeamsTab();
		comTeams.setMinHeight(800);
		comTeams.setMinWidth(1400);
		comTeams.setMaxHeight(800);
		comTeams.setMaxWidth(1400);
		FileInputStream inputComTeams;
		try {
			inputComTeams = new FileInputStream("TabsBackgroundV4.png");
			Image imageComTeams = new Image(inputComTeams); 
	        BackgroundImage backgroundimageComTeams = new BackgroundImage(imageComTeams, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundComTeams = new Background(backgroundimageComTeams);
	        comTeams.setBackground(backgroundComTeams);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		ScrollPane sp = new ScrollPane();
		sp.setHbarPolicy(ScrollBarPolicy.NEVER);
		sp.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		sp.setContent(comTeams);
		Tab comTeamsTab = new Tab("Compare Teams", sp);
		mainTP.getTabs().addAll(comTeamsTab);
	}
	
	private void makeCompareAllinces() {
		compareAlliancesTab comAlliances = new compareAlliancesTab();
		comAlliances.setMinHeight(800);
		comAlliances.setMinWidth(1400);
		comAlliances.setMaxHeight(800);
		comAlliances.setMaxWidth(1400);
		FileInputStream inputComAlliances;
		try {
			inputComAlliances = new FileInputStream("TabsBackgroundV4.png");
			Image imageComAlliances = new Image(inputComAlliances); 
	        BackgroundImage backgroundimageComAlliances = new BackgroundImage(imageComAlliances, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundComAlliances = new Background(backgroundimageComAlliances);
	        comAlliances.setBackground(backgroundComAlliances);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		ScrollPane sp = new ScrollPane();
		sp.setHbarPolicy(ScrollBarPolicy.NEVER);
		sp.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		sp.setContent(comAlliances);
		Tab comAlliancesTab = new Tab("Compare Alliances", sp);
		mainTP.getTabs().addAll(comAlliancesTab);
	}
	
	private void makeCompareAutos() {
		compareAutosTab comAutos = new compareAutosTab();
		comAutos.setMinHeight(800);
		comAutos.setMinWidth(1400);
		comAutos.setMaxHeight(800);
		comAutos.setMaxWidth(1400);
		FileInputStream inputComAutos;
		try {
			inputComAutos = new FileInputStream("TabsBackgroundV4.png");
			Image imageComAutos = new Image(inputComAutos); 
	        BackgroundImage backgroundimageComAutos = new BackgroundImage(imageComAutos, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundComAutos = new Background(backgroundimageComAutos);
	        comAutos.setBackground(backgroundComAutos);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		ScrollPane sp = new ScrollPane();
		sp.setHbarPolicy(ScrollBarPolicy.NEVER);
		sp.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		sp.setContent(comAutos);
		Tab comAutosTab = new Tab("Compare Autos", sp);
		mainTP.getTabs().addAll(comAutosTab);
	}
	
	private void makeCompareMatches() {
		compareMatchesTab comMatches = new compareMatchesTab();
		comMatches.setMinHeight(800);
		comMatches.setMinWidth(1400);
		comMatches.setMaxHeight(800);
		comMatches.setMaxWidth(1400);
		FileInputStream inputComMatches;
		try {
			inputComMatches = new FileInputStream("TabsBackgroundV4.png");
			Image imageComMatches = new Image(inputComMatches); 
	        BackgroundImage backgroundimageComMatches = new BackgroundImage(imageComMatches, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundComMatches = new Background(backgroundimageComMatches);
	        comMatches.setBackground(backgroundComMatches);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		ScrollPane sp = new ScrollPane();
		sp.setHbarPolicy(ScrollBarPolicy.NEVER);
		sp.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		sp.setContent(comMatches);
		Tab comMatchesTab = new Tab("Compare Matches", sp);
		mainTP.getTabs().addAll(comMatchesTab);
	}
	
	private void makeFindBestTeam() {
		findBestTeamTab findTeam = new findBestTeamTab();
		findTeam.setMinHeight(800);
		findTeam.setMinWidth(1400);
		findTeam.setMaxHeight(800);
		findTeam.setMaxWidth(1400);
		FileInputStream inputFindTeam;
		try {
			inputFindTeam = new FileInputStream("TabsBackgroundV4.png");
			Image imageFindTeam = new Image(inputFindTeam); 
	        BackgroundImage backgroundimageFindTeam = new BackgroundImage(imageFindTeam, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundFindTeam = new Background(backgroundimageFindTeam);
	        findTeam.setBackground(backgroundFindTeam);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		ScrollPane sp = new ScrollPane();
		sp.setHbarPolicy(ScrollBarPolicy.NEVER);
		sp.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		sp.setContent(findTeam);
		Tab findTeamTab = new Tab("Find Best Team", sp);
		mainTP.getTabs().addAll(findTeamTab);
	}
	
	private void makeFindBestAllince() {
		findBestAllianceTab findAlliance = new findBestAllianceTab();
		findAlliance.setMinHeight(800);
		findAlliance.setMinWidth(1400);
		findAlliance.setMaxHeight(800);
		findAlliance.setMaxWidth(1400);
		FileInputStream inputFindAlliance;
		try {
			inputFindAlliance = new FileInputStream("TabsBackgroundV4.png");
			Image imageFindAlliance = new Image(inputFindAlliance); 
	        BackgroundImage backgroundimageFindAlliance = new BackgroundImage(imageFindAlliance, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundFindAlliance = new Background(backgroundimageFindAlliance);
	        findAlliance.setBackground(backgroundFindAlliance);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		ScrollPane sp = new ScrollPane();
		sp.setHbarPolicy(ScrollBarPolicy.NEVER);
		sp.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		sp.setContent(findAlliance);
		Tab findAllianceTab = new Tab("Find Best Alliance", sp);
		mainTP.getTabs().addAll(findAllianceTab);
	}
	
	private void makeFindBestAuto() {
		findBestAutoTab findAuto = new findBestAutoTab();
		findAuto.setMinHeight(800);
		findAuto.setMinWidth(1400);
		findAuto.setMaxHeight(800);
		findAuto.setMaxWidth(1400);
		FileInputStream inputFindAuto;
		try {
			inputFindAuto = new FileInputStream("TabsBackgroundV4.png");
			Image imageFindAuto = new Image(inputFindAuto); 
	        BackgroundImage backgroundimageFindAuto = new BackgroundImage(imageFindAuto, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundFindAuto = new Background(backgroundimageFindAuto);
	        findAuto.setBackground(backgroundFindAuto);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		ScrollPane sp = new ScrollPane();
		sp.setHbarPolicy(ScrollBarPolicy.NEVER);
		sp.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		sp.setContent(findAuto);
		Tab findAutoTab = new Tab("Find Best auto", sp);
		mainTP.getTabs().addAll(findAutoTab);
	}
	
	private void makeFindBestStat() {
		findBestStatTab findStat = new findBestStatTab();
		findStat.setMinHeight(800);
		findStat.setMinWidth(1400);
		findStat.setMaxHeight(800);
		findStat.setMaxWidth(1400);
		FileInputStream inputFindStat;
		try {
			inputFindStat = new FileInputStream("TabsBackgroundV4.png");
			Image imageFindStat = new Image(inputFindStat); 
	        BackgroundImage backgroundimageFindStat = new BackgroundImage(imageFindStat, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundFindStat = new Background(backgroundimageFindStat);
	        findStat.setBackground(backgroundFindStat);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		ScrollPane sp = new ScrollPane();
		sp.setHbarPolicy(ScrollBarPolicy.NEVER);
		sp.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		sp.setContent(findStat);
		Tab findStatTab = new Tab("Find Best Stat", sp);
		mainTP.getTabs().addAll(findStatTab);
	}
	
	private void makeFindBestRobotArchatype() {
		findBestRobotArchetype findArchetype = new findBestRobotArchetype();
		findArchetype.setMinHeight(800);
		findArchetype.setMinWidth(1400);
		findArchetype.setMaxHeight(800);
		findArchetype.setMaxWidth(1400);
		FileInputStream inputFindArchetype;
		try {
			inputFindArchetype = new FileInputStream("TabsBackgroundV4.png");
			Image imageFindArchetype = new Image(inputFindArchetype); 
	        BackgroundImage backgroundimageFindArchetype = new BackgroundImage(imageFindArchetype, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundFindArchetype = new Background(backgroundimageFindArchetype);
	        findArchetype.setBackground(backgroundFindArchetype);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		ScrollPane sp = new ScrollPane();
		sp.setHbarPolicy(ScrollBarPolicy.NEVER);
		sp.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		sp.setContent(findArchetype);
		Tab findArchetypeTab = new Tab("Find Best Robot Archetype", sp);
		mainTP.getTabs().addAll(findArchetypeTab);
	}
	
	private void makeCreateAllince() {
		createAllianceTab creAlliance = new createAllianceTab();
		creAlliance.setMinHeight(800);
		creAlliance.setMinWidth(1400);
		creAlliance.setMaxHeight(800);
		creAlliance.setMaxWidth(1400);
		FileInputStream inputCreAlliance;
		try {
			inputCreAlliance = new FileInputStream("TabsBackgroundV4.png");
			Image imageCreAlliance = new Image(inputCreAlliance); 
	        BackgroundImage backgroundimageCreAlliance = new BackgroundImage(imageCreAlliance, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundCreAlliance = new Background(backgroundimageCreAlliance);
	        creAlliance.setBackground(backgroundCreAlliance);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		ScrollPane sp = new ScrollPane();
		sp.setHbarPolicy(ScrollBarPolicy.NEVER);
		sp.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		sp.setContent(creAlliance);
		Tab creAllianceTab = new Tab("Create Alliance", sp);
		mainTP.getTabs().addAll(creAllianceTab);
	}
	
	private void makeCreateMatch() {
		createMatchTab creMatch = new createMatchTab();
		creMatch.setMinHeight(800);
		creMatch.setMinWidth(1400);
		creMatch.setMaxHeight(800);
		creMatch.setMaxWidth(1400);
		FileInputStream inputCreMatch;
		try {
			inputCreMatch = new FileInputStream("TabsBackgroundV4.png");
			Image imageCreMatch = new Image(inputCreMatch); 
	        BackgroundImage backgroundimageCreMatch = new BackgroundImage(imageCreMatch, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundCreMatch = new Background(backgroundimageCreMatch);
	        creMatch.setBackground(backgroundCreMatch);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		ScrollPane sp = new ScrollPane();
		sp.setHbarPolicy(ScrollBarPolicy.NEVER);
		sp.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		sp.setContent(creMatch);
		Tab creMatchTab = new Tab("Create Match", sp);
		mainTP.getTabs().addAll(creMatchTab);
	}
	
	private void makeCreateAutoPlan() {
		createAutoPlanTab creAutoPlan = new createAutoPlanTab();
		creAutoPlan.setMinHeight(800);
		creAutoPlan.setMinWidth(1400);
		creAutoPlan.setMaxHeight(800);
		creAutoPlan.setMaxWidth(1400);
		FileInputStream inputCreAutoPlan;
		try {
			inputCreAutoPlan = new FileInputStream("TabsBackgroundV4.png");
			Image imageCreAutoPlan = new Image(inputCreAutoPlan); 
	        BackgroundImage backgroundimageCreAutoPlan = new BackgroundImage(imageCreAutoPlan, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundCreAutoPlan = new Background(backgroundimageCreAutoPlan);
	        creAutoPlan.setBackground(backgroundCreAutoPlan);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		ScrollPane sp = new ScrollPane();
		sp.setHbarPolicy(ScrollBarPolicy.NEVER);
		sp.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		sp.setContent(creAutoPlan);
		Tab creAutoPlanTab = new Tab("Create Auto Plan", sp);
		mainTP.getTabs().addAll(creAutoPlanTab);
	}
	
	private void makeCreateMatchPlan() {
		createMatchPlanTab creMatchPlan = new createMatchPlanTab();
		creMatchPlan.setMinHeight(800);
		creMatchPlan.setMinWidth(1400);
		creMatchPlan.setMaxHeight(800);
		creMatchPlan.setMaxWidth(1400);
		FileInputStream inputCreMatchPlan;
		try {
			inputCreMatchPlan = new FileInputStream("TabsBackgroundV4.png");
			Image imageCreMatchPlan = new Image(inputCreMatchPlan); 
	        BackgroundImage backgroundimageCreMatchPlan = new BackgroundImage(imageCreMatchPlan, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundCreMatchPlan = new Background(backgroundimageCreMatchPlan);
	        creMatchPlan.setBackground(backgroundCreMatchPlan);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		ScrollPane sp = new ScrollPane();
		sp.setHbarPolicy(ScrollBarPolicy.NEVER);
		sp.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		sp.setContent(creMatchPlan);
		Tab creMatchPlanTab = new Tab("Create Match Plan", sp);
		mainTP.getTabs().addAll(creMatchPlanTab);
	}
	
	private void makeSetPlayOffAlliance() {
		setPlayOffAlliancesTab setPlayOff = new setPlayOffAlliancesTab(listOfTeamNumsSorted);
		setPlayOff.setMinHeight(800);
		setPlayOff.setMinWidth(1400);
		setPlayOff.setMaxHeight(800);
		setPlayOff.setMaxWidth(1400);
		FileInputStream inputSetPlayOff;
		try {
			inputSetPlayOff = new FileInputStream("TabsBackgroundV4.png");
			Image imageSetPlayOff = new Image(inputSetPlayOff); 
	        BackgroundImage backgroundimageSetPlayOff = new BackgroundImage(imageSetPlayOff, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundSetPlayOff = new Background(backgroundimageSetPlayOff);
	        setPlayOff.setBackground(backgroundSetPlayOff);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		ScrollPane sp = new ScrollPane();
		sp.setHbarPolicy(ScrollBarPolicy.NEVER);
		sp.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		sp.setContent(setPlayOff);
		Tab setPlayOffTab = new Tab("Set Play Off Alliances", sp);
		mainTP.getTabs().addAll(setPlayOffTab);
	}
	
	private void makeEditPlayOffAlliance() {
		editPlayOffAlliancesTab editPlayOff = new editPlayOffAlliancesTab(thePOA, listOfTeamNumsSorted);
		editPlayOff.setMinHeight(800);
		editPlayOff.setMinWidth(1400);
		editPlayOff.setMaxHeight(800);
		editPlayOff.setMaxWidth(1400);
		FileInputStream inputEditPlayOff;
		try {
			inputEditPlayOff = new FileInputStream("TabsBackgroundV4.png");
			Image imageEditPlayOff = new Image(inputEditPlayOff); 
	        BackgroundImage backgroundimageEditPlayOff = new BackgroundImage(imageEditPlayOff, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundEditPlayOff = new Background(backgroundimageEditPlayOff);
	        editPlayOff.setBackground(backgroundEditPlayOff);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		ScrollPane sp = new ScrollPane();
		sp.setHbarPolicy(ScrollBarPolicy.NEVER);
		sp.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		sp.setContent(editPlayOff);
		Tab editPlayOffTab = new Tab("Edit Play Off Alliances", sp);
		mainTP.getTabs().addAll(editPlayOffTab);
	}
	
	private void makeDeletePlayOffAlliance() {
		deletePlayOffAlliancesTab deletePlayOff = new deletePlayOffAlliancesTab();
		deletePlayOff.setMinHeight(800);
		deletePlayOff.setMinWidth(1400);
		deletePlayOff.setMaxHeight(800);
		deletePlayOff.setMaxWidth(1400);
		FileInputStream inputDeletePlayOff;
		try {
			inputDeletePlayOff = new FileInputStream("TabsBackgroundV4.png");
			Image imageDeletePlayOff = new Image(inputDeletePlayOff); 
	        BackgroundImage backgroundimageDeletePlayOff = new BackgroundImage(imageDeletePlayOff, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundDeletePlayOff = new Background(backgroundimageDeletePlayOff);
	        deletePlayOff.setBackground(backgroundDeletePlayOff);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		ScrollPane sp = new ScrollPane();
		sp.setHbarPolicy(ScrollBarPolicy.NEVER);
		sp.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		sp.setContent(deletePlayOff);
		Tab deletePlayOffTab = new Tab("Delete Play Off Alliances", sp);
		mainTP.getTabs().addAll(deletePlayOffTab);
	}
	
	private void makeOpenNewScData(TempTeamList mainTempTeamList, TeamList mainTeamList) {
		openNewScDataTab openScData = new openNewScDataTab(mainTempTeamList, mainTeamList);
		openScData.setMinHeight(800);
		openScData.setMinWidth(1400);
		openScData.setMaxHeight(800);
		openScData.setMaxWidth(1400);
		FileInputStream inputOpenScData;
		try {
			inputOpenScData = new FileInputStream("TabsBackgroundV4.png");
			Image imageOpenScData = new Image(inputOpenScData); 
	        BackgroundImage backgroundimageOpenScData = new BackgroundImage(imageOpenScData, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundOpenScData = new Background(backgroundimageOpenScData);
	        openScData.setBackground(backgroundOpenScData);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		ScrollPane sp = new ScrollPane();
		sp.setHbarPolicy(ScrollBarPolicy.NEVER);
		sp.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		sp.setContent(openScData);
		Tab openScDataTab = new Tab("Open New Scouting Data", sp);
		mainTP.getTabs().addAll(openScDataTab);
	}
	
	private void makeOpenNewPitData() {
		openNewPitDataTab openPitData = new openNewPitDataTab();
		openPitData.setMinHeight(800);
		openPitData.setMinWidth(1400);
		openPitData.setMaxHeight(800);
		openPitData.setMaxWidth(1400);
		FileInputStream inputOpenPitData;
		try {
			inputOpenPitData = new FileInputStream("TabsBackgroundV4.png");
			Image imageOpenPitData = new Image(inputOpenPitData); 
	        BackgroundImage backgroundimageOpenPitData = new BackgroundImage(imageOpenPitData, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundOpenPitData = new Background(backgroundimageOpenPitData);
	        openPitData.setBackground(backgroundOpenPitData);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		ScrollPane sp = new ScrollPane();
		sp.setHbarPolicy(ScrollBarPolicy.NEVER);
		sp.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		sp.setContent(openPitData);
		Tab openPitDataTab = new Tab("Open New Pit Data", sp);
		mainTP.getTabs().addAll(openPitDataTab);
	}
	
	private void makeOpenNewDriveTeamData() {
		openNewDriveTeamDataTab openDriveTeamData = new openNewDriveTeamDataTab();
		openDriveTeamData.setMinHeight(800);
		openDriveTeamData.setMinWidth(1400);
		openDriveTeamData.setMaxHeight(800);
		openDriveTeamData.setMaxWidth(1400);
		FileInputStream inputOpenDriveTeamData;
		try {
			inputOpenDriveTeamData = new FileInputStream("TabsBackgroundV4.png");
			Image imageOpenDriveTeamData = new Image(inputOpenDriveTeamData); 
	        BackgroundImage backgroundimageOpenDriveTeamData = new BackgroundImage(imageOpenDriveTeamData, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundOpenDriveTeamData = new Background(backgroundimageOpenDriveTeamData);
	        openDriveTeamData.setBackground(backgroundOpenDriveTeamData);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		ScrollPane sp = new ScrollPane();
		sp.setHbarPolicy(ScrollBarPolicy.NEVER);
		sp.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		sp.setContent(openDriveTeamData);
		Tab openDriveTeamDataTab = new Tab("Open New DriveTeam Data", sp);
		mainTP.getTabs().addAll(openDriveTeamDataTab);
	}
	
	private void makeOpenNewDriveTeamComs() {
		openNewDriveTeamComsTab openDriveTeamComs = new openNewDriveTeamComsTab();
		openDriveTeamComs.setMinHeight(800);
		openDriveTeamComs.setMinWidth(1400);
		openDriveTeamComs.setMaxHeight(800);
		openDriveTeamComs.setMaxWidth(1400);
		FileInputStream inputOpenDriveTeamComs;
		try {
			inputOpenDriveTeamComs = new FileInputStream("TabsBackgroundV4.png");
			Image imageOpenDriveTeamComs = new Image(inputOpenDriveTeamComs); 
	        BackgroundImage backgroundimageOpenDriveTeamComs = new BackgroundImage(imageOpenDriveTeamComs, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundOpenDriveTeamComs = new Background(backgroundimageOpenDriveTeamComs);
	        openDriveTeamComs.setBackground(backgroundOpenDriveTeamComs);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		ScrollPane sp = new ScrollPane();
		sp.setHbarPolicy(ScrollBarPolicy.NEVER);
		sp.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		sp.setContent(openDriveTeamComs);
		Tab openDriveTeamComsTab = new Tab("Open New DriveTeam Comments", sp);
		mainTP.getTabs().addAll(openDriveTeamComsTab);
	}
	
	private void makeEditScData() {
		editScDataTab edScData = new editScDataTab();
		edScData.setMinHeight(800);
		edScData.setMinWidth(1400);
		edScData.setMaxHeight(800);
		edScData.setMaxWidth(1400);
		FileInputStream inputEdScData;
		try {
			inputEdScData = new FileInputStream("TabsBackgroundV4.png");
			Image imageEdScData = new Image(inputEdScData); 
	        BackgroundImage backgroundimageEdScData = new BackgroundImage(imageEdScData, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundEdScData = new Background(backgroundimageEdScData);
	        edScData.setBackground(backgroundEdScData);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		ScrollPane sp = new ScrollPane();
		sp.setHbarPolicy(ScrollBarPolicy.NEVER);
		sp.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		sp.setContent(edScData);
		Tab edScDataTab = new Tab("Edit Scouting Data", sp);
		mainTP.getTabs().addAll(edScDataTab);
	}
	
	private void makeEditPitData() {
		editPitDataTab edPitData = new editPitDataTab();
		edPitData.setMinHeight(800);
		edPitData.setMinWidth(1400);
		edPitData.setMaxHeight(800);
		edPitData.setMaxWidth(1400);
		FileInputStream inputEdPitData;
		try {
			inputEdPitData = new FileInputStream("TabsBackgroundV4.png");
			Image imageEdPitData = new Image(inputEdPitData); 
	        BackgroundImage backgroundimageEdPitData = new BackgroundImage(imageEdPitData, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundEdPitData = new Background(backgroundimageEdPitData);
	        edPitData.setBackground(backgroundEdPitData);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		ScrollPane sp = new ScrollPane();
		sp.setHbarPolicy(ScrollBarPolicy.NEVER);
		sp.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		sp.setContent(edPitData);
		Tab edPitDataTab = new Tab("Edit Pit Data", sp);
		mainTP.getTabs().addAll(edPitDataTab);
	}
	
	private void makeEditDriveTeamData() {
		editDriveTeamDataTab edDriveTeamData = new editDriveTeamDataTab();
		edDriveTeamData.setMinHeight(800);
		edDriveTeamData.setMinWidth(1400);
		edDriveTeamData.setMaxHeight(800);
		edDriveTeamData.setMaxWidth(1400);
		FileInputStream inputEdDriveTeamData;
		try {
			inputEdDriveTeamData = new FileInputStream("TabsBackgroundV4.png");
			Image imageEdDriveTeamData = new Image(inputEdDriveTeamData); 
	        BackgroundImage backgroundimageEdDriveTeamData = new BackgroundImage(imageEdDriveTeamData, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundEdDriveTeamData = new Background(backgroundimageEdDriveTeamData);
	        edDriveTeamData.setBackground(backgroundEdDriveTeamData);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		ScrollPane sp = new ScrollPane();
		sp.setHbarPolicy(ScrollBarPolicy.NEVER);
		sp.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		sp.setContent(edDriveTeamData);
		Tab edDriveTeamDataTab = new Tab("Edit Drive Team Data", sp);
		mainTP.getTabs().addAll(edDriveTeamDataTab);
	}
	
	private void makeEditDriveTeamComs() {
		editDriveTeamComsTab edDriveTeamComs = new editDriveTeamComsTab();
		edDriveTeamComs.setMinHeight(800);
		edDriveTeamComs.setMinWidth(1400);
		edDriveTeamComs.setMaxHeight(800);
		edDriveTeamComs.setMaxWidth(1400);
		FileInputStream inputEdDriveTeamComs;
		try {
			inputEdDriveTeamComs = new FileInputStream("TabsBackgroundV4.png");
			Image imageEdDriveTeamComs = new Image(inputEdDriveTeamComs); 
	        BackgroundImage backgroundimageEdDriveTeamComs = new BackgroundImage(imageEdDriveTeamComs, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundEdDriveTeamComs = new Background(backgroundimageEdDriveTeamComs);
	        edDriveTeamComs.setBackground(backgroundEdDriveTeamComs);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		ScrollPane sp = new ScrollPane();
		sp.setHbarPolicy(ScrollBarPolicy.NEVER);
		sp.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		sp.setContent(edDriveTeamComs);
		Tab edDriveTeamComsTab = new Tab("Edit Drive Team Comments", sp);
		mainTP.getTabs().addAll(edDriveTeamComsTab);
	}
	
	private void makeExportScData() {
		exportScDataTab exScData = new exportScDataTab();
		exScData.setMinHeight(800);
		exScData.setMinWidth(1400);
		exScData.setMaxHeight(800);
		exScData.setMaxWidth(1400);
		FileInputStream inputExScData;
		try {
			inputExScData = new FileInputStream("TabsBackgroundV4.png");
			Image imageExScData = new Image(inputExScData); 
	        BackgroundImage backgroundimageExScData = new BackgroundImage(imageExScData, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundExScData = new Background(backgroundimageExScData);
	        exScData.setBackground(backgroundExScData);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		}
		ScrollPane sp = new ScrollPane();
		sp.setHbarPolicy(ScrollBarPolicy.NEVER);
		sp.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		sp.setContent(exScData);
		Tab exScDataTab = new Tab("Export Scouting Data", sp);
		mainTP.getTabs().addAll(exScDataTab);
	}
	
	private void makeExportPitData() {
		exportPitDataTab exPitData = new exportPitDataTab();
		exPitData.setMinHeight(800);
		exPitData.setMinWidth(1400);
		exPitData.setMaxHeight(800);
		exPitData.setMaxWidth(1400);
		FileInputStream inputExPitData;
		try {
			inputExPitData = new FileInputStream("TabsBackgroundV4.png");
			Image imageExPitData = new Image(inputExPitData); 
	        BackgroundImage backgroundimageExPitData = new BackgroundImage(imageExPitData, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundExPitData = new Background(backgroundimageExPitData);
	        exPitData.setBackground(backgroundExPitData);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		}
		ScrollPane sp = new ScrollPane();
		sp.setHbarPolicy(ScrollBarPolicy.NEVER);
		sp.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		sp.setContent(exPitData);
		Tab exPitDataTab = new Tab("Export Pit Data", sp);
		mainTP.getTabs().addAll(exPitDataTab);
	}
	
	private void makeExportDriveTeamData() {
		exportDriveTeamDataTab exDriveTeamData = new exportDriveTeamDataTab();
		exDriveTeamData.setMinHeight(800);
		exDriveTeamData.setMinWidth(1400);
		exDriveTeamData.setMaxHeight(800);
		exDriveTeamData.setMaxWidth(1400);
		FileInputStream inputExDriveTeamData;
		try {
			inputExDriveTeamData = new FileInputStream("TabsBackgroundV4.png");
			Image imageExDriveTeamData = new Image(inputExDriveTeamData); 
	        BackgroundImage backgroundimageExDriveTeamData = new BackgroundImage(imageExDriveTeamData, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundExDriveTeamData = new Background(backgroundimageExDriveTeamData);
	        exDriveTeamData.setBackground(backgroundExDriveTeamData);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		ScrollPane sp = new ScrollPane();
		sp.setHbarPolicy(ScrollBarPolicy.NEVER);
		sp.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		sp.setContent(exDriveTeamData);
		Tab exDriveTeamDataTab = new Tab("Export Drive Team Data", sp);
		mainTP.getTabs().addAll(exDriveTeamDataTab);
	}
	
	
	private void makeExportDriveTeamComs() {
		exportDriveTeamComsTab exDriveTeamComs = new exportDriveTeamComsTab();
		exDriveTeamComs.setMinHeight(800);
		exDriveTeamComs.setMinWidth(1400);
		exDriveTeamComs.setMaxHeight(800);
		exDriveTeamComs.setMaxWidth(1400);
		FileInputStream inputExDriveTeamComs;
		try {
			inputExDriveTeamComs = new FileInputStream("TabsBackgroundV4.png");
			Image imageExDriveTeamComs = new Image(inputExDriveTeamComs); 
	        BackgroundImage backgroundimageExDriveTeamComs = new BackgroundImage(imageExDriveTeamComs, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundExDriveTeamComs = new Background(backgroundimageExDriveTeamComs);
	        exDriveTeamComs.setBackground(backgroundExDriveTeamComs);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		ScrollPane sp = new ScrollPane();
		sp.setHbarPolicy(ScrollBarPolicy.NEVER);
		sp.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		sp.setContent(exDriveTeamComs);
		Tab exDriveTeamComsTab = new Tab("Export Drive Team Comments", sp);
		mainTP.getTabs().addAll(exDriveTeamComsTab);
	}
	
	private void makeHomePage() {
		homePageTab home = new homePageTab();
		home.setMinHeight(800);
		home.setMinWidth(1400);
		home.setMaxHeight(800);
		home.setMaxWidth(1400);
		FileInputStream inputHome;
		try {
			inputHome = new FileInputStream("TabsBackgroundV4.png");
			Image imageHome = new Image(inputHome); 
	        BackgroundImage backgroundimageHome = new BackgroundImage(imageHome, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundHome = new Background(backgroundimageHome);
	        home.setBackground(backgroundHome);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		ScrollPane sp = new ScrollPane();
		sp.setHbarPolicy(ScrollBarPolicy.NEVER);
		sp.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		sp.setContent(home);
		Tab homeTab = new Tab("Home Page", sp);
		mainTP.getTabs().addAll(homeTab);
	}
	
	public void setMainTeamList(TeamList incoming) {
		mainTeamList = incoming;
	}
	
	public void setSavedDataLabel(int times) {
		if(times == 1) {
			savedDataL.setId("saveDL1");
		}
		if(times == 2) {
			savedDataL.setId("saveDL2");
		}
		if(times == 3) {
			savedDataL.setId("saveDL3");
		}
		if(times == 4) {
			savedDataL.setId("saveDL4");
		}
		if(times == 5) {
			savedDataL.setId("saveDL5");
		}
		if(times == 6) {
			savedDataL.setId("saveDL6");
		}
		if(times == 7) {
			savedDataL.setId("saveDL7");
		}
		if(times == 8) {
			savedDataL.setId("saveDL8");
			timesSavedD = 0;
		}
	}
	
	public void setSavedPlayoffLabel(int times) {
		if(times == 1) {
			savedPlayoffL.setId("savePlayL1");
		}
		if(times == 2) {
			savedPlayoffL.setId("savePlayL2");
		}
		if(times == 3) {
			savedPlayoffL.setId("savePlayL3");
		}
		if(times == 4) {
			savedPlayoffL.setId("savePlayL4");
		}
		if(times == 5) {
			savedPlayoffL.setId("savePlayL5");
		}
		if(times == 6) {
			savedPlayoffL.setId("savePlayL6");
		}
		if(times == 7) {
			savedPlayoffL.setId("savePlayL7");
		}
		if(times == 8) {
			savedPlayoffL.setId("savePlayL8");
			timesSavedPlay = 0;
		}
	}
	
	@Override
	public void handle(ActionEvent event) {
		try {
			if(event.getSource() == searchTeamsMI) {
				makeSearchTeams();
			}
			if(event.getSource() == searchAllianceMI) {
				makeSearchAllinces();
			}
			if(event.getSource() == searchAutosMI) {
				makeSearchAutos();
			}
			if(event.getSource() == searchMatchMI) {
				makeSearchMatch();
			}
			if(event.getSource() == compareTeamsMI) {
				makeCompareTeams();
			}
			if(event.getSource() == compareAllianceMI) {
				makeCompareAllinces();
			}
			if(event.getSource() == compareAutosMI) {
				makeCompareAutos();
			}
			if(event.getSource() == compareMatchMI) {
				makeCompareMatches();
			}
			if(event.getSource() == findBestTeamMI) {
				makeFindBestTeam();
			}
			if(event.getSource() == findBestAllianceMI) {
				makeFindBestAllince();
			}
			if(event.getSource() == findBestAutoMI) {
				makeFindBestAuto();
			}
			if(event.getSource() == findBestStatMI) {
				makeFindBestStat();
			}
			if(event.getSource() == findBestRobotArchetypeMI) {
				makeFindBestRobotArchatype();
			}
			if(event.getSource() == createAllianceMI) {
				makeCreateAllince();
			}
			if(event.getSource() == createMatchMI) {
				makeCreateMatch();
			}
			if(event.getSource() == createAutoplanMI) {
				makeCreateAutoPlan();
			}
			if(event.getSource() == createMacthPlanMI) {
				makeCreateMatchPlan();
			}
			if(event.getSource() == setPlayOffAlliancesMI) {
				makeSetPlayOffAlliance();
			}
			if(event.getSource() == editPlayOffAlliancesMI) {
				makeEditPlayOffAlliance();
			}
			if(event.getSource() == deletePlayOffAlliancesMI) {
				makeDeletePlayOffAlliance();
			}
			if(event.getSource() == openNewScDataMI) {
				makeOpenNewScData(mainTempTeamList, mainTeamList);
			}
			if(event.getSource() == openNewPitDataMI) {
				makeOpenNewPitData();
			}
			if(event.getSource() == openNewDriveTeamDataMI) {
				makeOpenNewDriveTeamData();
			}
			if(event.getSource() == openNewDriveTeamComsMI) {
				makeOpenNewDriveTeamComs();
			}
			if(event.getSource() == editScDataMI) {
				makeEditScData();
			}
			if(event.getSource() == editPitDataMI) {
				makeEditPitData();
			}
			if(event.getSource() == editDriveTeamDataMI) {
				makeEditDriveTeamData();
			}
			if(event.getSource() == editDriveTeamComsMI) {
				makeEditDriveTeamComs();
			}
			if(event.getSource() == exportScDataMI) {
				makeExportScData();
			}
			if(event.getSource() == exportPitDataMI) {
				makeExportPitData();
			}
			if(event.getSource() == exportDriveTeamDataMI) {
				makeExportDriveTeamData();
			}
			if(event.getSource() == exportDriveTeamComsMI) {
				makeExportDriveTeamComs();
			}
			if(event.getSource() == homePageMI) {
				makeHomePage();
			}
			if(event.getSource() == saveDataB) {
				updatePitData();
				updateDataList();
				updateDriveTeamDataList();
				updateDriveTeamCommentsList();
				timesSavedD++;
				setSavedDataLabel(timesSavedD);
				timesSavedPlay++;
			}
			if(event.getSource() == savePlayoffB) {
				updatePlayoffList();
				timesSavedPlay++;
				setSavedPlayoffLabel(timesSavedPlay);
			}
		} catch(Exception e) {
			System.out.println("error: " + e);
		}
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	
}
