package InstrukcjeWrunkowe;

public class Kalkulator {
    public static void main(String[] args) {

        double liczba1 = 2;
        double liczba2 = 9;
        char dzialanie = ',';
        double wynik = 0;

        switch(dzialanie) {
            case '+':
                wynik = liczba1 + liczba2;
                break;
            case '-':
                wynik = liczba1 - liczba2;
                break;
            case '*':
                wynik = liczba1 * liczba2;
                break;
            case '/':
                wynik = liczba1 / liczba2;
                break;
            default:
                System.out.println("Niepoprawne dzialanie");
        }
        System.out.println(liczba1 + " " + dzialanie + " " + liczba2 + " = " + wynik);

    }
}
