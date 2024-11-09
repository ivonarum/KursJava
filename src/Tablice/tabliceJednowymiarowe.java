package Tablice;

public class tabliceJednowymiarowe {
    public static void main(String[] args) {
        // ang. arrays

        int[] tablica;
        tablica = new int[10];
        // tablica[index]
        tablica[0] = 5;
        tablica[1] = 10;
        tablica[2] = 15;
        tablica[3] = 155;

        System.out.println(tablica[5]);


        double[] tablicaDouble = new double[5];
        tablicaDouble[0] = 12.5;
        tablicaDouble[1] = 55.5;
        tablicaDouble[2] = 111.11;
        tablicaDouble[3] = 222.22;
        System.out.println(tablicaDouble[3]);

        System.out.println(tablicaDouble[4]);

        char[] tablicaCharow = new char[100];
        System.out.println(tablicaCharow[0]);

        int[] nowaTablicaIntow = {15, 50, 99, 101, 55}; // inaczej:  new int[] {15, 50, 99, 101, 55};
        System.out.println("nowaTablicaIntow: " + nowaTablicaIntow[0]);

        System.out.println("tablica rozmiar: " + nowaTablicaIntow.length);
        System.out.println("t double rozm: " + tablicaDouble.length);
        System.out.println("tablCharow rozm: " + tablicaCharow.length);
    }
}
