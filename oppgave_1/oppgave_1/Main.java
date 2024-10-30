package oppgave_1;

public class Main {

	public static void main(String[] args) {
		Panel p = new Panel();

		Thread pt = new Thread(new panelCallThread(p));
		Thread mt = new Thread(new meldingsTraad(p));
		
		pt.start();
		mt.start();
	}

}
