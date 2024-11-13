package Watki;

public class WatekSleepRunnable implements Runnable{
    @Override
    public void run() {
        while(true) {
            System.out.println("Wątek Sleep");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Poszedl exception w sleepie");
                return;
            }
        }
    }
}
