package Klasy.KlasyZadania;

import Klasy.KlasyZadania.Zadanie1.Programista;
import Klasy.KlasyZadania.Zadanie2.KlasaZTablica;
import Klasy.KlasyZadania.Zadanie3.LiczbaUjemnaException;
import Klasy.KlasyZadania.Zadanie3.Matma;

public class Main {
    public static void main(String[] args) {
        System.out.println("ZADANIE 1");
        /* 1. Utwórz klasę o nazwie "Programista", a w niej:
a) pola: imie, nazwisko, jezyk, zarobki
b) metody: pobierzImie(), pobierzNazwisko(), pobierzJezyk(), pobierzWynagrodzenie(), które będą zwracać dane z odpowiednich pól
c) konstruktor, przyjmujący i ustawiający wartości dla wszystkich pól klasy z argumentami: podajImie, podajNazwisko, podajJezyk, podajZarobki
d) pola będą prywatne a metody i konstruktor publiczne
e) przetestuj wszystko w main: utwórz obiekt z uzupełnionymi danymi i wywołaj metody, wypisując dane na ekran
         */
        Programista programista = new Programista("Ewa", "Nowak", "java", 9000);
        System.out.println("Imie: " + programista.pobierzImie());
        System.out.println("Nazwisko: " + programista.pobierzNazwisko());
        System.out.println("Język programowania: " + programista.pobierzJezyk());
        System.out.println("Wynagrodzenie(PLN): " + programista.pobierzWynagrodzenie());

        System.out.println("ZADANIE 2");
        /* 2. Napisz klasę, która w konstruktorze będzie przyjmować tablicę
        oraz będzie posiadać cztery metody:
- zliczającą sumę wszystkich elementów z tablicy
- liczącą średnią
- znajdującą wartość najmniejszą
- znajdującą wartość największą
Każda z metod powinna zwracać wynik jako int.
Utwórz pole przechowujące tablicę. Załóż, że w tablicy będą tylko liczby całkowite.
Pola będą prywatne a metody i konstruktor publiczne.
Klasę, pole i metody nazwij według własnego uznania.
Przetestuj całość w main.
         */
        int[] tablica = {4, 5, 6, 1};
        KlasaZTablica klasaZTablica = new KlasaZTablica(tablica);
        System.out.println("Suma: " + klasaZTablica.suma());
        System.out.println("Średnia: " + klasaZTablica.srednia());
        System.out.println("Min: " + klasaZTablica.min());
        System.out.println("Max: " + klasaZTablica.max());

        System.out.println("ZADANIE 3");
    /* 3. Stwórz własną klasę o nazwie “Matma”. Dodaj w niej metody liczące:
- obwód i pole koła (jako argument do metody przyjmuje promień koła)
- obwód i pole prostokąta (jako argumenty do metody przyjmuje długość boku a i b)
Metody niech będą statyczne i zwracają wynik odpowiedniego typu.
Dodatkowo utwórz w klasie statyczne, stałe pole, które będzie przechowywać wartość PI = 3.14.
Do obliczeń koła wykorzystaj Twoje PI.
Pola i metody będą publiczne.
Jeżeli chcesz, możesz rozszerzyć swoją klasę Matma o metody z zadania 2.
Musisz jednak pamiętać, aby delikatnie je przerobić, żeby mogły być metodami statycznymi.
     */
        System.out.println("Obwód koła(cm): " + Matma.obwodKola(-2));

        System.out.println("Pole koła(cm kw.): " + Matma.poleKola(6));
        System.out.println("Obwód prostokąta(m): " + Matma.obwodProstokata(2, 5));
        System.out.println("Pole prostokąta(m kw.): " + Matma.poleProstokata(9, 2));


    }


}
