package Watki;

public class WatekFlagaRunnable implements Runnable {

    private boolean watekDziala;

    @Override
    public void run() {
        watekDziala = true;
        while(watekDziala) {
            System.out.println("Wątek Flga działa");
        }
        System.out.println("Wątek Flaga zakończył działanie");
    }

public void zatrzymajWatek() {
        watekDziala = false;
}

}
