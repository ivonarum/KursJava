package Klasy.KlasyZadania.Zadanie3;

public class LiczbaUjemnaException extends RuntimeException {
    LiczbaUjemnaException(){
        super("Liczba nie może być ujemna!");
    }
}
