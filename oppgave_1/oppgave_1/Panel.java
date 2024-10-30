package oppgave_1;

import javax.swing.JOptionPane;

public class Panel {
	
	private String input = "Hello World";
	
	public void showDialogBox() {
		input = JOptionPane.showInputDialog("Skriv setning under, eller Quit.");
	}

	public String getInput() {
		return input;
	}
}
