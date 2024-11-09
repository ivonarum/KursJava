package Dziedziczenie;

public class MainRzutowanieObiektow {
    public static void main(String[] args) {
        KlasaRozszerzona klasaRozszerzona = new KlasaRozszerzona();
        klasaRozszerzona.ustawLiczba(999);
        klasaRozszerzona.wyswietlLiczbe();

        // tworze zmienną "klasaPodstawowa" i ją rzutuję/konwertuję
        // w nawiasie okreslamy na co chcemy przekonwertowac
        // KlasaPodstawowa klasaPodstawowa = (KlasaPodstawowa) klasaRozszerzona;
        KlasaPodstawowa klasaPodstawowa = klasaRozszerzona;
        klasaPodstawowa.wyswietlLiczbe();


    }
    }
