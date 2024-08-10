package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class searchAutosTab extends GridPane implements EventHandler<ActionEvent>{
	
	private TextField startPosTF;
	private TextField notesPickedTF;
	private TextField notesSpeTF;
	private TextField notesAmpTF;
	private Button submitB;
	private AutoList theAutoList;
	
	public searchAutosTab(AutoList importedAutoList) {
		theAutoList = importedAutoList;
		Label selectPosL  = new Label("Auto Start Postion:");
		Label selectControledL  = new Label("Notes Controled Up:");
		Label selectSpeL  = new Label("Notes Scored In Speaker");
		Label selectAmpL  = new Label("Notes Scored In Amp");
		selectPosL.setId("smallTitle");
		selectControledL .setId("smallTitle");
		selectSpeL.setId("smallTitle");
		selectAmpL.setId("smallTitle");
		startPosTF = new TextField();
		notesPickedTF = new TextField();
		notesSpeTF = new TextField();
		notesAmpTF = new TextField();
		startPosTF.setId("seAutosTF");
		notesPickedTF.setId("seAutosTF");
		notesSpeTF.setId("seAutosTF");
		notesAmpTF.setId("seAutosTF");
		BorderPane selectPosBP = new BorderPane();
		BorderPane selectControledBP = new BorderPane();
		BorderPane selectSpeBP = new BorderPane();
		BorderPane selectAmpBP = new BorderPane();
		selectPosBP.setTop(selectPosL);
		selectControledBP.setTop(selectControledL);
		selectSpeBP.setTop(selectSpeL);
		selectAmpBP.setTop(selectAmpL);
		selectPosBP.setCenter(startPosTF);
		selectControledBP.setCenter(notesPickedTF);
		selectSpeBP.setCenter(notesSpeTF);
		selectAmpBP.setCenter(notesAmpTF);
		selectPosBP.setId("seAutosSelectBP1");
		selectControledBP.setId("seAutosSelectBP2");
		selectSpeBP.setId("seAutosSelectBP3");
		selectAmpBP.setId("seAutosSelectBP4");
		this.add(new Label("    "), 0, 0);
		this.add(new Label("    "), 2, 0);
		this.add(new Label("    "), 4, 0);
		this.add(new Label("    "), 6, 0);
		this.add(new Label("    "), 0, 2);
		this.add(selectPosBP, 1, 1);
		this.add(selectControledBP, 3, 1);
		this.add(selectSpeBP, 5, 1);
		this.add(selectAmpBP, 7, 1);
		submitB = new Button("Submit");
		submitB.setOnAction(this);
		this.add(submitB, 1, 3);
	}

	@Override
	public void handle(ActionEvent event) {
		try {
			if(event.getSource() == submitB) {
				String autoStartPosS;
				String  autoControledS;
				String  autoSpeS;
				String  autoAmpS;
				int autoStartPos;
				int autoControled;
				int autoSpe;
				int autoAmp;
				autoStartPosS = startPosTF.getText();
				autoControledS = notesPickedTF.getText();
				autoSpeS = notesSpeTF.getText();
				autoAmpS = notesAmpTF.getText();
				
			}
		}catch(Exception e) {
			System.out.println("Error: " + e);
		}
	}
}
