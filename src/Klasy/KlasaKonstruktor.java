package Klasy;

public class KlasaKonstruktor {
    int pierwszePole;
    int drugiePole;

    //nazwa konstruktora taka sama jak klasy, w nawiasie parametry, w klamrze jakas akcja wyliczenia
    KlasaKonstruktor() {
        pierwszePole = 123;
        drugiePole = 456;
    }

    KlasaKonstruktor(int wartoscPierwsza) {
        pierwszePole = wartoscPierwsza;
        drugiePole = 1000;
    }

    KlasaKonstruktor(int wartoscPierwsza, int wartoscDruga) {
        System.out.println("Jestem w Konstruktorze z dwoma PARAMETRAMI");
        pierwszePole = wartoscPierwsza;
        drugiePole = wartoscDruga;
    }
}
