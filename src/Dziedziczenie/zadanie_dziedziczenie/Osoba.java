package Dziedziczenie.zadanie_dziedziczenie;

public class Osoba {
    //pola
    public String imie;
    public String nazwisko;

    //konstruktor

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    //metody
    public void przedstawSie() {
        System.out.printf("Jestem " + imie + " " + nazwisko);
    }
}
