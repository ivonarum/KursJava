package Watki;

public class MainWatkiRunnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new MojWatek());
        thread.start();

        // tworzymy wątek poprzez klasę anonimową
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 100; i++) {
                    System.out.println("jestem z klasy anonimowej dla watkow: " + i);
                }
            }
        });
        thread1.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 100; i++) {
                    System.out.println("bez przypisania do zmiennej" + i);
                }
            }
        }).start();

    }
}