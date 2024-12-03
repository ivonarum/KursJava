package TypWyliczeniowyEnum;

public class MainTypWyliczeniowyEnum {
    public static void main(String[] args) {
        KierunekSwiata kierunek = KierunekSwiata.WSCHOD;
        System.out.println(kierunek);

        //osadzic enuma w ifie

        if (kierunek == KierunekSwiata.POLNOC) {
            System.out.println("Poszedł na północ");
        } else if (kierunek == KierunekSwiata.POLODNIE) {
            System.out.println("Poszedł na południe");
        } else if (kierunek == KierunekSwiata.WSCHOD) {
            System.out.println("Poszedł na wschód");
        } else if (kierunek == KierunekSwiata.ZACHOD) {
            System.out.println("Poszedł na zachód");
        } else {
            System.out.println("Coś poszło nie tak. Wybrałeś nieodpowiednią drogę!");
        }

        System.out.println("Teraz Switch:");

        switch (kierunek) {
            case POLNOC:
                System.out.println("Poszedł na północ");
                break;
            case POLODNIE:
                System.out.println("Poszedł na południe");
                break;
            case WSCHOD:
                System.out.println("Poszedł na wschód");
                break;
            case ZACHOD:
                System.out.println("Poszedł na zachód");
                break;
            default:
                System.out.println("Coś poszło nie tak. Wybrałeś nieodpowiednią drogę!");
                break;
        }

        // DOMYŚLNE METODY ENUM
        // ordinal(), valueOf(), values()
        KierunekSwiata kierunekSwiata = KierunekSwiata.WSCHOD;
        System.out.println("ordinal(): " + kierunekSwiata.ordinal()); // podaje numer indexu
    }
}