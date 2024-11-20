package Paradygmaty;

public class Pies extends Ssak{


    public Pies(String nazwa) {
        super(nazwa);
    }

    @Override
    public void wydajDzwiek() {
        System.out.println("Hau Hau");
    }

    @Override
    public void przedstawSie() {
        System.out.println("Jestem pisek i nazywam się " + nazwa);
    }
}
