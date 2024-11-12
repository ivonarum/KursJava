package Watki;

public class MainWatkiSleep {
    public static void main(String[] args) {
        System.out.println("Gotowi?");
        try {Thread.sleep(3000);} catch (InterruptedException e) {}
        System.out.println("Start!");

        Thread thread = new Thread(new Runnable() {
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("Wątek: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) { }
        }
    }
});


Thread thread1 = new Thread(new Runnable() {
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("Wątek2: " + i);
        }
        }
});
        thread.start();

        try {Thread.sleep(500);} catch (InterruptedException e) {}

        thread1.start();

    }
}