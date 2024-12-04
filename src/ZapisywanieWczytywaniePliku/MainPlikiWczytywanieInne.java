package ZapisywanieWczytywaniePliku;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class MainPlikiWczytywanieInne {
    public static void main(String[] args) {
// Scanner
        // FileReader - teksty, wyrazy
        // InputStreamReader -  bajty, kodowanie, surowe dane

        try {
            List<String> allLines = Files.readAllLines(Paths.get("C:/Users/IwonaRumiancew/IdeaProjects/KursJava/src/ZapisywanieWczytywaniePliku/moj_plik.txt"));
            System.out.println(allLines);
            // lista stringów zostanie wypisana
        } catch (IOException e) {
            System.out.println("Coś poszło nie tak");
        }
    }
}