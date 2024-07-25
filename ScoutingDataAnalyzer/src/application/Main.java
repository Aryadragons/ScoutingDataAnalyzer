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
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.FileChooser;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
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
	//
	private List<Integer> listOfTeamNums;
	private List<Integer> listOfTeamNumsSorted;
	
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
			root.setTop(MB);
			//adding the Tab panes
			mainTP = new TabPane();
			root.setBottom(mainTP);
			//adding save files stuff
			saveDataB = new Button("Save All Data");
			saveDataB.setOnAction(this);
			root.setCenter(saveDataB);
			//background stuff
			FileInputStream input = new FileInputStream("tempMainBackground.png"); 
            Image image = new Image(input); 
            BackgroundImage backgroundimage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
            // create Background 
            Background background = new Background(backgroundimage);
			root.setBackground(background);
			
			//
			listOfTeamNums = new ArrayList<Integer>();
			listOfTeamNumsSorted = new ArrayList<Integer>();
			for (int i = 0; i < 60; i++) {
				listOfTeamNumsSorted.add(null);
			}
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
		String fileCyclesS;
		String fileNumOfCommsS;
		String fileHumAmpSkillS;
		String fileHumScoSkillS;
		String fileHumAmpNotesS;
		String fileTimesHumAmpS;
		String fileTimesHumScoS;
		int fileTeamNum;
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
			//Matches Sutff
			MatchList fileMatchList = new MatchList();
			String TotalMsS = fileInput.next();
			int TotalMs = Integer.parseInt(TotalMsS);
			for (int i = 0; i < TotalMs; i++) {
				String MTeamNumS = fileInput.next();
		    	String MMatchNumS = fileInput.next();
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
		    	Match fileMatch = new Match(MTeamNum, MMatchNum, MAmp, MSpe, MTrap, MClimb, MHumPosS, MAmpSkill, MScoSkill, MAmpNotes, MCommentS);
		    	fileMatchList.addPreMadeMatch(fileMatch);
			}
			
			
			fileTeamNum = Integer.parseInt(fileTeamNumS);
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
			mainTeamList.addTempTeamInMain(fileTeamNum, fileCycles, fileMatches, fileAmp, fileSpe, fileTrap, fileClimb, commentList, fileHumPostionsList, fileHumAmpSkill, fileHumScoSkill, fileHumAmpNotes, fileTimesHumAmp, fileTimesHumSco, fileMatchList);
			System.out.println("Boop29");
		}
		sortListOfTeamNums();
	}
	
	private void sortListOfTeamNums() {
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
		searchTeamsTab seTeams = new searchTeamsTab(mainTeamList, listOfTeamNumsSorted);
		seTeams.setId("seTeamsStyle");
		seTeams.setMinHeight(600);
		seTeams.setMinWidth(1400);
		seTeams.setMaxHeight(600);
		seTeams.setMaxWidth(1400);
		FileInputStream inputSeTeams;
		try {
			inputSeTeams = new FileInputStream("TabsBackground600.png");
			Image imageSeTeams = new Image(inputSeTeams); 
	        BackgroundImage backgroundimageSeTeams = new BackgroundImage(imageSeTeams, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundSeTeams = new Background(backgroundimageSeTeams);
			seTeams.setBackground(backgroundSeTeams);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		Tab seTeamsTab = new Tab("Search Teams", seTeams);
		mainTP.getTabs().addAll(seTeamsTab);
	}
	
	private void makeSearchAllinces() {
		searchAllincesTab seAllinces = new searchAllincesTab();
		seAllinces.setMinHeight(600);
		seAllinces.setMinWidth(1400);
		seAllinces.setMaxHeight(600);
		seAllinces.setMaxWidth(1400);
		FileInputStream inputSeAllinces;
		try {
			inputSeAllinces = new FileInputStream("TabsBackground600.png");
			Image imageSeAllinces = new Image(inputSeAllinces); 
	        BackgroundImage backgroundimageSeAllinces = new BackgroundImage(imageSeAllinces, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundSeAllinces = new Background(backgroundimageSeAllinces);
	        seAllinces.setBackground(backgroundSeAllinces);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		Tab seAllincesTab = new Tab("Search Alliances", seAllinces);
		mainTP.getTabs().addAll(seAllincesTab);
	}
	
	private void makeSearchAutos() {
		searchAutosTab seAutos = new searchAutosTab();
		seAutos.setMinHeight(600);
		seAutos.setMinWidth(1400);
		seAutos.setMaxHeight(600);
		seAutos.setMaxWidth(1400);
		FileInputStream inputSeAutos;
		try {
			inputSeAutos = new FileInputStream("TabsBackground600.png");
			Image imageSeAutos = new Image(inputSeAutos); 
	        BackgroundImage backgroundimageSeAutos = new BackgroundImage(imageSeAutos, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundSeAutos = new Background(backgroundimageSeAutos);
	        seAutos.setBackground(backgroundSeAutos);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		Tab seAutosTab = new Tab("Search Autos", seAutos);
		mainTP.getTabs().addAll(seAutosTab);
	}
	
	private void makeSearchMatch() {
		searchMatchTab seMatch = new searchMatchTab();
		seMatch.setMinHeight(600);
		seMatch.setMinWidth(1400);
		seMatch.setMaxHeight(600);
		seMatch.setMaxWidth(1400);
		FileInputStream inputSeMacth;
		try {
			inputSeMacth = new FileInputStream("TabsBackground600.png");
			Image imageSeMacth = new Image(inputSeMacth); 
	        BackgroundImage backgroundimageSeMacth = new BackgroundImage(imageSeMacth, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundSeMacth = new Background(backgroundimageSeMacth);
	        seMatch.setBackground(backgroundSeMacth);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		Tab seMatchTab = new Tab("Search Match", seMatch);
		mainTP.getTabs().addAll(seMatchTab);
	}
	
	private void makeCompareTeams() {
		compareTeamsTab comTeams = new compareTeamsTab();
		comTeams.setMinHeight(600);
		comTeams.setMinWidth(1400);
		comTeams.setMaxHeight(600);
		comTeams.setMaxWidth(1400);
		FileInputStream inputComTeams;
		try {
			inputComTeams = new FileInputStream("TabsBackground600.png");
			Image imageComTeams = new Image(inputComTeams); 
	        BackgroundImage backgroundimageComTeams = new BackgroundImage(imageComTeams, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundComTeams = new Background(backgroundimageComTeams);
	        comTeams.setBackground(backgroundComTeams);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		Tab comTeamsTab = new Tab("Compare Teams", comTeams);
		mainTP.getTabs().addAll(comTeamsTab);
	}
	
	private void makeCompareAllinces() {
		compareAlliancesTab comAlliances = new compareAlliancesTab();
		comAlliances.setMinHeight(600);
		comAlliances.setMinWidth(1400);
		comAlliances.setMaxHeight(600);
		comAlliances.setMaxWidth(1400);
		FileInputStream inputComAlliances;
		try {
			inputComAlliances = new FileInputStream("TabsBackground600.png");
			Image imageComAlliances = new Image(inputComAlliances); 
	        BackgroundImage backgroundimageComAlliances = new BackgroundImage(imageComAlliances, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundComAlliances = new Background(backgroundimageComAlliances);
	        comAlliances.setBackground(backgroundComAlliances);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		Tab comAlliancesTab = new Tab("Compare Alliances", comAlliances);
		mainTP.getTabs().addAll(comAlliancesTab);
	}
	
	private void makeCompareAutos() {
		compareAutosTab comAutos = new compareAutosTab();
		comAutos.setMinHeight(600);
		comAutos.setMinWidth(1400);
		comAutos.setMaxHeight(600);
		comAutos.setMaxWidth(1400);
		FileInputStream inputComAutos;
		try {
			inputComAutos = new FileInputStream("TabsBackground600.png");
			Image imageComAutos = new Image(inputComAutos); 
	        BackgroundImage backgroundimageComAutos = new BackgroundImage(imageComAutos, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundComAutos = new Background(backgroundimageComAutos);
	        comAutos.setBackground(backgroundComAutos);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		Tab comAutosTab = new Tab("Compare Autos", comAutos);
		mainTP.getTabs().addAll(comAutosTab);
	}
	
	private void makeCompareMatches() {
		compareMatchesTab comMatches = new compareMatchesTab();
		comMatches.setMinHeight(600);
		comMatches.setMinWidth(1400);
		comMatches.setMaxHeight(600);
		comMatches.setMaxWidth(1400);
		FileInputStream inputComMatches;
		try {
			inputComMatches = new FileInputStream("TabsBackground600.png");
			Image imageComMatches = new Image(inputComMatches); 
	        BackgroundImage backgroundimageComMatches = new BackgroundImage(imageComMatches, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundComMatches = new Background(backgroundimageComMatches);
	        comMatches.setBackground(backgroundComMatches);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		Tab comMatchesTab = new Tab("Compare Matches", comMatches);
		mainTP.getTabs().addAll(comMatchesTab);
	}
	
	private void makeFindBestTeam() {
		findBestTeamTab findTeam = new findBestTeamTab();
		findTeam.setMinHeight(600);
		findTeam.setMinWidth(1400);
		findTeam.setMaxHeight(600);
		findTeam.setMaxWidth(1400);
		FileInputStream inputFindTeam;
		try {
			inputFindTeam = new FileInputStream("TabsBackground600.png");
			Image imageFindTeam = new Image(inputFindTeam); 
	        BackgroundImage backgroundimageFindTeam = new BackgroundImage(imageFindTeam, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundFindTeam = new Background(backgroundimageFindTeam);
	        findTeam.setBackground(backgroundFindTeam);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		Tab findTeamTab = new Tab("Find Best Team", findTeam);
		mainTP.getTabs().addAll(findTeamTab);
	}
	
	private void makeFindBestAllince() {
		findBestAllianceTab findAlliance = new findBestAllianceTab();
		findAlliance.setMinHeight(600);
		findAlliance.setMinWidth(1400);
		findAlliance.setMaxHeight(600);
		findAlliance.setMaxWidth(1400);
		FileInputStream inputFindAlliance;
		try {
			inputFindAlliance = new FileInputStream("TabsBackground600.png");
			Image imageFindAlliance = new Image(inputFindAlliance); 
	        BackgroundImage backgroundimageFindAlliance = new BackgroundImage(imageFindAlliance, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundFindAlliance = new Background(backgroundimageFindAlliance);
	        findAlliance.setBackground(backgroundFindAlliance);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		Tab findAllianceTab = new Tab("Find Best Alliance", findAlliance);
		mainTP.getTabs().addAll(findAllianceTab);
	}
	
	private void makeFindBestAuto() {
		findBestAutoTab findAuto = new findBestAutoTab();
		findAuto.setMinHeight(600);
		findAuto.setMinWidth(1400);
		findAuto.setMaxHeight(600);
		findAuto.setMaxWidth(1400);
		FileInputStream inputFindAuto;
		try {
			inputFindAuto = new FileInputStream("TabsBackground600.png");
			Image imageFindAuto = new Image(inputFindAuto); 
	        BackgroundImage backgroundimageFindAuto = new BackgroundImage(imageFindAuto, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundFindAuto = new Background(backgroundimageFindAuto);
	        findAuto.setBackground(backgroundFindAuto);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		Tab findAutoTab = new Tab("Find Best auto", findAuto);
		mainTP.getTabs().addAll(findAutoTab);
	}
	
	private void makeFindBestStat() {
		findBestStatTab findStat = new findBestStatTab();
		findStat.setMinHeight(600);
		findStat.setMinWidth(1400);
		findStat.setMaxHeight(600);
		findStat.setMaxWidth(1400);
		FileInputStream inputFindStat;
		try {
			inputFindStat = new FileInputStream("TabsBackground600.png");
			Image imageFindStat = new Image(inputFindStat); 
	        BackgroundImage backgroundimageFindStat = new BackgroundImage(imageFindStat, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundFindStat = new Background(backgroundimageFindStat);
	        findStat.setBackground(backgroundFindStat);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		Tab findStatTab = new Tab("Find Best Stat", findStat);
		mainTP.getTabs().addAll(findStatTab);
	}
	
	private void makeFindBestRobotArchatype() {
		findBestRobotArchetype findArchetype = new findBestRobotArchetype();
		findArchetype.setMinHeight(600);
		findArchetype.setMinWidth(1400);
		findArchetype.setMaxHeight(600);
		findArchetype.setMaxWidth(1400);
		FileInputStream inputFindArchetype;
		try {
			inputFindArchetype = new FileInputStream("TabsBackground600.png");
			Image imageFindArchetype = new Image(inputFindArchetype); 
	        BackgroundImage backgroundimageFindArchetype = new BackgroundImage(imageFindArchetype, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundFindArchetype = new Background(backgroundimageFindArchetype);
	        findArchetype.setBackground(backgroundFindArchetype);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		Tab findArchetypeTab = new Tab("Find Best Robot Archetype", findArchetype);
		mainTP.getTabs().addAll(findArchetypeTab);
	}
	
	private void makeCreateAllince() {
		createAllianceTab creAlliance = new createAllianceTab();
		creAlliance.setMinHeight(600);
		creAlliance.setMinWidth(1400);
		creAlliance.setMaxHeight(600);
		creAlliance.setMaxWidth(1400);
		FileInputStream inputCreAlliance;
		try {
			inputCreAlliance = new FileInputStream("TabsBackground600.png");
			Image imageCreAlliance = new Image(inputCreAlliance); 
	        BackgroundImage backgroundimageCreAlliance = new BackgroundImage(imageCreAlliance, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundCreAlliance = new Background(backgroundimageCreAlliance);
	        creAlliance.setBackground(backgroundCreAlliance);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		Tab creAllianceTab = new Tab("Create Alliance", creAlliance);
		mainTP.getTabs().addAll(creAllianceTab);
	}
	
	private void makeCreateMatch() {
		createMatchTab creMatch = new createMatchTab();
		creMatch.setMinHeight(600);
		creMatch.setMinWidth(1400);
		creMatch.setMaxHeight(600);
		creMatch.setMaxWidth(1400);
		FileInputStream inputCreMatch;
		try {
			inputCreMatch = new FileInputStream("TabsBackground600.png");
			Image imageCreMatch = new Image(inputCreMatch); 
	        BackgroundImage backgroundimageCreMatch = new BackgroundImage(imageCreMatch, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundCreMatch = new Background(backgroundimageCreMatch);
	        creMatch.setBackground(backgroundCreMatch);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		Tab creMatchTab = new Tab("Create Match", creMatch);
		mainTP.getTabs().addAll(creMatchTab);
	}
	
	private void makeCreateAutoPlan() {
		createAutoPlanTab creAutoPlan = new createAutoPlanTab();
		creAutoPlan.setMinHeight(600);
		creAutoPlan.setMinWidth(1400);
		creAutoPlan.setMaxHeight(600);
		creAutoPlan.setMaxWidth(1400);
		FileInputStream inputCreAutoPlan;
		try {
			inputCreAutoPlan = new FileInputStream("TabsBackground600.png");
			Image imageCreAutoPlan = new Image(inputCreAutoPlan); 
	        BackgroundImage backgroundimageCreAutoPlan = new BackgroundImage(imageCreAutoPlan, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundCreAutoPlan = new Background(backgroundimageCreAutoPlan);
	        creAutoPlan.setBackground(backgroundCreAutoPlan);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		Tab creAutoPlanTab = new Tab("Create Auto Plan", creAutoPlan);
		mainTP.getTabs().addAll(creAutoPlanTab);
	}
	
	private void makeCreateMatchPlan() {
		createMatchPlanTab creMatchPlan = new createMatchPlanTab();
		creMatchPlan.setMinHeight(600);
		creMatchPlan.setMinWidth(1400);
		creMatchPlan.setMaxHeight(600);
		creMatchPlan.setMaxWidth(1400);
		FileInputStream inputCreMatchPlan;
		try {
			inputCreMatchPlan = new FileInputStream("TabsBackground600.png");
			Image imageCreMatchPlan = new Image(inputCreMatchPlan); 
	        BackgroundImage backgroundimageCreMatchPlan = new BackgroundImage(imageCreMatchPlan, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundCreMatchPlan = new Background(backgroundimageCreMatchPlan);
	        creMatchPlan.setBackground(backgroundCreMatchPlan);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		Tab creMatchPlanTab = new Tab("Create Match Plan", creMatchPlan);
		mainTP.getTabs().addAll(creMatchPlanTab);
	}
	
	private void makeSetPlayOffAlliance() {
		setPlayOffAlliancesTab setPlayOff = new setPlayOffAlliancesTab();
		setPlayOff.setMinHeight(600);
		setPlayOff.setMinWidth(1400);
		setPlayOff.setMaxHeight(600);
		setPlayOff.setMaxWidth(1400);
		FileInputStream inputSetPlayOff;
		try {
			inputSetPlayOff = new FileInputStream("TabsBackground600.png");
			Image imageSetPlayOff = new Image(inputSetPlayOff); 
	        BackgroundImage backgroundimageSetPlayOff = new BackgroundImage(imageSetPlayOff, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundSetPlayOff = new Background(backgroundimageSetPlayOff);
	        setPlayOff.setBackground(backgroundSetPlayOff);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		Tab setPlayOffTab = new Tab("Set Play Off Alliances", setPlayOff);
		mainTP.getTabs().addAll(setPlayOffTab);
	}
	
	private void makeEditPlayOffAlliance() {
		editPlayOffAlliancesTab editPlayOff = new editPlayOffAlliancesTab();
		editPlayOff.setMinHeight(600);
		editPlayOff.setMinWidth(1400);
		editPlayOff.setMaxHeight(600);
		editPlayOff.setMaxWidth(1400);
		FileInputStream inputEditPlayOff;
		try {
			inputEditPlayOff = new FileInputStream("TabsBackground600.png");
			Image imageEditPlayOff = new Image(inputEditPlayOff); 
	        BackgroundImage backgroundimageEditPlayOff = new BackgroundImage(imageEditPlayOff, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundEditPlayOff = new Background(backgroundimageEditPlayOff);
	        editPlayOff.setBackground(backgroundEditPlayOff);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		Tab editPlayOffTab = new Tab("Edit Play Off Alliances", editPlayOff);
		mainTP.getTabs().addAll(editPlayOffTab);
	}
	
	private void makeDeletePlayOffAlliance() {
		deletePlayOffAlliancesTab deletePlayOff = new deletePlayOffAlliancesTab();
		deletePlayOff.setMinHeight(600);
		deletePlayOff.setMinWidth(1400);
		deletePlayOff.setMaxHeight(600);
		deletePlayOff.setMaxWidth(1400);
		FileInputStream inputDeletePlayOff;
		try {
			inputDeletePlayOff = new FileInputStream("TabsBackground600.png");
			Image imageDeletePlayOff = new Image(inputDeletePlayOff); 
	        BackgroundImage backgroundimageDeletePlayOff = new BackgroundImage(imageDeletePlayOff, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundDeletePlayOff = new Background(backgroundimageDeletePlayOff);
	        deletePlayOff.setBackground(backgroundDeletePlayOff);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		Tab deletePlayOffTab = new Tab("Delete Play Off Alliances", deletePlayOff);
		mainTP.getTabs().addAll(deletePlayOffTab);
	}
	
	private void makeOpenNewScData(TempTeamList mainTempTeamList, TeamList mainTeamList) {
		openNewScDataTab openScData = new openNewScDataTab(mainTempTeamList, mainTeamList);
		openScData.setMinHeight(600);
		openScData.setMinWidth(1400);
		openScData.setMaxHeight(600);
		openScData.setMaxWidth(1400);
		FileInputStream inputOpenScData;
		try {
			inputOpenScData = new FileInputStream("TabsBackground600.png");
			Image imageOpenScData = new Image(inputOpenScData); 
	        BackgroundImage backgroundimageOpenScData = new BackgroundImage(imageOpenScData, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundOpenScData = new Background(backgroundimageOpenScData);
	        openScData.setBackground(backgroundOpenScData);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		Tab openScDataTab = new Tab("Open New Scouting Data", openScData);
		mainTP.getTabs().addAll(openScDataTab);
	}
	
	private void makeOpenNewPitData() {
		openNewPitDataTab openPitData = new openNewPitDataTab();
		openPitData.setMinHeight(600);
		openPitData.setMinWidth(1400);
		openPitData.setMaxHeight(600);
		openPitData.setMaxWidth(1400);
		FileInputStream inputOpenPitData;
		try {
			inputOpenPitData = new FileInputStream("TabsBackground600.png");
			Image imageOpenPitData = new Image(inputOpenPitData); 
	        BackgroundImage backgroundimageOpenPitData = new BackgroundImage(imageOpenPitData, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundOpenPitData = new Background(backgroundimageOpenPitData);
	        openPitData.setBackground(backgroundOpenPitData);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		Tab openPitDataTab = new Tab("Open New Pit Data", openPitData);
		mainTP.getTabs().addAll(openPitDataTab);
	}
	
	private void makeOpenNewDriveTeamData() {
		openNewDriveTeamDataTab openDriveTeamData = new openNewDriveTeamDataTab();
		openDriveTeamData.setMinHeight(600);
		openDriveTeamData.setMinWidth(1400);
		openDriveTeamData.setMaxHeight(600);
		openDriveTeamData.setMaxWidth(1400);
		FileInputStream inputOpenDriveTeamData;
		try {
			inputOpenDriveTeamData = new FileInputStream("TabsBackground600.png");
			Image imageOpenDriveTeamData = new Image(inputOpenDriveTeamData); 
	        BackgroundImage backgroundimageOpenDriveTeamData = new BackgroundImage(imageOpenDriveTeamData, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundOpenDriveTeamData = new Background(backgroundimageOpenDriveTeamData);
	        openDriveTeamData.setBackground(backgroundOpenDriveTeamData);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		Tab openDriveTeamDataTab = new Tab("Open New DriveTeam Data", openDriveTeamData);
		mainTP.getTabs().addAll(openDriveTeamDataTab);
	}
	
	private void makeOpenNewDriveTeamComs() {
		openNewDriveTeamComsTab openDriveTeamComs = new openNewDriveTeamComsTab();
		openDriveTeamComs.setMinHeight(600);
		openDriveTeamComs.setMinWidth(1400);
		openDriveTeamComs.setMaxHeight(600);
		openDriveTeamComs.setMaxWidth(1400);
		FileInputStream inputOpenDriveTeamComs;
		try {
			inputOpenDriveTeamComs = new FileInputStream("TabsBackground600.png");
			Image imageOpenDriveTeamComs = new Image(inputOpenDriveTeamComs); 
	        BackgroundImage backgroundimageOpenDriveTeamComs = new BackgroundImage(imageOpenDriveTeamComs, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundOpenDriveTeamComs = new Background(backgroundimageOpenDriveTeamComs);
	        openDriveTeamComs.setBackground(backgroundOpenDriveTeamComs);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		Tab openDriveTeamComsTab = new Tab("Open New DriveTeam Comments", openDriveTeamComs);
		mainTP.getTabs().addAll(openDriveTeamComsTab);
	}
	
	private void makeEditScData() {
		editScDataTab edScData = new editScDataTab();
		edScData.setMinHeight(600);
		edScData.setMinWidth(1400);
		edScData.setMaxHeight(600);
		edScData.setMaxWidth(1400);
		FileInputStream inputEdScData;
		try {
			inputEdScData = new FileInputStream("TabsBackground600.png");
			Image imageEdScData = new Image(inputEdScData); 
	        BackgroundImage backgroundimageEdScData = new BackgroundImage(imageEdScData, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundEdScData = new Background(backgroundimageEdScData);
	        edScData.setBackground(backgroundEdScData);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		Tab edScDataTab = new Tab("Edit Scouting Data", edScData);
		mainTP.getTabs().addAll(edScDataTab);
	}
	
	private void makeEditPitData() {
		editPitDataTab edPitData = new editPitDataTab();
		edPitData.setMinHeight(600);
		edPitData.setMinWidth(1400);
		edPitData.setMaxHeight(600);
		edPitData.setMaxWidth(1400);
		FileInputStream inputEdPitData;
		try {
			inputEdPitData = new FileInputStream("TabsBackground600.png");
			Image imageEdPitData = new Image(inputEdPitData); 
	        BackgroundImage backgroundimageEdPitData = new BackgroundImage(imageEdPitData, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundEdPitData = new Background(backgroundimageEdPitData);
	        edPitData.setBackground(backgroundEdPitData);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		Tab edPitDataTab = new Tab("Edit Pit Data", edPitData);
		mainTP.getTabs().addAll(edPitDataTab);
	}
	
	private void makeEditDriveTeamData() {
		editDriveTeamDataTab edDriveTeamData = new editDriveTeamDataTab();
		edDriveTeamData.setMinHeight(600);
		edDriveTeamData.setMinWidth(1400);
		edDriveTeamData.setMaxHeight(600);
		edDriveTeamData.setMaxWidth(1400);
		FileInputStream inputEdDriveTeamData;
		try {
			inputEdDriveTeamData = new FileInputStream("TabsBackground600.png");
			Image imageEdDriveTeamData = new Image(inputEdDriveTeamData); 
	        BackgroundImage backgroundimageEdDriveTeamData = new BackgroundImage(imageEdDriveTeamData, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundEdDriveTeamData = new Background(backgroundimageEdDriveTeamData);
	        edDriveTeamData.setBackground(backgroundEdDriveTeamData);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		Tab edDriveTeamDataTab = new Tab("Edit Drive Team Data", edDriveTeamData);
		mainTP.getTabs().addAll(edDriveTeamDataTab);
	}
	
	private void makeEditDriveTeamComs() {
		editDriveTeamComsTab edDriveTeamComs = new editDriveTeamComsTab();
		edDriveTeamComs.setMinHeight(600);
		edDriveTeamComs.setMinWidth(1400);
		edDriveTeamComs.setMaxHeight(600);
		edDriveTeamComs.setMaxWidth(1400);
		FileInputStream inputEdDriveTeamComs;
		try {
			inputEdDriveTeamComs = new FileInputStream("TabsBackground600.png");
			Image imageEdDriveTeamComs = new Image(inputEdDriveTeamComs); 
	        BackgroundImage backgroundimageEdDriveTeamComs = new BackgroundImage(imageEdDriveTeamComs, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundEdDriveTeamComs = new Background(backgroundimageEdDriveTeamComs);
	        edDriveTeamComs.setBackground(backgroundEdDriveTeamComs);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		Tab edDriveTeamComsTab = new Tab("Edit Drive Team Comments", edDriveTeamComs);
		mainTP.getTabs().addAll(edDriveTeamComsTab);
	}
	
	private void makeExportScData() {
		exportScDataTab exScData = new exportScDataTab();
		exScData.setMinHeight(600);
		exScData.setMinWidth(1400);
		exScData.setMaxHeight(600);
		exScData.setMaxWidth(1400);
		FileInputStream inputExScData;
		try {
			inputExScData = new FileInputStream("TabsBackground600.png");
			Image imageExScData = new Image(inputExScData); 
	        BackgroundImage backgroundimageExScData = new BackgroundImage(imageExScData, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundExScData = new Background(backgroundimageExScData);
	        exScData.setBackground(backgroundExScData);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		}
		Tab exScDataTab = new Tab("Export Scouting Data", exScData);
		mainTP.getTabs().addAll(exScDataTab);
	}
	
	private void makeExportPitData() {
		exportPitDataTab exPitData = new exportPitDataTab();
		exPitData.setMinHeight(600);
		exPitData.setMinWidth(1400);
		exPitData.setMaxHeight(600);
		exPitData.setMaxWidth(1400);
		FileInputStream inputExPitData;
		try {
			inputExPitData = new FileInputStream("TabsBackground600.png");
			Image imageExPitData = new Image(inputExPitData); 
	        BackgroundImage backgroundimageExPitData = new BackgroundImage(imageExPitData, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundExPitData = new Background(backgroundimageExPitData);
	        exPitData.setBackground(backgroundExPitData);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		}
		Tab exPitDataTab = new Tab("Export Pit Data", exPitData);
		mainTP.getTabs().addAll(exPitDataTab);
	}
	
	private void makeExportDriveTeamData() {
		exportDriveTeamDataTab exDriveTeamData = new exportDriveTeamDataTab();
		exDriveTeamData.setMinHeight(600);
		exDriveTeamData.setMinWidth(1400);
		exDriveTeamData.setMaxHeight(600);
		exDriveTeamData.setMaxWidth(1400);
		FileInputStream inputExDriveTeamData;
		try {
			inputExDriveTeamData = new FileInputStream("TabsBackground600.png");
			Image imageExDriveTeamData = new Image(inputExDriveTeamData); 
	        BackgroundImage backgroundimageExDriveTeamData = new BackgroundImage(imageExDriveTeamData, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundExDriveTeamData = new Background(backgroundimageExDriveTeamData);
	        exDriveTeamData.setBackground(backgroundExDriveTeamData);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		Tab exDriveTeamDataTab = new Tab("Export Drive Team Data", exDriveTeamData);
		mainTP.getTabs().addAll(exDriveTeamDataTab);
	}
	
	
	private void makeExportDriveTeamComs() {
		exportDriveTeamComsTab exDriveTeamComs = new exportDriveTeamComsTab();
		exDriveTeamComs.setMinHeight(600);
		exDriveTeamComs.setMinWidth(1400);
		exDriveTeamComs.setMaxHeight(600);
		exDriveTeamComs.setMaxWidth(1400);
		FileInputStream inputExDriveTeamComs;
		try {
			inputExDriveTeamComs = new FileInputStream("TabsBackground600.png");
			Image imageExDriveTeamComs = new Image(inputExDriveTeamComs); 
	        BackgroundImage backgroundimageExDriveTeamComs = new BackgroundImage(imageExDriveTeamComs, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundExDriveTeamComs = new Background(backgroundimageExDriveTeamComs);
	        exDriveTeamComs.setBackground(backgroundExDriveTeamComs);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		Tab exDriveTeamComsTab = new Tab("Export Drive Team Comments", exDriveTeamComs);
		mainTP.getTabs().addAll(exDriveTeamComsTab);
	}
	
	private void makeHomePage() {
		homePageTab home = new homePageTab();
		home.setMinHeight(600);
		home.setMinWidth(1400);
		home.setMaxHeight(600);
		home.setMaxWidth(1400);
		FileInputStream inputHome;
		try {
			inputHome = new FileInputStream("TabsBackground600.png");
			Image imageHome = new Image(inputHome); 
	        BackgroundImage backgroundimageHome = new BackgroundImage(imageHome, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
	        // create Background 
	        Background backgroundHome = new Background(backgroundimageHome);
	        home.setBackground(backgroundHome);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
		} 
		Tab homeTab = new Tab("Home Page", home);
		mainTP.getTabs().addAll(homeTab);
	}
	
	public void setMainTeamList(TeamList incoming) {
		mainTeamList = incoming;
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
				updateDataList();
			}
		} catch(Exception e) {
			System.out.println("error: " + e);
		}
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	
}
