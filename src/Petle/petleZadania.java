package Petle;

public class petleZadania {
    public static void main(String[] args) {

        for (int i = 0; i <= 30; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 30; i <= 30 && i >= 0; i = i - 1) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i <= 30; i++) {
            int liczba = i % 2;
            if (liczba == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // ZADANIE 3: Podaj dwie dowolne liczby a i b,
        // gdzie a jest mniejsze od b (a < b).
        // Wypisz na ekran zakres liczb od a do b.
        int a = 2;
        int b = 6;
        for (; a <= b; a++) {
            System.out.print(a + " ");
        }
        System.out.println();

        //4. Utwórz tablicę rozmiaru 10 elementów i uzupełnij liczbami.
        // Wypisz wszystkie liczby z tej tablicy na ekran.
        // Następnie wypisz wszystkie liczby od tyłu.

        int[] tab = new int[10];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = i * 3 + 3;
            System.out.print(tab[i] + " ");
        }
        System.out.println();
        //   for (int i = 9; i < tab.length && i >= 0; i = i - 1) {
        //       tab[i] = i * 3 + 3;
        //       System.out.println(tab[i]);
        //  }
        //5. Wykorzystując tablicę z poprzedniego zadania,
        // oblicz sumę wszystkich jej elementów.
        int wynik = 0;
        for (int i = 0; i < tab.length; i++) {
            wynik += tab[i];
        }
        System.out.println("suma wszystkich elementów: " + wynik);

        //6. Napisz program, który będzie obliczał silnię
        // z nieujemnej liczby tj. jeżeli podamy liczbę 5,
        // to zostanie obliczona 5! (wykrzyknik to znak silni).
        // Obliczamy to w następujący sposób:
        //5! = 5 * 4 * 3 * 2 * 1 = 120.
        //Uważaj, bo silnia kolejnych liczb bardzo szybko rośnie
        // i łatwo wyjść poza rozmiar typu int.

//        int n = 11;
//        long wynikSilnia = 1L;
//        for(int i = 1; i <= n; i++) {
//            wynikSilnia *= i;
//            //System.out.println("wynikSilnia: " + wynikSilnia);
//        }
//        System.out.println("wynikSilnia: " + wynikSilnia);

        //7. Napisz program, w którym po podaniu liczby n narysujesz
        // za pomocą * (gwiazdki) trójkąt prostokątny o przyprostokątnych
        // składających się z n-razy * (gwiazdki) ;)
        //np. podając n = 5 powinniśmy otrzymać taki trójkąt:
//        *
//        **
//        ***
//        ****
//        *****
//        int nn = 5;
//        char gw = '*';
//        for(int i = 1; i <= nn; i++) {
//            for(int j = 1; j < i; j++) {
//                System.out.print(gw);
//            }
//            System.out.println(gw);
//        }

//        //zadanie9
        int poziomy = 5;
        for (int i = 1; i <= poziomy; i++) {
            // Rysowanie spacji
            for (int j = 0; j < poziomy - i; j++) {
                System.out.print(" ");
            }
            // Rysowanie gwiazdek
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        //zadanie8
//        int poziomy = 5;
//        for (int i = 1; i <= poziomy; i++) {
//            // Rysowanie spacji
//            for (int j = 0; j < poziomy - i; j++) {
//                System.out.print(" ");
//            }
//            // Rysowanie gwiazdek
//            for (int k = 0; k < i; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        }
    }


