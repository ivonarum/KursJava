package Klasy;

public class KlasaObiektProsty {
    public static void main(String[] args) {
        int typProsty = 100; //typ prosty
        Przyklad przyklad = new Przyklad(); //klasa i obiekt z tej klasy
        Przyklad przykladDrugi = new Przyklad();

        przyklad.pole = 10;
        przykladDrugi.pole = 11;

        System.out.println("przyklad: " + przyklad.pole);
        System.out.println("przykladDrugi: " + przykladDrugi.pole);

        System.out.println("wypisuje typ prosty: " + typProsty); //pod typem prostym kryje sie wartość

        System.out.println("wypisuje obiekt: " + przyklad); //pod obiektem kryje się adres do pamieci
    }
}
