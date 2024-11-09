package Wyjatki;

import java.io.FileNotFoundException;

public class MainPrzenoszenie {
    public static void main(String[] args) {

        WyjatekPrzenoszenie wyjatekPrzenoszenie = new WyjatekPrzenoszenie();
        try {
            wyjatekPrzenoszenie.wyjatkowaMetoda();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
