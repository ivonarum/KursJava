package Klasy.KlasyZadania.Zadanie1;

public class Programista {

    //ponizej mamy utworzone pola
        private String imie;
        private String nazwisko;
        private String jezykProgramowania;
        private double zarobki;

        //tworzymy kostruktor (do poszczegolnych pol sa przypisane argumenty(zmienne)
        public Programista(String podajImie, String podajNazwisko, String podajJezyk, double podajWynagrodzenie) {
        imie = podajImie;
        nazwisko = podajNazwisko;
        jezykProgramowania = podajJezyk;
        zarobki = podajWynagrodzenie;

    }

    //tworzymy metody
    public String pobierzImie() {
        return imie;
    }
    public String pobierzNazwisko() {
        return nazwisko;
    }
    public String pobierzJezyk() {
        return jezykProgramowania;
    }
    public double pobierzWynagrodzenie() {
        return zarobki;
    }

    }
