package KlasyAbstrakcyjneInterfejsyIInne;

public class KlasaZwykla extends JakasKlasaAbstrakcyjna {
    @Override
    public void metodaAbstrakcyjna() {
        System.out.println("wypisales w z klasy zwyklej");
    }

    @Override
    public int metodaZParametrem(String z) {
        return 0;
    }
}
