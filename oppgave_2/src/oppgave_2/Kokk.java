package oppgave_2;

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
			synchronized(bRef) {
			while (bRef.isFull()) {
				try {
					System.out.println("cook " + name + " is waiting on full plate.");
					bRef.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			try {
				Thread.sleep(rd.nextInt(2000, 6000));
				System.out.println(name + " is making a burger");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Hamburger h = bRef.setHamburger();
			bRef.notifyAll();
			System.out.println("cook " + name + " is setting down burger: " + h + " brett: " + bRef.getBrett());
			}
		}
	}
}
