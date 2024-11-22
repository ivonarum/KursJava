package Podsumowanie.Telewizory;

import Podsumowanie.Telewizory.Philips.P43PUS6523;
import Podsumowanie.Telewizory.Samsung.UE43EU7171;

import java.util.Scanner;

public class MainPodsumowanie {
    public static void main(String[] args) {
        obslugaTelewizora();
    }

    private static void obslugaTelewizora() {
        Scanner scanner = new Scanner(System.in);
        P43PUS6523 tv = new P43PUS6523("unikalneid123");

        int opcja = 0;
        System.out.println("1. Włącz; 2. Wyłącz; 3. Zmień program; 4. Zakończ program;");
        while (opcja != 4) {
            opcja = scanner.nextInt();

            switch(opcja) {
                case 1:
                    tv.wlacz();
                    break;
                case 2:
                    tv.wylacz();
                    break;
                case 3:
                    System.out.println("Podaj nr programu");
                    int numer = scanner.nextInt();
                    tv.przelaczProgram(numer);
                    break;
            }
        }
    }
}