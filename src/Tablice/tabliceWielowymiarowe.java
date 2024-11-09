package Tablice;

public class tabliceWielowymiarowe {
    public static void main(String[] args) {
        int[][] tablicaDwuwymiarowa = new int[10][10];
        tablicaDwuwymiarowa[0][1] = 123;
        tablicaDwuwymiarowa[4][8] = 190;

        System.out.println(tablicaDwuwymiarowa[4][8]);

        int[][] nowaTablica = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println("[0][0]: " + nowaTablica[0][0]);
        System.out.println("[0][1]: " + nowaTablica[0][1]);
        System.out.println("[1][2]: " + nowaTablica[1][2]);

        System.out.println("Rozm calej tablicy: " + nowaTablica.length);
        System.out.println("Rozm kolumny 0: " + nowaTablica[0].length);

        System.out.println("Rozm calej tablicy tablicaDwuwymiarowa: " + tablicaDwuwymiarowa.length);
        System.out.println("Rozm kolumny 0: " + tablicaDwuwymiarowa[0].length);
        System.out.println("Rozm kolumny 9: " + tablicaDwuwymiarowa[9].length);

        int[][][] tablicaTrojwymiarowa = new int[5][6][11];

    }
}
