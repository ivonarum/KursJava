package Wyjatki;

import java.util.SortedMap;

public class MainTworzenie {
    public static void main(String[] args) {

Uzytkownik uzytkownik = new Uzytkownik();
        try {
            uzytkownik.wprowadzEmail("jan.kowalski.przyklad.pl");
            uzytkownik.wprowadzHaslo("qwerty123");
 //           uzytkownik.wprowadzHaslo("qwerty123tajne");
            System.out.println("wszytko poszło okej");
        } catch (NiezbytTajneHasloException e) {
            System.out.println("Mało bezpieczne hasło...");
        } catch (NiepoprawnyEmailException e) {
            System.out.println("Niepoprawny adres email");
        }

        System.out.println("Wykonałem to na koniec.");
    }
}
