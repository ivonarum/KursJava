package Dziedziczenie;

public class MainThis {
    public static void main(String[] args) {
        KlasaRozszerzona obiekt1 = new KlasaRozszerzona();
        System.out.println("ODDZIELENIE");
        KlasaRozszerzona obiekt2 = new KlasaRozszerzona(111);
        System.out.println("ODDZIELENIE");
        KlasaRozszerzona obiekt3 = new KlasaRozszerzona(13, 45);

        System.out.println(obiekt3.x);
        System.out.println(obiekt3.y);

        obiekt3.metodaZParametrami(346);
        System.out.println("pole: " + obiekt3.pole);
    }
}

