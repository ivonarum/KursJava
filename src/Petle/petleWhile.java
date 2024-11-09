package Petle;

public class petleWhile {
    public static void main(String[] args) {

        int liczenie = 15;
        while (liczenie <= 10) {
            System.out.println("Tekst " + liczenie);
            liczenie++;
        }

        // DO WHILE gwarancja ze min 1 raz wykona sie kod
        liczenie = 15;
        do {
            System.out.println("Tekst z do while: " + liczenie);
            liczenie++;
        } while(liczenie <= 10);
    }
    }
