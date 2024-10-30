package oppgave_3;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Brett {
	
	private final int KAPASITET;
	BlockingQueue<Hamburger> brett;
	boolean started;
	
	public Brett(int capacity) {
		this.KAPASITET = capacity;
		this.brett = new LinkedBlockingQueue<>(KAPASITET);
	}
	
	public boolean setHamburger(Hamburger h) {
		try {
			brett.put(h);
			return true;
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			return false;
		}
	}
	
	public Hamburger takeHamburger() {
		try {
			return brett.take();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			return null;
		}
	}
	
	public BlockingQueue<Hamburger> getBrett() {
		return brett;
	}
}
