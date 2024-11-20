package Paradygmaty;

public class MainPolimorfizm {
    public static void main(String[] args) {
// wielopostaciowość
        //tworzymy interfejs 'zwierzę' oraz klasy: pies, kon...

//        Zwierze zwierze = new Pies();
//        zwierze.wydajDzwiek();
//
//        // wykonujemy te samą metodę na zwierzęciu, ale mamy inny wynik - przypisany obiekt 'koń'
//        zwierze = new Kon();
//        zwierze.wydajDzwiek();


        Osoba osoba = new Osoba();
        Pies pies = new Pies("Reksio");
        Kon kon = new Kon("Alan");

//        osoba.przygarnijZwierze(kon);
//        osoba.jakNazywaSieTwojeZwierze();

        osoba.przygarnijZwierze(pies);
        osoba.jakNazywaSieTwojeZwierze();

            }
        }


