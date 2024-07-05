package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class searchAutosTab extends GridPane{
	
	private TextField startPosTF;
	private TextField notesPickedTF;
	private TextField notesSpeTF;
	private TextField notesAmpTF;
	private Button submitB;
	
	public searchAutosTab() {
		this.add(new Label("Auto Start Postion:"), 0, 0);
		this.add(new Label("Notes Picked Up:"), 1, 0);
		this.add(new Label("Notes Scored In Speaker"), 2, 0);
		this.add(new Label("Notes Scored In Amp"), 3, 0);
		startPosTF = new TextField();
		notesPickedTF = new TextField();
		notesSpeTF = new TextField();
		notesAmpTF = new TextField();
		this.add(startPosTF, 0, 1);
		this.add(notesPickedTF, 1, 1);
		this.add(notesSpeTF, 2, 1);
		this.add(notesAmpTF, 3, 1);
		submitB = new Button("Submit");
		this.add(submitB, 4, 1);
		
	}
}
