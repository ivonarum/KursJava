package Klasy;

public class KlasaZPolami {
    int liczbaCalkowita;
    char znak;

    void zwrocWartoscPola() {
        System.out.println("zwrocona wartosc pola: " + liczbaCalkowita);
    }

    void ustawWartoscPola(int wartosc) {
        liczbaCalkowita = wartosc;
    }

    int zwrocWartoscPolazMetody() {
        return liczbaCalkowita;
    }
}
