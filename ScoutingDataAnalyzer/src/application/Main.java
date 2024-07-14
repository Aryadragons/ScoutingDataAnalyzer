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
			FileInputStream input = new FileInputStream("ScoutBackground.png"); 
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
		File file = new File("MainScoutingDataFiles.txt");
		try {
			fileInput = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("Error" + e);
		}
		mainTeamList.listOfTeams.clear();
		String fileTeamNumS = "0";
		String fileAmpS = null;
		String fileSpeS;
		String fileTrapS;
		String fileClimbS;
		String fileMatchesS;
		String fileCyclesS;
		String fileNumOfCommsS;
		int fileTeamNum;
		int fileAmp;
		int fileSpe;
		int fileTrap;
		int fileClimb;
		int fileMatches;
		int fileCycles;
		int fileNumOfComms;
		List<String> commentList = new ArrayList<>();;
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
			fileTeamNum = Integer.parseInt(fileTeamNumS);
			fileAmp = Integer.parseInt(fileAmpS);
			fileSpe = Integer.parseInt(fileSpeS);
			fileTrap = Integer.parseInt(fileTrapS);
			fileClimb = Integer.parseInt(fileClimbS);
			fileMatches  = Integer.parseInt(fileMatchesS);
			fileCycles  = Integer.parseInt(fileCyclesS);
			listOfTeamNums.add(fileTeamNum);
			mainTeamList.addTempTeam(fileTeamNum, fileCycles, fileMatches, fileAmp, fileSpe, fileTrap, fileClimb, commentList);
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
		FileInputStream inputSeTeams;
		try {
			inputSeTeams = new FileInputStream("TabsBackground.png");
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
		FileInputStream inputSeAllinces;
		try {
			inputSeAllinces = new FileInputStream("TabsBackground.png");
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
		FileInputStream inputSeAutos;
		try {
			inputSeAutos = new FileInputStream("TabsBackground.png");
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
		FileInputStream inputSeMacth;
		try {
			inputSeMacth = new FileInputStream("TabsBackground.png");
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
		FileInputStream inputComTeams;
		try {
			inputComTeams = new FileInputStream("TabsBackground.png");
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
		FileInputStream inputComAlliances;
		try {
			inputComAlliances = new FileInputStream("TabsBackground.png");
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
		FileInputStream inputComAutos;
		try {
			inputComAutos = new FileInputStream("TabsBackground.png");
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
		FileInputStream inputComMatches;
		try {
			inputComMatches = new FileInputStream("TabsBackground.png");
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
		FileInputStream inputFindTeam;
		try {
			inputFindTeam = new FileInputStream("TabsBackground.png");
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
		FileInputStream inputFindAlliance;
		try {
			inputFindAlliance = new FileInputStream("TabsBackground.png");
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
		FileInputStream inputFindAuto;
		try {
			inputFindAuto = new FileInputStream("TabsBackground.png");
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
		FileInputStream inputFindStat;
		try {
			inputFindStat = new FileInputStream("TabsBackground.png");
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
		FileInputStream inputFindArchetype;
		try {
			inputFindArchetype = new FileInputStream("TabsBackground.png");
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
		FileInputStream inputCreAlliance;
		try {
			inputCreAlliance = new FileInputStream("TabsBackground.png");
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
		FileInputStream inputCreMatch;
		try {
			inputCreMatch = new FileInputStream("TabsBackground.png");
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
		FileInputStream inputCreAutoPlan;
		try {
			inputCreAutoPlan = new FileInputStream("TabsBackground.png");
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
		FileInputStream inputCreMatchPlan;
		try {
			inputCreMatchPlan = new FileInputStream("TabsBackground.png");
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
		FileInputStream inputSetPlayOff;
		try {
			inputSetPlayOff = new FileInputStream("TabsBackground.png");
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
		FileInputStream inputEditPlayOff;
		try {
			inputEditPlayOff = new FileInputStream("TabsBackground.png");
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
		FileInputStream inputDeletePlayOff;
		try {
			inputDeletePlayOff = new FileInputStream("TabsBackground.png");
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
		FileInputStream inputOpenScData;
		try {
			inputOpenScData = new FileInputStream("TabsBackground.png");
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
		FileInputStream inputOpenPitData;
		try {
			inputOpenPitData = new FileInputStream("TabsBackground.png");
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
		FileInputStream inputOpenDriveTeamData;
		try {
			inputOpenDriveTeamData = new FileInputStream("TabsBackground.png");
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
		FileInputStream inputOpenDriveTeamComs;
		try {
			inputOpenDriveTeamComs = new FileInputStream("TabsBackground.png");
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
		FileInputStream inputEdScData;
		try {
			inputEdScData = new FileInputStream("TabsBackground.png");
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
		FileInputStream inputEdPitData;
		try {
			inputEdPitData = new FileInputStream("TabsBackground.png");
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
		FileInputStream inputEdDriveTeamData;
		try {
			inputEdDriveTeamData = new FileInputStream("TabsBackground.png");
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
		FileInputStream inputEdDriveTeamComs;
		try {
			inputEdDriveTeamComs = new FileInputStream("TabsBackground.png");
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
		FileInputStream inputExScData;
		try {
			inputExScData = new FileInputStream("TabsBackground.png");
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
		FileInputStream inputExPitData;
		try {
			inputExPitData = new FileInputStream("TabsBackground.png");
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
		FileInputStream inputExDriveTeamData;
		try {
			inputExDriveTeamData = new FileInputStream("TabsBackground.png");
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
		FileInputStream inputExDriveTeamComs;
		try {
			inputExDriveTeamComs = new FileInputStream("TabsBackground.png");
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
		FileInputStream inputHome;
		try {
			inputHome = new FileInputStream("TabsBackground.png");
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
