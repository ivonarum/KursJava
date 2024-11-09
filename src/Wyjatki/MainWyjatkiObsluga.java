package Wyjatki;

public class MainWyjatkiObsluga {
    static String str;
    static int[] tablica;
    public static void main(String[] args) {
        // ang. exception

      //  str = "Przypisałam coś";
//        try {
//            System.out.println("Przed wykonaniem");
//            System.out.println("Czy pusty: " + str.isEmpty());
//            System.out.println("Po wykonaniu");
//        } catch(NullPointerException wyjatek) {
//            System.out.println("Nie utworzyłeś stringa");
//        }
//        System.out.println("Wypisałam to");

        tablica = new int[2];
        try {
        tablica[0] = 101;
        tablica[1] = 202;
        tablica[2] = 303;
            System.out.println("wszystko poszlo ok");
        } catch(NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Błąd z tablicą");
        }
//        catch(NullPointerException e) {
//            System.out.println("Hej hej, utwórz tablicę co najmniej 2 elementów");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Przekroczyłeś zakres tablicy");
//        }

        System.out.println("Na koniec programu wypisz to");
    }
}
