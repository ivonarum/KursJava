package Watki.Zadania;

public class Czasoodmierzacz implements Runnable {
    @Override
    public void run() {
        System.out.println("Start!");
        for(int i = 1; i < 6; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            System.out.println("Działam już " + i + " sekund");
        }
    }
}
