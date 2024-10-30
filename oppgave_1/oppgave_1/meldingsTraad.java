package oppgave_1;

public class meldingsTraad implements Runnable {
	
	private Panel panelRef;
	private volatile boolean running = true;
	
	public meldingsTraad(Panel panelRef) {
		this.panelRef = panelRef;
	}
	
	@Override
	public void run() {
		while (panelRef.getInput() != null && running) {
			System.out.println(panelRef.getInput());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.err.println("Thread Interrupted");
				break;
			}
			
			if ("quit".equalsIgnoreCase(panelRef.getInput())) {
				running = false;
			}
		}
	}
}