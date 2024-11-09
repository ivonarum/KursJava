package Watki;

public class MainWatek {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MojWatekPierwszy());
        thread1.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
        Thread thread2 = new Thread(new WatekDrugi());
        thread2.start();



    }
}