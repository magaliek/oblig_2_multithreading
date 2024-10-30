package oppgave_3;

import java.util.Random;

public class Kokk implements Runnable {
	private String name;
	private Brett bRef;
	private Random rd = new Random();
	
	public Kokk(String name, Brett bRef) {
		this.name = name;
		this.bRef = bRef;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public void run() {
		while (true) {
			Hamburger h = null;
			boolean b = false;
			try {
				Thread.sleep(rd.nextInt(2000, 6000));
				h = new Hamburger();
				b = bRef.setHamburger(h);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			while (!b) {
				System.out.println("Cook: " + name + " tried to set down a burger but the plate was full. Waiting on servers. Brett: " + bRef.getBrett());
			}
			System.out.println("Cook: " + name + " puts hamburger " + h + " on the plate. Brett: " + bRef.getBrett());
			
		}
	}
}
