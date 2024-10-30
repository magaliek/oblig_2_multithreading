package oppgave_2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Brett b = new Brett(4);

        ArrayList<Thread> threads = new ArrayList<>();

        threads.add(new Thread(new Kokk("Colette", b)));
        threads.add(new Thread(new Kokk("Janice", b)));
        threads.add(new Thread(new Kokk("Georg", b)));
        threads.add(new Thread(new Servitor("Soleil", b)));
        threads.add(new Thread(new Servitor("Victor", b)));

        for (Thread thread : threads) {
            thread.start();
        }
    }
}
