package KlasyAbstrakcyjneInterfejsyIInne.zadania_abstrakcja_interfejs;

import KlasyAbstrakcyjneInterfejsyIInne.MainKlasaAnonimowa;

public class MainZadania {
    public static void main(String[] args) {
//        Zadanie 2
//                - stwórz interfejs o nazwie "Figury", który będzie posiadał metody “obwod”, “pole”. Obydwie metody będą zwracały liczbę zmiennoprzecinkową
//        - stwórz dwie klasy “Kolo”, “Prostokat”, które będą implementowały ten interfejs
//                - dodaj konstruktor, w którym w klasie “Kolo” będzie przekazywany promień koła, a w klasie “Prostokat” długości dwóch boków prostokąta a i b
//                - zaimplementuj metody w obydwóch klasach, aby dokonywały poprawnych obliczeń
//                - pola będą prywatne a konstruktor i metody publiczne
//                - przetestuj w main

        Kolo kolo1 = new Kolo(6.0);
        Prostokat prostokat1 = new Prostokat(4.5, 8.5);

        System.out.println("Obwód koła: " + kolo1.obwod());
        System.out.println("Pole koła: " + kolo1.pole());
        System.out.println("Obwód prostokąta: " + prostokat1.obwod());
        System.out.println("Pole prostokąta: " + prostokat1.pole());

        System.out.println();
        System.out.println("Zadanie 3");
        //Zadanie 3
        //Stwórz interfejs wewnętrzny o nazwie "Info" z metodą “wyswietlInfo” w klasie,
        // w której masz metodę main. Przećwiczyć tworzenie klasy anonimowej tworząc ją w
        // metodzie main i przesłoń metodę tak, aby wypisywała tekst “informacja wypisana
        // z klasy anonimowej”. Następnie wywołaj tę metodę “wyswietlInfo”
        // i sprawdź czy prawidłowo została stworzona klasa anonimowa.

        interface Info {
            void wyswietlInfo();
        }

Info obiektInfo = new Info() {
    @Override
    public void wyswietlInfo() {
        System.out.println("informacja wypisana z klasy anonimowej");
    }
};
        obiektInfo.wyswietlInfo();

    }
    }


