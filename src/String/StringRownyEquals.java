package String;

public class StringRownyEquals {
    public static void main(String[] args) {
        String strLiteral1 = "tekst";
        String strLiteral2 = "tekst";

        // w zapisie:
        // strLiteral1 == strLiteral2
        // sprawdzamy czy miejsca zapisu w pamieci są takie same
        // a nie czy wartosci są takie same
        boolean wynik = strLiteral1 == strLiteral2;
        System.out.println("strLiteral: " + wynik);

        String strObject1 = new String("tekst");
        String strObject2 = new String("tekst");
        boolean wynik2 = strObject1 == strObject2;
        System.out.println("strObject: " + wynik2);

        // equals()
        wynik = strLiteral1.equals(strLiteral2);
        System.out.println("equals: " + strLiteral1.equals(strLiteral2));
        System.out.println("strLiteral1.equals(strObject1): " + wynik);

    }

    }
