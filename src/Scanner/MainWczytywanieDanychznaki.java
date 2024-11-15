package Scanner;

import java.util.Scanner;

public class MainWczytywanieDanychznaki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //rodzielnikiem jest spacja ale jak zmienic na inny znak:
        // "\n" to znak nowej lini 'enter'
        // "\t" to tabulator
        scanner.useDelimiter("\t");

        System.out.println("Podaj cos z klawiatury:");
        while(scanner.hasNext()) {
            String next = scanner.next();
            System.out.println("Wczytałem: " + next);
        }
        System.out.println("Zakonczylem dzialanie");

        scanner.close();
    }
}