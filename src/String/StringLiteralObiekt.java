package String;

public class StringLiteralObiekt {
    public static void main(String[] args) {
        String str = "jakiś string"; //ten string jest LITERAŁEM
      //  int i = 100; to literał int
       // long l = 12249853485545L; to literał long
        // literał tworzy się bez konstruktora/slowa new
        String str2 = "jakiś string";
        String str3 = "jakiś string";
        // flyweight - pyłek (taki wzorzec projektowy)
        // powyzsze trzy stringi znajduja sie w tym samym miejscu w pamięci

        String poprzeKonstruktor = new String("przez konstruktor");
        String poprzeKonstruktor2 = new String("przez konstruktor");
        // powyzsze dwa stringi, to obiekty, każdy w nowym miejscu w pamięci

    }
}
