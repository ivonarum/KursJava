package KlasyAbstrakcyjneInterfejsyIInne;

public class MainKlasaAbstrakcyjna {
    public static void main(String[] args) {

        KlasaZwykla klasaZwykla = new KlasaZwykla();
        klasaZwykla.metodaAbstrakcyjna();

        Pies pies = new Pies();
        Kot kot = new Kot();

        System.out.println("Dla psa: ");
        pies.karmieniePotomstwa();
        pies.wydajDzwiek();

        System.out.println();

        System.out.println("Dla kota: ");
        kot.karmieniePotomstwa();
        kot.wydajDzwiek();



    }
    }
