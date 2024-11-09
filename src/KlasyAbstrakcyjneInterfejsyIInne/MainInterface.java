package KlasyAbstrakcyjneInterfejsyIInne;

public class MainInterface {
    public static void main(String[] args) {

        Ryba ryba = new Ryba();
        Ptak ptak = new Ptak();
        Ssak ssak = new Ssak();

        System.out.println("Ryba");
ryba.oddychanie();
ryba.odzywianie();
ryba.rozmnazanie();
        System.out.println();

        System.out.println("Ptak");
        ptak.oddychanie();
        ptak.odzywianie();
        ptak.rozmnazanie();
        System.out.println();
    }
}
