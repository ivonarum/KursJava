package Klasy;

public class Metody {
    public static void main(String[] args) {
        // ang. methods

        KlasaDlaMetody nazwaObiektu = new KlasaDlaMetody();
        nazwaObiektu.metodaKtoraNicNieZwraca();
        nazwaObiektu.metodaKtoraPrzyjmujeArgument(5, 'b'); // wartosc w () to argument
        nazwaObiektu.kolejnaMetoda(false, 100);

        int wynikDodawanie = nazwaObiektu.dodawanie(10,5);
        System.out.println("wynikDodawanie: " + wynikDodawanie);

        double wynikKolejnejMetody = nazwaObiektu.dodajPoPrzecinku(10.1);
        System.out.println("po przecinku: " + wynikKolejnejMetody);

        System.out.println("wartosc logiczna: " + nazwaObiektu.zamienWartoscLogiczna(true));

        nazwaObiektu.voidKtoryMialbyCosZwracac(false);
    }
}
