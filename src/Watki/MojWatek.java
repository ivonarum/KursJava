package Watki;

public class MojWatek implements Runnable{ //inny sposób na utworzenie wątku
  // implements - można wiele interfejsów dodawać,
    // a extends - dziedziczenie tylko po 1 klasie mozliwe

    @Override
    public void run() {
        System.out.println("watek mój");
    }
}
