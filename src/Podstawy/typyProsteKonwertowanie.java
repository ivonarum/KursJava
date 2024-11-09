package Podstawy;

public class typyProsteKonwertowanie {
    public static void main(String[] args) {
        int i = 6;
        double d = 2.2;
        System.out.println(i / d);

        double d2 = i; // konwertowanie rozszerzające np. int na long
        // int i2 = d; // tu konwertowanie nie działa-double na int

        float f = 123.22f;
        d2 = (double) f;
        // konwertowanie zawężające/jawne - rzutowanie:
        long zmiennaLong = 123;
        int zmiennaInt = (int) zmiennaLong;

        //konwertowanie niejawne
        zmiennaLong = zmiennaInt;
        // konwe jawne (rzutowanie)
        zmiennaInt = (int) zmiennaLong;

        zmiennaLong = 1234; // jest to int
        zmiennaLong = 123345456678789796L; // jest to long

        byte bajt = 102;
        short shor = 10022;
        int in = 1234234;

        in = bajt;
        in = shor;

        shor = bajt;

        bajt = (byte) in; // utrata informacji, ucięcie
        System.out.println("bajt: " + bajt);

        int intObliczenia = 6;
        double doubleObliczenia = 2.2;

        double wynik = intObliczenia / doubleObliczenia;
        int wynik2 = intObliczenia / (int) doubleObliczenia;
        System.out.println("wynik: " + wynik);
        System.out.println("wynik2: " + wynik2);

        double doublePierwszy = 1.2;
        double doubleDrugi = 12.4;
        double wynikDouble = doubleDrugi / doublePierwszy;
        System.out.println("wynik double: " + wynikDouble);
        int wynikInt = (int) doubleDrugi / (int) doublePierwszy;
        System.out.println("wynik int: " + wynikInt);

        int wynikInt2 = (int) (doubleDrugi / doublePierwszy);
        System.out.println("wynik int2: " + wynikInt2);

        char c = 'x';
        int zaczarowanyInt = c;
        System.out.println("zaczarowany Int: " + zaczarowanyInt);
        // ASCII CODES [aski kod]



    }
}
