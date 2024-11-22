package Podsumowanie;

public class TelewizorSamsung implements Telewizor{

    private boolean stanWlaczony = false;
    private int numerKanalu = 1;
    private int cale;

    protected TelewizorSamsung(int cale) {
        this.cale = cale;
    }

    @Override
    public void wlacz() {
        stanWlaczony = true;
        System.out.println("SAMSUNG TV");
        wyswietlajObraz();
    }

    private void wyswietlajObraz() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(stanWlaczony) {
                    try { System.out.println("Wyświetlaj obraz: " + numerKanalu);
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
    }

    @Override
    public void wylacz() {
        System.out.println("ANIMACJA PRZYCIEMNIENIA");
        // animacja zamkniecia ekranu
        stanWlaczony = false;
    }

    @Override
    public void przelaczProgram(int numer) {
        if(stanWlaczony) {
            numerKanalu = numer;
        }
    }
}
