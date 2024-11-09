package Podstawy;

public class typyProste {
    public static void main(String[] args) {
        // ang. primitive types

        // 1 bajt = 8 bitów

        // liczby calkowite
        byte zmiennaByte = 10;
        System.out.println("Byte: " + zmiennaByte);
        System.out.println(Byte.MIN_VALUE + " " + Byte.MAX_VALUE);

        short zmiennaShort = 200;

        int zmiennaInt = 100000;

        long zmiennaLong = 100000000000L;

        // liczby zmiennoprzecinkowe
        float zmiennaFloat = 12.34657589344348587f;
        System.out.println("Float: " + zmiennaFloat);
        double zmiennaDouble = 12.349054535366589456657;
        System.out.println("Double: " + zmiennaDouble);

        // pojedyncze znaki
        char zmiennaChar = 'A';
        System.out.println("Char: " + zmiennaChar);

        // wartości logiczne
        boolean zmiennaBoolean = true;

        // kilka zmiennych na raz; te zapis jest nieczytelny
        int d = 4, e, f, nazwaZmiennejDwa = 5;
        // dlatego piszemy w oddzielnych ln
        int a;
        int b = 5;
        int c;

       // int a; // zmienna juz zostala zdefiniowana
        a = 3;
        nazwaZmiennejDwa = 6;
    }
}
