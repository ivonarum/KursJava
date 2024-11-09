package Podstawy;

public class operatoryLogiczne {
    public static void main(String[] args) {
        // ang. logical operators

        int wiek = 20;

        // koniunkcja (AND) oba war spelnione
        System.out.println(wiek >= 18 && wiek < 30);

        // alternatywa (OR) min 1 war spelniony
        System.out.println(wiek < 18 || wiek > 65);
        System.out.println(wiek <= 20 || wiek > 65);

        // negacja
        boolean prawda = true;
        System.out.println("!prawda: " + !prawda);


    }
}
