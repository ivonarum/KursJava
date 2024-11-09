package com.nazwa.app.jeden;

// import com.nazwa.app.dwa.KlasaB;
import com.nazwa.app.dwa.*;

public class KlasaA {
    public int polePubliczne; // dost wszedzie, w każdej Klasie
    protected int poleDziedziczenie; // dost dziedziczeniu oraz w tym samym package'u
    private int polePrywatne; // dost tylko w obrębie bieżącej klasy
    int poleBezNiczego; // package - dost w tym samym package'u

    public void metoda() {
        polePrywatne = 20;
    }

    protected void metodaProtected() {

    }

    private void metodaPrywatna() {

    }

    void metodaBezNiczego() {
        metodaPrywatna();
    }
}
