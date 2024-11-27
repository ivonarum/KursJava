package Podsumowanie.Telewizory.Philips;

import Podsumowanie.Telewizory.Telewizor;

public abstract class TelewizorPhilips implements Telewizor {
    // pola
    private final String id;

    protected boolean statusWlaczony = false;

    private int obecnyProgram = 3;

    int numer;

    private final int cale;

    // konstruktor
    public TelewizorPhilips(String id, int cale) {
        this.id = id;
        this.cale = cale;
    }

    // metody
    public String getId() {
        return id;
    }

    @Override
    public void wlacz() {
        statusWlaczony = true;
        emitujSygnalNaEkran();
        System.out.println("Witaj!");
    }

    @Override
    public void wylacz() {
        statusWlaczony = false;
        System.out.println("CZARNY EKRAN");
    }

    @Override
    public void przelaczProgram(int numer) {
        if(statusWlaczony) {
            obecnyProgram = numer;
        }
    }

    private void emitujSygnalNaEkran() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (statusWlaczony) {
                    System.out.println("Program: " + obecnyProgram);
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();
    }

    @Override
    public void akcjaZasilania() {
        if (statusWlaczony) {
            wylacz();
        } else wlacz();
    }
}
