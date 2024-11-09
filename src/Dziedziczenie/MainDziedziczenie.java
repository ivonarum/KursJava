package Dziedziczenie;

public class MainDziedziczenie {
    public static void main(String[] args) {

        KlasaPodstawowa klasaPodstawowa = new KlasaPodstawowa();
        KlasaRozszerzona klasaRozszerzona = new KlasaRozszerzona();
        KlasaBardziejRozszerzona klasaBardziejRozszerzona = new KlasaBardziejRozszerzona();

        klasaPodstawowa.metodaPierwsza();
        klasaRozszerzona.metodaPierwsza();
        klasaRozszerzona.metodaRozszerzona();
        klasaBardziejRozszerzona.metodaPierwsza();
    }
}