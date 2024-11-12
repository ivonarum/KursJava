package Watki;

public class MainWatkiThread {
    public static void main(String[] args) {

        // klasa Thread
        Thread watek = new MojPierwszyWatek();
        Thread watekDrugi = new DrugiWatek();

        watek.start();
        watekDrugi.start();
    }
}