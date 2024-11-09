package Dziedziczenie;

public class KlasaRozszerzona extends KlasaPodstawowa {
    //POLA
    int x;
    int y;
    int pole;

    //KONSTRUKTORY
    KlasaRozszerzona() {
        // super(); bez parametrow = bez zmian
        super(101); // sterujemy dzieki temu
        // ktory kontruktor chcemy wywolac z parametrami czy bez
        System.out.println("Konstruktor klasa rozszerzona");
    }

    KlasaRozszerzona(int a) {
        x = a;
        System.out.println("Konstruktor klasa rozszerzona z parametrem: " + a);
    }

    KlasaRozszerzona(int a, int b) {
        //x = a; zamiast powtarzac ten sam kod - THIS
        // this(); - odnosi sie do 1szego kostruktora
        this(a); // pobiera z  konstruktowa gdzie jest zainicj paramentr a
        y = b;
        System.out.println("Konstruktor klasa rozszerzona z parametrami: " + a + " " + b);
    }

    // METODY
    @Override
    public void metodaPierwsza() {
        super.metodaPierwsza();
        System.out.println("Kolejne operacje w klasie rozszerzonej");
    }

    void metodaZTejKlasy() {

    }

    void metodaZParametrami(int pole) {
      //  pole = pole;
        this.pole = pole; //this. ODNOSI się do pola utworzonego w sekcji POLA

       // this(); - uzywamy w konstruktorze
       // this.  - uzywamy w metodzie
    }

    //    void metodaInna() {
//        poleDrugie = 11;
//        metodaPierwsza();
//        System.out.println("Kolejne operacje w klasie rozszerzonej");
//    }
    public void metodaRozszerzona() {
        System.out.println("Wypisano z metody rozszerzonej");
    }

    public void metodaDruga() {
        super.metodaDruga();
    }
//
//    @Override
//    public void metodaPierwsza() {
//        System.out.println("Wypisano z metody pierwszej w klasie rozszerzonej");
//    }


}
