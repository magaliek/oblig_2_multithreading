package oppgave_2;

public class Servitor implements Runnable {
	
	private String name;
	private Brett bRef;

	public Servitor(String name, Brett bRef) {
		this.name = name;
		this.bRef = bRef;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public void run() {
		while(true) {
			synchronized (bRef) {
				while (bRef.isEmpty()) {
					try {
						System.out.println("server " + name + " is waiting on empty plate.");
						bRef.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				Hamburger h = bRef.takeHamburger();
				bRef.notifyAll();
				System.out.println("server " + name + " is taking burger: " + h + " brett: " + bRef.getBrett());
			}
		}
	}
}
