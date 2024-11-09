package Klasy;

public class MainKonstruktor {
    public static void main(String[] args) {
        KlasaKonstruktor klasaKonstruktor = new KlasaKonstruktor(105);
//        klasaKonstruktor.pierwszePole = 5;
//        klasaKonstruktor.drugiePole = 105;

        System.out.println("pierwszePole: " + klasaKonstruktor.pierwszePole);
        System.out.println("drugiePole: " + klasaKonstruktor.drugiePole);

        KlasaDwa klasaDwa = new KlasaDwa();

        KlasaKonstruktor klasaKon = new KlasaKonstruktor();
        System.out.println(klasaKon.pierwszePole);
        System.out.println(klasaKon.drugiePole);
    }
    }
