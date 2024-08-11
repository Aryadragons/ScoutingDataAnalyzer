package application;

import java.util.List;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

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
				List<Auto> autos;
				autoStartPosS = startPosTF.getText();
				autoControledS = notesPickedTF.getText();
				autoSpeS = notesSpeTF.getText();
				autoAmpS = notesAmpTF.getText();
				autoStartPos = Integer.parseInt(autoStartPosS);
				autoControled = Integer.parseInt(autoControledS);
				autoSpe = Integer.parseInt(autoSpeS);
				autoAmp = Integer.parseInt(autoAmpS);
				autos = theAutoList.getAllAutos(autoStartPos, autoControled, autoSpe);
				int color = 1;
				Boolean inDecreaseMode = false;
				for(int i = 0; i < autos.size(); i++) {
					Auto a = autos.get(i);
					System.out.println(a);
					int teamNum = a.getTeamNum();
					int numCenNotes = a.getNumCenNotes();
					int timesUsed = a.getTimesUsed();
					double avgSpe = a.getAvgSpe();
					double avgAmp = a.getAvgAmp();
					double avgControl = a.getAvgControl();
					Label teamNumL = new Label(Integer.toString(teamNum));
					Label numCenNotesL = new Label(Integer.toString(numCenNotes));
					Label timesUsedL = new Label(Integer.toString(timesUsed));
					Label avgSpeL = new Label(Double.toString(avgSpe));
					Label avgAmpL = new Label(Double.toString(avgAmp));
					Label avgControlL = new Label(Double.toString(avgControl));
					teamNumL.setId("TitleLabelPlay");
					numCenNotesL.setId("avgStat");
					timesUsedL.setId("avgStat");
					avgSpeL.setId("avgStat");
					avgAmpL.setId("avgStat");
					avgControlL.setId("avgStat");
					Label numCenNotesQL = new Label("Num Of Center Notes:");
					Label timesUsedQL = new Label("Times Used:");
					Label avgSpeQL = new Label("Avg Speaker:");
					Label avgAmpQL = new Label("Avg Amp:");
					Label avgControlQL = new Label("Avg Notes Controled:");
					numCenNotesQL.setId("smallTitle");
					timesUsedQL.setId("smallTitle");
					avgSpeQL.setId("smallTitle");
					avgAmpQL.setId("smallTitle");
					avgControlQL.setId("smallTitle");
					VBox autoStatsVB = new VBox(5);
					autoStatsVB.getChildren().addAll(numCenNotesQL, numCenNotesL, timesUsedQL, timesUsedL, avgSpeQL, avgSpeL, avgAmpQL, avgAmpL, avgControlQL, avgControlL);
					BorderPane autoStatsBP = new BorderPane();
					autoStatsBP.setTop(teamNumL);
					autoStatsBP.setCenter(autoStatsVB);
					int posWidth = 1 + (i * 2);
					int posHeight = 2 ;
					if(posWidth > 5) {
						System.out.println("i:" + i);
						posHeight = ((posWidth / 5) * 2) + 2;
						int timesOver = posWidth/5;
						int b = posWidth - (timesOver * 5);
						int mius = (posWidth - (5 * posWidth/5) + 1);
						System.out.println("Boop" + mius);
						posWidth = mius ;
					}
					if(color > 9) {
						inDecreaseMode = true;
						color = color - 1;
					}
					if(color < 1) {
						color = 1;
					}
					if(inDecreaseMode == true) {
						color = color - 1;
						String id = "seAutoStatBP" + color;
						autoStatsBP.setId(id);
					}else{
						String id = "seAutoStatBP" + color;
						System.out.println(id);
						autoStatsBP.setId(id);
						color++;
					}
					System.out.println(posWidth);
					System.out.println(posHeight);
					this.add(autoStatsBP, posWidth, posHeight);
				}
			}
		}catch(Exception e) {
			System.out.println("Error: " + e);
		}
	}
}
