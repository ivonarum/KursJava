package Paradygmaty;

public class Kon extends Ssak{

    public Kon(String nazwa) {
        super(nazwa);
    }

    @Override
    public void wydajDzwiek() {
        System.out.println("Ihaa Haaa");
    }

    @Override
    public void przedstawSie() {
        System.out.println("Jestem koniem, lubię biegać i nazywam się " + nazwa);
    }
}
