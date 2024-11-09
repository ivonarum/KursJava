package Wyjatki;

public class Uzytkownik {

    public void wprowadzHaslo(String haslo) throws NiezbytTajneHasloException {
        if (!haslo.contains("tajne")) {
            throw new NiezbytTajneHasloException();
        }
    }
    // zrob odpowiednie rzeczy z haslem....

    public void wprowadzEmail(String email) throws NiepoprawnyEmailException {
            if(!email.contains("@")) {
                throw new NiepoprawnyEmailException();
            }
        }

}
