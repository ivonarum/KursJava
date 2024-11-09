package KlasyAbstrakcyjneInterfejsyIInne;

public class Ssak implements Zwierze{
    @Override
    public void oddychanie() {
        System.out.println("płóca");
    }

    @Override
    public void odzywianie() {
        System.out.println("Rośliny lub mięso");
    }

    @Override
    public void rozmnazanie() {
        System.out.println("płód");
    }
}
