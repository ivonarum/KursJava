package KlasyAbstrakcyjneInterfejsyIInne.zadania_abstrakcja_interfejs;

public class Kolo implements Figury {

    private double r;
    public Kolo(double r) {
        this.r = r;
    }

    @Override
    public double obwod() {
        return Math.PI * r * 2;
    }

    @Override
    public double pole() {
        return Math.PI * Math.pow(r,2);
    }
}
