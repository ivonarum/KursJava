package Podstawy;

public class operatoryRelacyjne {
    public static void main(String[] args) {
        // ang. relational operators

        int zmiennaA = 5; //przypisanie wartosci

        System.out.println(3 == 8); //sprawdz czy dwie wartosci sa rowne

        boolean wynik;

        wynik = 8 == 8;
        System.out.println("8 == 8: " + wynik);

        wynik = 3 == 8;
        System.out.println("3 == 8: " + wynik);

        wynik = 3 != 8;
        System.out.println("3 != 8: " + wynik);

        wynik = 3 < 8;
        System.out.println("3 < 8: " + wynik);

        wynik = 3 <= 8;
        System.out.println("3 <= 8: " + wynik);

        wynik = 3 > 8;
        System.out.println("3 > 8: " + wynik);
    }
}
