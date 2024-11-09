package Dziedziczenie;

public class KlasaPodstawowa {

    int polePierwsze;
    int poleDrugie;
private int liczba;

    //konstruktor
    KlasaPodstawowa() {
        System.out.println("Wywolalam konstruktor z klasy podstawowej");
    }

    KlasaPodstawowa(int a) {
        System.out.println("Wywołałam konstruktor z klasy podstawowej z wartością: " + a);
    }

    //metody
    public void ustawLiczba(int liczba) {
        this.liczba = liczba;
    }
    public void wyswietlLiczbe() {
        System.out.println("Liczba: " + liczba);
    }

    public void metodaPierwsza() {
        System.out.println("Wypisano z metody pierwszej");
    }

    public  void  metodaDruga() {
        System.out.println("Wypisano z metody drugiej");

    }
}
