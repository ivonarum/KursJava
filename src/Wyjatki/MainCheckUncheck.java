package Wyjatki;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class MainCheckUncheck {
    public static void main(String[] args) {
        File file = new File("jakasLokalizacja_pliku/plik.txt");
        // ------- CHECK -------------
        //wyjątek typu CHECK - z wymuszonym obslugiwaniem
        //ponizszy wyjatek dziedziczy po IOex... i po Exception
        try {
            InputStream inputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
     //       e.printStackTrace();
            System.out.println("błąd: brak pliku");
        }
// -------------- UNCHECK -------------
      // UNCHECK- wyjątek bez wymuszonego obslugiwania np. NullPointerException
        // powyzszy wyjatek dziedziczy po RuntimeException
    }
}
