package Klasy;

public class KlasaDlaMetody {

    // typZwracany nazwaMetody(parametry) {}

    void metodaKtoraNicNieZwraca(){

        System.out.println("Wartość wypisana z metody");
    }

    void metodaKtoraPrzyjmujeArgument(int liczba, char pojedynczyZnak) { // liczba to parametr
               System.out.println("Wartość z metody " + liczba + " " + pojedynczyZnak);
    }

    void kolejnaMetoda(boolean czyPokazac, int liczba) {
        if(czyPokazac) {
            System.out.println("liczba: " + liczba);
        } else {
            System.out.println("Nie pozwolono pokazać");
        }
    }

    int dodawanie(int a, int b) {
        int wynik = a + b;
     //   System.out.println(wynik);
        return wynik;
    }

    double dodajPoPrzecinku(double liczbaDouble) {
        double wynik = liczbaDouble + 0.55;
        return wynik;
    }

    boolean zamienWartoscLogiczna(boolean wartoscLogiczna) {
        return !wartoscLogiczna;
    }

    int zwrocOdWartosciLogicznej(boolean czyZwrocic, int liczba) {
        if(czyZwrocic) {
            return liczba;
        } else {
            return 0;
        }
    }

    int przykladKolejnej(){
        System.out.println("Ta linijka kodu zostanie wykonana");
        return 100; // metoda zatrzymuje sie tutaj
     //   System.out.println("ta linijka kodu nie zostanie wykonana");
    }

    void voidKtoryMialbyCosZwracac(boolean czyZakonczyc) {
        if(czyZakonczyc){
            return;
        }
        System.out.println("cos napisane bo return nie zwraca wartosci logicznej");
    }

}
