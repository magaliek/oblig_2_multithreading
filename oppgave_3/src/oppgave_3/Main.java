package oppgave_3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Brett b = new Brett(4);

        ArrayList<Thread> threads = new ArrayList<>();

        threads.add(new Thread(new Kokk("Martha", b)));
        threads.add(new Thread(new Kokk("Lily", b)));
        threads.add(new Thread(new Kokk("Miriame", b)));
        threads.add(new Thread(new Servitor("Buck", b)));
        threads.add(new Thread(new Servitor("Leo", b)));

        for (Thread thread : threads) {
            thread.start();
        }
    }
}
