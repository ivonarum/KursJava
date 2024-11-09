package Podstawy;

public class zadaniaZmienneiOperatory {

    public static void main(String[] args) {
        short wiek = 37;
        double wzrost = 1.74;
        double waga = 65.5;
        System.out.println("wiek: " + wiek);
        System.out.println("wzrost: " + wzrost);
        System.out.println("waga: " + waga);

        double bmi = waga / (wzrost * wzrost);
        System.out.println("BMI: " + bmi);
        int bmiCalkowite = (int) bmi;
        System.out.println("BMI zaokrąglone: " + bmiCalkowite);

        int liczbaA = 9;
        double wynikX = liczbaA / 2;
        double wynikY = liczbaA / 3;
        double wynikZ = liczbaA / 11;
        System.out.println("wyniki: X: " + wynikX + " Y: " + wynikY + " Z:" + wynikZ);
        double wynikXx = liczbaA % 2;
        double wynikYy = liczbaA % 3;
        double wynikZz = liczbaA % 11;
        System.out.println("wyniki reszty z dzielenia: X: " + wynikXx
                + " Y: " + wynikYy + " Z:" + wynikZz);

        int x = 5;
        boolean wynikPierwszy = x < 10 || x != 0 || x > -1;
        boolean wynikDrugi = x < 10 && x != 0 && x > -1;
        System.out.println(wynikPierwszy);
        System.out.println(wynikDrugi);

        int zmiennaD = 11000000;
        int zmiennaE = zmiennaD * zmiennaD;
        System.out.println("poza int: " + zmiennaE);
    }
}
