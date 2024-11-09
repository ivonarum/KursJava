package Wyjatki.Zadania;
public class MainZadania {

    public static void main(String[] args) {
int a = 2;
int b = 0;
        try {
            int wynik = a/b;
            System.out.println(a + " / " + b + " = " + wynik);

        } catch (ArithmeticException e) {
            System.out.println("Nie wolno dzielić przez 0!");
        }
        Zadanie2 zadanie2 = new Zadanie2();
        try {
            System.out.println(Zadanie2.podziel(5, 0));
        } catch (ZeroException e) {
            System.out.println(e.getMessage());
        }

    }

}

