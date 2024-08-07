package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class deletePlayOffAlliancesTab extends GridPane implements EventHandler<ActionEvent>{
	
	private Button yesB;
	private TextField doneTF;
	
	public deletePlayOffAlliancesTab() {
		BorderPane delBP = new BorderPane();
		Label clearL = new Label("Clear out all Playoff Alliances?");
		clearL.setId("TitleLabelPlay");
		this.add(new Label("    "), 0, 0);
		yesB = new Button("Yes");
		yesB.setOnAction(this);
		delBP.setTop(clearL);
		delBP.setCenter(yesB);
		delBP.setId("BPA4");
		this.add(delBP, 1, 1);
	}

	@Override
	public void handle(ActionEvent event) {
		try {
			if(event.getSource() == yesB) {
				new FileWriter("PlayAlliancesFile.txt", false).close();
				FileWriter fw = new FileWriter("PlayAlliancesFile.txt", true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw);
				for(int i = 0; i < 32; i++) {
					out.println(0);
				}
				out.close();
				Label doneL = new Label("Deteled");
				doneL.setId("EditedPlay");
				this.add(doneL, 1, 1);
			}
		} catch(Exception e) {
			System.out.println("Error: " + e);
		}
	}
	
}
