package Watki.Zadania;

public class WatekZadanie1 implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }
        System.out.println("Ta informacja została wypisana z klasy anonimowej i z mojego wątku");
    }
}
