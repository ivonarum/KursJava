package Watki;

public class MainWatkiInterrupt {
    public static void main(String[] args) throws InterruptedException {
// sleep
        Thread watekSleepThread = new Thread(new WatekSleepRunnable());
watekSleepThread.start();
watekSleepThread.interrupt();

Thread watekInterruptedThread = new Thread(new WatekInterruptedRunnable());
watekInterruptedThread.start();

        Thread.sleep(1000);

watekInterruptedThread.interrupt();

// Flaga
        WatekFlagaRunnable watekFlagaRunnable = new WatekFlagaRunnable();
        Thread watekFlagaThread = new Thread(watekFlagaRunnable);
        watekFlagaThread.start();

        Thread.sleep(1000);

        watekFlagaRunnable.zatrzymajWatek();
}
}