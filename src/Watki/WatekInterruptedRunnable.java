package Watki;

public class WatekInterruptedRunnable implements Runnable {
    @Override
    public void run() {
//        while(true) {
//            System.out.println("Watek Interrupted Runnable działa");
//            if(Thread.interrupted()) {
//                System.out.println("Zakonczyl dzialanie bo interrupted()");
//                return;
        // lub inaczej:
        while(!Thread.interrupted()) {  // =dopóki wątek NIE JEST przerwany rób to:
            System.out.println("Watek Interrupted Runnable działa");
            }
        System.out.println("Poza whilem i koniec");

    }
    }

