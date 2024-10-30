package oppgave_2;

import java.util.concurrent.atomic.AtomicInteger;

public class Hamburger {
	private static final AtomicInteger counter = new AtomicInteger(0);
	private final int ID;
	
	public Hamburger() {
		this.ID = counter.incrementAndGet();
	}
	
	@Override
	public String toString() {
		return "◖" + ID + "◗";
	}
}
