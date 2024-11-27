package Podsumowanie.Telewizory;

import Podsumowanie.Telewizory.Philips.P43PUS6523;
import Podsumowanie.Telewizory.Philips.P55PUS73AMBI;
import Podsumowanie.Telewizory.Samsung.UE43EU7171;

import java.util.Scanner;

public class MainPodsumowanie {
    public static void main(String[] args) {
   //     obslugaTelewizora();
        obslugaPilota();
    }

    private static void obslugaTelewizora() {
        Scanner scanner = new Scanner(System.in);
        Telewizor tv = new P55PUS73AMBI("pHILIPSunikalneid123456");

        int opcja = 0;
        System.out.println("1. Włącz; 2. Wyłącz; 3. Zmień program; 4. Zakończ program;");
        while (opcja != 4) {
            opcja = scanner.nextInt();

            switch (opcja) {
                case 1:
                    tv.wlacz();
                    break;
                case 2:
                    tv.wylacz();
                    break;
                case 3:
                    System.out.println("Podaj nr programu:");
                    int numer = scanner.nextInt();
                    tv.przelaczProgram(numer);
                    break;
            }
        }
        scanner.close();
    }

    private static void obslugaPilota() {
        Pilot pilot = new PilotNoName();
        Telewizor telewizor = new P55PUS73AMBI("unikalid1234");
        pilot.sparujTelewizor(telewizor);

        Scanner scanner = new Scanner(System.in);
        int opcja;
        System.out.println("0. Naciśnij Czerwony; 1. Nacisnij 1; 2. Naciśnij 2; 3. Naciśnij 3; 4. Zakończ");
        do {
            opcja = scanner.nextInt();
            switch (opcja) {
                case 0:
                    pilot.nacisnijCzerwony();
                    break;
                case 1:
                    pilot.nacisnijJeden();
                    break;
                case 2:
                    pilot.nacisnijDwa();
                    break;
                case 3:
                    pilot.nacisnijTrzy();
                    break;
            }
        } while (opcja != 4);
            scanner.close();

    }
}
