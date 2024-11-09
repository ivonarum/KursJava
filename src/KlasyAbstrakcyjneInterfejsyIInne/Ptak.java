package KlasyAbstrakcyjneInterfejsyIInne;

public class Ptak implements Zwierze{
    @Override
    public void oddychanie() {
        System.out.println("płóca");
    }

    @Override
    public void odzywianie() {
        System.out.println("robaki");
    }

    @Override
    public void rozmnazanie() {
        System.out.println("jajo");
    }
}
