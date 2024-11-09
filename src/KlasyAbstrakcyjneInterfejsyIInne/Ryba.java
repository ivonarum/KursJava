package KlasyAbstrakcyjneInterfejsyIInne;

public class Ryba implements Zwierze{
    @Override
    public void oddychanie() {
        System.out.println("skrzela");
    }

    @Override
    public void odzywianie() {
        System.out.println("robaki");
    }

    @Override
    public void rozmnazanie() {
        System.out.println("ikra");
    }
}
