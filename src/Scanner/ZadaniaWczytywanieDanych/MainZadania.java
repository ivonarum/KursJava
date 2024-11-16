package Scanner.ZadaniaWczytywanieDanych;

import java.util.Scanner;

public class MainZadania {
    public static void main(String[] args) {
        System.out.println("Zadanie 1");
//Wykorzystując Scanner wczytaj wpisane z klawiatury imię, nazwisko oraz wzrost. Następnie wypisz na ekran zdanie:
//“Jestem <imię> <nazwisko> i mam <wzrost> cm wzrostu”
        Scanner scanner = new Scanner(System.in);

//      String imie;
//        String nazwisko;
//        int wzrost;
//        System.out.println("Podaj imie:");
//        imie = scanner.nextLine();
//        System.out.println("Podaj nazwisko:");
//        nazwisko = scanner.nextLine();
//        System.out.println("Podaj wzrost w cm:");
//        wzrost = scanner.nextInt();
//        System.out.println("Jestem " + imie + " " + nazwisko + " i mam " + wzrost + " cm wzrostu.");

        System.out.println("Zadanie 2");
        //Wczytuj z klawiatury dane do momentu napotkania małego ‘x’ bądź dużego ‘X’.
        // Wypisuj na ekran teksty, które są oddzielane średnikiem ';'

//        System.out.println("Wprowadź tekst...");
//        scanner.useDelimiter("\n");
//
//        while (true) {
//            String next = scanner.next();
//            if (next.toLowerCase().equals("x")) {
//                break;
//            }
//            System.out.println("Wczytane:" + next);
//        }
//        scanner.close();
//        System.out.println("Zakonczylem swoje dzialanie");

        System.out.println("Zadanie 3");
//        Wczytaj całą linię tekstu z klawiatury. Następnie pobierz liczbę.
//         Wypisz na ekran wczytaną linię tyle razy ile wynosi podana liczba

//String linia = scanner.nextLine();
//int liczba = scanner.nextInt();
//for(int i = 1; i<= liczba; i++) {
//   System.out.println(linia);
//}
        System.out.println("Zadanie 4");
        //Zadanie 4
        //Wczytuj int liczby i licz ich sumę. Zakończ działanie w momencie napotkania liczby ujemnej
int suma =0;
int liczba;
        while((liczba = scanner.nextInt()) >= 0) {

            suma += liczba;
        }
        System.out.println("wczytane: " + suma);

    }
}