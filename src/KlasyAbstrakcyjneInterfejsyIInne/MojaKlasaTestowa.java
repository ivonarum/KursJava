package KlasyAbstrakcyjneInterfejsyIInne;

public class MojaKlasaTestowa implements PrzykladowyInterface, DrugiInterface {
    //przy wrzucaniu interfejsu nie piszemy extends tylko IMPLEMENTS i można
    // po przecikach dodawac kolejne interfejsy

    @Override
    public void metodaWInterfejsie() {

    }

    @Override
    public int metodaZParWInterfejsie(int z) {
        return 0;
    }

    @Override
    public String metodaZwracaStringa(String z) {
        return "";
    }
}
