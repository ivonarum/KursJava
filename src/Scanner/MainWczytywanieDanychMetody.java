package Scanner;

import java.util.Scanner;

public class MainWczytywanieDanychMetody {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz coś...");
// scanner.hasNext()
//        while (scanner.hasNextInt()) {
//            int wczytany = scanner.nextInt();
//        System.out.println("Wczytany: " + wczytany);
//    }

        //przy wczytywaniu pliku hasNextLine zakonczy dzialanie programu
//        while(scanner.hasNextLine()) {
//            String line = scanner.nextLine();
//            System.out.println("Linia: " + line);
//        }

        String next;
        while(!(next = scanner.next()).equals("X")) {
            System.out.println("Wypisany tekst: " + next);
        }
        System.out.println("Zakonczylem dzialanie");

    }
}