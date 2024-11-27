package Podsumowanie.Telewizory.Philips;

public abstract class TelewizorPhilipsAmbilight extends TelewizorPhilips {
// pola

    // konstruktor
    public TelewizorPhilipsAmbilight(String id, int cale) {
        super(id, cale);
    }
//metody
    @Override
    public void wlacz() {
        super.wlacz();
        ambilight();
    }

    @Override
    public void wylacz() {
        super.wylacz();
    }

    @Override
    public void przelaczProgram(int numer) {
        super.przelaczProgram(numer);
    }

    private void ambilight() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(statusWlaczony) {
                    System.out.println("Wyświetl kolorowe diody z tyłu");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();
    }
}
