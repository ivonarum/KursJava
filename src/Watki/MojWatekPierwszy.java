package Watki;

public class MojWatekPierwszy implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 9000; i++) {
            System.out.println("Watek pierwszy: " + i);
        }
    }


}
