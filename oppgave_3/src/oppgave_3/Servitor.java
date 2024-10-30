package oppgave_3;

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
		Hamburger h = bRef.takeHamburger();
		while (h == null) {
			System.out.println("Server: " + name + " tried to take a burger but the plate was empty. Waiting on cooks. brett: " + bRef.getBrett());
		}
		System.out.println("Server: " + name + " takes hamburger " + h + " from the plate. Brett: " + bRef.getBrett());
		}
	}

}
