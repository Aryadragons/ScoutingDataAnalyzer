package application;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class compareAlliancesTab extends GridPane{
	
	private ComboBox<String> allince1CB;
	private ComboBox<String> allince2CB;
	private ComboBox<String> allince3CB;
	private ComboBox<String> allince4CB;
	private ComboBox<String> allince5CB;
	private ComboBox<String> allince6CB;
	private Button submitB;
	
	public compareAlliancesTab() {
		this.add(new Label("Select the 1st team on Allince 1"), 0, 0);
		this.add(new Label("Select the 2nd team on Allince 1"), 1, 0);
		this.add(new Label("Select the 3rd team on Allince 1"), 2, 0);
		this.add(new Label("Select the 1st team on Allince 2"), 3, 0);
		this.add(new Label("Select the 2nd team on Allince 2"), 4, 0);
		this.add(new Label("Select the 3rd team on Allince 2"), 5, 0);
		allince1CB = new ComboBox<String>();
		allince2CB = new ComboBox<String>();
		allince3CB = new ComboBox<String>();
		allince4CB = new ComboBox<String>();
		allince5CB = new ComboBox<String>();
		allince6CB = new ComboBox<String>();
		allince1CB.getItems().addAll("1234", "5678");
		allince2CB.getItems().addAll("1234", "5678");
		allince3CB.getItems().addAll("1234", "5678");
		allince4CB.getItems().addAll("1234", "5678");
		allince5CB.getItems().addAll("1234", "5678");
		allince6CB.getItems().addAll("1234", "5678");
		this.add(allince1CB, 0, 1);
		this.add(allince2CB, 1, 1);
		this.add(allince3CB, 2, 1);
		this.add(allince4CB, 3, 1);
		this.add(allince5CB, 4, 1);
		this.add(allince6CB, 5, 1);
		//adding button
		submitB = new Button("Submit");
		this.add(submitB, 6, 1);
	}
}
