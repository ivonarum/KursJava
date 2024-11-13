package Watki.Zadania;

public class WatekBet implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            System.out.println("Będę pierwszy - to ja WątekBet");
        }
        System.out.println("ZAKOŃCZYŁEM! Melduje się WątekBet");
    }
}
