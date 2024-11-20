package Paradygmaty;

public class Osoba {
    // enkapsulacja - hermetyzacja, ograniczony dostęp do danych
    // pola będą prywatne a metody publiczne(tylko te konieczne) oraz metody prywatne
    // często używane będą 'gettery' oraz 'settery'
    private String imie;
    private String nazwisko;

    private Zwierze zwierze;

    public void przygarnijZwierze(Zwierze zwierze) {
        this.zwierze = zwierze;
    }


    public void jakNazywaSieTwojeZwierze() {
        if(zwierze !=null) {
            zwierze.przedstawSie();
        } else {
            System.out.println("Nie mam zwierzątka.");
    }

//    public String getImie() {
//        return imie;
//    }
//
//    public void setImie(String imie) {
//        this.imie = imie;
//    }
//
//    public String getNazwisko() {
//        return nazwisko;
//    }
//
//    public void setNazwisko(String nazwisko) {
//        this.nazwisko = nazwisko;
//    }
//
//    public  void zmienNazwisko(String nazwisko) {
//        //cały proces urzędowy .. slub.. itp.
//        this.nazwisko = nazwisko;
//    }
//
//    private void cosRobiTylkoTutaj() {
//        // ta metoda dostepna tylko w tej klasie
    }
}
