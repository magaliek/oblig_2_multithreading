package oppgave_2;

import java.util.ArrayDeque;

public class Brett {
	
	private final int KAPASITET;
	ArrayDeque<Hamburger> brett = new ArrayDeque<>();
	
	
	public Brett(int capacity) {
		this.KAPASITET = capacity;
	}
	
	public boolean isFull() {
		if (brett.size() >= KAPASITET) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		if (brett.size() <= 0) {
			return true;
		}
		return false;
	}
	
	public int size() {
		return brett.size();	
	}
	
	public synchronized Hamburger setHamburger() {
		Hamburger h = new Hamburger();
		brett.addLast(h);
		return h;
	}
	
	public synchronized Hamburger takeHamburger() {
		Hamburger h = brett.removeLast();
		return h;
	}
	
	public ArrayDeque<Hamburger> getBrett() {
		return brett;
	}
}
