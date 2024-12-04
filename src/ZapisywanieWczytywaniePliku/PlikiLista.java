package ZapisywanieWczytywaniePliku;

import java.util.ArrayList;
import java.util.List;

public class PlikiLista {
    public static void main(String[] args) {
// LISTA - w porównaniu do tabeli: nie trzeba z góry określać rozmiaru/liczby elementów,
        // nie mozemy okreslic, ze lista ma byc typu prostego np. int, tylko należy określić KLASĘ
        // KLASY OSŁONOWE: Intiger, Boolean, Character, Float, Double.

        List<Integer> mojaLista = new ArrayList<>();
        //List-interfejs; ArrayList - konkretna klasa
        // dodawanie elementów listy:
        mojaLista.add(10);
        mojaLista.add(5);
        mojaLista.add(-101);
        mojaLista.add(55000);
        mojaLista.add(1234);

        mojaLista.remove(2);

        for(int i = 0; i < mojaLista.size(); i++) {
            System.out.println(mojaLista.get(i));
        }

        List<String> listaStringow = new ArrayList<>();
        listaStringow.add("jakiś");
        listaStringow.add("tekst");

        List<Boolean> kolejnaLista = new ArrayList();
    }
}