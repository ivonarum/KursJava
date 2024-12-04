package ZapisywanieWczytywaniePliku;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class MainPlikiZapisywanie {
    public static void main(String[] args) {
        try {
            String path = "moj_plik.txt";
            FileWriter fileWriter = new FileWriter(path, true); //drugi argument(appden) ustawia czy tekst dopisuje sie a nie nadpisuje
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            //wywołujemy metodę "WRITE"
            bufferedWriter.write("Jakiś ciąg znaków");
            bufferedWriter.newLine();
            bufferedWriter.write("kolejny tekst\n");
            bufferedWriter.write("jeszcze wiecej tekstu");

            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Błąd na operacjach z plikiem");
        }
    }
}