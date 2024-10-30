package oppgave_1;

public class panelCallThread implements Runnable  {
	
	Panel pRef = new Panel();
	public panelCallThread(Panel pRef) {
		this.pRef = pRef;
	}
	
	@Override
	public void run() {
		while (pRef.getInput() != null && !"quit".equalsIgnoreCase(pRef.getInput())) {
			pRef.showDialogBox();
		}
	}

}
