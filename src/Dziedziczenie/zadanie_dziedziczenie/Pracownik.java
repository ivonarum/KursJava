package Dziedziczenie.zadanie_dziedziczenie;

public class Pracownik extends Osoba {
   //pola
   public String stanowisko;
    public String nazwaFirmy;

    //konstruktor

    public Pracownik(String imie, String nazwisko, String nazwaFirmy, String stanowisko) {
        super(imie, nazwisko);
        this.nazwaFirmy = nazwaFirmy;
        this.stanowisko = stanowisko;
    }


    //metody
    @Override
    public void przedstawSie() {
        super.przedstawSie();
        {
            System.out.printf(" i pracuję w firmie " + nazwaFirmy + " na stanowisku " + stanowisko);
        }
    }
}

