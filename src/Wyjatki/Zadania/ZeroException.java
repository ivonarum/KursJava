package Wyjatki.Zadania;

public class ZeroException extends Exception {
    //tworzenie wyjątku typu CHECK
    ZeroException() {
        super("Nie dzielimy przez 0!");
    }
}
