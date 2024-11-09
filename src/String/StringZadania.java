package String;

public class StringZadania {
    public static void main(String[] args) {
        /*
1. Utwórz trzy zmienne typu String. Do pierwszej przypisz swoje imię,
do drugiej nazwisko oraz do trzeciej imię i nazwisko oddzielone spacją.
Następnie wykonaj polecenia używając odpowiednich metod z String (nie robić nic ręcznie! :) )
i wypisując informacje na ekran:
a) wypisz ile znaków zawiera zmienna przechowująca imię, ile nazwisko a ile imię i nazwisko
b) sprawdź czy Twoje imię jest równe "Alicja" lub "Jan"
c) wypisz nazwisko z WIELKICH LITER
d) zamień w nazwisku litery 'a' na 'e' i zobacz czy coś się zmieniło
         */

        String imie = "Iwona";
        String nazwisko = "Rumiancew";
        String imieNazwisko = "Iwona Rumiancew";
        System.out.println("ile znaków imie: " + imie.length());
        System.out.println("ile znaków nazwisko: " + nazwisko.length());
        System.out.println("ile znaków imie i Nazwisko: " + imieNazwisko.length());

        System.out.println("czy imie jest Alicja: " + imie.equals("Alicja"));

        System.out.println("wielkimi literami: " + nazwisko.toUpperCase());

        System.out.println("zamiana a na e: " + nazwisko.replace('a','e'));
/*
2. Dla zdania "Potrafię coraz więcej z programowania." wypisz każdy znak w osobnej linii
 */
        String zdanie = "Potrafię coraz więcej z programowania.";

        for(int i = 0; i < zdanie.length(); i++) {
            System.out.println(zdanie.charAt(i));
        }
/*
3. Tym razem powyższe zdanie „Potrafię coraz więcej z programowania.”
napisz od tyłu „.ainawomargorp z jecęiw zaroc ęifartoP”
 */
        for(int j = 1; j <= zdanie.length(); j++) {
            int w = zdanie.length()- j;
            System.out.print(zdanie.charAt(w));

        }
    }
    }
