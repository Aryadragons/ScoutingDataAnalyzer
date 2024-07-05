package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.FileChooser;
import javafx.scene.control.Alert;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;


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
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private MenuBar createMenuBar() {
		// Creating the Menu Bar
		MenuBar mB = new MenuBar();
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
	
	private void makeSearchTeams() {
		searchTeamsTab seTeams = new searchTeamsTab();
		Tab seTeamsTab = new Tab("Search Teams", seTeams);
		mainTP.getTabs().addAll(seTeamsTab);
	}
	
	private void makeSearchAllinces() {
		searchAllincesTab seAllinces = new searchAllincesTab();
		Tab seAllincesTab = new Tab("Search Alliances", seAllinces);
		mainTP.getTabs().addAll(seAllincesTab);
	}
	
	private void makeSearchAutos() {
		searchAutosTab seAutos = new searchAutosTab();
		Tab seAutosTab = new Tab("Search Autos", seAutos);
		mainTP.getTabs().addAll(seAutosTab);
	}
	
	private void makeSearchMatch() {
		searchMatchTab seMatch = new searchMatchTab();
		Tab seMatchTab = new Tab("Search Match", seMatch);
		mainTP.getTabs().addAll(seMatchTab);
	}
	
	private void makeCompareTeams() {
		compareTeamsTab comTeams = new compareTeamsTab();
		Tab comTeamsTab = new Tab("Compare Teams", comTeams);
		mainTP.getTabs().addAll(comTeamsTab);
	}
	
	private void makeCompareAllinces() {
		compareAlliancesTab comAlliances = new compareAlliancesTab();
		Tab comAlliancesTab = new Tab("Compare Alliances", comAlliances);
		mainTP.getTabs().addAll(comAlliancesTab);
	}
	
	private void makeCompareAutos() {
		compareAutosTab comAutos = new compareAutosTab();
		Tab comAutosTab = new Tab("Compare Autos", comAutos);
		mainTP.getTabs().addAll(comAutosTab);
	}
	
	private void makeCompareMatches() {
		compareMatchesTab comMatches = new compareMatchesTab();
		Tab comMatchesTab = new Tab("Compare Matches", comMatches);
		mainTP.getTabs().addAll(comMatchesTab);
	}
	
	private void makeFindBestTeam() {
		findBestTeamTab findTeam = new findBestTeamTab();
		Tab findTeamTab = new Tab("Find Best Team", findTeam);
		mainTP.getTabs().addAll(findTeamTab);
	}
	
	private void makeFindBestAllince() {
		findBestAllianceTab findAlliance = new findBestAllianceTab();
		Tab findAllianceTab = new Tab("Find Best Alliance", findAlliance);
		mainTP.getTabs().addAll(findAllianceTab);
	}
	
	private void makeFindBestAuto() {
		findBestAutoTab findAuto = new findBestAutoTab();
		Tab findAutoTab = new Tab("Find Best auto", findAuto);
		mainTP.getTabs().addAll(findAutoTab);
	}
	
	private void makeFindBestStat() {
		findBestStatTab findStat = new findBestStatTab();
		Tab findStatTab = new Tab("Find Best Stat", findStat);
		mainTP.getTabs().addAll(findStatTab);
	}
	
	private void makeFindBestRobotArchatype() {
		findBestRobotArchetype findArchetype = new findBestRobotArchetype();
		Tab findArchetypeTab = new Tab("Find Best Robot Archetype", findArchetype);
		mainTP.getTabs().addAll(findArchetypeTab);
	}
	
	private void makeCreateAllince() {
		createAllianceTab creAlliance = new createAllianceTab();
		Tab creAllianceTab = new Tab("Create Alliance", creAlliance);
		mainTP.getTabs().addAll(creAllianceTab);
	}
	
	private void makeCreateMatch() {
		createMatchTab creMatch = new createMatchTab();
		Tab creMatchTab = new Tab("Create Match", creMatch);
		mainTP.getTabs().addAll(creMatchTab);
	}
	
	private void makeCreateAutoPlan() {
		createAutoPlanTab creAutoPlan = new createAutoPlanTab();
		Tab creAutoPlanTab = new Tab("Create Auto Plan", creAutoPlan);
		mainTP.getTabs().addAll(creAutoPlanTab);
	}
	
	private void makeCreateMatchPlan() {
		createMatchPlanTab creMatchPlan = new createMatchPlanTab();
		Tab creMatchPlanTab = new Tab("Create Match Plan", creMatchPlan);
		mainTP.getTabs().addAll(creMatchPlanTab);
	}
	
	private void makeSetPlayOffAlliance() {
		setPlayOffAlliancesTab setPlayOff = new setPlayOffAlliancesTab();
		Tab setPlayOffTab = new Tab("Set Play Off Alliances", setPlayOff);
		mainTP.getTabs().addAll(setPlayOffTab);
	}
	
	private void makeEditPlayOffAlliance() {
		editPlayOffAlliancesTab editPlayOff = new editPlayOffAlliancesTab();
		Tab editPlayOffTab = new Tab("Edit Play Off Alliances", editPlayOff);
		mainTP.getTabs().addAll(editPlayOffTab);
	}
	
	private void makeDeletePlayOffAlliance() {
		deletePlayOffAlliancesTab deletePlayOff = new deletePlayOffAlliancesTab();
		Tab deletePlayOffTab = new Tab("Delete Play Off Alliances", deletePlayOff);
		mainTP.getTabs().addAll(deletePlayOffTab);
	}
	
	private void makeOpenNewScData(TempTeamList mainTempTeamList) {
		openNewScDataTab openScData = new openNewScDataTab(mainTempTeamList);
		Tab openScDataTab = new Tab("Open New Scouting Data", openScData);
		mainTP.getTabs().addAll(openScDataTab);
	}
	
	private void makeOpenNewPitData() {
		openNewPitDataTab openPitData = new openNewPitDataTab();
		Tab openPitDataTab = new Tab("Open New Pit Data", openPitData);
		mainTP.getTabs().addAll(openPitDataTab);
	}
	
	private void makeOpenNewDriveTeamData() {
		openNewDriveTeamDataTab openDriveTeamData = new openNewDriveTeamDataTab();
		Tab openDriveTeamDataTab = new Tab("Open New DriveTeam Data", openDriveTeamData);
		mainTP.getTabs().addAll(openDriveTeamDataTab);
	}
	
	private void makeOpenNewDriveTeamComs() {
		openNewDriveTeamComsTab openDriveTeamComs = new openNewDriveTeamComsTab();
		Tab openDriveTeamComsTab = new Tab("Open New DriveTeam Comments", openDriveTeamComs);
		mainTP.getTabs().addAll(openDriveTeamComsTab);
	}
	
	private void makeEditScData() {
		editScDataTab edScData = new editScDataTab();
		Tab edScDataTab = new Tab("Edit Scouting Data", edScData);
		mainTP.getTabs().addAll(edScDataTab);
	}
	
	private void makeEditPitData() {
		editPitDataTab edPitData = new editPitDataTab();
		Tab edPitDataTab = new Tab("Edit Pit Data", edPitData);
		mainTP.getTabs().addAll(edPitDataTab);
	}
	
	private void makeEditDriveTeamData() {
		editDriveTeamDataTab edDriveTeamData = new editDriveTeamDataTab();
		Tab edDriveTeamDataTab = new Tab("Edit Drive Team Data", edDriveTeamData);
		mainTP.getTabs().addAll(edDriveTeamDataTab);
	}
	
	private void makeEditDriveTeamComs() {
		editDriveTeamComsTab edDriveTeamComs = new editDriveTeamComsTab();
		Tab edDriveTeamComsTab = new Tab("Edit Drive Team Comments", edDriveTeamComs);
		mainTP.getTabs().addAll(edDriveTeamComsTab);
	}
	
	private void makeExportScData() {
		exportScDataTab exScData = new exportScDataTab();
		Tab exScDataTab = new Tab("Export Scouting Data", exScData);
		mainTP.getTabs().addAll(exScDataTab);
	}
	
	private void makeExportPitData() {
		exportPitDataTab exPitData = new exportPitDataTab();
		Tab exPitDataTab = new Tab("Export Pit Data", exPitData);
		mainTP.getTabs().addAll(exPitDataTab);
	}
	
	private void makeExportDriveTeamData() {
		exportDriveTeamDataTab exDriveTeamData = new exportDriveTeamDataTab();
		Tab exDriveTeamDataTab = new Tab("Export Drive Team Data", exDriveTeamData);
		mainTP.getTabs().addAll(exDriveTeamDataTab);
	}
	
	
	private void makeExportDriveTeamComs() {
		exportDriveTeamComsTab exDriveTeamComs = new exportDriveTeamComsTab();
		Tab exDriveTeamComsTab = new Tab("Export Drive Team Comments", exDriveTeamComs);
		mainTP.getTabs().addAll(exDriveTeamComsTab);
	}
	
	private void makeHomePage() {
		homePageTab home = new homePageTab();
		Tab homeTab = new Tab("Home Page", home);
		mainTP.getTabs().addAll(homeTab);
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
				makeOpenNewScData(mainTempTeamList);
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
		} catch(Exception e) {
			System.out.println("error: " + e);
		}
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	
}
