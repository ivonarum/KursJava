package String;

import java.util.Locale;

public class StringMetody {
    public static void main(String[] args) {
        String tekst = "jakis tekst";
        System.out.println("Lenght: " + tekst.length());

        System.out.println("isEmpty: " + tekst.isEmpty());

        char pojedynczyZnak = tekst.charAt(tekst.length() - 1);
        System.out.println("CharAt: " + pojedynczyZnak);

        System.out.println("substring: " + tekst.substring(7,10) + " " + tekst.substring(6));

        String nowyString = "   sskhf kashdsuk       ";
        System.out.println("." + nowyString + ".");
        System.out.println("trim: " + nowyString.trim() + "."); //usuniecie spacji

        String rozneWielkosciLiter = "Rozne DUZE i male Litery haHAhahaHAHA";
        System.out.println("toLowerCase: " + rozneWielkosciLiter.toLowerCase());
        System.out.println("toUpperCase: " + rozneWielkosciLiter.toUpperCase());

        String czyZawiera = "    CZy zawiera jakiś tekst";
     //   String czyZawieratoLowerCase = czyZawiera.toLowerCase();
     //   String czyZawieraUproszczony = czyZawiera.toLowerCase().trim();
        System.out.println(czyZawiera.toLowerCase().trim().startsWith("czy"));

        String czyZawieraKoncowke = "Jakis tekst z koncowka";
        System.out.println("endWtiht: " + czyZawieraKoncowke.endsWith("koncowka"));

        System.out.println("contains: " + czyZawiera.contains("jakiś"));
        System.out.println("contains: " + czyZawiera.contains("jakis"));
        System.out.println("contains: " + czyZawiera.contains("JAKiś"));

        System.out.println("replace: " + czyZawiera.replace('k', 'm'));
        System.out.println("replace: " + czyZawiera.replace(' ', '.'));



    }

    }
