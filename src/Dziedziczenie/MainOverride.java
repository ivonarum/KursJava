package Dziedziczenie;

public class MainOverride {
    public static void main(String[] args) {

        KlasaPodstawowa klasaPodstawowa = new KlasaPodstawowa();
        KlasaRozszerzona klasaRozszerzona = new KlasaRozszerzona();

        klasaPodstawowa.metodaPierwsza();
        klasaRozszerzona.metodaDruga();

        klasaRozszerzona.metodaPierwsza();
    }
}