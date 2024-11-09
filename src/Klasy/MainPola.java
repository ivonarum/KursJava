package Klasy;

public class MainPola {
    public static void main(String[] args) {
        // ang. fields

        KlasaZPolami obiekt = new KlasaZPolami();
        obiekt.liczbaCalkowita = 15;
        System.out.println(obiekt.liczbaCalkowita);

        obiekt.zwrocWartoscPola();

        obiekt.ustawWartoscPola(101);
        obiekt.zwrocWartoscPola();

        obiekt.ustawWartoscPola(202);
        int zmienna = obiekt.zwrocWartoscPolazMetody();
        System.out.println("zmienna: " + zmienna);
    }
}
