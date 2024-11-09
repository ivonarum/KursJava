package InstrukcjeWrunkowe;

import java.util.SortedMap;

public class instrukcjeZadania {
    public static void main(String[] args) {

        int zmienna = 13;
        int wynik = zmienna % 2;
        if(wynik == 0) {
            System.out.println("Liczba jest parzysta");
        } else {
            System.out.println("Liczba jest nieparzysta");
        }

        double podatek1 = 0.17;
        double podatek2 = 0.32;
        int dochod = 130000;
        int sumaProg1 = 85528 * (int) podatek1;
        int nadwyzka = dochod - 85528;

        /*
        if(dochod < 85528 && dochod > 0) {
            System.out.println("Wysokość podatku: " + (dochod * podatek1));
        } else if(dochod >= 85528) {
            System.out.println("Wysokość podatku: " + (sumaProg1 + podatek2 * nadwyzka));
        } else {
            System.out.println("Podatek wynosi 0");
        }
        */

        if(dochod <= 30000) {
            System.out.println("Podatek wynosi 0");
        } else if(dochod > 30000 && dochod <= 120000) {
            System.out.println("Podatek wynosi: " + podatek1 * dochod);
        } else if(dochod > 120000) {
            System.out.println("Podatek wynosi: " + podatek2 * dochod);
        }


    }

    }
