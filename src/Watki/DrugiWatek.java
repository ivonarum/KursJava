package Watki;

public class DrugiWatek extends  Thread {
    @Override
    public void run() {
        System.out.println("z drugiego wątku");
        for (int i = 0; i < 900; i++) {
            System.out.println("Drugi Wątek: " + i);
        }
    }
}
