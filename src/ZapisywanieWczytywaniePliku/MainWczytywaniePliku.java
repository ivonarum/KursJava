package ZapisywanieWczytywaniePliku;

import java.io.*;

public class MainWczytywaniePliku {
    public static void main(String[] args) throws FileNotFoundException {
//        try {
//            File file = new File("C:/Users/IwonaRumiancew/IdeaProjects/KursJava/src/ZapisywanieWczytywaniePliku/notes.txt");
//            Scanner scanner = new Scanner(file);
//
//            while (scanner.hasNextLine()) {
//                String line = scanner.nextLine();
//                System.out.println(line);
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("Nie znaleziono pliku!");
//        }
        // SCANNER działa wolno
        // poniżej bardziej wydajny sposób:

        try {
            String path = "C:/Users/IwonaRumiancew/IdeaProjects/KursJava/src/ZapisywanieWczytywaniePliku/notes.txt";
     //       File file = new File(path);
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while((line = bufferedReader.readLine()) !=null) {
                System.out.println(line);
            }
            bufferedReader.close();
            
//        } catch (FileNotFoundException e) {  // dziedziczy po IOException
//            System.out.println("Nie znaleziono pliku!");
        } catch (IOException e) {
            System.out.println("Nie znaleziono pliku lub problem z wczytywaniem pliku");
        }
    }
}