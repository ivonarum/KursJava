package Klasy.KlasyZadania.Zadanie3;

public class Matma {

    // pola
    public static final double mojePi = 3.14;

    // konstruktor domyślny


    // metody z podanymi argumentami
    public static double obwodKola(double r) {
        if(r >= 0) {
            return 2 * mojePi * r;
        }
        throw new LiczbaUjemnaException();

    }

    public static double poleKola(double r) {
        return mojePi * r * r;
    }

    public static double obwodProstokata(double a, double b) {
        return 2 * a + 2 * b;
    }

    public static double poleProstokata(double a, double b) {
        return a * b;
    }
}
