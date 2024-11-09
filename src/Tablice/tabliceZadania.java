package Tablice;

public class tabliceZadania {
    public static void main(String[] args) {
        int[] tabInt = new int[] {5, 10, 15, 20, 25};
        int wynikTablicaInt = tabInt[0] + tabInt[1] + tabInt[2] + tabInt[3] + tabInt[4];
        System.out.println("wynikTablicaInt: " + wynikTablicaInt);

        double[][] tabD = new double[][] {
                {1, 2, 3, 4, 5},
                {5, 10, 15, 20, 25},
                {100, 105, 110, 115, 120}
        };
        double wynikDouble = tabD[0][0] + tabD[0][4];
        System.out.println("wynikDouble: " + wynikDouble);

    }

    }
