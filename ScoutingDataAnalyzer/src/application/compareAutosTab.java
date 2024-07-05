package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class compareAutosTab extends GridPane{
	
	private TextField startPosA1TF;
	private TextField notesPickedA1TF;
	private TextField notesSpeA1TF;
	private TextField notesAmpA1TF;
	private TextField startPosA2TF;
	private TextField notesPickedA2TF;
	private TextField notesSpeA2TF;
	private TextField notesAmpA2TF;
	private Button submitB;
	
	public compareAutosTab() {
		this.add(new Label("Start Postion of Auto 1:"), 0, 0);
		this.add(new Label("Notes Picked Up for Auto 1:"), 1, 0);
		this.add(new Label("Notes Scored in the Speaker for Auto 1:"), 2, 0);
		this.add(new Label("Notes Scored in the Amp for Auto 1:"), 3, 0);
		this.add(new Label("Start Postion of Auto 1:"), 0, 2);
		this.add(new Label("Notes Picked Up for Auto 1:"), 1, 2);
		this.add(new Label("Notes Scored in the Speaker for Auto 1:"), 2, 2);
		this.add(new Label("Notes Scored in the Amp for Auto 1:"), 3, 2);
		startPosA1TF = new TextField();
		notesPickedA1TF = new TextField();
		notesSpeA1TF = new TextField();
		notesAmpA1TF = new TextField();
		startPosA2TF = new TextField();
		notesPickedA2TF = new TextField();
		notesSpeA2TF = new TextField();
		notesAmpA2TF = new TextField();
		this.add(startPosA1TF, 0, 1);
		this.add(notesPickedA1TF, 1, 1);
		this.add(notesSpeA1TF, 2, 1);
		this.add(notesAmpA1TF, 3, 1);
		this.add(startPosA2TF, 0, 3);
		this.add(notesPickedA2TF, 1, 3);
		this.add(notesSpeA2TF, 2, 3);
		this.add(notesAmpA2TF, 3, 3);
		//Adding Submit Button
		submitB = new Button("Submit");
		this.add(submitB, 0, 4);
	}
}
