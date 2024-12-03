package TypWyliczeniowyEnum;

public enum Pizza {
    MALA(20, 9.90f),
    DUZA(34, 16.50f),
    FAMILIJNA(42, 21.00f),
    XXL(50, 27.90f);

    private float cena;
    private int rozmiar;    // pola prywatne musza byc, ale mozna zrobic publiczny GETTER

private Pizza(int rozmiar, float cena) {
    this.rozmiar = rozmiar;
    this.cena = cena;
}

    public int getRozmiar() {    //publiczny GETTER
        return rozmiar;
    }

    public float getCena() {
        return cena;
    }
}
