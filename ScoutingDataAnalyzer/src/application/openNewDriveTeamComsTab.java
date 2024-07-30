package application;

import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

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
