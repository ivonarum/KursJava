package KlasyAbstrakcyjneInterfejsyIInne;

public class MainKlasaAnonimowa {
    public static void main(String[] args) {
// ang. anonymus class - najczesniej uzywana np. w metodach jako argument
        ZwyklaKlasa obiektKlasyAnonimowej = new ZwyklaKlasa() {
            @Override
            public void metodaZwykla() {
                System.out.println("Metoda wywołana z klasy anonimowej");
            }
        };
        obiektKlasyAnonimowej.metodaZwykla();

        ZwyklaKlasa zwyklaKlasa = new ZwyklaKlasa();
        metodaTutaj(new ZwyklaKlasa() {
            @Override
            public void metodaZwykla() {
                System.out.println("Specjalnie dla Was zmienione zachowanie");
            }
        });
    }

    public static void metodaTutaj(ZwyklaKlasa parametr) {
        parametr.metodaZwykla();
    }


}