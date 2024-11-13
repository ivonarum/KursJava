package Watki.Zadania;

public class WatekAs implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            System.out.println("Będę pierwszy - to ja WątekAs");
        }
        System.out.println("ZAKOŃCZYŁEM! Melduje się WątekAs");
    }
}
