package Klasy.KlasyZadania.Zadanie2;

public class KlasaZTablica {
    private int[] tablica;

    public KlasaZTablica(int[] podajTablice) {
        tablica = podajTablice;
    }

    public int suma() {
        int suma = 0;
        for(int i = 0; i < tablica.length; i++) {
                suma += tablica[i];
        }
        return suma;
    }

    public int srednia() {
       // int srednia = suma() / tablica.length;
        return suma() / tablica.length;
    }
    public int min() {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < tablica.length; i++) {
            if (tablica[i] < min) {
                min = tablica[i];
            }
        }
        return min;
    }
    public int max() {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < tablica.length; i++) {
            if(tablica[i] > max) {
                max = tablica[i];
            }
        }
        return max;
    }

}
