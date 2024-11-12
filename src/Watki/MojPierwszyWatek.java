package Watki;

public class MojPierwszyWatek extends Thread {
    @Override
    public void run() {  //metoda zawsze musi sie nazywac RUN
        System.out.println("z pierwszego wątku");
        for(int i=0; i < 900; i++) {
            System.out.println("Pierwszy Wątek: " + i);
        }
    }
}
