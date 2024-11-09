package Wyjatki.Zadania;

public class Zadanie2 {


    public static int podziel(int c, int d) throws ZeroException {

        if (d != 0) {
            return c / d;
        }
        throw new ZeroException();
    }
}
